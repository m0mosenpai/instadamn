package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hnm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39957Hnm {
    public static C38624GyR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            H3T h3t = null;
            String str = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("attachment".equals(A0s)) {
                    h3t = AbstractC39954Hnj.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1Q(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("media_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("mixed_media_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H7P parseFromJson = IQS.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "GuideItem");
            } else if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_items", c16l, "GuideItem");
            } else {
                return new C38624GyR(h3t, str, str2, arrayList, arrayList2, l.longValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
