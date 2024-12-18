package X;

/* renamed from: X.Lx7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49676Lx7 implements MPM {
    public final /* synthetic */ C45485KBz A00;

    public C49676Lx7(C45485KBz c45485KBz) {
        this.A00 = c45485KBz;
    }

    @Override // X.MPM
    public final void Chd() {
        String str;
        C44542Jmm c44542Jmm = this.A00.A08;
        if (c44542Jmm != null) {
            C2GS c2gs = c44542Jmm.A01;
            L2K l2k = (L2K) c2gs.A02();
            if (l2k != null && l2k.A02) {
                C87T c87t = c44542Jmm.A05;
                AnonymousClass859 anonymousClass859 = c87t.A03;
                String str2 = c44542Jmm.A07;
                L2K l2k2 = (L2K) c2gs.A02();
                if (l2k2 != null) {
                    str = l2k2.A00;
                } else {
                    str = null;
                }
                AbstractC25232BEp.A1J(c44542Jmm, new MC5(c44542Jmm, null, 5), C44542Jmm.A00(new C47703L4k(anonymousClass859, str2, str, null, null, null, c87t.A0M.get(), c87t.A0K.get()), c44542Jmm));
            }
        }
    }
}
