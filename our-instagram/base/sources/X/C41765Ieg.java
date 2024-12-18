package X;

import android.app.Activity;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ieg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41765Ieg {
    public static final C41765Ieg A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A05(X.C38321qM r5, X.EnumC75193Zm r6, X.C75113Zb r7) {
        /*
            r4 = 0
            r3 = 15
            r0 = 3
            int r1 = r6.ordinal()
            r2 = 1
            if (r1 == r3) goto L19
            if (r1 == r0) goto L12
            r0 = 16
            if (r1 == r0) goto L12
            return r4
        L12:
            X.3pn r0 = A00(r5, r7)
            if (r0 != 0) goto L28
            return r4
        L19:
            X.1rF r0 = r5.A0C
            X.3pn r0 = r0.B5g()
            if (r0 != 0) goto L28
            r1 = 0
        L22:
            com.instagram.api.schemas.ConfirmationStyle r0 = com.instagram.api.schemas.ConfirmationStyle.A05
            if (r1 == r0) goto L27
            r2 = 0
        L27:
            return r2
        L28:
            com.instagram.api.schemas.ConfirmationStyle r1 = r0.AqJ()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41765Ieg.A05(X.1qM, X.3Zm, X.3Zb):boolean");
    }

    public static final InterfaceC84443pn A00(C38321qM c38321qM, C75113Zb c75113Zb) {
        int ordinal = c75113Zb.A0o.ordinal();
        if (ordinal != 3) {
            if (ordinal != 24) {
                return c38321qM.A0C.B5w();
            }
            return c38321qM.A0C.AoG();
        }
        return c38321qM.A0C.B3L();
    }

    public static final C88173wR A01(EnumC39593He3 enumC39593He3, String str) {
        C84433pm c84433pm;
        String str2 = enumC39593He3.A01;
        C14360o3.A0B(str2, 0);
        C88173wR c88173wR = new C88173wR(null, null, str2, null, str, true);
        C84433pm c84433pm2 = c88173wR.A00;
        String str3 = c88173wR.A02;
        String str4 = c88173wR.A04;
        String obj = MediaOptionStyle.A07.toString();
        if (c84433pm2 != null) {
            c84433pm = c84433pm2.EtX();
        } else {
            c84433pm = null;
        }
        return new C88173wR(c84433pm, null, str3, obj, str4, true);
    }

    public static final void A02(Activity activity, InterfaceC84443pn interfaceC84443pn, MediaControlEventSourceEnum mediaControlEventSourceEnum, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, InterfaceC43585JPa interfaceC43585JPa, C75113Zb c75113Zb) {
        AnonymousClass341 anonymousClass341 = c75113Zb.A0o;
        C42653IuA c42653IuA = new C42653IuA(activity, mediaControlEventSourceEnum, interfaceC11380iw, userSession, c38321qM, interfaceC43585JPa, c75113Zb);
        C14360o3.A0B(interfaceC84443pn, 2);
        KBU kbu = new KBU();
        kbu.A01(interfaceC84443pn);
        kbu.A04 = c42653IuA;
        kbu.A05 = anonymousClass341;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A1C = false;
        AbstractC31173DnH.A0w(activity, kbu, A0y);
    }

    public static final void A03(C84433pm c84433pm, C38321qM c38321qM, C75113Zb c75113Zb) {
        int ordinal = c75113Zb.A0o.ordinal();
        if (ordinal != 3) {
            if (ordinal != 24) {
                c38321qM.A0C.EUP(c84433pm);
                return;
            } else {
                c38321qM.A0C.ERY(c84433pm);
                return;
            }
        }
        c38321qM.A0C.ETz(c84433pm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (r7 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        if (r6 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.InterfaceC84443pn r6, X.InterfaceC88183wS r7, com.instagram.api.schemas.MediaControlEventSourceEnum r8, X.C38321qM r9, X.InterfaceC43585JPa r10, X.C75113Zb r11) {
        /*
            com.instagram.api.schemas.MediaControlEventSourceEnum r0 = com.instagram.api.schemas.MediaControlEventSourceEnum.A08
            if (r8 == r0) goto L3a
            r1 = 0
            if (r6 == 0) goto L40
            java.lang.String r0 = r6.AqK()
            if (r0 == 0) goto L40
            java.lang.String r3 = r6.AqK()
        L11:
            java.lang.String r0 = r6.AqH()
            if (r0 == 0) goto L44
            java.lang.String r0 = r6.AqH()
        L1b:
            r4 = r0
            if (r3 != 0) goto L20
            r4 = r1
            r3 = r0
        L20:
            if (r7 == 0) goto L3b
            X.He3 r1 = X.IQd.A00(r7)
            X.He3 r0 = X.EnumC39593He3.A0H
            if (r1 == r0) goto L3b
            X.He3 r0 = X.IQd.A00(r7)
            if (r0 == 0) goto L3b
            int r5 = r0.A00
        L32:
            r6 = 1
        L33:
            r7 = 0
            r1 = r9
            r0 = r10
            r2 = r11
            r0.CMs(r1, r2, r3, r4, r5, r6, r7)
        L3a:
            return
        L3b:
            r5 = 0
            r6 = 0
            if (r7 == 0) goto L33
            goto L32
        L40:
            r3 = r1
            if (r6 == 0) goto L44
            goto L11
        L44:
            r0 = r1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41765Ieg.A04(X.3pn, X.3wS, com.instagram.api.schemas.MediaControlEventSourceEnum, X.1qM, X.JPa, X.3Zb):void");
    }
}
