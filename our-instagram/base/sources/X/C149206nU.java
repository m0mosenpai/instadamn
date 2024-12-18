package X;

import android.app.Activity;

/* renamed from: X.6nU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149206nU implements C33I {
    public C5SW A00;
    public InterfaceC145156ga A01;
    public final C5SU A02;
    public final InterfaceC19630xq A03;
    public final String A04;

    @Override // X.C33I
    public final boolean Dtk(C5SW c5sw) {
        return true;
    }

    @Override // X.C33I
    public final void Dtq(C5SW c5sw) {
    }

    @Override // X.C33I
    public final void Dto(C5SW c5sw) {
        InterfaceC145156ga interfaceC145156ga = this.A01;
        if (interfaceC145156ga != null) {
            interfaceC145156ga.Dtn();
        }
    }

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        InterfaceC19610xo ARD = this.A03.ARD();
        ARD.E77(this.A04, true);
        ARD.apply();
        InterfaceC145156ga interfaceC145156ga = this.A01;
        if (interfaceC145156ga != null) {
            interfaceC145156ga.Dm4();
        }
    }

    public C149206nU(Activity activity, InterfaceC19630xq interfaceC19630xq) {
        this.A03 = interfaceC19630xq;
        String string = activity.getString(2131961990);
        C14360o3.A07(string);
        C5SU c5su = new C5SU(activity, new C149686oL(string));
        c5su.A0G = true;
        c5su.A06(EnumC58132lV.A02);
        c5su.A04 = this;
        this.A02 = c5su;
        this.A04 = "has_seen_ad_expand_story_button_tooltip";
    }
}
