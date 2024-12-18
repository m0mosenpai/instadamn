package X;

/* loaded from: classes9.dex */
public final class PN9 implements Runnable {
    public final /* synthetic */ AbstractC52562NNi A00;

    public PN9(AbstractC52562NNi abstractC52562NNi) {
        this.A00 = abstractC52562NNi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C51116MiL c51116MiL;
        AbstractC52562NNi abstractC52562NNi = this.A00;
        if (MSW.A0d(abstractC52562NNi).A05 && (c51116MiL = abstractC52562NNi.A03) != null) {
            c51116MiL.notifyDataSetChanged();
        }
    }
}
