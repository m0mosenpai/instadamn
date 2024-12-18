package X;

import android.text.TextUtils;
import java.util.LinkedList;

/* loaded from: classes10.dex */
public final class SNI {
    public final C62952SYu A00;

    public SNI(C62952SYu c62952SYu) {
        this.A00 = c62952SYu;
    }

    public final void A00(String str, String str2) {
        A01("failures", new String[]{str, str2}, 1L);
    }

    public final void A01(String str, String[] strArr, long j) {
        LinkedList A11 = AbstractC58318PtA.A11();
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                A11.add(str2);
            }
        }
        C62952SYu c62952SYu = this.A00;
        SP7 sp7 = new SP7(str, j);
        sp7.A01 = A11;
        c62952SYu.A00(sp7);
    }
}
