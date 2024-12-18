package com.instagram.ui.widget.textview;

import X.C05L;
import X.C0f9;
import X.C13680mu;
import X.C14360o3;
import X.C7GH;
import X.C7OQ;
import X.C7OR;
import X.C9Ol;
import X.InterfaceC162147Ny;
import X.InterfaceC60072op;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleAutoCompleteTextView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class IgAutoCompleteTextView extends IgSimpleAutoCompleteTextView {
    public float A00;
    public int A01;
    public int A02;
    public InterfaceC60072op A03;
    public InterfaceC162147Ny A04;
    public C7OQ A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public C7GH A0A;
    public String[] A0B;
    public final List A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgAutoCompleteTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A05 = C7OQ.A05;
        this.A02 = 2;
        this.A0C = new ArrayList();
        this.A08 = true;
        A00();
    }

    @Override // com.instagram.common.ui.base.IgSimpleAutoCompleteTextView, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C14360o3.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        String[] strArr = this.A0B;
        C7GH c7gh = this.A0A;
        if (onCreateInputConnection != null && c7gh != null && strArr != null && strArr.length > 0) {
            editorInfo.contentMimeTypes = strArr;
            return new C05L(onCreateInputConnection, new C9Ol(c7gh));
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            Editable text = getText();
            C14360o3.A07(text);
            if (!C13680mu.A06(this, text)) {
                throw e;
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        InterfaceC60072op interfaceC60072op;
        C14360o3.A0B(keyEvent, 1);
        if (i == 4 && (interfaceC60072op = this.A03) != null && interfaceC60072op.onBackPressed()) {
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void setSupportedLinks(C7OQ c7oq) {
        C14360o3.A0B(c7oq, 0);
        this.A05 = c7oq;
    }

    private final void A00() {
        String str = Build.MODEL;
        if (str == null || !str.equalsIgnoreCase("DROID3")) {
            if (str == null || !str.equalsIgnoreCase("DROID4")) {
                if (str != null && str.equalsIgnoreCase("DROID BIONIC")) {
                    return;
                }
                this.A00 = 0.0f;
                this.A01 = getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
                setRawInputType(getInputType() & (-65537));
                setImeOptions(33554432 | getImeOptions());
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        C7OQ c7oq = this.A05;
        if (c7oq == null) {
            c7oq = C7OQ.A05;
        }
        return C7OR.A04(this, c7oq, this.A02, false);
    }

    public String getCurrentTagOrUserName() {
        return C7OR.A03(this, this.A05, false);
    }

    public final int getDropDownItemHeight() {
        return this.A01;
    }

    public final List getMentionInsertedListeners() {
        return this.A0C;
    }

    public final int getMinNumToFilter() {
        return this.A02;
    }

    public final String getMostRecentlyReplacedUserOrHashtagString() {
        return this.A06;
    }

    public final C7OQ getSupportedLinks() {
        return this.A05;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.Filter.FilterListener
    public final void onFilterComplete(int i) {
        int i2;
        super.onFilterComplete(Math.max(i, this.A07 ? 1 : 0));
        if (this.A00 > 0.0f) {
            float count = getAdapter().getCount();
            float f = this.A00;
            if (count <= f) {
                i2 = -2;
            } else {
                i2 = (int) (f * this.A01);
            }
            setDropDownHeight(i2);
        }
        if (this.A07) {
            i = Math.max(i, 1);
        }
        if (!this.A09 && i > 0) {
            this.A09 = true;
            InterfaceC162147Ny interfaceC162147Ny = this.A04;
            if (interfaceC162147Ny != null) {
                interfaceC162147Ny.DCb();
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performFiltering(CharSequence charSequence, int i) {
        if (this.A08) {
            super.performFiltering(getCurrentTagOrUserName(), i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void replaceText(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            this.A06 = getCurrentTagOrUserName();
            C7OR.A00(this, this.A05, charSequence, false);
        }
    }

    public final void setInputContentInfoListener(String[] strArr, C7GH c7gh) {
        this.A0B = strArr;
        this.A0A = c7gh;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        super.dismissDropDown();
        this.A09 = false;
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-827513420);
        this.A04 = null;
        super.onDetachedFromWindow();
        C0f9.A0D(-239219572, A06);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = C0f9.A06(1170619059);
        super.onFocusChanged(z, i, rect);
        if (this.A07 && z && enoughToFilter() && getWindowVisibility() == 0) {
            showDropDown();
        }
        C0f9.A0D(-1284095498, A06);
    }

    public final void setAlwaysShowWhenEnoughToFilter(boolean z) {
        this.A07 = z;
    }

    public final void setBackHandler(InterfaceC60072op interfaceC60072op) {
        this.A03 = interfaceC60072op;
    }

    public final void setDropDownCustomHeight(int i) {
        setDropDownHeight(i);
    }

    public final void setDropdownDisplayedListener(InterfaceC162147Ny interfaceC162147Ny) {
        this.A04 = interfaceC162147Ny;
    }

    public final void setEnableFiltering(boolean z) {
        this.A08 = z;
    }

    public final void setMinNumToFilter(int i) {
        this.A02 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A05 = C7OQ.A05;
        this.A02 = 2;
        this.A0C = new ArrayList();
        this.A08 = true;
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A05 = C7OQ.A05;
        this.A02 = 2;
        this.A0C = new ArrayList();
        this.A08 = true;
        A00();
    }
}
