package X;

import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes9.dex */
public final class OTL {
    public final long A00;
    public final byte[] A01;

    public OTL(RandomAccessFile randomAccessFile) {
        long filePointer = randomAccessFile.getFilePointer();
        this.A00 = filePointer;
        long readInt = randomAccessFile.readInt();
        if (readInt == 0) {
            readInt = randomAccessFile.length() - filePointer;
        } else if (readInt == 1) {
            readInt = randomAccessFile.readLong();
        }
        byte[] bArr = new byte[4];
        this.A01 = bArr;
        randomAccessFile.readFully(bArr);
        randomAccessFile.seek(filePointer + readInt);
    }

    public static OTL A00(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.getFilePointer() < randomAccessFile.length() - 8) {
            byte[] bArr = new byte[4];
            randomAccessFile.skipBytes(4);
            randomAccessFile.readFully(bArr);
            String str = new String(bArr);
            randomAccessFile.seek(randomAccessFile.getFilePointer() - 8);
            Package r0 = OTL.class.getPackage();
            r0.getClass();
            try {
                return (OTL) Class.forName(AnonymousClass001.A0g(r0.getName(), ".", str.toUpperCase())).getConstructor(RandomAccessFile.class).newInstance(randomAccessFile);
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
                return new OTL(randomAccessFile);
            }
        }
        return null;
    }
}
