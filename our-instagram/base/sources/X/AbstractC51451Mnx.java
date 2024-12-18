package X;

import com.facebook.assistant.stella.ipc.common.request.IpcRequest;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.Mnx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51451Mnx extends IpcRequest {
    public final Class A00;

    public AbstractC51451Mnx(C52028N0a c52028N0a, Class cls) {
        super(c52028N0a, ImmutableMap.of((Object) TraceFieldType.RequestID, (Object) "", (Object) "protocol_version", (Object) Integer.valueOf(AbstractC167007dF.A1V(cls) ? 1 : 0)));
        this.A00 = cls;
    }
}
