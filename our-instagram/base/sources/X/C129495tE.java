package X;

import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: X.5tE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129495tE extends AbstractC51572Yf {
    public final InterfaceC59172nI A00;
    public final AbstractC50812Vc A01;
    public final InterfaceC30846DhL A02;
    public final C28903CpB A03;
    public final Integer A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16660sJ A08;
    public final long A09;
    public final C51722Yv A0A;

    public C129495tE(InterfaceC59172nI interfaceC59172nI, AbstractC50812Vc abstractC50812Vc, C51722Yv c51722Yv, InterfaceC30846DhL interfaceC30846DhL, C28903CpB c28903CpB, Integer num, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, long j) {
        C14360o3.A0B(interfaceC30846DhL, 3);
        this.A00 = interfaceC59172nI;
        this.A09 = j;
        this.A02 = interfaceC30846DhL;
        this.A0A = c51722Yv;
        this.A04 = num;
        this.A05 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A07 = interfaceC16820sZ3;
        this.A01 = abstractC50812Vc;
        this.A03 = c28903CpB;
        this.A08 = interfaceC16660sJ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        boolean z = true;
        int i = 0;
        Drawable A00 = AbstractC27723CKq.A00(c76223bS, new C29905DGt(c76223bS, 6), new Object[]{C0eB.A00});
        if ((this.A05 == null && this.A06 == null) || !(this.A02 instanceof C29516CzU)) {
            z = false;
        }
        C89813zN A002 = AbstractC51432Xq.A00(AbstractC51432Xq.A04, "image_fade_in_transition");
        A002.A03(AbstractC79463gt.A00);
        A002.A01(0.0f);
        Integer num = this.A04;
        if (num != null) {
            i = num.intValue();
        }
        A002.A02 = new C89803zM(new AccelerateDecelerateInterpolator(), i);
        AbstractC89903zW.A00(c76223bS, A002);
        long j = this.A09;
        C75933ay c75933ay = C51722Yv.A02;
        C26365BlA c26365BlA = new C26365BlA(c75933ay.A00(this.A0A), new DH2(25, A00, c76223bS, this), j);
        if (z) {
            return new C26555BoE(c26365BlA, c75933ay, new C29472Cym(C05F.A01, C05F.A00, C05F.A0C), new C29905DGt(this, 4), new C29905DGt(this, 5));
        }
        return c26365BlA;
    }
}
