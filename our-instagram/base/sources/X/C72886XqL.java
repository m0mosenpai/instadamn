package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.SettingId;
import java.io.IOException;

/* renamed from: X.XqL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72886XqL {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.XZE, X.1um, X.1ul] */
    public static XZE parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("error_name_value".equals(A0q)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("fallback_message".equals(A0q)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(924).equals(A0q)) {
                    c40791um.A06 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    SettingId settingId = (SettingId) SettingId.A01.get(AbstractC167017dG.A0m(c16l));
                    if (settingId == null) {
                        settingId = SettingId.A0D;
                    }
                    c40791um.A02 = settingId;
                } else if ("setting_id".equals(A0q)) {
                    RemoteBooleanSettingId remoteBooleanSettingId = (RemoteBooleanSettingId) RemoteBooleanSettingId.A01.get(AbstractC167017dG.A0m(c16l));
                    if (remoteBooleanSettingId == null) {
                        remoteBooleanSettingId = RemoteBooleanSettingId.A0X;
                    }
                    c40791um.A01 = remoteBooleanSettingId;
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0q)) {
                    c40791um.A03 = Boolean.valueOf(c16l.A0d());
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            String str = c40791um.A04;
            String str2 = c40791um.A05;
            String str3 = c40791um.A06;
            SettingId settingId2 = c40791um.A02;
            RemoteBooleanSettingId remoteBooleanSettingId2 = c40791um.A01;
            Boolean bool = c40791um.A03;
            C14360o3.A0A(bool);
            c40791um.A00 = new C51615Mr8(remoteBooleanSettingId2, settingId2, str, str2, str3, bool.booleanValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
