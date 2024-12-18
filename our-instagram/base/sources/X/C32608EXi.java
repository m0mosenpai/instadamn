package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EXi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32608EXi extends AbstractC66412zI {
    public String A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC132405yL A03;
    public final boolean A04;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        InterfaceC132405yL interfaceC132405yL = this.A03;
        C14360o3.A0B(interfaceC132405yL, 1);
        interfaceC132405yL.Dqm(c3oo.itemView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r16 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r1.A05() == null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r30, X.C3OO r31) {
        /*
            r29 = this;
            r11 = r31
            r12 = r30
            X.FyU r12 = (X.C36215FyU) r12
            X.E3x r11 = (X.C31995E3x) r11
            r10 = 0
            boolean r24 = X.AbstractC167007dF.A1R(r10, r12, r11)
            r14 = r29
            boolean r0 = r14.A04
            if (r0 == 0) goto L2d
            com.instagram.model.direct.DirectShareTarget r1 = r12.A05
            boolean r0 = r1.A0R()
            if (r0 == 0) goto L2d
            com.instagram.common.session.UserSession r0 = r14.A02
            java.lang.String r0 = r0.userId
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L2d
            java.lang.String r0 = r1.A05()
            r18 = 1
            if (r0 != 0) goto L2f
        L2d:
            r18 = 0
        L2f:
            com.instagram.model.direct.DirectShareTarget r9 = r12.A05
            boolean r0 = r9.A0H()
            if (r0 == 0) goto Lcc
            com.instagram.common.session.UserSession r3 = r14.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317496132834590(0x8106920021151e, double:3.030669020999022E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4a
            java.lang.String r0 = r9.A0N
            if (r0 != 0) goto L52
        L4a:
            com.instagram.direct.model.thread.ChannelsContextLine r0 = r9.A03
            if (r0 == 0) goto Lcc
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto Lcc
        L52:
            r17 = 1
        L54:
            boolean r16 = r9.A0F()
            boolean r15 = r12.A09
            boolean r0 = r9.A0Q()
            if (r0 == 0) goto Lc9
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
        L66:
            r14.A00 = r0
            int r13 = r12.A02
            boolean r0 = r9.A0F()
            if (r0 == 0) goto Lc6
            r8 = -1
        L71:
            int r7 = r12.A01
            int r6 = r12.A04
            int r5 = r12.A03
            com.instagram.common.session.UserSession r4 = r14.A02
            X.0iw r3 = r14.A01
            X.5yL r2 = r14.A03
            java.lang.String r1 = r14.A00
            boolean r0 = r12.A08
            if (r0 == 0) goto Lc3
            java.lang.String r0 = r4.userId
            java.lang.Integer r14 = r9.A04(r0, r10)
            java.lang.Integer r0 = X.C05F.A00
            if (r14 == r0) goto L97
            java.lang.String r0 = r4.userId
            java.lang.Integer r14 = r9.A04(r0, r10)
            java.lang.Integer r0 = X.C05F.A0Y
            if (r14 != r0) goto Lc3
        L97:
            r22 = 1
        L99:
            boolean r0 = r12.A07
            r12 = 0
            if (r18 != 0) goto La4
            if (r17 != 0) goto La4
            r25 = 0
            if (r16 == 0) goto La6
        La4:
            r25 = 1
        La6:
            r16 = r12
            r20 = r6
            r21 = r5
            r23 = r0
            r26 = r15
            r27 = r10
            r28 = r10
            r15 = r1
            r17 = r13
            r18 = r8
            r19 = r7
            r13 = r2
            r14 = r9
            r9 = r3
            r10 = r4
            X.F3P.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        Lc3:
            r22 = 0
            goto L99
        Lc6:
            int r8 = r12.A00
            goto L71
        Lc9:
            java.lang.String r0 = r14.A00
            goto L66
        Lcc:
            r17 = 0
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32608EXi.bind(X.2zP, X.3OO):void");
    }

    public C32608EXi(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC132405yL interfaceC132405yL, String str, boolean z) {
        AbstractC167017dG.A1P(interfaceC132405yL, userSession);
        this.A03 = interfaceC132405yL;
        this.A02 = userSession;
        this.A00 = str;
        this.A01 = interfaceC11380iw;
        this.A04 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31995E3x(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36215FyU.class;
    }
}
