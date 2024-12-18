package X;

/* renamed from: X.YIe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73534YIe implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AbstractC55102ObF A03;

    public RunnableC73534YIe(AbstractC55102ObF abstractC55102ObF, int i, int i2, int i3) {
        this.A03 = abstractC55102ObF;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC55102ObF abstractC55102ObF = this.A03;
        if (abstractC55102ObF != null) {
            abstractC55102ObF.A0F(this.A00);
        }
    }
}
