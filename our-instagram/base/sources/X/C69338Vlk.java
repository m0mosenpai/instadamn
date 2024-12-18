package X;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Random;

/* renamed from: X.Vlk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69338Vlk {
    public ValueAnimator A00;
    public UAK A01;
    public final ViewGroup A02;
    public final ArrayList A03;
    public final Random A04 = new Random();
    public final int[] A05;

    public C69338Vlk(ViewGroup viewGroup, int[] iArr) {
        int[] iArr2 = new int[2];
        this.A05 = iArr2;
        this.A02 = viewGroup;
        viewGroup.getLocationInWindow(iArr2);
        this.A03 = new ArrayList();
        Drawable[] drawableArr = new Drawable[2];
        int i = 0;
        do {
            drawableArr[i] = viewGroup.getContext().getDrawable(iArr[i]);
            i++;
        } while (i < 2);
        int i2 = 0;
        do {
            Drawable drawable = drawableArr[this.A04.nextInt(2)];
            C02R.A05(drawable instanceof BitmapDrawable);
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            bitmap.getClass();
            this.A03.add(new C69466Vnp(bitmap));
            i2++;
        } while (i2 < 50);
    }
}
