package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes4.dex */
public final class ABM {
    public View A00;
    public TextView A01;
    public final InterfaceC56392iX A02;

    public final void A00() {
        InterfaceC56392iX interfaceC56392iX = this.A02;
        View view = interfaceC56392iX.getView();
        this.A00 = view;
        if (view != null) {
            this.A01 = AbstractC166987dD.A0e(view, R.id.question_sticker_answer);
            interfaceC56392iX.setVisibility(0);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public ABM(View view) {
        this.A02 = AbstractC56372iV.A00(view.findViewById(R.id.question_sticker_text_answer_stub));
    }
}
