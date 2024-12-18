package X;

import android.os.Build;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.KMa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45723KMa extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C26086BgF A02;
    public final /* synthetic */ Medium A03;
    public final /* synthetic */ C45029JwK A04;
    public final /* synthetic */ C7FG A05;
    public final /* synthetic */ C211689Zc A06;
    public final /* synthetic */ C47Z A07;
    public final /* synthetic */ Long A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ ConcurrentLinkedQueue A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45723KMa(C26086BgF c26086BgF, Medium medium, C45029JwK c45029JwK, C7FG c7fg, C211689Zc c211689Zc, C47Z c47z, Long l, String str, ConcurrentLinkedQueue concurrentLinkedQueue, int i, int i2, boolean z) {
        super(117, 2, false, false);
        this.A03 = medium;
        this.A05 = c7fg;
        this.A07 = c47z;
        this.A04 = c45029JwK;
        this.A00 = i;
        this.A0A = concurrentLinkedQueue;
        this.A09 = str;
        this.A02 = c26086BgF;
        this.A08 = l;
        this.A01 = i2;
        this.A0B = z;
        this.A06 = c211689Zc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        MediaUploadMetadata mediaUploadMetadata;
        Medium medium = this.A03;
        C44059Jdk A00 = C44059Jdk.A00(medium.A0X, 0);
        C14360o3.A07(A00);
        if (!medium.A0G.A0B && Build.VERSION.SDK_INT >= 29) {
            str = medium.A02().toString();
        } else {
            str = medium.A0a;
        }
        C7FG c7fg = this.A05;
        boolean z = false;
        if (AbstractC23048AEe.A01(A00, c7fg.A06, false, true)) {
            String str2 = A00.A07;
            C14360o3.A07(str2);
            long j = A00.A03;
            UserSession userSession = c7fg.A02;
            ClipInfo A03 = MY3.A03(userSession, str2, j, 90000L);
            A03.A00 = A03.A09 / A03.A06;
            MediaUploadMetadata mediaUploadMetadata2 = A03.A0B;
            C47Z c47z = this.A07;
            if (c47z != null) {
                mediaUploadMetadata = c47z.A13;
            } else {
                mediaUploadMetadata = null;
            }
            mediaUploadMetadata2.A00(mediaUploadMetadata);
            A03.A0B.A00(medium.A0G);
            A03.A0B.A00(C9L8.A00(c7fg.A01, medium.A02(), userSession, medium.A0X));
            C47Z c47z2 = this.A04.A01;
            if (c47z2 != null && c47z2.A5F) {
                z = true;
            }
            A03.A0I = z;
            int i = this.A00;
            if (i != -1) {
                if (str != null) {
                    KQK kqk = new KQK(A03, c47z, str);
                    ConcurrentLinkedQueue concurrentLinkedQueue = this.A0A;
                    concurrentLinkedQueue.offer(AbstractC166987dD.A1L(Integer.valueOf(i), kqk));
                    C7FG.A01(this.A02, c7fg, this.A08, this.A09, concurrentLinkedQueue);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            C11T.A02(new M7I(this.A02, c7fg, this.A06, A03, c47z, this.A08, str, this.A01, this.A0B));
        }
    }
}
