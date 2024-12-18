package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* renamed from: X.Jm2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44496Jm2 extends AbstractC52922bZ {
    public Bitmap A00;
    public C9JS A01;
    public final C2GS A02;
    public final ClipsDraftRepository A03;
    public final C23031Ai A04;
    public final UserSession A05;

    public C44496Jm2(UserSession userSession, ClipsDraftRepository clipsDraftRepository) {
        C14360o3.A0B(userSession, 2);
        this.A03 = clipsDraftRepository;
        this.A05 = userSession;
        this.A04 = AbstractC23021Ah.A00(userSession);
        this.A02 = new C2GS();
    }
}
