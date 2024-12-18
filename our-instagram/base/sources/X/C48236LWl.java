package X;

/* renamed from: X.LWl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48236LWl implements MQO {
    public final /* synthetic */ KC0 A00;
    public final /* synthetic */ C87T A01;

    @Override // X.MQO
    public final void CwN(C46520KiJ c46520KiJ) {
    }

    public C48236LWl(KC0 kc0, C87T c87t) {
        this.A00 = kc0;
        this.A01 = c87t;
    }

    @Override // X.MQO
    public final void DD1(C46520KiJ c46520KiJ, boolean z) {
        C44545Jmp c44545Jmp = this.A00.A05;
        if (c44545Jmp != null) {
            String str = c46520KiJ.A05;
            C14360o3.A07(str);
            C4T4.A00(c44545Jmp.A08).Cm5(XkZ.A04, c44545Jmp.A00, c44545Jmp.A09, c44545Jmp.A0A, str, "effect", -1);
        }
        C87T c87t = this.A01;
        String str2 = c46520KiJ.A05;
        C14360o3.A07(str2);
        c87t.A04.A02(str2);
        c87t.A07(str2);
    }

    @Override // X.MQO
    public final void DVs() {
        this.A01.A04.A01(C85B.A0B);
    }
}
