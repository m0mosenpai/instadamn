package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.hallpass.model.HallPassMemberViewModel;

/* renamed from: X.EYk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32636EYk extends AbstractC66422zJ {
    public View A00;
    public final Context A01;
    public final EOM A02;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r1 == 0) goto L6;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r13, X.C3OO r14) {
        /*
            r12 = this;
            com.instagram.hallpass.model.HallPassMemberViewModel r13 = (com.instagram.hallpass.model.HallPassMemberViewModel) r13
            X.E2z r14 = (X.C31971E2z) r14
            X.AbstractC167017dG.A1N(r13, r14)
            android.content.Context r5 = r12.A01
            X.EOM r3 = r12.A02
            r9 = 0
            X.AbstractC167007dF.A1E(r5, r9, r3)
            com.instagram.common.ui.base.IgTextView r2 = r14.A02
            com.instagram.user.model.User r4 = r13.A00
            java.lang.String r0 = r4.B8y()
            r2.setText(r0)
            r1 = 30
            X.DuJ r0 = new X.DuJ
            r0.<init>(r3, r13, r1)
            X.C0fQ.A00(r0, r2)
            java.lang.String r0 = r4.getFullName()
            r6 = 0
            if (r0 == 0) goto L32
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L33
        L32:
            r0 = 1
        L33:
            r1 = r0 ^ 1
            boolean r0 = r13.A01
            com.instagram.common.ui.base.IgTextView r2 = r14.A03
            if (r0 == 0) goto Lbd
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r0 = 2131954717(0x7f130c1d, float:1.9545941E38)
            java.lang.String r6 = X.AbstractC166997dE.A0p(r5, r0)
            if (r1 == 0) goto Lb5
            java.lang.String r8 = r4.getUsername()
            r1 = 20
            java.util.regex.Pattern r0 = X.AbstractC13670mt.A01
            int r0 = r8.length()
            if (r0 < r1) goto L66
            java.lang.String r1 = X.AbstractC25227BEk.A0w(r8, r9, r1)
            r0 = 2131961704(0x7f132768, float:1.9560112E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r8 = X.AnonymousClass001.A0R(r1, r0)
        L66:
            r7.append(r8)
            java.lang.String r0 = " • "
            r7.append(r0)
            r7.append(r6)
        L71:
            r2.setText(r7)
            r2.setVisibility(r9)
        L77:
            r1 = 31
            X.DuJ r0 = new X.DuJ
            r0.<init>(r3, r13, r1)
            X.C0fQ.A00(r0, r2)
            com.instagram.common.ui.base.IgSimpleImageView r2 = r14.A01
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            int r8 = r1.getDimensionPixelSize(r0)
            com.instagram.common.typedurl.ImageUrl r6 = r4.Bhu()
            java.lang.String r7 = "CampfireMemberListItemViewBinder"
            X.3yt r5 = new X.3yt
            r10 = r9
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.setImageDrawable(r5)
            r1 = 32
            X.DuJ r0 = new X.DuJ
            r0.<init>(r3, r13, r1)
            X.C0fQ.A00(r0, r2)
            com.instagram.common.ui.base.IgSimpleImageView r2 = r14.A00
            r1 = 33
            X.DuJ r0 = new X.DuJ
            r0.<init>(r3, r13, r1)
            X.C0fQ.A00(r0, r2)
            return
        Lb5:
            android.text.SpannableStringBuilder r7 = r7.append(r6)
            X.C14360o3.A07(r7)
            goto L71
        Lbd:
            X.AbstractC31173DnH.A1F(r2, r4)
            if (r1 != 0) goto Lc4
            r6 = 8
        Lc4:
            r2.setVisibility(r6)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32636EYk.bind(X.2zP, X.3OO):void");
    }

    public C32636EYk(Context context, EOM eom) {
        this.A01 = context;
        this.A02 = eom;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_campfire_member_row_item, false);
        this.A00 = A0R;
        return new C31971E2z(A0R);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HallPassMemberViewModel.class;
    }
}
