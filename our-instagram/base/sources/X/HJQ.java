package X;

/* loaded from: classes7.dex */
public final class HJQ extends AbstractRunnableC14200nk {
    public final /* synthetic */ C25531Mh A00;
    public final /* synthetic */ C9BW A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJQ(C25531Mh c25531Mh, C9BW c9bw) {
        super(2015553371, 3, false, false);
        this.A00 = c25531Mh;
        this.A01 = c9bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        C25531Mh c25531Mh = this.A00;
        C9BW c9bw = this.A01;
        C9C7 c9c7 = (C9C7) c9bw.A01;
        c25531Mh.A0R("signal_id", c9c7.A06);
        c25531Mh.A0R("signal_type", c9c7.A04.toString());
        AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
        AbstractC37304Gc5.A19(c25531Mh, c9c7, "item_id", abstractC82583mM.A04());
        c25531Mh.A0R("container_module", abstractC82583mM.A02());
        AbstractC37304Gc5.A18(c25531Mh);
        if (abstractC82583mM instanceof C82573mL) {
            j = ((C82573mL) abstractC82583mM).A0A;
        } else {
            j = -1;
        }
        c25531Mh.A0Q("media_time_spent_in_ms", Long.valueOf(j));
        c25531Mh.A0R("not_sent_reason", AbstractC111324zv.A00(173));
        c25531Mh.Cht();
    }
}
