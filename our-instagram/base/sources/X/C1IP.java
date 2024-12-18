package X;

import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import java.util.List;

/* renamed from: X.1IP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IP extends C1IQ {
    public SubspanMutableStateFlow A00;
    public final C1IX A01;
    public final C1IR A02;
    public final C24601Id A03;
    public final C24571Ia A04;
    public final List A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1IP(C1IN c1in) {
        super(c1in);
        C1IR c1ir = new C1IR(c1in);
        C1IX c1ix = new C1IX(c1in);
        C24571Ia c24571Ia = new C24571Ia(c1in);
        C24601Id c24601Id = new C24601Id(c1in);
        C14360o3.A0B(c1in, 1);
        this.A02 = c1ir;
        this.A01 = c1ix;
        this.A04 = c24571Ia;
        this.A03 = c24601Id;
        this.A00 = new SubspanMutableStateFlow(C1IT.A05);
        this.A05 = AbstractC16960so.A1Q(c1ir, c1ix, c24571Ia, c24601Id);
    }

    @Override // X.C1IQ
    public final SubspanMutableStateFlow A00() {
        return this.A00;
    }

    @Override // X.C1IQ
    public final List A01() {
        return this.A05;
    }

    @Override // X.C1IQ
    public final void A04(SubspanMutableStateFlow subspanMutableStateFlow) {
        this.A00 = subspanMutableStateFlow;
    }

    public final void A06() {
        C1IX c1ix = this.A01;
        ((C1IQ) c1ix).A01.A02("CACHED_FEED_END");
        c1ix.A00().Egh(C1IT.A08);
    }
}
