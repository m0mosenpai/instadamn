package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* renamed from: X.VKc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68265VKc {
    public static ArrayList A00(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
        order.putLong((((bArr[10] & 255) | ((bArr[11] & 255) << 8)) * 1000000000) / 48000);
        arrayList.add(order.array());
        ByteBuffer order2 = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
        order2.putLong(80000000L);
        arrayList.add(order2.array());
        return arrayList;
    }
}
