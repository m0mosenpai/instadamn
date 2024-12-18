package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8yQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203088yQ implements InterfaceC203078yP {
    @Override // X.InterfaceC203078yP
    public final ACJ F8N(Cursor cursor, EnumC200938ua enumC200938ua) {
        C14360o3.A0B(enumC200938ua, 1);
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("profile");
            return new ACJ(jSONObject2.getString("uid"), jSONObject.getString("access_token"), "FACEBOOK", new B4q(jSONObject2), EnumC200808uN.A05, enumC200938ua);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.InterfaceC203078yP
    public final C203128yU F8J(Cursor cursor) {
        String str;
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("profile");
            String string2 = jSONObject2.getString("uid");
            String string3 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (jSONObject2.has("profile_pic_url")) {
                str = jSONObject2.getString("profile_pic_url");
            } else {
                str = "";
            }
            return new C203128yU(jSONObject.getString("access_token"), new C203118yT(string2, string3, str));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.InterfaceC203078yP
    public final ACJ F8L(Cursor cursor, EnumC200808uN enumC200808uN, EnumC200938ua enumC200938ua) {
        throw new RuntimeException("LiteProvider not used in Facebook Lite.");
    }

    @Override // X.InterfaceC203078yP
    public final C203128yU F8M(Cursor cursor) {
        throw new RuntimeException("LiteProvider not used in Facebook Lite.");
    }

    @Override // X.InterfaceC203078yP
    public final FXDeviceItem F8O(Cursor cursor, EnumC46133KbX enumC46133KbX, EnumC200798uM enumC200798uM) {
        Long l;
        String string = cursor.getString(cursor.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        String string2 = cursor.getString(cursor.getColumnIndex("timestamp"));
        if (string2 != null) {
            l = Long.valueOf(Long.parseLong(string2));
        } else {
            l = null;
        }
        return new FXDeviceItem(l, string, EnumC200808uN.A05, EnumC46133KbX.DEVICE_ID);
    }
}
