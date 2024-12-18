package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Sfg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63228Sfg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.jar.JarFile, java.util.zip.ZipFile] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C62613SIv A00(java.io.File r18, java.util.Set r19) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63228Sfg.A00(java.io.File, java.util.Set):X.SIv");
    }

    public static void A03(SJU sju, List list) {
        String str;
        StringBuilder A11;
        for (int i = 0; i < list.size(); i++) {
            String A1I = AbstractC25226BEj.A1I(list, i);
            if (A1I != null && A1I.length() != 0) {
                String str2 = sju.A02;
                if (str2 != null && str2.length() != 0) {
                    int indexOf = A1I.indexOf(46);
                    if (indexOf == 0) {
                        A11 = AbstractC166987dD.A1C();
                    } else if (indexOf >= 0) {
                        list.set(i, A1I);
                    } else {
                        A11 = AbstractC166997dE.A11(str2);
                        str2 = ".";
                    }
                    A1I = MSZ.A0u(str2, A1I, A11);
                    list.set(i, A1I);
                } else {
                    str = "Package name is empty.";
                }
            } else {
                str = "Empty component name.";
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Failed to parse AndroidManifest.xml in ");
            A1C.append(sju.A01);
            throw new IOException(MSZ.A0u(": ", str, A1C));
        }
    }

    public static String A01(SJU sju, int i) {
        String str = (String) AbstractC166997dE.A0m(sju.A09, i);
        if (str != null) {
            return str;
        }
        throw AbstractC31175DnJ.A0U("String not found: ", i);
    }

    public static HashMap A02(C63219SfP c63219SfP, SJU sju, int i) {
        String A01;
        HashMap A1G = AbstractC166987dD.A1G();
        for (int i2 = 0; i2 < i; i2++) {
            int A02 = c63219SfP.A02();
            int A022 = c63219SfP.A02();
            int A023 = c63219SfP.A02();
            int i3 = c63219SfP.A00;
            short A03 = c63219SfP.A03();
            c63219SfP.A01();
            c63219SfP.A01();
            int A024 = c63219SfP.A02();
            int i4 = A03 - (c63219SfP.A00 - i3);
            if (i4 > 0) {
                c63219SfP.A04(i4);
            }
            if (A02 >= 0) {
                A01(sju, A02);
            }
            String A012 = A01(sju, A022);
            if (A023 < 0) {
                A01 = Integer.toString(A024);
                if (A01 == null) {
                }
            } else {
                A01 = A01(sju, A023);
            }
            A1G.put(A012, A01);
        }
        return A1G;
    }
}
