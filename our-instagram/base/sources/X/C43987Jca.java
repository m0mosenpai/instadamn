package X;

/* renamed from: X.Jca, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43987Jca implements InterfaceC41501vz {
    public final /* synthetic */ JR2 A00;

    public C43987Jca(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-329174147);
        C132725yv c132725yv = (C132725yv) obj;
        int A0N = AbstractC167017dG.A0N(c132725yv, -1595321752);
        boolean z = c132725yv.A04;
        JR2 jr2 = this.A00;
        if (z) {
            jr2.A0v().A0J("snapshot_seq_id", String.valueOf(c132725yv.A00));
            String str = c132725yv.A03;
            if (str != null) {
                jr2.A0v().A0J("snapshot_fetch_reason", str);
            }
            jr2.A0v().A0J("snapshot_inbox_mode", c132725yv.A01.toString());
            jr2.A0v().A0J("snapshot_inbox_type", C99U.A00(c132725yv.A02));
            jr2.A0v().A06.A05();
        } else {
            jr2.A0v().A06.A04();
        }
        C0f9.A0A(49979900, A0N);
        C0f9.A0A(408598348, A03);
    }
}
