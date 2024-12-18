package X;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JiS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogC44330JiS extends Dialog {
    public UserSession A00;

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.android13_permission_mock_dialog);
        setCanceledOnTouchOutside(true);
        TextView textView = (TextView) findViewById(R.id.title);
        View findViewById = findViewById(R.id.accept_button);
        View findViewById2 = findViewById(R.id.deny_button);
        UserSession userSession = this.A00;
        if (textView != null && findViewById != null && findViewById2 != null && userSession != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_android_13_notifications_priming_event");
            if (A0f.isSampled()) {
                A0f.AAP("experiment_group", "no_in_test");
                AbstractC43593JPy.A1J(A0f, "mock_system_dialog_impression");
            }
            textView.setText(Html.fromHtml(getContext().getResources().getString(2131952969)));
            ViewOnClickListenerC48064LPp.A00(findViewById, 55, this);
            ViewOnClickListenerC48066LPr.A00(findViewById2, 16, this, userSession);
            setOnDismissListener(new DialogInterfaceOnDismissListenerC48025LMu(this, 2));
            return;
        }
        C0w9.A03("Android13PermissionMockDialog", "screen initial failed");
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        C19740y2 A00 = AbstractC19730y1.A00(AbstractC12960li.A00);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19630xq interfaceC19630xq = A00.A00;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7G("mock_system_notification_permission_dialog_last_shown_timestamp", currentTimeMillis);
        ARD.apply();
        AbstractC167007dF.A18(interfaceC19630xq, "eligible_to_mock_notification_dialog_shown_count", AbstractC31172DnG.A01(interfaceC19630xq, "eligible_to_mock_notification_dialog_shown_count") + 1);
    }
}
