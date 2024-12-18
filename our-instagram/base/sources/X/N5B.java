package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class N5B extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "StoryCommentLikesFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "story_comments_likes_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.setPadding(0, 0, AbstractC167017dG.A03(view.getContext()), 0);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57159PZd c57159PZd = new C57159PZd(viewLifecycleOwner, c07s, this, null, 33);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, c57159PZd, A00);
        AbstractC23641Du.A05(anonymousClass191, new C57159PZd(A0K, c07s, this, null, 34), C07Y.A00(A0K));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public N5B() {
        C57237PbL c57237PbL = new C57237PbL(this, 9);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57237PbL(new C57237PbL(this, 6), 7));
        this.A02 = AbstractC25225BEi.A0a(new C57237PbL(A00, 8), c57237PbL, new D8I(42, null, A00), AbstractC25225BEi.A1D(C31841Dz0.class));
        this.A00 = C1XM.A00(new C57237PbL(this, 5));
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131974595));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        int A02 = C0f9.A02(-1270420516);
        Context context = getContext();
        if (context != null) {
            recyclerView = new RecyclerView(context, null);
            MSZ.A13(recyclerView);
            AbstractC31174DnI.A15(recyclerView.getContext(), recyclerView);
            AbstractC37304Gc5.A10(recyclerView, this.A00);
        } else {
            recyclerView = null;
        }
        C0f9.A09(-2007790441, A02);
        return recyclerView;
    }
}
