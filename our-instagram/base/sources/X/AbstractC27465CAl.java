package X;

/* renamed from: X.CAl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27465CAl {
    public static final int A00(C6M3 c6m3, InterfaceC58206PrC interfaceC58206PrC) {
        long j;
        C6M3 c6m32 = C6M3.Vertical;
        long j2 = ((C28760Cms) interfaceC58206PrC).A05;
        if (c6m3 == c6m32) {
            j = j2 & 4294967295L;
        } else {
            j = j2 >> 32;
        }
        return (int) j;
    }
}
