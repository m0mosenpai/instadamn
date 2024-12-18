package X;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class WSV implements InterfaceC71939XBo {
    public static final Pattern A06 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public float A00;
    public float A01;
    public Map A02;
    public final C70086W2i A03;
    public final boolean A04;
    public final WFa A05;

    @Override // X.InterfaceC71939XBo
    public final /* synthetic */ void reset() {
    }

    public static long A01(String str) {
        Matcher matcher = A06.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x021d, code lost:
    
        if (r1 != 3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cc, code lost:
    
        if (X.WEU.A02(r3[r28].trim()) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01de, code lost:
    
        if (X.WEU.A02(r3[r15].trim()) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f0, code lost:
    
        if (X.WEU.A02(r3[r8].trim()) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0202, code lost:
    
        if (X.WEU.A02(r3[r12].trim()) == false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020a A[Catch: RuntimeException -> 0x0239, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0239, blocks: (B:72:0x016b, B:74:0x0176, B:76:0x0185, B:78:0x0194, B:81:0x01a2, B:83:0x01a8, B:88:0x01c0, B:91:0x01d2, B:94:0x01e4, B:97:0x01f6, B:101:0x020a, B:103:0x0210, B:108:0x0229, B:107:0x021f, B:120:0x01ae), top: B:71:0x016b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0 A[Catch: RuntimeException -> 0x0239, TryCatch #2 {RuntimeException -> 0x0239, blocks: (B:72:0x016b, B:74:0x0176, B:76:0x0185, B:78:0x0194, B:81:0x01a2, B:83:0x01a8, B:88:0x01c0, B:91:0x01d2, B:94:0x01e4, B:97:0x01f6, B:101:0x020a, B:103:0x0210, B:108:0x0229, B:107:0x021f, B:120:0x01ae), top: B:71:0x016b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d2 A[Catch: RuntimeException -> 0x0239, TryCatch #2 {RuntimeException -> 0x0239, blocks: (B:72:0x016b, B:74:0x0176, B:76:0x0185, B:78:0x0194, B:81:0x01a2, B:83:0x01a8, B:88:0x01c0, B:91:0x01d2, B:94:0x01e4, B:97:0x01f6, B:101:0x020a, B:103:0x0210, B:108:0x0229, B:107:0x021f, B:120:0x01ae), top: B:71:0x016b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4 A[Catch: RuntimeException -> 0x0239, TryCatch #2 {RuntimeException -> 0x0239, blocks: (B:72:0x016b, B:74:0x0176, B:76:0x0185, B:78:0x0194, B:81:0x01a2, B:83:0x01a8, B:88:0x01c0, B:91:0x01d2, B:94:0x01e4, B:97:0x01f6, B:101:0x020a, B:103:0x0210, B:108:0x0229, B:107:0x021f, B:120:0x01ae), top: B:71:0x016b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f6 A[Catch: RuntimeException -> 0x0239, TryCatch #2 {RuntimeException -> 0x0239, blocks: (B:72:0x016b, B:74:0x0176, B:76:0x0185, B:78:0x0194, B:81:0x01a2, B:83:0x01a8, B:88:0x01c0, B:91:0x01d2, B:94:0x01e4, B:97:0x01f6, B:101:0x020a, B:103:0x0210, B:108:0x0229, B:107:0x021f, B:120:0x01ae), top: B:71:0x016b, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(X.WFa r43, java.nio.charset.Charset r44) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSV.A02(X.WFa, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:33|(2:34|35)|(2:(2:38|39)|40)(6:(1:58)|42|43|45|(3:47|48|(3:50|51|52)(1:54))(1:55)|53)|41|42|43|45|(0)(0)|53|31) */
    /* JADX WARN: Failed to find 'out' block for switch in B:101:0x01fa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:104:0x0200. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x01f3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01df  */
    @Override // X.InterfaceC71939XBo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E3P(X.InterfaceC71874X8h r41, X.C70003VzN r42, byte[] r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSV.E3P(X.X8h, X.VzN, byte[], int, int):void");
    }

    public WSV(List list) {
        this.A01 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        this.A05 = new WFa();
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            byte[] bArr = (byte[]) list.get(0);
            Charset charset = AbstractC50482Ts.A05;
            String str = new String(bArr, charset);
            WDn.A01(str.startsWith("Format:"));
            C70086W2i A00 = C70086W2i.A00(str);
            A00.getClass();
            this.A03 = A00;
            A02(new WFa((byte[]) list.get(1)), charset);
            return;
        }
        this.A04 = false;
        this.A03 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r4.add(r3, java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r3 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        r1 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r5.add(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.util.ArrayList((java.util.Collection) r5.get(r3 - 1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.util.List r4, java.util.List r5, long r6) {
        /*
            int r3 = r4.size()
        L4:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L3a
            long r1 = X.AbstractC58320PtC.A0A(r4, r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r1 = X.AbstractC58320PtC.A0A(r4, r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L4
            int r3 = r3 + 1
        L1a:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r4.add(r3, r0)
            if (r3 != 0) goto L2c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L28:
            r5.add(r3, r1)
        L2b:
            return r3
        L2c:
            int r0 = r3 + (-1)
            java.lang.Object r0 = r5.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L28
        L3a:
            r3 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSV.A00(java.util.List, java.util.List, long):int");
    }

    public WSV() {
        this(null);
    }
}
