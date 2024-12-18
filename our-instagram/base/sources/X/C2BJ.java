package X;

import android.content.Context;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* renamed from: X.2BJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BJ {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final C2B2 A05;
    public final AbrContextAwareConfiguration A06;
    public final C2A4 A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public volatile int A0B;
    public volatile int A0C;
    public volatile String A0D;
    public volatile String A0E;
    public volatile boolean A0F;

    public static C4B6 A01(C4B6[] c4b6Arr, int i) {
        for (C4B6 c4b6 : c4b6Arr) {
            if (c4b6.A05 == i) {
                return c4b6;
            }
        }
        return null;
    }

    public final int A04(C4B6[] c4b6Arr) {
        if (!C2IH.A04(c4b6Arr[0].A0S)) {
            return 0;
        }
        int i = Integer.MAX_VALUE;
        for (C4B6 c4b6 : c4b6Arr) {
            if (c4b6.A05 < i) {
                i = c4b6.A05;
            }
        }
        return i;
    }

    public static int A00(Context context, C4B6[] c4b6Arr, float f, float f2) {
        if (context == null) {
            return Integer.MAX_VALUE;
        }
        if (c4b6Arr.length != 0) {
            C4B6 c4b6 = c4b6Arr[0];
            if (c4b6.A0L < c4b6.A0A) {
                f = f2;
            }
        }
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (int) (context.getResources().getDisplayMetrics().widthPixels * f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0071, code lost:
    
        if ("inline".equals(r1) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A02(java.lang.String r11, java.lang.String r12, java.util.ArrayList r13, X.C4B6[] r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2BJ.A02(java.lang.String, java.lang.String, java.util.ArrayList, X.4B6[]):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00d4, code lost:
    
        if (r10.A0B >= r10.A0C) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00d6, code lost:
    
        r5 = r10.A0B;
        r0 = X.C4BX.AVOID_ON_ABR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00da, code lost:
    
        r11.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00dd, code lost:
    
        r0 = A01(r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00e1, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e3, code lost:
    
        r6 = r0.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00e6, code lost:
    
        if (r7 <= 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00ee, code lost:
    
        if (r10.A0C >= r12[0].A05) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00f0, code lost:
    
        r0 = X.C4BX.AVOID_ON_CELL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r10.A0D == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00f3, code lost:
    
        r0 = X.C4BX.MAX_FORMAT_WIDTH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00f6, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0110, code lost:
    
        r11.add(X.C4BX.CELL);
        r6 = r10.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00fb, code lost:
    
        if (r10.A09 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00fe, code lost:
    
        if (r12.length <= 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r8 = r10.A0D;
        r7 = r12.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0106, code lost:
    
        if (r10.A0B >= r12[0].A05) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0108, code lost:
    
        r11.add(X.C4BX.AVOID_ON_ABR);
        r5 = r10.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0119, code lost:
    
        r11.add(X.C4BX.MAX_FORMAT_WIDTH);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0120, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0121, code lost:
    
        r1 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0123, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x012b, code lost:
    
        if ("full_screen".equals(r1) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x012d, code lost:
    
        r11.add(X.C4BX.INLINE);
        r6 = r10.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r3 >= r7) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x004c, code lost:
    
        r8 = r3.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x005a, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0057, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r2 = r12[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r2.A0T == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r2.A0T.equals(r8) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        r10.A0B = r2.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r3 = r10.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        r2 = r10.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        r7 = r2.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        r0 = r2.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
    
        if (r10.A08 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        if (r10.A0F == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
    
        r11.add(X.C4BX.BYPASS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006e, code lost:
    
        if (r1 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        r6 = r1.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
    
        if (r6 <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0074, code lost:
    
        if (r6 <= r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0076, code lost:
    
        r11.add(X.C4BX.SCREEN_WIDTH);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007b, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007c, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007d, code lost:
    
        r8 = java.lang.Math.min(r4, r6);
        r7 = r12.length;
        r6 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0084, code lost:
    
        if (r6 >= r7) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0086, code lost:
    
        r1 = r12[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008a, code lost:
    
        if (r1.A0L > r8) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008e, code lost:
    
        if (r1.A05 <= r4) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0090, code lost:
    
        r4 = r1.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0092, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0136, code lost:
    
        if (r5 < 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0138, code lost:
    
        if (r4 >= r5) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013b, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013d, code lost:
    
        if (r3 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013f, code lost:
    
        r3.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0143, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0144, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0145, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0147, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0148, code lost:
    
        r11.toString();
        r1 = A04(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
    
        if (r1 <= r5) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0151, code lost:
    
        r11.add(X.C4BX.FLOOR_RAISED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0156, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0157, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0095, code lost:
    
        r6 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00a0, code lost:
    
        if ("messaging".equals(r7) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a9, code lost:
    
        if ("messenger_story".equals(r7) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ac, code lost:
    
        if (r8 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00b0, code lost:
    
        if (r10.A0A == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b2, code lost:
    
        r8 = r10.A0E;
        r7 = r12.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r5 > 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b6, code lost:
    
        if (r5 >= r7) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00b8, code lost:
    
        r1 = r12[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00bc, code lost:
    
        if (r1.A0T == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c4, code lost:
    
        if (r1.A0T.equals(r8) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c6, code lost:
    
        r10.A0C = r1.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00ca, code lost:
    
        r5 = r10.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00ce, code lost:
    
        if (r10.A09 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        r4 = A00(r10.A04, r12, r10.A00, r10.A01);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A03(java.util.ArrayList r11, X.C4B6[] r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2BJ.A03(java.util.ArrayList, X.4B6[]):int");
    }

    public final int A05(C4B6[] c4b6Arr) {
        Context context = this.A04;
        if (context == null) {
            return 0;
        }
        float f = context.getResources().getDisplayMetrics().widthPixels;
        C4B6 c4b6 = c4b6Arr[0];
        return (int) (f / Math.max(1.0f, c4b6.A0L / c4b6.A0A));
    }

    public C2BJ(Context context, C2B2 c2b2, AbrContextAwareConfiguration abrContextAwareConfiguration, C2A4 c2a4) {
        this.A07 = c2a4;
        this.A04 = context;
        this.A05 = c2b2;
        this.A06 = abrContextAwareConfiguration;
        this.A02 = abrContextAwareConfiguration.getMaxWidthCell();
        this.A03 = abrContextAwareConfiguration.getMaxWidthInlinePlayer();
        this.A0A = abrContextAwareConfiguration.getShouldAvoidOnCellular();
        this.A08 = abrContextAwareConfiguration.isLive ? false : true;
        this.A00 = abrContextAwareConfiguration.getScreenWidthMultiplierLandscapeVideo();
        this.A01 = abrContextAwareConfiguration.getScreenWidthMultiplierPortraitVideo();
        this.A09 = abrContextAwareConfiguration.shouldAvoidOnABR();
    }
}
