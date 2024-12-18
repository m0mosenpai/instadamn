package X;

/* renamed from: X.Ou4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56032Ou4 implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C56032Ou4(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-591795708);
            C56015Otm c56015Otm = (C56015Otm) obj;
            int A0N = AbstractC167017dG.A0N(c56015Otm, 578983320);
            String str = c56015Otm.A01;
            String str2 = this.A03;
            if (C14360o3.A0K(str, str2)) {
                ((InterfaceC23621Ds) this.A01).resumeWith(c56015Otm.A00);
                OCZ ocz = (OCZ) this.A02;
                AbstractC25651Mw.A00(ocz.A00).A02((InterfaceC41501vz) ocz.A02.remove(str2), C56015Otm.class);
            }
            C0f9.A0A(-1293569310, A0N);
            i = -1580257839;
        } else {
            A03 = C0f9.A03(488789020);
            C56019Otq c56019Otq = (C56019Otq) obj;
            int A0N2 = AbstractC167017dG.A0N(c56019Otq, 603532924);
            String str3 = c56019Otq.A01;
            String str4 = this.A03;
            if (C14360o3.A0K(str3, str4)) {
                ((InterfaceC23621Ds) this.A01).resumeWith(c56019Otq.A00);
                C191108d8 c191108d8 = (C191108d8) this.A02;
                AbstractC25651Mw.A00(c191108d8.A00).A02((InterfaceC41501vz) c191108d8.A03.remove(str4), C56019Otq.class);
            }
            C0f9.A0A(-1786120838, A0N2);
            i = 49263139;
        }
        C0f9.A0A(i, A03);
    }
}
