package instagram.features.clips.viewer.recommend;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25230BEn;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C1ON;
import X.C25621Ms;
import X.C44093JeI;
import X.C44557Jnd;
import X.InterfaceC09390do;
import X.K8B;
import X.LBF;
import X.ViewOnClickListenerC48065LPq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class ClipsViewerRecommendClipsFragment extends AbstractC59962oe {
    public C44557Jnd A00;
    public String A01;
    public String A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public RecyclerView recyclerView;
    public SpinnerImageView spinnerImageView;
    public IgdsButton submitButton;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_viewer_recommend_clips";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = new C44557Jnd(AbstractC166987dD.A1E());
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.clips_viewer_recommend_clips_recycler_view);
        C14360o3.A0B(A0G, 0);
        this.recyclerView = A0G;
        SpinnerImageView spinnerImageView = (SpinnerImageView) view.requireViewById(R.id.clips_viewer_recommend_clips_spinner);
        C14360o3.A0B(spinnerImageView, 0);
        this.spinnerImageView = spinnerImageView;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            AbstractC31174DnI.A16(getContext(), recyclerView, 1, false);
            RecyclerView recyclerView2 = this.recyclerView;
            if (recyclerView2 != null) {
                recyclerView2.A0S = true;
                C44557Jnd c44557Jnd = this.A00;
                if (c44557Jnd == null) {
                    str = "recommendClipsAdapter";
                } else {
                    recyclerView2.setAdapter(c44557Jnd);
                    IgdsButton A0W = AbstractC31173DnH.A0W(view, R.id.clips_viewer_recommend_clips_button);
                    C14360o3.A0B(A0W, 0);
                    this.submitButton = A0W;
                    ViewOnClickListenerC48065LPq.A00(A0W, 8, this);
                    RecyclerView recyclerView3 = this.recyclerView;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(8);
                        SpinnerImageView spinnerImageView2 = this.spinnerImageView;
                        if (spinnerImageView2 != null) {
                            spinnerImageView2.setVisibility(0);
                            C25621Ms A0c = AbstractC167017dG.A0c(AbstractC25230BEn.A0k(this.A03, 0));
                            A0c.A0B("clips/labeling_categories/");
                            C1ON A0e = AbstractC25227BEk.A0e(A0c, K8B.class, LBF.class);
                            C44093JeI.A00(A0e, this, 24);
                            schedule(A0e);
                            return;
                        }
                        str = "spinnerImageView";
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        str = "recyclerView";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-925469681);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString("ClipsConstants.ARG_CLIPS_VIEWER_RECOMMEND_CLIPS_ITEM_ID");
        this.A01 = requireArguments.getString("ClipsConstants.ARG_CLIPS_VIEWER_RECOMMEND_CLIPS_AUTHOR_ID");
        C0f9.A09(650591515, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(89693784);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_viewer_recommend_clips_fragment, false);
        C0f9.A09(-1956115909, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-652742816);
        super.onDestroyView();
        ClipsViewerRecommendClipsFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(755485928, A02);
    }
}
