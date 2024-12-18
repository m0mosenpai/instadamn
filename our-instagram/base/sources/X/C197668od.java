package X;

/* renamed from: X.8od, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197668od extends AbstractRunnableC14200nk {
    public final /* synthetic */ C8LZ A00;
    public final /* synthetic */ C183978Ee A01;

    @Override // java.lang.Runnable
    public final void run() {
        final C183978Ee c183978Ee = this.A01;
        c183978Ee.A06();
        C11T.A02(new Runnable() { // from class: X.8oe
            @Override // java.lang.Runnable
            public final void run() {
                C197668od c197668od = C197668od.this;
                C8LZ.A0C(c197668od.A00, c183978Ee);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C197668od(C8LZ c8lz, C183978Ee c183978Ee) {
        super(467248608);
        this.A00 = c8lz;
        this.A01 = c183978Ee;
    }
}
