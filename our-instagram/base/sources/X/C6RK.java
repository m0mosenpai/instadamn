package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.6RK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6RK {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Typeface A04;
    public C75C A05;
    public Integer A06;
    public String A07;
    public boolean A08;
    public final Context A09;
    public final Drawable A0A;

    public C6RK(Context context, Drawable drawable, int i) {
        C14360o3.A0B(drawable, 2);
        this.A06 = C05F.A01;
        this.A03 = 2000L;
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = -1;
        this.A09 = context;
        this.A0A = drawable;
        this.A04 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A13);
        this.A00 = i;
    }

    public final C6RL A00() {
        Context context = this.A09;
        Resources resources = context.getResources();
        if (this.A00 == -1) {
            this.A00 = AbstractC188878Yd.A01(context) - (resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material) * 2);
        }
        if (this.A01 == -1) {
            this.A01 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        }
        if (this.A02 == -1) {
            this.A02 = resources.getDimensionPixelOffset(R.dimen.achievements_only_you_bottom_margin);
        }
        return new C6RL(this);
    }

    public final void A01(int i) {
        this.A07 = this.A09.getString(i);
    }

    public final void A02(int i) {
        this.A01 = this.A09.getResources().getDimensionPixelSize(i);
    }
}
