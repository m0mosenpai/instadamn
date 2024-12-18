package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class MUT {
    public final long A00;
    public final AtomicLong A01;
    public final AtomicReference A02 = new AtomicReference(AbstractC166997dE.A0n());
    public final AtomicReference A03 = new AtomicReference(AbstractC166997dE.A0n());

    public MUT(long j, long j2) {
        this.A00 = j;
        this.A01 = new AtomicLong(j2);
    }

    public static String A00(InterfaceC09390do interfaceC09390do) {
        Object obj = ((MUT) interfaceC09390do.getValue()).A03.get();
        C14360o3.A07(obj);
        return (String) obj;
    }

    public static String A01(InterfaceC09390do interfaceC09390do) {
        Object obj = ((MUT) interfaceC09390do.getValue()).A02.get();
        C14360o3.A07(obj);
        return (String) obj;
    }
}
