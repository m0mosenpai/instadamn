package com.instagram.ui.widget.typeaheadpill;

import X.AbstractC13670mt;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC58317Pt9;
import X.C14360o3;
import X.GYY;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;
import com.instagram.ui.widget.typeaheadpill.TypeaheadPill;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class TypeaheadPill extends FrameLayout {
    public GYY A00;
    public String A01;
    public String A02;
    public final TextView A03;
    public final SearchWithDeleteEditText A04;
    public final TextWatcher A05;
    public final ForegroundColorSpan A06;
    public final ForegroundColorSpan A07;
    public final View.OnClickListener A08;
    public final TextView.OnEditorActionListener A09;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeaheadPill(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public static final void A00(Editable editable, TypeaheadPill typeaheadPill) {
        int i;
        int length;
        int i2;
        String str = typeaheadPill.A01;
        Pattern pattern = AbstractC13670mt.A00;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        String str2 = typeaheadPill.A02;
        if (str2 != null && (length = str2.length()) != 0 && i > 0 && i <= length) {
            String substring = str2.substring(0, i);
            C14360o3.A07(substring);
            String str3 = typeaheadPill.A01;
            if (str3 != null && str3.equalsIgnoreCase(substring)) {
                SpannableString spannableString = new SpannableString(typeaheadPill.A02);
                spannableString.setSpan(typeaheadPill.A06, 0, i, 33);
                ForegroundColorSpan foregroundColorSpan = typeaheadPill.A07;
                String str4 = typeaheadPill.A02;
                if (str4 != null) {
                    i2 = str4.length();
                } else {
                    i2 = 0;
                }
                spannableString.setSpan(foregroundColorSpan, i, i2, 33);
                TextView textView = typeaheadPill.A03;
                textView.setText(spannableString);
                textView.setVisibility(0);
                SearchWithDeleteEditText searchWithDeleteEditText = typeaheadPill.A04;
                searchWithDeleteEditText.setTextColor(0);
                if (!typeaheadPill.A01.equals(substring)) {
                    typeaheadPill.A01 = substring;
                    if (editable.length() > 0) {
                        TextWatcher textWatcher = typeaheadPill.A05;
                        searchWithDeleteEditText.removeTextChangedListener(textWatcher);
                        editable.replace(0, editable.length(), substring, 0, i);
                        searchWithDeleteEditText.addTextChangedListener(textWatcher);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        typeaheadPill.A01();
    }

    public final boolean A02(String str) {
        int length;
        int length2;
        String str2 = this.A01;
        if (str2 != null && (length = str2.length()) != 0 && str != null && (length2 = str.length()) != 0) {
            Pattern pattern = AbstractC13670mt.A00;
            if (length <= length2) {
                String substring = str.substring(0, length);
                C14360o3.A07(substring);
                if (str2.equalsIgnoreCase(substring)) {
                    this.A02 = str;
                    Editable editableText = this.A04.getEditableText();
                    C14360o3.A07(editableText);
                    A00(editableText, this);
                    return true;
                }
            }
        }
        return false;
    }

    public final SearchWithDeleteEditText getSearchEditText() {
        return this.A04;
    }

    public final void A01() {
        Context context = getContext();
        C14360o3.A07(context);
        this.A04.setTextColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)));
        this.A03.setVisibility(8);
        this.A02 = null;
    }

    public final void setDelegate(GYY gyy) {
        this.A00 = gyy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeaheadPill(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = "";
        TextWatcher textWatcher = new TextWatcher() { // from class: X.5s2
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C14360o3.A0B(editable, 0);
                TypeaheadPill typeaheadPill = TypeaheadPill.this;
                if (!AbstractC002300n.A0g(typeaheadPill.A01, editable.toString(), true)) {
                    String obj = editable.toString();
                    typeaheadPill.A01 = obj;
                    GYY gyy = typeaheadPill.A00;
                    if (gyy != null) {
                        C14360o3.A0B(obj, 0);
                        ((C35151Fet) ((GI9) gyy).A00.A06.A01).A05.DjT(obj, true);
                    }
                }
                TypeaheadPill.A00(editable, typeaheadPill);
                String str = typeaheadPill.A01;
                if (str == null || str.length() == 0) {
                    typeaheadPill.A01();
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.A05 = textWatcher;
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: X.5s3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                TypeaheadPill typeaheadPill = TypeaheadPill.this;
                String str = typeaheadPill.A02;
                if (str == null || str.length() <= 0) {
                    return false;
                }
                GYY gyy = typeaheadPill.A00;
                if (gyy != null) {
                    gyy.Dqz(str);
                }
                return true;
            }
        };
        this.A09 = onEditorActionListener;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.5s4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GYY gyy;
                int A05 = C0f9.A05(-1504685810);
                TypeaheadPill typeaheadPill = TypeaheadPill.this;
                String str = typeaheadPill.A02;
                if (str != null && str.length() > 0 && (gyy = typeaheadPill.A00) != null) {
                    gyy.Dqz(str);
                }
                C0f9.A0C(2134796643, A05);
            }
        };
        this.A08 = onClickListener;
        Object systemService = context.getSystemService(AbstractC58317Pt9.A00(44));
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(R.layout.typeahead_pill, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A2Q, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        Context context2 = getContext();
        this.A06 = new ForegroundColorSpan(context2.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)));
        this.A07 = new ForegroundColorSpan(context2.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text)));
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        TextView textView = (TextView) requireViewById(R.id.search_text_typeahead);
        this.A03 = textView;
        SearchWithDeleteEditText searchWithDeleteEditText = (SearchWithDeleteEditText) requireViewById(R.id.search_edit_text);
        this.A04 = searchWithDeleteEditText;
        textView.setVisibility(8);
        textView.setOnClickListener(onClickListener);
        textView.setHeight((int) dimension);
        searchWithDeleteEditText.setClearButtonEnabled(false);
        searchWithDeleteEditText.addTextChangedListener(textWatcher);
        searchWithDeleteEditText.setOnEditorActionListener(onEditorActionListener);
        searchWithDeleteEditText.setImeOptions(2);
    }
}
