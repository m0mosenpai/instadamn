package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V01 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "VotingInfoCenterFragment";
    public C62862tP A00;
    public UserSession A01;
    public RefreshableRecyclerViewLayout A02;
    public C70164WEe A03;
    public C69012Vfo A04;
    public C69651Vss A05;
    public JnY A06;
    public C69711Vu6 A07;
    public C6WQ A08;
    public C57112jm A09;
    public boolean A0A;
    public final C68817VcY A0B = new C68817VcY(this);

    public final void A01() {
        VJS vjs;
        C69134ViP c69134ViP;
        String str;
        this.A07.A00("change_state");
        C69651Vss c69651Vss = this.A05;
        FragmentActivity requireActivity = requireActivity();
        C62862tP c62862tP = this.A00;
        C14360o3.A0B(c62862tP, 2);
        C67841UzE c67841UzE = c69651Vss.A00;
        if (c67841UzE != null && (vjs = c67841UzE.A02) != null && (c69134ViP = vjs.A00) != null && (str = c69134ViP.A00) != null) {
            Map map = c69134ViP.A02;
            if (map == null) {
                map = new LinkedHashMap();
            }
            map.put("module", "voting_info_center");
            AbstractC192798gL A05 = C192108fB.A05(c69651Vss.A03, str, map);
            A05.A00(new C67906V1v(4, c62862tP, c69651Vss, this, this));
            C1GJ.A00(requireActivity, AbstractC018607g.A00(this), A05);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "voting_info_center";
    }

    public final int A00() {
        C67841UzE c67841UzE = this.A05.A00;
        if (c67841UzE != null && c67841UzE.A08) {
            return AbstractC53242c7.A08(requireContext());
        }
        return R.color.audio_bar_action_color_enabled;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.2UU, X.JnY] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-525947184);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC31176DnK.A0S(this);
        VEB veb = (VEB) requireArguments.getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (veb == null) {
            veb = VEB.A0H;
        }
        String string = requireArguments.getString("media_id");
        String string2 = requireArguments.getString("utm_source");
        String string3 = requireArguments.getString("hoisted_module_id_or_url_path");
        C57112jm A0N = AbstractC31180DnO.A0N();
        this.A09 = A0N;
        C62862tP A022 = C62862tP.A02(this, this, this.A01, A0N);
        this.A00 = A022;
        A022.A01.put(R.id.info_center_refresh_callback, new C70955Wl2(this));
        C69711Vu6 c69711Vu6 = new C69711Vu6(this, this.A01, veb, string, string2);
        this.A07 = c69711Vu6;
        this.A05 = new C69651Vss(this.A01, veb, c69711Vu6, string, string3);
        this.A03 = new C70164WEe(requireActivity(), this.A01, this.A05, this);
        this.A04 = new C69012Vfo(this.A09, this.A07);
        C69711Vu6 c69711Vu62 = this.A07;
        c69711Vu62.A00 = System.currentTimeMillis();
        c69711Vu62.A01("entry", false);
        UserSession userSession = this.A01;
        C62862tP c62862tP = this.A00;
        C68817VcY c68817VcY = this.A0B;
        ?? c2uu = new C2UU();
        c2uu.A07 = new ArrayList();
        c2uu.A00 = c62862tP;
        c2uu.A03 = this;
        c2uu.A05 = C05F.A01;
        c2uu.A02 = c68817VcY;
        c2uu.A01 = userSession;
        this.A06 = c2uu;
        this.A0A = true;
        C0f9.A09(930512646, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1887102813);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_info_center);
        C0f9.A09(1112892486, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1571822574);
        this.A07.A01("exit", true);
        super.onDestroy();
        C0f9.A09(-1157812956, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2053577922);
        super.onDestroyView();
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.A02;
        if (refreshableRecyclerViewLayout != null) {
            refreshableRecyclerViewLayout.setAdapter(null);
        }
        this.A02 = null;
        C70164WEe c70164WEe = this.A03;
        c70164WEe.A0F = null;
        c70164WEe.A0D = null;
        c70164WEe.A0A = null;
        c70164WEe.A05 = null;
        c70164WEe.A0L.removeAllUpdateListeners();
        C0f9.A09(-1671501241, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(698534998);
        super.onPause();
        this.A03.A0L.cancel();
        C0f9.A09(300739882, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-987784982);
        super.onResume();
        C70164WEe c70164WEe = this.A03;
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        c70164WEe.A03();
        AbstractC56402iY.A02(rootActivity, rootActivity.getColor(R.color.fds_transparent));
        C70164WEe.A02(c70164WEe);
        C0f9.A09(1011841913, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-571812501);
        super.onStart();
        AbstractC31179DnN.A1K(this, 8);
        C70164WEe c70164WEe = this.A03;
        Activity rootActivity = getRootActivity();
        View view = c70164WEe.A0A;
        if (view != null) {
            if (rootActivity != null && rootActivity.getWindow() != null) {
                AbstractC56402iY.A08(rootActivity.getWindow(), true);
            }
            int A01 = AbstractC56402iY.A01(rootActivity);
            c70164WEe.A04 = A01;
            view.setLayoutParams(new C56302iJ(-1, A01));
            C56352iT c56352iT = c70164WEe.A0D;
            if (c56352iT != null) {
                c56352iT.A0P.setTranslationY(c70164WEe.A04);
            }
            View view2 = c70164WEe.A09;
            if (view2 != null) {
                view2.setTranslationY(c70164WEe.A04);
            }
        }
        C0f9.A09(-224132799, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(928032536);
        super.onStop();
        AbstractC31179DnN.A1K(this, 0);
        C70164WEe c70164WEe = this.A03;
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        if (rootActivity.getWindow() != null) {
            AbstractC56402iY.A08(rootActivity.getWindow(), false);
            AbstractC56402iY.A02(rootActivity, c70164WEe.A0K);
        }
        C0f9.A09(-2131023281, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ac, code lost:
    
        if (r1 < 0) goto L7;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V01.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
