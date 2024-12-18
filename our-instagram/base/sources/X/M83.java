package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.common.io.Closeables;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.user.model.User;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M83 implements Callable {
    public final Context A00;
    public final User A01;
    public final Integer A02;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00;
        File A00 = AbstractC15860qg.A00(context, ".png");
        if (A00 != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(A00);
            int A0A = AbstractC13880nE.A0A(context);
            NametagCardView nametagCardView = new NametagCardView(context, null);
            Integer num = this.A02;
            if (num != null) {
                nametagCardView.A01(this.A01, num.intValue());
            } else {
                nametagCardView.A01(this.A01, 0);
            }
            nametagCardView.measure(View.MeasureSpec.makeMeasureSpec(A0A, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(A0A, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            try {
                Bitmap createBitmap = Bitmap.createBitmap(A0A, A0A, Bitmap.Config.ARGB_8888);
                Canvas A06 = AbstractC43592JPx.A06(createBitmap);
                nametagCardView.layout(0, 0, A0A, A0A);
                nametagCardView.draw(A06);
                C0fK.A02(Bitmap.CompressFormat.PNG, createBitmap, fileOutputStream, 100);
                fileOutputStream.flush();
                Closeables.A00(fileOutputStream, false);
                AbstractC50633MWu.A09(context, A00);
                return AbstractC166997dE.A0b();
            } catch (OutOfMemoryError unused) {
                Closeables.A00(fileOutputStream, false);
            } catch (Throwable th) {
                Closeables.A00(fileOutputStream, false);
                throw th;
            }
        }
        return false;
    }

    public M83(Context context, User user, Integer num) {
        this.A00 = context;
        this.A01 = user;
        this.A02 = num;
    }
}
