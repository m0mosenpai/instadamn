package X;

import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IP3 {
    public static H5W parseFromJson(C16L c16l) {
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
            H7X h7x = null;
            Float f = null;
            Float f2 = null;
            String str5 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str6 = null;
            Float f3 = null;
            Float f4 = null;
            Integer num5 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
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
                } else if (AbstractC111324zv.A00(907).equals(A0q)) {
                    h7x = I2F.parseFromJson(c16l);
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
                } else if (AbstractC37300Gc1.A1K(A0q)) {
                    f3 = AbstractC167007dF.A0Z(c16l);
                } else if (AbstractC37300Gc1.A1V(A0q)) {
                    f4 = AbstractC167007dF.A0Z(c16l);
                } else if (AbstractC37300Gc1.A1a(A0q)) {
                    num5 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1b(A0q)) {
                    subscriptionStickerDict = ADI.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1I(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    stickerTraySurface = AbstractC41282IOx.A01(A1P);
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
            return new H5W(stickerTraySurface, subscriptionStickerDict, h7x, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H5W h5w) {
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1H(anonymousClass182, h5w.A0G);
        AbstractC37301Gc2.A1K(anonymousClass182, h5w.A0H);
        AbstractC37301Gc2.A1L(anonymousClass182, h5w.A0I);
        AbstractC37301Gc2.A1J(anonymousClass182, h5w.A0J);
        H7X h7x = h5w.A02;
        if (h7x != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(907));
            anonymousClass182.A0d();
            String str = h7x.A00;
            if (str != null) {
                anonymousClass182.A0S("find_location_text", str);
            }
            String str2 = h7x.A01;
            if (str2 != null) {
                anonymousClass182.A0S("link", str2);
            }
            anonymousClass182.A0a();
        }
        AbstractC37302Gc3.A1G(anonymousClass182, h5w.A03);
        AbstractC37302Gc3.A1E(anonymousClass182, h5w.A04);
        AbstractC37301Gc2.A1D(anonymousClass182, h5w.A0K);
        AbstractC37302Gc3.A18(anonymousClass182, h5w.A0B);
        AbstractC37302Gc3.A15(anonymousClass182, h5w.A0C);
        AbstractC37302Gc3.A16(anonymousClass182, h5w.A0D);
        AbstractC37302Gc3.A17(anonymousClass182, h5w.A0E);
        AbstractC37301Gc2.A1G(anonymousClass182, h5w.A0L);
        AbstractC37302Gc3.A1F(anonymousClass182, h5w.A05);
        AbstractC37302Gc3.A1H(anonymousClass182, h5w.A06);
        AbstractC37302Gc3.A19(anonymousClass182, h5w.A0F);
        AbstractC37302Gc3.A14(anonymousClass182, h5w.A01);
        AbstractC37302Gc3.A13(anonymousClass182, h5w.A00);
        AbstractC37302Gc3.A1D(anonymousClass182, h5w.A07);
        AbstractC37302Gc3.A1A(anonymousClass182, h5w.A08);
        AbstractC37302Gc3.A1B(anonymousClass182, h5w.A09);
        AbstractC37302Gc3.A1C(anonymousClass182, h5w.A0A);
        anonymousClass182.A0a();
    }
}
