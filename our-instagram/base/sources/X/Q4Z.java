package X;

import android.graphics.Matrix;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q4Z extends ViewStructure {
    public int A01;
    public ViewStructure.HtmlInfo A03;
    public AutofillValue A04;
    public CharSequence A05;
    public String A06;
    public boolean A07;
    public CharSequence[] A08;
    public String[] A09;
    public int A00 = -1;
    public final List A0A = AbstractC166987dD.A1E();
    public int A02 = 0;

    @Override // android.view.ViewStructure
    public final int addChildCount(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Q4Z q4z = new Q4Z();
            q4z.A06 = this.A06;
            this.A0A.add(q4z);
        }
        return this.A0A.size();
    }

    @Override // android.view.ViewStructure
    public final void asyncCommit() {
    }

    @Override // android.view.ViewStructure
    public final AutofillId getAutofillId() {
        return null;
    }

    @Override // android.view.ViewStructure
    public final Bundle getExtras() {
        return null;
    }

    @Override // android.view.ViewStructure
    public final CharSequence getText() {
        return null;
    }

    @Override // android.view.ViewStructure
    public final int getTextSelectionEnd() {
        return 0;
    }

    @Override // android.view.ViewStructure
    public final int getTextSelectionStart() {
        return 0;
    }

    @Override // android.view.ViewStructure
    public final boolean hasExtras() {
        return false;
    }

    @Override // android.view.ViewStructure
    public final void setAccessibilityFocused(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setActivated(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setAlpha(float f) {
    }

    @Override // android.view.ViewStructure
    public final void setAutofillId(AutofillId autofillId) {
    }

    @Override // android.view.ViewStructure
    public final void setCheckable(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setChecked(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setChildCount(int i) {
    }

    @Override // android.view.ViewStructure
    public final void setClassName(String str) {
    }

    @Override // android.view.ViewStructure
    public final void setClickable(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setContentDescription(CharSequence charSequence) {
    }

    @Override // android.view.ViewStructure
    public final void setContextClickable(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setDataIsSensitive(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setElevation(float f) {
    }

    @Override // android.view.ViewStructure
    public final void setEnabled(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setFocusable(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setId(int i, String str, String str2, String str3) {
    }

    @Override // android.view.ViewStructure
    public final void setInputType(int i) {
    }

    @Override // android.view.ViewStructure
    public final void setLocaleList(LocaleList localeList) {
    }

    @Override // android.view.ViewStructure
    public final void setLongClickable(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setOpaque(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setSelected(boolean z) {
    }

    @Override // android.view.ViewStructure
    public final void setText(CharSequence charSequence) {
    }

    @Override // android.view.ViewStructure
    public final void setText(CharSequence charSequence, int i, int i2) {
    }

    @Override // android.view.ViewStructure
    public final void setTextLines(int[] iArr, int[] iArr2) {
    }

    @Override // android.view.ViewStructure
    public final void setTextStyle(float f, int i, int i2, int i3) {
    }

    @Override // android.view.ViewStructure
    public final void setTransformation(Matrix matrix) {
    }

    @Override // android.view.ViewStructure
    public final ViewStructure asyncNewChild(int i) {
        Q4Z q4z = new Q4Z();
        q4z.A06 = this.A06;
        return q4z;
    }

    @Override // android.view.ViewStructure
    public final int getChildCount() {
        return this.A0A.size();
    }

    @Override // android.view.ViewStructure
    public final CharSequence getHint() {
        return this.A05;
    }

    @Override // android.view.ViewStructure
    public final ViewStructure newChild(int i) {
        Q4Z q4z = new Q4Z();
        q4z.A06 = this.A06;
        this.A0A.add(i, q4z);
        return q4z;
    }

    @Override // android.view.ViewStructure
    public final ViewStructure.HtmlInfo.Builder newHtmlInfoBuilder(String str) {
        return new Q4X();
    }

    @Override // android.view.ViewStructure
    public final void setAutofillHints(String[] strArr) {
        this.A09 = strArr;
    }

    @Override // android.view.ViewStructure
    public final void setAutofillOptions(CharSequence[] charSequenceArr) {
        this.A08 = charSequenceArr;
    }

    @Override // android.view.ViewStructure
    public final void setAutofillType(int i) {
        this.A00 = i;
    }

    @Override // android.view.ViewStructure
    public final void setAutofillValue(AutofillValue autofillValue) {
        this.A04 = autofillValue;
    }

    @Override // android.view.ViewStructure
    public final void setFocused(boolean z) {
        this.A07 = z;
    }

    @Override // android.view.ViewStructure
    public final void setHint(CharSequence charSequence) {
        this.A05 = charSequence;
    }

    @Override // android.view.ViewStructure
    public final void setHtmlInfo(ViewStructure.HtmlInfo htmlInfo) {
        this.A03 = htmlInfo;
    }

    @Override // android.view.ViewStructure
    public final void setVisibility(int i) {
        this.A02 = i;
    }

    @Override // android.view.ViewStructure
    public final void setWebDomain(String str) {
        this.A06 = str;
    }

    @Override // android.view.ViewStructure
    public final void setAutofillId(AutofillId autofillId, int i) {
        this.A01 = i;
    }

    @Override // android.view.ViewStructure
    public final void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
    }
}
