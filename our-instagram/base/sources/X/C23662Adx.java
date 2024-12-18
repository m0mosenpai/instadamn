package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.Adx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23662Adx implements InterfaceC25601Mq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ RectF A03;
    public final /* synthetic */ C187198Rm A04;
    public final /* synthetic */ C198308pf A05;

    public C23662Adx(RectF rectF, C187198Rm c187198Rm, C198308pf c198308pf, int i, int i2, int i3) {
        this.A04 = c187198Rm;
        this.A01 = i;
        this.A05 = c198308pf;
        this.A02 = i2;
        this.A03 = rectF;
        this.A00 = i3;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        Bitmap bitmap;
        Object A07 = ((AbstractC24481Hr) obj).A07();
        A07.getClass();
        String obj2 = A07.toString();
        int i = this.A01;
        Bitmap A00 = AbstractC189358aC.A00(obj2, i);
        C198308pf c198308pf = this.A05;
        C183978Ee c183978Ee = c198308pf.A02;
        c183978Ee.getClass();
        Bitmap bitmap2 = c183978Ee.A0C;
        if (bitmap2 == null) {
            bitmap2 = AbstractC189358aC.A00(c183978Ee.A06(), i);
        }
        if (A00 != null && bitmap2 != null) {
            int i2 = this.A02;
            Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
            RectF rectF = this.A03;
            canvas.drawBitmap(bitmap2, rect, rectF, (Paint) null);
            C187198Rm c187198Rm = this.A04;
            C22P c22p = c187198Rm.A0N.A0r;
            if ((c22p == C22P.A2Y || c22p == C22P.A0Z) && (bitmap = c198308pf.A01) != null) {
                canvas.drawBitmap(C0fK.A00(bitmap, (int) (i2 * 0.67f), (int) (i * 0.67f), false), (i2 - r2.getWidth()) / 2, (i - r2.getHeight()) / 2, (Paint) null);
            }
            canvas.drawBitmap(A00, new Rect(0, 0, A00.getWidth(), A00.getHeight()), rectF, (Paint) null);
            C187318Ry c187318Ry = c187198Rm.A0c;
            int i3 = this.A00;
            c187318Ry.A0R.AAN(createBitmap, i3);
            c187318Ry.A0S.notifyItemChanged(i3);
        }
        return null;
    }
}
