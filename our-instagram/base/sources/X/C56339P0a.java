package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.P0a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56339P0a implements InterfaceC58169PqZ {
    public final EnumC53380NjV A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final C52473NJr A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        int i;
        Integer num;
        int i2;
        Integer num2;
        int i3;
        boolean z;
        boolean z2;
        AbstractC59962oe abstractC59962oe = this.A02;
        LinearLayout linearLayout = new LinearLayout(abstractC59962oe.requireContext());
        linearLayout.setOrientation(1);
        AbstractC50522MSa.A0z(linearLayout);
        Context requireContext = abstractC59962oe.requireContext();
        C52473NJr c52473NJr = this.A04;
        boolean z3 = c52473NJr.A02;
        if (z3) {
            i = 2131955402;
        } else if (c52473NJr.A00 == EnumC53117NeU.A02) {
            i = 2131955400;
        } else {
            i = 2131957485;
            if (c52473NJr.A03) {
                i = 2131963538;
            }
        }
        boolean z4 = this.A05;
        if (z4) {
            num = Integer.valueOf(R.drawable.instagram_heart_off_pano_outline_24);
        } else {
            num = null;
        }
        C52369NFj A01 = OOy.A01(requireContext, true, null, num, i);
        A01.setChecked(c52473NJr.A04().A0b);
        C52369NFj.A02(A01, this, 9);
        IgdsSwitch igdsSwitch = A01.A08;
        if (igdsSwitch != null) {
            AbstractC166997dE.A18(C02G.A01(abstractC59962oe.requireContext()), igdsSwitch, 2131957485);
            AbstractC56952jT.A04(igdsSwitch, C05F.A04);
            Context requireContext2 = abstractC59962oe.requireContext();
            IgdsSwitch igdsSwitch2 = A01.A08;
            if (igdsSwitch2 != null) {
                z2 = igdsSwitch2.isChecked();
            } else {
                z2 = A01.A0F;
            }
            int i4 = 2131957480;
            if (z2) {
                i4 = 2131957479;
            }
            AbstractC56932jR.A08(igdsSwitch, AbstractC167027dH.A0P(requireContext2, i4));
        }
        linearLayout.addView(A01);
        if (this.A06) {
            Context requireContext3 = abstractC59962oe.requireContext();
            if (z3) {
                i2 = 2131955250;
            } else {
                i2 = 2131963552;
                if (c52473NJr.A00 == EnumC53117NeU.A02) {
                    i2 = 2131955249;
                }
            }
            if (z4) {
                num2 = Integer.valueOf(R.drawable.instagram_direct_off_pano_outline_24);
            } else {
                num2 = null;
            }
            if (c52473NJr.A03) {
                if (z3) {
                    i3 = 2131955247;
                } else {
                    i3 = 2131957487;
                    if (c52473NJr.A00 == EnumC53117NeU.A02) {
                        i3 = 2131955246;
                    }
                }
            } else if (z3) {
                i3 = 2131955401;
            } else {
                i3 = 2131957481;
                if (c52473NJr.A00 == EnumC53117NeU.A02) {
                    i3 = 2131955398;
                }
            }
            C52369NFj A012 = OOy.A01(requireContext3, true, C55183Odo.A01(abstractC59962oe, this.A03, abstractC59962oe.getModuleName(), AbstractC25227BEk.A0v(abstractC59962oe, i3), "https://help.instagram.com/113355287252104"), num2, i2);
            A012.setChecked(c52473NJr.A04().A0c);
            C52369NFj.A02(A012, this, 10);
            IgdsSwitch igdsSwitch3 = A012.A08;
            if (igdsSwitch3 != null) {
                AbstractC166997dE.A18(C02G.A01(abstractC59962oe.requireContext()), igdsSwitch3, 2131963552);
                AbstractC56952jT.A04(igdsSwitch3, C05F.A04);
                Context requireContext4 = abstractC59962oe.requireContext();
                IgdsSwitch igdsSwitch4 = A012.A08;
                if (igdsSwitch4 != null) {
                    z = igdsSwitch4.isChecked();
                } else {
                    z = A012.A0F;
                }
                int i5 = 2131957480;
                if (z) {
                    i5 = 2131957479;
                }
                AbstractC56932jR.A08(igdsSwitch3, AbstractC167027dH.A0P(requireContext4, i5));
            }
            linearLayout.addView(A012);
        }
        return linearLayout;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A00;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    public C56339P0a(AbstractC59962oe abstractC59962oe, UserSession userSession, C52473NJr c52473NJr, boolean z) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A05 = z;
        this.A04 = c52473NJr;
        this.A01 = C81X.A19;
        this.A00 = EnumC53380NjV.A0C;
        this.A06 = new C59712oE(userSession).A00();
    }
}
