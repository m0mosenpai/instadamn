package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.direct.smartsuggestion.model.SmartSuggestionCTA;
import java.io.IOException;

/* renamed from: X.3ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82363ly {
    public static SmartSuggestionCTA parseFromJson(C16L c16l) {
        Integer num;
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            SmartSuggestionCTA smartSuggestionCTA = new SmartSuggestionCTA();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str2 = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    C14360o3.A0B(str2, 0);
                    Integer[] A00 = C05F.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "send";
                                    break;
                                case 2:
                                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                                    break;
                                default:
                                    str = "unknown";
                                    break;
                            }
                            if (!str.equals(str2)) {
                                i++;
                            }
                        } else {
                            num = C05F.A00;
                        }
                    }
                    smartSuggestionCTA.A00 = num;
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    smartSuggestionCTA.A01 = str2;
                }
                c16l.A0z();
            }
            return smartSuggestionCTA;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, SmartSuggestionCTA smartSuggestionCTA) {
        String str;
        anonymousClass182.A0d();
        Integer num = smartSuggestionCTA.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "send";
                    break;
                case 2:
                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str = "unknown";
                    break;
            }
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        }
        String str2 = smartSuggestionCTA.A01;
        if (str2 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str2);
        }
        anonymousClass182.A0a();
    }
}
