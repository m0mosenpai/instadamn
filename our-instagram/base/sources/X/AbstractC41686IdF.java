package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.IdF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41686IdF {
    public static String A00 = "v1";
    public static UserSession A01;

    public static final View A00(ViewGroup viewGroup, UserSession userSession, String str) {
        int i;
        A01 = userSession;
        A00 = str;
        if (str.equals("v3")) {
            i = R.layout.question_header_view_v3;
        } else {
            boolean equals = str.equals("v2");
            i = R.layout.question_header_view;
            if (equals) {
                i = R.layout.question_header_view_v2;
            }
        }
        View A0D = AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, i, false);
        A0D.setTag(new C38526Gwm(A0D));
        return A0D;
    }

    public static final void A01(InterfaceC63942vF interfaceC63942vF, C38526Gwm c38526Gwm, C42666IuN c42666IuN, C41222IMn c41222IMn) {
        C14360o3.A0B(c38526Gwm, 0);
        AbstractC167007dF.A1D(c42666IuN, 1, c41222IMn);
        c38526Gwm.A01 = c41222IMn;
        c42666IuN.A03.add(c38526Gwm);
        A02(interfaceC63942vF, c38526Gwm, c41222IMn.A01(c42666IuN.A00), true);
    }

    public static final void A02(InterfaceC63942vF interfaceC63942vF, C38526Gwm c38526Gwm, C41232IMx c41232IMx, boolean z) {
        boolean A1b = AbstractC25233BEq.A1b(c38526Gwm, c41232IMx, interfaceC63942vF);
        TextView textView = c38526Gwm.A07;
        textView.setText(c41232IMx.A03.A07);
        if (C14360o3.A0K(A00, "v1")) {
            textView.setTypeface(textView.getTypeface(), A1b ? 1 : 0);
            AbstractC13880nE.A0m(c38526Gwm.A05, R.dimen.action_bar_item_spacing_right, R.dimen.abc_select_dialog_padding_start_material, R.dimen.action_bar_item_spacing_right, R.dimen.abc_select_dialog_padding_start_material);
        }
        View view = c38526Gwm.A03;
        if (z) {
            view.setVisibility(0);
            ViewOnClickListenerC42034Ik3.A00(view, 19, interfaceC63942vF, c41232IMx);
        } else {
            view.setVisibility(8);
        }
    }
}
