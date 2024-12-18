package X;

/* renamed from: X.GGh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36712GGh implements C3QU {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C75113Zb A01;
    public final /* synthetic */ java.util.Set A02;

    @Override // X.C3QU
    public final void DFe(float f) {
    }

    public C36712GGh(C38321qM c38321qM, C75113Zb c75113Zb, java.util.Set set) {
        this.A02 = set;
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
    }

    @Override // X.C3QU
    public final void DFc() {
        this.A01.A0r = null;
    }

    @Override // X.C3QU
    public final void DFd() {
        boolean contains = this.A02.contains(this.A00.getId());
        C75113Zb c75113Zb = this.A01;
        if (!contains) {
            C87353ut c87353ut = c75113Zb.A0r;
            if (c87353ut != null) {
                c87353ut.A00();
                return;
            }
            return;
        }
        c75113Zb.A3E = true;
    }
}
