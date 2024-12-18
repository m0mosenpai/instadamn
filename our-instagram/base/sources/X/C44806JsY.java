package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel;
import java.util.List;

/* renamed from: X.JsY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44806JsY extends AbstractC65952Twx {
    public final Fragment A00;
    public final List A01;
    public final int A02;
    public final long A03;
    public final UserSession A04;
    public final C47378KwT A05;
    public final C2EY A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // X.AbstractC65952Twx
    public final Fragment A03(int i) {
        DirectCountBasedReaction directCountBasedReaction;
        UserSession userSession = this.A04;
        List list = this.A01;
        String str = null;
        if (((DirectCustomReactionTabModel) list.get(i)).A01 == DirectCustomReactionTabModel.TabType.A03 && (directCountBasedReaction = ((DirectCustomReactionTabModel) list.get(i)).A00) != null) {
            str = directCountBasedReaction.A01;
        }
        DirectCustomReactionTabModel.TabType tabType = ((DirectCustomReactionTabModel) list.get(i)).A01;
        String str2 = this.A09;
        String str3 = this.A08;
        String str4 = this.A07;
        long j = this.A03;
        C2EY c2ey = this.A06;
        int i2 = this.A02;
        C47378KwT c47378KwT = this.A05;
        AbstractC167007dF.A1E(userSession, 0, tabType);
        C14360o3.A0B(c2ey, 8);
        KDJ kdj = new KDJ();
        kdj.A03 = c47378KwT;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("DirectFragment.DIRECT_TABBED_REACTION_EMOJI", str);
        A0b.putParcelable("DirectFragment.DIRECT_CUSTOM_REACTION_TAB_TYPE", tabType);
        A0b.putInt("OFFSCREEN_PAGE_LIMIT", i2);
        A0b.putString(AbstractC111324zv.A00(41), str3);
        A0b.putInt("TAB_POSITION", i);
        JQ1.A0T(A0b, c2ey, str4, j);
        A0b.putString("direct_emoji_thread_id", str2);
        AbstractC03240Dh.A00(A0b, userSession);
        kdj.setArguments(A0b);
        return kdj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44806JsY(Fragment fragment, UserSession userSession, C47378KwT c47378KwT, C2EY c2ey, String str, String str2, String str3, List list, int i, long j) {
        super(fragment);
        AbstractC167017dG.A1R(list, userSession);
        this.A00 = fragment;
        this.A01 = list;
        this.A04 = userSession;
        this.A09 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A03 = j;
        this.A06 = c2ey;
        this.A02 = i;
        this.A05 = c47378KwT;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1006649875);
        int size = this.A01.size();
        C0f9.A0A(-712758032, A03);
        return size;
    }
}
