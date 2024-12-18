package X;

import java.util.UUID;

/* renamed from: X.Wbe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70521Wbe implements InterfaceC71904X9o {
    @Override // X.InterfaceC71904X9o
    public final InterfaceC72005XEt A7M(UUID uuid) {
        InterfaceC71904X9o interfaceC71904X9o = C70524Wbh.A03;
        AbstractC05810Sj.A00(interfaceC71904X9o);
        InterfaceC72005XEt A7M = interfaceC71904X9o.A7M(uuid);
        AbstractC05810Sj.A00(A7M);
        if (!"L3".isEmpty()) {
            try {
                A7M.Ebr("securityLevel", "L3");
            } catch (Exception unused) {
            }
        }
        return A7M;
    }
}
