package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.APl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23189APl implements TextWatcher {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C8LD A02;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    public C23189APl(C8LD c8ld) {
        this.A02 = c8ld;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = TextUtils.isEmpty(charSequence);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        C8LD c8ld = this.A02;
        boolean z = !C8LD.A0I(c8ld);
        if (isEmpty != this.A00) {
            ConstrainedEditText constrainedEditText = c8ld.A0D;
            constrainedEditText.getClass();
            ViewGroup.LayoutParams layoutParams = constrainedEditText.getLayoutParams();
            C8LD.A0C(c8ld);
            C8LD.A0G(c8ld);
            int i4 = -1;
            if (isEmpty) {
                i4 = -2;
            }
            layoutParams.width = i4;
            ConstrainedEditText constrainedEditText2 = c8ld.A0D;
            constrainedEditText2.getClass();
            constrainedEditText2.setLayoutParams(layoutParams);
        }
        if (z != this.A01) {
            C8LD.A08(c8ld);
            TextView textView = c8ld.A07;
            textView.getClass();
            textView.setAlpha(1.0f);
        }
        this.A00 = isEmpty;
        this.A01 = z;
    }
}
