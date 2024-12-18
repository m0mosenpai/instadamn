package X;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: X.3WO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WO extends C3WN {
    public boolean A00 = true;
    public final TextView A01;
    public final C3WP A02;

    @Override // X.C3WN
    public final TransformationMethod A00(TransformationMethod transformationMethod) {
        if (this.A00) {
            if (!(transformationMethod instanceof C74453Wc) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new C74453Wc(transformationMethod);
            }
            return transformationMethod;
        }
        if (!(transformationMethod instanceof C74453Wc)) {
            return transformationMethod;
        }
        return ((C74453Wc) transformationMethod).A00;
    }

    @Override // X.C3WN
    public final void A02(boolean z) {
        this.A00 = z;
        TextView textView = this.A01;
        textView.setTransformationMethod(A00(textView.getTransformationMethod()));
        textView.setFilters(A04(textView.getFilters()));
    }

    @Override // X.C3WN
    public final InputFilter[] A04(InputFilter[] inputFilterArr) {
        int length;
        if (!this.A00) {
            SparseArray sparseArray = new SparseArray(1);
            int i = 0;
            while (true) {
                length = inputFilterArr.length;
                if (i >= length) {
                    break;
                }
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C3WP) {
                    sparseArray.put(i, inputFilter);
                }
                i++;
            }
            if (sparseArray.size() != 0) {
                InputFilter[] inputFilterArr2 = new InputFilter[length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
        } else {
            int length2 = inputFilterArr.length;
            for (InputFilter inputFilter2 : inputFilterArr) {
                if (inputFilter2 != this.A02) {
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[length2 + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
            inputFilterArr3[length2] = this.A02;
            return inputFilterArr3;
        }
        return inputFilterArr;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.3WP] */
    public C3WO(final TextView textView) {
        this.A01 = textView;
        this.A02 = new InputFilter(textView) { // from class: X.3WP
            public AbstractC106884rp A00;
            public final TextView A01;

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
            
                if (r1 != 3) goto L10;
             */
            @Override // android.text.InputFilter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
                /*
                    r3 = this;
                    android.widget.TextView r2 = r3.A01
                    boolean r0 = r2.isInEditMode()
                    if (r0 != 0) goto L18
                    X.Ptc r0 = X.C58341Ptc.A00()
                    int r1 = r0.A01()
                    if (r1 == 0) goto L47
                    r0 = 1
                    if (r1 == r0) goto L19
                    r0 = 3
                    if (r1 == r0) goto L47
                L18:
                    return r4
                L19:
                    if (r9 != 0) goto L2a
                    if (r8 != 0) goto L2a
                    int r0 = r7.length()
                    if (r0 != 0) goto L2a
                    java.lang.CharSequence r0 = r2.getText()
                    if (r4 != r0) goto L2a
                    return r4
                L2a:
                    if (r4 == 0) goto L18
                    if (r5 != 0) goto L42
                    int r0 = r4.length()
                    if (r6 != r0) goto L42
                L34:
                    X.Ptc r2 = X.C58341Ptc.A00()
                    int r1 = r4.length()
                    r0 = 0
                    java.lang.CharSequence r4 = r2.A02(r4, r0, r1)
                    return r4
                L42:
                    java.lang.CharSequence r4 = r4.subSequence(r5, r6)
                    goto L34
                L47:
                    X.Ptc r1 = X.C58341Ptc.A00()
                    X.4rp r0 = r3.A00
                    if (r0 != 0) goto L56
                    X.4ro r0 = new X.4ro
                    r0.<init>(r2, r3)
                    r3.A00 = r0
                L56:
                    r1.A04(r0)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3WP.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
            }

            {
                this.A01 = textView;
            }
        };
    }
}
