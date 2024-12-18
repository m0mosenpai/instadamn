package X;

import com.instagram.genai.imageutils.MaskUtilsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.genai.imageutils.MaskUtilsKt", f = "MaskUtils.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {191, 192}, m = "dilateErode", n = {"$this$dilateErode", "blockName$iv", "dilateTimes", "isTracing$iv", "cookie$iv", "$this$dilateErode", "blockName$iv", "isTracing$iv", "cookie$iv"}, s = {"L$0", "L$1", "I$0", "Z$0", "I$1", "L$0", "L$1", "Z$0", "I$0"})
/* loaded from: classes9.dex */
public final class PWN extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public /* synthetic */ Object A06;

    public PWN(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A02 |= Integer.MIN_VALUE;
        return MaskUtilsKt.A09(null, this, 0);
    }
}
