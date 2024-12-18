package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.364, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass364 extends AbstractC682735p {
    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        View view;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        Object obj = c59062n7.A03;
        C14360o3.A06(obj);
        C5Ln A02 = A02((C38321qM) obj);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C && (view = (View) ((AbstractC682735p) this).A00.get(obj)) != null) {
            View findViewById = view.findViewById(R.id.political_context);
            if (findViewById instanceof TextView) {
                ((C5Lo) A02).A08 = ((TextView) findViewById).getText().toString();
            }
        }
    }
}
