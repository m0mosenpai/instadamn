package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* renamed from: X.Ovx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56137Ovx implements InterfaceC13000lm {
    public Vector A00;
    public C05A A01;
    public C05A A02;
    public final UserSession A03;
    public final C0UO A04;
    public final C0UO A05;

    public C56137Ovx(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A01 = A0z;
        this.A04 = AbstractC208910l.A02(A0z);
        C008002u A00 = C10E.A00(C16910sj.A00);
        this.A02 = A00;
        this.A05 = AbstractC208910l.A02(A00);
        this.A00 = new Vector();
    }

    public final String A00(String str) {
        Object obj;
        C14360o3.A0B(str, 0);
        List A1A = MSW.A1A(this.A01);
        if (A1A == null) {
            return null;
        }
        Iterator it = A1A.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((OAC) obj).A00, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        OAC oac = (OAC) obj;
        if (oac == null) {
            return null;
        }
        return oac.A02;
    }

    public final void A01(Context context) {
        this.A01.Egh(null);
        C2JM A0b = AbstractC25225BEi.A0b();
        UserSession userSession = this.A03;
        ArrayList A00 = AMd.A00(context, userSession, "ig_android_access_library_igig_feed_cross_posting", "FxIgIgFeedXpostingHelper", null, EnumC200798uM.INSTAGRAM);
        ArrayList A0q = AbstractC167017dG.A0q(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            C203148yW c203148yW = (C203148yW) it.next();
            C2JO c2jo = new C2JO();
            c2jo.A09(c203148yW.A01.A00, AbstractC111324zv.A00(3071));
            A0q.add(c2jo);
        }
        A0b.A05("target_logged_in_account_tokens", ImmutableList.copyOf((Collection) A0q));
        C907442n c907442n = new C907442n(A0b, C51549MpZ.class, "IGFxGenEligibleIgIgCrosspostingAccounts", false);
        C195928le.A00(userSession).ATV(C55658Onj.A00, new C55665Onq(4, this, context), c907442n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (A03(true, r1, r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        A01(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
    
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r6.CKo() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r6.A0x() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.content.Context r5, X.C47Z r6) {
        /*
            r4 = this;
            X.05A r1 = r4.A02
            X.0sj r0 = X.C16910sj.A00
            r1.Egh(r0)
            java.util.Vector r0 = r4.A00
            r0.clear()
            r3 = 0
            r2 = 1
            if (r6 == 0) goto L1d
            boolean r0 = r6.A0t()
            if (r0 == 0) goto L1d
            boolean r0 = r6.CKo()
            r1 = 1
            if (r0 == 0) goto L20
        L1d:
            r1 = 0
            if (r6 == 0) goto L26
        L20:
            boolean r0 = r6.A0x()
            if (r0 != 0) goto L27
        L26:
            r3 = 1
        L27:
            boolean r0 = r4.A03(r2, r1, r3)
            if (r0 == 0) goto L30
            r4.A01(r5)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56137Ovx.A02(android.content.Context, X.47Z):void");
    }

    public final boolean A03(boolean z, boolean z2, boolean z3) {
        boolean A06;
        C06090Tz c06090Tz;
        long j;
        UserSession userSession = this.A03;
        C06090Tz c06090Tz2 = C06090Tz.A06;
        if (C18U.A06(c06090Tz2, userSession, 2342157705025686284L)) {
            return false;
        }
        if (z2) {
            c06090Tz = C06090Tz.A05;
            j = 36314695812320017L;
        } else {
            if (C18U.A06(c06090Tz2, userSession, 36314695812123406L) && z3) {
                return false;
            }
            if (z) {
                c06090Tz = C06090Tz.A05;
                j = 36314695812057869L;
            } else {
                A06 = C18U.A06(c06090Tz2, userSession, 36314695812057869L);
                return AbstractC31174DnI.A1b(A06);
            }
        }
        A06 = C18U.A06(c06090Tz, userSession, j);
        return AbstractC31174DnI.A1b(A06);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.A03(C56137Ovx.class);
    }
}
