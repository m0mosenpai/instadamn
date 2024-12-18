package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;

/* renamed from: X.JbF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43904JbF extends C193578hc {
    public final C2GT A00;
    public final UserSession A01;
    public final ClipsDraftPreviewItemRepository A02;
    public final C14090nZ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43904JbF(Application application, C12N c12n, UserSession userSession, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository) {
        super(application);
        AbstractC167007dF.A1F(clipsDraftPreviewItemRepository, 3, c12n);
        this.A01 = userSession;
        this.A02 = clipsDraftPreviewItemRepository;
        C14090nZ AOT = c12n.AOT(2113530577, 3);
        this.A03 = AOT;
        this.A00 = AbstractC31172DnG.A0E(AbstractC011604e.A01(AOT, new C43818JZg(24, clipsDraftPreviewItemRepository.A03, this)));
    }
}
