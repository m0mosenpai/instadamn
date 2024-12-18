package X;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* renamed from: X.Pae, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC57194Pae extends CLV {
    public static final void A07(File file, String str, Charset charset) {
        int i;
        C14360o3.A0B(file, 0);
        FileOutputStream A0x = MSW.A0x(file);
        try {
            int length = str.length();
            if (length < 16384) {
                byte[] bytes = str.getBytes(charset);
                C14360o3.A07(bytes);
                A0x.write(bytes);
            } else {
                CharsetEncoder newEncoder = charset.newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                CharBuffer allocate = CharBuffer.allocate(8192);
                C14360o3.A0A(onUnmappableCharacter);
                C14360o3.A0B(onUnmappableCharacter, 1);
                ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
                C14360o3.A07(allocate2);
                int i2 = 0;
                int i3 = 0;
                do {
                    int min = Math.min(8192 - i3, length - i2);
                    i = i2 + min;
                    char[] array = allocate.array();
                    C14360o3.A07(array);
                    str.getChars(i2, i, array, i3);
                    allocate.limit(min + i3);
                    i3 = 1;
                    if (onUnmappableCharacter.encode(allocate, allocate2, AbstractC167007dF.A1P(i, length)).isUnderflow()) {
                        A0x.write(allocate2.array(), 0, allocate2.position());
                        if (allocate.position() != allocate.limit()) {
                            allocate.put(0, allocate.get());
                        } else {
                            i3 = 0;
                        }
                        allocate.clear();
                        allocate2.clear();
                        i2 = i;
                    } else {
                        throw AbstractC31172DnG.A0u();
                    }
                } while (i < length);
            }
            A0x.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C20I.A00(A0x, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.OutputStream, X.Ndy, java.io.ByteArrayOutputStream] */
    public static final byte[] A09(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                    C14360o3.A07(bArr);
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ?? byteArrayOutputStream = new ByteArrayOutputStream(8193);
                        byteArrayOutputStream.write(read2);
                        AbstractC54919OQu.A00(fileInputStream, byteArrayOutputStream);
                        int size = byteArrayOutputStream.size() + i;
                        if (size >= 0) {
                            byte[] A00 = byteArrayOutputStream.A00();
                            bArr = Arrays.copyOf(bArr, size);
                            C14360o3.A07(bArr);
                            System.arraycopy(A00, 0, bArr, i, byteArrayOutputStream.size());
                        } else {
                            StringBuilder A11 = AbstractC166997dE.A11("File ");
                            A11.append(file);
                            throw new OutOfMemoryError(AbstractC166997dE.A0x(" is too big to fit in memory.", A11));
                        }
                    }
                }
                fileInputStream.close();
                return bArr;
            }
            StringBuilder A112 = AbstractC166997dE.A11("File ");
            A112.append(file);
            A112.append(" is too big (");
            A112.append(length);
            throw new OutOfMemoryError(AbstractC166997dE.A0x(" bytes) to fit in memory.", A112));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C20I.A00(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final String A06(File file, Charset charset) {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String A00 = AbstractC38581qm.A00(inputStreamReader);
            inputStreamReader.close();
            return A00;
        } finally {
        }
    }

    public static final void A08(File file, Charset charset, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC38581qm.A01(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), interfaceC16660sJ);
    }
}
