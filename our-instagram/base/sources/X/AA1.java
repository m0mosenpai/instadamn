package X;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class AA1 {
    public int A00;
    public int A01;
    public final C9S3 A02;
    public final List A04 = AbstractC166987dD.A1E();
    public final List A03 = AbstractC166987dD.A1E();
    public final List A05 = AbstractC166987dD.A1E();
    public final List A06 = AbstractC166987dD.A1E();

    public AA1(C9S3 c9s3, int i) {
        this.A02 = c9s3;
        Iterator it = c9s3.A0B.iterator();
        while (it.hasNext()) {
            Drawable A0Z = AbstractC166987dD.A0Z(it);
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            C9S3 c9s32 = this.A02;
            ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, Integer.valueOf(c9s32.A02), Integer.valueOf(c9s32.A03));
            ofObject.setDuration(200L);
            ANV.A00(ofObject, this, 2);
            ofObject.setCurrentPlayTime(0L);
            this.A04.add(ofObject);
            int i2 = AbstractC166987dD.A0W(A0Z).left;
            C9S3 c9s33 = this.A02;
            int i3 = i2 + c9s33.A04;
            this.A01 = i3;
            int i4 = i2 + c9s33.A07;
            this.A00 = i4;
            ValueAnimator ofInt = ValueAnimator.ofInt(i3, i4);
            ofInt.setDuration(200L);
            ANV.A00(ofInt, this, 3);
            ofInt.setInterpolator(new OvershootInterpolator(2.0f));
            ofInt.setCurrentPlayTime(0L);
            this.A03.add(ofInt);
            this.A05.add(true);
            this.A06.add(true);
        }
        List list = this.A03;
        ((Animator) list.get((list.size() - i) - 1)).start();
    }
}
