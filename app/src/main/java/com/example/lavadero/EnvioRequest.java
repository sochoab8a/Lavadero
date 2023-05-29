package com.example.lavadero;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class EnvioRequest extends StringRequest {
    private static final String URL = "https://api.twilio.com/2010-04-01/Accounts/AC002fc2a9731efe1d7a0cdcf9b9147c26/Messages";
    private Map<String, String> parametros;

    public EnvioRequest( String consolidado, String numero, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parametros = new HashMap<>();
        parametros.put("To", "whatsapp:" + numero);
        parametros.put("From", "whatsapp:+14155238886");
        parametros.put("Body", "Su vehiculo ya esta listo" );

    }

    @Override
    protected Map<String, String> getParams() {
        return parametros;
    }

    @Override
    public Map<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
            headers.put("Authorization", "Basic " + "QUMwMDJmYzJhOTczMWVmZTFkN2EwY2RjZjliOTE0N2MyNjo3YWY0NmVlMDkzZTU3MjY2M2Y3NjcxZGVjNmRhMGZjZQ==");
        return headers;

    }

}

