package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.io.Serializable;

/* renamed from: X.EaX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32706EaX extends AbstractC32707EaY implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectChallengeCardGalleryFragment";
    public String A00;
    public EnumC33364Eox A01;
    public final InterfaceC09390do A02 = C1XM.A00(C37051GUh.A00(this, 17));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_challenges_card_gallery_fragment";
    }

    @Override // X.AbstractC32707EaY, X.EOJ, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Serializable serializable;
        EnumC33364Eox enumC33364Eox;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0M(2131954962, 2131954963, R.drawable.instagram_camera_outline_96);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = AbstractC31171DnF.A0b(bundle2)) == null) {
            str = "";
        }
        this.A00 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("prompts_entry_point");
        } else {
            serializable = null;
        }
        if (serializable instanceof EnumC33364Eox) {
            enumC33364Eox = (EnumC33364Eox) serializable;
        } else {
            enumC33364Eox = null;
        }
        this.A01 = enumC33364Eox;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && bundle4.getBoolean("challenge_gallery_no_redirect")) {
            A03(view, this);
            A04(this);
        } else {
            Dz7 A0E = A0E();
            C14360o3.A0C(A0E, AbstractC43591JPw.A00(44));
            AbstractC166987dD.A1Z(new C50119MBt(A0E.A03, view, this, null, 10), C07Y.A00(this));
        }
        GSS.A02(view, this, C07Y.A00(this), 10);
    }

    public static final void A05(C32706EaX c32706EaX) {
        Bundle bundle = c32706EaX.mArguments;
        if (bundle != null) {
            bundle.putString("surface", "challenge_winner");
        }
        UserSession A0r = AbstractC166987dD.A0r(c32706EaX.A0S);
        C6XJ A0L = AbstractC31171DnF.A0L(c32706EaX.getActivity(), c32706EaX.mArguments, A0r, ModalActivity.class, "direct_card_gallery");
        A0L.A00 = 1;
        A0L.A0H = false;
        A0L.A08 = true;
        A0L.A0J = ModalActivity.A08;
        A0L.A0C(c32706EaX.getActivity());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r0.A01() != true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.FKN A01(X.C32706EaX r9) {
        /*
            X.Dz7 r7 = r9.A0E()
            r0 = 44
            java.lang.String r5 = X.AbstractC43591JPw.A00(r0)
            X.C14360o3.A0C(r7, r5)
            X.E6h r6 = X.Dz7.A00(r7)
            r1 = 0
            if (r6 == 0) goto L5d
            X.Gks r0 = r6.A01
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L21
            boolean r0 = r0.A01()
            r8 = 1
            if (r0 == r3) goto L22
        L21:
            r8 = 0
        L22:
            X.3kb r0 = r9.A0F()
            if (r0 == 0) goto L33
            X.3iy r0 = r0.A01
            X.3kP r0 = r0.A0t
            if (r0 == 0) goto L33
            boolean r0 = r0.A0I
            if (r0 != r3) goto L33
            r2 = 1
        L33:
            r4 = r2 ^ 1
            X.Eoe r2 = r6.A03
            if (r2 == 0) goto L5d
            X.Eoe r0 = X.EnumC33345Eoe.A02
            if (r2 == r0) goto L5d
            java.lang.Boolean r0 = r9.A0E
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.C14360o3.A0K(r0, r2)
            if (r0 == 0) goto L5e
            if (r8 != 0) goto L5e
            r0 = 2131973639(0x7f135607, float:1.958432E38)
            java.lang.String r2 = X.AbstractC25227BEk.A0v(r9, r0)
            r0 = 16
        L54:
            X.GUh r0 = X.C37051GUh.A00(r9, r0)
            X.FKN r1 = new X.FKN
            r1.<init>(r2, r0, r3)
        L5d:
            return r1
        L5e:
            java.lang.Boolean r0 = r9.A0E
            boolean r0 = X.C14360o3.A0K(r0, r2)
            if (r0 == 0) goto Lcb
            if (r8 == 0) goto Lcb
            java.util.List r0 = r6.A0C
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto Lcb
            boolean r0 = r7.A0C()
            if (r0 != 0) goto Lcb
            X.Dz7 r0 = r9.A0E()
            X.C14360o3.A0C(r0, r5)
            X.Eag r0 = (X.C32715Eag) r0
            X.0UO r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.Mtk r0 = (X.C51761Mtk) r0
            java.lang.Object r6 = r0.A02
            X.Dz7 r0 = r9.A0E()
            X.E6h r0 = X.Dz7.A00(r0)
            if (r0 == 0) goto Lc9
            java.util.ArrayList r5 = r0.A0B
        L95:
            r4 = 0
            if (r5 == 0) goto Lc0
            int r3 = r5.size()
            if (r3 == 0) goto Lc1
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r9)
            r0 = 2131820607(0x7f11003f, float:1.9273934E38)
            java.lang.String r2 = X.AbstractC167017dG.A0k(r1, r3, r0)
        La9:
            X.C14360o3.A0A(r2)
            if (r3 <= 0) goto Lb3
            java.lang.Integer r0 = X.C05F.A01
            if (r6 == r0) goto Lb3
            r4 = 1
        Lb3:
            r1 = 24
            X.MDz r0 = new X.MDz
            r0.<init>(r1, r5, r9)
            X.FKN r1 = new X.FKN
            r1.<init>(r2, r0, r4)
            return r1
        Lc0:
            r3 = 0
        Lc1:
            r0 = 2131954939(0x7f130cfb, float:1.9546391E38)
            java.lang.String r2 = r9.getString(r0)
            goto La9
        Lc9:
            r5 = 0
            goto L95
        Lcb:
            if (r4 == 0) goto Ldd
            r0 = 2131954968(0x7f130d18, float:1.954645E38)
            if (r8 == 0) goto Ld5
            r0 = 2131954969(0x7f130d19, float:1.9546452E38)
        Ld5:
            java.lang.String r2 = X.AbstractC25227BEk.A0v(r9, r0)
            r0 = 15
            goto L54
        Ldd:
            boolean r0 = r6.A0G
            if (r0 != 0) goto L5d
            if (r8 != 0) goto L5d
            r0 = 2131954985(0x7f130d29, float:1.9546485E38)
            java.lang.String r2 = X.AbstractC25227BEk.A0v(r9, r0)
            r0 = 11
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32706EaX.A01(X.EaX):X.FKN");
    }

    public static final String A02(C32706EaX c32706EaX) {
        C37838Gks c37838Gks;
        Dz7 A0E = c32706EaX.A0E();
        C14360o3.A0C(A0E, AbstractC43591JPw.A00(44));
        C32055E6h A00 = Dz7.A00(A0E);
        boolean z = true;
        if (A00 == null || (c37838Gks = A00.A01) == null || !c37838Gks.A01()) {
            z = false;
        }
        if (A0E.A0C()) {
            return "winners_chosen";
        }
        if (z) {
            return "ended";
        }
        return AppStateModule.APP_STATE_ACTIVE;
    }

    public static final void A03(View view, C32706EaX c32706EaX) {
        AbstractC31174DnI.A1E(c32706EaX, c32706EaX.A0E().A03, new C50364MLq(7, view, AbstractC166997dE.A0S(view, R.id.spinner), c32706EaX), 9);
        c32706EaX.getRecyclerView().A14(new E0H(c32706EaX.getAdapter(), C37051GUh.A00(c32706EaX, 18)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r5 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C32706EaX r15) {
        /*
            X.3kb r4 = r15.A0F()
            X.0do r0 = r15.A02
            X.Fzs r7 = X.AbstractC31172DnG.A0e(r0)
            com.instagram.model.direct.DirectThreadKey r0 = r15.A0G()
            java.lang.String r9 = r0.A00
            com.instagram.model.direct.DirectThreadKey r0 = r15.A0G()
            java.lang.String r10 = r0.A01
            java.lang.String r2 = r15.A00
            r0 = 0
            if (r2 != 0) goto L25
            java.lang.String r0 = "challengeId"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L25:
            if (r4 == 0) goto L90
            int r1 = r4.AdZ()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L2f:
            X.0do r1 = r15.A0S
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r1)
            java.lang.String r3 = r1.userId
            int r1 = r15.A01
            if (r4 == 0) goto L3f
            X.3iy r0 = r4.A01
            X.3kP r0 = r0.A0t
        L3f:
            java.lang.String r4 = X.C160857It.A00(r0, r3, r1)
            A02(r15)
            android.os.Bundle r1 = r15.mArguments
            r5 = 1
            if (r1 == 0) goto L8e
            java.lang.String r0 = "challenge_gallery_no_redirect"
            boolean r0 = r1.getBoolean(r0)
            if (r0 != r5) goto L8e
        L53:
            X.Eox r3 = r15.A01
            if (r3 == 0) goto L8c
            int r1 = r3.ordinal()
            r0 = 6
            if (r1 != r0) goto L8c
            X.Erh r6 = X.EnumC33508Erh.MEMBER_PARTICIPATION_HUB
        L60:
            X.Eox r0 = X.EnumC33364Eox.A06
            if (r3 != r0) goto L82
            r0 = 1106(0x452, float:1.55E-42)
            java.lang.String r13 = X.AbstractC111324zv.A00(r0)
            if (r5 == 0) goto L89
        L6c:
            java.lang.String r14 = "challenge_winners_chosen_sheet"
        L6e:
            java.lang.String r0 = "user_type"
            X.0e4 r1 = X.AbstractC166987dD.A1L(r0, r4)
            java.lang.String r0 = "challenge_id"
            java.util.LinkedHashMap r15 = X.AbstractC25233BEq.A0p(r0, r2, r1)
            java.lang.String r11 = "challenge_submissions_sheet_rendered"
            java.lang.String r12 = "tap"
            X.C36298Fzs.A03(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L82:
            if (r5 == 0) goto L87
            java.lang.String r13 = "see_all_entries_button"
            goto L6c
        L87:
            java.lang.String r13 = "challenge_pill"
        L89:
            java.lang.String r14 = "thread_view"
            goto L6e
        L8c:
            r6 = 0
            goto L60
        L8e:
            r5 = 0
            goto L53
        L90:
            r8 = r0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32706EaX.A04(X.EaX):void");
    }

    public static final void A06(C32706EaX c32706EaX, boolean z) {
        Integer num;
        String str;
        String str2;
        C81663kb A0F = c32706EaX.A0F();
        C36298Fzs A0e = AbstractC31172DnG.A0e(c32706EaX.A02);
        String str3 = c32706EaX.A0G().A00;
        String str4 = c32706EaX.A0G().A01;
        C81543kP c81543kP = null;
        if (A0F != null) {
            num = Integer.valueOf(A0F.AdZ());
        } else {
            num = null;
        }
        String str5 = AbstractC166987dD.A0r(c32706EaX.A0S).userId;
        int i = ((EOJ) c32706EaX).A01;
        if (A0F != null) {
            c81543kP = A0F.A01.A0t;
        }
        String A00 = C160857It.A00(c81543kP, str5, i);
        if (z) {
            str = "see_winners_button";
            str2 = "challenge_submissions_sheet";
        } else {
            str = "challenge_pill";
            str2 = "thread_view";
        }
        C36298Fzs.A03(null, A0e, num, str3, str4, "challenge_winners_sheet_rendered", "tap", str, str2, AbstractC167007dF.A0n("user_type", A00));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        EOJ.A00(intent, this, i, i2);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return A0N();
    }

    @Override // X.AbstractC32707EaY, X.EOJ, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1159223435);
        super.onCreate(bundle);
        this.A03 = A01(this);
        C0f9.A09(2110736430, A02);
    }
}
