package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import com.facebook.R;
import com.google.common.io.Closeables;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M84 implements Callable {
    public final Context A00;
    public final View A01;
    public final ViewGroup A02;
    public final CirclePageIndicator A03;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i;
        Context context = this.A00;
        File A00 = AbstractC15860qg.A00(context, ".png");
        android.net.Uri uri = null;
        if (A00 != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(A00);
            try {
                int A03 = AbstractC43594JPz.A03(context);
                int i2 = A03 * 2;
                View view = this.A01;
                if (view != null) {
                    i = view.getHeight();
                } else {
                    i = 0;
                }
                ViewGroup viewGroup = this.A02;
                Bitmap A0F = AbstractC167007dF.A0F(viewGroup.getWidth(), (viewGroup.getHeight() - i2) - i);
                Canvas A06 = AbstractC43592JPx.A06(A0F);
                A06.save();
                A06.translate(0.0f, -A03);
                CirclePageIndicator circlePageIndicator = this.A03;
                if (circlePageIndicator != null) {
                    circlePageIndicator.setAlpha(0.0f);
                }
                if (view != null) {
                    view.setAlpha(0.0f);
                }
                viewGroup.draw(A06);
                if (circlePageIndicator != null) {
                    circlePageIndicator.setAlpha(1.0f);
                }
                if (view != null) {
                    view.setAlpha(1.0f);
                }
                A06.restore();
                C0fK.A02(Bitmap.CompressFormat.PNG, A0F, fileOutputStream, 100);
                fileOutputStream.flush();
                uri = FileProvider.A00(context, A00);
            } catch (Exception unused) {
            } catch (Throwable th) {
                Closeables.A00(fileOutputStream, false);
                throw th;
            }
            Closeables.A00(fileOutputStream, false);
        }
        return uri;
    }

    public M84(Context context, ViewGroup viewGroup) {
        AbstractC167017dG.A1P(context, viewGroup);
        this.A00 = context;
        this.A02 = viewGroup;
        this.A03 = (CirclePageIndicator) viewGroup.findViewById(R.id.page_indicator);
        this.A01 = viewGroup.findViewById(R.id.profile_share_card);
    }
}
