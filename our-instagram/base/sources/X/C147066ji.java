package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.Html;
import android.text.Spanned;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147066ji {
    public FragmentActivity A00;
    public UserSession A01;

    public C147066ji(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final boolean A01() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A01);
        return ((Boolean) A00.A80.CES(A00, C23031Ai.A8c[143])).booleanValue();
    }

    public final void A00(DialogInterface.OnDismissListener onDismissListener, boolean z) {
        DialogInterfaceOnClickListenerC35318Fht dialogInterfaceOnClickListenerC35318Fht;
        if (A01()) {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A01);
            A00.A80.Egi(A00, false, C23031Ai.A8c[143]);
            FragmentActivity fragmentActivity = this.A00;
            Spanned fromHtml = Html.fromHtml(fragmentActivity.getResources().getString(2131971629));
            C14360o3.A07(fromHtml);
            C193328hC c193328hC = new C193328hC((Activity) fragmentActivity);
            c193328hC.A0j(fragmentActivity.getDrawable(R.drawable.ig_illustrations_illo_delete_recovery_refresh));
            c193328hC.A0s(true);
            c193328hC.A0t(true);
            c193328hC.A0A(2131971630);
            c193328hC.A0r(fromHtml);
            c193328hC.A0H(new DialogInterfaceOnClickListenerC35317Fhs(this), 2131971631);
            if (z) {
                dialogInterfaceOnClickListenerC35318Fht = new DialogInterfaceOnClickListenerC35318Fht(this);
            } else {
                dialogInterfaceOnClickListenerC35318Fht = null;
            }
            c193328hC.A0I(dialogInterfaceOnClickListenerC35318Fht, 2131956237);
            if (onDismissListener != null) {
                c193328hC.A0g(onDismissListener);
            }
            C0fJ.A00(c193328hC.A02());
        }
    }
}
