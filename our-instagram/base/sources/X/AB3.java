package X;

import com.instagram.ui.text.fittingtextview.FittingTextView;

/* loaded from: classes4.dex */
public final class AB3 {
    public final /* synthetic */ C23629AdO A00;

    public AB3(C23629AdO c23629AdO) {
        this.A00 = c23629AdO;
    }

    public final void A00(String str) {
        C23629AdO c23629AdO = this.A00;
        c23629AdO.A0H = str.trim();
        C23629AdO.A02(c23629AdO);
        boolean z = !new C11L("^(?:\\s|\\p{Punct})*$").A08(str);
        c23629AdO.A0I = z;
        FittingTextView fittingTextView = c23629AdO.A0a;
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        fittingTextView.setAlpha(f);
    }
}
