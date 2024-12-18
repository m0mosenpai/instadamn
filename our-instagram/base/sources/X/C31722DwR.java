package X;

import android.view.View;
import com.instagram.actionbar.ActionButton;

/* renamed from: X.DwR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31722DwR {
    public int A00;
    public View.OnClickListener A01;
    public String A02;

    public static ActionButton A00(View.OnClickListener onClickListener, InterfaceC56362iU interfaceC56362iU, C35197Ffp c35197Ffp) {
        c35197Ffp.A01 = onClickListener;
        return interfaceC56362iU.Ehj(new C31722DwR(c35197Ffp));
    }

    public static void A01(View.OnClickListener onClickListener, InterfaceC56362iU interfaceC56362iU, C35197Ffp c35197Ffp) {
        c35197Ffp.A01 = onClickListener;
        interfaceC56362iU.Ehj(new C31722DwR(c35197Ffp));
    }

    public C31722DwR(C35197Ffp c35197Ffp) {
        this.A02 = c35197Ffp.A02;
        this.A00 = c35197Ffp.A00;
        this.A01 = c35197Ffp.A01;
    }
}
