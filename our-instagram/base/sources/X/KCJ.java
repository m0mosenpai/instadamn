package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* loaded from: classes8.dex */
public final class KCJ extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectQuickReplySettingsFragment";
    public UserSession A00;
    public C46512KiB A01;
    public View A02;
    public LGE A03;
    public boolean A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131960391);
        AbstractC31176DnK.A1C(ViewOnClickListenerC48072LPx.A00(this, 19), AbstractC31174DnI.A0K(), interfaceC56362iU);
        C3LO c3lo = new C3LO();
        c3lo.A06 = R.drawable.instagram_add_pano_outline_24;
        c3lo.A05 = 2131952356;
        AbstractC31176DnK.A1B(ViewOnClickListenerC48072LPx.A00(this, 20), c3lo, interfaceC56362iU);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String string = requireArguments().getString(AbstractC111324zv.A00(3044));
        if (string != null) {
            A00(this, string);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_quick_reply_settings_fragment";
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

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A04) {
            return false;
        }
        this.A04 = false;
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        F0Z.A00(requireActivity, userSession);
        return true;
    }

    public static final void A00(KCJ kcj, String str) {
        String str2;
        Bundle A0b = AbstractC166987dD.A0b();
        C46512KiB c46512KiB = kcj.A01;
        if (c46512KiB == null) {
            str2 = "analyticsData";
        } else {
            c46512KiB.A00(A0b);
            if (str != null) {
                A0b.putString("DirectEditQuickReplyFragment.quick_reply_id", str);
            }
            UserSession userSession = kcj.A00;
            if (userSession == null) {
                str2 = "userSession";
            } else {
                new C6XJ(kcj.requireActivity(), A0b, userSession, ModalActivity.class, "direct_edit_quick_reply").A0D(kcj, -1);
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 504) {
            this.A04 = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1860533989);
        super.onCreate(bundle);
        this.A00 = AbstractC31177DnL.A0R(this);
        C0f9.A09(199050013, A02);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.KiB, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(1960565335);
        C14360o3.A0B(layoutInflater, 0);
        this.A02 = layoutInflater.inflate(R.layout.fragment_direct_quick_reply_settings, viewGroup, false);
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        String A0n = AbstractC166997dE.A0n();
        ?? obj = new Object();
        obj.A01 = "settings";
        obj.A02 = A0n;
        obj.A00 = string;
        this.A01 = obj;
        UserSession userSession = this.A00;
        String str = "userSession";
        if (userSession != null) {
            View view = this.A02;
            if (view != null) {
                RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.quick_reply_text_list);
                View view2 = this.A02;
                if (view2 != null) {
                    C57012jc A0V = AbstractC31177DnL.A0V(view2, R.id.empty_view);
                    View view3 = this.A02;
                    if (view3 != null) {
                        View requireViewById = view3.requireViewById(R.id.loading_spinner);
                        C48687LgH c48687LgH = new C48687LgH(this);
                        UserSession userSession2 = this.A00;
                        if (userSession2 != null) {
                            JUI A00 = JUJ.A00(userSession2);
                            C46512KiB c46512KiB = this.A01;
                            if (c46512KiB == null) {
                                str = "analyticsData";
                            } else {
                                LGE lge = new LGE(requireViewById, A0G, this, userSession, A0V, c46512KiB, c48687LgH, A00);
                                this.A03 = lge;
                                lge.A01();
                                View view4 = this.A02;
                                C0f9.A09(78227835, A02);
                                return view4;
                            }
                        }
                    } else {
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i = 285193695;
                    }
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = -798238019;
                }
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -456960218;
            }
            C0f9.A09(i, A02);
            throw A14;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-644476274);
        super.onDestroy();
        LGE lge = this.A03;
        if (lge != null) {
            lge.A06.A02(lge.A01, C44192Jfv.class);
        }
        C0f9.A09(-1631998506, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2069400316);
        super.onDestroyView();
        this.A02 = null;
        C0f9.A09(2108684133, A02);
    }
}
