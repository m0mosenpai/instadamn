package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FcQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35053FcQ {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.E4T, X.0Zx] */
    public static final E4T A00(EnumC31334Dpz enumC31334Dpz, UserSession userSession, AbstractC53534Nm0 abstractC53534Nm0) {
        String name;
        C46552Bt A00 = AbstractC46542Bs.A00(userSession);
        ?? c0Zx = new C0Zx();
        boolean A002 = enumC31334Dpz.A00();
        c0Zx.A03(AbstractC111324zv.A00(725), Boolean.valueOf(A002));
        Enum r5 = enumC31334Dpz;
        if (!A002) {
            if (abstractC53534Nm0 instanceof C52740NVi) {
                name = null;
                c0Zx.A06(AbstractC111324zv.A00(1008), name);
                AbstractC31181DnP.A0k(c0Zx, userSession, A00, C196058lv.A08.A04(AbstractC32586EWm.A00, userSession));
                return c0Zx;
            }
            if (abstractC53534Nm0 instanceof NVh) {
                r5 = ((NVh) abstractC53534Nm0).A00();
            } else {
                throw B4Z.A00();
            }
        }
        name = r5.name();
        c0Zx.A06(AbstractC111324zv.A00(1008), name);
        AbstractC31181DnP.A0k(c0Zx, userSession, A00, C196058lv.A08.A04(AbstractC32586EWm.A00, userSession));
        return c0Zx;
    }

    public static final void A01(EnumC31334Dpz enumC31334Dpz, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, AbstractC53534Nm0 abstractC53534Nm0, Integer num) {
        String str;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                str = "recommend_on_facebook";
            } else {
                throw B4Z.A00();
            }
        } else {
            str = "crosspost_to_facebook";
        }
        AbstractC73317Y7a.A05(A00(enumC31334Dpz, userSession, abstractC53534Nm0), interfaceC11380iw, userSession, null, null, "direct_share_sheet", str, c38321qM.A2u(), AbstractC25231BEo.A0t(c38321qM.A2E(userSession)), AbstractC25226BEj.A1G(c38321qM), null, null, null, null);
    }
}
