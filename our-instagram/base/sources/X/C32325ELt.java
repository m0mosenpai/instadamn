package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ELt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32325ELt extends AbstractC59962oe implements InterfaceC37289Gbq, AbsListView.OnScrollListener, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectThreadMemberPickFragment";
    public UserSession A02;
    public C35012Fbj A03;
    public C31600DuS A04;
    public InterfaceC83733oI A05;
    public String A07;
    public boolean A0A;
    public boolean A0B;
    public InterfaceC60602pj A0C;
    public C7TQ A0D;
    public String A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public int A01 = 0;
    public int A00 = 0;
    public EnumC31337Dq2 A06 = EnumC31337Dq2.A05;
    public ArrayList A08 = AbstractC166987dD.A1E();
    public ArrayList A09 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ C25805BbM BJO() {
        return null;
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void Cyq() {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void DdP() {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void DjA() {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void DjC(View view, boolean z) {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void E2Q() {
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2S(String str, String str2) {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void E2T() {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void E2Y() {
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2p(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2z(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC37289Gbq
    public final void E30(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_thread_add_member";
    }

    @Override // X.InterfaceC37289Gbq
    public final void DdR() {
        C0K8.A0E(__redex_internal_original_name, "RecipientPickerController is null");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        if (!this.A08.isEmpty()) {
            int i2 = 2131958810;
            if (this.A01 == 29) {
                i2 = 2131959038;
            }
            interfaceC56362iU.AAF(new ViewOnClickListenerC35680FpF(this, 37), i2);
        } else if (this.A0E != null) {
            if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A02, 36324514107306199L)) {
                String str = this.A0E;
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A06 = R.drawable.instagram_link_pano_outline_24;
                A0B.A05 = 2131963328;
                AbstractC31176DnK.A1B(new ViewOnClickListenerC35671Fp6(this, str, 8), A0B, interfaceC56362iU);
            }
        }
        if (this.A01 == 29) {
            i = 2131959039;
            if (this.A06 == EnumC31337Dq2.A02) {
                i = 2131959040;
            }
        } else {
            i = 2131958680;
        }
        AbstractC25229BEm.A1G(interfaceC56362iU, i);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        InterfaceC60602pj interfaceC60602pj = this.A0C;
        if (interfaceC60602pj != null && (interfaceC60602pj instanceof EVT)) {
            EVT evt = (EVT) interfaceC60602pj;
            C31600DuS c31600DuS = evt.A09;
            UserSession userSession = evt.A07;
            InterfaceC11380iw interfaceC11380iw = evt.A06;
            InterfaceC169517hR interfaceC169517hR = evt.A01;
            if (interfaceC169517hR == null || (str = interfaceC169517hR.BjQ()) == null) {
                str = "";
            }
            c31600DuS.A07(interfaceC11380iw, userSession, str);
            return false;
        }
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(526276078);
        super.onCreate(bundle);
        this.A02 = AbstractC31176DnK.A0S(this);
        InterfaceC83713oG A00 = AbstractC2054897w.A00(requireArguments(), "DirectThreadMemberPickFragment.THREAD_ID");
        A00.getClass();
        this.A05 = (InterfaceC83733oI) A00;
        this.A07 = requireArguments().getString("DirectThreadMemberPickFragment.THREAD_V2_ID");
        this.A0H = requireArguments().getBoolean("DirectThreadMemberPickFragment.ARGUMENT_IS_ADMIN_APPROVAL_REQUIRED");
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList("DirectThreadMemberPickFragment.ARGUMENT_EXCLUDED_IDS");
        stringArrayList.getClass();
        this.A0F = stringArrayList;
        this.A0B = requireArguments().getBoolean("DirectThreadMemberPickFragment.ARGUMENT_IS_INTEROP_THREAD");
        this.A0G = requireArguments().getBoolean("DirectThreadMemberPickFragment.ARGUMENT_HAS_EPD_RESTRICTED_MEMBER");
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList(AbstractC111324zv.A00(310));
        parcelableArrayList.getClass();
        this.A09 = parcelableArrayList;
        this.A01 = requireArguments().getInt("DirectThreadMemberPickFragment.THREAD_SUBTYPE");
        this.A00 = requireArguments().getInt("DirectThreadMemberPickFragment.AUDIENCE_TYPE");
        this.A0E = requireArguments().getString("DirectThreadMemberPickFragment.GROUP_INVITE_LINK");
        this.A0A = requireArguments().getBoolean("DirectThreadMemberPickFragment.IS_ADMIN");
        String string = requireArguments().getString("DirectThreadMemberPickFragment.ARGUMENT_HEADER_TYPE");
        if (string != null) {
            this.A06 = EnumC31337Dq2.valueOf(string);
        }
        this.A0D = AbstractC34091F2t.A00(this.A02, this.A05);
        this.A04 = C31600DuS.A00(this.A02, false);
        Context requireContext = requireContext();
        C08790ch A002 = AbstractC018607g.A00(this);
        UserSession userSession = this.A02;
        List list = this.A0F;
        int i = requireArguments().getInt("DirectThreadMemberPickFragment.ARGUMENT_COLLABORATOR_COUNT");
        int i2 = requireArguments().getInt("DirectThreadMemberPickFragment.ARGUMENT_MODERATOR_COUNT");
        InterfaceC83733oI interfaceC83733oI = this.A05;
        C14360o3.A0B(interfaceC83733oI, 0);
        int i3 = this.A01;
        EnumC31337Dq2 enumC31337Dq2 = this.A06;
        EVT evt = new EVT(requireContext, A002, this, userSession, this, this.A04, enumC31337Dq2, list, i, i2, i3, interfaceC83733oI instanceof MsysThreadId);
        this.A0C = evt;
        registerLifecycleListener(evt);
        UserSession userSession2 = this.A02;
        InterfaceC83733oI interfaceC83733oI2 = this.A05;
        String str = this.A07;
        ArrayList arrayList = this.A09;
        C7TQ c7tq = this.A0D;
        boolean z = this.A0H;
        boolean z2 = this.A0B;
        boolean z3 = this.A0G;
        int i4 = this.A01;
        int i5 = this.A00;
        this.A03 = new C35012Fbj(this, userSession2, c7tq, this.A04, interfaceC83733oI2, this.A06, str, arrayList, i4, i5, z, z2, z3);
        C0f9.A09(-276592092, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1245030185);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity.getParent() != null && (requireActivity.getParent() instanceof InterfaceC53712dA)) {
            ((InterfaceC53712dA) requireActivity.getParent()).EfL(8);
        }
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_direct_thread_member_pick);
        C0f9.A09(-1318995996, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-866704952);
        super.onDestroy();
        this.A03.A04.A01();
        C0f9.A09(510516776, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1766190165);
        super.onDestroyView();
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity.getParent() != null && (requireActivity.getParent() instanceof InterfaceC53712dA)) {
            ((InterfaceC53712dA) requireActivity.getParent()).EfL(0);
        }
        C0f9.A09(1980488104, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C0f9.A0A(877054195, C0f9.A03(869369081));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C0f9.A0A(1520292410, C0f9.A03(1489746597));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.direct_invite_link_row);
        String str = this.A0E;
        if (str != null) {
            UserSession userSession = this.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (AbstractC31178DnM.A1X(c06090Tz, userSession, 36314545488595639L) && this.A01 != 29 && !AbstractC31178DnM.A1X(c06090Tz, this.A02, 36324514107306199L)) {
                requireViewById.setVisibility(0);
                AbstractC31173DnH.A0Y(requireViewById, R.id.invite_link_text_cell).A0H(str);
                C0fQ.A00(new ViewOnClickListenerC35671Fp6(this, str, 7), requireViewById);
                return;
            }
        }
        requireViewById.setVisibility(8);
    }
}
