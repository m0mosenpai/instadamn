package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.L2b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47642L2b {
    public final MediaCommentListRepository A00;
    public final String A01;
    public final Map A02 = AbstractC166987dD.A1I();
    public final UserSession A03;

    public C47642L2b(MediaCommentListRepository mediaCommentListRepository, UserSession userSession, String str) {
        this.A03 = userSession;
        this.A01 = str;
        this.A00 = mediaCommentListRepository;
    }
}
