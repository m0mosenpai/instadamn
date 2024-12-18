package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GJC implements InterfaceC37205GaG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ EnumC1579076z A02;
    public final /* synthetic */ EnumC33464Eqz A03;
    public final /* synthetic */ C18920wW A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C193328hC A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ InterfaceC37213GaO A08;
    public final /* synthetic */ EnumC33371Ep4 A09;

    @Override // X.InterfaceC37205GaG
    public final void onFinish() {
    }

    public GJC(Context context, FragmentActivity fragmentActivity, EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, C18920wW c18920wW, UserSession userSession, C193328hC c193328hC, User user, InterfaceC37213GaO interfaceC37213GaO, EnumC33371Ep4 enumC33371Ep4) {
        this.A08 = interfaceC37213GaO;
        this.A09 = enumC33371Ep4;
        this.A01 = fragmentActivity;
        this.A05 = userSession;
        this.A00 = context;
        this.A07 = user;
        this.A06 = c193328hC;
        this.A04 = c18920wW;
        this.A02 = enumC1579076z;
        this.A03 = enumC33464Eqz;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        C9GR.A0B(this.A00, "something_went_wrong");
        this.A08.Dgt();
    }

    @Override // X.InterfaceC37205GaG
    public final void onStart() {
        this.A08.Dgu();
    }

    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        InterfaceC37213GaO interfaceC37213GaO = this.A08;
        EnumC33371Ep4 enumC33371Ep4 = this.A09;
        if (enumC33371Ep4 == EnumC33371Ep4.A0G) {
            interfaceC37213GaO.Dgu();
        }
        FragmentActivity fragmentActivity = this.A01;
        if (!fragmentActivity.isDestroyed()) {
            UserSession userSession = this.A05;
            if (C18U.A06(C06090Tz.A06, userSession, 36321443205621192L)) {
                FDP.A00(fragmentActivity, this.A00, userSession, this.A07.B8y());
                interfaceC37213GaO.DqY();
            }
        }
        AbstractC166987dD.A1W(this.A06);
        C18920wW c18920wW = this.A04;
        String id = this.A07.getId();
        EnumC1579076z enumC1579076z = this.A02;
        C75R.A02(c18920wW, enumC1579076z, this.A03, enumC33371Ep4, "impression", "optimistic_restrict_alert", id);
        if (enumC1579076z == EnumC1579076z.CANONICAL || enumC1579076z == EnumC1579076z.SECURE_OVER_WA_CANONICAL) {
            C9GR.A07(this.A00, 2131952099);
        }
        interfaceC37213GaO.DqY();
    }
}
