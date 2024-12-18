package X;

import java.util.List;

/* renamed from: X.1IX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IX extends C1IQ {
    public final C1IZ A00;
    public final C1IY A01;
    public final List A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1IZ, X.1IQ] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1IY, X.1IQ] */
    public C1IX(final C1IN c1in) {
        super(c1in);
        C14360o3.A0B(c1in, 1);
        ?? r1 = new C1IQ(c1in) { // from class: X.1IY
            public final List A00 = C16930sl.A00;

            @Override // X.C1IQ
            public final List A01() {
                return this.A00;
            }
        };
        this.A01 = r1;
        ?? r0 = new C1IQ(c1in) { // from class: X.1IZ
            public final List A00 = C16930sl.A00;

            @Override // X.C1IQ
            public final List A01() {
                return this.A00;
            }
        };
        this.A00 = r0;
        this.A02 = AbstractC16960so.A1Q(r1, r0);
    }

    @Override // X.C1IQ
    public final List A01() {
        return this.A02;
    }
}
