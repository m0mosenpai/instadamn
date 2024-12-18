package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SaQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63002SaQ {
    public final Activity A00;
    public final Context A01;
    public final ViewGroup A02;
    public final C60974Rcx A03;
    public final SM4 A04;
    public final InterfaceC65533Tm3 A05;
    public final UserSession A06;

    public C63002SaQ(Activity activity, ViewGroup viewGroup, UserSession userSession, SM4 sm4, InterfaceC65533Tm3 interfaceC65533Tm3) {
        AbstractC167007dF.A1G(viewGroup, 3, sm4);
        this.A06 = userSession;
        this.A00 = activity;
        this.A02 = viewGroup;
        this.A05 = interfaceC65533Tm3;
        this.A04 = sm4;
        Context context = viewGroup.getContext();
        this.A01 = context;
        AbstractC53242c7.A0K(context);
        this.A03 = new C60974Rcx(this, 1);
    }

    public static final void A00(C63002SaQ c63002SaQ, List list, boolean z) {
        C62571SGw c62571SGw = new C62571SGw(c63002SaQ, list, z);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC65553TmW) it.next()).BcU());
        }
        String[] A1b = AbstractC58319PtB.A1b(A0q, 0);
        SM4 sm4 = c63002SaQ.A04;
        UserSession userSession = c63002SaQ.A06;
        C14360o3.A0B(A1b, 1);
        Activity activity = sm4.A01;
        int length = A1b.length;
        if (AbstractC23451Ch.A08(activity, (String[]) Arrays.copyOf(A1b, length))) {
            c62571SGw.A00.A05.DYH();
        } else {
            AbstractC23451Ch.A04(activity, new C64483TFt(6, c62571SGw, userSession, A1b, sm4), (String[]) Arrays.copyOf(A1b, length));
        }
    }

    public final boolean A03() {
        if (Build.VERSION.SDK_INT < 33) {
            if (!AbstractC23451Ch.A07(this.A04.A01, AbstractC43591JPw.A00(2))) {
                return false;
            }
        }
        return true;
    }

    public final void A01() {
        ArrayList A1E = AbstractC166987dD.A1E();
        String A00 = AbstractC43591JPw.A00(8);
        if (!AbstractC23451Ch.A07(this.A04.A01, A00)) {
            A1E.add(new QJY(A00, 2131966672, 2131966675, 2131966674, 2131966673, true));
        }
        A00(this, AbstractC001800i.A0a(A1E), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r12.A06, 36323603575090592L) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(boolean r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            java.lang.String r6 = "android.permission.CAMERA"
            X.SM4 r1 = r12.A04
            android.app.Activity r3 = r1.A01
            boolean r1 = X.AbstractC23451Ch.A07(r3, r6)
            if (r1 != 0) goto L37
            if (r13 == 0) goto L22
            com.instagram.common.session.UserSession r5 = r12.A06
            X.0Tz r4 = X.C06090Tz.A05
            r1 = 36323603575090592(0x810c20000e2da0, double:3.0345313920744135E-306)
            boolean r1 = X.C18U.A06(r4, r5, r1)
            r11 = 0
            if (r1 != 0) goto L23
        L22:
            r11 = 1
        L23:
            r7 = 2131954587(0x7f130b9b, float:1.9545677E38)
            r8 = 2131954590(0x7f130b9e, float:1.9545684E38)
            r9 = 2131954589(0x7f130b9d, float:1.9545681E38)
            r10 = 2131954588(0x7f130b9c, float:1.954568E38)
            X.QJY r5 = new X.QJY
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.add(r5)
        L37:
            r1 = 8
            java.lang.String r2 = X.AbstractC43591JPw.A00(r1)
            boolean r1 = X.AbstractC23451Ch.A07(r3, r2)
            if (r1 != 0) goto L58
            r3 = 2131966672(0x7f133ad0, float:1.9570189E38)
            r4 = 2131966675(0x7f133ad3, float:1.9570195E38)
            r5 = 2131966674(0x7f133ad2, float:1.9570193E38)
            r6 = 2131966673(0x7f133ad1, float:1.957019E38)
            r7 = 1
            X.QJY r1 = new X.QJY
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r1)
        L58:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L64
            X.Tm3 r0 = r12.A05
            r0.DYH()
            return
        L64:
            java.util.List r1 = X.AbstractC001800i.A0a(r0)
            r0 = 0
            A00(r12, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63002SaQ.A02(boolean):void");
    }
}
