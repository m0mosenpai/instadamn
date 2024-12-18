package X;

/* renamed from: X.Svt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63918Svt implements InterfaceC100084eW {
    public C100164ee A00;
    public C100184eg A01;

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "render_thread";
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        if (sn2 instanceof QDM) {
            QDM qdm = (QDM) sn2;
            C100164ee c100164ee = this.A00;
            if (c100164ee != null) {
                qdm.A09 = c100164ee.A01();
            }
            if (stackTraceElementArr.length != 0) {
                StackTraceElement stackTraceElement = stackTraceElementArr[0];
                if (this.A01 != null) {
                    if ("android.graphics.HardwareRenderer".equals(stackTraceElement.getClassName()) || "android.view.ThreadedRenderer".equals(stackTraceElement.getClassName())) {
                        qdm.A0B = this.A01.A01();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
        int A00;
        if (this.A01 == null && (A00 = C15T.A00()) >= 0) {
            this.A01 = new C100184eg(A00);
            this.A00 = new C100164ee(A00);
        }
        C100184eg c100184eg = this.A01;
        if (c100184eg != null) {
            c100184eg.A02();
        }
        C100164ee c100164ee = this.A00;
        if (c100164ee != null) {
            c100164ee.A02();
        }
    }
}
