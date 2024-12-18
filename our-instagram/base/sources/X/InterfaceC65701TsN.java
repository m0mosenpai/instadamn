package X;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* renamed from: X.TsN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC65701TsN extends InterfaceC65677Tr7, ReadableByteChannel {
    @Deprecated
    TWX AEK();

    boolean ATd();

    TWX Aid();

    long CNM(byte b);

    long CNO(C64531TIl c64531TIl);

    InputStream COZ();

    byte[] E7v(long j);

    C64531TIl E7w(long j);

    void E87(TWX twx, long j);

    long E89();

    int E8C();

    short E8Q();

    String E8U();

    String E8V(long j);

    boolean EIz(long j);

    void EJO(long j);

    int EMo(TZE tze);

    void Em6(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    static int A00(InterfaceC65701TsN interfaceC65701TsN) {
        return interfaceC65701TsN.readByte() & 255;
    }
}
