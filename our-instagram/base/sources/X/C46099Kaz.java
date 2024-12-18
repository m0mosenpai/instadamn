package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;

/* renamed from: X.Kaz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46099Kaz extends PJX {
    public final /* synthetic */ Jn5 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C46099Kaz(Jn5 jn5, String str, String str2) {
        this.A00 = jn5;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        this.A00.A0D.Egh(new K2K("showReportBroadcastChannelReplyBottomSheet_request_error", 0));
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        java.util.Set set;
        MediaCommentListRepository mediaCommentListRepository = this.A00.A05;
        java.util.Set A16 = AbstractC43592JPx.A16(this.A02);
        String str2 = this.A01;
        if (str2 != null) {
            set = AbstractC43592JPx.A16(str2);
        } else {
            set = C16910sj.A00;
        }
        mediaCommentListRepository.A0S(A16, set);
    }
}
