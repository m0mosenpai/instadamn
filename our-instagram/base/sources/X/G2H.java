package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import android.widget.ScrollView;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class G2H implements InterfaceC37193Ga4 {
    public ScrollView A00;
    public IgTextView A01;
    public IgTextView A02;
    public C84923qg A03;
    public User A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C38321qM A07;
    public final String A08;
    public final String A09;

    @Override // X.InterfaceC37193Ga4
    public final void DDM(C148336m3 c148336m3) {
        String str = c148336m3.A02;
        C14360o3.A0B(str, 0);
        int indexOf = AbstractC22793A3l.A00.indexOf(str);
        UserSession userSession = this.A06;
        String str2 = this.A03.A0G;
        String id = this.A04.getId();
        C162337Ov.A0O(this.A05, userSession, null, Integer.valueOf(indexOf), AbstractC43591JPw.A00(1266), str2, id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, X.Kzy] */
    @Override // X.InterfaceC37193Ga4
    public final void EOe(C2EC c2ec, C2DS c2ds, DirectShareTarget directShareTarget, String str, boolean z) {
        UserSession userSession = this.A06;
        C7TG A00 = AbstractC165967bO.A00(userSession);
        DirectThreadKey BKb = c2ec.BKb();
        String str2 = this.A08;
        String str3 = this.A09;
        C84923qg c84923qg = this.A03;
        String str4 = c84923qg.A0G;
        ?? obj = new Object();
        obj.A01 = str3;
        obj.A00 = str4;
        A00.EOY(null, null, null, obj, BKb, null, str, NetInfoModule.CONNECTION_TYPE_NONE, str2, null, null, z);
        InterfaceC11380iw interfaceC11380iw = this.A05;
        C38321qM c38321qM = this.A07;
        String id = c38321qM.getId();
        id.getClass();
        User A2E = c38321qM.A2E(userSession);
        A2E.getClass();
        C162337Ov.A0L(interfaceC11380iw, userSession, str2, id, A2E.getId());
        String str5 = c84923qg.A0G;
        String id2 = this.A04.getId();
        C14360o3.A0B(str, 0);
        List list = AbstractC22793A3l.A00;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (AbstractC001900j.A0a(str, AbstractC166987dD.A1B(it), false)) {
                    z2 = true;
                    break;
                }
            }
        }
        C162337Ov.A0O(interfaceC11380iw, userSession, Boolean.valueOf(z2), null, "sheet_send_click", str5, id2);
    }

    public G2H(InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectReplyModalPrivateReplyInfo directReplyModalPrivateReplyInfo, String str) {
        this.A06 = userSession;
        this.A08 = str;
        this.A05 = interfaceC11380iw;
        C38321qM A02 = C1DW.A00(userSession).A02(directReplyModalPrivateReplyInfo.A04);
        A02.getClass();
        this.A07 = A02;
        String str2 = directReplyModalPrivateReplyInfo.A06;
        this.A09 = str2 == null ? "" : str2;
        C32955Eem A00 = InterfaceC38901rP.A00.A00();
        String str3 = directReplyModalPrivateReplyInfo.A02;
        str3.getClass();
        A00.A0r = str3;
        A00.A0t = directReplyModalPrivateReplyInfo.A03;
        A00.A0g = Long.valueOf(directReplyModalPrivateReplyInfo.A00);
        this.A03 = new C84923qg(A00.A00());
        User user = new User(directReplyModalPrivateReplyInfo.A07, directReplyModalPrivateReplyInfo.A08);
        this.A04 = user;
        user.A0i(directReplyModalPrivateReplyInfo.A01);
        A02.getId().getClass();
        this.A04.getId();
        C162337Ov.A0S(interfaceC11380iw, userSession, "sheet_flow_launch", this.A03.A0G, this.A04.getId(), null);
    }

    @Override // X.InterfaceC37193Ga4
    public final User CE6() {
        return this.A04;
    }

    @Override // X.InterfaceC37193Ga4
    public final void CNX(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        View A0E = AbstractC31173DnH.A0E(viewStub3, R.layout.fragment_direct_reply_modal_comment_context);
        this.A00 = (ScrollView) A0E.requireViewById(R.id.reply_modal_comment_content_scroll_view);
        this.A01 = AbstractC31172DnG.A0X(A0E, R.id.reply_modal_comment_text);
        this.A02 = AbstractC31172DnG.A0X(A0E, R.id.reply_modal_comment_timeago);
        IgImageView A0Z = AbstractC31172DnG.A0Z(A0E, R.id.reply_modal_commenter_profile);
        User user = this.A04;
        A0Z.setUrl(user.Bhu(), this.A05);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(user.getUsername());
        A0H.setSpan(new C138566Pm(), 0, AbstractC167007dF.A0A(user.getUsername()), 33);
        A0H.append((CharSequence) " ");
        C84923qg c84923qg = this.A03;
        String str = c84923qg.A0e;
        str.getClass();
        A0H.append((CharSequence) str);
        this.A01.setText(A0H);
        IgTextView igTextView = this.A02;
        Context context = igTextView.getContext();
        C14360o3.A0B(context, 0);
        igTextView.setText(C23831Eq.A07(context, c84923qg.A03).toString());
    }
}
