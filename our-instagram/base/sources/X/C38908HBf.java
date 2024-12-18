package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.List;

/* renamed from: X.HBf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38908HBf extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "TrendingAudioCreatorViewerInsightsFragment";
    public IgdsBottomButtonLayout A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC60442pS A01 = AbstractC60952qJ.A01("ig_lumen_recipe_sheet", true, false);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_lumen_recipe_sheet";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String string;
        InterfaceC09390do interfaceC09390do;
        C38321qM A0F;
        ?? r9;
        String str;
        EnumC77213d7 enumC77213d7;
        JLM jlm;
        Long A0j;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("media_position");
        } else {
            i = -1;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string = bundle3.getString("media_id")) != null && (A0F = AbstractC37304Gc5.A0F(string, (interfaceC09390do = this.A02))) != null) {
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                r9 = bundle4.getBoolean("is_audio_trending");
            } else {
                r9 = 0;
            }
            Bundle bundle5 = this.mArguments;
            ImageUrl imageUrl = null;
            if (bundle5 != null) {
                str = bundle5.getString("audio_metadata_text");
            } else {
                str = null;
            }
            Context context = view.getContext();
            view.requireViewById(R.id.trending_badge).setVisibility(AbstractC167007dF.A05(r9));
            AbstractC166997dE.A0T(view, R.id.metadata).setText(str);
            AbstractC166987dD.A1P(context, AbstractC166997dE.A0T(view, R.id.subtitle), 2131975733);
            Bundle bundle6 = this.mArguments;
            if (bundle6 != null) {
                imageUrl = (ImageUrl) bundle6.getParcelable("audio_image_url");
            }
            IgImageView A0T = AbstractC167007dF.A0T(view, R.id.image);
            if (imageUrl != null) {
                A0T.setUrl(imageUrl, this);
                A0T.setVisibility(0);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.requireViewById(R.id.action_buttons);
            this.A00 = igdsBottomButtonLayout;
            if (igdsBottomButtonLayout == null) {
                C14360o3.A0F("bottomButtons");
                throw C00O.createAndThrow();
            }
            if (A0F.CcN()) {
                enumC77213d7 = EnumC77213d7.A03;
            } else {
                enumC77213d7 = EnumC77213d7.A04;
            }
            EnumC77213d7 enumC77213d72 = EnumC77213d7.A03;
            Context requireContext = requireContext();
            int i2 = 2131971564;
            if (enumC77213d7 == enumC77213d72) {
                i2 = 2131971567;
            }
            igdsBottomButtonLayout.setPrimaryAction(requireContext.getString(i2), new ViewOnClickListenerC42028Ijx(i, 15, A0F, this));
            List At7 = A0F.A0C.At7();
            if (At7 != null && (jlm = (JLM) AbstractC001800i.A0J(At7)) != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(this, AbstractC166987dD.A0o(interfaceC09390do), 1), "ig_lumen_recipe_sheet_overflow_impression");
                String A2u = A0F.A2u();
                if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null && A0f.isSampled()) {
                    AbstractC37303Gc4.A0h(A0f, A0F, "ig_lumen_recipe_sheet", AbstractC37303Gc4.A0Y(A0f, new C0Zx(), jlm, A0j));
                    AbstractC31176DnK.A1I(A0f);
                }
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(186273852);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_trending_audio_creator_viewer_insight_fragment, viewGroup, false);
        C0f9.A09(-1348090818, A02);
        return inflate;
    }
}
