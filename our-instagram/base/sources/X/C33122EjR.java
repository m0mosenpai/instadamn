package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.EjR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33122EjR extends AbstractC32533EUj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ EnumC33510Erj A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ EnumC33425Epw A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33122EjR(Activity activity, AbstractC10360h2 abstractC10360h2, EnumC33510Erj enumC33510Erj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33425Epw enumC33425Epw, Runnable runnable, String str, String str2) {
        super(abstractC10360h2);
        this.A07 = str;
        this.A06 = str2;
        this.A04 = enumC33425Epw;
        this.A00 = activity;
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        this.A01 = enumC33510Erj;
        this.A05 = runnable;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1370070003);
        C32183ECe c32183ECe = (C32183ECe) obj;
        int A032 = C0f9.A03(-1627462902);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("android.intent.extra.TEXT", c32183ECe.A00);
        String str = this.A07;
        String str2 = this.A06;
        EnumC33425Epw enumC33425Epw = this.A04;
        boolean z = enumC33425Epw.A06;
        Activity activity = this.A00;
        GS6 gs6 = new GS6(c32183ECe, this);
        InterfaceC11380iw interfaceC11380iw = this.A02;
        UserSession userSession = this.A03;
        AbstractC31510Dsu.A0N(activity, null, A0b, interfaceC11380iw, userSession, str, str2, gs6, false, z);
        EnumC33500ErZ enumC33500ErZ = enumC33425Epw.A00;
        if (enumC33500ErZ != null) {
            AbstractC35249Fgi.A02(this.A01, enumC33500ErZ, userSession, c32183ECe.A00, C54P.A01(activity, userSession));
        }
        this.A05.run();
        C0f9.A0A(-808465931, A032);
        C0f9.A0A(-287398885, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1184322247);
        EnumC33500ErZ enumC33500ErZ = this.A04.A00;
        if (enumC33500ErZ != null) {
            AbstractC35249Fgi.A01(this.A01, enumC33500ErZ, this.A03);
        }
        C9GR.A0E(this.A00, "fetch_contact_invite_message_failed");
        this.A05.run();
        C0f9.A0A(423525748, A03);
    }
}
