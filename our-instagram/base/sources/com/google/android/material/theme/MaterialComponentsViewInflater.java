package com.google.android.material.theme;

import X.AbstractC1567371w;
import X.C3WF;
import X.C53412cP;
import X.C65K;
import X.C65M;
import X.C65N;
import X.UB7;
import X.UBF;
import X.UBJ;
import X.UCq;
import X.UDN;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes11.dex */
public class MaterialComponentsViewInflater extends C53412cP {
    @Override // X.C53412cP
    public final UB7 A02(Context context, AttributeSet attributeSet) {
        return new UDN(context, attributeSet);
    }

    @Override // X.C53412cP
    public final UBF A03(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // X.C53412cP
    public final C3WF A06(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.UDR, android.widget.CompoundButton, X.UBJ, android.view.View] */
    @Override // X.C53412cP
    public final UBJ A04(Context context, AttributeSet attributeSet) {
        ?? ubj = new UBJ(C65K.A00(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        Context context2 = ubj.getContext();
        TypedArray A00 = C65M.A00(context2, attributeSet, C65N.A0O, new int[0], R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        if (A00.hasValue(0)) {
            ubj.setButtonTintList(AbstractC1567371w.A01(context2, A00, 0));
        }
        ubj.A00 = A00.getBoolean(1, false);
        A00.recycle();
        return ubj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.UDa, X.UCq, android.widget.CompoundButton, android.view.View] */
    @Override // X.C53412cP
    public final UCq A05(Context context, AttributeSet attributeSet) {
        ?? uCq = new UCq(C65K.A00(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = uCq.getContext();
        TypedArray A00 = C65M.A00(context2, attributeSet, C65N.A0P, new int[0], R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        if (A00.hasValue(0)) {
            uCq.setButtonTintList(AbstractC1567371w.A01(context2, A00, 0));
        }
        uCq.A00 = A00.getBoolean(1, false);
        A00.recycle();
        return uCq;
    }
}
