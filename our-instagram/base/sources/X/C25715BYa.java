package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.BYa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25715BYa extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C25715BYa(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.A00) {
            case 2:
                C14360o3.A0B(view, 0);
                View.OnClickListener onClickListener = (View.OnClickListener) this.A01;
                if (onClickListener == null) {
                    return;
                }
                onClickListener.onClick(view);
                return;
            case 3:
                Context A0L = AbstractC166997dE.A0L((View) this.A01);
                C26859BtL c26859BtL = (C26859BtL) this.A02;
                C63397SjR A0y = AbstractC25228BEl.A0y(A0L, AbstractC166987dD.A0r(c26859BtL.A03), C2Fb.A2A, "https://help.instagram.com/517073653436611?helpref=faq_content");
                A0y.A0S = c26859BtL.A02;
                A0y.A0A();
                return;
            case 4:
                C14360o3.A0B(view, 0);
                ((OHW) this.A02).A00((CWE) this.A01);
                return;
            case 5:
                C14360o3.A0B(view, 0);
                ((C25447BNm) this.A02).A0A.invoke(this.A01, view);
                return;
            default:
                ((InterfaceC30995Dju) this.A01).D45((C38321qM) this.A02);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Context context;
        int i;
        switch (this.A00) {
            case 2:
                AbstractC25229BEm.A13(textPaint);
                context = (Context) this.A02;
                i = R.color.baseline_neutral_80;
                break;
            case 3:
                C14360o3.A0B(textPaint, 0);
                context = ((Fragment) this.A02).requireContext();
                i = AbstractC53242c7.A06(((View) this.A01).getContext());
                break;
            case 4:
                return;
            case 5:
                AbstractC25229BEm.A13(textPaint);
                textPaint.setFakeBoldText(true);
                return;
            default:
                C14360o3.A0B(textPaint, 0);
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                return;
        }
        AbstractC166987dD.A1N(context, textPaint, i);
    }
}
