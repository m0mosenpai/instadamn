package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FeP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35122FeP {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C35122FeP(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
    }

    public static final String A00(C35122FeP c35122FeP, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!AbstractC31171DnF.A1W(c35122FeP.A02, obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A01(java.lang.String r4) {
        /*
            android.net.Uri r3 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L29
            java.util.List r0 = r3.getPathSegments()     // Catch: java.lang.Exception -> L29
            r2 = 1
            if (r0 == 0) goto L12
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L29
            r0 = 0
            if (r1 == 0) goto L13
        L12:
            r0 = 1
        L13:
            if (r0 != 0) goto L31
            int r0 = X.AbstractC31174DnI.A04(r3)     // Catch: java.lang.Exception -> L29
            if (r0 == r2) goto L31
            java.util.List r1 = r3.getPathSegments()     // Catch: java.lang.Exception -> L29
            int r0 = X.AbstractC31174DnI.A04(r3)     // Catch: java.lang.Exception -> L29
            int r0 = r0 - r2
            java.lang.String r4 = X.AbstractC25226BEj.A1I(r1, r0)     // Catch: java.lang.Exception -> L29
            return r4
        L29:
            r2 = move-exception
            java.lang.String r1 = "AppointmentBookingXMACtaHandler"
            java.lang.String r0 = "error in parsing payload url"
            X.C0w9.A06(r1, r0, r2)
        L31:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35122FeP.A01(java.lang.String):java.lang.String");
    }
}
