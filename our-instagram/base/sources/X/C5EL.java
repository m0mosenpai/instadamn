package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import java.util.function.Consumer;

/* renamed from: X.5EL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EL implements C5EM {
    public final InterfaceC74953Yl A00;

    @Override // X.C5EM
    public final void Dku() {
        this.A00.Egh(false);
    }

    public final void A00(View view, C113455Ah c113455Ah, Consumer consumer, C12W c12w) {
        C57S c57s = new C57S(new CU2[16]);
        Object obj = null;
        CBW.A00(c113455Ah.A00(), new B5j(c57s), 0);
        c57s.A07(new PU9(new InterfaceC16660sJ[]{C29979DJr.A00, C29980DJs.A00}));
        int i = c57s.A00;
        if (i != 0) {
            obj = c57s.A02[i - 1];
        }
        CU2 cu2 = (CU2) obj;
        if (cu2 != null) {
            C19K A02 = AnonymousClass194.A02(c12w);
            C113525Ap c113525Ap = cu2.A02;
            C28268CdD c28268CdD = cu2.A03;
            ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(this, c113525Ap, c28268CdD, A02);
            InterfaceC1131459c interfaceC1131459c = cu2.A01;
            C114205Dh Chk = AbstractC119495b6.A02(interfaceC1131459c).Chk(interfaceC1131459c, true);
            int i2 = c28268CdD.A01;
            int i3 = c28268CdD.A03;
            long A00 = AbstractC113765Bo.A00(i2, i3);
            C28268CdD A002 = AbstractC27486CBh.A00(Chk);
            ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(view, new Rect(A002.A01, A002.A03, A002.A02, A002.A00), new Point((int) (A00 >> 32), (int) (A00 & 4294967295L)), composeScrollCaptureCallback);
            scrollCaptureTarget.setScrollBounds(new Rect(i2, i3, c28268CdD.A02, c28268CdD.A00));
            consumer.accept(scrollCaptureTarget);
        }
    }

    public final boolean A01() {
        return ((Boolean) this.A00.getValue()).booleanValue();
    }

    public C5EL() {
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A00 = new ParcelableSnapshotMutableState(A00, false);
    }
}
