package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EjG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33112EjG extends AbstractC32533EUj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ EnumC33510Erj A01;
    public final /* synthetic */ UserSession A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33112EjG(Activity activity, AbstractC10360h2 abstractC10360h2, EnumC33510Erj enumC33510Erj, UserSession userSession) {
        super(abstractC10360h2);
        this.A02 = userSession;
        this.A01 = enumC33510Erj;
        this.A00 = activity;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1368682467);
        AbstractC35249Fgi.A01(this.A01, EnumC33500ErZ.COPY_LINK, this.A02);
        C9GR.A0E(this.A00, "fetch_contact_invite_link_failed");
        C0f9.A0A(1515607519, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(2126780645);
        C32183ECe c32183ECe = (C32183ECe) obj;
        int A032 = C0f9.A03(1865163793);
        UserSession userSession = this.A02;
        EnumC33510Erj enumC33510Erj = this.A01;
        EnumC33500ErZ enumC33500ErZ = EnumC33500ErZ.COPY_LINK;
        String str = c32183ECe.A00;
        Activity activity = this.A00;
        AbstractC35249Fgi.A02(enumC33510Erj, enumC33500ErZ, userSession, str, C54P.A01(activity, userSession));
        AbstractC13900nG.A00(activity, c32183ECe.A00);
        AbstractC34301FAv.A00(activity, null, null, true);
        C0f9.A0A(1820033127, A032);
        C0f9.A0A(188875909, A03);
    }
}
