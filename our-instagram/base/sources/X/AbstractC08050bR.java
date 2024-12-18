package X;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.webkit.URLUtil;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0bR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08050bR {
    /* JADX WARN: Type inference failed for: r0v28, types: [X.0Ml, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.0Ml, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0bQ, java.lang.Object] */
    public static C08040bQ A00(Intent intent) {
        Object obj;
        android.net.Uri uri;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        jSONObject.put("action", intent.getAction());
        jSONObject.put("package", intent.getPackage());
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, intent.getType());
        android.net.Uri data = intent.getData();
        if (data != null) {
            arrayList.add(data);
            jSONObject.put("data", new Object().A03(data, null).A01());
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < clipData.getItemCount(); i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (itemAt != null && (uri = itemAt.getUri()) != null) {
                    arrayList.add(uri);
                    jSONArray.put(new Object().A03(uri, null).A01());
                }
            }
            jSONObject.put("clip_data", jSONArray);
        }
        java.util.Set<String> categories = intent.getCategories();
        if (categories != null && !categories.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it = categories.iterator();
            while (it.hasNext()) {
                jSONArray2.put(it.next());
            }
            jSONObject.put("categories", jSONArray2);
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            jSONObject.put("component_name", component.toString());
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            jSONObject.put("source_bounds", sourceBounds.toString());
        }
        Bundle extras = intent.getExtras();
        if (extras != null && extras.size() > 0) {
            JSONArray jSONArray3 = new JSONArray();
            for (String str : extras.keySet()) {
                JSONObject jSONObject2 = new JSONObject();
                Object obj2 = null;
                try {
                    obj2 = extras.get(str);
                } catch (BadParcelableException unused) {
                }
                String str2 = "";
                if (obj2 != null) {
                    str2 = obj2.getClass().getCanonicalName();
                }
                jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                jSONObject2.put("value_type", str2);
                if (obj2 != null) {
                    URLUtil.isValidUrl(obj2.toString());
                }
                jSONArray3.put(jSONObject2);
            }
            jSONObject.put("extra_names", jSONArray3);
        }
        Intent selector = intent.getSelector();
        if (selector != null && (obj = A00(selector).A01) != null) {
            jSONObject.put("selector", obj);
        }
        if (intent.getFlags() > 0) {
            jSONObject.put("flags", intent.getFlags());
        }
        ?? obj3 = new Object();
        obj3.A01 = jSONObject;
        obj3.A00 = arrayList;
        return obj3;
    }
}
