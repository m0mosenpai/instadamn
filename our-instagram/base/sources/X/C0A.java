package X;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes5.dex */
public final class C0A extends C1I2 {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C6FG A02;
    public final /* synthetic */ C102884kP A03;

    public C0A(Rect rect, View view, C6FG c6fg, C102884kP c102884kP) {
        this.A01 = view;
        this.A00 = rect;
        this.A03 = c102884kP;
        this.A02 = c6fg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.CAL, java.lang.Object] */
    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        float f;
        int A03 = C0f9.A03(1990709536);
        View view = this.A01;
        if (view.getLocalVisibleRect(this.A00)) {
            f = r1.bottom / AbstractC166987dD.A08(view);
        } else {
            f = 0.0f;
        }
        C102884kP c102884kP = this.A03;
        InterfaceC103384lE A09 = c102884kP.A09();
        if (A09 != null) {
            try {
                C6FX A0s = AbstractC25225BEi.A0s();
                ?? obj = new Object();
                obj.A00 = f;
                A0s.A01(obj);
                C6FP.A03(this.A02, c102884kP, A0s.A00(), A09);
            } catch (IllegalStateException e) {
                AbstractC25241Le.A02("NetegoNodeExtensionBinderUtils", AnonymousClass001.A0b(e.getMessage(), " on_scroll hash: ", System.identityHashCode(c102884kP.A09())));
            }
        }
        C0f9.A0A(1720762424, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(-51740331, C0f9.A03(985537654));
    }
}
