package X;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* loaded from: classes9.dex */
public class NO5 extends AbstractC50822Mcy {
    public TextWatcher A00;
    public TextWatcher A01;
    public final IgFormField A02;

    @Override // X.AbstractC50822Mcy
    public void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        ((AbstractC50822Mcy) this).A00 = leadGenFormBaseQuestion;
        ((AbstractC50822Mcy) this).A04 = z3;
        ((AbstractC50822Mcy) this).A06 = z2;
        IgFormField igFormField = this.A02;
        igFormField.setPrismMode(z2);
        Context A0L = AbstractC166997dE.A0L(this);
        Integer num = leadGenFormBaseQuestion.A04;
        if (num != null) {
            str = AbstractC166997dE.A0p(A0L, num.intValue());
        } else {
            str = leadGenFormBaseQuestion.A0A;
        }
        igFormField.setLabelText(str);
        setLastKnownInput(leadGenFormBaseQuestion.A00);
        igFormField.setText(leadGenFormBaseQuestion.A00);
        if (leadGenFormBaseQuestion.A0I && z3) {
            String A0q = AbstractC166997dE.A0q(getResources(), 2131964865);
            if (z2) {
                igFormField.getBottomSubtitleInfoView().setText(A0q);
                igFormField.getBottomSubtitleInfoView().setVisibility(0);
            } else {
                if (num != null) {
                    str2 = AbstractC166997dE.A0p(A0L, num.intValue());
                } else {
                    str2 = leadGenFormBaseQuestion.A0A;
                }
                igFormField.setLabelText(AnonymousClass001.A0h(str2, " (", A0q, ')'));
            }
            AbstractC55110ObT.A02(igFormField, new P37(this, 1));
        } else {
            igFormField.getBottomSubtitleErrorView().setVisibility(8);
        }
        if (leadGenFormBaseQuestion.A03 == VEF.A09) {
            igFormField.A0F();
            if (!z2) {
                igFormField.setAlpha(0.3f);
            }
        }
        igFormField.setRuleChecker(new P35(leadGenFormBaseQuestion, this, true, z));
        A0I();
        igFormField.setInputType(C55205OeH.A00.A05(leadGenFormBaseQuestion));
    }

    public final void A0I() {
        int i;
        if (!(this instanceof C52578NNy)) {
            TextWatcher textWatcher = this.A01;
            if (textWatcher != null) {
                AbstractC31173DnH.A1D(textWatcher, this.A02);
            }
            TextWatcher textWatcher2 = this.A00;
            if (textWatcher2 != null) {
                AbstractC31173DnH.A1D(textWatcher2, this.A02);
            }
            LeadGenFormBaseQuestion leadGenFormBaseQuestion = ((AbstractC50822Mcy) this).A00;
            if (leadGenFormBaseQuestion != null) {
                if (this instanceof NO2) {
                    i = 1;
                } else {
                    i = 2;
                }
                C55345Oi5 c55345Oi5 = new C55345Oi5(i, leadGenFormBaseQuestion, this);
                this.A01 = c55345Oi5;
                IgFormField igFormField = this.A02;
                igFormField.A0H(c55345Oi5);
                String str = leadGenFormBaseQuestion.A08;
                O3W o3w = new O3W(this);
                AbstractC53634Nnf A00 = S54.A00((VFS) EnumHelper.A00(str, VFS.UNSET_OR_UNRECOGNIZED_ENUM_VALUE));
                if (A00 != null) {
                    C55348OiA c55348OiA = new C55348OiA(igFormField, A00, o3w);
                    this.A00 = c55348OiA;
                    igFormField.A0H(c55348OiA);
                }
            }
        }
    }

    public final IgFormField getQuestionForm() {
        return this.A02;
    }

    public final void setImeOption(int i) {
        this.A02.getMEditText().setImeOptions(i);
    }

    public NO5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.lead_gen_view_form_customer_info, this);
        this.A02 = AbstractC31172DnG.A0k(this, R.id.info_form_field);
    }
}
