package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IkB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnLongClickListenerC42042IkB implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnLongClickListenerC42042IkB(IKT ikt, int i) {
        this.A00 = i;
        this.A01 = ikt;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        InterfaceC38371qR A00;
        C41029IEy c41029IEy = ((IKT) this.A01).A05;
        HCY hcy = c41029IEy.A01;
        InterfaceC09390do interfaceC09390do = hcy.A0B;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str = hcy.A02;
        String str2 = hcy.A03;
        C14360o3.A0B(A0r, 0);
        if (str2 != null && (A00 = AbstractC151266rU.A00(A0r, str, str2)) != null) {
            Context context = c41029IEy.A00;
            C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
            new C37605Gh0((Activity) context, AbstractC166987dD.A0r(interfaceC09390do), hcy, null, new J06(1), EnumC37745GjK.A0A, null).A0N(new C5SE(AbstractC166987dD.A0r(interfaceC09390do), A00.BQN()), A00, new C41173IKm(null, null, null, false, true, true, false, false, true, false, false, false, false, false, false, false, false));
            return true;
        }
        return false;
    }
}
