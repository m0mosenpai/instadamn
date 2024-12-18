package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GHI implements C7XU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EnumC1579076z A01;
    public final /* synthetic */ EnumC33464Eqz A02;
    public final /* synthetic */ C18920wW A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ InterfaceC37213GaO A06;
    public final /* synthetic */ EnumC33371Ep4 A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ JSONObject A0A;

    @Override // X.C7XU
    public final void DB3() {
    }

    public GHI(Context context, EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, C18920wW c18920wW, UserSession userSession, User user, InterfaceC37213GaO interfaceC37213GaO, EnumC33371Ep4 enumC33371Ep4, String str, String str2, JSONObject jSONObject) {
        this.A04 = userSession;
        this.A00 = context;
        this.A03 = c18920wW;
        this.A08 = str;
        this.A0A = jSONObject;
        this.A07 = enumC33371Ep4;
        this.A05 = user;
        this.A01 = enumC1579076z;
        this.A02 = enumC33464Eqz;
        this.A09 = str2;
        this.A06 = interfaceC37213GaO;
    }

    @Override // X.C7XU
    public final void DAy() {
        UserSession userSession = this.A04;
        Context context = this.A00;
        C18920wW c18920wW = this.A03;
        String str = this.A08;
        JSONObject jSONObject = this.A0A;
        EnumC33371Ep4 enumC33371Ep4 = this.A07;
        User user = this.A05;
        C35188Ffg.A02(context, this.A01, this.A02, c18920wW, userSession, null, null, user, this.A06, enumC33371Ep4, str, this.A09, jSONObject);
    }
}
