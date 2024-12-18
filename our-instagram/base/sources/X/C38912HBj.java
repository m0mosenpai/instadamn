package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.HBj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38912HBj extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BulkDeleteYourActivityBottomSheetFragment";
    public OWU A00;
    public HashMap A01;
    public boolean A02;
    public EnumC40111tc A03;
    public EnumC39589Hdz A04;
    public OLM A05;
    public String A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "bulk_delete_your_activity_upsell_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Serializable serializable;
        int A02 = C0f9.A02(-1035091597);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable2 = null;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC50532MSl.A00());
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("media_type");
        } else {
            serializable = null;
        }
        C14360o3.A0C(serializable, MSV.A00(531));
        this.A03 = (EnumC40111tc) serializable;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            serializable2 = bundle4.getSerializable("entrypoint");
        }
        this.A04 = (EnumC39589Hdz) serializable2;
        this.A01 = AbstractC167017dG.A0r("entrypoint", "bulk_delete_your_activity_cn");
        OLM olm = new OLM(this, AbstractC166987dD.A0r(this.A07));
        this.A05 = olm;
        this.A00 = new OWU(this.A04, olm, EnumC72375XcB.A03, this.A06);
        C0f9.A09(1936468947, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1447693213);
        C14360o3.A0B(layoutInflater, 0);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.your_activity_upsell_bottom_sheet, viewGroup, false);
        if (this.A03 == EnumC40111tc.A0a) {
            z = true;
        }
        this.A02 = z;
        Context context = getContext();
        if (this.A02) {
            str = "com.instagram.privacy.activity_center.reels_media_screen";
        } else {
            str = "com.instagram.privacy.activity_center.feed_media_screen";
        }
        HashMap hashMap = this.A01;
        if (hashMap == null) {
            C14360o3.A0F("bloksParams");
            throw C00O.createAndThrow();
        }
        AbstractC191798eb.A04(context, new C191778eZ(AbstractC166987dD.A0o(this.A07)), str, hashMap, 60L);
        Context requireContext = requireContext();
        int i = 2131976350;
        if (this.A02) {
            i = 2131976351;
        }
        String A0p = AbstractC166997dE.A0p(requireContext, i);
        Context requireContext2 = requireContext();
        int i2 = 2131976344;
        if (this.A02) {
            i2 = 2131976345;
        }
        String string = requireContext2.getString(i2);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(inflate, R.id.upsell_bottom_sheet_headline);
        C14360o3.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline(A0p);
        if (string != null) {
            igdsHeadline.setBody(string);
        }
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_delete_confirm_refresh);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(inflate, R.id.bottom_bar);
        ViewOnClickListenerC42035Ik4 A00 = ViewOnClickListenerC42035Ik4.A00(this, 48);
        C3DN A0m = AbstractC25230BEn.A0m(this);
        int i3 = 2131976346;
        if (this.A02) {
            i3 = 2131976347;
        }
        AbstractC54295NzF.A00(igdsBottomButtonLayout, new OCY(A00, A0m, i3, 2131968687));
        igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
        C0f9.A09(1625273121, A02);
        return inflate;
    }
}
