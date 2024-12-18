package X;

import com.facebook.analytics.dsp.point.DspPointContextHelper;
import com.facebook.common.dextricks.DexStore;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.analytics.dsp.point.DspPointContextHelper", f = "DspPointContextHelper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {108, 110}, m = "suspendingUpdatePointContextForView", n = {"this", "view", "specializations", "builder", DexStore.CONFIG_FILENAME, "x", "y", "index", "this", "view", "specializations", "builder", DexStore.CONFIG_FILENAME, "x", "y", "index"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "F$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "F$1", "I$0"})
/* loaded from: classes4.dex */
public final class B59 extends C1Dq {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ DspPointContextHelper A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B59(DspPointContextHelper dspPointContextHelper, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0A = dspPointContextHelper;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A09 = obj;
        this.A03 |= Integer.MIN_VALUE;
        return this.A0A.A02(null, null, null, null, this, 0.0f, 0.0f);
    }
}
