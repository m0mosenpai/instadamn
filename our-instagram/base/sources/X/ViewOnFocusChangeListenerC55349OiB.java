package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.OiB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnFocusChangeListenerC55349OiB implements TextWatcher, View.OnFocusChangeListener {
    public Drawable A00;
    public Drawable A01;
    public Drawable A02;
    public InterfaceC57949Pmv A03;
    public String A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final TextView A09;
    public final C54543O7v A0A;
    public final View.AccessibilityDelegate A0B;
    public final View A0C;
    public final EditText A0D;
    public final TextView A0E;
    public final C57012jc A0F;
    public final IgFormField A0G;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        A00(false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013b, code lost:
    
        if (r9.equals("valid") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if ((!r14.A05) == false) goto L8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0064. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(boolean r15) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC55349OiB.A00(boolean):void");
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        A00(!z);
    }

    public ViewOnFocusChangeListenerC55349OiB(View view, C57012jc c57012jc, IgFormField igFormField) {
        this.A0G = igFormField;
        this.A0F = c57012jc;
        this.A0C = view;
        TextView topLabel = igFormField.getTopLabel();
        this.A09 = topLabel;
        this.A0E = igFormField.getInlineLabel();
        this.A0D = igFormField.getMEditText();
        Context context = topLabel.getContext();
        this.A06 = context.getColor(AbstractC53242c7.A03(context));
        this.A07 = AbstractC167007dF.A09(context, R.attr.igds_color_success);
        this.A08 = context.getColor(AbstractC53242c7.A0B(context));
        C54543O7v c54543O7v = new C54543O7v();
        c54543O7v.A01 = "valid";
        this.A0A = c54543O7v;
        this.A0B = new C50691MZj(this, 1);
    }
}
