package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.Pair;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6RR, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6RR {
    public static final Bitmap A00(Resources resources, int i) {
        C14360o3.A0B(resources, 0);
        Object drawable = resources.getDrawable(i, null);
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C14360o3.A0A(bitmap);
            return bitmap;
        }
        if (drawable instanceof InterfaceC56812jE) {
            C56792jC c56792jC = (C56792jC) ((InterfaceC56812jE) drawable);
            AtomicReference atomicReference = c56792jC.A00.A0B.A03;
            Pair pair = (Pair) atomicReference.get();
            if (pair == null) {
                int A00 = AbstractC56782jB.A00(resources, r1.A01);
                int A002 = AbstractC56782jB.A00(resources, r1.A00);
                c56792jC.mutate();
                c56792jC.setBounds(0, 0, A00, A002);
                Pair pair2 = new Pair(Bitmap.createBitmap(A00, A002, Bitmap.Config.ALPHA_8), null);
                c56792jC.draw(new Canvas((Bitmap) pair2.first));
                if (!C1EM.A00(null, pair2, atomicReference)) {
                    Object obj = pair2.second;
                    if (obj != null) {
                        ((C1VO) obj).close();
                    } else {
                        ((Bitmap) pair2.first).recycle();
                    }
                }
                pair = (Pair) atomicReference.get();
            }
            Bitmap bitmap2 = (Bitmap) pair.first;
            C14360o3.A07(bitmap2);
            return bitmap2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected drawable type: ");
        sb.append(drawable);
        throw new RuntimeException(sb.toString());
    }
}
