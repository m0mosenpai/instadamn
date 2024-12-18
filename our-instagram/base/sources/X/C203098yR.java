package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8yR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203098yR implements InterfaceC203078yP {
    /* JADX WARN: Type inference failed for: r3v2, types: [X.8yU, java.lang.Object] */
    @Override // X.InterfaceC203078yP
    public final C203128yU F8M(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            String optString = jSONObject.optString("userId");
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
        int columnIndex = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex2 = cursor.getColumnIndex("COL_USER_ID");
        int columnIndex3 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex4 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex5 = cursor.getColumnIndex("COL_SESSION_ID");
        int columnIndex6 = cursor.getColumnIndex("COL_UPSELL_HOLDOUT_STATUS");
        if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1 && columnIndex5 != -1) {
            String string = cursor.getString(columnIndex2);
            String string2 = cursor.getString(columnIndex5);
            if (string != null && string2 != null) {
                return new ACJ(string, string2, "INSTAGRAM", new C25019B4v(cursor, columnIndex3, columnIndex4, columnIndex6), EnumC200808uN.A06, enumC200938ua);
            }
            throw null;
        }
        throw new RuntimeException("Column not found.");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.8yU, java.lang.Object] */
    @Override // X.InterfaceC203078yP
    public final C203128yU F8J(Cursor cursor) {
        String string;
        String str;
        int columnIndex = cursor.getColumnIndex("COL_USER_ID");
        int columnIndex2 = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex3 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex4 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex5 = cursor.getColumnIndex("COL_SESSION_ID");
        int columnIndex6 = cursor.getColumnIndex("COL_UPSELL_HOLDOUT_STATUS");
        int columnIndex7 = cursor.getColumnIndex("COL_SSO_SETTINGS_CACHE");
        if (columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1 && columnIndex5 != -1) {
            if (columnIndex != -1) {
                string = cursor.getString(columnIndex);
            } else {
                string = cursor.getString(columnIndex2);
            }
            cursor.getString(columnIndex2);
            String string2 = cursor.getString(columnIndex5);
            if (string != null && string2 != null) {
                if (columnIndex7 != -1) {
                    str = cursor.getString(columnIndex7);
                } else {
                    str = "";
                }
                C203138yV A00 = A3D.A00(str);
                C203118yT c203118yT = new C203118yT(string, cursor.getString(columnIndex3), cursor.getString(columnIndex4));
                if (columnIndex6 != -1) {
                    cursor.getString(columnIndex6);
                }
                ?? obj = new Object();
                obj.A01 = c203118yT;
                obj.A00 = string2;
                obj.A02 = A00;
                return obj;
            }
            throw null;
        }
        throw new RuntimeException("Column not found.");
    }

    @Override // X.InterfaceC203078yP
    public final ACJ F8L(Cursor cursor, EnumC200808uN enumC200808uN, EnumC200938ua enumC200938ua) {
        String string;
        C14360o3.A0B(enumC200808uN, 1);
        C14360o3.A0B(enumC200938ua, 2);
        try {
            String string2 = cursor.getString(1);
            if (string2 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string2);
            String str = "";
            if (!jSONObject.has("userId")) {
                string = "";
            } else {
                string = jSONObject.getString("userId");
            }
            if (jSONObject.has("accessToken")) {
                str = jSONObject.getString("accessToken");
            }
            return new ACJ(string, str, enumC200808uN.name(), new C25018B4u(jSONObject), enumC200808uN, enumC200938ua);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.InterfaceC203078yP
    public final FXDeviceItem F8O(Cursor cursor, EnumC46133KbX enumC46133KbX, EnumC200798uM enumC200798uM) {
        int columnIndex = cursor.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (columnIndex != -1) {
            return new FXDeviceItem(null, cursor.getString(columnIndex), EnumC200808uN.A06, enumC46133KbX);
        }
        throw new RuntimeException("Column not found.");
    }
}
