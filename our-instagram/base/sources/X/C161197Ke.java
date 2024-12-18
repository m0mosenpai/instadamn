package X;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.7Ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161197Ke implements InterfaceC58742mX {
    public static final C161197Ke A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.68V, java.lang.Object] */
    @Override // X.InterfaceC58742mX
    public final /* bridge */ /* synthetic */ Object AK1(File file) {
        if (file == null) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) file.length());
                while (channel.position() < channel.size()) {
                    channel.read(allocateDirect);
                }
                allocateDirect.flip();
                channel.close();
                fileInputStream.close();
                return new Object().A00(allocateDirect);
            } finally {
            }
        } finally {
        }
    }
}
