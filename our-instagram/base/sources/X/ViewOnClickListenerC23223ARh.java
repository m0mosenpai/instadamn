package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.ARh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23223ARh implements View.OnClickListener {
    public final /* synthetic */ C2EE A00;
    public final /* synthetic */ AGO A01;

    public ViewOnClickListenerC23223ARh(C2EE c2ee, AGO ago) {
        this.A00 = c2ee;
        this.A01 = ago;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AGO ago;
        int A05 = C0f9.A05(-441371564);
        C2EE c2ee = this.A00;
        if (c2ee instanceof C2EG) {
            User user = (User) AbstractC166987dD.A16(((C2EG) c2ee).BSH());
            ago = this.A01;
            InterfaceC09390do interfaceC09390do = ago.A08;
            C34698FQj c34698FQj = (C34698FQj) interfaceC09390do.getValue();
            UserSession userSession = ago.A04;
            Integer num = C05F.A01;
            if (c34698FQj.A01(userSession, user, num)) {
                ((C34698FQj) interfaceC09390do.getValue()).A00(ago.A02, userSession, user, num, "");
                C0f9.A0C(-1208810231, A05);
            }
        } else {
            ago = this.A01;
        }
        ago.A07.CuJ(c2ee);
        C0f9.A0C(-1208810231, A05);
    }
}
