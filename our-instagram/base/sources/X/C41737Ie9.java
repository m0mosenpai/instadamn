package X;

import android.app.Activity;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Ie9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41737Ie9 {
    public static final C41737Ie9 A00 = new Object();

    public static final void A01(Activity activity, MediaControlEventSourceEnum mediaControlEventSourceEnum, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, InterfaceC43585JPa interfaceC43585JPa, C75113Zb c75113Zb, C26914BuH c26914BuH) {
        InterfaceC84443pn AoG;
        String str;
        C14360o3.A0B(c75113Zb, 3);
        int ordinal = c75113Zb.A0o.ordinal();
        if (ordinal != 24) {
            if (ordinal != 3) {
                AoG = c38321qM.A0C.B5w();
            } else {
                AoG = c38321qM.A0C.B3L();
            }
        } else {
            AoG = c38321qM.A0C.AoG();
        }
        if (AoG != null) {
            CUQ AKL = AoG.AKL();
            List B7a = AoG.B7a();
            if (B7a == null) {
                C88173wR A002 = A00(EnumC39593He3.A0C, AbstractC166997dE.A0p(activity, 2131968684));
                C88173wR A003 = A00(EnumC39593He3.A0A, AbstractC166997dE.A0p(activity, 2131968680));
                User A14 = AbstractC25226BEj.A14(c38321qM);
                if (A14 != null) {
                    str = A14.getUsername();
                } else {
                    str = "";
                }
                B7a = AbstractC16960so.A1Q(A002, A003, A00(EnumC39593He3.A0B, AbstractC31177DnL.A0b(activity, str, 2131968681)), A00(EnumC39593He3.A0D, AbstractC166997dE.A0p(activity, 2131968685)), A00(EnumC39593He3.A0E, AbstractC166997dE.A0p(activity, 2131968683)), A00(EnumC39593He3.A0H, AbstractC166997dE.A0p(activity, 2131968682)));
            }
            AKL.A04 = B7a;
            C84433pm A004 = AKL.A00();
            if (c75113Zb.A0o.ordinal() == 24) {
                c38321qM.A0C.ERY(A004);
            } else {
                c38321qM.A0C.EUP(A004);
            }
            if (c26914BuH != null) {
                C26914BuH.A01(c26914BuH, C05F.A0Y, c38321qM.getId());
            }
            AnonymousClass341 anonymousClass341 = c75113Zb.A0o;
            C42654IuB c42654IuB = new C42654IuB(activity, mediaControlEventSourceEnum, interfaceC11380iw, userSession, c38321qM, interfaceC43585JPa, c75113Zb);
            KBU kbu = new KBU();
            kbu.A01(AoG);
            kbu.A04 = c42654IuB;
            kbu.A05 = anonymousClass341;
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A1C = false;
            AbstractC31173DnH.A0w(activity, kbu, A0y);
        }
    }

    public static final C88173wR A00(EnumC39593He3 enumC39593He3, String str) {
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
    public static final void A02(X.InterfaceC84443pn r6, X.InterfaceC88183wS r7, com.instagram.api.schemas.MediaControlEventSourceEnum r8, X.C38321qM r9, X.InterfaceC43585JPa r10, X.C75113Zb r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C41737Ie9.A02(X.3pn, X.3wS, com.instagram.api.schemas.MediaControlEventSourceEnum, X.1qM, X.JPa, X.3Zb):void");
    }
}
