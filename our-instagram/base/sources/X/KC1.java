package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class KC1 extends AbstractC59962oe implements InterfaceC11480j6, InterfaceC50461MPp {
    public static final String __redex_internal_original_name = "DirectPollMessageVotingFragment";
    public View A00;
    public View A01;
    public View A02;
    public C47358Kw7 A03;
    public LJc A04;
    public C47359Kw8 A05;
    public C2EC A06;
    public G5I A07;
    public IgdsBottomButtonLayout A08;
    public boolean A09;
    public boolean A0A;
    public LinearLayoutManager A0B;
    public final C41761wQ A0C = AbstractC31174DnI.A0S();
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long A0j;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC48072LPx.A01(AbstractC166997dE.A0S(view, R.id.poll_message_cancel), 42, this);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.poll_message_details_recycler_view);
        LJc lJc = this.A04;
        String str = "controller";
        if (lJc != null) {
            C66362zD c66362zD = lJc.A05.A00;
            if (c66362zD != null) {
                recyclerView.setAdapter(c66362zD);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
                this.A0B = linearLayoutManager;
                recyclerView.setLayoutManager(linearLayoutManager);
                IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(view, R.id.poll_message_submit_button);
                igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
                igdsBottomButtonLayout.setPrimaryActionOnClickListener(ViewOnClickListenerC48072LPx.A00(this, 43));
                this.A08 = igdsBottomButtonLayout;
                this.A00 = view.requireViewById(R.id.poll_message_progress_bar);
                this.A01 = view.requireViewById(R.id.poll_message_details_content);
                this.A02 = view.requireViewById(R.id.poll_message_spacing_view);
                LJc lJc2 = this.A04;
                if (lJc2 != null) {
                    lJc2.A02 = this;
                    if (this.A0A) {
                        Object value = this.A0D.getValue();
                        LJc lJc3 = this.A04;
                        if (lJc3 != null) {
                            C3o9 c3o9 = lJc3.A07;
                            C14360o3.A0B(value, 0);
                            InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37052GUi(value, 3));
                            String A07 = JRE.A07(c3o9);
                            if (A07 != null && (A0j = AbstractC166997dE.A0j(A07)) != null) {
                                C44109JeZ.A00(((C137756Lx) A00.getValue()).A01.A09.A0L(new C43597JQd(new MsysThreadId(EnumC92794Ds.A04, null, A0j.longValue()), 49)).A0K(C48412LbR.A00), lJc2.A04, value, lJc2, 6);
                                return;
                            }
                            return;
                        }
                    } else {
                        AbstractC12990ll A0k = AbstractC25230BEn.A0k(this.A0D, 0);
                        String str2 = lJc2.A0A;
                        C25621Ms A0M = AbstractC31177DnL.A0M(A0k);
                        AbstractC31173DnH.A1Q(A0M, "direct_v2/group_poll/%s/", new Object[]{str2});
                        A0M.A0S(K8M.class, LCA.class);
                        A0M.A0R = true;
                        C1ON A0N = A0M.A0N();
                        C44093JeI.A00(A0N, lJc2, 14);
                        lJc2.A01 = A0N;
                        schedule(A0N);
                        return;
                    }
                }
            } else {
                str = "igRecyclerViewAdapter";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r3 != 61) goto L10;
     */
    @Override // X.InterfaceC11480j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11520jB E6b() {
        /*
            r6 = this;
            X.0jB r5 = new X.0jB
            r5.<init>()
            X.2EC r4 = r6.A06
            if (r4 == 0) goto L1c
            int r3 = r4.C7g()
            r0 = 28
            r2 = 1
            java.lang.String r1 = "thread_id"
            if (r3 == r0) goto L33
            r0 = 29
            if (r3 == r0) goto L1d
            r0 = 61
            if (r3 == r0) goto L33
        L1c:
            return r5
        L1d:
            java.lang.String r0 = r4.C7I()
            r5.A0A(r1, r0)
            java.lang.String r0 = "is_broadcast_chat"
            r5.A09(r0, r2)
            int r1 = r4.AdZ()
            java.lang.String r0 = "audience_type"
            r5.A09(r0, r1)
            return r5
        L33:
            java.lang.String r0 = r4.C7I()
            r5.A0A(r1, r0)
            java.lang.String r0 = "is_csc_chat"
            r5.A09(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KC1.E6b():X.0jB");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        C2EC c2ec = this.A06;
        if (c2ec != null) {
            int C7g = c2ec.C7g();
            if (C7g != 28) {
                if (C7g != 29) {
                    if (C7g != 32) {
                        if (C7g != 61) {
                            if (C7g != 62) {
                                return "direct_poll_message_voting";
                            }
                            return "discoverable_chat_thread";
                        }
                        return "csc_direct_thread";
                    }
                    return "discoverable_chat_thread";
                }
                return AbstractC111324zv.A00(2009);
            }
            return "csc_direct_thread";
        }
        return "direct_poll_message_voting";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.InterfaceC50461MPp
    public final boolean isScrolledToTop() {
        LinearLayoutManager linearLayoutManager = this.A0B;
        if (linearLayoutManager == null) {
            C14360o3.A0F("linearLayoutManager");
            throw C00O.createAndThrow();
        }
        return AbstractC110854yx.A03(linearLayoutManager);
    }

    @Override // X.InterfaceC50461MPp
    public final void onBottomSheetPositionChanged(int i, int i2) {
        View view = this.A02;
        if (view != null) {
            AbstractC43593JPy.A1C(view, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        if (r3 == 0) goto L24;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = 1310523398(0x4e1d0006, float:6.585061E8)
            int r2 = X.C0f9.A02(r0)
            r7 = r16
            r0 = r17
            super.onCreate(r0)
            android.os.Bundle r6 = r7.requireArguments()
            X.0do r5 = r7.A0D
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r5)
            X.Kw8 r0 = new X.Kw8
            r0.<init>(r7, r1)
            r7.A05 = r0
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r5)
            X.G5I r0 = new X.G5I
            r0.<init>(r1)
            r7.A07 = r0
            java.lang.String r0 = "DirectPollMessageVotingFragment_thread_key"
            android.os.Parcelable r10 = r6.getParcelable(r0)
            if (r10 == 0) goto Lbe
            X.3o9 r10 = (X.C3o9) r10
            java.lang.String r0 = "DirectPollMessageVotingFragment_is_msys"
            r4 = 0
            boolean r0 = r6.getBoolean(r0, r4)
            r7.A0A = r0
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r5)
            X.2DS r3 = X.AbstractC28761aE.A00(r0)
            java.lang.String r1 = X.JRE.A07(r10)
            r0 = 0
            if (r1 == 0) goto L50
            X.3kb r0 = X.AbstractC31172DnG.A0h(r3, r1)
        L50:
            r7.A06 = r0
            if (r0 == 0) goto L5d
            int r1 = r0.C7g()
            r0 = 29
            if (r1 != r0) goto L5d
            r4 = 1
        L5d:
            r7.A09 = r4
            java.lang.String r0 = "DirectPollMessageVotingFragment_poll_id"
            java.lang.String r12 = X.AbstractC31172DnG.A13(r6, r0)
            X.C14360o3.A07(r12)
            X.18A r11 = X.AbstractC31176DnK.A0h(r5)
            android.content.Context r0 = r7.requireContext()
            X.KzU r8 = new X.KzU
            r8.<init>(r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131962025(0x7f1328a9, float:1.9560763E38)
            java.lang.String r13 = X.AbstractC166997dE.A0p(r1, r0)
            X.Kw8 r9 = r7.A05
            if (r9 != 0) goto L8e
            java.lang.String r0 = "logger"
            X.C14360o3.A0F(r0)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        L8e:
            boolean r14 = r7.A09
            X.2EC r4 = r7.A06
            r15 = 0
            if (r4 == 0) goto Lbc
            int r3 = r4.BI1()
            java.util.List r1 = r4.Aa2()
            java.lang.String r0 = X.AbstractC31173DnH.A0t(r5)
            boolean r1 = r1.contains(r0)
            boolean r0 = r4.CbK()
            if (r0 == 0) goto Lba
            r15 = r1
        Lac:
            X.LJc r6 = new X.LJc
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r7.A04 = r6
            r0 = 1656818193(0x62c10a11, float:1.7804735E21)
            X.C0f9.A09(r0, r2)
            return
        Lba:
            if (r3 != 0) goto Lac
        Lbc:
            r15 = 1
            goto Lac
        Lbe:
            java.lang.String r0 = "thread key can't be null"
            java.lang.IllegalArgumentException r1 = X.AbstractC166987dD.A12(r0)
            r0 = -249037175(0xfffffffff127fe89, float:-8.318674E29)
            X.C0f9.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KC1.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2078071726);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_poll_message_voting, viewGroup, false);
        C0f9.A09(-431303269, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-574041923);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A0C.A01();
        LJc lJc = this.A04;
        if (lJc == null) {
            C14360o3.A0F("controller");
            throw C00O.createAndThrow();
        }
        lJc.A02 = null;
        lJc.A04.A01();
        C0f9.A09(-175751097, A02);
    }
}
