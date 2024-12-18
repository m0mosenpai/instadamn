package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EjK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33116EjK extends AbstractC32533EUj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ EnumC33510Erj A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Runnable A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33116EjK(Activity activity, AbstractC10360h2 abstractC10360h2, EnumC33510Erj enumC33510Erj, UserSession userSession, Runnable runnable) {
        super(abstractC10360h2);
        this.A02 = userSession;
        this.A01 = enumC33510Erj;
        this.A00 = activity;
        this.A03 = runnable;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(98321838);
        AbstractC35249Fgi.A01(this.A01, EnumC33500ErZ.SMS, this.A02);
        this.A03.run();
        C0f9.A0A(568384737, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(619970931);
        C32183ECe c32183ECe = (C32183ECe) obj;
        int A032 = C0f9.A03(1801019061);
        AbstractC166987dD.A0b().putString("android.intent.extra.TEXT", c32183ECe.A00);
        UserSession userSession = this.A02;
        EnumC33510Erj enumC33510Erj = this.A01;
        EnumC33500ErZ enumC33500ErZ = EnumC33500ErZ.SMS;
        String str = c32183ECe.A00;
        Activity activity = this.A00;
        AbstractC35249Fgi.A02(enumC33510Erj, enumC33500ErZ, userSession, str, C54P.A01(activity, userSession));
        AbstractC35101FdC.A02(activity, "", c32183ECe.A00);
        this.A03.run();
        C0f9.A0A(360394764, A032);
        C0f9.A0A(1379182212, A03);
    }
}
