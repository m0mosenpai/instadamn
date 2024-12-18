package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Grh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38238Grh {
    public static final void A02(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38240Grj c38240Grj, C37524Gfg c37524Gfg, String str, List list, boolean z) {
        long j;
        int i;
        for (int i2 = 0; i2 < 4; i2++) {
            if (i2 == 0) {
                C37549Gg5.A05 = C37549Gg5.A04;
            }
            LinkedList linkedList = c38240Grj.A02;
            C38241Grk c38241Grk = (C38241Grk) linkedList.removeFirst();
            linkedList.add(c38241Grk);
            C14360o3.A0A(c38241Grk);
            if (i2 < list.size()) {
                C47N c47n = (C47N) list.get(C37549Gg5.A04);
                if (z) {
                    j = 35;
                } else {
                    j = 0;
                }
                int i3 = C37549Gg5.A04;
                User CDj = c47n.CDj();
                if (CDj != null) {
                    c38241Grk.A00.postDelayed(new RunnableC38239Gri(activity, interfaceC11380iw, userSession, CDj, c38241Grk, c38240Grj, c37524Gfg, str, list, i3, z), i2 * j);
                }
                if (C37549Gg5.A04 >= list.size() - 1) {
                    i = 0;
                } else {
                    i = C37549Gg5.A04 + 1;
                }
                C37549Gg5.A04 = i;
            } else {
                c38241Grk.A00.setVisibility(4);
            }
        }
    }

    public final void A03(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38240Grj c38240Grj, C37524Gfg c37524Gfg, String str, String str2, String str3, List list) {
        AbstractC25233BEq.A0w(2, userSession, interfaceC11380iw, activity);
        if (C37549Gg5.A08) {
            C37549Gg5.A04 = C37549Gg5.A05;
        } else {
            C37549Gg5.A07 = AbstractC001800i.A0U(list);
            HashMap hashMap = C37549Gg5.A0A;
            hashMap.clear();
            Iterator it = C37549Gg5.A07.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                User CDj = ((C47N) it.next()).CDj();
                if (CDj != null) {
                    hashMap.put(CDj.getId(), Integer.valueOf(i));
                }
                i = i2;
            }
        }
        if (C37549Gg5.A06 == null) {
            C37549Gg5.A06 = new C63702ur(interfaceC11380iw, userSession);
        }
        A02(activity, interfaceC11380iw, userSession, c38240Grj, c37524Gfg, str, C37549Gg5.A07, !C37549Gg5.A08);
        C37549Gg5.A08 = false;
        C0fQ.A00(new ViewOnClickListenerC38248Grr(activity, interfaceC11380iw, userSession, c38240Grj, c37524Gfg, str, 3), c38240Grj.A01);
        C0fQ.A00(new ViewOnClickListenerC55426Ojb(c37524Gfg, userSession, interfaceC11380iw, str2, str, str3, 1), c38240Grj.A00);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0pQ, java.lang.Object] */
    public static final void A01(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, C38241Grk c38241Grk, C38240Grj c38240Grj, C37524Gfg c37524Gfg, String str, List list, int i, boolean z) {
        ?? obj = new Object();
        obj.A00 = i;
        if (list.isEmpty()) {
            if (c37524Gfg != null) {
                c37524Gfg.A00();
                return;
            }
            return;
        }
        if (obj.A00 >= list.size()) {
            obj.A00 = 0;
            C37549Gg5.A04 = 0;
        }
        C47N c47n = (C47N) list.get(obj.A00);
        if (z) {
            c38241Grk.A00.setVisibility(4);
        }
        AbstractC31173DnH.A1F(c38241Grk.A03, user);
        AbstractC31173DnH.A1T(interfaceC11380iw, c38241Grk.A05, user);
        TightTextView tightTextView = c38241Grk.A04;
        tightTextView.A00 = true;
        tightTextView.setText(c47n.ByJ());
        ImageView imageView = c38241Grk.A02;
        Context context = imageView.getContext();
        if (c47n.ByM() != null) {
            C14360o3.A0A(context);
            String moduleName = interfaceC11380iw.getModuleName();
            List ByM = c47n.ByM();
            C14360o3.A0A(ByM);
            imageView.setImageDrawable(AbstractC89513yr.A06(context, Float.valueOf(0.6f), Integer.valueOf((int) AbstractC13880nE.A04(context, 1)), Integer.valueOf(AbstractC53242c7.A0H(activity, R.attr.igds_color_highlight_media_background)), moduleName, ByM, (int) AbstractC13880nE.A04(context, 18)));
            tightTextView.setGravity(0);
            imageView.setVisibility(0);
        } else {
            tightTextView.setGravity(1);
            imageView.setVisibility(8);
        }
        View view = c38241Grk.A00;
        C0fQ.A00(new ViewOnClickListenerC42010Ijf(activity, interfaceC11380iw, userSession, c47n, user, list, str, 2), view);
        FollowButton followButton = c38241Grk.A06;
        AbstractC31173DnH.A0z(followButton.getContext(), followButton, R.drawable.clips_viewer_suggested_users_follow_button_background);
        ((FollowButtonBase) followButton).A07 = true;
        if (user.B7L() == FollowStatus.A08) {
            user.A0k(FollowStatus.A06);
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36330806234334239L)) {
            Boolean B7Q = c47n.B7Q();
            if (B7Q != null) {
                user.A10(B7Q.booleanValue());
            }
            ((FollowButtonBase) followButton).A0A = true;
        }
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
        viewOnAttachStateChangeListenerC110564yT.A08(new C38249Grs(interfaceC11380iw, c47n, c38241Grk, str));
        viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user);
        C0fQ.A00(new ViewOnClickListenerC38250Grt(activity, interfaceC11380iw, userSession, c47n, user, c38241Grk, c38240Grj, c37524Gfg, str, list, obj, z), c38241Grk.A01);
        if (!z) {
            return;
        }
        view.setVisibility(0);
        view.setAlpha(0.25f);
        view.animate().alpha(1.0f).setDuration(300L).start();
        C63702ur c63702ur = C37549Gg5.A06;
        if (c63702ur == null) {
            return;
        }
        c63702ur.A09(new C6PH(A00(interfaceC11380iw, c47n, user, (Integer) C37549Gg5.A0A.get(user.getId()), str)));
    }

    public static final C6PG A00(InterfaceC11380iw interfaceC11380iw, C47N c47n, User user, Integer num, String str) {
        C6PG c6pg = new C6PG("suggested_users_reels_netego", user.getId(), interfaceC11380iw.getModuleName());
        String CEI = c47n.CEI();
        if (CEI != null) {
            c6pg.A07 = CEI;
        }
        c6pg.A00 = AbstractC37302Gc3.A02(num);
        String algorithm = c47n.getAlgorithm();
        if (algorithm != null) {
            c6pg.A04 = algorithm;
        }
        c6pg.A0B = c47n.ByJ();
        c6pg.A08 = str;
        return c6pg;
    }
}
