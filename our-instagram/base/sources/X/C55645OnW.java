package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.devxagent.gen.DevXAgentAppProxy;

/* renamed from: X.OnW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55645OnW implements C2N9 {
    @Override // X.C2N9
    public final Class BUQ() {
        return DevXAgentAppProxy.class;
    }

    @Override // X.C2N9
    public final long CBx() {
        long j = DevXAgentAppProxy.CProxy.sMcfTypeId;
        if (j == 0) {
            long nativeGetMcfTypeId = DevXAgentAppProxy.CProxy.nativeGetMcfTypeId();
            DevXAgentAppProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId;
            return nativeGetMcfTypeId;
        }
        return j;
    }

    @Override // X.C2N9
    public final /* bridge */ /* synthetic */ Object AJz(McfReference mcfReference) {
        return DevXAgentAppProxy.CProxy.createFromMcfType(mcfReference);
    }
}
