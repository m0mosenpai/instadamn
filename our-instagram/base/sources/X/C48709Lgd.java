package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.Lgd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48709Lgd implements C75W {
    public final /* synthetic */ L47 A00;
    public final /* synthetic */ DirectThreadThemeInfo A01;
    public final /* synthetic */ boolean A02;

    public C48709Lgd(L47 l47, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        this.A00 = l47;
        this.A02 = z;
        this.A01 = directThreadThemeInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.graphics.drawable.Drawable] */
    @Override // X.C75W
    public final void Dsl(Bitmap bitmap, String str) {
        Drawable drawable;
        ShapeDrawable shapeDrawable;
        L47 l47 = this.A00;
        C7IM c7im = l47.A00;
        boolean z = this.A02;
        C7IH c7ih = c7im.A04;
        String str2 = c7ih.A0U;
        if (str2 == null) {
            if (z) {
                str2 = c7ih.A0V;
            } else {
                str2 = c7ih.A0W;
            }
        }
        if (str.equals(str2)) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
            AbstractC148406mA.A00(bitmap, shapeDrawable2, shapeDrawable2.getShape());
            Context context = l47.A01;
            AnonymousClass988 anonymousClass988 = l47.A04;
            Integer num = C05F.A00;
            DirectThreadThemeInfo directThreadThemeInfo = this.A01;
            if (z) {
                drawable = l47.A00.A04.A0R;
                shapeDrawable = shapeDrawable2;
            } else {
                drawable = shapeDrawable2;
                shapeDrawable = l47.A00.A04.A0Q;
            }
            C7IM A00 = C7ID.A00.A00(context, drawable, shapeDrawable, anonymousClass988, directThreadThemeInfo, num);
            l47.A00 = A00;
            C7IH c7ih2 = A00.A04;
            TransitionDrawable transitionDrawable = c7ih2.A0T;
            transitionDrawable.setCrossFadeEnabled(false);
            ShapeDrawable shapeDrawable3 = c7ih2.A0S;
            int A01 = AbstractC56402iY.A01(l47.A03);
            LayerDrawable A0B = AbstractC43593JPy.A0B(transitionDrawable, shapeDrawable3);
            A0B.setLayerInset(1, 0, 0, 0, AbstractC13890nF.A00(context) - A01);
            l47.A02.setBackground(A0B);
        }
    }
}
