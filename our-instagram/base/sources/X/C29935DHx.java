package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DHx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29935DHx extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29935DHx(Object obj, Object obj2, Object obj3, float f, int i, int i2) {
        super(1);
        this.A01 = i2;
        this.A00 = f;
        this.A05 = obj;
        this.A02 = i;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A01 != 0) {
            C168937gS c168937gS = (C168937gS) obj;
            boolean A1Z = AbstractC25225BEi.A1Z(c168937gS);
            C51722Yv A00 = C9CU.A00(null, C05F.A01, A1Z ? 1 : 0, AbstractC25225BEi.A09(AbstractC25231BEo.A03(C26575BoY.A0F)));
            float f = this.A00;
            C51722Yv A002 = C9CU.A00(A00, C05F.A00, A1Z ? 1 : 0, AbstractC25225BEi.A09(f));
            C26575BoY c26575BoY = (C26575BoY) this.A05;
            int i = this.A02;
            CA7 ca7 = (CA7) this.A03;
            C51722Yv c51722Yv = (C51722Yv) this.A04;
            C2Z0 A0P = AbstractC167007dF.A0P(c168937gS.A00);
            UserSession userSession = c26575BoY.A04;
            C120985dq c120985dq = c26575BoY.A02;
            C37644Ghd c37644Ghd = c26575BoY.A03;
            float A03 = AbstractC25231BEo.A03(C26575BoY.A0E);
            C5E c5e = c26575BoY.A08;
            InterfaceC31137Dmc interfaceC31137Dmc = c26575BoY.A07;
            return AbstractC25227BEk.A0V(new C26520Bnf(c51722Yv, c120985dq, c37644Ghd, userSession, ((C5A) ca7).A00, c26575BoY.A05, interfaceC31137Dmc, c5e, A03, f, i), A0P, c168937gS, A002);
        }
        SparseArray sparseArray = (SparseArray) obj;
        C14360o3.A0B(sparseArray, 0);
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
        int i2 = this.A02;
        float f2 = this.A00;
        ImageUrl imageUrl = (ImageUrl) this.A03;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        int size = sparseArray.size();
        if (size != 0 && size != 1) {
            Bitmap bitmap = (Bitmap) sparseArray.get(0);
            if (size != 2) {
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 10.0f * f2, 29.0f * f2, (Paint) null);
                }
                Bitmap bitmap2 = (Bitmap) sparseArray.get(1);
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, 25.0f * f2, 5.0f * f2, (Paint) null);
                }
                Bitmap bitmap3 = (Bitmap) sparseArray.get(2);
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, 40.0f * f2, f2 * 26.0f, (Paint) null);
                }
            } else {
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 7.0f * f2, 25.0f * f2, (Paint) null);
                }
                Bitmap bitmap4 = (Bitmap) sparseArray.get(1);
                if (bitmap4 != null) {
                    canvas.drawBitmap(bitmap4, 32.0f * f2, f2 * 7.0f, (Paint) null);
                }
            }
        } else if (imageUrl != null) {
            C1OG A0J = C25821No.A00().A0J(imageUrl, "ROLL_CALL_FACEPILE");
            A0J.A02(new C48271LXu(canvas, i2, 0));
            A0J.A01();
        }
        interfaceC16660sJ.invoke(createBitmap);
        return C0eB.A00;
    }
}
