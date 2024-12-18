package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.HBw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38924HBw extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SuggestedUsersReelsFragment";
    public List A00;
    public boolean A01;
    public C38240Grj A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "dev_options_suggested_users_reels_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (!this.A01) {
            C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC166987dD.A0o(this.A03));
            A0M.A0B("discover/su_in_reels_equivalent/");
            C1ON A0e = AbstractC25227BEk.A0e(A0M, HAG.class, ITJ.class);
            C39030HGg.A00(A0e, this, 31);
            schedule(A0e);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1262825986);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_viewer_suggested_users, false);
        C38240Grj c38240Grj = new C38240Grj(A0R);
        this.A02 = c38240Grj;
        View view = c38240Grj.itemView;
        AbstractC31172DnG.A1B(view.getContext(), view, android.R.color.black);
        AbstractC145016gM.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A03), true, false);
        C0f9.A09(469861893, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(569220059);
        super.onPause();
        if (!C37549Gg5.A08) {
            C37549Gg5.A04 = 0;
            C37549Gg5.A06 = null;
            C37549Gg5.A07.clear();
        }
        C0f9.A09(-605602074, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        List list;
        C38240Grj c38240Grj;
        int A02 = C0f9.A02(-934244883);
        super.onResume();
        if (this.A01 && (list = this.A00) != null && (c38240Grj = this.A02) != null) {
            C37549Gg5.A09.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A03), c38240Grj, null, null, null, null, AbstractC166987dD.A1F(list));
        }
        C0f9.A09(687339711, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-597795564);
        super.onStop();
        AbstractC145016gM.A02(requireActivity(), this, AbstractC166987dD.A0r(this.A03), true, false);
        C0f9.A09(1472068346, A02);
    }
}
