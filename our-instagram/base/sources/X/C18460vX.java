package X;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0vX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18460vX implements C0OH {
    @Override // X.C0OH
    public final C0NA AAY(C0NA c0na, Integer num) {
        C0M6 c0m6;
        C14360o3.A0B(num, 0);
        C14360o3.A0B(c0na, 1);
        if (num == C05F.A0C || num == C05F.A0j || num == C05F.A1I || num == C05F.A0Y) {
            C0TI c0ti = new C0N9() { // from class: X.0TI
                @Override // X.C0N9
                public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
                    C14360o3.A0B(c0nk, 0);
                    HashSet A03 = c0nk.A05().A03();
                    int size = A03.size();
                    File[] fileArr = new File[size];
                    Iterator it = A03.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        fileArr[i] = c0nk.A05().A02((String) it.next());
                        i++;
                    }
                    C10850hu c10850hu = C04I.A02;
                    return new C04I(C0X6.A00(), (File[]) Arrays.copyOf(fileArr, size));
                }
            };
            if (C0M4.A00()) {
                c0m6 = C0M6.LARGE_REPORT;
            } else {
                c0m6 = C0M6.CRITICAL_REPORT;
            }
            c0na.A02(c0m6, c0ti);
        }
        return c0na;
    }

    @Override // X.C0OH
    public final C0NM AAb(C0NM c0nm, C03970Jn c03970Jn) {
        C14360o3.A0B(c0nm, 1);
        return c0nm;
    }
}
