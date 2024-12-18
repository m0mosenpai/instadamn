package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.survey.structuredsurvey.views.SurveyCheckboxListItemView;
import com.instagram.survey.structuredsurvey.views.SurveyDividerListItemView;
import com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView;
import com.instagram.survey.structuredsurvey.views.SurveyImageBlockListItemView;
import com.instagram.survey.structuredsurvey.views.SurveyMessageListItemView;
import com.instagram.survey.structuredsurvey.views.SurveyQuestionListItemView;
import com.instagram.survey.structuredsurvey.views.SurveyRadioListItemView;
import com.instagram.survey.structuredsurvey.views.SurveySpaceListItemView;
import com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class UB6 extends ArrayAdapter {
    public Activity A00;
    public View.OnClickListener A01;
    public C67888V0v A02;
    public HashMap A03;
    public HashMap A04;
    public String A05;
    public final View.OnClickListener A06;
    public final View.OnFocusChangeListener A07;
    public final View.OnFocusChangeListener A08;
    public final View.OnFocusChangeListener A09;

    public UB6(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.A04 = new HashMap();
        this.A03 = new HashMap();
        this.A06 = new WNS(this, 16);
        this.A08 = new WNY(this, 8);
        this.A07 = new WNY(this, 9);
        this.A09 = new WNY(this, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(View view, UB6 ub6) {
        UCs uCs;
        VDB vdb;
        Checkable checkable = (Checkable) view;
        checkable.setChecked(true);
        UCs uCs2 = (UCs) view;
        C70077W1u c70077W1u = uCs2.A00;
        if (c70077W1u != null) {
            String str = c70077W1u.A01;
            C67888V0v c67888V0v = ub6.A02;
            c67888V0v.getClass();
            c67888V0v.A05(str, true);
            HashMap hashMap = ub6.A04;
            if (hashMap.containsKey(str) && (uCs = (UCs) hashMap.get(str)) != 0 && uCs != checkable && ((vdb = uCs.A00.A00) != uCs2.A00.A00 || vdb != VDB.RADIOWRITEIN)) {
                ((Checkable) uCs).setChecked(false);
            }
            hashMap.put(str, uCs2);
        }
    }

    private void A00(View.OnFocusChangeListener onFocusChangeListener, VAX vax, SurveyWriteInListItemView surveyWriteInListItemView) {
        surveyWriteInListItemView.setChecked(vax.A01);
        surveyWriteInListItemView.A00 = onFocusChangeListener;
        if (((UCs) surveyWriteInListItemView).A00.A01.equals(this.A05) && vax.A01) {
            EditText editText = surveyWriteInListItemView.A03;
            editText.getClass();
            editText.requestFocus();
        }
    }

    public static void A02(View view, UB6 ub6, boolean z) {
        ViewParent parent = view.getParent();
        if (z) {
            parent.getClass();
            ub6.A05 = ((UCs) parent).A00.A01;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object item = getItem(i);
        item.getClass();
        return ((C70077W1u) item).A00.ordinal();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0010. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19, types: [android.view.View] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        VDB vdb;
        TextView textView;
        String str;
        String str2;
        int i2;
        UCs uCs;
        View.OnClickListener onClickListener;
        int i3;
        int i4;
        int i5;
        VDB vdb2;
        UCs uCs2;
        switch (getItemViewType(i)) {
            case 0:
                vdb = VDB.QUESTION;
                break;
            case 1:
                vdb = VDB.RADIO;
                break;
            case 2:
                vdb = VDB.CHECKBOX;
                break;
            case 3:
                vdb = VDB.EDITTEXT;
                break;
            case 4:
                vdb = VDB.MESSAGE;
                break;
            case 5:
                vdb = VDB.IMAGEBLOCK;
                break;
            case 6:
                vdb = VDB.DIVIDER;
                break;
            case 7:
            default:
                vdb = VDB.WHITESPACE;
                break;
            case 8:
                vdb = VDB.RADIOWRITEIN;
                break;
            case 9:
                vdb = VDB.CHECKBOXWRITEIN;
                break;
            case 10:
                vdb = VDB.NOTIFICATION;
                break;
        }
        VDB vdb3 = vdb;
        if (view == null) {
            switch (vdb) {
                case QUESTION:
                    view = (SurveyQuestionListItemView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.survey_question_view_wrapper);
                    vdb2 = VDB.QUESTION;
                    view.setTag(vdb2);
                    break;
                case RADIO:
                    UCs uCs3 = (SurveyRadioListItemView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.survey_radio_view_wrapper);
                    vdb = VDB.RADIO;
                    uCs = uCs3;
                    uCs.setTag(vdb);
                    view = uCs;
                    onClickListener = this.A06;
                    uCs2 = uCs;
                    C0fQ.A00(onClickListener, uCs2);
                    break;
                case CHECKBOX:
                    UCs uCs4 = (SurveyCheckboxListItemView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.survey_checkbox_view_wrapper);
                    vdb = VDB.CHECKBOX;
                    uCs = uCs4;
                    uCs.setTag(vdb);
                    view = uCs;
                    onClickListener = this.A06;
                    uCs2 = uCs;
                    C0fQ.A00(onClickListener, uCs2);
                    break;
                case EDITTEXT:
                    view = (SurveyEditTextListItemView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.survey_editext_view_wrapper);
                    vdb2 = VDB.EDITTEXT;
                    view.setTag(vdb2);
                    break;
                case MESSAGE:
                    view = (SurveyMessageListItemView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.survey_message_view_wrapper);
                    vdb2 = VDB.MESSAGE;
                    view.setTag(vdb2);
                    break;
                case IMAGEBLOCK:
                    view = (SurveyImageBlockListItemView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.survey_imageblock_view_wrapper);
                    view.setTag(VDB.IMAGEBLOCK);
                    ?? requireViewById = view.requireViewById(R.id.survey_imageblock_button);
                    onClickListener = this.A01;
                    uCs2 = requireViewById;
                    C0fQ.A00(onClickListener, uCs2);
                    break;
                case DIVIDER:
                    view = (SurveyDividerListItemView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.survey_divider_view_wrapper);
                    vdb2 = VDB.DIVIDER;
                    view.setTag(vdb2);
                    break;
                case WHITESPACE:
                    view = (SurveySpaceListItemView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.survey_space_view_wrapper);
                    vdb2 = VDB.WHITESPACE;
                    view.setTag(vdb2);
                    break;
                case RADIOWRITEIN:
                case CHECKBOXWRITEIN:
                    SurveyWriteInListItemView surveyWriteInListItemView = (SurveyWriteInListItemView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.survey_write_in_view_wrapper);
                    surveyWriteInListItemView.A05 = vdb;
                    if (vdb == VDB.CHECKBOXWRITEIN) {
                        i3 = R.layout.survey_checkbox_write_in_view;
                        i4 = R.id.survey_checkbox;
                        i5 = R.id.survey_checkbox_text;
                    } else if (vdb == VDB.RADIOWRITEIN) {
                        i3 = R.layout.survey_radio_write_in_view;
                        i4 = R.id.survey_radio_button;
                        i5 = R.id.survey_radio_text;
                    } else {
                        throw new RuntimeException("Either CHECKBOXWRITEIN or RADIOWRITEIN type is allowed");
                    }
                    surveyWriteInListItemView.setContentView(i3);
                    surveyWriteInListItemView.A02 = (Checkable) surveyWriteInListItemView.findViewById(i4);
                    surveyWriteInListItemView.A04 = (TextView) surveyWriteInListItemView.findViewById(i5);
                    surveyWriteInListItemView.A03 = (EditText) surveyWriteInListItemView.findViewById(R.id.survey_edittext_write_in_edit);
                    surveyWriteInListItemView.A01 = surveyWriteInListItemView.findViewById(R.id.bottom_row_divider);
                    uCs = surveyWriteInListItemView;
                    uCs.setTag(vdb);
                    view = uCs;
                    onClickListener = this.A06;
                    uCs2 = uCs;
                    C0fQ.A00(onClickListener, uCs2);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append(vdb);
                    C0w9.A03("SurveyListAdapter", AbstractC166997dE.A0x(" not found", sb));
                    break;
            }
        }
        C70077W1u c70077W1u = (C70077W1u) getItem(i);
        UCs uCs5 = (UCs) view;
        if (uCs5 != null && c70077W1u != null) {
            if (uCs5 instanceof SurveyWriteInListItemView) {
                SurveyWriteInListItemView surveyWriteInListItemView2 = (SurveyWriteInListItemView) uCs5;
                ((UCs) surveyWriteInListItemView2).A00 = c70077W1u;
                VAX vax = (VAX) c70077W1u;
                EditText editText = surveyWriteInListItemView2.A03;
                editText.getClass();
                VJX vjx = vax.A02.A00;
                if (vjx == null) {
                    str2 = null;
                } else {
                    str2 = vjx.A02;
                }
                editText.setText(str2);
                TextView textView2 = surveyWriteInListItemView2.A04;
                textView2.getClass();
                textView2.setText(vax.A00.A01);
                VDB vdb4 = surveyWriteInListItemView2.A05;
                if (vdb4 == VDB.CHECKBOXWRITEIN) {
                    i2 = 17;
                } else {
                    if (vdb4 == VDB.RADIOWRITEIN) {
                        i2 = 18;
                    }
                    editText.setOnFocusChangeListener(new WNZ(2, editText, surveyWriteInListItemView2));
                }
                editText.setOnClickListener(new WNS(surveyWriteInListItemView2, i2));
                editText.setOnFocusChangeListener(new WNZ(2, editText, surveyWriteInListItemView2));
            } else {
                if (uCs5 instanceof SurveyRadioListItemView) {
                    SurveyRadioListItemView surveyRadioListItemView = (SurveyRadioListItemView) uCs5;
                    ((UCs) surveyRadioListItemView).A00 = c70077W1u;
                    textView = surveyRadioListItemView.A00;
                    str = ((VAV) c70077W1u).A00.A01;
                } else if (uCs5 instanceof SurveyQuestionListItemView) {
                    SurveyQuestionListItemView surveyQuestionListItemView = (SurveyQuestionListItemView) uCs5;
                    VAS vas = (VAS) c70077W1u;
                    String str3 = vas.A01;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    TextView textView3 = surveyQuestionListItemView.A00;
                    if (isEmpty) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setText(str3);
                    }
                    textView = surveyQuestionListItemView.A01;
                    str = vas.A00;
                } else if (uCs5 instanceof SurveyMessageListItemView) {
                    textView = ((SurveyMessageListItemView) uCs5).A00;
                    str = ((VAQ) c70077W1u).A00;
                } else if (uCs5 instanceof SurveyImageBlockListItemView) {
                    SurveyImageBlockListItemView surveyImageBlockListItemView = (SurveyImageBlockListItemView) uCs5;
                    VAR var = (VAR) c70077W1u;
                    surveyImageBlockListItemView.A01.setText(var.A01);
                    textView = surveyImageBlockListItemView.A00;
                    str = var.A00;
                } else if (uCs5 instanceof SurveyEditTextListItemView) {
                    SurveyEditTextListItemView surveyEditTextListItemView = (SurveyEditTextListItemView) uCs5;
                    ((UCs) surveyEditTextListItemView).A00 = c70077W1u;
                    textView = surveyEditTextListItemView.A00;
                    textView.setHint(2131974785);
                    VJX vjx2 = ((VAW) ((UCs) surveyEditTextListItemView).A00).A00;
                    if (vjx2 == null) {
                        str = null;
                    } else {
                        str = vjx2.A02;
                    }
                } else if (uCs5 instanceof SurveyCheckboxListItemView) {
                    SurveyCheckboxListItemView surveyCheckboxListItemView = (SurveyCheckboxListItemView) uCs5;
                    ((UCs) surveyCheckboxListItemView).A00 = c70077W1u;
                    textView = surveyCheckboxListItemView.A00;
                    str = ((VAU) c70077W1u).A00.A01;
                }
                textView.setText(str);
            }
        }
        if (vdb3 == VDB.CHECKBOX) {
            c70077W1u.getClass();
            ((SurveyCheckboxListItemView) view).setChecked(((VAU) c70077W1u).A01);
        }
        if (vdb3 == VDB.RADIO) {
            c70077W1u.getClass();
            ((SurveyRadioListItemView) view).setChecked(((VAV) c70077W1u).A01);
        }
        VDB vdb5 = VDB.CHECKBOXWRITEIN;
        if (vdb3 == vdb5 || vdb3 == VDB.RADIOWRITEIN) {
            SurveyWriteInListItemView surveyWriteInListItemView3 = (SurveyWriteInListItemView) view;
            c70077W1u.getClass();
            VAX vax2 = (VAX) c70077W1u;
            if (vdb3 == vdb5) {
                A00(this.A07, vax2, surveyWriteInListItemView3);
            } else {
                A00(this.A09, vax2, surveyWriteInListItemView3);
            }
            WKW wkw = new WKW(1, this, vax2, surveyWriteInListItemView3);
            EditText editText2 = surveyWriteInListItemView3.A03;
            editText2.getClass();
            editText2.addTextChangedListener(wkw);
        }
        if (vdb3 == VDB.EDITTEXT) {
            SurveyEditTextListItemView surveyEditTextListItemView2 = (SurveyEditTextListItemView) view;
            surveyEditTextListItemView2.setItemOnFocusChangeListener(this.A08);
            WKW wkw2 = new WKW(2, this, c70077W1u, surveyEditTextListItemView2);
            EditText editText3 = surveyEditTextListItemView2.A00;
            editText3.addTextChangedListener(wkw2);
            if (((UCs) surveyEditTextListItemView2).A00.A01.equals(this.A05)) {
                editText3.requestFocus();
                AbstractC167017dG.A18(editText3);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return VDB.values().length;
    }
}
