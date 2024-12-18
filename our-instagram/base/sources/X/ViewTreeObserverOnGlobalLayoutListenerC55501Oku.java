package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oku, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC55501Oku implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C41181vS A05;
    public final /* synthetic */ C84823qW A06;
    public final /* synthetic */ C141596ac A07;
    public final /* synthetic */ InterfaceC145436h2 A08;
    public final /* synthetic */ NSL A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public ViewTreeObserverOnGlobalLayoutListenerC55501Oku(View view, UserSession userSession, C41181vS c41181vS, C84823qW c84823qW, C141596ac c141596ac, InterfaceC145436h2 interfaceC145436h2, NSL nsl, String str, String str2, String str3, int i, int i2, int i3) {
        this.A03 = view;
        this.A06 = c84823qW;
        this.A00 = i;
        this.A01 = i2;
        this.A0A = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A08 = interfaceC145436h2;
        this.A09 = nsl;
        this.A04 = userSession;
        this.A05 = c41181vS;
        this.A07 = c141596ac;
        this.A02 = i3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.A03;
        MSZ.A15(view, this);
        C84823qW c84823qW = this.A06;
        c84823qW.A12 = EnumC75383a5.A0P;
        c84823qW.A02 = AbstractC166987dD.A07(view) / this.A00;
        c84823qW.A00 = AbstractC166987dD.A08(view) / this.A01;
        c84823qW.A1S = this.A0A;
        c84823qW.A1g = this.A0B;
        c84823qW.A1O = this.A0C;
        C41181vS c41181vS = this.A05;
        C141596ac c141596ac = this.A07;
        UserSession userSession = this.A04;
        NSL nsl = this.A09;
        InterfaceC145436h2 interfaceC145436h2 = this.A08;
        view.setOnTouchListener(new N29(userSession, interfaceC145436h2, new P9F(view, userSession, c41181vS, c84823qW, c141596ac, interfaceC145436h2, nsl, this.A02), AbstractC166987dD.A1J(nsl), false));
    }
}
