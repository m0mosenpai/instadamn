package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/* renamed from: X.St5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63750St5 implements InterfaceC65470Tkn {
    public static final C61688Rs3 A05 = new Object();
    public static final C62402SAb A06 = new C62402SAb();
    public final Context A00;
    public final C61688Rs3 A01;
    public final C62402SAb A02;
    public final SDH A03;
    public final List A04;

    public C63750St5(Context context, InterfaceC65571Tn4 interfaceC65571Tn4, C63361SiK c63361SiK, List list) {
        C62402SAb c62402SAb = A06;
        C61688Rs3 c61688Rs3 = A05;
        this.A00 = context.getApplicationContext();
        this.A04 = list;
        this.A01 = c61688Rs3;
        this.A03 = new SDH(interfaceC65571Tn4, c63361SiK);
        this.A02 = c62402SAb;
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [X.SJL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [X.SJL, java.lang.Object] */
    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        Queue queue;
        C63274SgY c63274SgY;
        byte[] bArr;
        Bitmap.Config config;
        int highestOneBit;
        Bitmap.Config config2;
        int[] iArr;
        int A00;
        int A002;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C62402SAb c62402SAb = this.A02;
        synchronized (c62402SAb) {
            queue = c62402SAb.A00;
            c63274SgY = (C63274SgY) queue.poll();
            if (c63274SgY == null) {
                c63274SgY = new C63274SgY();
            }
            c63274SgY.A02 = null;
            bArr = c63274SgY.A03;
            Arrays.fill(bArr, (byte) 0);
            c63274SgY.A01 = new SJM();
            c63274SgY.A00 = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            c63274SgY.A02 = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            c63274SgY.A02.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            SystemClock.elapsedRealtimeNanos();
            try {
                if (c63274SgY.A02 != null) {
                    SJM sjm = c63274SgY.A01;
                    if (sjm.A05 == 0) {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        int i3 = 0;
                        do {
                            A1C.append((char) C63274SgY.A00(c63274SgY));
                            i3++;
                        } while (i3 < 6);
                        if (!A1C.toString().startsWith("GIF")) {
                            sjm = c63274SgY.A01;
                            sjm.A05 = 1;
                        } else {
                            c63274SgY.A01.A06 = c63274SgY.A02.getShort();
                            c63274SgY.A01.A04 = c63274SgY.A02.getShort();
                            int A003 = C63274SgY.A00(c63274SgY);
                            SJM sjm2 = c63274SgY.A01;
                            sjm2.A08 = AbstractC167007dF.A1M(A003 & 128);
                            sjm2.A03 = (int) Math.pow(2.0d, (A003 & 7) + 1);
                            sjm2.A01 = C63274SgY.A00(c63274SgY);
                            C63274SgY.A00(c63274SgY);
                            sjm = c63274SgY.A01;
                            if (sjm.A08 && sjm.A05 == 0) {
                                sjm.A09 = C63274SgY.A02(c63274SgY, sjm.A03);
                                sjm = c63274SgY.A01;
                                sjm.A00 = sjm.A09[sjm.A01];
                            }
                        }
                        if (sjm.A05 == 0) {
                            while (c63274SgY.A01.A05 == 0) {
                                int A004 = C63274SgY.A00(c63274SgY);
                                if (A004 != 33) {
                                    if (A004 != 44) {
                                        if (A004 == 59) {
                                            break;
                                        }
                                        c63274SgY.A01.A05 = 1;
                                    } else {
                                        SJM sjm3 = c63274SgY.A01;
                                        SJL sjl = sjm3.A07;
                                        SJL sjl2 = sjl;
                                        if (sjl == null) {
                                            ?? obj2 = new Object();
                                            sjm3.A07 = obj2;
                                            sjl2 = obj2;
                                        }
                                        sjl2.A05 = c63274SgY.A02.getShort();
                                        c63274SgY.A01.A07.A06 = c63274SgY.A02.getShort();
                                        c63274SgY.A01.A07.A04 = c63274SgY.A02.getShort();
                                        c63274SgY.A01.A07.A03 = c63274SgY.A02.getShort();
                                        int A005 = C63274SgY.A00(c63274SgY);
                                        boolean z = false;
                                        boolean A1M = AbstractC167007dF.A1M(A005 & 128);
                                        int pow = (int) Math.pow(2.0d, (A005 & 7) + 1);
                                        SJL sjl3 = c63274SgY.A01.A07;
                                        if ((A005 & 64) != 0) {
                                            z = true;
                                        }
                                        sjl3.A08 = z;
                                        if (!A1M) {
                                            iArr = null;
                                        } else {
                                            iArr = C63274SgY.A02(c63274SgY, pow);
                                        }
                                        sjl3.A0A = iArr;
                                        c63274SgY.A01.A07.A00 = c63274SgY.A02.position();
                                        C63274SgY.A00(c63274SgY);
                                        do {
                                            A00 = C63274SgY.A00(c63274SgY);
                                            c63274SgY.A02.position(Math.min(c63274SgY.A02.position() + A00, c63274SgY.A02.limit()));
                                        } while (A00 > 0);
                                        SJM sjm4 = c63274SgY.A01;
                                        if (sjm4.A05 == 0) {
                                            sjm4.A02++;
                                            sjm4.A0A.add(sjm4.A07);
                                        }
                                    }
                                } else {
                                    int A006 = C63274SgY.A00(c63274SgY);
                                    if (A006 != 1) {
                                        if (A006 != 249) {
                                            if (A006 != 254 && A006 == 255) {
                                                C63274SgY.A01(c63274SgY);
                                                StringBuilder A1C2 = AbstractC166987dD.A1C();
                                                int i4 = 0;
                                                do {
                                                    A1C2.append((char) bArr[i4]);
                                                    i4++;
                                                } while (i4 < 11);
                                                if (A1C2.toString().equals("NETSCAPE2.0")) {
                                                    do {
                                                        C63274SgY.A01(c63274SgY);
                                                        if (c63274SgY.A00 > 0) {
                                                        }
                                                    } while (c63274SgY.A01.A05 == 0);
                                                }
                                            }
                                        } else {
                                            c63274SgY.A01.A07 = new Object();
                                            C63274SgY.A00(c63274SgY);
                                            int A007 = C63274SgY.A00(c63274SgY);
                                            SJL sjl4 = c63274SgY.A01.A07;
                                            int i5 = (A007 & 28) >> 2;
                                            sjl4.A02 = i5;
                                            boolean z2 = true;
                                            if (i5 == 0) {
                                                sjl4.A02 = 1;
                                            }
                                            if ((A007 & 1) == 0) {
                                                z2 = false;
                                            }
                                            sjl4.A09 = z2;
                                            short s = c63274SgY.A02.getShort();
                                            if (s < 2) {
                                                s = 10;
                                            }
                                            SJL sjl5 = c63274SgY.A01.A07;
                                            sjl5.A01 = s * 10;
                                            sjl5.A07 = C63274SgY.A00(c63274SgY);
                                            C63274SgY.A00(c63274SgY);
                                        }
                                    }
                                    do {
                                        A002 = C63274SgY.A00(c63274SgY);
                                        c63274SgY.A02.position(Math.min(c63274SgY.A02.position() + A002, c63274SgY.A02.limit()));
                                    } while (A002 > 0);
                                }
                            }
                            sjm = c63274SgY.A01;
                            if (sjm.A02 < 0) {
                                sjm.A05 = 1;
                            }
                        }
                    }
                    AbstractC63790Stk abstractC63790Stk = null;
                    if (sjm.A02 > 0 && sjm.A05 == 0) {
                        if (c63729Ssj.A00(S8S.A00) == EnumC61099RfD.PREFER_RGB_565) {
                            config = Bitmap.Config.RGB_565;
                        } else {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        int min = Math.min(sjm.A04 / i2, sjm.A06 / i);
                        if (min == 0) {
                            highestOneBit = 0;
                        } else {
                            highestOneBit = Integer.highestOneBit(min);
                        }
                        int max = Math.max(1, highestOneBit);
                        android.util.Log.isLoggable("BufferGifDecoder", 2);
                        SZL szl = new SZL(sjm, this.A03, byteBuffer, max);
                        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
                        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
                            StringBuilder A1C3 = AbstractC166987dD.A1C();
                            A1C3.append("Unsupported format: ");
                            A1C3.append(config);
                            A1C3.append(", must be one of ");
                            A1C3.append(config3);
                            throw AbstractC37303Gc4.A0M(config2, " or ", A1C3);
                        }
                        szl.A05 = config;
                        szl.A02 = (szl.A02 + 1) % szl.A07.A02;
                        Bitmap A01 = szl.A01();
                        if (A01 != null) {
                            abstractC63790Stk = new AbstractC63790Stk(new Q2P(new Q2G(new C62976SZw(A01, ComponentCallbacks2C63416Sju.A00(this.A00), szl, (C63758StE) C63758StE.A00, i, i2))));
                        }
                    }
                    synchronized (c62402SAb) {
                        c63274SgY.A02 = null;
                        c63274SgY.A01 = null;
                        queue.offer(c63274SgY);
                    }
                    return abstractC63790Stk;
                }
                throw AbstractC166987dD.A14("You must call setData() before parseHeader()");
            } finally {
                if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            }
        } catch (Throwable th) {
            synchronized (c62402SAb) {
                c63274SgY.A02 = null;
                c63274SgY.A01 = null;
                queue.offer(c63274SgY);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!AbstractC166987dD.A1a(c63729Ssj.A00(S8S.A01)) && AbstractC63044SbN.A02(byteBuffer, this.A04) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }
}
