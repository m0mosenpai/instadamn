package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6TS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TS implements C6e1, InterfaceC141666aj, InterfaceC141676ak {
    public C141596ac A00;
    public final LinearLayout A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC56392iX A03;
    public final InterfaceC56392iX A04;
    public final C6e8 A05;
    public final C6TX A06;
    public final C6TY A07;
    public final C139536Ti A08;
    public final C6TZ A09;
    public final C6TT A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;

    public C6TS(LinearLayout linearLayout, UserSession userSession) {
        int i;
        C14360o3.A0B(linearLayout, 1);
        this.A01 = linearLayout;
        this.A0D = AbstractC09440dt.A01(new C9EH(this, 25));
        this.A0C = AbstractC09440dt.A01(new C9EH(this, 24));
        this.A0B = AbstractC09440dt.A01(new C9EH(this, 23));
        this.A03 = AbstractC56372iV.A01(linearLayout.requireViewById(R.id.toolbar_reshare_button_stub), false, false);
        this.A02 = AbstractC56372iV.A01(linearLayout.requireViewById(R.id.toolbar_like_button_stub), false, false);
        this.A04 = AbstractC56372iV.A01(linearLayout.requireViewById(R.id.toolbar_save_button_stub), false, false);
        View requireViewById = linearLayout.requireViewById(R.id.cta_button_container);
        C14360o3.A07(requireViewById);
        this.A05 = new C6e8(requireViewById, userSession);
        this.A0A = new C6TT(userSession, AbstractC56372iV.A01(linearLayout.requireViewById(R.id.reel_swipe_up_guidance_stub), false, false));
        View requireViewById2 = linearLayout.requireViewById(R.id.reel_bottom_ad_banner_stub);
        C14360o3.A07(requireViewById2);
        this.A06 = new C6TX((ViewStub) requireViewById2);
        View requireViewById3 = linearLayout.requireViewById(R.id.reel_item_action_button_container);
        C14360o3.A07(requireViewById3);
        this.A07 = new C6TY(requireViewById3, userSession);
        View requireViewById4 = linearLayout.requireViewById(R.id.toolbar_more_info_container);
        C14360o3.A07(requireViewById4);
        this.A09 = new C6TZ(requireViewById4);
        Context context = linearLayout.getContext();
        C14360o3.A07(context);
        if (!C143726eF.A0B(context)) {
            i = R.id.delayed_skip_ad_short_device_stub;
        } else {
            boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36324776103915988L);
            i = R.id.delayed_skip_ad_timer_stub;
            if (A06) {
                i = R.id.delayed_skip_ad_timer_redesign_stub;
            }
        }
        this.A08 = new C139536Ti(context, AbstractC56372iV.A01(linearLayout.requireViewById(i), false, false));
    }

    @Override // X.InterfaceC141676ak
    public final C138466Pc AYW() {
        InterfaceC09390do interfaceC09390do = this.A0B;
        ((C138466Pc) interfaceC09390do.getValue()).A00 = this.A00;
        return (C138466Pc) interfaceC09390do.getValue();
    }

    @Override // X.C6e1
    public final XEX AjV() {
        InterfaceC09390do interfaceC09390do = this.A0D;
        ((XEX) interfaceC09390do.getValue()).EcI(this.A00);
        return (XEX) interfaceC09390do.getValue();
    }

    @Override // X.InterfaceC141666aj
    public final C138446Pa C4e() {
        InterfaceC09390do interfaceC09390do = this.A0C;
        ((C138446Pa) interfaceC09390do.getValue()).A00 = this.A00;
        return (C138446Pa) interfaceC09390do.getValue();
    }
}
