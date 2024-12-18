package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.HCk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38937HCk extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "TranslationAttributionSheetFragment";
    public RecyclerView A00;
    public InterfaceC56392iX A01;
    public SpinnerImageView A02;
    public IG7 A04;
    public String A03 = "";
    public String A05 = "";
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = AbstractC31180DnO.A0V(view);
        this.A01 = AbstractC37301Gc2.A0D(view, R.id.translation_load_fail);
        Context context = getContext();
        if (context != null) {
            RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.translation_recycler_view);
            AbstractC31174DnI.A15(context, A0G);
            IG7 ig7 = new IG7(context);
            this.A04 = ig7;
            A0G.setAdapter(ig7.A01);
            A0G.A10(new C51190MjY(0, 24, AbstractC167007dF.A09(A0G.getContext(), R.attr.igds_color_elevated_separator), true));
            this.A00 = A0G;
        }
        A01(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C38937HCk r6, java.lang.String r7, java.util.List r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 36
            boolean r0 = X.PX6.A02(r9, r3)
            if (r0 == 0) goto La6
            r4 = r9
            X.PX6 r4 = (X.PX6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La6
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A04
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L92
            if (r0 != r2) goto Lad
            java.lang.Object r8 = r4.A03
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r4.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r4.A01
            X.HCk r6 = (X.C38937HCk) r6
            X.AbstractC09560e7.A00(r1)
        L30:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r6.A02
            if (r1 == 0) goto L39
            X.3T1 r0 = X.C3T1.SUCCESS
            r1.setLoadingStatus(r0)
        L39:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00
            X.AbstractC167007dF.A0w(r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L4a
            A02(r6, r2)
        L47:
            X.0eB r3 = X.C0eB.A00
            return r3
        L4a:
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            java.util.Iterator r4 = r8.iterator()
        L52:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r4.next()
            X.HAi r0 = (X.C38886HAi) r0
            java.lang.String r3 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A02
            X.Ioy r0 = new X.Ioy
            r0.<init>(r7, r3, r2, r1)
            r5.add(r0)
            goto L52
        L6d:
            X.IG7 r3 = r6.A04
            if (r3 != 0) goto L7b
            java.lang.String r0 = "translationAttributionAdapter"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L7b:
            java.util.List r0 = r3.A00
            r0.clear()
            r0.addAll(r5)
            X.2zD r2 = r3.A01
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.AbstractC31171DnF.A0E()
            java.util.List r0 = r3.A00
            r1.A01(r0)
            r2.A05(r1)
            goto L47
        L92:
            X.AbstractC09560e7.A00(r1)
            r0 = 300(0x12c, double:1.48E-321)
            r4.A01 = r6
            r4.A02 = r7
            r4.A03 = r8
            r4.A00 = r2
            java.lang.Object r0 = X.AbstractC89993zf.A01(r4, r0)
            if (r0 != r3) goto L30
            return r3
        La6:
            X.PX6 r4 = new X.PX6
            r4.<init>(r6, r9, r3)
            goto L16
        Lad:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38937HCk.A00(X.HCk, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    public static final void A01(C38937HCk c38937HCk) {
        AbstractC12990ll A0o = AbstractC166987dD.A0o(c38937HCk.A06);
        String str = c38937HCk.A03;
        AbstractC167007dF.A1K(A0o, str);
        C25621Ms A0M = AbstractC31177DnL.A0M(A0o);
        A0M.A0B("language/story_translate/");
        A0M.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        AbstractC18560vj.A03(AbstractC25235BEs.A0S(c38937HCk), JX4.A02(new J7R(c38937HCk, 21), JX4.A03(new D4r(c38937HCk, null, 24), JX4.A04(new C57153PYx(c38937HCk, null, 26), JX4.A01(new D4r(25, null), JX4.A00(new GSB(29, null), JX4.A02(J8T.A00, AbstractC31172DnG.A0R(null, A0M, HAI.class, ITT.class, false).A03(431659549))))))));
    }

    public static final void A02(C38937HCk c38937HCk, boolean z) {
        SpinnerImageView spinnerImageView = c38937HCk.A02;
        if (spinnerImageView != null) {
            spinnerImageView.setVisibility(8);
        }
        RecyclerView recyclerView = c38937HCk.A00;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        InterfaceC56392iX interfaceC56392iX = c38937HCk.A01;
        if (interfaceC56392iX == null) {
            C14360o3.A0F("errorViewStubHolder");
            throw C00O.createAndThrow();
        }
        TextView A0T = AbstractC166997dE.A0T(interfaceC56392iX.getView(), R.id.translation_load_failed_title);
        Resources resources = A0T.getResources();
        int i = 2131975721;
        if (z) {
            i = 2131975724;
        }
        AbstractC31173DnH.A19(resources, A0T, i);
        AbstractC13880nE.A0Y(A0T, AbstractC166997dE.A06(resources));
        TextView A0T2 = AbstractC166997dE.A0T(interfaceC56392iX.getView(), R.id.translation_load_fail_try_again);
        AbstractC31173DnH.A19(A0T2.getResources(), A0T2, 2131975766);
        ViewOnClickListenerC37847Gl1.A00(A0T2, 24, c38937HCk);
        Context context = A0T2.getContext();
        AbstractC166987dD.A1O(context, A0T2, AbstractC53242c7.A06(context));
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A0F;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return I58.A00(this, this.A05);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(791479808);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = AbstractC153636vY.A01(requireArguments, AbstractC111324zv.A00(1933));
        this.A05 = AbstractC153636vY.A01(requireArguments, AbstractC111324zv.A00(44));
        setModuleNameV2("stories_translation_sheet");
        C0f9.A09(-292104005, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1969654379);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.translation_attribution_sheet_fragment, viewGroup, false);
        C0f9.A09(944775999, A02);
        return inflate;
    }
}
