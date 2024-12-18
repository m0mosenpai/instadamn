package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* loaded from: classes8.dex */
public final class KBQ extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectQuickReplyComposerFragment";
    public UserSession A00;
    public C46512KiB A01;
    public InterfaceC50430MOk A02;
    public View A03;
    public ImageView A04;
    public RecyclerView A05;
    public LGE A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_quick_reply_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    public static final void A00(KBQ kbq, C44178Jfh c44178Jfh) {
        String str;
        Bundle A0b = AbstractC166987dD.A0b();
        C46512KiB c46512KiB = kbq.A01;
        if (c46512KiB == null) {
            str = "analyticsData";
        } else {
            c46512KiB.A00(A0b);
            if (c44178Jfh != null) {
                A0b.putString("DirectEditQuickReplyFragment.quick_reply_id", c44178Jfh.A00());
            }
            UserSession userSession = kbq.A00;
            if (userSession == null) {
                str = "userSession";
            } else {
                AbstractC31172DnG.A1M(kbq, new C6XJ(kbq.requireActivity(), A0b, userSession, ModalActivity.class, "direct_edit_quick_reply"));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1219441839);
        super.onCreate(bundle);
        this.A00 = AbstractC31177DnL.A0R(this);
        C0f9.A09(1570681142, A02);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.KiB, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(208710910);
        C14360o3.A0B(layoutInflater, 0);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("source_module");
        String string2 = requireArguments.getString("waterfall_id");
        String string3 = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        ?? obj = new Object();
        obj.A01 = string;
        obj.A02 = string2;
        obj.A00 = string3;
        this.A01 = obj;
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_quick_reply, viewGroup, false);
        this.A03 = inflate;
        if (inflate != null) {
            AbstractC166987dD.A1P(requireContext(), AbstractC167007dF.A0N(inflate, R.id.quick_reply_title), 2131960391);
            View view = this.A03;
            ImageView imageView = null;
            if (view != null) {
                imageView = AbstractC31171DnF.A08(view, R.id.add_quick_reply_button);
            }
            this.A04 = imageView;
            if (imageView != null) {
                AbstractC166997dE.A18(requireContext(), imageView, 2131972830);
                imageView.setVisibility(0);
                ViewOnClickListenerC48072LPx.A01(imageView, 18, this);
            }
            View view2 = this.A03;
            if (view2 != null) {
                View A0U = AbstractC167017dG.A0U(view2, R.id.stub_quick_reply_text_list);
                C14360o3.A0C(A0U, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                RecyclerView recyclerView = (RecyclerView) A0U;
                this.A05 = recyclerView;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                UserSession userSession = this.A00;
                String str = "userSession";
                if (userSession != null) {
                    RecyclerView recyclerView2 = this.A05;
                    if (recyclerView2 != null) {
                        View view3 = this.A03;
                        if (view3 != null) {
                            C57012jc A0V = AbstractC31177DnL.A0V(view3, R.id.empty_view);
                            View view4 = this.A03;
                            if (view4 != null) {
                                View requireViewById = view4.requireViewById(R.id.loading_spinner);
                                C48686LgG c48686LgG = new C48686LgG(this);
                                UserSession userSession2 = this.A00;
                                if (userSession2 != null) {
                                    JUI A00 = JUJ.A00(userSession2);
                                    C46512KiB c46512KiB = this.A01;
                                    if (c46512KiB == null) {
                                        str = "analyticsData";
                                    } else {
                                        LGE lge = new LGE(requireViewById, recyclerView2, this, userSession, A0V, c46512KiB, c48686LgG, A00);
                                        this.A06 = lge;
                                        lge.A01();
                                        View view5 = this.A03;
                                        C0f9.A09(-746432181, A02);
                                        return view5;
                                    }
                                }
                            } else {
                                A14 = AbstractC166987dD.A14("Required value was null.");
                                i = -870841461;
                            }
                        } else {
                            A14 = AbstractC166987dD.A14("Required value was null.");
                            i = -2128191721;
                        }
                    } else {
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i = -614713200;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1972092603;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -986581946;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-509018829);
        super.onDestroy();
        LGE lge = this.A06;
        if (lge == null) {
            C14360o3.A0F("quickReplyTextListController");
            throw C00O.createAndThrow();
        }
        lge.A06.A02(lge.A01, C44192Jfv.class);
        C0f9.A09(1595632512, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1981139834);
        super.onDestroyView();
        this.A03 = null;
        this.A05 = null;
        this.A04 = null;
        C0f9.A09(885317547, A02);
    }
}
