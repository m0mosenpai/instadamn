package X;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.webrtc.AndroidVideoDecoder;

@Deprecated
/* renamed from: X.5Sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C117385Sx extends AbstractC97194Ye {
    public static boolean A0l;
    public static boolean A0m;
    public static final int[] A0n = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public Surface A0B;
    public C70218WIb A0C;
    public PlaceholderSurface A0D;
    public C4Ws A0E;
    public C4U9 A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public long A0U;
    public long A0V;
    public C4BQ A0W;
    public C5TG A0X;
    public C4U9 A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final long A0c;
    public final Context A0d;
    public final C4U1 A0e;
    public final C4U7 A0f;
    public final boolean A0g;
    public final C5T1 A0h;
    public final C96154Ty A0i;
    public final boolean A0j;
    public final boolean A0k;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0080, code lost:
    
        if (com.google.android.exoplayer2.util.Util.A04.startsWith("Pixel ") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C117385Sx(android.content.Context r18, android.os.Handler r19, X.C4BQ r20, X.C96014Tk r21, X.C2VQ r22, X.InterfaceC117375Sw r23, X.C4BL r24, X.C4TY r25, java.lang.Object r26, long r27, boolean r29) {
        /*
            r17 = this;
            r15 = 1
            r13 = 1106247680(0x41f00000, float:30.0)
            r4 = 0
            r14 = 2
            r7 = r17
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r26
            r16 = r29
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7.A0N = r15
            r7.A0G = r15
            r7.A0M = r4
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0I = r4
            r7.A0J = r4
            r7.A0L = r4
            X.2C1 r0 = X.C2C1.A1P
            boolean r0 = X.C2C5.A02(r0)
            r7.A0k = r0
            X.2C1 r0 = X.C2C1.A1R
            boolean r0 = X.C2C5.A02(r0)
            r7.A0g = r0
            r0 = r27
            r7.A0c = r0
            r1 = r18
            android.content.Context r5 = r1.getApplicationContext()
            r7.A0d = r5
            r0 = r20
            r7.A0W = r0
            X.4Ty r0 = new X.4Ty
            r0.<init>(r1)
            r7.A0i = r0
            X.4U1 r1 = new X.4U1
            r1.<init>(r5)
            r7.A0e = r1
            X.4U7 r0 = new X.4U7
            r6 = r19
            r5 = r25
            r0.<init>(r6, r5)
            r7.A0f = r0
            X.5T1 r0 = new X.5T1
            r0.<init>(r7, r1)
            r7.A0h = r0
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A03
            java.lang.String r0 = "NVIDIA"
            boolean r0 = r0.equals(r1)
            r7.A0j = r0
            int r1 = com.google.android.exoplayer2.util.Util.A00
            r0 = 29
            if (r1 != r0) goto L82
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "Pixel "
            boolean r1 = r1.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L83
        L82:
            r0 = 0
        L83:
            r7.A0a = r0
            r7.A07 = r2
            r7.A0S = r15
            X.4U9 r0 = X.C4U9.A04
            r7.A0Y = r0
            r7.A0T = r4
            X.2C1 r0 = X.C2C1.A0x
            boolean r0 = X.C2C5.A02(r0)
            r7.A0J = r0
            X.2C1 r0 = X.C2C1.A0z
            boolean r0 = X.C2C5.A02(r0)
            r7.A0L = r0
            r0 = 0
            r7.A0F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117385Sx.<init>(android.content.Context, android.os.Handler, X.4BQ, X.4Tk, X.2VQ, X.5Sw, X.4BL, X.4TY, java.lang.Object, long, boolean):void");
    }

    private void A04() {
        InterfaceC53292cD interfaceC53292cD;
        this.A0Q = false;
        if (this.A0b && (interfaceC53292cD = super.A0H) != null) {
            this.A0C = new C70218WIb(interfaceC53292cD, this);
        }
    }

    @Override // X.AbstractC96044Tn
    public final void A0H() {
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A05 = SystemClock.elapsedRealtime();
        this.A08 = SystemClock.elapsedRealtime() * 1000;
        this.A0A = 0L;
        this.A04 = 0;
        if (!this.A0g || this.A0k) {
            this.A0e.A03();
        }
    }

    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    public final void A0K() {
        this.A0F = null;
        A04();
        if (this.A0g) {
            C96154Ty c96154Ty = this.A0i;
            if (c96154Ty.A09 != null) {
                C96164Tz c96164Tz = c96154Ty.A0A;
                if (c96164Tz != null) {
                    c96164Tz.A00.unregisterDisplayListener(c96164Tz);
                }
                c96154Ty.A0B.A02.sendEmptyMessage(2);
            }
        }
        this.A0K = false;
        this.A0C = null;
        this.A02 = 0;
        this.A03 = 0;
        try {
            super.A0K();
            C4U7 c4u7 = this.A0f;
            C98154au c98154au = super.A0E;
            synchronized (c98154au) {
            }
            c4u7.A00.post(new RunnableC122335gT(c98154au, c4u7));
            if (!C2C5.A02(C2C1.A1B)) {
                c4u7.A00(C4U9.A04);
            }
        } catch (Throwable th) {
            C4U7 c4u72 = this.A0f;
            C98154au c98154au2 = super.A0E;
            synchronized (c98154au2) {
                c4u72.A00.post(new RunnableC122335gT(c98154au2, c4u72));
                if (!C2C5.A02(C2C1.A1B)) {
                    c4u72.A00(C4U9.A04);
                }
                throw th;
            }
        }
    }

    @Override // X.AbstractC97194Ye
    public final float A0O(C4B6 c4b6, C4B6[] c4b6Arr, float f) {
        float f2 = -1.0f;
        for (C4B6 c4b62 : c4b6Arr) {
            float f3 = c4b62.A01;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // X.AbstractC97194Ye
    public final int A0P(C4B6 c4b6, C4BL c4bl) {
        if (A0q(c4b6)) {
            return 20;
        }
        return A00(this.A0d, this.A0W, c4b6, c4bl, super.A0b, super.A0Y);
    }

    @Override // X.AbstractC97194Ye
    public final boolean A0n() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00f9, code lost:
    
        if (r9 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00f1, code lost:
    
        if (r4 == 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x007e, code lost:
    
        if (r9 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00bd, code lost:
    
        if (CbZ() == false) goto L64;
     */
    @Override // X.AbstractC96044Tn, X.InterfaceC96064Tp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CK0(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117385Sx.CK0(int, java.lang.Object):void");
    }

    @Override // X.InterfaceC96054To, X.InterfaceC96074Tq
    public final String getName() {
        return "MediaCodecVideoRenderer2";
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        r11 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
    
        r9 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b8, code lost:
    
        if (r8.A0A(r19) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ba, code lost:
    
        r9 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        r0 = r8.A05;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
    
        r8 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        if (X.C2C5.A02(X.C2C1.A17) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cb, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cc, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        if (r12 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        r14 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d7, code lost:
    
        if ("video/dolby-vision".equals(r10) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dd, code lost:
    
        if (X.S2I.A00(r17) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00df, code lost:
    
        r14 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e7, code lost:
    
        if (X.C2C5.A02(X.C2C1.A19) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e9, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ea, code lost:
    
        if (r13 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ec, code lost:
    
        r1 = A03(r17, r19, r20, r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f4, code lost:
    
        if (r1.isEmpty() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f6, code lost:
    
        r1 = (X.C2IG) X.C46762Co.A04(r19, r1).get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0104, code lost:
    
        if (r1.A09(r19) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010a, code lost:
    
        if (r1.A0A(r19) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010c, code lost:
    
        r5 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010e, code lost:
    
        if (r15 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0110, code lost:
    
        A05(r18, r19, r20, r2, (((r11 | r9) | r5) | r8) | r14, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0121, code lost:
    
        r5 = ((r11 | r9) | r5) | r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012d, code lost:
    
        if (r13 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(android.content.Context r17, X.C4BQ r18, X.C4B6 r19, X.C4BL r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117385Sx.A00(android.content.Context, X.4BQ, X.4B6, X.4BL, boolean, boolean):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
    
        if (X.C2C5.A02(X.C2C1.A0M) != false) goto L48;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0034. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(X.C4B6 r9, X.C2IG r10) {
        /*
            int r1 = r9.A0L
            int r3 = r9.A0A
            r2 = -1
            if (r1 == r2) goto L37
            if (r3 == r2) goto L37
            java.lang.String r4 = r9.A0W
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r4)
            java.lang.String r8 = "video/avc"
            java.lang.String r7 = "video/hevc"
            r6 = 1
            r5 = 2
            if (r0 == 0) goto L30
            android.util.Pair r0 = X.C46762Co.A00(r9)
            if (r0 == 0) goto Lc2
            java.lang.Object r0 = r0.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = 512(0x200, float:7.17E-43)
            if (r4 == r0) goto L2f
            if (r4 == r6) goto L2f
            if (r4 != r5) goto Lc2
        L2f:
            r4 = r8
        L30:
            int r0 = r4.hashCode()
            switch(r0) {
                case -1664118616: goto La3;
                case -1662735862: goto Lac;
                case -1662541442: goto L91;
                case 1187890754: goto L8e;
                case 1331836730: goto L4d;
                case 1599127256: goto L46;
                case 1599127257: goto L38;
                default: goto L37;
            }
        L37:
            return r2
        L38:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L37
            int r1 = r1 * r3
            int r2 = r1 * 3
            r0 = 8
            goto Lc0
        L46:
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            goto La5
        L4d:
            boolean r0 = r4.equals(r8)
            if (r0 == 0) goto L37
            java.lang.String r5 = com.google.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L37
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.A03
            java.lang.String r0 = "Amazon"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L7c
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L37
            java.lang.String r0 = "AFTS"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L7c
            boolean r0 = r10.A06
            if (r0 == 0) goto L7c
            return r2
        L7c:
            r2 = 16
            int r0 = r1 + 16
            int r1 = r0 + (-1)
            int r1 = r1 / r2
            int r0 = r3 + 16
            int r0 = r0 + (-1)
            int r0 = r0 / r2
            int r1 = r1 * r0
            int r0 = r1 * 16
            int r1 = r0 * 16
            goto Lbd
        L8e:
            java.lang.String r0 = "video/mp4v-es"
            goto La5
        L91:
            boolean r0 = r4.equals(r7)
            if (r0 == 0) goto L37
            r2 = 2097152(0x200000, float:2.938736E-39)
            int r1 = r1 * r3
            int r1 = r1 * 3
            r0 = 4
            int r1 = r1 / r0
            int r2 = java.lang.Math.max(r2, r1)
            return r2
        La3:
            java.lang.String r0 = "video/3gpp"
        La5:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lbc
            return r2
        Lac:
            java.lang.String r0 = "video/av01"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L37
            X.2C1 r0 = X.C2C1.A0M
            boolean r0 = X.C2C5.A02(r0)
            if (r0 == 0) goto L37
        Lbc:
            int r1 = r1 * r3
        Lbd:
            int r2 = r1 * 3
            r0 = 4
        Lc0:
            int r2 = r2 / r0
            return r2
        Lc2:
            r4 = r7
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117385Sx.A01(X.4B6, X.2IG):int");
    }

    public static int A02(C4B6 c4b6, C2IG c2ig) {
        int i = c4b6.A0B;
        if (i != -1) {
            List list = c4b6.A0X;
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return i + i2;
        }
        return A01(c4b6, c2ig);
    }

    public static List A03(Context context, C4B6 c4b6, C4BL c4bl, boolean z, boolean z2) {
        List Aw3;
        String str = c4b6.A0W;
        if (str == null) {
            return ImmutableList.of();
        }
        if ("video/dolby-vision".equals(str) && !S2I.A00(context)) {
            String A03 = C46762Co.A03(c4b6);
            if (A03 == null) {
                Aw3 = ImmutableList.of();
            } else {
                Aw3 = c4bl.Aw3(A03, z, z2);
            }
            if (!Aw3.isEmpty()) {
                return Aw3;
            }
        }
        return C46762Co.A02(c4b6, c4bl, z, z2);
    }

    public static void A05(C4BQ c4bq, C4B6 c4b6, C4BL c4bl, List list, int i, boolean z) {
        try {
            int A01 = C96024Tl.A01(c4b6, c4bl, z);
            if (A01 != (i & 63)) {
                String str = c4b6.A0W;
                boolean z2 = false;
                if (c4b6.A0O != null) {
                    z2 = true;
                }
                List<C2IG> Aw3 = c4bl.Aw3(str, z2, false);
                StringBuilder sb = new StringBuilder();
                sb.append("MCR1 returned 0b");
                sb.append(Integer.toBinaryString(A01));
                sb.append(" and MCR2 returned 0b");
                sb.append(Integer.toBinaryString(i));
                sb.append(" for ");
                sb.append(c4b6);
                sb.append("\nMCR2 Codecs: \n");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C2IG c2ig = (C2IG) it.next();
                    sb.append("\t");
                    sb.append(c2ig.A03);
                    sb.append("\n");
                }
                sb.append("MCR1 Codecs: \n");
                for (C2IG c2ig2 : Aw3) {
                    sb.append("\t");
                    sb.append(c2ig2.A03);
                    sb.append("\n");
                }
                String obj = sb.toString();
                AbstractC46512Bo.A04("MediaCodecVideoRenderer2", obj);
                if (c4bq != null) {
                    c4bq.CmU(obj);
                }
            }
        } catch (C40J e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MCR1 threw an exception");
            sb2.append(e);
            sb2.append(" and MCR2 returned 0b");
            sb2.append(Integer.toBinaryString(i));
            sb2.append(" for ");
            sb2.append(c4b6);
            sb2.append("\nMCR2 Codecs: \n");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C2IG c2ig3 = (C2IG) it2.next();
                sb2.append("\t");
                sb2.append(c2ig3.A03);
                sb2.append("\n");
            }
            String obj2 = sb2.toString();
            AbstractC46512Bo.A04("MediaCodecVideoRenderer2", obj2);
            if (c4bq != null) {
                c4bq.CmU(obj2);
            }
        }
    }

    private boolean A07(C2IG c2ig) {
        if (this.A0N && !this.A0b && !A08(c2ig.A03)) {
            if (!c2ig.A06 || PlaceholderSurface.A01()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r1.equals(r0) == false) goto L39;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A08(java.lang.String r2) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.Class<X.4Tl> r2 = X.C96024Tl.class
            monitor-enter(r2)
            boolean r0 = X.C117385Sx.A0m     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L70
            int r1 = com.google.android.exoplayer2.util.Util.A00     // Catch: java.lang.Throwable -> L74
            r0 = 28
            if (r1 > r0) goto L20
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A01     // Catch: java.lang.Throwable -> L74
            int r0 = r1.hashCode()     // Catch: java.lang.Throwable -> L74
            switch(r0) {
                case -1339091551: goto L2a;
                case -1220081023: goto L2d;
                case -1220066608: goto L30;
                case -1012436106: goto L33;
                case -760312546: goto L36;
                case -64886864: goto L39;
                case 3415681: goto L3c;
                case 825323514: goto L3f;
                default: goto L20;
            }     // Catch: java.lang.Throwable -> L74
        L20:
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A04     // Catch: java.lang.Throwable -> L74
            int r0 = r1.hashCode()     // Catch: java.lang.Throwable -> L74
            switch(r0) {
                case -349662828: goto L48;
                case -321033677: goto L4b;
                case 2006354: goto L4e;
                case 2006367: goto L51;
                case 2006371: goto L54;
                case 1785421873: goto L57;
                case 1785421876: goto L5a;
                case 1798172390: goto L5d;
                case 2119412532: goto L60;
                default: goto L29;
            }     // Catch: java.lang.Throwable -> L74
        L29:
            goto L68
        L2a:
            java.lang.String r0 = "dangal"
            goto L41
        L2d:
            java.lang.String r0 = "dangalFHD"
            goto L41
        L30:
            java.lang.String r0 = "dangalUHD"
            goto L41
        L33:
            java.lang.String r0 = "oneday"
            goto L41
        L36:
            java.lang.String r0 = "aquaman"
            goto L41
        L39:
            java.lang.String r0 = "magnolia"
            goto L41
        L3c:
            java.lang.String r0 = "once"
            goto L41
        L3f:
            java.lang.String r0 = "machuca"
        L41:
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L6a
            goto L20
        L48:
            java.lang.String r0 = "AFTJMST12"
            goto L62
        L4b:
            java.lang.String r0 = "AFTKMST12"
            goto L62
        L4e:
            java.lang.String r0 = "AFTA"
            goto L62
        L51:
            java.lang.String r0 = "AFTN"
            goto L62
        L54:
            java.lang.String r0 = "AFTR"
            goto L62
        L57:
            java.lang.String r0 = "AFTEU011"
            goto L62
        L5a:
            java.lang.String r0 = "AFTEU014"
            goto L62
        L5d:
            java.lang.String r0 = "AFTSO001"
            goto L62
        L60:
            java.lang.String r0 = "AFTEUFF014"
        L62:
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L6a
        L68:
            r0 = 0
            goto L6b
        L6a:
            r0 = 1
        L6b:
            X.C117385Sx.A0l = r0     // Catch: java.lang.Throwable -> L74
            r0 = 1
            X.C117385Sx.A0m = r0     // Catch: java.lang.Throwable -> L74
        L70:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            boolean r0 = X.C117385Sx.A0l
            return r0
        L74:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117385Sx.A08(java.lang.String):boolean");
    }

    @Override // X.AbstractC97194Ye
    public final C5TF A0Q(C4B6 c4b6, C4B6 c4b62, C2IG c2ig) {
        int i;
        String str;
        int i2;
        if (A0q(((AbstractC97194Ye) this).A0C) && c4b6.A0W.equals(c4b62.A0W) && c4b6.A0F == c4b62.A0F) {
            str = c2ig.A03;
            i2 = 3;
            i = 0;
        } else {
            C5TF A05 = c2ig.A05(c4b6, c4b62);
            i = A05.A00;
            int i3 = c4b62.A0L;
            C5TG c5tg = this.A0X;
            if (i3 > c5tg.A02 || c4b62.A0A > c5tg.A00) {
                i |= 256;
            }
            if (A02(c4b62, c2ig) > this.A0X.A01) {
                i |= 64;
            }
            str = c2ig.A03;
            if (i != 0) {
                i2 = 0;
            } else {
                i2 = A05.A01;
            }
        }
        return new C5TF(c4b6, c4b62, str, i2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x011e, code lost:
    
        if (r0.isFeatureSupported("low-latency") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0177, code lost:
    
        if (r13.A0A == (-1)) goto L83;
     */
    @Override // X.AbstractC97194Ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5TH A0S(android.media.MediaCrypto r24, X.C4B6 r25, X.C2IG r26, float r27) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117385Sx.A0S(android.media.MediaCrypto, X.4B6, X.2IG, float):X.5TH");
    }

    @Override // X.AbstractC97194Ye
    public final RF5 A0T(C2IG c2ig, Throwable th) {
        return new RF4(this.A0B, c2ig, th);
    }

    @Override // X.AbstractC97194Ye
    public final ArrayList A0U(C4B6 c4b6, C4BL c4bl, boolean z) {
        List unmodifiableList;
        ArrayList A04 = C46762Co.A04(c4b6, A03(this.A0d, c4b6, c4bl, z, this.A0b));
        if (C2C5.A02(C2C1.A0f)) {
            String str = c4b6.A0W;
            if (str == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(c4bl.Aw3(str, z, false));
            }
            if (unmodifiableList.size() == A04.size()) {
                for (int i = 0; i < unmodifiableList.size(); i++) {
                    if (((C2IG) unmodifiableList.get(i)).A03.equals(((C2IG) A04.get(i)).A03)) {
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("MCR1 supported decoders differs from MCR2 supported decoders for ");
            sb.append(c4b6);
            sb.append("\nMCR1 Decoders:\n");
            A06(sb, unmodifiableList);
            sb.append("MCR2 Decoders:\n");
            A06(sb, A04);
            String obj = sb.toString();
            AbstractC46512Bo.A04("MediaCodecVideoRenderer2", obj);
            C4BQ c4bq = this.A0W;
            if (c4bq != null) {
                c4bq.CmU(obj);
            }
        }
        return A04;
    }

    @Override // X.AbstractC97194Ye
    public final void A0d(MediaFormat mediaFormat, C4B6 c4b6) {
        int integer;
        int integer2;
        InterfaceC53292cD interfaceC53292cD = super.A0H;
        if (interfaceC53292cD != null) {
            interfaceC53292cD.setVideoScalingMode(this.A0S);
        }
        if (this.A0b) {
            integer = c4b6.A0L;
            integer2 = c4b6.A0A;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_TOP)) {
                integer = (mediaFormat.getInteger(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_RIGHT) - mediaFormat.getInteger(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_LEFT)) + 1;
                integer2 = (mediaFormat.getInteger(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_BOTTOM) - mediaFormat.getInteger(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_TOP)) + 1;
            } else {
                integer = mediaFormat.getInteger(IgReactMediaPickerNativeModule.WIDTH);
                integer2 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.HEIGHT);
            }
        }
        float f = c4b6.A02;
        int i = c4b6.A0F;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.A0Y = new C4U9(f, integer, integer2, 0);
        this.A0e.A05(c4b6.A01);
    }

    @Override // X.AbstractC97194Ye
    public final void A0f(C4B6 c4b6) {
        if (this.A0k) {
            this.A0h.A00(c4b6);
        }
    }

    @Override // X.AbstractC97194Ye
    public final void A0g(C4B6 c4b6, String str) {
        this.A0f.A02(str);
        this.A0h.A00(c4b6);
    }

    @Override // X.AbstractC97194Ye
    public final void A0h(C96094Ts c96094Ts) {
        if (this.A0Z) {
            ByteBuffer byteBuffer = c96094Ts.A03;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC53292cD interfaceC53292cD = super.A0H;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC53292cD.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC97194Ye
    public void A0i(C96094Ts c96094Ts) {
        if (!this.A0b) {
            this.A00++;
        }
    }

    @Override // X.AbstractC97194Ye
    public final void A0j(C5TH c5th, String str, long j, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C4U7 c4u7 = this.A0f;
        c4u7.A00.post(new RunnableC98664bm(c4u7, str, j2));
        this.A0H = A08(str);
        C2IG c2ig = super.A0I;
        c2ig.getClass();
        int i = Util.A00;
        boolean z = false;
        if (i >= 29 && "video/x-vnd.on2.vp9".equals(c2ig.A02)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c2ig.A00;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i2].profile == 16384) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        this.A0Z = z;
        if (this.A0b) {
            InterfaceC53292cD interfaceC53292cD = super.A0H;
            interfaceC53292cD.getClass();
            this.A0C = new C70218WIb(interfaceC53292cD, this);
        }
        if (this.A0k) {
            Context context = this.A0h.A05.A0d;
            if (i >= 29) {
                context.getApplicationContext().getApplicationInfo();
            }
        }
    }

    @Override // X.AbstractC97194Ye
    public final void A0k(final Exception exc) {
        AbstractC46512Bo.A05("MediaCodecVideoRenderer2", "Video codec error", exc);
        final C4U7 c4u7 = this.A0f;
        c4u7.A00.post(new Runnable() { // from class: X.YHS
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // X.AbstractC97194Ye
    public final void A0l(String str) {
        this.A0f.A02(str);
    }

    @Override // X.AbstractC97194Ye
    public final void A0m(String str) {
        final C4U7 c4u7 = this.A0f;
        c4u7.A00.post(new Runnable() { // from class: X.XNE
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // X.AbstractC97194Ye
    public final boolean A0o() {
        if (this.A0a && SystemClock.elapsedRealtime() - this.A09 < 500) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0270  */
    @Override // X.AbstractC97194Ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0r(X.C4B6 r34, X.InterfaceC53292cD r35, java.nio.ByteBuffer r36, int r37, int r38, int r39, long r40, long r42, long r44, boolean r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117385Sx.A0r(X.4B6, X.2cD, java.nio.ByteBuffer, int, int, int, long, long, long, boolean, boolean):boolean");
    }

    @Override // X.AbstractC97194Ye
    public final boolean A0s(C2IG c2ig) {
        Surface surface = this.A0B;
        if ((surface == null || (!this.A0G && !surface.isValid())) && !A07(c2ig)) {
            return false;
        }
        return true;
    }

    public final void A0t(int i, int i2) {
        C98154au c98154au = super.A0E;
        c98154au.A05 += i;
        int i3 = i + i2;
        c98154au.A04 += i3;
        this.A01 += i3;
        int i4 = this.A0R + i3;
        this.A0R = i4;
        c98154au.A07 = Math.max(i4, c98154au.A07);
    }

    public final void A0v(long j) {
        C98154au c98154au = super.A0E;
        c98154au.A0F += j;
        c98154au.A0D++;
        this.A0A += j;
        this.A04++;
    }

    public final void A0w(InterfaceC53292cD interfaceC53292cD, int i) {
        AbstractC460729r.A01("skipVideoBuffer");
        interfaceC53292cD.releaseOutputBuffer(i, false);
        AbstractC460729r.A00();
        super.A0E.A0B++;
    }

    public final void A0x(InterfaceC53292cD interfaceC53292cD, int i, long j) {
        int i2;
        AbstractC460729r.A01("releaseOutputBuffer");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        interfaceC53292cD.releaseOutputBuffer(i, j);
        ((AbstractC97194Ye) this).A08 += SystemClock.elapsedRealtime() - elapsedRealtime;
        AbstractC460729r.A00();
        super.A0E.A09++;
        this.A0R = 0;
        this.A08 = SystemClock.elapsedRealtime() * 1000;
        C4U9 c4u9 = this.A0Y;
        if (!c4u9.equals(C4U9.A04) && !c4u9.equals(this.A0F)) {
            this.A0F = c4u9;
            this.A0f.A00(c4u9);
        }
        this.A0P = true;
        if (!this.A0Q) {
            this.A0Q = true;
            this.A0f.A01(this.A0B);
            this.A0K = true;
        }
        C98154au c98154au = super.A0E;
        long j2 = ((AbstractC97194Ye) this).A08;
        int i3 = c98154au.A09;
        if (i3 == 0) {
            i2 = -1;
        } else {
            i2 = (int) (j2 / i3);
        }
        c98154au.A01 = i2;
    }

    @Override // X.InterfaceC96054To
    public final boolean CTt() {
        return super.A0Z;
    }

    public static void A06(StringBuilder sb, List list) {
        String str;
        String str2;
        String str3;
        String str4;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2IG c2ig = (C2IG) it.next();
            sb.append("\t");
            sb.append(c2ig.A03);
            sb.append(":");
            if (c2ig.A07) {
                str = "sw";
            } else {
                str = "hw";
            }
            sb.append(str);
            sb.append(":");
            if (c2ig.A05) {
                str2 = "hwAcc";
            } else {
                str2 = "noHwAcc";
            }
            sb.append(str2);
            sb.append(":");
            if (c2ig.A04) {
                str3 = "seamless";
            } else {
                str3 = "noSeamless";
            }
            sb.append(str3);
            sb.append(":");
            if (c2ig.A06) {
                str4 = "secure";
            } else {
                str4 = "noSecure";
            }
            sb.append(str4);
            sb.append("\n");
        }
    }

    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    public final void A0J() {
        try {
            super.A0J();
            PlaceholderSurface placeholderSurface = this.A0D;
            if (placeholderSurface != null) {
                if (this.A0B == placeholderSurface) {
                    this.A0B = null;
                }
                placeholderSurface.release();
                this.A0D = null;
            }
        } catch (Throwable th) {
            PlaceholderSurface placeholderSurface2 = this.A0D;
            if (placeholderSurface2 != null) {
                if (this.A0B == placeholderSurface2) {
                    this.A0B = null;
                }
                placeholderSurface2.release();
                this.A0D = null;
            }
            throw th;
        }
    }

    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    public final void A0L(long j, boolean z) {
        super.A0L(j, z);
        A04();
        if (!this.A0g) {
            C4U1 c4u1 = this.A0e;
            c4u1.A02 = 0L;
            c4u1.A03 = -1L;
            c4u1.A05 = -1L;
        }
        this.A02 = 0;
        this.A03 = 0;
        long j2 = -9223372036854775807L;
        this.A0U = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        this.A0R = 0;
        if (z) {
            long j3 = this.A0c;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            } else {
                j2 = -9223372036854775807L;
            }
        }
        this.A07 = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r5.A0T != 0) goto L6;
     */
    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(boolean r6, boolean r7) {
        /*
            r5 = this;
            super.A0M(r6, r7)
            X.4WD r0 = r5.A03
            r0.getClass()
            boolean r2 = r0.A00
            r4 = 0
            if (r2 == 0) goto L12
            int r1 = r5.A0T
            r0 = 0
            if (r1 == 0) goto L13
        L12:
            r0 = 1
        L13:
            X.C4B8.A04(r0)
            boolean r0 = r5.A0b
            if (r0 == r2) goto L1f
            r5.A0b = r2
            r5.A0Z()
        L1f:
            X.4U7 r3 = r5.A0f
            X.4au r2 = r5.A0E
            android.os.Handler r1 = r3.A00
            X.4av r0 = new X.4av
            r0.<init>(r2, r3)
            r1.post(r0)
            boolean r0 = r5.A0g
            if (r0 == 0) goto L36
            X.4Ty r0 = r5.A0i
            r0.A02()
        L36:
            r5.A0O = r7
            r5.A0P = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117385Sx.A0M(boolean, boolean):void");
    }

    @Override // X.AbstractC97194Ye
    public final C5TF A0R(C96084Tr c96084Tr) {
        C5TF A0R = super.A0R(c96084Tr);
        C4U7 c4u7 = this.A0f;
        c4u7.A00.post(new RunnableC98674bn(c96084Tr.A00, A0R, c4u7));
        return A0R;
    }

    @Override // X.AbstractC97194Ye
    public final void A0V() {
        A04();
    }

    @Override // X.AbstractC97194Ye
    public final void A0X() {
        super.A0X();
        this.A00 = 0;
    }

    @Override // X.AbstractC97194Ye
    public void A0b(long j) {
        super.A0b(j);
        if (!this.A0b) {
            this.A00--;
        }
    }

    @Override // X.AbstractC97194Ye
    public final void A0e(C4B6 c4b6) {
        int A00;
        if (A0q(c4b6) || ((A00 = C2C5.A00(C2C6.A07)) > 0 && c4b6.A0L > A00)) {
            this.A0h.A02 = false;
        }
    }

    public final void A0u(long j) {
        A0c(j);
        C4U9 c4u9 = this.A0Y;
        if (!c4u9.equals(C4U9.A04) && !c4u9.equals(this.A0F)) {
            this.A0F = c4u9;
            this.A0f.A00(c4u9);
        }
        super.A0E.A09++;
        this.A0P = true;
        if (!this.A0Q) {
            this.A0Q = true;
            this.A0f.A01(this.A0B);
            this.A0K = true;
        }
        A0b(j);
    }

    @Override // X.AbstractC97194Ye, X.InterfaceC96054To
    public final boolean CbZ() {
        PlaceholderSurface placeholderSurface;
        PlaceholderSurface placeholderSurface2;
        if (super.CbZ() && !this.A0Q && (((placeholderSurface2 = this.A0D) == null || this.A0B != placeholderSurface2) && super.A0H != null && !this.A0b)) {
            ((AbstractC96044Tn) this).A06 = C05F.A0Y;
        }
        if (super.CbZ() && (this.A0Q || (((placeholderSurface = this.A0D) != null && this.A0B == placeholderSurface) || super.A0H == null || this.A0b))) {
            this.A07 = -9223372036854775807L;
        } else {
            long j = this.A07;
            if (j != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() >= j) {
                    this.A07 = -9223372036854775807L;
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn, X.InterfaceC96054To
    public final void Eb2(float f, float f2) {
        super.Eb2(f, f2);
        if (!this.A0g) {
            C4U1 c4u1 = this.A0e;
            c4u1.A00 = f;
            c4u1.A02 = 0L;
            c4u1.A03 = -1L;
            c4u1.A05 = -1L;
            C4U1.A02(c4u1, false);
        }
    }

    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    public final void A0I() {
        this.A07 = -9223372036854775807L;
        if (this.A01 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C4U7 c4u7 = this.A0f;
            c4u7.A00.post(new RunnableC121445em(c4u7));
            this.A01 = 0;
            this.A05 = elapsedRealtime;
        }
        if (this.A04 != 0) {
            final C4U7 c4u72 = this.A0f;
            c4u72.A00.post(new Runnable() { // from class: X.XMk
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
            this.A0A = 0L;
            this.A04 = 0;
        }
        if (!this.A0g || this.A0k) {
            this.A0e.A04();
        }
    }

    @Override // X.AbstractC97194Ye, X.InterfaceC96054To
    public final void EGW(long j, long j2) {
        super.EGW(j, j2);
    }
}
