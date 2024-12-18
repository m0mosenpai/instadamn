package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.AwX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24691AwX implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C7GE A01;

    public RunnableC24691AwX(Bitmap bitmap, C7GE c7ge) {
        this.A00 = bitmap;
        this.A01 = c7ge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap = this.A00;
        if (bitmap == null) {
            C7GF.A00(this.A01);
            return;
        }
        C7GE c7ge = this.A01;
        UserSession userSession = (UserSession) c7ge.A02.get();
        if (userSession == null) {
            return;
        }
        C183978Ee A03 = AbstractC209669Pc.A03(bitmap, null, userSession, C50472Tr.A01(), AbstractC917048o.A04("direct_temp_photo", ".jpg"), 0, false);
        C7FG c7fg = (C7FG) c7ge.A01.get();
        if (c7fg == null) {
            return;
        }
        c7fg.A04(null, new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), null, null, A03, null, null, null, new ConcurrentLinkedQueue(), -1, 0, false);
    }
}
