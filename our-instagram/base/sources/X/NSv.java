package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NSv extends AbstractC32533EUj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSv(Activity activity, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        super(abstractC10360h2);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1670664175);
        C9GR.A0E(this.A00, "copy_live_item_failed");
        AbstractC73317Y7a.A0H(this.A01, this.A02, this.A03, "live_action_sheet", "copy_link", abstractC115105If.A01());
        C0f9.A0A(2135845841, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-136780191);
        int A032 = C0f9.A03(1472414150);
        String str = ((C32177EBy) obj).A00;
        Activity activity = this.A00;
        AbstractC13900nG.A00(activity, str);
        C9GR.A07(activity, 2131965226);
        AbstractC73317Y7a.A0J(this.A01, this.A02, this.A03, "live_action_sheet", "copy_link", str);
        C0f9.A0A(492496940, A032);
        C0f9.A0A(314642188, A03);
    }
}
