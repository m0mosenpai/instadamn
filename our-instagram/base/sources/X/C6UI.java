package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6UI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UI implements C6e1, InterfaceC141666aj {
    public C141596ac A00;
    public C139306Sl A01;
    public C6UJ A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final UserSession A07;
    public final InterfaceC56392iX A08;
    public final InterfaceC56392iX A09;
    public final C6TT A0A;
    public final InterfaceC09390do A0B = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EH(this, 27));
    public final boolean A0C;

    public final void A00() {
        this.A08.setVisibility(8);
        if (C18U.A06(C06090Tz.A05, this.A07, 36324204869595105L) || this.A03) {
            this.A09.setVisibility(8);
        }
        InterfaceC56392iX interfaceC56392iX = this.A0A.A07;
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.setVisibility(8);
        }
        InterfaceC56392iX interfaceC56392iX2 = this.A02.A02;
        if (interfaceC56392iX2.CWW()) {
            interfaceC56392iX2.setVisibility(8);
        }
    }

    public final void A01() {
        this.A08.setVisibility(0);
        if (C18U.A06(C06090Tz.A05, this.A07, 36324204869595105L)) {
            this.A09.setVisibility(0);
        }
    }

    @Override // X.C6e1
    public final XEX AjV() {
        return this.A01;
    }

    @Override // X.InterfaceC141666aj
    public final C138446Pa C4e() {
        InterfaceC09390do interfaceC09390do = this.A0B;
        ((C138446Pa) interfaceC09390do.getValue()).A00 = this.A00;
        return (C138446Pa) interfaceC09390do.getValue();
    }

    public C6UI(Context context, View view, UserSession userSession, InterfaceC56392iX interfaceC56392iX) {
        this.A08 = interfaceC56392iX;
        this.A07 = userSession;
        this.A02 = new C6UJ(AbstractC56372iV.A01(view.requireViewById(R.id.reel_chip_metadata_view_label_stub), false, false));
        this.A0A = new C6TT(userSession, AbstractC56372iV.A01(view.requireViewById(R.id.reel_sug_above_cta_stub), false, false));
        this.A09 = AbstractC56372iV.A01(view.requireViewById(R.id.reel_cta_sticker_expanded_tap_area_stub), false, false);
        this.A05 = C143726eF.A02(context);
        this.A06 = C143726eF.A03(context);
        this.A0C = C143726eF.A0B(context);
        this.A04 = C143726eF.A00(context);
    }
}
