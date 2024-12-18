package X;

import com.facebook.wearable.datax.Connection;
import java.nio.ByteBuffer;

/* renamed from: X.XoB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72823XoB {
    public final /* synthetic */ Connection A00;

    public C72823XoB(Connection connection) {
        this.A00 = connection;
    }

    public final ByteBuffer A00() {
        int pollReceiveFragmentNative;
        int pollReceiveFragmentNative2;
        int pollReceiveFragmentNative3;
        int pollReceiveFragmentNative4;
        Connection connection = this.A00;
        Xh8 xh8 = Connection.Companion;
        pollReceiveFragmentNative = connection.pollReceiveFragmentNative(connection.f2native.A00(), null, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pollReceiveFragmentNative);
        C14360o3.A0A(allocateDirect);
        C14360o3.A0B(allocateDirect, 0);
        int remaining = allocateDirect.remaining();
        pollReceiveFragmentNative2 = connection.pollReceiveFragmentNative(connection.f2native.A00(), null, 0);
        if (remaining >= pollReceiveFragmentNative2) {
            pollReceiveFragmentNative4 = connection.pollReceiveFragmentNative(connection.f2native.A00(), allocateDirect, allocateDirect.position());
            allocateDirect.position(allocateDirect.position() + pollReceiveFragmentNative4);
            allocateDirect.flip();
            return allocateDirect;
        }
        int remaining2 = allocateDirect.remaining();
        pollReceiveFragmentNative3 = connection.pollReceiveFragmentNative(connection.f2native.A00(), null, 0);
        throw AbstractC166987dD.A14(AnonymousClass001.A02(remaining2, pollReceiveFragmentNative3, "Buffer remaining space is to small ", " < "));
    }
}
