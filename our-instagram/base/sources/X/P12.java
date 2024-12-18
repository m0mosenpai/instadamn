package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes9.dex */
public final class P12 implements InterfaceC58169PqZ {
    public View A00;
    public View A01;
    public IgSimpleImageView A02;
    public IgSimpleImageView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgdsSwitch A06;
    public final UserSession A07;
    public final NKD A08;
    public final InterfaceC58310Pt2 A09;
    public final boolean A0A;
    public final C81X A0B;
    public final AbstractC59962oe A0C;

    public P12(AbstractC59962oe abstractC59962oe, UserSession userSession, NKD nkd, InterfaceC58310Pt2 interfaceC58310Pt2) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, nkd, interfaceC58310Pt2);
        this.A0C = abstractC59962oe;
        this.A07 = userSession;
        this.A08 = nkd;
        this.A09 = interfaceC58310Pt2;
        this.A0B = C81X.A2i;
        this.A0A = C18U.A06(C06090Tz.A05, userSession, 36320244911120563L);
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        AbstractC59962oe abstractC59962oe = this.A0C;
        Context requireContext = abstractC59962oe.requireContext();
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setOrientation(1);
        AbstractC50522MSa.A0z(linearLayout);
        View inflate = LayoutInflater.from(requireContext).inflate(R.layout.open_carousel_toggle_row, (ViewGroup) null);
        this.A00 = inflate;
        String str = "openCarouselToggleRow";
        if (inflate != null) {
            linearLayout.addView(inflate);
            View view = this.A00;
            if (view != null) {
                AbstractC166997dE.A0S(view, R.id.open_carousel_row_icon).setVisibility(0);
                UserSession userSession = this.A07;
                InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
                if (A0x.getInt("open_carousel_share_sheet_new_badge_nux_1", 0) < 3 && C18U.A06(C06090Tz.A05, userSession, 36320244910071974L)) {
                    AbstractC167017dG.A0g(A0x, "open_carousel_share_sheet_new_badge_nux_1").apply();
                    View view2 = this.A00;
                    if (view2 != null) {
                        AbstractC166997dE.A0S(view2, R.id.open_carousel_toggle_new_badge).setVisibility(0);
                    }
                }
                View view3 = this.A00;
                if (view3 != null) {
                    View requireViewById = view3.requireViewById(R.id.open_carousel_post_toggle_row_switch);
                    C14360o3.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.igds.components.switchbutton.IgdsSwitch");
                    IgdsSwitch igdsSwitch = (IgdsSwitch) requireViewById;
                    this.A06 = igdsSwitch;
                    if (igdsSwitch == null) {
                        str = "openCarouselToggleButton";
                    } else {
                        igdsSwitch.A07 = new P3T(this, 16);
                        View view4 = this.A00;
                        if (view4 != null) {
                            ViewOnClickListenerC55466OkL.A02(view4, 32, this);
                            View view5 = this.A00;
                            if (view5 != null) {
                                View requireViewById2 = view5.requireViewById(R.id.how_it_works_text);
                                C14360o3.A0C(requireViewById2, AbstractC43591JPw.A00(3));
                                ViewOnClickListenerC55465OkK.A01(requireViewById2, 12, requireContext, this);
                                if (this.A0A) {
                                    View inflate2 = AbstractC31175DnJ.A06(abstractC59962oe).inflate(R.layout.open_carousel_prompt_row, (ViewGroup) null);
                                    this.A01 = inflate2;
                                    str = "promptRow";
                                    if (inflate2 != null) {
                                        ViewOnClickListenerC55466OkL.A02(inflate2, 33, this);
                                        View view6 = this.A01;
                                        if (view6 != null) {
                                            this.A04 = AbstractC31172DnG.A0X(view6, R.id.open_carousel_prompt_empty_text);
                                            View view7 = this.A01;
                                            if (view7 != null) {
                                                this.A02 = MSX.A0I(view7, R.id.open_carousel_prompt_empty_icon);
                                                View view8 = this.A01;
                                                if (view8 != null) {
                                                    this.A05 = AbstractC31172DnG.A0X(view8, R.id.open_carousel_prompt_valid_text);
                                                    View view9 = this.A01;
                                                    if (view9 != null) {
                                                        IgSimpleImageView A0I = MSX.A0I(view9, R.id.open_carousel_prompt_valid_icon);
                                                        ViewOnClickListenerC55466OkL.A02(A0I, 34, this);
                                                        this.A03 = A0I;
                                                        View view10 = this.A01;
                                                        if (view10 != null) {
                                                            linearLayout.addView(view10);
                                                            View view11 = this.A01;
                                                            if (view11 != null) {
                                                                view11.setVisibility(8);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C55101ObE c55101ObE = new C55101ObE(userSession, abstractC59962oe.requireContext());
                                C22C A00 = AnonymousClass229.A00(c55101ObE.A01, c55101ObE.A07, null, null, null, null);
                                EnumC114925Hg enumC114925Hg = EnumC114925Hg.FEED;
                                C448824s c448824s = A00.A0G;
                                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448824s.A01, "ig_camera_ui_tool_impression");
                                if (A0f.isSampled()) {
                                    MSW.A1N(C81X.A0M, A0f);
                                    AbstractC166987dD.A1S(A0f, MSX.A0f(c448824s.A04));
                                    A0f.A8R(enumC114925Hg, "camera_destination");
                                    MSW.A1M(EnumC50631MWs.A0L, A0f);
                                    AbstractC167017dG.A1B(A0f);
                                    A0f.Cht();
                                }
                                return linearLayout;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A0B;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        if (C18U.A06(C06090Tz.A05, this.A07, 36323436070710514L)) {
            this.A08.A08();
        } else {
            View view = this.A00;
            if (view == null) {
                C14360o3.A0F("openCarouselToggleRow");
                throw C00O.createAndThrow();
            }
            view.post(new RunnableC56882PMb(this));
        }
        AbstractC59962oe abstractC59962oe = this.A0C;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 43), C07Y.A00(viewLifecycleOwner));
    }
}
