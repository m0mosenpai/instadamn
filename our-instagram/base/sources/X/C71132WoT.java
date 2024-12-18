package X;

import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.WoT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71132WoT implements InterfaceC72018XFg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C68251VJn A01;
    public final /* synthetic */ C1V4 A02;

    @Override // X.InterfaceC72018XFg
    public final /* bridge */ /* synthetic */ Object DV9(C69427VnC c69427VnC, Object obj, int i) {
        if (i == 1) {
            int i2 = -1;
            int i3 = -1;
            C68251VJn c68251VJn = this.A01;
            String str = c68251VJn.A06;
            C67887V0u c67887V0u = c68251VJn.A03;
            if (c67887V0u.A00 == c67887V0u.A01 - 1) {
                i2 = 2131961124;
                i3 = 6;
            }
            C67880V0l A00 = AbstractC68563VVq.A00(str, 2131970173, i3, 3, i2, 2131970169, 2131970170);
            A00.mArguments.getClass();
            AbstractC03240Dh.A00(A00.mArguments, this.A00);
            Bundle bundle = A00.mArguments;
            C14360o3.A0B(bundle, 0);
            bundle.putString("DynamicFlowPlugin.extraFlowId", "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
            C14240no A0F = AbstractC43593JPy.A0F(c68251VJn.A03);
            String obj2 = VHn.A02.toString();
            A0F.A0I(obj2);
            A0F.A0D(A00, obj2, R.id.content_panel);
            A0F.A00();
            return null;
        }
        return null;
    }

    public C71132WoT(UserSession userSession, C68251VJn c68251VJn, C1V4 c1v4) {
        this.A02 = c1v4;
        this.A01 = c68251VJn;
        this.A00 = userSession;
    }
}
