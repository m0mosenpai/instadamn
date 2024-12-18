package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.Dx6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31753Dx6 extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C31753Dx6(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        switch (this.A00) {
            case 0:
                C63397SjR A0y = AbstractC25228BEl.A0y((Context) this.A02, (UserSession) this.A01, C2Fb.A0b, "https://help.instagram.com/316932422966736");
                A0y.A0S = this.A03;
                A0y.A0A();
                C6WI.A01().A0G = true;
                return;
            case 1:
                FKB fkb = (FKB) this.A02;
                if (fkb == null || (str = this.A03) == null) {
                    return;
                }
                Fragment fragment = fkb.A00;
                C3DN A0r = AbstractC31172DnG.A0r(fragment.requireActivity());
                if (fkb.A02 && A0r != null) {
                    ((C3DP) A0r).A0H = new GH7(str, fkb, 1);
                    A0r.A0B();
                    return;
                } else {
                    C140966Yy A0r2 = AbstractC25225BEi.A0r(fragment.requireActivity(), fkb.A01);
                    A0r2.A0E(C35028Fc1.A00(str).A02());
                    A0r2.A04();
                    return;
                }
            default:
                C35133Fea.A01(AbstractC166997dE.A0L((View) this.A01), AbstractC166987dD.A0o(((C52109N4h) this.A02).A00), SimpleWebViewActivity.A02, AbstractC31171DnF.A0R("https://help.instagram.com/477434105621119"), this.A03);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Context context;
        int A06;
        switch (this.A00) {
            case 0:
                AbstractC25229BEm.A13(textPaint);
                context = (Context) this.A02;
                A06 = AbstractC53242c7.A06(context);
                break;
            case 1:
                textPaint.setUnderlineText(false);
                context = (Context) this.A01;
                A06 = R.color.badge_color;
                break;
            default:
                C14360o3.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
        }
        AbstractC166987dD.A1N(context, textPaint, A06);
    }
}
