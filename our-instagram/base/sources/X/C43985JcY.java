package X;

/* renamed from: X.JcY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43985JcY implements InterfaceC41501vz {
    public final /* synthetic */ JR2 A00;

    public C43985JcY(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1710931729);
        C5EW c5ew = (C5EW) obj;
        int A032 = C0f9.A03(-442617848);
        C14360o3.A0B(c5ew, 0);
        Integer num = c5ew.A00;
        if (num == C05F.A01) {
            JR2 jr2 = this.A00;
            AbstractC43593JPy.A0c(jr2).A05.A04();
            if (jr2.A2z) {
                C44142Jf7 A0d = AbstractC43593JPy.A0d(jr2);
                A0d.A01.markerPoint(31797299, "mailbox_delta_awaiting");
                A0d.A06 = true;
            }
        } else if (num == C05F.A0C) {
            JR2 jr22 = this.A00;
            AbstractC43593JPy.A0c(jr22).A05.A05();
            if (jr22.A2z) {
                C44142Jf7 A0d2 = AbstractC43593JPy.A0d(jr22);
                A0d2.A01.markerPoint(31797299, "mailbox_delta_up_to_date");
                A0d2.A06 = false;
                JR2.A0T(jr22);
            }
        }
        C0f9.A0A(-905256551, A032);
        C0f9.A0A(-2040541163, A03);
    }
}
