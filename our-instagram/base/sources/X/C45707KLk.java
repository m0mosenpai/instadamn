package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.io.IOException;

/* renamed from: X.KLk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45707KLk extends AbstractRunnableC14200nk {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C47955LGq A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45707KLk(Bitmap bitmap, C47955LGq c47955LGq) {
        super(15, 3, true, true);
        this.A01 = c47955LGq;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47955LGq c47955LGq = this.A01;
        Context context = c47955LGq.A03;
        File A01 = AbstractC15860qg.A01(".jpg");
        if (A01 != null) {
            Bitmap bitmap = this.A00;
            if (bitmap != null) {
                C1NC.A0M(bitmap, A01);
            }
            C47Z A012 = AbstractC209399Nx.A01(AbstractC43593JPy.A0x());
            try {
                A012.A33 = A01.getCanonicalPath();
                A012.A0c(ShareType.A0M);
                C40121td c40121td = c47955LGq.A06;
                c40121td.A0C(A012);
                C25A.A00(c47955LGq.A05).A0B(AbstractC166987dD.A0O(context));
                c40121td.A09(A012);
                return;
            } catch (IOException e) {
                C0K8.A0F("BackgroundImageManager", "Failed to post background image media.", e);
                return;
            }
        }
        C0K8.A0C("BackgroundImageManager", "Unable to generate background image file.");
    }
}
