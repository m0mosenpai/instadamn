package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.io.IOException;

/* renamed from: X.KLl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45708KLl extends AbstractRunnableC14200nk {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ LGZ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45708KLl(Bitmap bitmap, LGZ lgz) {
        super(15, 3, true, true);
        this.A01 = lgz;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LGZ lgz = this.A01;
        Context context = lgz.A01;
        File A01 = AbstractC15860qg.A01(".jpg");
        if (A01 != null) {
            C1NC.A0M(this.A00, A01);
            String A0x = AbstractC43593JPy.A0x();
            C14360o3.A0B(A0x, 0);
            C47Z A012 = AbstractC209399Nx.A01(A0x);
            try {
                A012.A33 = A01.getCanonicalPath();
                A012.A0c(ShareType.A0N);
                C40121td c40121td = lgz.A04;
                c40121td.A0C(A012);
                C25A.A00(lgz.A03).A0B(context.getApplicationContext());
                c40121td.A09(A012);
                return;
            } catch (IOException e) {
                C0K8.A0F("SelfiePhotoManager", "Failed to post selfie media.", e);
                return;
            }
        }
        C0K8.A0C("SelfiePhotoManager", "Unable to generate selfie photo file.");
    }
}
