package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.api.schemas.RingSpecPoint;
import com.instagram.api.schemas.RingSpecPointImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IOr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41276IOr {
    public static RingSpecImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            RingSpecPointImpl ringSpecPointImpl = null;
            ArrayList arrayList2 = null;
            String str = null;
            RingSpecPointImpl ringSpecPointImpl2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("colors".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("end_point".equals(A0s)) {
                    ringSpecPointImpl = AbstractC40221Hsk.parseFromJson(c16l);
                } else if ("locations".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList2.add(AbstractC167007dF.A0a(c16l));
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("start_point".equals(A0s)) {
                    ringSpecPointImpl2 = AbstractC40221Hsk.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("colors", c16l, "RingSpecImpl");
            } else if (ringSpecPointImpl != null || !(c16l instanceof C07950bF)) {
                if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("locations", c16l, "RingSpecImpl");
                } else if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "RingSpecImpl");
                } else if (ringSpecPointImpl2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("start_point", c16l, "RingSpecImpl");
                } else {
                    return new RingSpecImpl(ringSpecPointImpl, ringSpecPointImpl2, str, arrayList, arrayList2);
                }
            } else {
                AbstractC166997dE.A1V("end_point", c16l, "RingSpecImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, RingSpecImpl ringSpecImpl) {
        anonymousClass182.A0d();
        List list = ringSpecImpl.A03;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "colors", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q);
            }
            anonymousClass182.A0Z();
        }
        RingSpecPoint ringSpecPoint = ringSpecImpl.A00;
        if (ringSpecPoint != null) {
            anonymousClass182.A0r("end_point");
            RingSpecPointImpl EzG = ringSpecPoint.EzG();
            anonymousClass182.A0d();
            anonymousClass182.A0P("x", EzG.A00);
            anonymousClass182.A0P("y", EzG.A01);
            anonymousClass182.A0a();
        }
        List list2 = ringSpecImpl.A04;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "locations", list2);
            while (A0q2.hasNext()) {
                Number number = (Number) A0q2.next();
                if (number != null) {
                    anonymousClass182.A0g(number.floatValue());
                }
            }
            anonymousClass182.A0Z();
        }
        String str = ringSpecImpl.A02;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        RingSpecPoint ringSpecPoint2 = ringSpecImpl.A01;
        if (ringSpecPoint2 != null) {
            anonymousClass182.A0r("start_point");
            RingSpecPointImpl EzG2 = ringSpecPoint2.EzG();
            anonymousClass182.A0d();
            anonymousClass182.A0P("x", EzG2.A00);
            anonymousClass182.A0P("y", EzG2.A01);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
