package X;

import android.net.LocalSocket;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.56P, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C56P {
    public static void A00(final HeroPlayerSetting heroPlayerSetting, final String str, final AtomicReference atomicReference) {
        C2Ai c2Ai = new C2Ai() { // from class: X.56Q
            @Override // X.C2Ai
            public final String A01() {
                return "LocalSocketProxyDataSource";
            }

            @Override // X.C2Ai
            public final InterfaceC92344Bp A00(final C92304Bk c92304Bk, InterfaceC92334Bn interfaceC92334Bn, final C2BC c2bc, String str2, int i, final int i2) {
                final String str3 = str;
                final HeroPlayerSetting heroPlayerSetting2 = heroPlayerSetting;
                final AtomicReference atomicReference2 = atomicReference;
                return new InterfaceC92344Bp(c92304Bk, heroPlayerSetting2, c2bc, str3, atomicReference2, i2) { // from class: X.5Ii
                    public long A00;
                    public long A01;
                    public C4C7 A02;
                    public C2BC A03;
                    public DataInputStream A04;
                    public LocalSocket A05;
                    public OutputStream A06;
                    public Map A07;
                    public boolean A08;
                    public final Map A09 = new HashMap();
                    public final int A0A;
                    public final int A0B;
                    public final C92304Bk A0C;
                    public final HeroPlayerSetting A0D;
                    public final String A0E;
                    public final AtomicReference A0F;
                    public static final AtomicInteger A0H = new AtomicInteger();
                    public static final Pattern A0G = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

                    @Override // X.InterfaceC92354Bq
                    public final void cancel() {
                    }

                    @Override // X.InterfaceC92344Bp
                    public final void changeHttpPriority(byte b, boolean z) {
                    }

                    public static String A00(String str4, Object obj) {
                        StringBuilder sb = new StringBuilder(str4);
                        sb.append(": ");
                        sb.append(obj);
                        return sb.toString();
                    }

                    private void A01() {
                        OutputStream outputStream = this.A06;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.A06 = null;
                        DataInputStream dataInputStream = this.A04;
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.A04 = null;
                        try {
                            LocalSocket localSocket = this.A05;
                            if (localSocket != null) {
                                localSocket.close();
                            }
                        } catch (Exception unused3) {
                        }
                        this.A05 = null;
                    }

                    private void A02(String str4) {
                        OutputStream outputStream = this.A06;
                        if (outputStream != null) {
                            outputStream.write(AnonymousClass001.A0R(str4, "\r\n").getBytes());
                        }
                    }

                    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
                    public final Map getResponseHeaders() {
                        return this.A07;
                    }

                    @Override // X.InterfaceC92354Bq
                    public final android.net.Uri getUri() {
                        C4C7 c4c7 = this.A02;
                        if (c4c7 != null) {
                            return c4c7.A06;
                        }
                        return null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:101:0x02aa  */
                    /* JADX WARN: Removed duplicated region for block: B:104:0x02be  */
                    /* JADX WARN: Removed duplicated region for block: B:122:0x0315  */
                    /* JADX WARN: Removed duplicated region for block: B:125:0x031e  */
                    /* JADX WARN: Removed duplicated region for block: B:150:0x0114 A[Catch: IOException -> 0x037c, TryCatch #6 {IOException -> 0x037c, blocks: (B:38:0x00df, B:40:0x00e5, B:41:0x00e7, B:43:0x0119, B:44:0x0122, B:46:0x0126, B:48:0x012a, B:49:0x0133, B:52:0x013b, B:54:0x013f, B:56:0x0145, B:57:0x0152, B:58:0x0159, B:66:0x0185, B:68:0x01ab, B:70:0x01e4, B:71:0x01f5, B:73:0x0201, B:76:0x020b, B:78:0x0211, B:79:0x0214, B:81:0x0225, B:83:0x022f, B:85:0x024c, B:88:0x024f, B:141:0x0369, B:144:0x037b, B:143:0x0374, B:150:0x0114), top: B:37:0x00df }] */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5 A[Catch: IOException -> 0x037c, TryCatch #6 {IOException -> 0x037c, blocks: (B:38:0x00df, B:40:0x00e5, B:41:0x00e7, B:43:0x0119, B:44:0x0122, B:46:0x0126, B:48:0x012a, B:49:0x0133, B:52:0x013b, B:54:0x013f, B:56:0x0145, B:57:0x0152, B:58:0x0159, B:66:0x0185, B:68:0x01ab, B:70:0x01e4, B:71:0x01f5, B:73:0x0201, B:76:0x020b, B:78:0x0211, B:79:0x0214, B:81:0x0225, B:83:0x022f, B:85:0x024c, B:88:0x024f, B:141:0x0369, B:144:0x037b, B:143:0x0374, B:150:0x0114), top: B:37:0x00df }] */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x0119 A[Catch: IOException -> 0x037c, TryCatch #6 {IOException -> 0x037c, blocks: (B:38:0x00df, B:40:0x00e5, B:41:0x00e7, B:43:0x0119, B:44:0x0122, B:46:0x0126, B:48:0x012a, B:49:0x0133, B:52:0x013b, B:54:0x013f, B:56:0x0145, B:57:0x0152, B:58:0x0159, B:66:0x0185, B:68:0x01ab, B:70:0x01e4, B:71:0x01f5, B:73:0x0201, B:76:0x020b, B:78:0x0211, B:79:0x0214, B:81:0x0225, B:83:0x022f, B:85:0x024c, B:88:0x024f, B:141:0x0369, B:144:0x037b, B:143:0x0374, B:150:0x0114), top: B:37:0x00df }] */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final long open(X.C4C7 r24) {
                        /*
                            Method dump skipped, instructions count: 925
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C115135Ii.open(X.4C7):long");
                    }

                    @Override // X.InterfaceC92344Bp, X.InterfaceC92364Br
                    public final int read(byte[] bArr, int i3, int i4) {
                        int read;
                        try {
                            long j = this.A01;
                            if (j != -1) {
                                i4 = (int) Math.min(i4, j - this.A00);
                            }
                            if (i4 != 0) {
                                DataInputStream dataInputStream = this.A04;
                                if (dataInputStream != null && (read = dataInputStream.read(bArr, i3, i4)) != -1) {
                                    this.A00 += read;
                                    C2BC c2bc2 = this.A03;
                                    if (c2bc2 != null) {
                                        C4C7 c4c7 = this.A02;
                                        C4C7 c4c72 = C4C7.A0B;
                                        if (c4c7 == null) {
                                            c4c7 = C4C7.A0B;
                                        }
                                        c2bc2.D15(this, c4c7, read, true);
                                        return read;
                                    }
                                    return read;
                                }
                                long j2 = this.A01;
                                if (j2 != -1 && j2 != this.A00) {
                                    throw new EOFException();
                                }
                            }
                            return -1;
                        } catch (IOException e) {
                            C4C7 c4c73 = this.A02;
                            if (c4c73 == null) {
                                c4c73 = new C4C7(android.net.Uri.EMPTY, 0, -1);
                            }
                            throw new C93214Fx(c4c73, e, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 2);
                        }
                    }

                    {
                        this.A03 = c2bc;
                        this.A0E = str3;
                        this.A0A = i2;
                        this.A0B = heroPlayerSetting2.A0b;
                        this.A0D = heroPlayerSetting2;
                        this.A0F = atomicReference2;
                        this.A0C = c92304Bk;
                    }

                    @Override // X.InterfaceC92354Bq
                    public final void addTransferListener(C2BC c2bc2) {
                        c2bc2.getClass();
                        this.A03 = c2bc2;
                    }

                    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
                    public final void close() {
                        A01();
                        if (this.A08) {
                            this.A08 = false;
                            C2BC c2bc2 = this.A03;
                            if (c2bc2 != null) {
                                C4C7 c4c7 = this.A02;
                                C4C7 c4c72 = C4C7.A0B;
                                if (c4c7 == null) {
                                    c4c7 = C4C7.A0B;
                                }
                                c2bc2.Dv9(this, c4c7, true);
                            }
                        }
                    }
                };
            }
        };
        synchronized (C2Ai.class) {
            C2Ai.A00 = c2Ai;
            C2Ai.A01 = c2Ai;
        }
    }
}
