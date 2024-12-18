package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.WoZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71138WoZ implements InterfaceC72018XFg {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C68251VJn A02;
    public final /* synthetic */ C1V4 A03;

    public C71138WoZ(FragmentActivity fragmentActivity, UserSession userSession, C68251VJn c68251VJn, C1V4 c1v4) {
        this.A03 = c1v4;
        this.A02 = c68251VJn;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.53S, java.lang.Object, X.FtG] */
    @Override // X.InterfaceC72018XFg
    public final /* bridge */ /* synthetic */ Object DV9(C69427VnC c69427VnC, Object obj, int i) {
        C68251VJn c68251VJn = this.A02;
        UserSession userSession = this.A01;
        int A00 = AbstractC68564VVr.A00(C17060sy.A01.A01(userSession));
        if (A00 > 0) {
            C67887V0u c67887V0u = new C67887V0u();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_number_of_steps", A00);
            AbstractC31173DnH.A1C(bundle, userSession);
            c67887V0u.setArguments(bundle);
            c68251VJn.A03 = c67887V0u;
            c67887V0u.mArguments.getClass();
            Bundle bundle2 = c67887V0u.mArguments;
            C14360o3.A0B(bundle2, 0);
            bundle2.putString("DynamicFlowPlugin.extraFlowId", "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
            C140966Yy c140966Yy = new C140966Yy(this.A00, userSession);
            c68251VJn.A00 = c140966Yy;
            c140966Yy.A0E(c67887V0u);
            String obj2 = VHn.A06.toString();
            c140966Yy.A0A = obj2;
            c140966Yy.A0C = obj2;
            String str = userSession.userId;
            ?? obj3 = new Object();
            obj3.A00 = str;
            c140966Yy.A07 = obj3;
            c140966Yy.A07();
            return null;
        }
        throw new IllegalStateException("Number of steps must be greater than 0.");
    }
}
