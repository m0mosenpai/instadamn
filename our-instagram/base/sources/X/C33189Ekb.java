package X;

import com.facebook.R;

/* renamed from: X.Ekb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33189Ekb extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "DailyLimitRemindAgainMenuFragment";
    public FI8 A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final String A02 = "time_spent";

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    private final C35246Fgf A00(long j) {
        String A0w = AbstractC31174DnI.A0w(this, AbstractC35189Ffh.A02(AbstractC31177DnL.A09(this), j), 2131957454);
        C14360o3.A07(A0w);
        ViewOnClickListenerC35566FnI viewOnClickListenerC35566FnI = new ViewOnClickListenerC35566FnI(this, j, 0);
        C35246Fgf c35246Fgf = new C35246Fgf(A0w);
        c35246Fgf.A01 = R.style.control_option_title_text;
        c35246Fgf.A02 = R.dimen.account_discovery_bottom_gap;
        c35246Fgf.A04 = viewOnClickListenerC35566FnI;
        c35246Fgf.A00 = R.drawable.daily_reminder_interval_bottomsheet_menu_item_background;
        return c35246Fgf;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1260732697);
        super.onResume();
        C35246Fgf A00 = A00(300L);
        C35246Fgf A002 = A00(900L);
        String A0v = AbstractC25227BEk.A0v(this, 2131957453);
        ViewOnClickListenerC35678FpD viewOnClickListenerC35678FpD = new ViewOnClickListenerC35678FpD(this, 3);
        C35246Fgf c35246Fgf = new C35246Fgf(A0v);
        c35246Fgf.A01 = R.style.control_option_title_text;
        c35246Fgf.A02 = R.dimen.account_discovery_bottom_gap;
        c35246Fgf.A04 = viewOnClickListenerC35678FpD;
        c35246Fgf.A00 = R.drawable.daily_reminder_interval_bottomsheet_menu_item_background;
        setItems(AbstractC16960so.A1Q(A00, A002, c35246Fgf));
        C0f9.A09(1389339505, A02);
    }
}
