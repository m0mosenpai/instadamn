package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.6nP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149156nP {
    public Runnable A00;
    public boolean A01;
    public final Activity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC1118853a A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public C149156nP(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC1118853a interfaceC1118853a) {
        this.A02 = activity;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A05 = interfaceC1118853a;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = AbstractC09440dt.A00(enumC09460dv, C143466dl.A00);
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C9EM(this, 25));
    }
}
