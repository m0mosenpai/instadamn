package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.EjL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33117EjL extends AbstractC32533EUj {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ EnumC33510Erj A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Runnable A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33117EjL(Fragment fragment, AbstractC10360h2 abstractC10360h2, EnumC33510Erj enumC33510Erj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Runnable runnable) {
        super(abstractC10360h2);
        this.A01 = enumC33510Erj;
        this.A00 = fragment;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = runnable;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1720305903);
        AbstractC35249Fgi.A01(this.A01, EnumC33500ErZ.SYSTEM_SHARE_SHEET, this.A03);
        C9GR.A0E(this.A00.requireContext(), "fetch_contact_invite_message_failed");
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(-1272057678, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-543666987);
        C32183ECe c32183ECe = (C32183ECe) obj;
        int A032 = C0f9.A03(-1938784287);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("android.intent.extra.TEXT", c32183ECe.A00);
        AbstractC31510Dsu.A0Q(this.A00.getActivity(), A0b, this.A02, this.A03, "share_to_system_sheet", new GS6(c32183ECe, this));
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(-623428760, A032);
        C0f9.A0A(818867548, A03);
    }
}
