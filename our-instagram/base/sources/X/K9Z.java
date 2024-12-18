package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* loaded from: classes8.dex */
public final class K9Z extends L8D implements MO8 {
    public static final void A00(K9Z k9z) {
        try {
            ViewGroup viewGroup = k9z.A06;
            Bitmap A0F = AbstractC167007dF.A0F(viewGroup.getWidth(), (viewGroup.getHeight() - k9z.A01) - k9z.A00);
            Canvas A06 = AbstractC43592JPx.A06(A0F);
            A06.translate(0.0f, -k9z.A02);
            k9z.A01();
            viewGroup.draw(A06);
            View view = k9z.A05;
            if (view != null) {
                view.setVisibility(0);
            }
            CirclePageIndicator circlePageIndicator = k9z.A0B;
            if (circlePageIndicator != null) {
                circlePageIndicator.setVisibility(0);
            }
            View view2 = k9z.A04;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            PdfDocument pdfDocument = new PdfDocument();
            PdfDocument.PageInfo create = new PdfDocument.PageInfo.Builder(A0F.getWidth(), A0F.getHeight(), 1).create();
            C14360o3.A07(create);
            PdfDocument.Page startPage = pdfDocument.startPage(create);
            C14360o3.A07(startPage);
            startPage.getCanvas().drawBitmap(A0F, 0.0f, 0.0f, (Paint) null);
            pdfDocument.finishPage(startPage);
            C121275eQ c121275eQ = new C121275eQ(new CallableC43825JZn(2, pdfDocument, k9z), 1775937301);
            c121275eQ.A00 = k9z.A0A;
            C1GJ.A03(c121275eQ);
        } catch (Exception unused) {
        }
    }

    @Override // X.MO8
    public final void FEH() {
        if (Build.VERSION.SDK_INT < 33) {
            Context context = this.A03;
            if (!AbstractC23451Ch.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C48291LYp c48291LYp = new C48291LYp(0, new CallableC44082Je7(this, 3), this);
                C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                AbstractC43592JPx.A1C((Activity) context, c48291LYp, "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
        }
        A00(this);
    }
}
