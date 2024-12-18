package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.4UE, reason: invalid class name */
/* loaded from: classes2.dex */
public interface C4UE {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    C4UJ AJ5(C4UJ c4uj);

    ByteBuffer BaE();

    boolean CTt();

    void E7Y();

    void E7Z(ByteBuffer byteBuffer);

    void flush();

    boolean isActive();

    void reset();
}
