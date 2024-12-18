package X;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0Tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06050Tu extends AbstractC14760oq implements InterfaceC14780os {
    public int A00;

    @Override // X.InterfaceC14780os
    public final InputStream BI5(final InputStream inputStream) {
        final int i = this.A00;
        return new InputStream(inputStream, i) { // from class: X.0zj
            public DataInputStream A01;
            public C12780lQ A03;
            public boolean A05;
            public final C20530zV A08;
            public final C12740lL A09 = new C12740lL();
            public int A00 = 0;
            public boolean A06 = true;
            public boolean A07 = true;
            public boolean A04 = false;
            public IOException A02 = null;

            {
                this.A01 = new DataInputStream(inputStream);
                if (i >= 4096 && i <= 2147483632) {
                    this.A08 = new C20530zV((i + 15) & (-16));
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unsupported dictionary size ");
                stringBuffer.append(i);
                throw new IllegalArgumentException(stringBuffer.toString());
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                DataInputStream dataInputStream = this.A01;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } finally {
                        this.A01 = null;
                    }
                }
            }

            @Override // java.io.InputStream
            public final int read() {
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) != -1) {
                    return bArr[0] & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public final int available() {
                if (this.A01 != null) {
                    IOException iOException = this.A02;
                    if (iOException == null) {
                        return this.A00;
                    }
                    throw iOException;
                }
                throw new IOException("Stream closed");
            }

            /* JADX WARN: Removed duplicated region for block: B:186:0x023d A[Catch: IOException -> 0x0368, TryCatch #0 {IOException -> 0x0368, blocks: (B:19:0x0028, B:21:0x002c, B:23:0x0035, B:24:0x0037, B:33:0x0044, B:76:0x0048, B:199:0x0360, B:37:0x0068, B:39:0x0087, B:41:0x0091, B:43:0x00a2, B:44:0x00ad, B:46:0x00b4, B:48:0x00ba, B:50:0x00de, B:53:0x00e5, B:56:0x00ec, B:59:0x00f3, B:61:0x00d0, B:65:0x00d8, B:67:0x00fa, B:71:0x0104, B:73:0x0112, B:78:0x004f, B:79:0x0119, B:81:0x0123, B:83:0x013e, B:84:0x0140, B:86:0x0148, B:87:0x014b, B:89:0x015f, B:91:0x0167, B:93:0x016b, B:96:0x016f, B:103:0x0176, B:105:0x0182, B:106:0x0184, B:108:0x018e, B:110:0x0193, B:112:0x0199, B:168:0x01ac, B:170:0x01b9, B:171:0x01bd, B:176:0x01e5, B:178:0x01f3, B:179:0x01f7, B:180:0x0200, B:184:0x022c, B:186:0x023d, B:187:0x023f, B:190:0x021d, B:115:0x0244, B:117:0x024c, B:119:0x026f, B:120:0x0271, B:121:0x0274, B:124:0x027e, B:126:0x0282, B:128:0x0292, B:129:0x029b, B:133:0x02ed, B:134:0x02ad, B:135:0x02b0, B:138:0x02ce, B:139:0x02da, B:144:0x02ef, B:145:0x032c, B:149:0x02f2, B:151:0x02fb, B:156:0x030c, B:157:0x0323, B:158:0x0310, B:160:0x0318, B:161:0x031c, B:162:0x0336, B:164:0x0341, B:165:0x0343, B:166:0x0348, B:195:0x0350, B:198:0x035b), top: B:18:0x0028 }] */
            @Override // java.io.InputStream
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int read(byte[] r24, int r25, int r26) {
                /*
                    Method dump skipped, instructions count: 891
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20640zj.read(byte[], int, int):int");
            }
        };
    }

    @Override // X.InterfaceC14780os
    public final int BSI() {
        int i = this.A00;
        if (i >= 4096 && i <= 2147483632) {
            return (((i + 15) & (-16)) / 1024) + 104;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unsupported dictionary size ");
        stringBuffer.append(i);
        throw new IllegalArgumentException(stringBuffer.toString());
    }
}
