package com.instagram.ui.widget.textview;

import X.AbstractC09440dt;
import X.AbstractC31265Don;
import X.C06090Tz;
import X.C14360o3;
import X.C159737El;
import X.C160007Fm;
import X.C18U;
import X.C47629L1o;
import X.C7GB;
import X.C7GC;
import X.C7ON;
import X.C7OQ;
import X.C7OR;
import X.C7OS;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC159557Dq;
import X.M4N;
import X.YN6;
import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ComposerAutoCompleteTextView extends IgAutoCompleteTextView {
    public C7GC A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public YN6 A04;
    public final Set A05;
    public final InterfaceC09390do A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerAutoCompleteTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A06 = AbstractC09440dt.A00(EnumC09460dv.A04, C7OS.A00);
        this.A05 = new HashSet();
    }

    public final void A03(CharSequence charSequence) {
        this.A08 = false;
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((C7ON) it.next()).A02 = true;
        }
        if (charSequence != null && charSequence.length() != 0) {
            C7OR.A00(this, super.A05, charSequence, this.A02);
        }
        this.A08 = true;
    }

    public final void A04(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        this.A08 = false;
        if (this.A01) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                ((C7ON) it.next()).A02 = true;
            }
            boolean z = this.A02;
            if (charSequence.length() != 0) {
                super.A06 = getCurrentTagOrUserName();
                C7OR.A01(this, super.A05, charSequence, true, z);
            }
        }
        this.A08 = true;
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        C14360o3.A0B(textWatcher, 0);
        super.addTextChangedListener(textWatcher);
        if (textWatcher instanceof C7ON) {
            this.A05.add(textWatcher);
        }
    }

    @Override // com.instagram.ui.widget.textview.IgAutoCompleteTextView, com.instagram.common.ui.base.IgSimpleAutoCompleteTextView, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C14360o3.A0B(editorInfo, 0);
        boolean z = this.A03;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (!z) {
            int i = editorInfo.imeOptions;
            int i2 = i & 255;
            if ((i2 & 4) != 0) {
                int i3 = i2 ^ i;
                editorInfo.imeOptions = i3;
                i = i3 | 4;
                editorInfo.imeOptions = i;
            }
            if ((1073741824 & i) != 0) {
                editorInfo.imeOptions = i & (-1073741825);
            }
        }
        return onCreateInputConnection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r1 == false) goto L17;
     */
    @Override // com.instagram.ui.widget.textview.IgAutoCompleteTextView, android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyPreIme(int r6, android.view.KeyEvent r7) {
        /*
            r5 = this;
            r4 = 1
            X.C14360o3.A0B(r7, r4)
            r3 = 0
            r0 = 4
            if (r6 != r0) goto L3e
            int r0 = r7.getAction()
            if (r0 != r4) goto L3e
            java.util.ArrayList r0 = r5.getBackPressListeners()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L3e
            java.util.ArrayList r0 = r5.getBackPressListeners()
            java.util.Iterator r2 = r0.iterator()
            X.C14360o3.A07(r2)
            r1 = 0
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r2.next()
            X.7Dq r0 = (X.InterfaceC159557Dq) r0
            if (r0 == 0) goto L26
            boolean r0 = r0.onBackPressed()
            if (r0 != r4) goto L26
            r1 = 1
            goto L26
        L3c:
            if (r1 != 0) goto L44
        L3e:
            boolean r0 = super.onKeyPreIme(r6, r7)
            if (r0 == 0) goto L45
        L44:
            r3 = 1
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.textview.ComposerAutoCompleteTextView.onKeyPreIme(int, android.view.KeyEvent):boolean");
    }

    private final ArrayList getBackPressListeners() {
        return (ArrayList) this.A06.getValue();
    }

    @Override // com.instagram.ui.widget.textview.IgAutoCompleteTextView, android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        C7OQ c7oq = super.A05;
        if (c7oq == null) {
            c7oq = C7OQ.A05;
        }
        return C7OR.A04(this, c7oq, super.A02, this.A02);
    }

    @Override // com.instagram.ui.widget.textview.IgAutoCompleteTextView
    public String getCurrentTagOrUserName() {
        return C7OR.A03(this, super.A05, this.A02);
    }

    public final boolean getShouldDelayReplaceTextToClickHandling() {
        return this.A01;
    }

    public final boolean getShouldEnableMetaAIAutoPopupParsing() {
        return this.A02;
    }

    @Override // com.instagram.ui.widget.textview.IgAutoCompleteTextView, android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
        if (!this.A01) {
            A03(charSequence);
        }
    }

    public final CharSequence A00(Object obj) {
        CharSequence convertSelectionToString = convertSelectionToString(obj);
        if (convertSelectionToString == null) {
            return "";
        }
        return convertSelectionToString;
    }

    public final void A01(InterfaceC159557Dq interfaceC159557Dq) {
        getBackPressListeners().add(interfaceC159557Dq);
    }

    public final void A02(InterfaceC159557Dq interfaceC159557Dq) {
        getBackPressListeners().remove(interfaceC159557Dq);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C7GC c7gc;
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322 && (c7gc = this.A00) != null) {
            C7GB c7gb = (C7GB) c7gc;
            C159737El c159737El = c7gb.A01;
            FragmentActivity fragmentActivity = c7gb.A00;
            String trim = c159737El.A0b.A0Y.A00.trim();
            StringBuilder sb = new StringBuilder(64);
            AbstractC31265Don.A00();
            sb.append(fragmentActivity.getString(2131960572));
            String obj = sb.toString();
            if (trim.indexOf(obj) != -1) {
                if (C18U.A06(C06090Tz.A05, c159737El.A1Z, 36330711745053666L)) {
                    C160007Fm c160007Fm = c159737El.A0b;
                    c160007Fm.A0E = true;
                    C7ON c7on = c160007Fm.A0B;
                    if (c7on != null) {
                        c7on.A03 = true;
                    }
                    C47629L1o c47629L1o = new C47629L1o(c159737El, trim, obj);
                    c160007Fm.A0Y.A00 = "";
                    c160007Fm.A0S.post(new M4N(c47629L1o, c160007Fm));
                }
            }
        }
        return onTextContextMenuItem;
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        if (textWatcher instanceof C7ON) {
            this.A05.remove(textWatcher);
        }
    }

    public final void setSelectionListener(YN6 yn6) {
        this.A04 = yn6;
    }

    public final void setShouldDelayReplaceTextToClickHandling(boolean z) {
        this.A01 = z;
    }

    public final void setShouldEnableMetaAIAutoPopupParsing(boolean z) {
        this.A02 = z;
    }

    public final void setShowNewLineButtonInKeyboard(boolean z) {
        this.A03 = z;
    }

    public final void setTextPasteListener(C7GC c7gc) {
        this.A00 = c7gc;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        this.A06 = AbstractC09440dt.A00(EnumC09460dv.A04, C7OS.A00);
        this.A05 = new HashSet();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        this.A06 = AbstractC09440dt.A00(EnumC09460dv.A04, C7OS.A00);
        this.A05 = new HashSet();
    }
}
