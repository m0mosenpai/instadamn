package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39611sj extends C1AI {
    public int A00;
    public int A01;
    public int A02;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.1AI, X.1sj] */
    public static C39611sj A01(ByteBuffer byteBuffer) {
        ?? obj = new Object();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        obj.A00 = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        obj.A01 = byteBuffer;
        int A02 = obj.A02(8) + obj.A00;
        obj.A02 = A02 + obj.A01.getInt(A02);
        int A022 = obj.A02(14) + obj.A00;
        obj.A00 = A022 + obj.A01.getInt(A022);
        int A023 = obj.A02(20) + obj.A00;
        obj.A01 = A023 + obj.A01.getInt(A023);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.XYl, X.1AI] */
    public final C72215XYl A06(int i) {
        ?? obj = new Object();
        int A02 = A02(26);
        if (A02 != 0) {
            int A03 = A03(A02) + (i * 4);
            int i2 = A03 + super.A01.getInt(A03);
            ByteBuffer byteBuffer = super.A01;
            obj.A00 = i2;
            obj.A01 = byteBuffer;
            return obj;
        }
        return null;
    }
}
