package X;

import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import java.util.List;

/* renamed from: X.1Ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24571Ia extends C1IQ {
    public SubspanMutableStateFlow A00;
    public final C24581Ib A01;
    public final C24591Ic A02;
    public final List A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1Ic, X.1IQ] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Ib, X.1IQ] */
    public /* synthetic */ C24571Ia(final C1IN c1in) {
        super(c1in);
        ?? r3 = new C1IQ(c1in) { // from class: X.1Ib
            public final List A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c1in);
                C14360o3.A0B(c1in, 1);
                this.A00 = C16930sl.A00;
            }

            @Override // X.C1IQ
            public final List A01() {
                return this.A00;
            }
        };
        ?? r2 = new C1IQ(c1in) { // from class: X.1Ic
            public final List A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c1in);
                C14360o3.A0B(c1in, 1);
                this.A00 = C16930sl.A00;
            }

            @Override // X.C1IQ
            public final List A01() {
                return this.A00;
            }
        };
        C14360o3.A0B(c1in, 1);
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = new SubspanMutableStateFlow(C1IT.A05);
        this.A03 = AbstractC16960so.A1Q(r3, r2);
    }

    @Override // X.C1IQ
    public final SubspanMutableStateFlow A00() {
        return this.A00;
    }

    @Override // X.C1IQ
    public final List A01() {
        return this.A03;
    }

    @Override // X.C1IQ
    public final void A04(SubspanMutableStateFlow subspanMutableStateFlow) {
        this.A00 = subspanMutableStateFlow;
    }
}
