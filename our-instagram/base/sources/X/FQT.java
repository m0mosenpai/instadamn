package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.EditText;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class FQT {
    public C34449FGn A00;
    public boolean A01;
    public boolean A02;
    public final Drawable A03;
    public final Drawable A04;
    public final EditText A05;
    public final EditText A06;

    public final boolean A00() {
        String A0g = AbstractC167007dF.A0g(this.A06);
        String A0g2 = AbstractC167007dF.A0g(this.A05);
        if (!TextUtils.isEmpty(A0g) && !TextUtils.isEmpty(A0g2)) {
            return true;
        }
        return false;
    }

    public FQT(Resources resources, EditText editText, EditText editText2) {
        this.A06 = editText;
        this.A05 = editText2;
        this.A03 = resources.getDrawable(R.drawable.profile_glyph_password);
        this.A04 = resources.getDrawable(R.drawable.profile_glyph_password_red);
        EditText editText3 = this.A06;
        ViewOnFocusChangeListenerC35694FpU.A00(editText3, 10, this);
        editText3.addTextChangedListener(new Em2(this, 2));
        EditText editText4 = this.A05;
        ViewOnFocusChangeListenerC35694FpU.A00(editText4, 11, this);
        editText4.addTextChangedListener(new Em2(this, 3));
    }
}
