package X;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ob8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55097Ob8 {
    public static final Map A06 = AbstractC167007dF.A0n("ig4a_media_accuracy_dyn_sampling", "gk:ig4a_media_accuracy_dyn_sampling");
    public final OLV A00;
    public final File A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final java.util.Set A05;

    public C55097Ob8(OLV olv, File file, String str, Map map) {
        C14360o3.A0B(str, 2);
        this.A03 = str;
        this.A00 = olv;
        this.A04 = map;
        this.A01 = MSW.A0w(file, "media_accuracy");
        this.A02 = AnonymousClass001.A0C(str, '_');
        this.A05 = AbstractC31171DnF.A0l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0e5] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final List A01(String str, boolean z) {
        String str2;
        ?? A1D;
        C51673Ms4 c51673Ms4;
        Integer num;
        List list = null;
        if (!z) {
            str2 = "_snapshot.png";
        } else {
            str2 = "_ready.png";
        }
        try {
            File file = this.A01;
            String[] list2 = file.list(new C56831PKb(this, str2));
            if (list2 != null) {
                A1D = AbstractC166987dD.A1E();
                for (String str3 : list2) {
                    List A0R = AbstractC001900j.A0R(AbstractC001900j.A0G(str2, AbstractC001900j.A0F(this.A02, str3)), new String[]{"_"}, 2);
                    if (A0R.size() == 2) {
                        Long A0j = AbstractC166997dE.A0j(AbstractC25226BEj.A1I(A0R, 0));
                        if (A0j != null) {
                            long longValue = A0j.longValue();
                            String A0s = AbstractC31173DnH.A0s(A0R, 1);
                            String str4 = this.A03;
                            String A0i = MSX.A0i(MSW.A0w(file, str3));
                            if (C14360o3.A0K(A0s, str4)) {
                                num = C05F.A0C;
                            } else {
                                num = C05F.A01;
                            }
                            c51673Ms4 = new C51673Ms4(Boolean.valueOf(z), num, str4, A0s, A0i, "image/x-png", str, longValue);
                        } else {
                            c51673Ms4 = null;
                        }
                    } else {
                        c51673Ms4 = null;
                    }
                    if (c51673Ms4 != null) {
                        A1D.add(c51673Ms4);
                    }
                }
            } else {
                A1D = 0;
            }
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        Throwable A00 = C09550e6.A00(A1D);
        if (A00 == null) {
            list = A1D;
        } else {
            this.A00.A02(C05F.A00, null, null, null, A00, null);
        }
        List list3 = list;
        if (list3 == null) {
            return C16930sl.A00;
        }
        return list3;
    }

    public final void A03(String str) {
        Object A1D;
        C14360o3.A0B(str, 0);
        try {
            A1D = Boolean.valueOf(AbstractC166987dD.A11(str).delete());
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        Throwable A00 = C09550e6.A00(A1D);
        if (A00 != null) {
            this.A00.A01(C05F.A00, null, null, null, null, null, A00, AbstractC167007dF.A0n("file_name", str), null);
        }
    }

    public static final File A00(C55097Ob8 c55097Ob8, String str) {
        File file = c55097Ob8.A01;
        if (!file.exists()) {
            file.mkdir();
        }
        File A0w = MSW.A0w(file, str);
        A0w.getCanonicalPath();
        return A0w;
    }

    public final void A02() {
        try {
            File file = this.A01;
            String[] list = file.list();
            C14360o3.A07(list);
            for (String str : list) {
                A03(MSX.A0i(MSW.A0w(file, str)));
            }
        } catch (Throwable th) {
            new C09540e5(th);
        }
    }

    public final void A04(String str) {
        java.util.Set set = this.A05;
        FileOutputStream A0x = MSW.A0x(A00(this, AnonymousClass001.A0R("media_accuracy_tags__", str)));
        A0x.write(MSY.A1a(AbstractC31175DnJ.A0a("\n", set)));
        A0x.close();
        set.clear();
    }
}
