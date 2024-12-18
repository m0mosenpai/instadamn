package X;

/* renamed from: X.9ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217419ja extends AbstractC18280vF {
    public final /* synthetic */ C3VR A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C217419ja(C3VR c3vr) {
        super("foregroundlocation", 511, 5, false, false);
        this.A00 = c3vr;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        try {
            C3VR c3vr = this.A00;
            if (c3vr.A03) {
                C3VR.A01(c3vr);
                c3vr.A03 = false;
            }
        } catch (Exception e) {
            C0w9.A06("ForegroundLocation", AbstractC111324zv.A00(1921), e);
        }
    }
}
