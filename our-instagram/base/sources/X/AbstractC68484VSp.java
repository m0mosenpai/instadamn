package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.VSp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68484VSp {
    public static C69727VuM parseFromJson(C16L c16l) {
        Integer num;
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            C69727VuM c69727VuM = new C69727VuM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("hcm_type".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    Integer[] A00 = C05F.A00(8);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = MediaStreamTrack.AUDIO_TRACK_KIND;
                                    break;
                                case 2:
                                    str = AbstractC43591JPw.A00(423);
                                    break;
                                case 3:
                                    str = "places";
                                    break;
                                case 4:
                                    str = "reels_trends";
                                    break;
                                case 5:
                                    str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                                    break;
                                case 6:
                                    str = "threads";
                                    break;
                                case 7:
                                    str = "unknown";
                                    break;
                                default:
                                    str = "account";
                                    break;
                            }
                            if (!str.equals(A1Q)) {
                                i++;
                            }
                        } else {
                            num = C05F.A15;
                        }
                    }
                    c69727VuM.A02 = num;
                } else {
                    ArrayList arrayList = null;
                    if ("header".equals(A0s)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        c69727VuM.A03 = A0m;
                    } else if ("subheader".equals(A0s)) {
                        c69727VuM.A06 = AbstractC167017dG.A0m(c16l);
                    } else if ("subtext".equals(A0s)) {
                        c69727VuM.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("thumbnail".equals(A0s)) {
                        c69727VuM.A01 = AbstractC68483VSo.parseFromJson(c16l);
                    } else if ("metadata".equals(A0s)) {
                        C69646Vsn parseFromJson = AbstractC68482VSn.parseFromJson(c16l);
                        C14360o3.A0B(parseFromJson, 0);
                        c69727VuM.A00 = parseFromJson;
                    } else if ("preview_images".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC31180DnO.A1N(c16l, arrayList);
                            }
                        }
                        c69727VuM.A08 = arrayList;
                    } else if ("query".equals(A0s)) {
                        String A0m2 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m2, 0);
                        c69727VuM.A05 = A0m2;
                    }
                }
                c16l.A0z();
            }
            switch (c69727VuM.A01().intValue()) {
                case 0:
                    if (c69727VuM.A00().A00 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    return c69727VuM;
                case 1:
                    C69646Vsn A002 = c69727VuM.A00();
                    if (A002.A01 == null && A002.A04 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    return c69727VuM;
                case 2:
                case 7:
                    return c69727VuM;
                case 3:
                    if (c69727VuM.A00().A02 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    return c69727VuM;
                case 4:
                    if (c69727VuM.A00().A07 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    return c69727VuM;
                case 5:
                    if (c69727VuM.A00().A06 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    return c69727VuM;
                case 6:
                    if (c69727VuM.A08 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    return c69727VuM;
                default:
                    throw new RuntimeException();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
