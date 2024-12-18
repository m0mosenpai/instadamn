package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.6tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC152536tg {
    public static final void A00(UserSession userSession, String str, String str2, int i) {
        String str3;
        C14360o3.A0B(userSession, 0);
        if (AbstractC002300n.A0g(str, str2, false) || str == null || AbstractC003100w.A0k(10, str) == null) {
            str = null;
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("fbsearch/register_recent_search_click/");
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 13) {
                            if (i != 7) {
                                if (i != 8) {
                                    str3 = null;
                                    C0w9.A03("RegisterRecentStoreApi", AnonymousClass001.A0O("Unexpected type: ", i));
                                } else {
                                    str3 = "echo";
                                }
                            } else {
                                str3 = MediaStreamTrack.AUDIO_TRACK_KIND;
                            }
                        } else {
                            str3 = "META_AI_SUGGESTION";
                        }
                    } else {
                        str3 = "keyword";
                    }
                } else {
                    str3 = "place";
                }
            } else {
                str3 = "hashtag";
            }
        } else {
            str3 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }
        c25621Ms.A9s("entity_type", str3);
        c25621Ms.A0H("entity_id", str);
        c25621Ms.A0H("entity_name", str2);
        c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
        C1GJ.A03(c25621Ms.A0N());
    }
}
