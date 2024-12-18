package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class EOJ extends AbstractC43842Ja5 implements InterfaceC60122ou, GXP {
    public static final String __redex_internal_original_name = "DirectCardGalleryFragment";
    public int A00;
    public int A01;
    public InterfaceC56392iX A02;
    public FKN A03;
    public FKN A04;
    public Dz7 A05;
    public FPB A06;
    public AnonymousClass988 A07;
    public KB3 A08;
    public C7IM A09;
    public G1e A0A;
    public C75H A0B;
    public DirectThreadKey A0C;
    public C3o9 A0D;
    public Boolean A0E;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public C36152FxQ A0L;
    public Integer A0M;
    public Integer A0N;
    public boolean A0P;
    public final String A0R = "DirectCardGalleryFragment.ITEM_ACTIONS_FRAGMENT_TAG";
    public final InterfaceC09390do A0S = AbstractC60492pY.A02(this);
    public List A0O = AbstractC166987dD.A1E();
    public int A0K = R.drawable.instagram_camera_outline_96;
    public Boolean A0F = AbstractC166997dE.A0a();
    public final InterfaceC62602sz A0Q = new C36745GHo(this, 1);
    public final InterfaceC41501vz A0T = C31650DvG.A00(this, 14);

    public final void A0J(View view) {
        String str;
        C14360o3.A0B(view, 0);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.primary_button);
        FKN fkn = this.A03;
        String str2 = null;
        int i = 0;
        if (fkn == null) {
            if (A0e != null) {
                A0e.setVisibility(8);
            }
        } else if (A0e != null) {
            A0e.setEnabled(fkn.A02);
            A0e.setVisibility(0);
            FKN fkn2 = this.A03;
            if (fkn2 != null) {
                str = fkn2.A00;
            } else {
                str = null;
            }
            A0e.setText(str);
            C0fQ.A00(new NG6(this), A0e);
        }
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.secondary_button);
        if (this.A04 == null) {
            if (A0e2 != null) {
                A0e2.setVisibility(8);
            }
        } else if (A0e2 != null) {
            A0e2.setVisibility(0);
            FKN fkn3 = this.A04;
            if (fkn3 != null) {
                str2 = fkn3.A00;
            }
            A0e2.setText(str2);
            ViewOnClickListenerC35681FpG.A01(A0e2, 29, this);
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.recycler_view);
        if ((A0e != null && A0e.getVisibility() == 0) || (A0e2 != null && A0e2.getVisibility() == 0)) {
            i = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        }
        AbstractC13880nE.A0Y(A0S, i);
    }

    public final void A0K(View view) {
        C14360o3.A0B(view, 0);
        if (this.A0J != null) {
            C8QJ c8qj = new C8QJ(requireContext(), AbstractC166987dD.A0r(this.A0S), null, false);
            List list = this.A0J;
            if (list != null) {
                c8qj.A02(list);
                if (c8qj.getContentView() != null) {
                    c8qj.showAsDropDown(view, 0, 0);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.GXP
    public final void AEG(String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        if (str5 == null) {
            Bundle bundle = this.mArguments;
            if (bundle != null) {
                str6 = bundle.getString("client_context");
            } else {
                str6 = null;
            }
        }
        AbstractC165967bO.A00(AbstractC166987dD.A0r(this.A0S)).A0K(A0G(), str, str2, str3, str4, str6);
    }

    @Override // X.AbstractC43842Ja5
    public L5L getRecyclerConfigBuilder() {
        return configBuilder(new GWH(this, 3));
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        View A0B;
        C55541Olb c55541Olb;
        boolean z;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0J(view);
        boolean z2 = this instanceof C32703EaU;
        if (z2) {
            A0B = AbstractC31178DnM.A0B(this);
        } else {
            boolean z3 = this instanceof C32706EaX;
            A0B = AbstractC31178DnM.A0B(this);
            if (!z3) {
                c55541Olb = new C55541Olb(requireActivity(), 0);
                AbstractC008903d.A00(A0B, c55541Olb);
                int color = requireContext().getColor(R.color.igds_transparent_navigation_bar);
                C30D.A04(requireActivity(), color);
                AbstractC56402iY.A02(requireActivity(), color);
                this.A02 = AbstractC31173DnH.A0U(view, R.id.card_gallery_empty_state_view_holder);
                AbstractC31174DnI.A1E(this, A0E().A02, new GWH(this, 4), 8);
                RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) AbstractC166997dE.A0R(view, R.id.refreshable_container);
                if (z2 && !(this instanceof C32704EaV)) {
                    z = true;
                } else {
                    z = false;
                }
                refreshableNestedScrollingParent.setEnabled(z);
                refreshableNestedScrollingParent.A07 = new C49663Lwu(this, 1);
                AbstractC31174DnI.A1E(this, A0E().A03, new C50364MLq(6, view, refreshableNestedScrollingParent, this), 8);
            }
        }
        c55541Olb = new C55541Olb(getActivity(), 1);
        AbstractC008903d.A00(A0B, c55541Olb);
        int color2 = requireContext().getColor(R.color.igds_transparent_navigation_bar);
        C30D.A04(requireActivity(), color2);
        AbstractC56402iY.A02(requireActivity(), color2);
        this.A02 = AbstractC31173DnH.A0U(view, R.id.card_gallery_empty_state_view_holder);
        AbstractC31174DnI.A1E(this, A0E().A02, new GWH(this, 4), 8);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = (RefreshableNestedScrollingParent) AbstractC166997dE.A0R(view, R.id.refreshable_container);
        if (z2) {
        }
        z = false;
        refreshableNestedScrollingParent2.setEnabled(z);
        refreshableNestedScrollingParent2.A07 = new C49663Lwu(this, 1);
        AbstractC31174DnI.A1E(this, A0E().A03, new C50364MLq(6, view, refreshableNestedScrollingParent2, this), 8);
    }

    public static void A00(Intent intent, EOJ eoj, int i, int i2) {
        if (i == 5543 && i2 == -1 && intent != null && intent.getBooleanExtra("extra_response_added", false)) {
            eoj.A0E().A07();
        }
    }

    public final int A0C() {
        if (this instanceof C32702EaT) {
            UserSession A0r = AbstractC166987dD.A0r(this.A0S);
            return AbstractC25225BEi.A07(AbstractC166997dE.A0U(A0r), A0r, 36597970381573201L);
        }
        if (this instanceof C32706EaX) {
            return 1;
        }
        return -1;
    }

    public final UserSession A0D() {
        return AbstractC166987dD.A0r(this.A0S);
    }

    public final Dz7 A0E() {
        Dz7 dz7 = this.A05;
        if (dz7 != null) {
            return dz7;
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    public final C81663kb A0F() {
        return AbstractC28761aE.A00(AbstractC166987dD.A0r(this.A0S)).B3U(A0G());
    }

    public final DirectThreadKey A0G() {
        DirectThreadKey directThreadKey = this.A0C;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("threadKey");
        throw C00O.createAndThrow();
    }

    public final ArrayList A0H(boolean z) {
        String str;
        boolean z2;
        Integer num;
        if (this instanceof C32703EaU) {
            return AbstractC35054FcR.A00(requireContext(), AbstractC166987dD.A0r(this.A0S), this.A0E, C37019GTb.A00, C37051GUh.A00(this, 22), C37051GUh.A00(this, 23), C37051GUh.A00(this, 24), true, true);
        }
        if (this instanceof C32705EaW) {
            C32705EaW c32705EaW = (C32705EaW) this;
            ArrayList A1E = AbstractC166987dD.A1E();
            if (!C14360o3.A0K(c32705EaW.A04, "shared_stack")) {
                return A1E;
            }
            A1E.add(AbstractC35247Fgg.A04(c32705EaW.requireContext(), AbstractC166997dE.A0a(), null, C37051GUh.A00(c32705EaW, 33), 2131957640, R.drawable.instagram_delete_pano_outline_24));
            return A1E;
        }
        if (this instanceof C32706EaX) {
            Context requireContext = requireContext();
            UserSession A0r = AbstractC166987dD.A0r(this.A0S);
            Boolean bool = this.A0E;
            Dz7 A0E = A0E();
            C14360o3.A0C(A0E, AbstractC43591JPw.A00(44));
            return AbstractC35054FcR.A00(requireContext, A0r, bool, GTa.A00, C37051GUh.A00(this, 12), C37051GUh.A00(this, 13), C37051GUh.A00(this, 14), A0E.A0C(), false);
        }
        Bundle bundle = this.mArguments;
        Integer num2 = null;
        if (bundle != null) {
            str = bundle.getString("surface");
        } else {
            str = null;
        }
        boolean z3 = true;
        if (AbstractC166997dE.A1Z(this.A0E, true) && (C14360o3.A0K(str, "roll_call") || C14360o3.A0K(str, "add_yours") || C14360o3.A0K(str, "questions"))) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = A0E().A09.A00;
        if (str2 == null || !C98Q.A00(AbstractC166987dD.A0r(this.A0S)).A00(AbstractC31171DnF.A0N(str2), 7) || (!C14360o3.A0K(str, "add_yours") && !C14360o3.A0K(str, "questions"))) {
            z3 = false;
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        if (C14360o3.A0K(str, "roll_call") && z) {
            A1E2.add(AbstractC35247Fgg.A04(requireContext(), false, null, C37051GUh.A00(this, 6), 2131958686, R.drawable.instagram_edit_pano_outline_24));
        }
        if (z2 || z3) {
            Context requireContext2 = requireContext();
            if (C14360o3.A0K(str, "roll_call")) {
                num = AbstractC31174DnI.A0p(getContext());
            } else {
                num = null;
            }
            A1E2.add(AbstractC35247Fgg.A04(requireContext2, false, num, C37051GUh.A00(this, 7), 2131960774, R.drawable.instagram_delete_pano_outline_24));
        }
        if (!C14360o3.A0K(this.A0E, false)) {
            return A1E2;
        }
        Context requireContext3 = requireContext();
        if (C14360o3.A0K(str, "roll_call")) {
            num2 = AbstractC31174DnI.A0p(getContext());
        }
        A1E2.add(AbstractC35247Fgg.A04(requireContext3, false, num2, C37051GUh.A00(this, 8), 2131972368, R.drawable.instagram_report_pano_outline_24));
        return A1E2;
    }

    public final void A0I() {
        InterfaceC56392iX interfaceC56392iX = this.A02;
        if (interfaceC56392iX != null) {
            View view = interfaceC56392iX.getView();
            ImageView A0D = AbstractC31176DnK.A0D(view, R.id.card_gallery_card_empty_state_icon);
            TextView A0N = AbstractC167007dF.A0N(view, R.id.card_gallery_card_empty_state_title);
            TextView A0N2 = AbstractC167007dF.A0N(view, R.id.card_gallery_card_empty_state_subtitle);
            Integer num = this.A0N;
            if (num != null) {
                A0N.setText(num.intValue());
            }
            Integer num2 = this.A0M;
            if (num2 != null) {
                A0N2.setText(num2.intValue());
            } else {
                A0N2.setVisibility(8);
            }
            A0D.setImageResource(this.A0K);
            A0D.setImageTintList(ColorStateList.valueOf(requireContext().getColor(AbstractC53242c7.A0B(getContext()))));
            view.setVisibility(0);
            return;
        }
        C14360o3.A0F("emptyStateViewHolder");
        throw C00O.createAndThrow();
    }

    public void A0L(InterfaceC56362iU interfaceC56362iU) {
        List list = this.A0J;
        if (list != null && AbstractC166987dD.A1b(list)) {
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A06 = R.drawable.instagram_more_horizontal_outline_44;
            A0B.A05 = 2131966899;
            AbstractC31176DnK.A1B(ViewOnClickListenerC35681FpG.A00(this, 28), A0B, interfaceC56362iU);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        if (this instanceof C32703EaU) {
            C14360o3.A0B(interfaceC56362iU, 0);
            AbstractC35054FcR.A02(interfaceC56362iU, C37051GUh.A00(this, 20), new GWH(this, 6));
            return;
        }
        if (this instanceof C32706EaX) {
            C14360o3.A0B(interfaceC56362iU, 0);
            AbstractC35054FcR.A02(interfaceC56362iU, C37051GUh.A00(this, 10), new GWH(this, 5));
            interfaceC56362iU.ESm(R.layout.challenge_action_bar_timer, AbstractC166987dD.A0C(requireContext(), 44), 0, true);
            View A0S = AbstractC166997dE.A0S(((C56352iT) interfaceC56362iU).A0Q, R.id.countdown);
            A0S.setVisibility(8);
            if (C7HD.A03(AbstractC166987dD.A0r(this.A0S))) {
                return;
            }
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), A0E().A03, new C50370MLx(37, A0S, this), 9);
            return;
        }
        C14360o3.A0B(interfaceC56362iU, 0);
        int A09 = AbstractC167007dF.A09(getContext(), R.attr.igds_color_primary_background);
        interfaceC56362iU.setTitle("");
        C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
        c35026Fbz.A02(A09);
        C35026Fbz.A00(interfaceC56362iU, c35026Fbz);
        A0L(interfaceC56362iU);
        AbstractC31179DnN.A1G(interfaceC56362iU);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public Collection getDefinitions() {
        InterfaceC165017Zq interfaceC165017Zq;
        ?? obj = new Object();
        InterfaceC09390do interfaceC09390do = this.A0S;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        C31680Dvl c31680Dvl = new C31680Dvl(this, 1);
        G1e g1e = this.A0A;
        if (g1e != null) {
            FragmentActivity requireActivity = requireActivity();
            UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
            DirectThreadKey A0G = A0G();
            Dz7 A0E = A0E();
            C31680Dvl c31680Dvl2 = new C31680Dvl(this, 2);
            C36401G4c c36401G4c = new C36401G4c(this, 0);
            C49093LnJ c49093LnJ = new C49093LnJ(this);
            if (this instanceof C32702EaT) {
                interfaceC165017Zq = new G4K((C32702EaT) this);
            } else if (this instanceof C32706EaX) {
                interfaceC165017Zq = new G4J((C32706EaX) this);
            } else {
                interfaceC165017Zq = G4L.A00;
            }
            return AbstractC16960so.A1Q(obj, new C32602EXc(A0r, new FQ9(this, A0r2, new FOg(requireActivity, A0r3, this, A0E, interfaceC165017Zq, c36401G4c, c49093LnJ, A0G, this.A0H, c31680Dvl2), g1e, c31680Dvl), new FFF(this), this.A0H, this.A0P), new C65721Tsu(this.A0Q, null, null, R.layout.direct_empty_view));
        }
        C14360o3.A0F("reactionsListNavigator");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0S);
    }

    public final void A0M(Integer num, int i, int i2) {
        this.A0N = Integer.valueOf(i);
        this.A0M = num;
        this.A0K = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0245, code lost:
    
        if (r1 != true) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, X.AbstractC166987dD.A0r(r9), 36316430979305855L) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOJ.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int A02 = C0f9.A02(-1272930999);
        super.onPause();
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0S)).A02(this.A0T, C36078FwE.class);
        C36152FxQ c36152FxQ = this.A0L;
        if (c36152FxQ != null) {
            AbstractC25651Mw.A00(c36152FxQ.A00).A02(c36152FxQ, C2Io.class);
        }
        C0f9.A09(742685846, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(40697959);
        super.onResume();
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0S)).A01(this.A0T, C36078FwE.class);
        C36152FxQ c36152FxQ = this.A0L;
        if (c36152FxQ != null) {
            AbstractC25651Mw.A00(c36152FxQ.A00).A01(c36152FxQ, C2Io.class);
        }
        C0f9.A09(-1391894083, A02);
    }
}
