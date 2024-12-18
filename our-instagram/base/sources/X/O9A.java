package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class O9A {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    public O9A(View view, Fragment fragment, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        C57542PgG c57542PgG = new C57542PgG(userSession, 26);
        InterfaceC09390do A01 = C57542PgG.A01(new C57542PgG(fragment, 22), EnumC09460dv.A02, 23);
        this.A01 = AbstractC25225BEi.A0a(new C57542PgG(A01, 24), c57542PgG, C57530Pg4.A00(null, A01, 4), AbstractC25225BEi.A1D(C50877Me8.class));
        this.A00 = C57542PgG.A00(view, 25);
        AbstractC37301Gc2.A0w(fragment.getViewLifecycleOwner(), ((C50877Me8) this.A01.getValue()).A00, C57755Pji.A02(this, 12), 27);
    }
}
