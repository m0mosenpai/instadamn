package X;

import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.WoV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71134WoV implements InterfaceC72018XFg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C68251VJn A01;
    public final /* synthetic */ C1V4 A02;

    @Override // X.InterfaceC72018XFg
    public final /* bridge */ /* synthetic */ Object DV9(C69427VnC c69427VnC, Object obj, int i) {
        if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putString("DynamicFlowPlugin.extraFlowId", "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
            C3BH.A00().A01();
            UserSession userSession = this.A00;
            C68251VJn c68251VJn = this.A01;
            C67887V0u c67887V0u = c68251VJn.A03;
            int i2 = 2131968535;
            if (c67887V0u.A00 == c67887V0u.A01 - 1) {
                i2 = 2131961124;
            }
            ELT elt = new ELT();
            AbstractC31173DnH.A1C(bundle, userSession);
            bundle.putBoolean(AbstractC111324zv.A00(2340), true);
            bundle.putBoolean(AbstractC111324zv.A00(2337), false);
            bundle.putBoolean(AbstractC111324zv.A00(2343), false);
            bundle.putInt(AbstractC111324zv.A00(2342), i2);
            elt.setArguments(bundle);
            C14240no A0F = AbstractC43593JPy.A0F(c68251VJn.A03);
            String obj2 = VHn.A04.toString();
            A0F.A0I(obj2);
            A0F.A0C(elt, obj2, R.id.content_panel);
            A0F.A00();
        }
        return this.A01;
    }

    public C71134WoV(UserSession userSession, C68251VJn c68251VJn, C1V4 c1v4) {
        this.A02 = c1v4;
        this.A00 = userSession;
        this.A01 = c68251VJn;
    }
}
