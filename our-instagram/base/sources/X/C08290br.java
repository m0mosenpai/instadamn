package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.intent.IntentModule;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08290br implements C0XS {
    public int A00 = 1;
    public C07150Zn A01;
    public C07310a5 A02;
    public IntBuffer A03;
    public final int A04;
    public final int A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC08830cm A07;

    @Override // X.InterfaceC06740Xq
    public final synchronized void EET(int i, int i2, String str, int i3) {
        C07310a5 c07310a5;
        int A00 = A00(str, i, i2);
        if (A00 != -1 && (c07310a5 = this.A02) != null) {
            ByteBuffer byteBuffer = C07310a5.A04;
            byteBuffer.position(0);
            byteBuffer.putInt(i3);
            A01(i, str, C07310a5.A00(c07310a5, str, byteBuffer.array(), A00, 1));
        }
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EEU(int i, int i2, String str, String str2) {
        C07310a5 c07310a5;
        int A00 = A00(str, i, i2);
        if (A00 != -1 && (c07310a5 = this.A02) != null) {
            if (str2 == null) {
                str2 = "null";
            }
            A01(i, str, C07310a5.A00(c07310a5, str, str2.getBytes(), A00, 0));
        }
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EEW(int i, int i2) {
        C07150Zn c07150Zn = this.A01;
        if (c07150Zn != null) {
            c07150Zn.A01(i, i2);
        }
    }

    @Override // X.InterfaceC06740Xq
    public final void EEX(int i, int i2, String str) {
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EEY(int i, int i2, boolean z) {
        InterfaceC08830cm interfaceC08830cm;
        C07150Zn c07150Zn = this.A01;
        if (c07150Zn != null) {
            int i3 = this.A00 + 1;
            this.A00 = i3;
            if ((1879048192 & i3) != 0) {
                this.A00 = 1;
                i3 = 1;
            }
            if (z) {
                i3 |= Integer.MIN_VALUE;
            }
            int A03 = c07150Zn.A03(i, i2, i3);
            if (A03 != 0 && (interfaceC08830cm = this.A06) != null) {
                ((C10390h6) interfaceC08830cm.get()).A00.A06(TimeUnit.NANOSECONDS, new int[]{A03, 2, ((this.A05 / 4) / 3) / 2, this.A04}, new int[]{2, 2, 2, 2}, new String[]{"markerId", "storage_version", "map_size", "data_buffer_size"}, 27791348);
            }
        }
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EEZ() {
        C07150Zn c07150Zn = this.A01;
        if (c07150Zn != null) {
            IntBuffer intBuffer = c07150Zn.A01;
            intBuffer.position(0);
            int i = 0;
            do {
                int i2 = 0;
                while (true) {
                    int i3 = c07150Zn.A00;
                    if (i2 >= i3) {
                        break;
                    }
                    int i4 = intBuffer.get();
                    intBuffer.get();
                    int i5 = intBuffer.get();
                    if (i4 != 0 && i5 != 0 && (i5 & Integer.MIN_VALUE) != 0) {
                        int position = intBuffer.position();
                        intBuffer.position(((i * i3) + i2) * 3);
                        intBuffer.put(C07150Zn.A02);
                        intBuffer.position(position);
                    }
                    i2++;
                }
                i++;
            } while (i < 2);
        }
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EEa(int i, int i2, boolean z) {
        int A01;
        C07150Zn c07150Zn = this.A01;
        if (c07150Zn != null && (A01 = c07150Zn.A01(i, i2)) != 0) {
            int i3 = A01 & 268435455;
            int i4 = (A01 & 1879048192) >>> 28;
            C07150Zn c07150Zn2 = this.A01;
            int i5 = i3 | (i4 << 28);
            if (z) {
                i5 |= Integer.MIN_VALUE;
            }
            c07150Zn2.A03(i, i2, i5);
        }
    }

    @Override // X.InterfaceC06740Xq
    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
    }

    private int A00(String str, int i, int i2) {
        C07150Zn c07150Zn = this.A01;
        if (c07150Zn != null) {
            int i3 = 0;
            while (true) {
                int A02 = ((c07150Zn.A00 * i3) + c07150Zn.A02(i, i2, i3)) * 3;
                IntBuffer intBuffer = c07150Zn.A01;
                intBuffer.position(A02);
                int i4 = intBuffer.get();
                int i5 = intBuffer.get();
                if (i == i4 && i2 == i5) {
                    int i6 = intBuffer.get();
                    if (i6 != 0) {
                        int i7 = (1879048192 & i6) >>> 28;
                        if (i7 >= 5) {
                            InterfaceC08830cm interfaceC08830cm = this.A06;
                            if (interfaceC08830cm != null) {
                                ((C10390h6) interfaceC08830cm.get()).A02(i, str, "exceeded number of annotations per event");
                            }
                        } else {
                            int i8 = i6 & 268435455;
                            boolean z = false;
                            if ((i6 & Integer.MIN_VALUE) != 0) {
                                z = true;
                            }
                            C07150Zn c07150Zn2 = this.A01;
                            int i9 = ((i7 + 1) << 28) | i8;
                            if (z) {
                                i9 |= Integer.MIN_VALUE;
                            }
                            c07150Zn2.A03(i, i2, i9);
                            return i8;
                        }
                    }
                } else {
                    i3++;
                    if (i3 >= 2) {
                        break;
                    }
                }
            }
        }
        return -1;
    }

    private void A01(int i, String str, int i2) {
        InterfaceC08830cm interfaceC08830cm = this.A06;
        if (interfaceC08830cm != null) {
            if ((i2 & 2) != 0) {
                ((C10390h6) interfaceC08830cm.get()).A03(i, str, "key");
            }
            if ((i2 & 4) != 0) {
                ((C10390h6) interfaceC08830cm.get()).A03(i, str, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c0, code lost:
    
        throw new java.lang.RuntimeException(X.AnonymousClass001.A0O("Unsupported type: ", r1));
     */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0a4, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C07260a0[] A02(X.C07190Zs r17, java.io.RandomAccessFile r18, long r19, long r21) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08290br.A02(X.0Zs, java.io.RandomAccessFile, long, long):X.0a0[]");
    }

    public C08290br(InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, int i, int i2) {
        this.A05 = i * 2 * 3 * 4;
        this.A04 = i2;
        this.A06 = interfaceC08830cm;
        this.A07 = interfaceC08830cm2;
    }

    @Override // X.C0XS
    public final void CON(File file, String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AnonymousClass001.A0u(file.getAbsolutePath(), "/", "qpl_v2_", str), "rw");
            try {
                synchronized (this) {
                    int i = this.A05;
                    int i2 = i + 16;
                    try {
                        randomAccessFile.seek(0L);
                        randomAccessFile.writeInt(3);
                        randomAccessFile.writeInt(i2);
                        randomAccessFile.writeInt(-1);
                        randomAccessFile.writeInt(-1);
                        FileChannel channel = randomAccessFile.getChannel();
                        FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                        this.A03 = channel.map(mapMode, 0L, 16L).asIntBuffer();
                        if (i > 0) {
                            this.A01 = new C07150Zn(randomAccessFile.getChannel().map(mapMode, 16L, i));
                        }
                        int i3 = this.A04;
                        if (i3 > 12) {
                            this.A02 = new C07310a5(randomAccessFile.getChannel().map(mapMode, i2, i3), i3);
                        }
                    } catch (IOException unused) {
                    }
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (IOException unused2) {
        }
    }

    @Override // X.InterfaceC06740Xq
    public final void EEV(int i, int i2) {
        EEW(i, i2);
    }
}
