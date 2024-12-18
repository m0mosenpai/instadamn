package X;

/* loaded from: classes7.dex */
public final class HJJ extends AbstractRunnableC14200nk {
    public final /* synthetic */ IF8 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJJ(IF8 if8) {
        super(1411825408, 3, false, false);
        this.A00 = if8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A00.A01;
        if (str == null) {
            str = "null";
        }
        C0w9.A04(AnonymousClass001.A0R("push_event_test_", str), "Fake push blocking event fired", 1);
    }
}
