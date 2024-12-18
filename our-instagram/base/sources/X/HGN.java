package X;

/* loaded from: classes7.dex */
public final class HGN extends C1P1 {
    public final JHB A00;
    public final C62162sH A01;

    public HGN(JHB jhb, C62162sH c62162sH) {
        C14360o3.A0B(c62162sH, 1);
        this.A01 = c62162sH;
        this.A00 = jhb;
    }

    public final void A00(HA1 ha1) {
        int A03 = C0f9.A03(1772782354);
        C14360o3.A0B(ha1, 0);
        C62162sH c62162sH = this.A01;
        c62162sH.A01 = ha1;
        c62162sH.A02 = AbstractC31173DnH.A0g();
        this.A00.Dpy(ha1);
        if (!ha1.A00) {
            c62162sH.A00++;
        } else {
            c62162sH.A00 = 0;
        }
        C0f9.A0A(1861782810, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -629089644);
        this.A00.onFail(abstractC115105If);
        this.A01.A00++;
        C0f9.A0A(775682965, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1949452005);
        this.A01.A03 = false;
        C0f9.A0A(-1546073858, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1257410399);
        A00((HA1) obj);
        C0f9.A0A(-588531961, A03);
    }
}
