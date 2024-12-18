package X;

/* renamed from: X.JcX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43984JcX implements InterfaceC41501vz {
    public final /* synthetic */ JR2 A00;

    public C43984JcX(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C69613Av c69613Av;
        int A03 = C0f9.A03(1323170948);
        C5EX c5ex = (C5EX) obj;
        int A032 = C0f9.A03(-1879965425);
        C14360o3.A0B(c5ex, 0);
        Integer num = c5ex.A02;
        if (num == C05F.A01) {
            JR2 jr2 = this.A00;
            jr2.A0v().A0B.A04();
            if (JR2.A0j(jr2) && (c69613Av = AbstractC43593JPy.A0c(jr2).A07) != null) {
                c69613Av.A04();
            }
            if (jr2.A2z) {
                C44142Jf7 A0d = AbstractC43593JPy.A0d(jr2);
                A0d.A01.markerPoint(31797299, "mailbox_iris_sync_start");
                A0d.A07 = true;
            }
        } else if (num == C05F.A0C) {
            JR2 jr22 = this.A00;
            C43939Jbo A0v = jr22.A0v();
            long j = c5ex.A01;
            Long valueOf = Long.valueOf(j);
            A0v.A0I("latest_server_seq_id", valueOf);
            InterfaceC09390do interfaceC09390do = jr22.A2M;
            C43809JYw A0f = AbstractC43592JPx.A0f(interfaceC09390do);
            A0f.A01 = valueOf;
            A0f.A0I("latest_server_seq_id", valueOf);
            C43939Jbo A0v2 = jr22.A0v();
            long j2 = j - c5ex.A00;
            A0v2.A0I("total_delta_count", Long.valueOf(j2));
            AbstractC43592JPx.A0f(interfaceC09390do).A0S(j2);
            jr22.A0v().A0B.A05();
            if (jr22.A2z) {
                C44142Jf7 A0d2 = AbstractC43593JPy.A0d(jr22);
                A0d2.A01.markerPoint(31797299, "mailbox_iris_sync_completed");
                A0d2.A07 = false;
                JR2.A0T(jr22);
            }
        }
        C0f9.A0A(-259982750, A032);
        C0f9.A0A(1685186958, A03);
    }
}
