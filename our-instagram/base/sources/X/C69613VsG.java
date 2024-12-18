package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: X.VsG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69613VsG {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public final CheckedTextView A05;

    public final void A00() {
        CheckedTextView checkedTextView = this.A05;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.A02 || this.A03) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.A02) {
                    mutate.setTintList(this.A00);
                }
                if (this.A03) {
                    mutate.setTintMode(this.A01);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }

    public C69613VsG(CheckedTextView checkedTextView) {
        this.A05 = checkedTextView;
    }
}
