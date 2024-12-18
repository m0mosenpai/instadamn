package com.facebook.graphql.query;

import X.AnonymousClass001;
import X.InterfaceC40501uJ;
import android.content.Context;
import android.util.Log;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JSONPersistedQueryProvider implements InterfaceC40501uJ {
    public final JSONObject A00;

    @Override // X.InterfaceC40501uJ
    public final String persistIdForQuery(String str) {
        return null;
    }

    @Override // X.InterfaceC40501uJ
    public final String clientDocIdForQuery(String str) {
        String str2 = null;
        try {
            JSONObject jSONObject = this.A00.getJSONObject(str);
            if (jSONObject != null) {
                str2 = jSONObject.getString("client_doc_id");
                return str2;
            }
        } catch (JSONException e) {
            Log.w("com.facebook.graphql.query.JSONPersistedQueryProvider", e);
        }
        return str2;
    }

    public JSONPersistedQueryProvider(Context context, String str) {
        JSONObject jSONObject;
        try {
            InputStream open = context.getAssets().open(AnonymousClass001.A0R(str, "_client_persist_ids.json"));
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            jSONObject = new JSONObject(new String(bArr, ReactWebViewManager.HTML_ENCODING));
        } catch (IOException e) {
            Log.w("com.facebook.graphql.query.JSONPersistedQueryProvider", e);
            jSONObject = new JSONObject();
        }
        this.A00 = jSONObject;
    }

    @Override // X.InterfaceC40501uJ
    public final String schemaForQuery(String str) {
        String str2 = null;
        try {
            JSONObject jSONObject = this.A00.getJSONObject(str);
            if (jSONObject != null) {
                str2 = jSONObject.getString("schema");
                return str2;
            }
        } catch (JSONException e) {
            Log.w("com.facebook.graphql.query.JSONPersistedQueryProvider", e);
        }
        return str2;
    }
}
