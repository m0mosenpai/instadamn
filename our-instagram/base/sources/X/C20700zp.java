package X;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tukaani.xz.BCJDecoder;

/* renamed from: X.0zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20700zp extends InputStream {
    public long A00;
    public long A02;
    public InputStream A03;
    public long A04;
    public final int A06;
    public final DataInputStream A07;
    public final C20690zo A08;
    public final AbstractC20580zb A09;
    public final InputStream A0A;
    public long A01 = 0;
    public boolean A05 = false;

    @Override // java.io.InputStream
    public final int available() {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != -1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0os] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0os] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0zm[], X.0os[]] */
    /* JADX WARN: Type inference failed for: r7v3, types: [org.tukaani.xz.BCJDecoder] */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.0Tv] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.0Tu, java.lang.Object] */
    public C20700zp(InputStream inputStream, AbstractC20580zb abstractC20580zb, int i) {
        ?? bCJDecoder;
        this.A02 = -1L;
        this.A00 = -1L;
        this.A0A = inputStream;
        this.A09 = abstractC20580zb;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A07 = dataInputStream;
        byte[] bArr = new byte[1024];
        dataInputStream.readFully(bArr, 0, 1);
        byte b = bArr[0];
        if (b != 0) {
            int i2 = ((b & 255) + 1) * 4;
            this.A06 = i2;
            dataInputStream.readFully(bArr, 1, i2 - 1);
            int i3 = i2 - 4;
            if (AbstractC14030nT.A01(bArr, 0, i3, i3)) {
                int i4 = bArr[1];
                if ((i4 & 60) == 0) {
                    int i5 = (i4 & 3) + 1;
                    long[] jArr = new long[i5];
                    byte[][] bArr2 = new byte[i5];
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i2 - 6);
                    try {
                        this.A04 = (9223372036854775804L - i2) - abstractC20580zb.A00;
                        if ((bArr[1] & 64) != 0) {
                            long A00 = AbstractC14030nT.A00(byteArrayInputStream);
                            this.A00 = A00;
                            if (A00 != 0 && A00 <= this.A04) {
                                this.A04 = A00;
                            } else {
                                throw new C14800ou();
                            }
                        }
                        if ((bArr[1] & 128) != 0) {
                            this.A02 = AbstractC14030nT.A00(byteArrayInputStream);
                        }
                        for (int i6 = 0; i6 < i5; i6++) {
                            jArr[i6] = AbstractC14030nT.A00(byteArrayInputStream);
                            long A002 = AbstractC14030nT.A00(byteArrayInputStream);
                            if (A002 <= byteArrayInputStream.available()) {
                                byte[] bArr3 = new byte[(int) A002];
                                bArr2[i6] = bArr3;
                                byteArrayInputStream.read(bArr3);
                            } else {
                                throw new C14800ou();
                            }
                        }
                        for (int available = byteArrayInputStream.available(); available > 0; available--) {
                            if (byteArrayInputStream.read() != 0) {
                                throw new IOException("Unsupported options in XZ Block Header");
                            }
                        }
                        ?? r3 = new InterfaceC14780os[i5];
                        for (int i7 = 0; i7 < i5; i7++) {
                            long j = jArr[i7];
                            if (j == 33) {
                                byte[] bArr4 = bArr2[i7];
                                bCJDecoder = new Object();
                                if (bArr4.length == 1) {
                                    byte b2 = bArr4[0];
                                    if ((b2 & 255) <= 37) {
                                        bCJDecoder.A00 = ((b2 & 1) | 2) << ((b2 >>> 1) + 11);
                                    }
                                }
                                throw new IOException("Unsupported LZMA2 properties");
                            }
                            if (j == 3) {
                                bCJDecoder = new C06060Tv(bArr2[i7]);
                            } else {
                                BCJDecoder bCJDecoder2 = BCJDecoder.$redex_init_class;
                                if (j >= 4 && j <= 9) {
                                    bCJDecoder = new BCJDecoder(jArr[i7], bArr2[i7]);
                                } else {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append("Unknown Filter ID ");
                                    stringBuffer.append(jArr[i7]);
                                    throw new IOException(stringBuffer.toString());
                                }
                            }
                            r3[i7] = bCJDecoder;
                        }
                        AbstractC20630zi.A00(r3);
                        if (i >= 0) {
                            int i8 = 0;
                            for (int i9 = 0; i9 < i5; i9++) {
                                i8 += r3[i9].BSI();
                            }
                            if (i8 > i) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("");
                                stringBuffer2.append(i8);
                                stringBuffer2.append(" KiB of memory would be needed; limit was ");
                                stringBuffer2.append(0);
                                stringBuffer2.append(" KiB");
                                throw new IOException(stringBuffer2.toString());
                            }
                        }
                        C20690zo c20690zo = new C20690zo(inputStream);
                        this.A08 = c20690zo;
                        this.A03 = c20690zo;
                        int i10 = i5 - 1;
                        C20690zo c20690zo2 = c20690zo;
                        while (i10 >= 0) {
                            ?? BI5 = r3[i10].BI5(c20690zo2);
                            this.A03 = BI5;
                            i10--;
                            c20690zo2 = BI5;
                        }
                        return;
                    } catch (IOException unused) {
                        throw new IOException("XZ Block Header is corrupt");
                    }
                }
                throw new IOException("Unsupported options in XZ Block Header");
            }
            throw new IOException("XZ Block Header is corrupt");
        }
        throw new Exception();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0056, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r15, int r16, int r17) {
        /*
            r14 = this;
            boolean r0 = r14.A05
            r9 = -1
            if (r0 == 0) goto L6
            return r9
        L6:
            java.io.InputStream r8 = r14.A03
            r10 = r17
            r1 = r16
            int r7 = r8.read(r15, r1, r10)
            r6 = 1
            if (r7 <= 0) goto L56
            X.0zb r0 = r14.A09
            r0.A00(r15, r1, r7)
            long r4 = r14.A01
            long r0 = (long) r7
            long r4 = r4 + r0
            r14.A01 = r4
            X.0zo r0 = r14.A08
            long r2 = r0.A00
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 < 0) goto L50
            long r0 = r14.A04
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L50
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 < 0) goto L50
            long r0 = r14.A02
            r11 = -1
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L3e
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L50
        L3e:
            if (r7 < r10) goto L44
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Lad
        L44:
            int r0 = r8.read()
            if (r0 == r9) goto L58
            X.0ou r0 = new X.0ou
            r0.<init>()
            throw r0
        L50:
            X.0ou r0 = new X.0ou
            r0.<init>()
            throw r0
        L56:
            if (r7 != r9) goto Lad
        L58:
            X.0zo r0 = r14.A08
            long r3 = r0.A00
            long r1 = r14.A00
            r10 = -1
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L68
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L90
        L68:
            long r8 = r14.A02
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L74
            long r0 = r14.A01
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L90
        L74:
            r8 = 1
            long r8 = r8 + r3
            r0 = 3
            long r3 = r3 & r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L96
            java.io.DataInputStream r0 = r14.A07
            int r0 = r0.readUnsignedByte()
            if (r0 != 0) goto L8a
            r3 = r8
            goto L74
        L8a:
            X.0ou r0 = new X.0ou
            r0.<init>()
            throw r0
        L90:
            X.0ou r0 = new X.0ou
            r0.<init>()
            throw r0
        L96:
            X.0zb r2 = r14.A09
            int r0 = r2.A00
            byte[] r1 = new byte[r0]
            java.io.DataInputStream r0 = r14.A07
            r0.readFully(r1)
            byte[] r0 = r2.A01()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto Lae
            r14.A05 = r6
        Lad:
            return r7
        Lae:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r0 = "Integrity check ("
            r1.append(r0)
            java.lang.String r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ") does not match"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.0ou r0 = new X.0ou
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20700zp.read(byte[], int, int):int");
    }
}
