package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IQx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41327IQx {
    public static C38898HAu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38898HAu c38898HAu = new C38898HAu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    c38898HAu.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("media_count".equals(A0s)) {
                    c38898HAu.A01 = c16l.A1D();
                } else if ("formatted_media_count".equals(A0s)) {
                    c38898HAu.A06 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    c38898HAu.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_pic_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("following".equals(A0s)) {
                    c38898HAu.A00 = c16l.A1D();
                } else if ("allow_following".equals(A0s)) {
                    c38898HAu.A0B = c16l.A0d();
                } else if ("allow_muting_story".equals(A0s)) {
                    c38898HAu.A0C = c16l.A0d();
                } else if ("non_violating".equals(A0s)) {
                    c38898HAu.A0F = c16l.A0d();
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("social_context_profile_links".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C82263ln parseFromJson = AbstractC82233lk.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c38898HAu.A0A = arrayList;
                } else if ("social_context_facepile_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c38898HAu.A09 = arrayList;
                } else if ("follow_button_text".equals(A0s)) {
                    c38898HAu.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("show_follow_drop_down".equals(A0s)) {
                    c38898HAu.A0G = c16l.A0d();
                } else if (AbstractC37300Gc1.A1Q(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("destination_info".equals(A0s)) {
                    c38898HAu.A02 = I2K.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(4736).equals(A0s)) {
                    c38898HAu.A0E = c16l.A0d();
                } else if ("fresh_topic_metadata".equals(A0s)) {
                    c38898HAu.A03 = I2L.parseFromJson(c16l);
                } else if ("promo_banner".equals(A0s)) {
                    c38898HAu.A04 = I2M.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(4570).equals(A0s)) {
                    c38898HAu.A0D = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c38898HAu, A0s);
                }
                c16l.A0z();
            }
            return c38898HAu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
