package X;

import android.content.DialogInterface;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LMN implements DialogInterface.OnClickListener {
    public final /* synthetic */ C25814BbV A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C84923qg A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public LMN(C25814BbV c25814BbV, UserSession userSession, C84923qg c84923qg, String str, String str2, boolean z, boolean z2) {
        this.A05 = z;
        this.A00 = c25814BbV;
        this.A02 = c84923qg;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z2;
        this.A01 = userSession;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C25814BbV c25814BbV;
        dialogInterface.dismiss();
        if (this.A05) {
            c25814BbV = this.A00;
            c25814BbV.A0f(this.A02.A0G, "unhide_comment_confirm");
            c25814BbV.A0A.A0P(this.A03, this.A04, null);
        } else {
            if (!this.A06) {
                return;
            }
            OOJ.A00(this.A01, this.A02, "confirm_unhide");
            c25814BbV = this.A00;
            String str = this.A03;
            String str2 = this.A04;
            MediaCommentListRepository mediaCommentListRepository = c25814BbV.A0A;
            AbstractC166987dD.A1Z(new C50125MBz(mediaCommentListRepository, str, str2, (InterfaceC23621Ds) null, 6), ((C4A7) mediaCommentListRepository).A01);
        }
        c25814BbV.A0N.Egh(new C9BK(LXJ.A00));
    }
}
