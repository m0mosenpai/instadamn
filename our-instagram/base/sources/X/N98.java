package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes9.dex */
public final class N98 extends AbstractC65632xz {
    public C38321qM A00;
    public final ReelDashboardFragment A01;
    public final InterfaceC11380iw A02;
    public final C148426mC A03;
    public final C149766oT A04;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r3.intValue() <= 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r21, android.view.View r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            r20 = this;
            r6 = r23
            r0 = 1080745186(0x406adce2, float:3.6697316)
            r2 = r22
            int r4 = X.AbstractC25231BEo.A0G(r2, r0)
            boolean r0 = r6 instanceof X.C38891rO
            if (r0 == 0) goto Lc8
            X.1rO r6 = (X.C38891rO) r6
            if (r6 == 0) goto Lc8
            X.3qg r0 = new X.3qg
            r0.<init>(r6)
            r1 = r20
            X.1qM r3 = r1.A00
            r0.A01(r3)
            com.instagram.user.model.User r3 = r6.A09
            if (r3 != 0) goto L2a
            r0 = -1336837769(0xffffffffb0517977, float:-7.620637E-10)
        L26:
            X.C0f9.A0A(r0, r4)
            return
        L2a:
            X.E3t r8 = new X.E3t
            r8.<init>(r2)
            com.instagram.common.typedurl.ImageUrl r7 = r3.Bhu()
            java.lang.String r10 = r3.getUsername()
            java.lang.Long r9 = r6.A0h
            java.lang.String r11 = r6.A0t
            X.6oT r3 = r1.A04
            boolean r17 = r3.A00()
            X.1qM r3 = r1.A00
            if (r3 == 0) goto Lc5
            java.util.List r3 = X.MSW.A17(r3)
            if (r3 == 0) goto Lc5
            java.util.Map r5 = X.AbstractC50567MTy.A02(r3)
            java.lang.String r3 = r6.A0r
            java.lang.Object r3 = r5.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto Lc5
            boolean r18 = r3.booleanValue()
        L5d:
            X.1qM r3 = r1.A00
            if (r3 == 0) goto Lc2
            java.util.List r3 = X.MSW.A17(r3)
            if (r3 == 0) goto Lc2
            java.util.Map r5 = X.AbstractC50567MTy.A01(r3)
            java.lang.String r3 = r6.A0r
            java.lang.Number r3 = X.AbstractC37300Gc1.A0Q(r3, r5)
            if (r3 == 0) goto Lc2
            int r16 = r3.intValue()
        L77:
            X.1qM r3 = r1.A00
            if (r3 == 0) goto L95
            java.util.List r3 = X.MSW.A17(r3)
            if (r3 == 0) goto L95
            java.util.Map r5 = X.AbstractC50567MTy.A01(r3)
            java.lang.String r3 = r6.A0r
            java.lang.Number r3 = X.AbstractC37300Gc1.A0Q(r3, r5)
            if (r3 == 0) goto L95
            int r3 = r3.intValue()
            r19 = 1
            if (r3 > 0) goto L97
        L95:
            r19 = 0
        L97:
            X.0iw r6 = r1.A02
            r3 = 36
            X.Pbf r12 = new X.Pbf
            r12.<init>(r3, r0, r1)
            r3 = 37
            X.Pbf r13 = new X.Pbf
            r13.<init>(r3, r0, r1)
            r3 = 38
            X.Pbf r14 = new X.Pbf
            r14.<init>(r3, r0, r1)
            r3 = 39
            X.Pbf r15 = new X.Pbf
            r15.<init>(r3, r0, r1)
            X.FAW.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.6mC r1 = r1.A03
            r1.A00(r2, r0)
            r0 = 1854013094(0x6e81fea6, float:2.0115709E28)
            goto L26
        Lc2:
            r16 = 0
            goto L77
        Lc5:
            r18 = 0
            goto L5d
        Lc8:
            r0 = 1829321963(0x6d093ceb, float:2.6545682E27)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N98.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public N98(InterfaceC11380iw interfaceC11380iw, C148426mC c148426mC, C149766oT c149766oT, ReelDashboardFragment reelDashboardFragment) {
        AbstractC167017dG.A1P(reelDashboardFragment, interfaceC11380iw);
        this.A01 = reelDashboardFragment;
        this.A02 = interfaceC11380iw;
        this.A04 = c149766oT;
        this.A03 = c148426mC;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-853616548);
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 1);
        C14360o3.A07(A0E);
        View A0A = AbstractC31176DnK.A0A(A0E, viewGroup, R.layout.row_story_dashboard_comment);
        C0f9.A0A(-10692682, A03);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
