package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Fxf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36165Fxf implements InterfaceC23471Cj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C6FQ A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ InterfaceC103384lE A04;
    public final /* synthetic */ UserSession A05;

    public C36165Fxf(Activity activity, Fragment fragment, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, UserSession userSession) {
        this.A00 = activity;
        this.A05 = userSession;
        this.A01 = fragment;
        this.A02 = c6fq;
        this.A04 = interfaceC103384lE;
        this.A03 = interfaceC103384lE2;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C131845xK c131845xK;
        InterfaceC103384lE interfaceC103384lE;
        if (EnumC172127lh.A05.equals(map.get("android.permission.READ_CONTACTS"))) {
            Activity activity = this.A00;
            UserSession userSession = this.A05;
            C1GJ.A00(activity, AbstractC018607g.A00(this.A01), AbstractC35238FgX.A00(activity, userSession, AbstractC35171FfO.A01(false, AbstractC35171FfO.A02(activity, userSession, false, false)), "find_friends_contacts", "ci", false, false));
            c131845xK = new C131845xK(this.A02);
            interfaceC103384lE = this.A04;
        } else {
            c131845xK = new C131845xK(this.A02);
            interfaceC103384lE = this.A03;
        }
        C131845xK.A00(c131845xK.A00, C6FW.A01, interfaceC103384lE);
    }
}
