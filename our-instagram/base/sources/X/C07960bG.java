package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.0bG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07960bG implements InterfaceC04640Mg {
    public static final Map A0I;
    public long A03;
    public C0Mo A04;
    public Boolean A05;
    public ScheduledExecutorService A06;
    public ScheduledFuture A07;
    public boolean A08;
    public boolean A09;
    public final C0AK A0A;
    public final C07920bC A0D;
    public final RunnableC05150Ph A0E;
    public final short A0G;
    public int A01 = Integer.MAX_VALUE;
    public int A02 = Integer.MAX_VALUE;
    public int A00 = 0;
    public final C11530jC A0B = new C11530jC(this);
    public final C08200bi A0C = new C08200bi(this);
    public final Runnable A0F = new Runnable() { // from class: X.0Mf
        @Override // java.lang.Runnable
        public final void run() {
            ScheduledFuture scheduledFuture;
            C07960bG c07960bG = C07960bG.this;
            synchronized (c07960bG) {
                if (c07960bG.A0D != null) {
                    C07960bG.A00(c07960bG);
                    Boolean bool = c07960bG.A05;
                    if (bool != null && !bool.booleanValue() && (scheduledFuture = c07960bG.A07) != null) {
                        scheduledFuture.cancel(false);
                        c07960bG.A07 = null;
                    }
                }
            }
        }
    };
    public final InterfaceC04680Mk A0H = new InterfaceC04680Mk() { // from class: X.0be
        @Override // X.InterfaceC04680Mk
        public final byte AjS(int i) {
            if (i == 2) {
                return (byte) 0;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0O("Not a byte field: ", i));
        }

        @Override // X.InterfaceC04680Mk
        public final int BYD() {
            return 3;
        }

        @Override // X.InterfaceC04680Mk
        public final short Bus(int i) {
            if (i == 1) {
                return C07960bG.this.A0G;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0O("Not a short field: ", i));
        }

        @Override // X.InterfaceC04680Mk
        public final int Bxh(int i) {
            int i2 = 4;
            if (i != 0) {
                i2 = 2;
                if (i != 1) {
                    if (i == 2) {
                        return 1;
                    }
                    throw new IllegalArgumentException();
                }
            }
            return i2;
        }

        @Override // X.InterfaceC04680Mk
        public final int BIh(int i) {
            if (i == 0) {
                return 0;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0O("Not an int field: ", i));
        }

        @Override // X.InterfaceC04680Mk
        public final long BP8(int i) {
            throw new IllegalArgumentException("No long field");
        }
    };

    public static synchronized void A00(C07960bG c07960bG) {
        synchronized (c07960bG) {
            C0Mo c0Mo = c07960bG.A04;
            if (c0Mo != null) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis() - c07960bG.A03;
                    if (uptimeMillis > 2147483647L) {
                        uptimeMillis = 2147483647L;
                    }
                    int i = (int) uptimeMillis;
                    try {
                        C0Mo.A05(c0Mo);
                        int i2 = c0Mo.A0B[0];
                        MappedByteBuffer mappedByteBuffer = c0Mo.A08;
                        int position = mappedByteBuffer.position();
                        try {
                            mappedByteBuffer.position(i2);
                            mappedByteBuffer.putInt(i);
                            mappedByteBuffer.position(position);
                        } catch (Throwable th) {
                            mappedByteBuffer.position(position);
                            throw th;
                        }
                    } catch (Exception e) {
                        C0PC.A00().DEh("AppLiftcycleUpdateLastTS", e, null);
                        A01(c07960bG, e, "Exception writing timestamp");
                    }
                } catch (Throwable th2) {
                }
            }
        }
    }

    public static synchronized void A01(C07960bG c07960bG, Exception exc, String str) {
        synchronized (c07960bG) {
            c07960bG.A03(exc, str, 0, 0);
        }
    }

    public static synchronized void A02(C07960bG c07960bG, Integer num, byte... bArr) {
        synchronized (c07960bG) {
            C0Mo c0Mo = c07960bG.A04;
            if (c0Mo != null) {
                long uptimeMillis = SystemClock.uptimeMillis() - c07960bG.A03;
                if (uptimeMillis > 2147483647L) {
                    uptimeMillis = 2147483647L;
                }
                int i = (int) uptimeMillis;
                int length = bArr.length;
                byte[] bArr2 = new byte[length + 4];
                C0Mo.A03(i, bArr2, 0);
                System.arraycopy(bArr, 0, bArr2, 4, length);
                try {
                    c0Mo.A0G(num.intValue(), bArr2);
                } catch (Exception e) {
                    C0PC.A00().DEh("AppLiftcycleWrite", e, null);
                    c07960bG.A03(e, "Exception writing record", num.intValue(), length);
                    try {
                        c0Mo.A0D();
                    } catch (Exception e2) {
                        C0PC.A00().DEh("AppLiftcycleResetBuf", e2, null);
                        A01(c07960bG, e2, "Exception resetting buffer");
                    }
                }
            }
        }
    }

    private synchronized void A03(Exception exc, String str, int i, int i2) {
        C0Mo c0Mo = this.A04;
        if (c0Mo != null) {
            StringBuilder sb = new StringBuilder();
            c0Mo.A0H(sb);
            sb.append(" record size: ");
            sb.append(i);
            sb.append(" space: ");
            sb.append(i2);
            new StringBuilder();
            synchronized (c0Mo) {
            }
            DirectReports.A01(null, null, null, null, str, sb.toString(), exc, null);
        }
    }

    public final synchronized void A04(Integer num, Object obj) {
        char c = '!';
        C0AK c0ak = this.A0A;
        if (c0ak != null) {
            c = c0ak.A00(C0AG.A01(obj));
        }
        Integer num2 = C05F.A0H;
        byte A00 = (byte) C0AL.A00(num);
        int hashCode = obj.hashCode();
        A02(this, num2, (byte) c, A00, (byte) ((hashCode >>> 24) & 255), (byte) ((hashCode >>> 16) & 255), (byte) ((hashCode >>> 8) & 255), (byte) (hashCode & 255));
    }

    @Override // X.InterfaceC04640Mg
    public final synchronized void DI7(boolean z) {
        Integer num;
        short s;
        ScheduledExecutorService scheduledExecutorService;
        if (this.A08) {
            Boolean bool = this.A05;
            if (bool != null && bool.booleanValue() == z) {
                A00(this);
            } else {
                if (z) {
                    num = C05F.A1I;
                } else {
                    num = C05F.A02;
                }
                this.A05 = new Boolean(z);
                A02(this, num, new byte[0]);
                if (z && this.A07 == null && (s = this.A0G) > 0 && (scheduledExecutorService = this.A06) != null) {
                    long j = s;
                    this.A07 = scheduledExecutorService.scheduleWithFixedDelay(this.A0F, j, j, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A0I = hashMap;
        hashMap.put(100, 0);
        hashMap.put(125, 1);
        hashMap.put(130, 2);
        hashMap.put(150, 3);
        hashMap.put(200, 4);
        hashMap.put(230, 5);
        hashMap.put(Integer.valueOf(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD), 6);
        hashMap.put(325, 7);
        hashMap.put(350, 8);
        hashMap.put(Integer.valueOf(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI), 9);
        hashMap.put(500, 10);
        hashMap.put(1000, 11);
    }

    public C07960bG(C0AK c0ak, InterfaceC04650Mh interfaceC04650Mh, RunnableC05150Ph runnableC05150Ph, File file, int i, boolean z) {
        int i2;
        this.A0E = runnableC05150Ph;
        if (file != null) {
            File file2 = new File(file, "hist.bin");
            if (!file2.exists()) {
                C07920bC ALA = interfaceC04650Mh.ALA(file2, 4096);
                this.A0D = ALA;
                if (ALA != null) {
                    Integer[] A00 = C05F.A00(25);
                    int length = A00.length;
                    int[] iArr = new int[length - 1];
                    for (int i3 = 1; i3 < length; i3++) {
                        int i4 = i3 - 1;
                        switch (A00[i3].intValue()) {
                            case 1:
                            case 7:
                            case 11:
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            case 14:
                                i2 = 7;
                                break;
                            case 2:
                            case 4:
                            case 5:
                            case 9:
                            case 10:
                            case Process.SIGTERM /* 15 */:
                            case 16:
                            case 17:
                            case 18:
                            case 21:
                            case 22:
                                i2 = 5;
                                break;
                            case 3:
                                i2 = 8;
                                break;
                            case 6:
                            case Process.SIGSTOP /* 19 */:
                            case 20:
                            case 23:
                                i2 = 6;
                                break;
                            case 8:
                                i2 = 10;
                                break;
                            case 24:
                                i2 = 11;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        iArr[i4] = i2;
                    }
                    this.A04 = new C0Mo(this.A0H, this.A0D.A00, iArr, (byte) -7, 4096, false);
                }
            } else {
                throw new IllegalStateException(AnonymousClass001.A0R("File exists: ", file2.getName()));
            }
        }
        this.A0G = i <= 32767 ? (short) i : Short.MAX_VALUE;
        this.A0A = c0ak;
        if (z) {
            this.A05 = new Boolean(false);
        }
    }
}
