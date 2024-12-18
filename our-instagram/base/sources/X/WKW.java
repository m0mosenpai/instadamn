package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView;
import com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView;

/* loaded from: classes11.dex */
public final class WKW implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public WKW(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                ((VAX) this.A02).A02.A00(((SurveyWriteInListItemView) this.A03).getText());
                return;
            default:
                SurveyEditTextListItemView surveyEditTextListItemView = (SurveyEditTextListItemView) this.A03;
                String A0g = AbstractC167007dF.A0g(surveyEditTextListItemView.A00);
                String str = ((UCs) surveyEditTextListItemView).A00.A01;
                C67888V0v c67888V0v = ((UB6) this.A01).A02;
                c67888V0v.getClass();
                c67888V0v.A05(str, !"".equals(A0g));
                VAW vaw = (VAW) this.A02;
                vaw.getClass();
                vaw.A00(AbstractC167007dF.A0g(surveyEditTextListItemView.A00));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.6cX, java.lang.Object] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        Drawable drawable;
        if (this.A00 == 0) {
            C14360o3.A0B(charSequence, 0);
            int length = charSequence.length();
            KBZ kbz = (KBZ) this.A03;
            IgdsMediaButton igdsMediaButton = kbz.A0D;
            if (length == 0) {
                AbstractC167007dF.A0x(igdsMediaButton);
            } else if (igdsMediaButton != null) {
                igdsMediaButton.setVisibility(0);
            }
            RewriteTextBubbleViewPager rewriteTextBubbleViewPager = kbz.A0A;
            Editable editable = null;
            if (rewriteTextBubbleViewPager != null) {
                str = rewriteTextBubbleViewPager.getAppliedPromptOfCurrentPage();
            } else {
                str = null;
            }
            IgEditText igEditText = kbz.A03;
            if (igEditText != null) {
                editable = igEditText.getText();
            }
            if (AbstractC002300n.A0e(editable, str) && str != null && str.length() != 0) {
                kbz.A06((Drawable) this.A01);
                return;
            }
            Drawable drawable2 = (Drawable) this.A02;
            boolean z = kbz.A0I;
            IgdsMediaButton igdsMediaButton2 = kbz.A0D;
            if (z) {
                if (igdsMediaButton2 != null) {
                    drawable = igdsMediaButton2.getBackground();
                } else {
                    drawable = null;
                }
                C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) drawable).setColor(-1);
            } else if (igdsMediaButton2 != null) {
                igdsMediaButton2.setButtonStyle(EnumC151036r4.A03);
            }
            IgdsMediaButton igdsMediaButton3 = kbz.A0D;
            if (igdsMediaButton3 == 0) {
                return;
            }
            ?? obj = new Object();
            obj.A01 = drawable2;
            igdsMediaButton3.setStartAddOn(obj, null);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
