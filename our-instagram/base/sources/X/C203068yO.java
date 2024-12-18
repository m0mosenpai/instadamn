package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8yO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203068yO implements InterfaceC203078yP {
    @Override // X.InterfaceC203078yP
    public final C203128yU F8J(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("profile");
            return new C203128yU(jSONObject.getString("access_token"), new C203118yT(jSONObject2.getString("uid"), jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject2.getString("pic_square")));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.8yU, java.lang.Object] */
    @Override // X.InterfaceC203078yP
    public final C203128yU F8M(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            String optString = jSONObject.optString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            String optString2 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String optString3 = jSONObject.optString("profilePicUrl");
            String optString4 = jSONObject.optString("accessToken");
            String optString5 = jSONObject.optString("sso_settings_v2");
            C203118yT c203118yT = new C203118yT(optString, optString2, optString3);
            C203138yV A00 = A3D.A00(optString5);
            ?? obj = new Object();
            obj.A01 = c203118yT;
            obj.A00 = optString4;
            obj.A02 = A00;
            return obj;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

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
            return new ACJ(jSONObject2.getString("uid"), jSONObject.getString("access_token"), "FACEBOOK", new C25016B4s(jSONObject2), EnumC200808uN.A03, enumC200938ua);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
    @Override // X.InterfaceC203078yP
    public final ACJ F8L(Cursor cursor, EnumC200808uN enumC200808uN, EnumC200938ua enumC200938ua) {
        String str;
        String str2 = "";
        C14360o3.A0B(enumC200808uN, 1);
        C14360o3.A0B(enumC200938ua, 2);
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            ?? obj = new Object();
            obj.A00 = "";
            ?? obj2 = new Object();
            obj2.A00 = "";
            if (!jSONObject.has("userId")) {
                str = "";
            } else {
                str = jSONObject.getString("userId");
            }
            if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                obj.A00 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            }
            if (jSONObject.has("profilePicUrl")) {
                obj2.A00 = jSONObject.getString("profilePicUrl");
            }
            if (jSONObject.has("accessToken")) {
                str2 = jSONObject.getString("accessToken");
            }
            return new ACJ(str, str2, enumC200808uN.name(), new B4r(obj, obj2), enumC200808uN, enumC200938ua);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.InterfaceC203078yP
    public final FXDeviceItem F8O(Cursor cursor, EnumC46133KbX enumC46133KbX, EnumC200798uM enumC200798uM) {
        String string;
        EnumC200808uN enumC200808uN;
        String string2;
        int columnIndex = cursor.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        Long l = null;
        if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null || string.equals("")) {
            return null;
        }
        int columnIndex2 = cursor.getColumnIndex("timestamp");
        if (columnIndex2 != -1 && (string2 = cursor.getString(columnIndex2)) != null) {
            l = Long.valueOf(Long.parseLong(string2));
        }
        if (enumC200798uM == EnumC200798uM.MESSENGER) {
            enumC200808uN = EnumC200808uN.A08;
        } else {
            enumC200808uN = EnumC200808uN.A03;
        }
        return new FXDeviceItem(l, string, enumC200808uN, enumC46133KbX);
    }
}
