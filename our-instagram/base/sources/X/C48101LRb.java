package X;

import java.util.List;

/* renamed from: X.LRb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48101LRb implements InterfaceC09670ek {
    public boolean A00;
    public C07S A01;
    public final C07X A02;
    public final InterfaceC58362lv A03;
    public final C49508LuL A04;

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C07S A07 = this.A02.getLifecycle().A07();
        if (this.A01 == C07S.INITIALIZED && A07.A00(C07S.CREATED)) {
            C49508LuL.A00(this.A04, true);
        } else if (A07 == C07S.DESTROYED) {
            C49508LuL c49508LuL = this.A04;
            InterfaceC58362lv interfaceC58362lv = this.A03;
            C48101LRb c48101LRb = (C48101LRb) c49508LuL.A04.remove(interfaceC58362lv);
            if (c48101LRb == null) {
                return;
            }
            C49508LuL.A00(c49508LuL, false);
            c48101LRb.A02.getLifecycle().A0A(c48101LRb);
            c49508LuL.A05.remove(interfaceC58362lv);
            return;
        }
        this.A01 = A07;
        boolean z = this.A00;
        boolean A00 = A07.A00(C07S.STARTED);
        this.A00 = A00;
        if (!z && A00) {
            C49508LuL c49508LuL2 = this.A04;
            InterfaceC58362lv interfaceC58362lv2 = this.A03;
            List A12 = AbstractC43592JPx.A12(interfaceC58362lv2, c49508LuL2.A05);
            if (A12 != null && !A12.isEmpty()) {
                interfaceC58362lv2.onChanged(A12);
                A12.clear();
            }
        }
    }

    public C48101LRb(C07X c07x, InterfaceC58362lv interfaceC58362lv, C49508LuL c49508LuL) {
        this.A02 = c07x;
        this.A03 = interfaceC58362lv;
        this.A04 = c49508LuL;
        this.A01 = c07x.getLifecycle().A07();
    }
}
