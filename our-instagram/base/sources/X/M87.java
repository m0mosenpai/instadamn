package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.core.content.FileProvider;
import com.facebook.R;
import com.google.common.io.Closeables;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.user.model.User;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M87 implements Callable {
    public final Context A00;
    public final UserSession A01;
    public final C38321qM A02;
    public final C75113Zb A03;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String[] strArr = new String[1];
        Integer[] numArr = new Integer[1];
        UserSession userSession = this.A01;
        C38321qM c38321qM = this.A02;
        C1ON A00 = AbstractC35242Fgb.A00(userSession, c38321qM, this.A03, C05F.A0N, "");
        A00.A00 = new C45543KEi(12, numArr, strArr);
        C1GJ.A02(A00);
        Integer num = numArr[0];
        String str = strArr[0];
        if (str != null && num != null && num.intValue() > 0) {
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                Context context = this.A00;
                NametagCardView nametagCardView = new NametagCardView(context, null);
                int intValue = num.intValue();
                nametagCardView.A01(A2E, intValue);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.call_participant_text_max_width);
                nametagCardView.measure(View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
                File file = new File(new File(context.getCacheDir(), "images"), "nametag_with_code.png");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    C14360o3.A07(createBitmap);
                    Canvas A06 = AbstractC43592JPx.A06(createBitmap);
                    nametagCardView.layout(0, 0, dimensionPixelSize, dimensionPixelSize);
                    nametagCardView.draw(A06);
                    C0fK.A02(Bitmap.CompressFormat.PNG, createBitmap, fileOutputStream, 100);
                    fileOutputStream.flush();
                    android.net.Uri A002 = FileProvider.A00(context, file);
                    if (A002 != null) {
                        C47665L2y c47665L2y = new C47665L2y(createBitmap, A002, str, intValue);
                        Closeables.A00(fileOutputStream, false);
                        return c47665L2y;
                    }
                } catch (OutOfMemoryError unused) {
                } catch (Throwable th) {
                    Closeables.A00(fileOutputStream, false);
                    throw th;
                }
                Closeables.A00(fileOutputStream, false);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        throw new IOException("failed to generate nametag screenshot");
    }

    public M87(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
    }
}
