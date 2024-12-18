package X;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.OMr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54846OMr {
    public InterfaceC02550Ad A00;
    public C54833OLs A01;
    public C11N A02;
    public File A03;
    public List A04;
    public boolean A05 = true;

    public final void A01(Context context, android.net.Uri uri) {
        this.A01 = new C54833OLs(uri, new N0R(), null, null, AbstractC25225BEi.A16(context));
    }

    public final void A02(Context context, android.net.Uri uri, EnumC58332PtQ enumC58332PtQ, String str) {
        C14360o3.A0B(uri, 1);
        this.A01 = new C54833OLs(uri, new N0Q(), enumC58332PtQ, str, AbstractC25225BEi.A16(context));
    }

    public final void A04(C11N c11n, File file, boolean z) {
        C14360o3.A0B(c11n, 1);
        this.A03 = file;
        this.A02 = c11n;
        this.A05 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.net.Uri] */
    public final void A05(C11N c11n, String str) {
        String path;
        C14360o3.A0B(str, 0);
        android.net.Uri A0h = AbstractC002300n.A0h(str, "file:/", false);
        if (A0h != 0) {
            try {
                A0h = AbstractC08820cl.A03(str);
            } catch (SecurityException unused) {
            }
            if (A0h != 0 && (path = A0h.getPath()) != null) {
                str = path;
            }
        }
        A04(c11n, AbstractC166987dD.A11(str), true);
    }

    public final void A07(String... strArr) {
        C14360o3.A0B(strArr, 0);
        List asList = Arrays.asList(strArr);
        C14360o3.A07(asList);
        this.A04 = asList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7 A[Catch: all -> 0x0163, TryCatch #1 {all -> 0x0163, blocks: (B:17:0x0078, B:19:0x007e, B:60:0x0092, B:62:0x00a8, B:67:0x00c5, B:72:0x00cc, B:73:0x00cf, B:21:0x00d0, B:23:0x00d7, B:25:0x00db, B:27:0x00df, B:54:0x0162, B:30:0x00e8, B:34:0x0129, B:36:0x0131, B:37:0x0135, B:44:0x0155, B:53:0x015f, B:55:0x010d, B:57:0x0122, B:75:0x00d3, B:39:0x0141, B:40:0x0149, B:42:0x0150, B:49:0x015a), top: B:16:0x0078, inners: #4, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150 A[Catch: all -> 0x0159, LOOP:0: B:40:0x0149->B:42:0x0150, LOOP_END, TRY_LEAVE, TryCatch #4 {all -> 0x0159, blocks: (B:39:0x0141, B:40:0x0149, B:42:0x0150), top: B:38:0x0141, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0155 A[EDGE_INSN: B:43:0x0155->B:44:0x0155 BREAK  A[LOOP:0: B:40:0x0149->B:42:0x0150], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d A[Catch: all -> 0x0163, TryCatch #1 {all -> 0x0163, blocks: (B:17:0x0078, B:19:0x007e, B:60:0x0092, B:62:0x00a8, B:67:0x00c5, B:72:0x00cc, B:73:0x00cf, B:21:0x00d0, B:23:0x00d7, B:25:0x00db, B:27:0x00df, B:54:0x0162, B:30:0x00e8, B:34:0x0129, B:36:0x0131, B:37:0x0135, B:44:0x0155, B:53:0x015f, B:55:0x010d, B:57:0x0122, B:75:0x00d3, B:39:0x0141, B:40:0x0149, B:42:0x0150, B:49:0x015a), top: B:16:0x0078, inners: #4, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Type inference failed for: r1v47, types: [X.0bW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C53086Ndz A00() {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54846OMr.A00():X.Ndz");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.net.Uri] */
    public final void A06(String str) {
        String path;
        android.net.Uri A0h = AbstractC002300n.A0h(str, "file:/", false);
        if (A0h != 0) {
            try {
                A0h = AbstractC08820cl.A03(str);
            } catch (SecurityException unused) {
            }
            if (A0h != 0 && (path = A0h.getPath()) != null) {
                str = path;
            }
        }
        this.A03 = AbstractC166987dD.A11(str);
    }

    public final void A03(C11N c11n, File file, String str) {
        A04(c11n, MSW.A0w(file, str), AbstractC167017dG.A1a(file, str));
    }
}
