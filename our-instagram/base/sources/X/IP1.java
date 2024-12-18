package X;

import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class IP1 {
    public static H5Q parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            H5R h5r = null;
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
                } else if (AbstractC111324zv.A00(353).equals(A0q)) {
                    h5r = AbstractC40274Hte.parseFromJson(c16l);
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
            return new H5Q(stickerTraySurface, h5r, subscriptionStickerDict, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H5Q h5q) {
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1H(anonymousClass182, h5q.A0G);
        AbstractC37301Gc2.A1K(anonymousClass182, h5q.A0H);
        JMU jmu = h5q.A01;
        if (jmu != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(353));
            H5R F07 = jmu.F07();
            anonymousClass182.A0d();
            String str = F07.A02;
            if (str != null) {
                anonymousClass182.A0S("accessibility_hint", str);
            }
            String str2 = F07.A03;
            if (str2 != null) {
                anonymousClass182.A0S("action_tooltip_text", str2);
            }
            String str3 = F07.A04;
            if (str3 != null) {
                anonymousClass182.A0S("bloks_app", str3);
            }
            HashMap hashMap = F07.A07;
            if (hashMap != null) {
                anonymousClass182.A0r("bloks_parameters");
                anonymousClass182.A0d();
                Iterator A14 = AbstractC166997dE.A14(hashMap);
                while (A14.hasNext()) {
                    AbstractC37303Gc4.A14(anonymousClass182, A14);
                }
                anonymousClass182.A0a();
            }
            AbstractC37301Gc2.A1D(anonymousClass182, F07.A05);
            String str4 = F07.A06;
            if (str4 != null) {
                anonymousClass182.A0S("nux_tooltip_text", str4);
            }
            Boolean bool = F07.A00;
            if (bool != null) {
                anonymousClass182.A0T("should_preload", bool.booleanValue());
            }
            Integer num = F07.A01;
            if (num != null) {
                anonymousClass182.A0Q("show_tooltip_count", num.intValue());
            }
            anonymousClass182.A0a();
        }
        AbstractC37301Gc2.A1L(anonymousClass182, h5q.A0I);
        AbstractC37301Gc2.A1J(anonymousClass182, h5q.A0J);
        AbstractC37302Gc3.A1G(anonymousClass182, h5q.A03);
        AbstractC37302Gc3.A1E(anonymousClass182, h5q.A04);
        AbstractC37301Gc2.A1D(anonymousClass182, h5q.A0K);
        AbstractC37302Gc3.A18(anonymousClass182, h5q.A0B);
        AbstractC37302Gc3.A15(anonymousClass182, h5q.A0C);
        AbstractC37302Gc3.A16(anonymousClass182, h5q.A0D);
        AbstractC37302Gc3.A17(anonymousClass182, h5q.A0E);
        AbstractC37301Gc2.A1G(anonymousClass182, h5q.A0L);
        AbstractC37302Gc3.A1F(anonymousClass182, h5q.A05);
        AbstractC37302Gc3.A1H(anonymousClass182, h5q.A06);
        AbstractC37302Gc3.A19(anonymousClass182, h5q.A0F);
        AbstractC37302Gc3.A14(anonymousClass182, h5q.A02);
        AbstractC37302Gc3.A13(anonymousClass182, h5q.A00);
        AbstractC37302Gc3.A1D(anonymousClass182, h5q.A07);
        AbstractC37302Gc3.A1A(anonymousClass182, h5q.A08);
        AbstractC37302Gc3.A1B(anonymousClass182, h5q.A09);
        AbstractC37302Gc3.A1C(anonymousClass182, h5q.A0A);
        anonymousClass182.A0a();
    }
}
