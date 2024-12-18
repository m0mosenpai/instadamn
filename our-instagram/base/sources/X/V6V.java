package X;

/* loaded from: classes11.dex */
public final class V6V extends AbstractRunnableC14200nk {
    public final /* synthetic */ C449124v A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C15370ps A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6V(C449124v c449124v, String str, C15370ps c15370ps) {
        super(1948240166, 3, false, false);
        this.A02 = c15370ps;
        this.A00 = c449124v;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15370ps c15370ps = this.A02;
        AbstractC02600Aj abstractC02600Aj = (AbstractC02600Aj) c15370ps.A00;
        String str = this.A01;
        abstractC02600Aj.A0R("original_color_space", C449124v.A02(str));
        abstractC02600Aj.A0Q("original_color_depth", Long.valueOf(C449124v.A00(str)));
        abstractC02600Aj.A0Q("original_frame_per_second", Long.valueOf(C449124v.A01(str)));
        C176567tE.A00(new RunnableC71334Ws2(c15370ps));
    }
}
