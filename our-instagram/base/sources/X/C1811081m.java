package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.81m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1811081m {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;

    public C1811081m(Context context, UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A02 = context;
        this.A03 = userSession;
        this.A00 = z;
        this.A01 = z2;
    }

    public final C1811881u A00(C22P c22p, C81O c81o, C55U c55u, Map map) {
        C14360o3.A0B(c55u, 0);
        C14360o3.A0B(map, 2);
        if (!A01(c22p, c81o).contains(c55u)) {
            return C1811881u.A03;
        }
        AbstractC1811781t abstractC1811781t = (AbstractC1811781t) map.get(c55u);
        if (abstractC1811781t != null) {
            C1811881u c1811881u = (C1811881u) ((Pair) abstractC1811781t.A01.A00).second;
            c1811881u.A02(c81o.A01);
            return c1811881u;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown destination: ");
        sb.append(c55u);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8.A03, 36324398143320215L) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8.A03, 2342153431533223992L) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010e, code lost:
    
        if (r3 == 3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashSet A01(X.C22P r9, X.C81O r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1811081m.A01(X.22P, X.81O):java.util.LinkedHashSet");
    }
}
