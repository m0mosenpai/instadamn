package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.model.HallPassMemberViewModel;

/* renamed from: X.EYs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32644EYs extends AbstractC66422zJ {
    public View A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final EON A04;

    public C32644EYs(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EON eon) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = eon;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r19, X.C3OO r20) {
        /*
            r18 = this;
            r7 = r20
            r6 = r19
            com.instagram.hallpass.model.HallPassMemberViewModel r6 = (com.instagram.hallpass.model.HallPassMemberViewModel) r6
            X.E3Y r7 = (X.E3Y) r7
            boolean r0 = X.AbstractC167017dG.A1a(r6, r7)
            r1 = r18
            android.content.Context r11 = r1.A01
            com.instagram.common.session.UserSession r4 = r1.A03
            X.0iw r5 = r1.A02
            X.EON r3 = r1.A04
            r15 = 0
            X.C14360o3.A0B(r11, r15)
            X.AbstractC167007dF.A1D(r4, r0, r5)
            r0 = 5
            X.C14360o3.A0B(r3, r0)
            com.instagram.common.ui.base.IgTextView r8 = r7.A02
            com.instagram.user.model.User r2 = r6.A00
            java.lang.String r0 = r2.B8y()
            r8.setText(r0)
            com.instagram.common.ui.base.IgTextView r10 = r7.A03
            X.AbstractC31173DnH.A1F(r10, r2)
            java.lang.String r0 = r2.getFullName()
            if (r0 == 0) goto L3e
            int r0 = r0.length()
            r9 = 0
            if (r0 != 0) goto L3f
        L3e:
            r9 = 1
        L3f:
            r1 = 8
            r0 = 0
            if (r9 == 0) goto L46
            r0 = 8
        L46:
            r10.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r9 = r7.A01
            android.content.res.Resources r11 = r11.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r14 = r11.getDimensionPixelSize(r0)
            com.instagram.common.typedurl.ImageUrl r12 = r2.Bhu()
            java.lang.String r13 = "HallPassMemberListItemViewBinder"
            X.3yt r11 = new X.3yt
            r16 = r15
            r17 = r15
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r9.setImageDrawable(r11)
            r11 = 37
            X.DuJ r0 = new X.DuJ
            r0.<init>(r3, r6, r11)
            X.C0fQ.A00(r0, r8)
            r8 = 38
            X.DuJ r0 = new X.DuJ
            r0.<init>(r3, r6, r8)
            X.C0fQ.A00(r0, r10)
            r8 = 39
            X.DuJ r0 = new X.DuJ
            r0.<init>(r3, r6, r8)
            X.C0fQ.A00(r0, r9)
            java.lang.String r8 = r2.getId()
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r4)
            boolean r0 = X.AbstractC31174DnI.A1Y(r0, r8)
            if (r0 != 0) goto Lbb
            boolean r0 = r2.A26()
            if (r0 != 0) goto Lbb
            com.instagram.common.ui.base.IgSimpleImageView r0 = r7.A00
            r0.setVisibility(r1)
            X.2iX r1 = r7.A04
            r1.setVisibility(r15)
            android.view.View r0 = r1.getView()
            com.instagram.user.follow.FollowButtonBase r0 = (com.instagram.user.follow.FollowButtonBase) r0
            X.4yT r0 = r0.A0J
            r0.A04(r5, r4, r2)
            android.view.View r1 = r1.getView()
            java.lang.String r0 = r2.getId()
            X.AbstractC99834e5.A02(r1, r4, r0)
            return
        Lbb:
            com.instagram.common.ui.base.IgSimpleImageView r2 = r7.A00
            r2.setVisibility(r15)
            X.2iX r0 = r7.A04
            r0.setVisibility(r1)
            r1 = 40
            X.DuJ r0 = new X.DuJ
            r0.<init>(r3, r6, r1)
            X.C0fQ.A00(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32644EYs.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_hall_pass_member_row_item, false);
        this.A00 = A0R;
        return new E3Y(A0R);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HallPassMemberViewModel.class;
    }
}
