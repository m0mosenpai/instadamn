package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.NyC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54231NyC {
    public static final void A00(View view, TextView textView, C51943MxQ c51943MxQ, InterfaceC16820sZ interfaceC16820sZ) {
        int i;
        view.setVisibility(AbstractC167007dF.A05(c51943MxQ.A02 ? 1 : 0));
        if (!AbstractC54230NyB.A00(textView, c51943MxQ.A00)) {
            interfaceC16820sZ.invoke();
        }
        int intValue = c51943MxQ.A01.intValue();
        if (intValue != 0 && intValue != 1) {
            if (intValue != 2) {
                if (intValue == 3) {
                    i = R.drawable.story_message_composer_background_modernized;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i = R.drawable.story_message_composer_background_shhmode;
            }
        } else {
            i = R.drawable.story_message_composer_background;
        }
        AbstractC31173DnH.A0z(view.getContext(), view, i);
    }
}
