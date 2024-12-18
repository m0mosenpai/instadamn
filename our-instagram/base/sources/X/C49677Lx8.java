package X;

/* renamed from: X.Lx8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49677Lx8 implements MPM {
    public final /* synthetic */ KC0 A00;

    public C49677Lx8(KC0 kc0) {
        this.A00 = kc0;
    }

    @Override // X.MPM
    public final void Chd() {
        L2K l2k;
        C44545Jmp c44545Jmp = this.A00.A05;
        if (c44545Jmp != null && (l2k = (L2K) c44545Jmp.A04.A02()) != null && l2k.A02) {
            AnonymousClass195 anonymousClass195 = c44545Jmp.A02;
            if (anonymousClass195 != null && anonymousClass195.isActive()) {
                return;
            }
            c44545Jmp.A01 = AbstractC25226BEj.A1L(new MCH(c44545Jmp, AbstractC25230BEn.A0s(c44545Jmp.A01), 38), AbstractC141776au.A00(c44545Jmp));
        }
    }
}
