package X;

import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IPD {
    public static C38779H5t parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Float f = null;
            Float f2 = null;
            String str5 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str6 = null;
            String str7 = null;
            Float f3 = null;
            Float f4 = null;
            Integer num5 = null;
            String str8 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
            String str9 = null;
            String str10 = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1X(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1Y(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1Z(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1T(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1R(A0q)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC37300Gc1.A1H(A0q)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC31171DnF.A1Y(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1U(A0q)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1M(A0q)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1N(A0q)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1P(A0q)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1O(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(505).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1K(A0q)) {
                    f3 = AbstractC167007dF.A0Z(c16l);
                } else if (AbstractC37300Gc1.A1V(A0q)) {
                    f4 = AbstractC167007dF.A0Z(c16l);
                } else if (AbstractC37300Gc1.A1a(A0q)) {
                    num5 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC58317Pt9.A00(52).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1b(A0q)) {
                    subscriptionStickerDict = ADI.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1I(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    stickerTraySurface = AbstractC41282IOx.A01(A1P);
                } else if (AbstractC111324zv.A00(1335).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1336).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1G(A0q)) {
                    f5 = AbstractC167007dF.A0Z(c16l);
                } else if (AbstractC37300Gc1.A1A(A0q)) {
                    f6 = AbstractC167007dF.A0Z(c16l);
                } else if (AbstractC37300Gc1.A1B(A0q)) {
                    f7 = AbstractC167007dF.A0Z(c16l);
                } else {
                    f8 = AbstractC37303Gc4.A0L(c16l, f8, A0q);
                }
                c16l.A0z();
            }
            return new C38779H5t(stickerTraySurface, subscriptionStickerDict, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38779H5t c38779H5t) {
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1H(anonymousClass182, c38779H5t.A0F);
        AbstractC37301Gc2.A1K(anonymousClass182, c38779H5t.A0G);
        AbstractC37301Gc2.A1L(anonymousClass182, c38779H5t.A0H);
        AbstractC37301Gc2.A1J(anonymousClass182, c38779H5t.A0I);
        AbstractC37302Gc3.A1G(anonymousClass182, c38779H5t.A02);
        AbstractC37302Gc3.A1E(anonymousClass182, c38779H5t.A03);
        AbstractC37301Gc2.A1D(anonymousClass182, c38779H5t.A0J);
        AbstractC37302Gc3.A18(anonymousClass182, c38779H5t.A0A);
        AbstractC37302Gc3.A15(anonymousClass182, c38779H5t.A0B);
        AbstractC37302Gc3.A16(anonymousClass182, c38779H5t.A0C);
        AbstractC37302Gc3.A17(anonymousClass182, c38779H5t.A0D);
        AbstractC37301Gc2.A1G(anonymousClass182, c38779H5t.A0K);
        String str = c38779H5t.A0L;
        if (str != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(505), str);
        }
        AbstractC37302Gc3.A1F(anonymousClass182, c38779H5t.A04);
        AbstractC37302Gc3.A1H(anonymousClass182, c38779H5t.A05);
        AbstractC37302Gc3.A19(anonymousClass182, c38779H5t.A0E);
        String str2 = c38779H5t.A0M;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC58317Pt9.A00(52), str2);
        }
        AbstractC37302Gc3.A14(anonymousClass182, c38779H5t.A01);
        AbstractC37302Gc3.A13(anonymousClass182, c38779H5t.A00);
        String str3 = c38779H5t.A0N;
        if (str3 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(1335), str3);
        }
        String str4 = c38779H5t.A0O;
        if (str4 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(1336), str4);
        }
        AbstractC37302Gc3.A1D(anonymousClass182, c38779H5t.A06);
        AbstractC37302Gc3.A1A(anonymousClass182, c38779H5t.A07);
        AbstractC37302Gc3.A1B(anonymousClass182, c38779H5t.A08);
        AbstractC37302Gc3.A1C(anonymousClass182, c38779H5t.A09);
        anonymousClass182.A0a();
    }
}
