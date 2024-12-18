package X;

import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView;

/* loaded from: classes11.dex */
public final class WNZ implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WNZ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.A00) {
            case 0:
                ReactTextInputManager.lambda$addEventEmitters$0((R3N) this.A01, (UDV) this.A02, view, z);
                return;
            case 1:
                C23709Aei c23709Aei = (C23709Aei) this.A02;
                C88W c88w = c23709Aei.A0M;
                if (z) {
                    c88w.A00();
                    ((C3I9) this.A01).A9e(c23709Aei);
                    AbstractC167007dF.A1C(view);
                    AbstractC13880nE.A0S(view);
                    return;
                }
                c88w.A01();
                ((C3I9) this.A01).EFx(c23709Aei);
                AbstractC167007dF.A1C(view);
                AbstractC13880nE.A0O(view);
                return;
            default:
                SurveyWriteInListItemView surveyWriteInListItemView = (SurveyWriteInListItemView) this.A01;
                View.OnFocusChangeListener onFocusChangeListener = surveyWriteInListItemView.A00;
                onFocusChangeListener.getClass();
                onFocusChangeListener.onFocusChange(view, z);
                if (z) {
                    Object parent = view.getParent();
                    parent.getClass();
                    View view2 = (View) parent;
                    if (!((Checkable) view2).isChecked()) {
                        view2.performClick();
                    }
                    AbstractC167017dG.A18((EditText) this.A02);
                    return;
                }
                VAX vax = (VAX) ((UCs) surveyWriteInListItemView).A00;
                vax.A02.A00(surveyWriteInListItemView.getText());
                return;
        }
    }
}
