package X;

/* loaded from: classes7.dex */
public final class HJS extends AbstractRunnableC14200nk {
    public final /* synthetic */ C25531Mh A00;
    public final /* synthetic */ C9BW A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJS(C25531Mh c25531Mh, C9BW c9bw, String str) {
        super(2015553371, 3, false, false);
        this.A00 = c25531Mh;
        this.A01 = c9bw;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25531Mh c25531Mh = this.A00;
        C9C7 c9c7 = (C9C7) this.A01.A01;
        c25531Mh.A0R("signal_id", c9c7.A06);
        AbstractC37304Gc5.A19(c25531Mh, c9c7, "signal_type", c9c7.A04.toString());
        c25531Mh.A0R("feature_signal_dispatched_to", this.A02);
        AbstractC37304Gc5.A18(c25531Mh);
        c25531Mh.Cht();
    }
}
