package X;

import android.content.Context;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Idk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41714Idk {
    public static final C41714Idk A00 = new Object();

    public static final void A01(Context context, JK7 jk7, C38321qM c38321qM, C42659IuG c42659IuG, IKH ikh, C64452w4 c64452w4, List list) {
        InterfaceC106354qp BgF;
        String text;
        if (ikh.A06.getVisibility() != 0) {
            String str = null;
            if (jk7 != null && (BgF = jk7.BgF()) != null && (text = BgF.getText()) != null && text.length() != 0) {
                InterfaceC106354qp BgF2 = jk7.BgF();
                if (BgF2 != null) {
                    str = BgF2.Anq();
                }
                for (Integer num : C05F.A00(1)) {
                    if ("view_contextual_feed".equals(str)) {
                        if (num != null) {
                            if (ikh.A00 != null) {
                                InterfaceC43499JJl B3i = jk7.B3i();
                                IgdsButton igdsButton = ikh.A00;
                                if (igdsButton != null) {
                                    igdsButton.setEnabled(AbstractC166987dD.A1b(A00(c42659IuG, list)));
                                    igdsButton.setText(text);
                                    C0fQ.A00(new ViewOnClickListenerC42009Ije(2, num, c64452w4, c38321qM, c42659IuG, B3i, context, list), igdsButton);
                                    return;
                                }
                                return;
                            }
                            ViewStub viewStub = ikh.A02;
                            viewStub.setLayoutResource(R.layout.afi_interests_picker_cta_button);
                            viewStub.setOnInflateListener(new ViewStubOnInflateListenerC42064IkX(context, jk7, c38321qM, c42659IuG, ikh, c64452w4, num, text, list));
                            viewStub.inflate();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public static final List A00(C42659IuG c42659IuG, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (AbstractC166997dE.A0m(c42659IuG.A03, i) == Hd2.A02) {
                A1E.add(obj);
            }
            i = i2;
        }
        return AbstractC001800i.A0a(A1E);
    }
}
