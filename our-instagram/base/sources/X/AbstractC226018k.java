package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.18k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC226018k extends AbstractC226118l {
    public static final MappedByteBuffer A00(String str) {
        File file = new File(str);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                try {
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    String A00 = C1AE.A00(map, (int) file.length());
                    if (!A00.isEmpty()) {
                        C0K8.A0P("MobileConfigMmapHandle", "Cannot validate \"%s\", err:%s", str, A00);
                        channel.close();
                        fileInputStream.close();
                        return null;
                    }
                    channel.close();
                    fileInputStream.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            C0K8.A0M("MobileConfigMmapHandle", "Cannot open \"%s\"", e, str);
            return null;
        }
    }
}
