package X;

import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8A7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8A7 extends AbstractC52922bZ {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GT A05;
    public final C2GS A06;
    public final List A07;
    public final List A08;
    public final InterfaceC24731Iq A09;
    public final InterfaceC19390xP A0A;
    public final C05A A0B;
    public final InterfaceC24731Iq A0C;
    public final InterfaceC24731Iq A0D;
    public final InterfaceC19390xP A0E;

    public final void A02(Integer num, List list, boolean z, boolean z2, boolean z3) {
        InterfaceC24731Iq interfaceC24731Iq;
        this.A00 = num;
        A00(this);
        List list2 = this.A07;
        list2.addAll(list);
        this.A01 = z;
        this.A02 = z2;
        if (!z3) {
            interfaceC24731Iq = this.A0D;
        } else {
            interfaceC24731Iq = this.A0C;
        }
        interfaceC24731Iq.F8s(new C8A8(new C206189Bb((Medium) list2.get(0), this.A00, this.A01)));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.2GT, X.2GS] */
    public C8A7() {
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A0C = c24721Ip;
        C24721Ip c24721Ip2 = new C24721Ip(0);
        this.A0D = c24721Ip2;
        C013404z A04 = AnonymousClass111.A04(new AnonymousClass058(new C50121MBv(AbstractC07080Za.A03(c24721Ip2), (InterfaceC23621Ds) null, 18, 1500L)), AbstractC07080Za.A03(c24721Ip));
        this.A0E = A04;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A05 = AbstractC58232lf.A00(anonymousClass191, A04);
        C16930sl c16930sl = C16930sl.A00;
        C008002u c008002u = new C008002u(new C8A8(c16930sl));
        this.A0B = c008002u;
        this.A03 = AbstractC58232lf.A00(anonymousClass191, c008002u);
        this.A08 = new ArrayList();
        this.A07 = new ArrayList();
        this.A00 = C05F.A01;
        ?? c2gt = new C2GT(new C8A8(new C8A9(null, null, null, c16930sl, null, 1020, false, false, false)));
        this.A06 = c2gt;
        this.A04 = c2gt;
        C24721Ip c24721Ip3 = new C24721Ip(Integer.MAX_VALUE);
        this.A09 = c24721Ip3;
        this.A0A = AbstractC07080Za.A03(c24721Ip3);
    }

    public static final void A00(C8A7 c8a7) {
        List list = c8a7.A07;
        if (!list.isEmpty()) {
            list.clear();
            AbstractC23641Du.A05(AnonymousClass191.A00, new C25024B5f(c8a7, null, 47), AbstractC141776au.A00(c8a7));
        }
        c8a7.A08.clear();
    }

    public final void A01() {
        List list = this.A07;
        AnonymousClass016.A13(list);
        if (!list.isEmpty()) {
            this.A0C.F8s(new C8A8(new C206189Bb((Medium) list.get(0), this.A00, this.A01)));
            return;
        }
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206639Cu(this, null, 48), A00);
    }
}
