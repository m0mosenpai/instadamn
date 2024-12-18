package X;

import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes8.dex */
public final class MIH extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ CommentGiphyMediaInfo A00;
    public final /* synthetic */ MediaCommentListRepository A01;
    public final /* synthetic */ C51618MrB A02;
    public final /* synthetic */ C115925Mi A03;
    public final /* synthetic */ C115935Mj A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIH(CommentGiphyMediaInfo commentGiphyMediaInfo, MediaCommentListRepository mediaCommentListRepository, C51618MrB c51618MrB, C115925Mi c115925Mi, C115935Mj c115935Mj, String str) {
        super(1);
        this.A01 = mediaCommentListRepository;
        this.A02 = c51618MrB;
        this.A05 = str;
        this.A00 = commentGiphyMediaInfo;
        this.A03 = c115925Mi;
        this.A04 = c115935Mj;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C169277h1 c169277h1;
        C17Q c17q;
        User user;
        C166137bh c166137bh = (C166137bh) obj;
        C14360o3.A0B(c166137bh, 0);
        MediaCommentListRepository mediaCommentListRepository = this.A01;
        UserSession userSession = mediaCommentListRepository.A0B;
        C51618MrB c51618MrB = this.A02;
        String str = c51618MrB.A04;
        String str2 = c51618MrB.A03;
        String str3 = this.A05;
        CommentGiphyMediaInfo commentGiphyMediaInfo = this.A00;
        List list = null;
        if (commentGiphyMediaInfo != null) {
            c169277h1 = AbstractC168487fi.A02(commentGiphyMediaInfo);
        } else {
            c169277h1 = null;
        }
        C115925Mi c115925Mi = this.A03;
        C115935Mj c115935Mj = this.A04;
        C26025BfE c26025BfE = mediaCommentListRepository.A04;
        String str4 = c26025BfE.A0F;
        C167987et c167987et = c51618MrB.A02;
        if (c167987et != null) {
            list = c167987et.A01;
        }
        boolean z = c26025BfE.A0f;
        boolean z2 = c26025BfE.A0e;
        C166047bW c166047bW = (C166047bW) mediaCommentListRepository.A05.A03.getValue();
        if (c166047bW != null && (user = c166047bW.A0A) != null) {
            c17q = user.A02;
        } else {
            c17q = null;
        }
        return AbstractC166327c1.A03(c169277h1, c166137bh, userSession, c115925Mi, c115935Mj, str, str2, str3, str4, list, z, z2, AbstractC167007dF.A1X(c17q, C17Q.A06));
    }
}
