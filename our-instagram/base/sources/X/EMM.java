package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class EMM extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "AvatarMentionsBottomSheetFragment";
    public RecyclerView A00;
    public C66362zD A01;
    public IgTextView A02;
    public C189478aR A03;
    public SpinnerImageView A04;
    public User A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public String A0C;
    public String A0D;
    public final C53O A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IgTextView igTextView;
        View.OnClickListener viewOnClickListenerC35669Fp4;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = AbstractC31172DnG.A0X(view, R.id.avatar_mentions_bottom_sheet_button);
        this.A00 = AbstractC31172DnG.A0G(view, R.id.avatar_mentions_button_sheet_user_list);
        this.A04 = (SpinnerImageView) view.requireViewById(R.id.avatar_mentions_bottom_sheet_loading_spinner);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        InterfaceC09390do interfaceC09390do = this.A0F;
        C66362zD A0R2 = AbstractC31173DnH.A0R(A0R, new C67991V5g(requireActivity(), this, AbstractC166987dD.A0r(interfaceC09390do), getModuleName(), this.A09, new GSj(this, 0)));
        this.A01 = A0R2;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(A0R2);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            AbstractC31177DnL.A0s(requireContext(), recyclerView2);
        }
        boolean A0K = C14360o3.A0K(C20Y.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01.A00, C125535lz.A00);
        IgTextView igTextView2 = this.A02;
        if (igTextView2 != null) {
            Resources A0N = AbstractC166997dE.A0N(this);
            if (A0K) {
                i = 2131953497;
                if (this.A0B) {
                    i = 2131953496;
                }
            } else {
                i = 2131953495;
            }
            AbstractC31173DnH.A19(A0N, igTextView2, i);
        }
        if (!this.A0B && A0K) {
            igTextView = this.A02;
            if (igTextView != null) {
                viewOnClickListenerC35669Fp4 = ViewOnClickListenerC31723DwS.A00(this, 62);
                C0fQ.A00(viewOnClickListenerC35669Fp4, igTextView);
            }
        } else {
            igTextView = this.A02;
            if (igTextView != null) {
                viewOnClickListenerC35669Fp4 = new ViewOnClickListenerC35669Fp4(10, this, A0K);
                C0fQ.A00(viewOnClickListenerC35669Fp4, igTextView);
            }
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57165PZj c57165PZj = new C57165PZj(c07s, this, viewLifecycleOwner, null, 32);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c57165PZj, A00);
        String str = this.A0C;
        if (str != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(AbstractC25230BEn.A0k(interfaceC09390do, 0)), "avatar_mentions_users_list_bottom_sheet_impression");
            if (A0f.isSampled()) {
                AbstractC31174DnI.A1G(A0f, AbstractC167007dF.A0n(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str));
            }
        }
        List list = this.A0A;
        if (list != null) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0G);
            AbstractC23641Du.A05(anonymousClass191, new PZX(A0Z, list, (InterfaceC23621Ds) null, 47), AbstractC141776au.A00(A0Z));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A0D;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return I58.A00(this, str);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0F);
    }

    public EMM() {
        C25027B5z c25027B5z = new C25027B5z(this, 24);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C25027B5z(new C25027B5z(this, 21), 22));
        this.A0G = AbstractC25225BEi.A0a(new C25027B5z(A00, 23), c25027B5z, new C57257Pbf(31, null, A00), AbstractC25225BEi.A1D(C50894MeP.class));
        this.A0E = new C35909FtT(this, 4);
        this.A0F = AbstractC60492pY.A02(this);
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(102195370);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_previous_module_name");
        if (string != null) {
            this.A0D = string;
            String string2 = requireArguments.getString("args_editor_logging_surface");
            if (string2 != null) {
                this.A08 = string2;
                this.A0B = requireArguments.getBoolean(AbstractC111324zv.A00(3948));
                this.A06 = requireArguments.getString(AbstractC111324zv.A00(3937));
                this.A07 = requireArguments.getString(AbstractC111324zv.A00(3938));
                this.A05 = (User) requireArguments.getParcelable(AbstractC111324zv.A00(3939));
                this.A0C = requireArguments.getString("args_entry_point");
                C0f9.A09(967656681, A02);
                return;
            }
            A14 = AbstractC166987dD.A14("editor logging surface required");
            i = -1221505849;
        } else {
            A14 = AbstractC166987dD.A14("previous module required");
            i = 1036552306;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(885523768);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_mentions_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-26681902, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1881165290);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        this.A04 = null;
        C0f9.A09(-844168270, A02);
    }
}
