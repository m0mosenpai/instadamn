package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.77J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77J extends C77K {
    public final C18920wW A00;
    public final UserSession A01;
    public final C7U0 A02;
    public final C77P A03;

    public C77J(Context context, RecyclerView recyclerView, C18920wW c18920wW, UserSession userSession, final C7U0 c7u0, C77I c77i, final C7LR c7lr, final C7XW c7xw, RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        super(context, recyclerView, c77i, refreshableNestedScrollingParent);
        this.A01 = userSession;
        this.A02 = c7u0;
        this.A00 = c18920wW;
        this.A03 = new C77P(c7u0, c7lr, c7xw) { // from class: X.77O
            public final C7U0 A00;
            public final C7LR A01;
            public final C7XW A02;

            @Override // X.C77P
            public final void F80(C9B7 c9b7) {
                C7YT c7yt;
                String A07;
                Long l;
                String str;
                String str2;
                C7YT c7yt2;
                if (c9b7.A01) {
                    C7XW c7xw2 = this.A02;
                    UserSession userSession2 = c7xw2.A04;
                    int i = AbstractC2056298m.A00(userSession2).A00.getInt("direct_shh_mode_emoji_rain_seen_count", 0);
                    if (i <= 7) {
                        C7LI c7li = c7xw2.A02;
                        if (c7li != null) {
                            c7li.setVisibility(0);
                        }
                        C49036LmO c49036LmO = new C49036LmO(c7xw2);
                        A7H a7h = new A7H(10 - i, AbstractC70049W0j.A00);
                        C7LE c7le = c7xw2.A01;
                        if (c7le == null) {
                            C14360o3.A0F("emitterAnimationCanvasRenderer");
                            throw C00O.createAndThrow();
                        }
                        AbstractC22705A0b.A00(c7le, a7h, new WjQ(c49036LmO, c7xw2), "🤫");
                        InterfaceC19630xq interfaceC19630xq = AbstractC2056298m.A00(userSession2).A00;
                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                        ARD.E7D("direct_shh_mode_emoji_rain_seen_count", interfaceC19630xq.getInt("direct_shh_mode_emoji_rain_seen_count", 0) + 1);
                        ARD.apply();
                    }
                    C7U0 c7u02 = this.A00;
                    InterfaceC163837Ux C7r = c7u02.C7r();
                    InterfaceC83733oI CCa = C7r.CCa();
                    if (CCa != null) {
                        C7LR c7lr2 = this.A01;
                        if (c9b7.A00 == 0) {
                            c7yt2 = C7YT.A04;
                        } else {
                            c7yt2 = C7YT.A05;
                        }
                        c7lr2.A00(c7yt2, C7r.BNh(), CCa);
                        c7u02.C78().F7z(CCa, true, false);
                        return;
                    }
                    return;
                }
                C7U0 c7u03 = this.A00;
                InterfaceC163837Ux C7r2 = c7u03.C7r();
                InterfaceC83733oI CCa2 = C7r2.CCa();
                C83693oE BNh = C7r2.BNh();
                if (BNh != null) {
                    c7u03.C78().F7z(BNh, false, false);
                    if (CCa2 == null) {
                        return;
                    }
                } else if (CCa2 != null) {
                    c7u03.C78().F7z(CCa2, false, false);
                } else {
                    return;
                }
                C7LR c7lr3 = this.A01;
                if (c9b7.A00 == 0) {
                    c7yt = C7YT.A04;
                } else {
                    c7yt = C7YT.A05;
                }
                C83693oE BNh2 = C7r2.BNh();
                Long l2 = null;
                Long l3 = null;
                String str3 = null;
                boolean z = CCa2 instanceof MsysThreadId;
                if (z) {
                    MsysThreadId A04 = AbstractC1345466e.A04(CCa2);
                    if (A04 != null) {
                        l2 = Long.valueOf(A04.A00);
                    }
                    if (BNh2 != null) {
                        str3 = AbstractC1345466e.A07(BNh2);
                    }
                    A07 = str3;
                    l3 = l2;
                } else {
                    A07 = AbstractC1345466e.A07(CCa2);
                }
                String str4 = (String) c7lr3.A01.invoke();
                if (str4 != null) {
                    l = AbstractC003100w.A0k(10, str4);
                } else {
                    l = null;
                }
                Integer num = c7yt.A00;
                Integer num2 = c7yt.A01;
                C18920wW c18920wW2 = c7lr3.A00;
                InterfaceC02590Ai A00 = c18920wW2.A00(c18920wW2.A00, "direct_shh_mode_exit");
                if (1 - num.intValue() != 0) {
                    str = "SWIPE";
                } else {
                    str = "TAP";
                }
                A00.AAP("action", str);
                A00.A7v("is_e2ee", Boolean.valueOf(z));
                A00.AAP("open_thread_id", A07);
                A00.A9K("consistent_thread_fbid", l3);
                A00.A9K("recipient_id", l);
                if (num2 != null) {
                    str2 = "MESSAGE";
                } else {
                    str2 = null;
                }
                A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                A00.Cht();
            }

            {
                this.A00 = c7u0;
                this.A02 = c7xw;
                this.A01 = c7lr;
            }
        };
    }
}
