package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.model.IGTVViewerLoggingToken;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes9.dex */
public final class N7y extends AbstractC43842Ja5 implements C1M1, InterfaceC60442pS, InterfaceC62612t0, InterfaceC60122ou, JGB {
    public static final IL4 A08 = new IL4(EnumC39626Hek.A0g);
    public static final String __redex_internal_original_name = "IGTVLiveChannelFragment";
    public O3A A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    @Override // X.JGB
    public final void D2n(JPd jPd, IGTVViewerLoggingToken iGTVViewerLoggingToken, String str, boolean z) {
        C14360o3.A0B(jPd, 0);
        C105824pt AiE = jPd.AiE();
        if (AiE != null) {
            O3A o3a = this.A00;
            if (o3a == null) {
                C14360o3.A0F("channelItemTappedController");
                throw C00O.createAndThrow();
            }
            FragmentActivity requireActivity = requireActivity();
            C38900HAw c38900HAw = ((C50943MfC) this.A03.getValue()).A07;
            C14360o3.A07(c38900HAw);
            UserSession userSession = o3a.A00;
            Reel A0G = C1OU.A04(userSession).A0G(AiE);
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A01 = c38900HAw.A01(userSession);
            int size = A01.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C105824pt c105824pt = (C105824pt) A01.get(i2);
                A1E.add(C1OU.A04(userSession).A0G(c105824pt));
                if (C14360o3.A0K(AiE.getId(), c105824pt.getId())) {
                    i = i2;
                }
            }
            IT4.A01(requireActivity, userSession, A0G, C3G2.A18, null, null, A1E, i, false, true);
        }
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new C52347NEl(AbstractC166987dD.A0r(this.A06), this, this, (DialogInterfaceOnDismissListenerC41846Ig0) this.A04.getValue(), new C42706Iv1(requireActivity(), this, EnumC39626Hek.A0g, this), new C30715DfD(this, 43)));
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.LRc, java.lang.Object] */
    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC56402iY.A06(requireActivity(), true);
        RecyclerView recyclerView = getRecyclerView();
        Context A0L = AbstractC166997dE.A0L(recyclerView);
        C50H c50h = new C50H(A0L, 1);
        Drawable drawable = A0L.getDrawable(R.drawable.igtv_home_item_divider);
        if (drawable != null) {
            c50h.A01 = drawable;
            recyclerView.A10(c50h);
            recyclerView.A10(new C51188MjW(this, A0L.getResources().getInteger(R.integer.igtv_destination_grid_columns), AbstractC167017dG.A0F(A0L), AbstractC167017dG.A06(A0L)));
            C57112jm c57112jm = (C57112jm) this.A07.getValue();
            C14360o3.A0B(c57112jm, 1);
            AbstractC37301Gc2.A0v(recyclerView, c57112jm, this);
            AbstractC37304Gc5.A0y(getRecyclerView().A0D, recyclerView, this, C153146ui.A09);
            recyclerView.setClipToPadding(false);
            InterfaceC09390do interfaceC09390do = this.A03;
            AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C50943MfC) interfaceC09390do.getValue()).A03, new C57561PgZ(this, 15), 43);
            C50943MfC c50943MfC = (C50943MfC) interfaceC09390do.getValue();
            if (c50943MfC.A02) {
                AbstractC31177DnL.A1Q(c50943MfC, AbstractC141776au.A00(c50943MfC), 12);
            }
            AbstractC46635KkC.A00(this, new Object());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (this.loadingState == MXS.A03) {
            C50943MfC c50943MfC = (C50943MfC) this.A03.getValue();
            if (c50943MfC.A02) {
                AbstractC31177DnL.A1Q(c50943MfC, AbstractC141776au.A00(c50943MfC), 12);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String A00 = A08.A00();
        C14360o3.A07(A00);
        return A00;
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C57561PgZ(this, 13));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return AbstractC25225BEi.A15(this.A01);
    }

    public N7y() {
        C57241PbP c57241PbP = new C57241PbP(this, 43);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57241PbP(new C57241PbP(this, 47), 48));
        this.A03 = AbstractC25225BEi.A0a(new C57241PbP(A00, 49), c57241PbP, new C57251PbZ(9, null, A00), AbstractC25225BEi.A1D(C50943MfC.class));
        C0YZ A1D = AbstractC25225BEi.A1D(C50875Me6.class);
        this.A05 = AbstractC25225BEi.A0a(new C57241PbP(this, 45), new C57241PbP(this, 46), new C57251PbZ(8, null, this), A1D);
        this.A01 = C1XM.A00(new C57241PbP(this, 41));
        this.A07 = C1XM.A00(C57373PdX.A00);
        this.A02 = C1XM.A00(new C57241PbP(this, 42));
        this.A04 = C1XM.A00(new C57241PbP(this, 44));
        this.A06 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(requireArguments().getString("igtv_channel_title_arg"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1405085897);
        super.onCreate(bundle);
        requireArguments();
        this.A00 = new O3A(AbstractC166987dD.A0r(this.A06), AbstractC25225BEi.A15(this.A01));
        C0f9.A09(-1971088469, A02);
    }
}
