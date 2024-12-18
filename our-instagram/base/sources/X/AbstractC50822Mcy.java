package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView;

/* renamed from: X.Mcy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50822Mcy extends ConstraintLayout {
    public LeadGenFormBaseQuestion A00;
    public InterfaceC57957Pn3 A01;
    public InterfaceC57958Pn4 A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public static AbstractC50822Mcy A00(Fragment fragment, LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        if (leadGenFormBaseQuestion.A0D.isEmpty()) {
            return new LeadGenFormShortAnswerQuestionView(fragment.requireContext(), null, 0);
        }
        return new NO4(fragment.requireContext());
    }

    public final void A0F(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str) {
        C14360o3.A0B(str, 1);
        this.A05 = true;
        leadGenFormBaseQuestion.A00 = str;
        InterfaceC57957Pn3 interfaceC57957Pn3 = this.A01;
        if (interfaceC57957Pn3 != null) {
            interfaceC57957Pn3.Cwq(leadGenFormBaseQuestion, str);
        }
    }

    public abstract void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (((X.AbstractC50822Mcy) r6).A04 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r1 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (r13.A00(null, r20, X.C16930sl.A00, r21, false) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0H(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50822Mcy.A0H(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, boolean):boolean");
    }

    public final void setLastKnownInput(String str) {
        C14360o3.A0B(str, 0);
        this.A03 = str;
    }

    public final String A0D(String str) {
        if (!(this instanceof NO2) && !(this instanceof NO0)) {
            C14360o3.A0B(str, 0);
            return str;
        }
        C14360o3.A0B(str, 0);
        String A08 = C60742RPg.A01.A07(AbstractC64290T7z.A01("()-.")).A08(str);
        C14360o3.A07(A08);
        return A08;
    }

    public final void A0E() {
        IgFormField igFormField;
        if (this instanceof LeadGenFormShortAnswerQuestionView) {
            igFormField = ((LeadGenFormShortAnswerQuestionView) this).A01;
        } else if (this instanceof NOA) {
            igFormField = ((NOA) this).A04;
        } else if (!(this instanceof NO5)) {
            return;
        } else {
            igFormField = ((NO5) this).A02;
        }
        igFormField.A0G();
    }

    public final boolean getEnableOptionalQuestions() {
        return this.A04;
    }

    public final boolean getHasBeenEdited() {
        return this.A05;
    }

    public final String getLastKnownInput() {
        return this.A03;
    }

    public final LeadGenFormBaseQuestion getQuestion() {
        return this.A00;
    }

    public AbstractC50822Mcy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = "";
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setEnableOptionalQuestions(boolean z) {
        this.A04 = z;
    }

    public final void setHasBeenEdited(boolean z) {
        this.A05 = z;
    }

    public final void setOnAnswerChangeListener(InterfaceC57957Pn3 interfaceC57957Pn3) {
        this.A01 = interfaceC57957Pn3;
    }

    public final void setOnUserInputCompleteListener(InterfaceC57958Pn4 interfaceC57958Pn4) {
        this.A02 = interfaceC57958Pn4;
    }

    public final void setPrismMode(boolean z) {
        this.A06 = z;
    }

    public final void setQuestion(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        this.A00 = leadGenFormBaseQuestion;
    }

    public final void setRechecking(boolean z) {
        this.A07 = z;
    }
}
