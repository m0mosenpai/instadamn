package X;

import java.nio.ByteBuffer;

/* renamed from: X.2f5, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2f5 {
    public int A00;
    public int A01;
    public int A02;
    public C2f6 A03;
    public ByteBuffer A04;

    public final int A00(int i) {
        if (i < this.A01) {
            return this.A04.getShort(this.A02 + i);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2f6, java.lang.Object] */
    public C2f5() {
        C2f6 c2f6 = C2f6.A00;
        C2f6 c2f62 = c2f6;
        if (c2f6 == null) {
            ?? obj = new Object();
            C2f6.A00 = obj;
            c2f62 = obj;
        }
        this.A03 = c2f62;
    }
}
