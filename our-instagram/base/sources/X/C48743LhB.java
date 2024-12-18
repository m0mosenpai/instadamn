package X;

import java.util.HashSet;

/* renamed from: X.LhB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48743LhB implements InterfaceC50464MPs {
    public final /* synthetic */ LLk A00;

    public C48743LhB(LLk lLk) {
        this.A00 = lLk;
    }

    @Override // X.InterfaceC50464MPs
    public final boolean Cch(C3o9 c3o9) {
        return this.A00.A0v.contains(c3o9);
    }

    @Override // X.InterfaceC50464MPs
    public final void DtU(C31228DoB c31228DoB) {
        LLk lLk = this.A00;
        C3o9 c3o9 = c31228DoB.A04;
        HashSet hashSet = lLk.A0v;
        if (!hashSet.add(c3o9)) {
            hashSet.remove(c3o9);
        }
        L8U l8u = lLk.A0r;
        l8u.A01();
        KCO.A04(l8u.A00);
    }
}
