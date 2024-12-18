package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public final class PTV implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C56155OwM A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ CountDownLatch A04;

    public PTV(Activity activity, Bitmap bitmap, C56155OwM c56155OwM, File file, CountDownLatch countDownLatch) {
        this.A02 = c56155OwM;
        this.A03 = file;
        this.A01 = bitmap;
        this.A00 = activity;
        this.A04 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56155OwM c56155OwM = this.A02;
        c56155OwM.A04 = AbstractC43593JPy.A0x();
        File file = this.A03;
        Bitmap bitmap = this.A01;
        c56155OwM.A03 = AbstractC81033jX.A02(file, bitmap.getWidth(), bitmap.getHeight());
        String str = c56155OwM.A04;
        C14360o3.A0B(str, 0);
        C47Z A01 = AbstractC209399Nx.A01(str);
        A01.A33 = file.getPath();
        A01.A0H = bitmap.getWidth();
        A01.A0G = bitmap.getHeight();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        A01.A0S = width;
        A01.A0R = height;
        A01.A0c(ShareType.A0b);
        C40121td A00 = C40121td.A00(this.A00, c56155OwM.A08);
        A00.A0C(A01);
        A00.A0G(A01, true, true);
        A00.A0H(new C56487P6c(0, this, A01));
    }
}
