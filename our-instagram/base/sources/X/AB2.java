package X;

import android.graphics.drawable.GradientDrawable;
import com.instagram.ui.text.TextColorScheme;

/* loaded from: classes4.dex */
public final class AB2 {
    public final /* synthetic */ C183688Ct A00;

    public AB2(C183688Ct c183688Ct) {
        this.A00 = c183688Ct;
    }

    public final void A00(TextColorScheme textColorScheme, TextColorScheme textColorScheme2, int i) {
        if (textColorScheme.A06 != null) {
            ((C8Q5) this.A00.A1g.get()).ERl(textColorScheme.A06);
            return;
        }
        C183688Ct c183688Ct = this.A00;
        C8Q5 c8q5 = (C8Q5) c183688Ct.A1g.get();
        GradientDrawable.Orientation orientation = textColorScheme.A03;
        orientation.getClass();
        c8q5.ERk(orientation, textColorScheme.A01(), i);
        C183688Ct.A0D(c183688Ct, textColorScheme2);
    }
}
