package X;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/* loaded from: classes11.dex */
public final class VBB extends WKa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public VBB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.WKa, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Drawable drawable;
        switch (this.A00) {
            case 1:
                EditText editText = (EditText) this.A01;
                int length = AbstractC65702TsY.A0Z(editText).length();
                C70860WiQ c70860WiQ = (C70860WiQ) this.A02;
                if (length > 0) {
                    drawable = c70860WiQ.A09;
                } else {
                    drawable = c70860WiQ.A0A;
                }
                editText.setBackground(drawable);
                ViewGroup viewGroup = c70860WiQ.A02;
                if (viewGroup != null) {
                    if (viewGroup.getChildCount() < 3) {
                        return;
                    }
                    ViewGroup viewGroup2 = c70860WiQ.A02;
                    if (viewGroup2 != null) {
                        View childAt = viewGroup2.getChildAt(2);
                        String A00 = AbstractC111324zv.A00(239);
                        C14360o3.A0C(childAt, A00);
                        boolean A1N = AbstractC167007dF.A1N(AbstractC65702TsY.A0Z((EditText) childAt).length());
                        ViewGroup viewGroup3 = c70860WiQ.A02;
                        if (viewGroup3 != null) {
                            if (viewGroup3.getChildCount() < 4 && !A1N) {
                                ViewGroup viewGroup4 = c70860WiQ.A02;
                                if (viewGroup4 != null) {
                                    viewGroup4.addView(C70860WiQ.A00(c70860WiQ, false));
                                }
                            }
                            ViewGroup viewGroup5 = c70860WiQ.A02;
                            if (viewGroup5 != null) {
                                if (viewGroup5.getChildCount() != 4 || !A1N) {
                                    return;
                                }
                                ViewGroup viewGroup6 = c70860WiQ.A02;
                                if (viewGroup6 != null) {
                                    View childAt2 = viewGroup6.getChildAt(viewGroup6.getChildCount() - 1);
                                    C14360o3.A0C(childAt2, A00);
                                    if (AbstractC65702TsY.A0Z((EditText) childAt2).length() != 0) {
                                        return;
                                    }
                                    ViewGroup viewGroup7 = c70860WiQ.A02;
                                    if (viewGroup7 != null) {
                                        viewGroup7.removeViewAt(viewGroup7.getChildCount() - 1);
                                        ViewGroup viewGroup8 = c70860WiQ.A02;
                                        if (viewGroup8 != null) {
                                            viewGroup8.getChildAt(viewGroup8.getChildCount() - 1).requestFocus();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F("optionsContainer");
                throw C00O.createAndThrow();
            case 2:
                WDH wdh = (WDH) this.A01;
                View view = wdh.A03;
                view.post(new RunnableC71370Wsf(this));
                EditText editText2 = wdh.A04;
                if (!TextUtils.isEmpty(AbstractC31177DnL.A0c(editText2))) {
                    wdh.A01 = false;
                    editText2.setHint(wdh.A00);
                    WDH.A00(wdh);
                    return;
                } else {
                    if (wdh.A01) {
                        return;
                    }
                    WDH.A01(wdh, view.isSelected());
                    return;
                }
            case 3:
                ((InterfaceC37212GaN) this.A02).Dx4();
                return;
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    @Override // X.WKa, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A00 != 0) {
            super.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        C14360o3.A0B(charSequence, 0);
        View view = (View) this.A01;
        int i4 = 0;
        if (charSequence.length() != 0 || C26750BrX.A00((C26750BrX) this.A02).A03.A0F) {
            i4 = 8;
        }
        view.setVisibility(i4);
    }
}
