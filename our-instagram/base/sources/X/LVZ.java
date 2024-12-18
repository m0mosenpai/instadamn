package X;

/* loaded from: classes8.dex */
public final class LVZ implements InterfaceC27041Tb {
    public final int A00;
    public final Object A01;

    public LVZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC27041Tb
    public final void EHB(String str, Throwable th) {
        String str2;
        switch (this.A00) {
            case 0:
                ((InterfaceC65489TlA) this.A01).EmQ("IpcExceptionFactory_DESERIALIZATION_FAILED", th);
                return;
            case 1:
                str2 = "CaaAutoConf";
                C0w9.A07(str2, th);
                return;
            case 2:
                str2 = "ConfidenceFrameworkHelper";
                C0w9.A07(str2, th);
                return;
            case 3:
                str2 = "FeO2IntegrateHelper";
                C0w9.A07(str2, th);
                return;
            default:
                str2 = "GetClientMessageBloksSignature";
                C0w9.A07(str2, th);
                return;
        }
    }
}
