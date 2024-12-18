package X;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.follow.BlockButton;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WNR implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public WNR(Dialog dialog, C67846UzR c67846UzR, C69753Bj c69753Bj, XCH xch, int i) {
        this.A00 = i;
        if (3 - i != 0) {
            this.A03 = c69753Bj;
            this.A02 = c67846UzR;
            this.A01 = xch;
            this.A04 = dialog;
        } else {
            this.A04 = dialog;
            this.A01 = xch;
            this.A03 = c69753Bj;
            this.A02 = c67846UzR;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        C38321qM c38321qM;
        C51761Mtk c51761Mtk;
        InterfaceC16660sJ interfaceC16660sJ;
        C38321qM c38321qM2;
        C51761Mtk c51761Mtk2;
        InterfaceC16660sJ interfaceC16660sJ2;
        C38321qM c38321qM3;
        C51761Mtk c51761Mtk3;
        InterfaceC16660sJ interfaceC16660sJ3;
        Integer num;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1130256822);
                if (((SelectionFulfillmentOptionItem) this.A01).Bsx() != C05F.A01) {
                    ((UJD) this.A03).A02.A00();
                }
                ((UuF) this.A04).A00.invoke(this.A02);
                i = -1946918042;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-2001526600);
                if (((SelectionPaymentMethodItem) this.A01).A03 != C05F.A01) {
                    ((UJL) this.A03).A03.A00();
                }
                ((UuG) this.A04).A00.invoke(this.A02);
                i = 1958365787;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-129427015);
                if (((SelectionShippingAddressItem) this.A01).A01 != C05F.A01) {
                    ((UJF) this.A03).A02.A00();
                }
                ((UuL) this.A04).A00.invoke(this.A02);
                i = 1211144129;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(11629201);
                ((Dialog) this.A04).dismiss();
                ((XCH) this.A01).CJl();
                if (((C67846UzR) this.A02).A06 == null) {
                    C0w9.A03("brand_experiences_reel_celebration", "promotionId was null when attempting to log");
                }
                i = 1960236928;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-1427883913);
                if (((C67846UzR) this.A02).A06 == null) {
                    C0w9.A03("brand_experiences_reel_celebration", "promotionId was null when attempting to log");
                }
                ((XCH) this.A01).CKJ();
                ((Dialog) this.A04).dismiss();
                i = 1869668880;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(2074967314);
                C68820Vcb c68820Vcb = (C68820Vcb) this.A01;
                if (c68820Vcb != null) {
                    V1B.A01((ImageUrl) this.A03, c68820Vcb.A00, (Venue) this.A04, true);
                }
                i = 1957335421;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(-1773614740);
                C51760Mtj c51760Mtj = (C51760Mtj) this.A03;
                if (c51760Mtj != null && (c51761Mtk = (C51761Mtk) c51760Mtj.A00) != null && (interfaceC16660sJ = (InterfaceC16660sJ) c51761Mtk.A00) != null) {
                    interfaceC16660sJ.invoke(this.A01);
                }
                C70131W5v c70131W5v = (C70131W5v) this.A04;
                if (c51760Mtj != null) {
                    c38321qM = (C38321qM) c51760Mtj.A01;
                } else {
                    c38321qM = null;
                }
                C70131W5v.A00(c70131W5v, c38321qM, ((C69433VnI) this.A02).A07, C05F.A00);
                i = 1457171658;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(2045471298);
                C51760Mtj c51760Mtj2 = (C51760Mtj) this.A03;
                if (c51760Mtj2 != null && (c51761Mtk2 = (C51761Mtk) c51760Mtj2.A00) != null && (interfaceC16660sJ2 = (InterfaceC16660sJ) c51761Mtk2.A02) != null) {
                    interfaceC16660sJ2.invoke(this.A01);
                }
                C70131W5v c70131W5v2 = (C70131W5v) this.A04;
                if (c51760Mtj2 != null) {
                    c38321qM2 = (C38321qM) c51760Mtj2.A01;
                } else {
                    c38321qM2 = null;
                }
                C70131W5v.A00(c70131W5v2, c38321qM2, ((C69433VnI) this.A02).A07, C05F.A01);
                i = -775257012;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(2142884835);
                C51760Mtj c51760Mtj3 = (C51760Mtj) this.A03;
                if (c51760Mtj3 != null && (c51761Mtk3 = (C51761Mtk) c51760Mtj3.A00) != null && (interfaceC16660sJ3 = (InterfaceC16660sJ) c51761Mtk3.A02) != null) {
                    interfaceC16660sJ3.invoke(this.A01);
                }
                C70131W5v c70131W5v3 = (C70131W5v) this.A04;
                if (c51760Mtj3 != null) {
                    c38321qM3 = (C38321qM) c51760Mtj3.A01;
                } else {
                    c38321qM3 = null;
                }
                C70131W5v.A00(c70131W5v3, c38321qM3, ((C69433VnI) this.A02).A07, C05F.A01);
                i = 598606297;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(-1367866491);
                ((InterfaceC16610sE) ((C65789Tu7) this.A04).A01.A02).invoke(this.A03, ((C65790Tu8) this.A01).A01, this.A02);
                i = 1014029656;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(1758790131);
                C189448aO c189448aO = new C189448aO((AbstractC12990ll) this.A04);
                Context context = (Context) this.A01;
                c189448aO.A0d = context.getString(2131963452);
                C189478aR A00 = c189448aO.A00();
                C68097VAr c68097VAr = new C68097VAr();
                c68097VAr.A01 = (C68810VcR) this.A03;
                c68097VAr.A00 = (C70998WmF) this.A02;
                c68097VAr.A02 = A00;
                A00.A03(context, c68097VAr);
                i = 1028033131;
                C0f9.A0C(i, A05);
                return;
            case 11:
                Reel reel = (Reel) this.A01;
                InterfaceC71989XEc interfaceC71989XEc = (InterfaceC71989XEc) this.A02;
                C69485Vo8 c69485Vo8 = (C69485Vo8) this.A03;
                C38266GsB c38266GsB = (C38266GsB) this.A04;
                if (reel != null) {
                    interfaceC71989XEc.D4K(reel, c69485Vo8.A0J);
                    return;
                } else {
                    interfaceC71989XEc.E17(c38266GsB);
                    return;
                }
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(447342231);
                C18920wW c18920wW = (C18920wW) this.A02;
                C38266GsB c38266GsB2 = (C38266GsB) this.A03;
                WE4.A00(c18920wW, c38266GsB2);
                InterfaceC71989XEc interfaceC71989XEc2 = (InterfaceC71989XEc) this.A01;
                User user = (User) this.A04;
                C41181vS c41181vS = c38266GsB2.A0K;
                c41181vS.getClass();
                Reel reel2 = c38266GsB2.A0J;
                reel2.getClass();
                interfaceC71989XEc2.DAN(c38266GsB2, c41181vS, user, reel2.A0b());
                i = -431517009;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-106283161);
                C18920wW c18920wW2 = (C18920wW) this.A02;
                C38266GsB c38266GsB3 = (C38266GsB) this.A03;
                WE4.A00(c18920wW2, c38266GsB3);
                InterfaceC71989XEc interfaceC71989XEc3 = (InterfaceC71989XEc) this.A01;
                User user2 = (User) this.A04;
                C41181vS c41181vS2 = c38266GsB3.A0K;
                c41181vS2.getClass();
                interfaceC71989XEc3.DTP(c38266GsB3, c41181vS2, user2);
                i = -1761911103;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = C0f9.A05(1941786991);
                Context A0L = AbstractC166997dE.A0L(view);
                JIN jin = (JIN) this.A04;
                if (!AbstractC41656Ibo.A02(A0L, jin)) {
                    i = 333788545;
                } else {
                    XEO xeo = (XEO) this.A01;
                    if (xeo != null) {
                        num = xeo.CAI(jin);
                    } else {
                        num = null;
                    }
                    if (C05F.A00 == num) {
                        if (xeo != null) {
                            xeo.DYu(jin, (C69449VnY) this.A02);
                        }
                        XBB xbb = (XBB) this.A03;
                        if (xbb != null) {
                            xbb.Dam();
                        }
                    } else if (xeo != null) {
                        xeo.onStopButtonClicked();
                    }
                    i = -853499484;
                }
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(1392896981);
                XBC xbc = (XBC) this.A02;
                if (xbc != null) {
                    xbc.DAv((InterfaceC11380iw) this.A01, (AbstractC65924TwV) this.A03, (Tx0) this.A04);
                }
                i = -2040066530;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A05 = C0f9.A05(-1142055660);
                ((C65921TwS) this.A02).A05((Fragment) this.A03, (C19270xB) this.A01, this.A04);
                i = 411460299;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(-1844829546);
                ((C65921TwS) this.A02).A06((Fragment) this.A03, (C19270xB) this.A01, this.A04);
                i = -1678758350;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(2045387218);
                ((C65921TwS) this.A02).A05((Fragment) this.A03, (C19270xB) this.A01, this.A04);
                i = 239745939;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(-1358554306);
                ((C65921TwS) this.A02).A05((Fragment) this.A03, (C19270xB) this.A01, this.A04);
                i = 1445069633;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(1739350880);
                ((C65921TwS) this.A02).A06((Fragment) this.A03, (C19270xB) this.A01, this.A04);
                i = -497501241;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(165591824);
                ((C65921TwS) this.A02).A05((Fragment) this.A03, (C19270xB) this.A01, this.A04);
                i = 866540255;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A05 = C0f9.A05(1919877539);
                ((C65921TwS) this.A02).A06((Fragment) this.A03, (C19270xB) this.A01, this.A04);
                i = -1128821651;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A05 = C0f9.A05(-1399318360);
                ((XLU) this.A02).Dxi((InterfaceC11380iw) this.A01, (Tx0) this.A03, (C65741TtG) this.A04);
                i = 1841192706;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A05 = C0f9.A05(-792036991);
                U26 u26 = (U26) this.A02;
                C65741TtG c65741TtG = (C65741TtG) this.A04;
                u26.A01.Dxi((InterfaceC11380iw) this.A01, (Tx0) this.A03, c65741TtG);
                i = 883008048;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A05 = C0f9.A05(-1136234662);
                BlockButton blockButton = (BlockButton) this.A04;
                blockButton.setEnabled(false);
                if (blockButton.A00) {
                    Context A0L2 = AbstractC166997dE.A0L(blockButton);
                    User user3 = (User) this.A03;
                    InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                    Object obj = this.A02;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC167007dF.A0f(A0L2, AnonymousClass001.A0D(user3.getUsername(), '@'), 2131953941));
                    C193328hC c193328hC = new C193328hC(A0L2);
                    c193328hC.A0o(user3.Bhu(), interfaceC11380iw);
                    AbstractC35271Fh6.A0B(spannableStringBuilder);
                    c193328hC.A0r(spannableStringBuilder);
                    c193328hC.A0J(new WHj(4, obj, user3, blockButton), 2131953942);
                    c193328hC.A0D(new WHP(blockButton, 53));
                    AbstractC166987dD.A1W(c193328hC);
                } else {
                    User user4 = (User) this.A03;
                    BlockButton.A00((C67893V1b) this.A02, blockButton, user4);
                    BlockButton.A02(blockButton, user4);
                }
                i = -111609805;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(-167033432);
                InterfaceC71994XEi interfaceC71994XEi = (InterfaceC71994XEi) this.A02;
                if (interfaceC71994XEi != null) {
                    interfaceC71994XEi.DN5(((C70792Wh5) this.A03).A01, C66485UJn.A00((InterfaceC11380iw) this.A01));
                }
                i = -1085321787;
                C0f9.A0C(i, A05);
                return;
        }
    }

    public WNR(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A01 = obj;
        this.A03 = obj4;
        this.A02 = obj3;
    }
}
