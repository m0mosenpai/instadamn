package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Looper;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.OwM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56155OwM implements C11R {
    public Bitmap A00;
    public InterfaceC58022Po8 A01;
    public C1P1 A02;
    public ImageUrl A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C54662OCo A07;
    public final UserSession A08;
    public final WeakReference A09;

    @Override // X.C11R
    public final String getName() {
        return "UploadCustomCoverTask";
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 288;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onFinish() {
        this.A05 = true;
        InterfaceC58022Po8 interfaceC58022Po8 = this.A01;
        if (interfaceC58022Po8 != null) {
            A00(interfaceC58022Po8, this, this.A02);
            this.A01 = null;
            this.A02 = null;
        }
    }

    @Override // X.C11R
    public final void onStart() {
    }

    public static void A00(InterfaceC58022Po8 interfaceC58022Po8, C56155OwM c56155OwM, C1P1 c1p1) {
        if (c56155OwM.A06) {
            c56155OwM.A03.getClass();
            String str = c56155OwM.A04;
            if (str == null) {
                str = "";
            }
            ImageUrl imageUrl = c56155OwM.A03;
            interfaceC58022Po8.D8y(new Rect(0, 0, imageUrl.getWidth(), imageUrl.getHeight()), imageUrl, str);
            interfaceC58022Po8.onFinish();
            return;
        }
        if (c1p1 == null) {
            return;
        }
        c1p1.onFail(C7J2.A00());
    }

    public C56155OwM(Activity activity, C54662OCo c54662OCo, UserSession userSession) {
        this.A08 = userSession;
        this.A07 = c54662OCo;
        this.A09 = AbstractC25225BEi.A16(activity);
    }

    @Override // X.C11R
    public final void run() {
        int i;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C25821No A00 = C25821No.A00();
                C54662OCo c54662OCo = this.A07;
                C1OG A0J = A00.A0J(c54662OCo.A02, null);
                A0J.A0I = false;
                A0J.A02(new C23597Acr(0, this, countDownLatch));
                A0J.A01();
                countDownLatch.await();
                this.A00.getClass();
                Rect A05 = MX2.A05(c54662OCo.A01, this.A00.getWidth(), this.A00.getHeight(), 1, 1);
                int min = Math.min(1080, Math.min(A05.width(), A05.height()));
                if (min == 0) {
                    C18950wb c18950wb = C18950wb.A01;
                    Integer valueOf = Integer.valueOf(this.A00.getWidth());
                    Integer valueOf2 = Integer.valueOf(this.A00.getHeight());
                    Integer valueOf3 = Integer.valueOf(A05.left);
                    Integer valueOf4 = Integer.valueOf(A05.top);
                    Integer valueOf5 = Integer.valueOf(A05.right);
                    Integer valueOf6 = Integer.valueOf(A05.bottom);
                    Rect rect = c54662OCo.A00;
                    c18950wb.AEp(StringFormatUtil.formatStrLocaleSafe("targetWidthAndHeight is 0. mBitmap: (%d, %d). cropRect: (%d, %d, %d, %d). mCurrentCoverMedia.cropRect: (%d, %d, %d, %d).", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom)), 18945175);
                    min = Math.min(1080, Math.min(this.A00.getWidth(), this.A00.getHeight()));
                    A05 = new Rect(0, 0, this.A00.getWidth(), this.A00.getHeight());
                }
                UserSession userSession = this.A08;
                C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
                if (C18U.A06(A0j, userSession, 36328925039247218L) && C18U.A06(A0j, userSession, 36328925038853999L)) {
                    min = this.A00.getWidth();
                    i = this.A00.getHeight();
                    A05 = new Rect(0, 0, min, i);
                } else {
                    i = min;
                }
                Bitmap A0C = C1NC.A0C(this.A00, MX2.A06(A05), min, i);
                this.A00 = null;
                WeakReference weakReference = this.A09;
                Object obj = weakReference.get();
                obj.getClass();
                File A04 = AbstractC13530mf.A04((Context) obj);
                C1NC.A0M(A0C, A04);
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                Object obj2 = weakReference.get();
                obj2.getClass();
                Activity activity = (Activity) obj2;
                activity.runOnUiThread(new PTV(activity, A0C, this, A04, countDownLatch2));
                countDownLatch2.await();
                return;
            } catch (InterruptedException e) {
                throw new RuntimeException("UploadCustomCoverTask was interrupted", e);
            }
        }
        throw AbstractC166987dD.A14("UploadCustomCoverTask must not be run on UI thread");
    }
}
