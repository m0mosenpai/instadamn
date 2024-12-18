package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Fzl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36291Fzl implements InterfaceC13000lm {
    public String A00;
    public final long A01;
    public final C18920wW A02;
    public final UserSession A03;

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C36291Fzl c36291Fzl, String str) {
        interfaceC02590Ai.AAP("event", str);
        interfaceC02590Ai.AAP("actor_id", c36291Fzl.A03.userId);
        interfaceC02590Ai.A9K("profile_user_igid", Long.valueOf(c36291Fzl.A01));
        interfaceC02590Ai.AAP("consistent_thread_fbid", "");
    }

    public final void A01(String str, String str2, String str3, String str4, String str5) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, AbstractC111324zv.A00(26));
        if (A0f.isSampled()) {
            HashMap A1G = AbstractC166987dD.A1G();
            if (str2 != null) {
                A1G.put("error_message", str2);
            }
            if (str3 != null) {
                A1G.put(TraceFieldType.ErrorCode, str3);
            }
            if (str4 != null) {
                A1G.put(MSV.A00(203), str4);
            }
            if (str5 != null) {
                A1G.put(MSV.A00(439), str5);
            }
            AbstractC25233BEq.A16(A0f);
            AbstractC25232BEp.A1K(A0f, "done_button");
            A00(A0f, this, "edit_pinned_channels_error");
            A0f.A7v("is_test_user", AbstractC166997dE.A0a());
            A0f.AAP(AbstractC58410Puo.A00(), str);
            A0f.A9M("extra", A1G);
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.A03(C36291Fzl.class);
    }

    public C36291Fzl(UserSession userSession) {
        long j;
        this.A03 = userSession;
        Long A0j = AbstractC25231BEo.A0j(0, userSession.userId);
        if (A0j != null) {
            j = A0j.longValue();
        } else {
            j = -1;
        }
        this.A01 = j;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = AbstractC111324zv.A00(26);
        this.A02 = c12210kP.A00();
    }
}
