package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.devxagent.gen.DevXAgentCallStartParams;

/* renamed from: X.OnX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55646OnX implements C2N9 {
    @Override // X.C2N9
    public final Class BUQ() {
        return DevXAgentCallStartParams.class;
    }

    @Override // X.C2N9
    public final long CBx() {
        long j = DevXAgentCallStartParams.sMcfTypeId;
        if (j == 0) {
            long nativeGetMcfTypeId = DevXAgentCallStartParams.nativeGetMcfTypeId();
            DevXAgentCallStartParams.sMcfTypeId = nativeGetMcfTypeId;
            return nativeGetMcfTypeId;
        }
        return j;
    }

    @Override // X.C2N9
    public final /* bridge */ /* synthetic */ Object AJz(McfReference mcfReference) {
        return DevXAgentCallStartParams.createFromMcfType(mcfReference);
    }
}
