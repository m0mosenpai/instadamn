package X;

import com.instagram.quicksand.QuickSandSolverBridge;

/* renamed from: X.ESs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32492ESs extends C1P1 {
    public final /* synthetic */ C34950Faa A00;

    public C32492ESs(C34950Faa c34950Faa) {
        this.A00 = c34950Faa;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1798347894);
        super.onFail(abstractC115105If);
        int i = C34950Faa.A03;
        C34950Faa.A03 = i - 1;
        if (i > 0) {
            C34950Faa.A00(this.A00);
        }
        C0f9.A0A(-1271340349, A03);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.EZR, X.0nk] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(2069655902);
        ED8 ed8 = (ED8) obj;
        int A032 = C0f9.A03(108377186);
        super.onSuccess(ed8);
        C34950Faa c34950Faa = this.A00;
        int i = ed8.A01;
        String str = ed8.A04;
        int i2 = ed8.A03;
        int i3 = ed8.A02;
        int i4 = ed8.A00;
        ?? abstractRunnableC14200nk = new AbstractRunnableC14200nk(179);
        abstractRunnableC14200nk.A01 = i;
        abstractRunnableC14200nk.A06 = str;
        abstractRunnableC14200nk.A02 = i3;
        abstractRunnableC14200nk.A03 = i2;
        abstractRunnableC14200nk.A04 = new C34706FQr();
        abstractRunnableC14200nk.A00 = 0;
        abstractRunnableC14200nk.A05 = new QuickSandSolverBridge(i2, i4);
        c34950Faa.A00 = abstractRunnableC14200nk;
        C14120nc.A00().ATO(c34950Faa.A00);
        C0f9.A0A(1811792520, A032);
        C0f9.A0A(227020634, A03);
    }
}
