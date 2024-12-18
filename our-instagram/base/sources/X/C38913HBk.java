package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.HBk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38913HBk extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "UnlikedYourActivityUpsellsBottomSheetFragment";
    public OWU A00;
    public String A01;
    public String A02;
    public HashMap A03;
    public EnumC39589Hdz A04;
    public OLM A05;
    public String A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(1688);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Serializable serializable;
        String str2;
        int A02 = C0f9.A02(2130420526);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC50532MSl.A00());
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        } else {
            serializable = null;
        }
        this.A04 = (EnumC39589Hdz) serializable;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str2 = bundle4.getString("author_id");
        } else {
            str2 = null;
        }
        this.A01 = str2;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str3 = bundle5.getString("author_username");
        }
        this.A02 = str3;
        this.A03 = AbstractC06930Yk.A02(AbstractC25229BEm.A1b("entrypoint", "unliked_your_activity_cn", AbstractC166987dD.A1L("initial_author_filters", str3)));
        OLM olm = new OLM(this, AbstractC166987dD.A0r(this.A07));
        this.A05 = olm;
        this.A00 = new OWU(this.A04, olm, EnumC72375XcB.A0A, this.A06);
        C0f9.A09(-1849870516, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-630746358);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.your_activity_upsell_bottom_sheet, viewGroup, false);
        Context context = getContext();
        HashMap hashMap = this.A03;
        if (hashMap == null) {
            C14360o3.A0F("bloksParams");
            throw C00O.createAndThrow();
        }
        AbstractC191798eb.A04(context, new C191778eZ(AbstractC166987dD.A0o(this.A07)), "com.instagram.privacy.activity_center.liked_media_screen", hashMap, 60L);
        String A0p = AbstractC166997dE.A0p(requireContext(), 2131976412);
        String A0b = AbstractC31177DnL.A0b(requireContext(), A0p, 2131976413);
        SpannableString spannableString = new SpannableString(A0b);
        spannableString.setSpan(new StyleSpan(1), AbstractC001900j.A08(A0b, A0p, 0, false), AbstractC001900j.A08(A0b, A0p, 0, false) + A0p.length(), 33);
        String A0b2 = AbstractC31177DnL.A0b(requireContext(), this.A02, 2131976414);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(inflate, R.id.upsell_bottom_sheet_headline);
        C14360o3.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline(A0b2);
        igdsHeadline.setBody(spannableString);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_like_visibility_refresh);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(inflate, R.id.bottom_bar);
        AbstractC54295NzF.A00(igdsBottomButtonLayout, new OCY(ViewOnClickListenerC42035Ik4.A00(this, 50), AbstractC25230BEn.A0m(this), 2131976416, 2131968687));
        igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
        C0f9.A09(-496333493, A02);
        return inflate;
    }
}
