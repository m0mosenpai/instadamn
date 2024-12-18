package com.facebook.primitive.textinput;

import X.AbstractC010103p;
import X.C05L;
import X.C14360o3;
import X.C14560oU;
import X.C63596Sq3;
import X.InterfaceC57795PkN;
import X.InterfaceC65211Tfz;
import X.Tg0;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class TextInputView extends EditText implements Tg0 {
    public InterfaceC65211Tfz A00;
    public InterfaceC57795PkN A01;
    public String[] A02;
    public boolean A03;

    public /* synthetic */ TextInputView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        super(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArr;
        C14360o3.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        InterfaceC65211Tfz interfaceC65211Tfz = this.A00;
        if (onCreateInputConnection == null || interfaceC65211Tfz == null || ((strArr = this.A02) != null && strArr.length == 0)) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArr;
        C05L c05l = new C05L(onCreateInputConnection, new C14560oU(this));
        AbstractC010103p.A0C(this, new C63596Sq3(interfaceC65211Tfz), this.A02);
        return c05l;
    }

    public final boolean A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return isSingleLine();
        }
        return this.A03;
    }

    public final InterfaceC57795PkN getSelectionChangedListener$fbandroid_libraries_rendercore_rendercore_primitive_components_textinput_textinput() {
        return null;
    }

    public void setAllowedContentTypes(String[] strArr) {
        this.A02 = strArr;
    }

    public void setContentCommittedListener(InterfaceC65211Tfz interfaceC65211Tfz) {
        this.A00 = interfaceC65211Tfz;
    }

    @Override // android.widget.EditText
    public final void setSelection(int i, int i2) {
        int length = length();
        if (i > length) {
            i = length;
        }
        int length2 = length();
        if (i2 > length2) {
            i2 = length2;
        }
        super.setSelection(i, i2);
    }

    public final void setSelectionChangedListener$fbandroid_libraries_rendercore_rendercore_primitive_components_textinput_textinput(InterfaceC57795PkN interfaceC57795PkN) {
        this.A01 = interfaceC57795PkN;
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
        this.A03 = z;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    public TextInputView(Context context) {
        super(context, null);
    }

    @Override // android.widget.EditText
    public void setSelection(int i) {
        int length = length();
        if (i > length) {
            i = length;
        }
        super.setSelection(i);
    }

    public TextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
