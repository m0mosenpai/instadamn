package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.Fat, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34969Fat {
    public int A02;
    public Drawable A04;
    public View.OnClickListener A05;
    public CharSequence A06;
    public CharSequence A07;
    public List A08;
    public int A03 = -1;
    public int A01 = -1;
    public float A00 = 1.0f;

    public C34969Fat(View.OnClickListener onClickListener, int i) {
        this.A02 = i;
        this.A05 = onClickListener;
    }

    public C34969Fat(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.A07 = charSequence;
        this.A05 = onClickListener;
    }
}
