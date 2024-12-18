package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V0Q extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String A0G = AnonymousClass001.A0R(V0Q.class.getName(), ".BACK_STACK");
    public static final String __redex_internal_original_name = "PromoteCampaignControlsFragment";
    public C68938Vec A00;
    public SpinnerImageView A01;
    public String A02;
    public String A03;
    public String A04;
    public final XCJ A05;
    public final XCJ A06;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final XCJ A0E;
    public final InterfaceC41501vz A0F;
    public final List A07 = new ArrayList();
    public final InterfaceC09390do A0B = AbstractC09440dt.A01(new X55(this, 18));
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new X55(this, 15));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131970460);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promotion_campaign_controls";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UFD ufd = (UFD) this.A0D.getValue();
        C97J c97j = C97J.A00;
        C97Q c97q = (C97Q) C97M.A00(ufd.A01).A02.getValue();
        CallerContext A01 = CallerContext.A01("PromoteCampaignControlsViewModel");
        C14360o3.A0A(A01);
        c97q.AV3(new C9CN(A01, "ig_android_promote_ads_manager_ig_to_fb_campaign_controls", "ads_manager", VG4.A05.toString(), "campaign_controls"), c97j, new C70616Wdu(ufd, 6));
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.campaign_controls_recycler_view);
        AbstractC37304Gc5.A10(recyclerView, this.A0B);
        AbstractC31174DnI.A15(requireContext(), recyclerView);
        this.A01 = AbstractC31180DnO.A0V(view);
        A00();
        AbstractC31176DnK.A0Q(this.A0C).A01(this.A0F, C70702WfR.class);
    }

    public static final void A02(V0Q v0q, String str, String str2) {
        W6I w6i = (W6I) v0q.A09.getValue();
        String str3 = v0q.A04;
        if (str3 == null) {
            C14360o3.A0F("mediaId");
            throw C00O.createAndThrow();
        }
        if (str2 == null) {
            str2 = "";
        }
        w6i.A07("campaign_controls", str, str3, str2);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0C.getValue();
    }

    public V0Q() {
        X55 x55 = new X55(this, 22);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X55(new X55(this, 19), 20));
        this.A0D = new C60842q8(new X55(A00, 21), x55, new C57253Pbb(26, null, A00), new C0YZ(UFD.class));
        this.A09 = AbstractC09440dt.A01(new X55(this, 16));
        this.A0A = X55.A00(this, 17);
        this.A0F = new C70723Wfo(this, 5);
        this.A06 = new C70618Wdw(this, 4);
        this.A05 = new C70618Wdw(this, 2);
        this.A0E = new C70618Wdw(this, 3);
        this.A0C = AbstractC60492pY.A02(this);
    }

    private final void A00() {
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = (UserSession) this.A0C.getValue();
        String str = this.A03;
        if (str == null) {
            C14360o3.A0F("entryPoint");
            throw C00O.createAndThrow();
        }
        W6f.A01(requireActivity, this.A0E, userSession, str);
    }

    public static final void A01(V0Q v0q, String str) {
        v0q.requireActivity();
        AbstractC65702TsY.A0q();
        Bundle bundle = new Bundle();
        bundle.putString(TraceFieldType.Error, str);
        V0B v0b = new V0B();
        v0b.setArguments(bundle);
        AbstractC31179DnN.A0y(v0b, v0q.requireActivity(), v0q.A0C);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1685505989);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("media_id");
        if (string != null) {
            this.A04 = string;
            String string2 = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (string2 != null) {
                this.A03 = string2;
                if (requireArguments.getString("page_id") != null) {
                    this.A02 = requireArguments.getString("boosted_id");
                    C0f9.A09(-512891228, A02);
                    return;
                }
                throw new IllegalStateException("pageId cannot be null");
            }
            throw new IllegalStateException("entryPoint cannot be null");
        }
        throw new IllegalStateException("mediaId cannot be null");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(11849089);
        C14360o3.A0B(layoutInflater, 0);
        W6I w6i = (W6I) this.A09.getValue();
        String str = this.A04;
        if (str == null) {
            C14360o3.A0F("mediaId");
            throw C00O.createAndThrow();
        }
        w6i.A03("campaign_controls", str);
        View inflate = layoutInflater.inflate(R.layout.promotion_campaign_controls_view, viewGroup, false);
        C0f9.A09(-630471027, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1392589226);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A0C).A02(this.A0F, C70702WfR.class);
        C0f9.A09(-213705183, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-626468886);
        super.onResume();
        List list = this.A07;
        if (!list.isEmpty()) {
            list.clear();
            C66412UGg c66412UGg = (C66412UGg) this.A0B.getValue();
            c66412UGg.A00 = list;
            c66412UGg.notifyDataSetChanged();
            A00();
        }
        C0f9.A09(-1951277629, A02);
    }
}
