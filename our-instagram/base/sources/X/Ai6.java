package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes4.dex */
public final class Ai6 implements C8DK {
    public TextView A00;
    public final View A01;
    public final View A02;
    public final InterfaceC11380iw A03;
    public final C9ZH A04;
    public final InterfaceC16660sJ A05;
    public final View A06;

    @Override // X.C8DK
    public final void Ede(boolean z) {
        View[] viewArr = {this.A01, this.A06};
        if (z) {
            AbstractC125325le.A04(null, viewArr, true);
        } else {
            AbstractC125325le.A05(viewArr, true);
        }
    }

    @Override // X.C8DK
    public final void EQs(boolean z) {
        View[] viewArr = new View[1];
        TextView textView = this.A00;
        if (z) {
            if (textView != null) {
                viewArr[0] = textView;
                AbstractC125325le.A04(null, viewArr, true);
                return;
            }
        } else if (textView != null) {
            viewArr[0] = textView;
            AbstractC125325le.A05(viewArr, true);
            return;
        }
        C14360o3.A0F("headerTitle");
        throw C00O.createAndThrow();
    }

    public Ai6(View view, View view2, InterfaceC11380iw interfaceC11380iw, C9ZH c9zh, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1R(view2, interfaceC11380iw);
        C14360o3.A0B(c9zh, 4);
        this.A02 = view;
        this.A01 = view2;
        this.A03 = interfaceC11380iw;
        this.A04 = c9zh;
        this.A05 = interfaceC16660sJ;
        this.A06 = AbstractC166997dE.A0S(view2, R.id.note_reply_camera_avatar_button_container);
    }
}
