package X;

/* loaded from: classes6.dex */
public final class GNZ implements Runnable {
    public final /* synthetic */ V11 A00;
    public final /* synthetic */ String A01;

    public GNZ(V11 v11, String str) {
        this.A00 = v11;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2OG A01 = C2OG.A01();
        V11 v11 = this.A00;
        C34648FOf A00 = C35129FeW.A00(AbstractC31173DnH.A0t(v11.A0N));
        A00.A0G = "hec_appeal_notification_type";
        A00.A0H = this.A01;
        A00.A04 = V11.A00(v11).A11;
        A00.A0I = false;
        C35129FeW.A01(A00, A01);
    }
}
