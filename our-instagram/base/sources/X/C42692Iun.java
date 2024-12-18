package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.Iun, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42692Iun implements InterfaceC58152PqH {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42692Iun(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A02 = str;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            IgFragmentFactoryImpl.A00();
            String str = this.A02;
            C35028Fc1 c35028Fc1 = new C35028Fc1();
            c35028Fc1.A0B = str;
            C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, this.A01);
            A0r.A0D(c35028Fc1.A02());
            A0r.A04();
        }
    }
}
