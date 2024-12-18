package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class IM2 {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;

    public final void A00(UserSession userSession, InterfaceC41201vU interfaceC41201vU) {
        int[] A02 = AbstractC140306Wi.A02(userSession, interfaceC41201vU);
        this.A01.setText(String.valueOf(A02[0]));
        this.A03.setText(String.valueOf(A02[1]));
        C101394gx A00 = AbstractC140306Wi.A00(interfaceC41201vU);
        A00.getClass();
        List A01 = AbstractC37865GlK.A01(A00);
        InterfaceC101384gv interfaceC101384gv = (InterfaceC101384gv) A01.get(0);
        InterfaceC101384gv interfaceC101384gv2 = (InterfaceC101384gv) A01.get(1);
        TextView textView = this.A00;
        textView.setText(C38998HFa.A00(textView.getResources(), interfaceC101384gv, A02[0]));
        TextView textView2 = this.A02;
        textView2.setText(C38998HFa.A00(textView2.getResources(), interfaceC101384gv2, A02[1]));
    }

    public IM2(View view) {
        this.A01 = AbstractC166997dE.A0T(view, R.id.dashboard_poll_result_first_option_tally);
        this.A00 = AbstractC166997dE.A0T(view, R.id.dashboard_poll_result_first_option);
        this.A03 = AbstractC166997dE.A0T(view, R.id.dashboard_poll_result_second_option_tally);
        this.A02 = AbstractC166997dE.A0T(view, R.id.dashboard_poll_result_second_option);
    }
}
