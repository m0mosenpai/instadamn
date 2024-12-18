package X;

/* renamed from: X.NGl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52390NGl extends AbstractRunnableC14200nk {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C25531Mh A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52390NGl(C25531Mh c25531Mh, double d, int i, int i2, int i3, long j) {
        super(2015553371, 3, false, false);
        this.A05 = c25531Mh;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A04 = j;
        this.A00 = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25531Mh c25531Mh = this.A05;
        c25531Mh.A0Q("number_of_signals_to_write", AbstractC31171DnF.A0V(this.A02));
        c25531Mh.A0Q("number_of_signals_write_success", AbstractC31171DnF.A0V(this.A03));
        c25531Mh.A0Q("number_of_signals_in_cache", AbstractC31171DnF.A0V(this.A01));
        c25531Mh.A0Q("cache_size_in_bytes", Long.valueOf(this.A04));
        c25531Mh.A0P("time_spent_in_ms", Double.valueOf(this.A00));
        c25531Mh.Cht();
    }
}
