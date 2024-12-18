package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;

/* renamed from: X.EYi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32634EYi extends AbstractC66422zJ {
    public final Fragment A00;
    public final UserSession A01;
    public final C34723FRm A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new E1K(new IgdsPeopleCell(AbstractC31176DnK.A04(viewGroup), null, 0, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006c  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r13, X.C3OO r14) {
        /*
            r12 = this;
            X.FyH r13 = (X.C36203FyH) r13
            X.E1K r14 = (X.E1K) r14
            X.AbstractC167017dG.A1N(r13, r14)
            com.instagram.user.model.User r5 = r13.A01
            java.lang.String r11 = r13.A02
            boolean r1 = r13.A04
            boolean r6 = r13.A00
            boolean r4 = r13.A03
            androidx.fragment.app.Fragment r10 = r12.A00
            com.instagram.common.session.UserSession r9 = r12.A01
            X.FRm r3 = r12.A02
            r7 = 0
            X.AbstractC167017dG.A1T(r10, r9)
            r0 = 7
            X.C14360o3.A0B(r3, r0)
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r2 = r14.A00
            r2.A01()
            r8 = 0
            if (r1 == 0) goto L72
            java.lang.String r0 = r5.getUsername()
            r2.A08(r0, r7)
            java.lang.String r0 = r5.getFullName()
        L32:
            r2.A07(r0)
        L35:
            r2.A06(r11)
            X.FKq r1 = new X.FKq
            r1.<init>(r10, r5)
            X.Foo r0 = X.ViewOnClickListenerC35654Foo.A00
            r1.A00 = r0
            r2.A03(r9, r1, r5)
            android.content.Context r0 = r10.requireContext()
            X.EfJ r1 = new X.EfJ
            r1.<init>(r0)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            r1.setButtonDrawable(r0)
            r0 = 2131231331(0x7f080263, float:1.807874E38)
            r1.setBackgroundResource(r0)
            r1.setClickable(r7)
            r1.setChecked(r6)
            r2.A05(r1, r8)
            r0 = 30
            X.ViewOnClickListenerC35683FpI.A00(r2, r0, r3, r5)
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r4 == 0) goto L6e
            r0 = 1065353216(0x3f800000, float:1.0)
        L6e:
            r2.setAlpha(r0)
            return
        L72:
            java.lang.String r1 = r5.B8y()
            r2.A08(r1, r7)
            java.lang.String r0 = r5.getUsername()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = r5.getUsername()
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32634EYi.bind(X.2zP, X.3OO):void");
    }

    public C32634EYi(Fragment fragment, UserSession userSession, C34723FRm c34723FRm) {
        AbstractC167017dG.A1R(userSession, c34723FRm);
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = c34723FRm;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36203FyH.class;
    }
}
