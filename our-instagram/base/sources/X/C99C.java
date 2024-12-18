package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.99C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C99C {
    public static final C99E A01;
    public final boolean A00;

    public final C99E A00(EnumC92794Ds enumC92794Ds) {
        C14360o3.A0B(enumC92794Ds, 0);
        if (!this.A00) {
            return null;
        }
        if (enumC92794Ds == EnumC92794Ds.A04) {
            return A01;
        }
        return C99E.A00;
    }

    public C99C(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.99E, X.99D, java.lang.Object] */
    static {
        ?? obj = new Object();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong(3735928559L);
        obj.A00 = allocate.array();
        A01 = obj;
    }
}
