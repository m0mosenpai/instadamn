package X;

import android.content.Context;
import com.google.common.io.Files;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226809zc {
    public static final ArrayList A00(Context context, UserSession userSession, String str, List list) {
        boolean A1V = AbstractC167007dF.A1V(list);
        ArrayList A12 = AbstractC166997dE.A12(str, 3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C115475Kh c115475Kh = (C115475Kh) it.next();
            File A03 = AMc.A03(C2Ps.A00(context, userSession), str, ".mp4", "duplicate_copy");
            Files.A01(AbstractC166987dD.A11(c115475Kh.A0G.A0F), A03);
            C115525Km c115525Km = c115475Kh.A0G;
            C195868lW c195868lW = new C195868lW(C8IU.A03(A03, 3, 0), c115525Km.A09, c115525Km.A05, c115525Km.A07);
            int i = c115475Kh.A0G.A08;
            int i2 = c115475Kh.A08 - c115475Kh.A09;
            C115525Km A00 = AbstractC23036ADs.A00(c195868lW, i, i2, i2);
            C115545Ko c115545Ko = c115475Kh.A0F;
            float f = c115475Kh.A00;
            int i3 = c115475Kh.A09;
            int i4 = c115475Kh.A08;
            boolean z = c115475Kh.A0R;
            C18160v1 c18160v1 = c115475Kh.A0E;
            boolean z2 = c115475Kh.A0O;
            boolean z3 = c115475Kh.A0S;
            boolean z4 = c115475Kh.A0U;
            String str2 = c115475Kh.A0I;
            C26086BgF c26086BgF = c115475Kh.A0D;
            String str3 = c115475Kh.A0M;
            String str4 = c115475Kh.A0N;
            int i5 = c115475Kh.A07;
            C115475Kh c115475Kh2 = new C115475Kh(c26086BgF, c18160v1, c115545Ko, A00, str2, str3, str4, c115475Kh.A0L, null, f, i3, i4, c115475Kh.A05, i5, c115475Kh.A06, c115475Kh.A04, 2143292480, z, z2, z3, z4);
            c115475Kh2.A0R = A1V;
            A12.add(c115475Kh2);
        }
        return A12;
    }
}
