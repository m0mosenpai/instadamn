package X;

import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {129, 132}, m = "onScrollCaptureImageRequest", n = {"this", "session", "captureArea", "targetMin", "targetMax", "this", "session", "captureArea", "targetMin", "targetMax"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes5.dex */
public final class D3f extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ ComposeScrollCaptureCallback A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3f(ComposeScrollCaptureCallback composeScrollCaptureCallback, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A07 = composeScrollCaptureCallback;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A02 |= Integer.MIN_VALUE;
        return ComposeScrollCaptureCallback.A03(null, this.A07, null, this);
    }
}
