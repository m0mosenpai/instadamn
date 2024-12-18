package X;

import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24601Id extends C1IQ {
    public SubspanMutableStateFlow A00;
    public final C24611Ie A01;
    public final List A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1Ie, java.lang.Object] */
    public /* synthetic */ C24601Id(final C1IN c1in) {
        super(c1in);
        ?? r2 = new C1IQ(c1in) { // from class: X.1Ie
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
        this.A01 = r2;
        this.A00 = new SubspanMutableStateFlow(C1IT.A05);
        List singletonList = Collections.singletonList(r2);
        C14360o3.A07(singletonList);
        this.A02 = singletonList;
    }

    @Override // X.C1IQ
    public final SubspanMutableStateFlow A00() {
        return this.A00;
    }

    @Override // X.C1IQ
    public final List A01() {
        return this.A02;
    }

    @Override // X.C1IQ
    public final void A04(SubspanMutableStateFlow subspanMutableStateFlow) {
        this.A00 = subspanMutableStateFlow;
    }
}
