package X;

/* renamed from: X.3VS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VS extends AbstractC18280vF {
    public final /* synthetic */ C3VR A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3VS(C3VR c3vr) {
        super("foregroundlocation", 511, 5, false, false);
        this.A00 = c3vr;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        try {
            C3VR.A00(this.A00);
        } catch (Exception e) {
            C0w9.A06("ForegroundLocation", AbstractC111324zv.A00(1921), e);
        }
    }
}
