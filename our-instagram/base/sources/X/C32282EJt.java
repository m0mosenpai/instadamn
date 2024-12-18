package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.Collections;

/* renamed from: X.EJt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32282EJt extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectAllThreadJoinRequestsFragment";
    public UserSession A00;
    public C31892Dzy A01;
    public C35003Fba A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public View A0A;
    public RecyclerView A0B;
    public final java.util.Set A0C = AbstractC166987dD.A1H();
    public final InterfaceC62612t0 A0F = new G7M(this, 4);
    public final JH1 A0E = new C36391G3s(this, 0);
    public final InterfaceC62602sz A0G = new C36745GHo(this, 5);
    public final C36753GIa A0D = new C36753GIa(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "all_join_requests";
    }

    public static void A00(C32282EJt c32282EJt) {
        boolean A1b = AbstractC31171DnF.A1b(c32282EJt.A0C);
        View view = c32282EJt.A0A;
        int i = 2131958685;
        if (c32282EJt.A07) {
            i = 2131958684;
        }
        String string = c32282EJt.getString(i);
        ViewOnClickListenerC35691FpR A00 = ViewOnClickListenerC35691FpR.A00(c32282EJt, 51);
        C14360o3.A0B(string, 1);
        AbstractC34331FBz.A00(view, new FMT(A00, string, null, -1), A1b, false, c32282EJt.A05);
    }

    public static void A01(C32282EJt c32282EJt) {
        if (!c32282EJt.A06) {
            C35003Fba c35003Fba = c32282EJt.A02;
            if (c35003Fba == null || !AbstractC50102Ry.A00(c35003Fba.A02, "MINCURSOR")) {
                if (c32282EJt.A02 == null) {
                    AbstractC40579Hyz.A00(c32282EJt.A00, c32282EJt.A0E, c32282EJt.A04);
                } else {
                    boolean z = !c32282EJt.A03();
                    UserSession userSession = c32282EJt.A00;
                    String str = c32282EJt.A04;
                    C35003Fba c35003Fba2 = c32282EJt.A02;
                    JH1 jh1 = c32282EJt.A0E;
                    C14360o3.A0B(userSession, 0);
                    AbstractC25233BEq.A0w(1, str, c35003Fba2, jh1);
                    int i = 20;
                    if (z) {
                        i = C8S8.DEFAULT_SWIPE_ANIMATION_DURATION;
                    }
                    C1ON A08 = DirectThreadApi.A08(userSession, str, c35003Fba2.A02, i);
                    A08.A00 = new C37484Gf2(1, jh1, c35003Fba2);
                    C1GJ.A03(A08);
                }
                C31892Dzy c31892Dzy = c32282EJt.A01;
                c31892Dzy.A01 = true;
                c31892Dzy.notifyDataSetChanged();
                c32282EJt.A06 = true;
                c32282EJt.A08 = false;
            }
        }
    }

    public static void A02(C32282EJt c32282EJt, C35003Fba c35003Fba) {
        c32282EJt.A02 = c35003Fba;
        C31892Dzy c31892Dzy = c32282EJt.A01;
        if (c31892Dzy != null) {
            C14360o3.A0B(c35003Fba, 0);
            c31892Dzy.A00 = Collections.unmodifiableList(c35003Fba.A04);
            c31892Dzy.notifyDataSetChanged();
            if (c32282EJt.getActivity() != null) {
                AbstractC31178DnM.A0v(c32282EJt);
            }
        }
    }

    private boolean A03() {
        C35003Fba c35003Fba = this.A02;
        if (c35003Fba == null) {
            return false;
        }
        int size = Collections.unmodifiableList(c35003Fba.A04).size();
        C35003Fba c35003Fba2 = this.A02;
        boolean A1P = AbstractC167007dF.A1P(c35003Fba2.A00, size);
        boolean z = false;
        if (size + c35003Fba2.A01 >= 250) {
            z = true;
        }
        if (!A1P && !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r2 != r0) goto L9;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r4) {
        /*
            r3 = this;
            X.Fba r0 = r3.A02
            r2 = 1
            if (r0 == 0) goto L53
            r1 = 2131959743(0x7f131fbf, float:1.9556135E38)
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.AbstractC31174DnI.A0w(r3, r0, r1)
        L12:
            r4.setTitle(r0)
            r4.EkS(r2)
            X.Fba r0 = r3.A02
            if (r0 == 0) goto L33
            java.util.Set r0 = r3.A0C
            int r2 = r0.size()
            X.Fba r0 = r3.A02
            java.util.List r0 = r0.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r0 = r0.size()
            r1 = 2131239976(0x7f082428, float:1.8096274E38)
            if (r2 == r0) goto L36
        L33:
            r1 = 2131239977(0x7f082429, float:1.8096276E38)
        L36:
            r0 = 52
            X.FpR r0 = X.ViewOnClickListenerC35691FpR.A00(r3, r0)
            com.instagram.actionbar.ActionButton r1 = r4.Eha(r0, r1)
            boolean r0 = r3.A03()
            r4.EkG(r0)
            android.content.Context r0 = r3.requireContext()
            int r0 = X.AbstractC167017dG.A06(r0)
            X.AbstractC13880nE.A0c(r1, r0)
            return
        L53:
            r0 = 2131959744(0x7f131fc0, float:1.9556137E38)
            java.lang.String r0 = r3.getString(r0)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32282EJt.configureActionBar(X.2iU):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(404585631);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A04 = AbstractC31173DnH.A0j(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        this.A03 = requireArguments.getString(AbstractC31422DrR.A00());
        this.A07 = AbstractC31172DnG.A1X(requireArguments, "is_public_channel");
        C0f9.A09(970593010, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1263977105);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_direct_all_join_requests, viewGroup, false);
        View inflate = LayoutInflater.from(requireActivity()).inflate(R.layout.row_large_button_item, viewGroup2, false);
        inflate.setTag(new E2B(inflate));
        this.A0A = inflate;
        A00(this);
        viewGroup2.addView(this.A0A);
        ((FrameLayout.LayoutParams) this.A0A.getLayoutParams()).gravity = 80;
        C0f9.A09(-847897091, A02);
        return viewGroup2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(2023497810);
        super.onResume();
        if (this.A09) {
            this.A09 = false;
            this.A01.notifyDataSetChanged();
        }
        C0f9.A09(-1058318258, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.A0B = A0F;
        A0F.setLayoutManager(linearLayoutManager);
        C31892Dzy c31892Dzy = new C31892Dzy(this, this.A00, this.A0D, this.A0G);
        this.A01 = c31892Dzy;
        C35003Fba c35003Fba = this.A02;
        if (c35003Fba != null) {
            c31892Dzy.A00 = Collections.unmodifiableList(c35003Fba.A04);
            c31892Dzy.notifyDataSetChanged();
        }
        this.A0B.setAdapter(this.A01);
        this.A0B.A14(new C153156uj(linearLayoutManager, this.A0F, C153146ui.A0A));
        if (!A03()) {
            A01(this);
        }
    }
}
