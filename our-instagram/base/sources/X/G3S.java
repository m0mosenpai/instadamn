package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3S implements InterfaceC37170GZh {
    public DirectVisualMessageActionLogPriorityFragment A00;
    public final Context A01;
    public final List A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public G3S(Context context, UserSession userSession, String str, String str2, String str3, List list) {
        AbstractC25229BEm.A1I(userSession, 2, list);
        this.A01 = context;
        this.A03 = userSession;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = list;
    }

    @Override // X.InterfaceC37170GZh
    public final void cleanup() {
    }

    @Override // X.InterfaceC37170GZh
    public final C11R EnM() {
        UserSession userSession = this.A03;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0L("direct_v2/visual_action_log/%s/item/%s/", str, str2);
        A0N.A0H(AbstractC43591JPw.A00(442), str3);
        C1ON A0S = AbstractC31172DnG.A0S(A0N, EBU.class, C34794FUw.class);
        A0S.A00 = new EE3(userSession, this);
        return A0S;
    }

    @Override // X.InterfaceC37170GZh
    public final void ET9(DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment) {
        this.A00 = directVisualMessageActionLogPriorityFragment;
    }
}
