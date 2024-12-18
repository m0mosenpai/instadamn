package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.WgJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70745WgJ implements C1EH {
    public static final C70745WgJ A00 = new C70745WgJ();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.UPW, java.lang.Object] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        ?? obj = new Object();
        obj.A00 = null;
        obj.A01 = null;
        obj.A07 = null;
        obj.A08 = null;
        obj.A0A = null;
        obj.A02 = null;
        obj.A0B = null;
        obj.A03 = null;
        obj.A04 = null;
        obj.A09 = null;
        obj.A0C = null;
        obj.A05 = null;
        obj.A0D = null;
        obj.A0E = null;
        obj.A0F = null;
        obj.A06 = null;
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaHashtag should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1948154558:
                        if (A0s.equals("allow_muting_story")) {
                            obj.A01 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1548880689:
                        if (A0s.equals("search_subtitle")) {
                            obj.A0F = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -875391281:
                        if (A0s.equals("use_default_avatar")) {
                            obj.A06 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -9393932:
                        if (A0s.equals("media_count")) {
                            obj.A09 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            obj.A0B = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3373707:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                            obj.A0C = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 118114326:
                        if (A0s.equals("is_local")) {
                            obj.A04 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 342632973:
                        if (A0s.equals("non_violating")) {
                            obj.A05 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 348451171:
                        if (A0s.equals("search_result_subtitle")) {
                            obj.A0E = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 765915793:
                        if (A0s.equals("following")) {
                            obj.A08 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 1013486691:
                        if (A0s.equals("is_eligible_for_survey")) {
                            obj.A03 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1028143168:
                        if (A0s.equals("follow_status")) {
                            obj.A07 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 1446562075:
                        if (A0s.equals("allow_following")) {
                            obj.A00 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1544060401:
                        if (A0s.equals("formatted_media_count")) {
                            obj.A0A = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1767727834:
                        if (A0s.equals("hide_use_hashtag_button")) {
                            obj.A02 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1782139044:
                        if (A0s.equals("profile_pic_url")) {
                            obj.A0D = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaHashtagJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
