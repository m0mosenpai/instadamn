package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.venue.Venue;

/* renamed from: X.Ckz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28651Ckz implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ViewOnClickListenerC28651Ckz(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj4;
        this.A04 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        C3DN A00;
        BottomSheetFragment bottomSheetFragment;
        BottomSheetFragment bottomSheetFragment2;
        C189478aR c189478aR;
        String str;
        switch (this.A00) {
            case 0:
                C1OU.A07((Activity) this.A04, (Fragment) this.A02, (UserSession) this.A01, (C38321qM) this.A03, "stories_archive_otd", false);
                return;
            case 1:
                A05 = C0f9.A05(2130240126);
                C38321qM c38321qM = (C38321qM) this.A02;
                if (c38321qM != null) {
                    C37091o7.A00();
                    AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
                    Fragment fragment = (Fragment) this.A01;
                    Context requireContext = fragment.requireContext();
                    C28185CbY c28185CbY = (C28185CbY) this.A03;
                    C68094VAo c68094VAo = new C68094VAo(c38321qM, c28185CbY.A00, new C75113Zb(c38321qM.A0p(), c38321qM.A4w()), EnumC39589Hdz.A06, c28185CbY.A03);
                    String A0u = AbstractC25227BEk.A0u(requireContext, 2131976333);
                    C189448aO A0y = AbstractC25225BEi.A0y(abstractC12990ll);
                    A0y.A0d = A0u;
                    FragmentActivity activity = fragment.getActivity();
                    if (activity != null && (A00 = C3DN.A00.A00(activity)) != null) {
                        C189478aR A002 = F86.A00(A00);
                        if (A002 != null) {
                            Fragment A09 = A00.A09();
                            if (A09 != null && (A09 instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) A09) != null) {
                                bottomSheetFragment.A0T(0);
                            }
                            A0y.A0a = AbstractC166997dE.A0b();
                            A0y.A03 = 0.7f;
                            A002.A0F(c68094VAo, A0y);
                        } else {
                            A0y.A00().A03(requireContext, c68094VAo);
                        }
                    } else {
                        C0w9.A03("UpsellsPluginImpl", "Didn't find any BottomSheetNavigator where one was expected.");
                    }
                }
                i = -435334322;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(602606262);
                ((CU7) this.A04).A01.BRs().D67((C38321qM) this.A01, (C75113Zb) this.A02, ((AnonymousClass414) this.A03).A01, false);
                i = 148015996;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(50992282);
                ((CU7) this.A04).A01.BRw().DlE((C38321qM) this.A01, (C75113Zb) this.A02, ((AnonymousClass414) this.A03).A01);
                i = 730391407;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(2055147119);
                ((CU7) this.A04).A01.BQw().D48((C38321qM) this.A01, (C75113Zb) this.A02, ((AnonymousClass414) this.A03).A01);
                i = 1950382639;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(-1095659536);
                C38321qM c38321qM2 = (C38321qM) this.A02;
                C75113Zb c75113Zb = (C75113Zb) this.A03;
                EffectPreviewIntf effectPreviewIntf = (EffectPreviewIntf) this.A01;
                C29394CxR c29394CxR = (C29394CxR) this.A04;
                AbstractC40638Hzw.A00(c29394CxR.A00.requireActivity(), c29394CxR.A02, c29394CxR.A03, effectPreviewIntf, c38321qM2, c29394CxR.A04, c75113Zb);
                i = 1572854944;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(2085596295);
                Fragment fragment2 = (Fragment) this.A02;
                Context requireContext2 = fragment2.requireContext();
                Fragment fragment3 = fragment2.mParentFragment;
                if ((fragment3 instanceof BottomSheetFragment) && (bottomSheetFragment2 = (BottomSheetFragment) fragment3) != null && (c189478aR = bottomSheetFragment2.A02) != null) {
                    C189448aO A0y2 = AbstractC25225BEi.A0y((AbstractC12990ll) this.A04);
                    AbstractC25226BEj.A1M(requireContext2, A0y2, 2131972625);
                    C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
                    c189458aP.A02 = R.drawable.instagram_chevron_left_pano_outline_24;
                    c189458aP.A07 = AbstractC166997dE.A0q(requireContext2.getResources(), 2131953583);
                    c189458aP.A05 = ViewOnClickListenerC28666ClE.A00(this.A01, 19);
                    A0y2.A06(c189458aP.A00());
                    c189478aR.A0F((Fragment) this.A03, A0y2);
                }
                i = 317276593;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-1226629175);
                C25448BNn c25448BNn = (C25448BNn) this.A04;
                InterfaceC31137Dmc interfaceC31137Dmc = c25448BNn.A07;
                C2XE ArD = ((C2Z1) this.A03).ArD();
                Object obj = this.A01;
                C38321qM c38321qM3 = c25448BNn.A02.A02;
                if (c38321qM3 != null) {
                    str = AbstractC25226BEj.A1F(c38321qM3);
                } else {
                    str = null;
                }
                interfaceC31137Dmc.CyR(new C51757Mtg(ArD, obj, str, 7));
                AbstractC37670Gi3.A0D(BQL.A0J, c25448BNn.A04, (C38321qM) this.A02, c25448BNn.A06, "auto_translated_attribution_label", true);
                i = 1988348841;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(-1859855012);
                BKA bka = (BKA) this.A04;
                C38321qM c38321qM4 = (C38321qM) this.A01;
                C75113Zb c75113Zb2 = (C75113Zb) this.A02;
                Venue venue = (Venue) this.A03;
                InterfaceC60442pS interfaceC60442pS = bka.A05;
                UserSession userSession = bka.A04;
                String A0p = AbstractC25231BEo.A0p();
                EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0E;
                String A052 = venue.A05();
                C14360o3.A07(A052);
                AbstractC37670Gi3.A0O(enumC39652Hih, interfaceC60442pS, userSession, c38321qM4, A0p, A052, c75113Zb2.getPosition());
                Venue A27 = c38321qM4.A27();
                if (A27 != null) {
                    AbstractC37834Gko.A05(bka.A01, userSession, A27);
                }
                i = -1517078992;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
