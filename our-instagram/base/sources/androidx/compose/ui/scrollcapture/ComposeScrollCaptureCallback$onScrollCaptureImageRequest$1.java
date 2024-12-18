package androidx.compose.ui.scrollcapture;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C28268CdD;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Rect A01;
    public final /* synthetic */ ScrollCaptureSession A02;
    public final /* synthetic */ ComposeScrollCaptureCallback A03;
    public final /* synthetic */ Consumer A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(Rect rect, ScrollCaptureSession scrollCaptureSession, ComposeScrollCaptureCallback composeScrollCaptureCallback, Consumer consumer, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = composeScrollCaptureCallback;
        this.A02 = scrollCaptureSession;
        this.A01 = rect;
        this.A04 = consumer;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ComposeScrollCaptureCallback composeScrollCaptureCallback = this.A03;
        return new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.A01, this.A02, composeScrollCaptureCallback, this.A04, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            ComposeScrollCaptureCallback composeScrollCaptureCallback = this.A03;
            ScrollCaptureSession scrollCaptureSession = this.A02;
            Rect rect = this.A01;
            C28268CdD c28268CdD = new C28268CdD(rect.left, rect.top, rect.right, rect.bottom);
            this.A00 = 1;
            obj = ComposeScrollCaptureCallback.A03(scrollCaptureSession, composeScrollCaptureCallback, c28268CdD, this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        C28268CdD c28268CdD2 = (C28268CdD) obj;
        this.A04.accept(new Rect(c28268CdD2.A01, c28268CdD2.A03, c28268CdD2.A02, c28268CdD2.A00));
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
