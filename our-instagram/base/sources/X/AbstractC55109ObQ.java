package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.ObQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55109ObQ {
    public static final Dialog A00(Context context, UserSession userSession, Integer num, boolean z) {
        Context context2;
        C14360o3.A0B(userSession, 1);
        boolean A03 = A03(userSession, num);
        if (z) {
            context2 = AbstractC53172bz.A01(context);
        } else {
            context2 = context;
        }
        if (A03) {
            DialogC50731MaZ dialogC50731MaZ = new DialogC50731MaZ(context2);
            dialogC50731MaZ.setCancelable(false);
            String A0p = AbstractC166997dE.A0p(context, 2131972836);
            View findViewById = dialogC50731MaZ.findViewById(R.id.message);
            C14360o3.A07(findViewById);
            TextView textView = (TextView) findViewById;
            textView.setVisibility(0);
            textView.setText(A0p);
            return dialogC50731MaZ;
        }
        C6WQ c6wq = new C6WQ(context2, true);
        MSX.A0w(context, c6wq, 2131969966);
        return c6wq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r5 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (r1 != 2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        if (r5 != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C31727DwY A01(android.content.Context r6, android.view.View.OnClickListener r7, android.view.View.OnClickListener r8, android.view.View.OnClickListener r9, com.instagram.common.session.UserSession r10, java.lang.Integer r11, boolean r12, boolean r13) {
        /*
            r0 = 1
            X.C14360o3.A0B(r10, r0)
            if (r13 == 0) goto L4e
            android.content.Context r0 = X.AbstractC53172bz.A01(r6)
            X.MYs r2 = new X.MYs
            r2.<init>(r0, r10)
            X.2q3 r1 = X.EnumC60792q3.A03
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r2.A02 = r1
        L17:
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36321507630720539(0x810a380009261b, double:3.0332059084151014E-306)
            boolean r5 = X.C18U.A06(r3, r10, r0)
            int r1 = r11.intValue()
            r0 = 0
            if (r1 == r0) goto L4a
            r0 = 1
            if (r1 == r0) goto L4a
            r3 = 2
            r0 = 2131955432(0x7f130ee8, float:1.9547391E38)
            if (r1 == r3) goto L35
            r0 = 2131955926(0x7f1310d6, float:1.9548393E38)
        L35:
            java.lang.String r3 = r6.getString(r0)
            r0 = 0
            if (r1 == r0) goto L5d
            r0 = 1
            if (r1 == r0) goto L54
            r0 = 2
            if (r1 == r0) goto L61
            r0 = 3
            if (r1 == r0) goto L5d
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4a:
            r0 = 2131955927(0x7f1310d7, float:1.9548395E38)
            goto L35
        L4e:
            X.MYs r2 = new X.MYs
            r2.<init>(r6, r10)
            goto L17
        L54:
            r0 = 2131955424(0x7f130ee0, float:1.9547375E38)
            if (r5 == 0) goto L64
            r0 = 2131955425(0x7f130ee1, float:1.9547377E38)
            goto L64
        L5d:
            r0 = 2131955823(0x7f13106f, float:1.9548184E38)
            goto L64
        L61:
            r0 = 2131955431(0x7f130ee7, float:1.954739E38)
        L64:
            java.lang.String r0 = r6.getString(r0)
            r2.A0C(r3, r0)
            r0 = 3
            X.OjI r3 = new X.OjI
            r3.<init>(r0, r7, r10, r12)
            r0 = 4
            X.OjI r4 = new X.OjI
            r4.<init>(r0, r8, r10, r12)
            java.lang.Integer r0 = X.C05F.A01
            if (r11 != r0) goto Lb0
            r0 = 2131973861(0x7f1356e5, float:1.958477E38)
            r2.A02(r4, r0)
            r0 = 2131955420(0x7f130edc, float:1.9547367E38)
            if (r5 == 0) goto L89
            r0 = 2131973854(0x7f1356de, float:1.9584756E38)
        L89:
            r2.A03(r3, r0)
        L8c:
            r0 = 0
            if (r1 == r0) goto L97
            r0 = 1
            if (r1 != r0) goto L97
            r3 = 2131956794(0x7f13143a, float:1.9550154E38)
            if (r5 == 0) goto L9a
        L97:
            r3 = 2131955422(0x7f130ede, float:1.9547371E38)
        L9a:
            r1 = 2
            X.OjI r0 = new X.OjI
            r0.<init>(r1, r9, r10, r12)
            r2.A03(r0, r3)
            X.P2q r0 = new X.P2q
            r0.<init>(r10, r12)
            r2.A03 = r0
            X.DwY r0 = new X.DwY
            r0.<init>(r2)
            return r0
        Lb0:
            r0 = 0
            if (r1 == r0) goto Lb9
            r0 = 1
            if (r1 == r0) goto Lc8
            r0 = 2
            if (r1 == r0) goto Lcd
        Lb9:
            r0 = 2131955427(0x7f130ee3, float:1.9547381E38)
        Lbc:
            r2.A01(r3, r0)
            if (r8 == 0) goto L8c
            r0 = 2131973861(0x7f1356e5, float:1.958477E38)
            r2.A03(r4, r0)
            goto L8c
        Lc8:
            r0 = 2131955420(0x7f130edc, float:1.9547367E38)
            if (r5 == 0) goto Lbc
        Lcd:
            r0 = 2131973854(0x7f1356de, float:1.9584756E38)
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55109ObQ.A01(android.content.Context, android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, com.instagram.common.session.UserSession, java.lang.Integer, boolean, boolean):X.DwY");
    }

    public static final boolean A03(UserSession userSession, Integer num) {
        C06090Tz c06090Tz;
        long j;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return true;
                }
                c06090Tz = C06090Tz.A05;
                j = 36321507630327317L;
            } else {
                c06090Tz = C06090Tz.A05;
                j = 36321507630786076L;
            }
        } else {
            c06090Tz = C06090Tz.A05;
            j = 36321507630851613L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public static final void A02(C95394Qz c95394Qz, UserSession userSession, Integer num, final InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167017dG.A1N(userSession, c95394Qz);
        long A00 = c95394Qz.A00(TimeUnit.MILLISECONDS);
        if (A00 < 1000 && A03(userSession, num)) {
            long j = 1000 - A00;
            if (j != 0) {
                C11T.A04(new Runnable() { // from class: X.PMd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        InterfaceC16820sZ.this.invoke();
                    }
                }, j);
                return;
            }
        }
        interfaceC16820sZ.invoke();
    }
}
