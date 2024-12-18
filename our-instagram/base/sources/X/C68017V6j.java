package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V6j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68017V6j extends AbstractRunnableC14200nk {
    public final /* synthetic */ C1820485o A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        C1820485o c1820485o = this.A00;
        List list = c1820485o.A0J;
        synchronized (list) {
            int i = 0;
            c1820485o.A07 = false;
            if (c1820485o.A03 != null) {
                c1820485o.A0A.post(new Runnable() { // from class: X.Ws9
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1820485o c1820485o2 = C68017V6j.this.A00;
                        ImageView imageView = c1820485o2.A03;
                        imageView.getClass();
                        imageView.setImageBitmap(null);
                        ImageView imageView2 = c1820485o2.A03;
                        imageView2.getClass();
                        imageView2.setVisibility(4);
                    }
                });
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            list.clear();
            while (true) {
                List list2 = this.A03;
                if (i < list2.size()) {
                    int intValue = ((Integer) this.A04.get(i)).intValue();
                    int intValue2 = ((Integer) this.A02.get(i)).intValue();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, config);
                    createBitmap.setHasAlpha(true);
                    createBitmap.copyPixelsFromBuffer((Buffer) list2.get(i));
                    float width = 256.0f / createBitmap.getWidth();
                    float height = 256.0f / createBitmap.getHeight();
                    int floor = (int) Math.floor(r13 * width);
                    int floor2 = (int) Math.floor(width * r11);
                    if (floor > 256 || floor2 > 256) {
                        floor = (int) Math.floor(r13 * height);
                        floor2 = (int) Math.floor(r11 * height);
                    }
                    Bitmap A00 = C0fK.A00(createBitmap, floor, floor2, true);
                    Bitmap createBitmap2 = Bitmap.createBitmap(256, 256, config);
                    Canvas canvas = new Canvas(createBitmap2);
                    Paint paint = new Paint();
                    paint.setColor(0);
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
                    float f2 = floor / floor2;
                    float f3 = 256.0f / 256.0f;
                    float f4 = 0.0f;
                    if (f2 >= f3) {
                        f = 0.0f;
                    } else {
                        f = (256 - floor) / 2.0f;
                    }
                    if (f2 >= f3) {
                        f4 = (256 - floor2) / 2.0f;
                    }
                    canvas.drawBitmap(A00, f, f4, (Paint) null);
                    list.add(createBitmap2);
                    i++;
                }
            }
        }
        View view = c1820485o.A0A;
        final String str = this.A01;
        view.post(new Runnable() { // from class: X.Wur
            @Override // java.lang.Runnable
            public final void run() {
                C68017V6j c68017V6j = C68017V6j.this;
                C1820485o.A02(c68017V6j.A00, str, true);
            }
        });
        view.post(new Runnable() { // from class: X.WsA
            @Override // java.lang.Runnable
            public final void run() {
                C1820485o.A00(C68017V6j.this.A00);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68017V6j(C1820485o c1820485o, String str, List list, List list2, List list3) {
        super(964449470);
        this.A00 = c1820485o;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = list3;
        this.A01 = str;
    }
}
