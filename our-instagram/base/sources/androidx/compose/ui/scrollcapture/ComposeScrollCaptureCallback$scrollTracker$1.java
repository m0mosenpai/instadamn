package androidx.compose.ui.scrollcapture;

import X.AbstractC09560e7;
import X.AbstractC113545Ar;
import X.AbstractC119395aw;
import X.AbstractC120875de;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC28290Cdc;
import X.C00O;
import X.C0eB;
import X.C113505An;
import X.C113525Ap;
import X.C119365at;
import X.C1JX;
import X.C5B6;
import X.C6OK;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {85}, m = "invokeSuspend", n = {"reverseScrolling"}, s = {"Z$0"})
/* loaded from: classes5.dex */
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public boolean A01;
    public /* synthetic */ float A02;
    public final /* synthetic */ ComposeScrollCaptureCallback A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = composeScrollCaptureCallback;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.A03, interfaceC23621Ds);
        composeScrollCaptureCallback$scrollTracker$1.A02 = AbstractC166987dD.A09(obj);
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C113525Ap c113525Ap;
        boolean z;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            z = this.A01;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            float f = this.A02;
            c113525Ap = this.A03.A01;
            C113505An c113505An = c113525Ap.A05;
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) C5B6.A00(c113505An, AbstractC120875de.A0K);
            if (interfaceC16620sF != null) {
                z = ((C6OK) c113505An.A00(AbstractC113545Ar.A0W)).A02;
                if (z) {
                    f = -f;
                }
                C119365at A0R = AbstractC25225BEi.A0R(AbstractC119395aw.A00(0.0f, f));
                this.A01 = z;
                this.A00 = 1;
                obj = interfaceC16620sF.invoke(A0R, this);
                if (obj == c1jx) {
                    return c1jx;
                }
            } else {
                AbstractC28290Cdc.A02("Required value was null.");
                throw C00O.createAndThrow();
            }
        }
        float A02 = C119365at.A02(((C119365at) obj).A00);
        if (z) {
            A02 = -A02;
        }
        return AbstractC25225BEi.A10(A02);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(AbstractC166987dD.A09(obj)), (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }
}
