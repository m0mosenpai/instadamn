package X;

import android.content.DialogInterface;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.CiZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28541CiZ implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public DialogInterfaceOnClickListenerC28541CiZ(C25814BbV c25814BbV, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A01 = c25814BbV;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            C28238Cci c28238Cci = C28238Cci.A00;
            C25814BbV c25814BbV = (C25814BbV) this.A01;
            UserSession userSession = c25814BbV.A0E;
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            c006802i.markerPoint(309476254, "unpin_confirmation_click");
            c28238Cci.A01(userSession);
            C166007bS c166007bS = c25814BbV.A0C;
            String str = this.A02;
            c166007bS.A0D("unpin_dialog_confirm", str, this.A03, this.A04);
            J7Q j7q = new J7Q(c25814BbV, 13);
            J7Q j7q2 = new J7Q(c25814BbV, 12);
            MediaCommentListRepository mediaCommentListRepository = ((C27816COf) c25814BbV.A0M.getValue()).A00;
            AbstractC166987dD.A1Z(new C57161PZf(j7q, j7q2, mediaCommentListRepository, str, (InterfaceC23621Ds) null, 7), ((C4A7) mediaCommentListRepository).A01);
            return;
        }
        C28238Cci c28238Cci2 = C28238Cci.A00;
        C25814BbV c25814BbV2 = (C25814BbV) this.A01;
        c28238Cci2.A00(c25814BbV2.A0E);
        c25814BbV2.A0C.A0D("unpin_dialog_cancel", this.A02, this.A03, this.A04);
    }
}
