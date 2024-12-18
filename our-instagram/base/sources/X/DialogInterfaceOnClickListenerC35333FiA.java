package X;

import android.content.DialogInterface;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35333FiA implements DialogInterface.OnClickListener {
    public final /* synthetic */ C2JL A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;

    public DialogInterfaceOnClickListenerC35333FiA(C2JL c2jl, UserSession userSession, C38321qM c38321qM) {
        this.A01 = userSession;
        this.A02 = c38321qM;
        this.A00 = c2jl;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        UserSession userSession = this.A01;
        C38321qM c38321qM = this.A02;
        if (c38321qM != null) {
            str = c38321qM.A2u();
        } else {
            str = null;
        }
        C2JL c2jl = this.A00;
        if (str != null) {
            C40701ud A01 = AbstractC40691uc.A01(userSession);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A04("media_id", str);
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "DeleteCommentPromptMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), Qa0.class, true, null, 0, null, "xdt_delete_comment_prompt_parent_comment", AbstractC166987dD.A1E());
            A01.ATV(new C64006Sxd(c2jl, 7), new C58510Pwe(c2jl, 7), pandoGraphQLRequest);
        }
    }
}
