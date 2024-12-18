package androidx.compose.ui.scrollcapture;

import X.AbstractC23641Du;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AnonymousClass194;
import X.C113525Ap;
import X.C19L;
import X.C23671Dx;
import X.C28268CdD;
import X.C28800CnW;
import X.C5EL;
import X.C5EM;
import X.D3Z;
import X.DRU;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public final RelativeScroller A00;
    public final C113525Ap A01;
    public final C5EM A02;
    public final C28268CdD A03;
    public final C19L A04;

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final C23671Dx A1L = AbstractC25226BEj.A1L(new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(rect, scrollCaptureSession, this, consumer, null), this.A04);
        A1L.CPD(DRU.A00(cancellationSignal, 40));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: X.Cj9
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                AnonymousClass195.this.AGH(null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object A03(android.view.ScrollCaptureSession r12, androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r13, X.C28268CdD r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.A03(android.view.ScrollCaptureSession, androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback, X.CdD, X.1Ds):java.lang.Object");
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC23641Du.A05(D3Z.A00, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, null), this.A04);
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        C28268CdD c28268CdD = this.A03;
        consumer.accept(new Rect(c28268CdD.A01, c28268CdD.A03, c28268CdD.A02, c28268CdD.A00));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.A00.A00 = 0.0f;
        AbstractC25227BEk.A1A(((C5EL) this.A02).A00, true);
        runnable.run();
    }

    public ComposeScrollCaptureCallback(C5EM c5em, C113525Ap c113525Ap, C28268CdD c28268CdD, C19L c19l) {
        this.A01 = c113525Ap;
        this.A03 = c28268CdD;
        this.A02 = c5em;
        this.A04 = AnonymousClass194.A03(C28800CnW.A00, c19l);
        this.A00 = new RelativeScroller(new ComposeScrollCaptureCallback$scrollTracker$1(this, null), c28268CdD.A00 - c28268CdD.A03);
    }
}
