package X;

/* loaded from: classes7.dex */
public final class HJR extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C25531Mh A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJR(C25531Mh c25531Mh, int i) {
        super(2015553371, 3, false, false);
        this.A01 = c25531Mh;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25531Mh c25531Mh = this.A01;
        c25531Mh.A0Q("not_sent_signals_count", AbstractC31171DnF.A0V(this.A00));
        c25531Mh.A0R("not_sent_reason", AbstractC111324zv.A00(173));
        c25531Mh.Cht();
    }
}
