package X;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51702Yt {
    public int A00;
    public int A01;
    public int A02;
    public File A03;
    public boolean A04;
    public final File A05;
    public final File A06;
    public final List A07;
    public final Context A08;

    public C51702Yt(Context context) {
        long j;
        int size;
        Long valueOf;
        C14360o3.A0B(context, 1);
        this.A08 = context;
        File file = new File(context.getFilesDir(), "uxdata1");
        this.A05 = file;
        File file2 = new File(context.getFilesDir(), "uxdata2");
        this.A06 = file2;
        this.A03 = file;
        this.A02 = 20;
        this.A01 = 4;
        this.A04 = true;
        this.A07 = new ArrayList();
        ArrayList A00 = A00(file);
        ArrayList A002 = A00(file2);
        C2ZV c2zv = (C2ZV) AbstractC001800i.A0J(A00);
        if (c2zv != null) {
            j = c2zv.A03.A00;
        } else {
            j = Long.MAX_VALUE;
        }
        C2ZV c2zv2 = (C2ZV) AbstractC001800i.A0J(A002);
        long j2 = c2zv2 != null ? c2zv2.A03.A00 : Long.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        if (j > j2) {
            arrayList.addAll(A002);
            arrayList.addAll(A00);
            this.A03 = file;
            size = A00.size();
        } else {
            arrayList.addAll(A00);
            arrayList.addAll(A002);
            this.A03 = file2;
            size = A002.size();
        }
        this.A00 = size;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2ZV c2zv3 = (C2ZV) it.next();
            if (!A01(c2zv3)) {
                this.A07.add(c2zv3);
            }
        }
        C2ZV c2zv4 = (C2ZV) AbstractC001800i.A0L(this.A07);
        if (c2zv4 != null && (valueOf = Long.valueOf(c2zv4.A03.A00)) != null) {
            long longValue = valueOf.longValue();
            long j3 = C51652Yn.A00;
            if (longValue < j3) {
                C2ZT c2zt = new C2ZT(j3, C51652Yn.A04);
                C16930sl c16930sl = C16930sl.A00;
                C9BC c9bc = C51652Yn.A01;
                A02(new C2ZV(c9bc, c9bc, c2zt, c16930sl, c16930sl));
            }
        }
        A00.size();
        A002.size();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0090. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a7 A[Catch: all -> 0x0337, TryCatch #2 {all -> 0x0337, blocks: (B:11:0x0032, B:12:0x0040, B:14:0x0046, B:15:0x0090, B:77:0x0093, B:78:0x009f, B:16:0x00a0, B:17:0x0184, B:18:0x01a1, B:20:0x01a7, B:59:0x01af, B:22:0x01b4, B:24:0x01b8, B:25:0x01ce, B:39:0x01d1, B:26:0x01df, B:27:0x0234, B:30:0x01eb, B:31:0x01f3, B:32:0x01fd, B:33:0x0209, B:34:0x0213, B:35:0x0219, B:36:0x021f, B:37:0x0229, B:42:0x0242, B:49:0x02f4, B:50:0x0302, B:53:0x030f, B:55:0x0266, B:56:0x02a0, B:57:0x02d5, B:63:0x031d, B:64:0x00b9, B:65:0x00d0, B:66:0x00e7, B:67:0x0115, B:68:0x012b, B:69:0x013d, B:70:0x014f, B:71:0x0158, B:72:0x0161, B:73:0x016a, B:74:0x0173, B:75:0x017c), top: B:10:0x0032, outer: #4 }] */
    /* JADX WARN: Type inference failed for: r11v13, types: [X.2ZX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14, types: [X.2Zb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [X.2ZZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, X.Rd8] */
    /* JADX WARN: Type inference failed for: r11v19, types: [X.4fr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20, types: [X.4gr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22, types: [X.PuA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [X.2a1, X.2ZT] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList A00(java.io.File r29) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51702Yt.A00(java.io.File):java.util.ArrayList");
    }

    private final boolean A01(C2ZV c2zv) {
        List list = this.A07;
        C2ZV c2zv2 = (C2ZV) AbstractC001800i.A0L(list);
        if (c2zv2 != null) {
            C2ZT c2zt = c2zv.A03;
            boolean z = c2zt instanceof C2ZS;
            if (!z || !C14360o3.A0K(c2zv2.A03, c2zt)) {
                C2ZT c2zt2 = c2zv2.A03;
                if ((c2zt2 instanceof C51992Zz) && (z || (c2zt instanceof C51972Zx))) {
                    c2zt.A00 = c2zt2.A00;
                } else {
                    if ((c2zt instanceof C52012a1) && c2zv.A04.isEmpty() && c2zv.A05.isEmpty() && (c2zt2 instanceof C52012a1) && c2zv2.A04.isEmpty() && c2zv2.A05.isEmpty()) {
                        ((C52012a1) c2zt2).A00 = true;
                        return true;
                    }
                    return false;
                }
            }
            list.set(list.size() - 1, c2zv);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C2ZV r18) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51702Yt.A02(X.2ZV):void");
    }
}
