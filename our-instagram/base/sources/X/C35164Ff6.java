package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ff6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35164Ff6 {
    public View A00;
    public ViewGroup A01;
    public C34498FIk A02;
    public List A03;
    public boolean A04;
    public final Activity A05;
    public final LayoutInflater A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final C159797Er A09;

    public static final void A00(C35164Ff6 c35164Ff6) {
        ViewGroup viewGroup = c35164Ff6.A01;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        c35164Ff6.A01 = null;
        View view = c35164Ff6.A00;
        if (view != null) {
            C14360o3.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view).removeAllViews();
        } else {
            C14360o3.A0F("view");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02af, code lost:
    
        if (r16 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r0.isEmpty() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0185, code lost:
    
        if (r12.isEmpty() != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A01(android.view.View r22, X.GWW r23) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35164Ff6.A01(android.view.View, X.GWW):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (X.AbstractC166987dD.A1b(r4) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean A02(X.GWW r8) {
        /*
            r7 = this;
            X.G1W r8 = (X.G1W) r8
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            X.2EC r0 = r8.A00
            if (r0 == 0) goto La7
            X.3nh r2 = r0.BLX()
            r6 = 0
            r4 = 1
            if (r2 != 0) goto L7a
            X.2EC r0 = r8.A00
            if (r0 == 0) goto La7
            X.3kb r0 = (X.C81663kb) r0
            X.3iy r0 = r0.A01
            java.util.List r0 = r0.A24
            if (r0 == 0) goto L99
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L99
            X.2EC r0 = r8.A00
            if (r0 == 0) goto La7
            X.3kb r0 = (X.C81663kb) r0
            X.3iy r0 = r0.A01
            java.util.List r5 = r0.A24
            if (r5 == 0) goto La5
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r5.iterator()
        L38:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4q9 r0 = (X.C105954q9) r0
            java.lang.Boolean r0 = r0.A00
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r4)
            if (r0 == 0) goto L38
            r3.add(r1)
            goto L38
        L51:
            boolean r0 = X.AbstractC166987dD.A1b(r3)
            if (r0 == 0) goto La5
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r3 = r5.iterator()
        L5f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4q9 r0 = (X.C105954q9) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "General"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            r4.add(r2)
            goto L5f
        L7a:
            com.instagram.common.session.UserSession r0 = r7.A08
            java.lang.String r1 = r0.userId
            java.lang.String r0 = r2.A1u
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La6
            java.util.List r0 = r8.A00()
            if (r0 == 0) goto La6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La5
            return r6
        L93:
            boolean r0 = X.AbstractC166987dD.A1b(r4)
            if (r0 == 0) goto La5
        L99:
            X.2EC r0 = r8.A00
            if (r0 == 0) goto La7
            X.3kb r0 = (X.C81663kb) r0
            X.3iy r0 = r0.A01
            X.FIk r0 = r0.A0e
            if (r0 == 0) goto La6
        La5:
            r6 = 1
        La6:
            return r6
        La7:
            java.lang.String r0 = "thread"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35164Ff6.A02(X.GWW):boolean");
    }

    public C35164Ff6(Activity activity, LayoutInflater layoutInflater, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C159797Er c159797Er) {
        this.A06 = layoutInflater;
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A05 = activity;
        this.A09 = c159797Er;
    }

    public C35164Ff6() {
    }
}
