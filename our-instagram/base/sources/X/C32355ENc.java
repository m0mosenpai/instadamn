package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.ENc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32355ENc extends AbstractC60672pq implements InterfaceC1570173f, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CommentLikesListFragment";
    public EQM A00;
    public String A01;
    public boolean A02;
    public C38E A03;
    public String A04;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final C31714DwJ A05 = new C31714DwJ(this, 15);

    @Override // X.InterfaceC1570173f
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        String str;
        AbstractC167017dG.A1N(reel, gradientSpinnerAvatarView);
        List A1J = AbstractC166987dD.A1J(reel);
        C38E c38e = this.A03;
        if (c38e == null) {
            str = "reelViewerLauncher";
        } else {
            String str2 = this.A04;
            if (str2 == null) {
                str = "reelTraySessionId";
            } else {
                c38e.A0C = str2;
                C31559Dtj.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), c38e, this, 12);
                c38e.A0A(reel, C3G2.A0R, gradientSpinnerAvatarView, A1J, A1J, A1J);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC1570173f
    public final void DHp(User user, int i) {
    }

    @Override // X.InterfaceC1570173f
    public final void DT1(User user) {
    }

    @Override // X.InterfaceC1570173f
    public final void Dy8(User user, int i) {
        C14360o3.A0B(user, 0);
        InterfaceC09390do interfaceC09390do = this.A06;
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), user.getId(), "comment_likes_user_row", "comment_likers");
        C140966Yy A0j = AbstractC25233BEq.A0j(this, interfaceC09390do);
        A0j.A0F = true;
        C31368DqX.A02(A0j, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01);
    }

    @Override // X.InterfaceC1570173f
    public final void Dy9(View view, User user, int i) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "comment_likers";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131965123));
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, X.2sz] */
    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1802067381);
        Bundle requireArguments = requireArguments();
        String A00 = AbstractC111324zv.A00(1553);
        if (requireArguments.containsKey(A00)) {
            String string = requireArguments().getString(A00, null);
            this.A01 = string;
            if (string != null) {
                this.A04 = AbstractC166997dE.A0n();
                InterfaceC09390do interfaceC09390do = this.A06;
                this.A03 = new C38E(this, AbstractC166987dD.A0r(interfaceC09390do), new C38C(this));
                super.onCreate(bundle);
                Context requireContext = requireContext();
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                C14360o3.A0B(A0r, 2);
                EQM eqm = new EQM(requireContext, null, null, this, A0r, null, new Object(), null, this, null, null, null, null, null, false, true, false, false, false, true, false, false, true);
                this.A00 = eqm;
                setAdapter(eqm);
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                String str = this.A01;
                if (str != null) {
                    C1ON A022 = AbstractC35238FgX.A02(A0r2, AbstractC13670mt.A06("media/%s/comment_likers/", str), AbstractC111324zv.A00(831));
                    A022.A00 = this.A05;
                    schedule(A022);
                    C0f9.A09(1345745952, A02);
                    return;
                }
            }
            C14360o3.A0F("commentId");
            throw C00O.createAndThrow();
        }
        IllegalStateException A0u = AbstractC31172DnG.A0u();
        C0f9.A09(-2090414096, A02);
        throw A0u;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1573639842);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview_with_progress, viewGroup, false);
        C0f9.A09(-1679782029, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C161887My c161887My;
        int A02 = C0f9.A02(1986627310);
        EQM eqm = this.A00;
        if (eqm != null && (c161887My = eqm.A06) != null) {
            c161887My.A01();
        }
        super.onDestroy();
        C0f9.A09(1725942128, A02);
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        AbstractC31179DnN.A12(recyclerView);
        recyclerView.A0S = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1811866451);
        super.onStart();
        if (this.A02) {
            EQM eqm = this.A00;
            if (eqm != null) {
                eqm.A0C = true;
            }
            AbstractC31177DnL.A18(this, C56352iT.A0t, true);
            AbstractC31557Dth.A01(this, true);
        }
        C0f9.A09(418692530, A02);
    }
}
