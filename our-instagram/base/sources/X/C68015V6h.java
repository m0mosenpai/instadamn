package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V6h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68015V6h extends AbstractRunnableC14200nk {
    public final /* synthetic */ C70185WFo A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68015V6h(C70185WFo c70185WFo, String str, List list, List list2, List list3) {
        super(964449470, 3, false, false);
        this.A00 = c70185WFo;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = list3;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        float f;
        C70185WFo c70185WFo = this.A00;
        List list = c70185WFo.A0E;
        List list2 = this.A03;
        List list3 = this.A04;
        List list4 = this.A02;
        synchronized (list) {
            c70185WFo.A05 = false;
            view = c70185WFo.A07;
            view.post(new RunnableC71305WrZ(c70185WFo));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            list.clear();
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                int A01 = AbstractC31176DnK.A01(list3, i);
                int A012 = AbstractC31176DnK.A01(list4, i);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(A01, A012, config);
                C14360o3.A07(createBitmap);
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
                C14360o3.A07(createBitmap2);
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
            }
        }
        view.post(new RunnableC71472WuY(c70185WFo, this.A01));
        view.post(new RunnableC71306Wra(c70185WFo));
    }
}
