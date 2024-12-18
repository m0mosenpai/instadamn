package X;

import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.SFl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62534SFl {
    public final FileInputStream A00;
    public final MappedByteBuffer A01;
    public final FileChannel A02;

    public C62534SFl(FileInputStream fileInputStream, MappedByteBuffer mappedByteBuffer, FileChannel fileChannel) {
        C14360o3.A0B(mappedByteBuffer, 1);
        this.A01 = mappedByteBuffer;
        this.A02 = fileChannel;
        this.A00 = fileInputStream;
    }
}
