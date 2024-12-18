package com.instagram.ui.text;

import X.AbstractC13880nE;
import X.C05L;
import X.C0f9;
import X.C14360o3;
import X.C17000ss;
import X.C2UX;
import X.C7GH;
import X.C9Ol;
import X.InterfaceC190628cK;
import X.InterfaceC60152ox;
import X.InterfaceC693339t;
import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.instagram.ui.text.ConstrainedEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ConstrainedEditText extends EditText implements InterfaceC60152ox {
    public int A00;
    public int A01;
    public boolean A02;
    public float A03;
    public int A04;
    public boolean A05;
    public String[] A06;
    public final List A07;

    public ConstrainedEditText(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C14360o3.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C2UX.A00().AMO(editorInfo, onCreateInputConnection, this);
        String[] strArr = this.A06;
        if (strArr != null && strArr.length != 0 && onCreateInputConnection != null) {
            C7GH c7gh = new C7GH() { // from class: X.9Pi
                @Override // X.C7GH
                public final boolean DdB(C05R c05r) {
                    Iterator it = ConstrainedEditText.this.A07.iterator();
                    while (true) {
                        boolean z = false;
                        while (it.hasNext()) {
                            if (((InterfaceC190628cK) it.next()).DdB(c05r) || z) {
                                z = true;
                            }
                        }
                        return z;
                    }
                }
            };
            editorInfo.contentMimeTypes = strArr;
            return new C05L(onCreateInputConnection, new C9Ol(c7gh));
        }
        return onCreateInputConnection;
    }

    public final void setSupportedContentMimeTypes(String... strArr) {
        C14360o3.A0B(strArr, 0);
        this.A06 = (String[]) new ArrayList(new C17000ss(strArr, false)).toArray(new String[0]);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (i > 0) {
            Editable text = getText();
            if (text != null && text.length() != 0) {
                setSelection(getText().length());
            }
        } else if (i < this.A04) {
            clearFocus();
            Iterator it = this.A07.iterator();
            while (it.hasNext()) {
                ((InterfaceC190628cK) it.next()).DOI();
            }
        }
        this.A05 = z;
        this.A04 = i;
        A00(this);
    }

    public static final void A00(ConstrainedEditText constrainedEditText) {
        int i;
        float f;
        float f2;
        if (constrainedEditText.isLaidOut() && constrainedEditText.getLayout() != null) {
            Context context = constrainedEditText.getContext();
            C14360o3.A07(context);
            int A09 = (AbstractC13880nE.A09(context) - constrainedEditText.A01) - constrainedEditText.A00;
            if (constrainedEditText.A05) {
                i = constrainedEditText.A04;
            } else {
                i = 0;
            }
            int i2 = A09 - i;
            constrainedEditText.setY(r1 + ((i2 - constrainedEditText.getHeight()) / 2));
            if (constrainedEditText.A03 > 0.0f) {
                f = constrainedEditText.getScaleX() / constrainedEditText.A03;
                f2 = constrainedEditText.getScaleY() / constrainedEditText.A03;
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            float min = Math.min(1.0f, i2 / constrainedEditText.getHeight());
            constrainedEditText.A03 = min;
            constrainedEditText.setScaleX(min * f);
            constrainedEditText.setScaleY(constrainedEditText.A03 * f2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int A06 = C0f9.A06(-86923528);
        super.onMeasure(i, i2);
        Editable text = getText();
        if (text != null && text.length() != 0) {
            Layout layout = getLayout();
            if (layout != null) {
                i3 = layout.getHeight();
            } else {
                i3 = 0;
            }
            setMeasuredDimension(getMeasuredWidth(), i3 + getPaddingTop() + getPaddingBottom());
        }
        C0f9.A0D(-1144488127, A06);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        List list = this.A07;
        if (list != null && this.A02) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC190628cK) list.get(i3)).DkM(this, i, i2);
            }
        }
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        C2UX.A00().AMS(keyListener, this);
        super.setKeyListener(keyListener);
    }

    public ConstrainedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = new ArrayList();
        this.A03 = -1.0f;
        this.A02 = true;
        InterfaceC693339t A00 = C2UX.A00();
        KeyListener keyListener = getKeyListener();
        A00.AMS(keyListener, this);
        super.setKeyListener(keyListener);
    }

    public /* synthetic */ ConstrainedEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ConstrainedEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
