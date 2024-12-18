package X;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Ssf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63725Ssf implements InterfaceC65557Tmd {
    public static final byte[] A00 = "Exif\u0000\u0000".getBytes(AbstractC58318PtA.A0u());
    public static final int[] A01 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0048, code lost:
    
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x004f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r18.CC5() != 255) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1 = r18.CC5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r1 == 218) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r1 == 217) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r6 = r18.CC4() - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r1 == 225) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r18.skip(r1) == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r6 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        r10 = (byte[]) r17.A04(r6, byte[].class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if (r18.E7o(r10, r6) != r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r10 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        r5 = X.C63725Ssf.A00;
        r4 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r6 <= r4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        if (r3 >= r4) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        if (r10[r3] != r5[r3]) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
    
        r1 = java.nio.ByteBuffer.wrap(r10);
        r3 = java.nio.ByteOrder.BIG_ENDIAN;
        r9 = (java.nio.ByteBuffer) r1.order(r3).limit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if ((r9.remaining() - 6) < 2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        r2 = r9.getShort(6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        if (r2 == 18761) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        if (r2 == 19789) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        r9.order(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        if ((r9.remaining() - 10) < 4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        r1 = r9.getInt(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        r6 = r1 + 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:
    
        if ((r9.remaining() - r6) < 2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ba, code lost:
    
        r5 = r9.getShort(r6);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        if (r4 >= r5) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c4, code lost:
    
        r2 = (r6 + 2) + (r4 * 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ce, code lost:
    
        if ((r9.remaining() - r2) < 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        if (r9.getShort(r2) != 274) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d8, code lost:
    
        r3 = r2 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00df, code lost:
    
        if ((r9.remaining() - r3) < 2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e1, code lost:
    
        r15 = r9.getShort(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
    
        if (r15 < 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
    
        if (r15 > 12) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ec, code lost:
    
        r3 = r2 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f3, code lost:
    
        if ((r9.remaining() - r3) < 4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f5, code lost:
    
        r3 = r9.getInt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f9, code lost:
    
        if (r3 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fb, code lost:
    
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
        r3 = r3 + X.C63725Ssf.A01[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0103, code lost:
    
        if (r3 > 4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0105, code lost:
    
        r2 = r2 + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0107, code lost:
    
        if (r2 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010d, code lost:
    
        if (r2 > r9.remaining()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010f, code lost:
    
        if (r3 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0116, code lost:
    
        if ((r3 + r2) > r9.remaining()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011d, code lost:
    
        if ((r9.remaining() - r2) < 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        r0 = r9.getShort(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012a, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0124, code lost:
    
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0127, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r2 == 18761) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0132, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c0, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x009a, code lost:
    
        r3 = java.nio.ByteOrder.LITTLE_ENDIAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x009d, code lost:
    
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x012c, code lost:
    
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0133, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0134, code lost:
    
        r17.A05(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0137, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(X.C63361SiK r17, X.InterfaceC65560Tmg r18) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63725Ssf.A00(X.SiK, X.Tmg):int");
    }

    public static int A01(InterfaceC65560Tmg interfaceC65560Tmg) {
        return (interfaceC65560Tmg.CC4() << 16) | interfaceC65560Tmg.CC4();
    }

    private ImageHeaderParser$ImageType A02(InterfaceC65560Tmg interfaceC65560Tmg) {
        try {
            int CC4 = interfaceC65560Tmg.CC4();
            if (CC4 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int CC5 = (CC4 << 8) | interfaceC65560Tmg.CC5();
            if (CC5 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int CC52 = (CC5 << 8) | interfaceC65560Tmg.CC5();
            if (CC52 == -1991225785) {
                interfaceC65560Tmg.skip(21L);
                try {
                    if (interfaceC65560Tmg.CC5() >= 3) {
                        return ImageHeaderParser$ImageType.PNG_A;
                    }
                    return ImageHeaderParser$ImageType.PNG;
                } catch (C61022Rdq unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (CC52 != 1380533830) {
                if (A01(interfaceC65560Tmg) == 1718909296) {
                    int A012 = A01(interfaceC65560Tmg);
                    if (A012 != 1635150182 && A012 != 1635150195) {
                        interfaceC65560Tmg.skip(4L);
                        int i = CC52 - 16;
                        if (i % 4 == 0) {
                            int i2 = 0;
                            while (i > 0) {
                                int A013 = A01(interfaceC65560Tmg);
                                if (A013 != 1635150182 && A013 != 1635150195) {
                                    i2++;
                                    i -= 4;
                                    if (i2 >= 5) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    return ImageHeaderParser$ImageType.AVIF;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            interfaceC65560Tmg.skip(4L);
            if (A01(interfaceC65560Tmg) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int A014 = A01(interfaceC65560Tmg);
            if ((A014 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i3 = A014 & 255;
            if (i3 == 88) {
                interfaceC65560Tmg.skip(4L);
                short CC53 = interfaceC65560Tmg.CC5();
                if ((CC53 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                if ((CC53 & 16) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            if (i3 == 76) {
                interfaceC65560Tmg.skip(4L);
                if ((interfaceC65560Tmg.CC5() & 8) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            return ImageHeaderParser$ImageType.WEBP;
        } catch (C61022Rdq unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // X.InterfaceC65557Tmd
    public final int BZf(C63361SiK c63361SiK, InputStream inputStream) {
        Rs8.A00(inputStream);
        C63850Sui c63850Sui = new C63850Sui(inputStream);
        Rs8.A00(c63361SiK);
        return A00(c63361SiK, c63850Sui);
    }

    @Override // X.InterfaceC65557Tmd
    public final int BZg(C63361SiK c63361SiK, ByteBuffer byteBuffer) {
        Rs8.A00(byteBuffer);
        C63849Suh c63849Suh = new C63849Suh(byteBuffer);
        Rs8.A00(c63361SiK);
        return A00(c63361SiK, c63849Suh);
    }

    @Override // X.InterfaceC65557Tmd
    public final ImageHeaderParser$ImageType CBI(InputStream inputStream) {
        Rs8.A00(inputStream);
        return A02(new C63850Sui(inputStream));
    }

    @Override // X.InterfaceC65557Tmd
    public final ImageHeaderParser$ImageType CBJ(ByteBuffer byteBuffer) {
        Rs8.A00(byteBuffer);
        return A02(new C63849Suh(byteBuffer));
    }
}
