package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: X.TvL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65858TvL extends C65859TvM {
    public Drawable A00;
    public ColorStateList A01;
    public PorterDuff.Mode A02;
    public boolean A03;
    public boolean A04;
    public final SeekBar A05;

    @Override // X.C65859TvM
    public final void A02(AttributeSet attributeSet, int i) {
        super.A02(attributeSet, i);
        SeekBar seekBar = this.A05;
        Context context = seekBar.getContext();
        int[] iArr = AbstractC53402cO.A06;
        C53122bu A00 = C53122bu.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A00.A02;
        AbstractC010103p.A06(context, typedArray, attributeSet, seekBar, iArr, i, 0);
        Drawable A03 = A00.A03(0);
        if (A03 != null) {
            seekBar.setThumb(A03);
        }
        Drawable A02 = A00.A02(1);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.A00 = A02;
        if (A02 != null) {
            A02.setCallback(seekBar);
            A02.setLayoutDirection(seekBar.getLayoutDirection());
            if (A02.isStateful()) {
                A02.setState(seekBar.getDrawableState());
            }
            A00();
        }
        seekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.A02 = AbstractC55852hR.A00(this.A02, typedArray.getInt(3, -1));
            this.A04 = true;
        }
        if (typedArray.hasValue(2)) {
            this.A01 = A00.A01(2);
            this.A03 = true;
        }
        typedArray.recycle();
        A00();
    }

    private void A00() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            if (this.A03 || this.A04) {
                Drawable mutate = drawable.mutate();
                this.A00 = mutate;
                if (this.A03) {
                    mutate.setTintList(this.A01);
                }
                if (this.A04) {
                    this.A00.setTintMode(this.A02);
                }
                if (this.A00.isStateful()) {
                    this.A00.setState(this.A05.getDrawableState());
                }
            }
        }
    }

    public C65858TvL(SeekBar seekBar) {
        super(seekBar);
        this.A01 = null;
        this.A02 = null;
        this.A03 = false;
        this.A04 = false;
        this.A05 = seekBar;
    }
}
