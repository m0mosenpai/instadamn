package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.appwidget.DirectRecipientSearchActivity;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import com.instagram.user.model.User;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TGp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64502TGp implements C0JG {
    public final int A00;
    public final Object A01;

    public C64502TGp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        C81663kb A0N;
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1N(userSession, interfaceC03960Jm);
                AbstractC28761aE.A00(userSession).CoS("DirectRecipientSearch");
                List A0F = ((C2DU) AbstractC28761aE.A00(userSession)).A0C.A0F(C4I1.A00);
                DirectRecipientSearchActivity directRecipientSearchActivity = (DirectRecipientSearchActivity) this.A01;
                C14120nc.A00().ATO(new RcX(directRecipientSearchActivity, userSession, directRecipientSearchActivity, directRecipientSearchActivity, A0F));
                interfaceC03960Jm.AIn(null);
                return;
            case 1:
                boolean A1R = AbstractC167007dF.A1R(0, userSession, interfaceC03960Jm);
                C63535Sp2 c63535Sp2 = (C63535Sp2) this.A01;
                SharedPreferences A0G = AbstractC58322PtE.A0G(c63535Sp2.A02, c63535Sp2.A01);
                if (A0G.getBoolean(AnonymousClass001.A0R("com.instagram.direct.appwidget.IS_THREAD_LISTENER_ADDED", userSession.token), false)) {
                    return;
                }
                AbstractC25651Mw.A00(userSession).A01(c63535Sp2.A05, C2Io.class);
                AbstractC25651Mw.A00(userSession).A01(c63535Sp2.A04, C2In.class);
                AbstractC25651Mw.A00(userSession).A01(c63535Sp2.A03, C48032Iq.class);
                A0G.edit().putBoolean(AnonymousClass001.A0R("com.instagram.direct.appwidget.IS_THREAD_LISTENER_ADDED", userSession.token), A1R).apply();
                interfaceC03960Jm.AIn(null);
                return;
            case 2:
                AbstractC167017dG.A1N(userSession, interfaceC03960Jm);
                AbstractC28761aE.A00(userSession).CoS("DirectWidgetRemoteViews");
                C63535Sp2 c63535Sp22 = (C63535Sp2) this.A01;
                Context context = c63535Sp22.A02;
                int i = c63535Sp22.A01;
                SharedPreferences A0G2 = AbstractC58322PtE.A0G(context, i);
                Gson gson = new Gson();
                Type type = new RW0().type;
                C14360o3.A07(type);
                AbstractMap abstractMap = (AbstractMap) gson.A09(A0G2.getString(AnonymousClass001.A0O("current_custom_chat_list", i), ""), type);
                if (abstractMap == null) {
                    abstractMap = AbstractC166987dD.A1G();
                }
                if (!abstractMap.isEmpty()) {
                    HashSet hashSet = c63535Sp22.A06;
                    hashSet.clear();
                    Iterator A14 = AbstractC166997dE.A14(abstractMap);
                    while (A14.hasNext()) {
                        DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) AbstractC31176DnK.A0j(A14);
                        String str = directThreadWidgetItem.A02;
                        if (str != null && (A0N = ((C2DU) AbstractC28761aE.A00(userSession)).A0N(str)) != null) {
                            directThreadWidgetItem.A00 = A0N.Cf8(userSession);
                            hashSet.add(str);
                        } else {
                            A14.remove();
                        }
                    }
                    ArrayList A17 = AbstractC25225BEi.A17(abstractMap.size());
                    Iterator A142 = AbstractC166997dE.A14(abstractMap);
                    while (A142.hasNext()) {
                        A17.add(AbstractC31176DnK.A0j(A142));
                    }
                    c63535Sp22.A00 = A17;
                    SharedPreferences.Editor edit = A0G2.edit();
                    C14360o3.A07(edit);
                    edit.putString(AnonymousClass001.A0O("current_custom_chat_list", i), gson.A0B(abstractMap));
                    edit.apply();
                    return;
                }
                List A0F2 = ((C2DU) AbstractC28761aE.A00(userSession)).A0C.A0F(C4I1.A00);
                HashSet hashSet2 = c63535Sp22.A06;
                hashSet2.clear();
                List<C2EC> A0d = AbstractC001800i.A0d(A0F2, 4);
                ArrayList A0i = AbstractC167007dF.A0i(A0d);
                for (C2EC c2ec : A0d) {
                    List BSH = c2ec.BSH();
                    ArrayList A0i2 = AbstractC167007dF.A0i(BSH);
                    Iterator it = BSH.iterator();
                    while (it.hasNext()) {
                        A0i2.add(((User) it.next()).getUsername());
                    }
                    hashSet2.add(c2ec.C7I());
                    String C7l = c2ec.C7l();
                    String str2 = null;
                    String A0P = AbstractC001800i.A0P(", ", "", "", A0i2, null);
                    String url = ((ImageUrl) C4GQ.A00(userSession, c2ec).A00).getUrl();
                    C14360o3.A07(url);
                    ImageUrl imageUrl = (ImageUrl) C4GQ.A00(userSession, c2ec).A01;
                    if (imageUrl != null) {
                        str2 = imageUrl.getUrl();
                    }
                    A0i.add(new DirectThreadWidgetItem(C7l, A0P, url, str2, c2ec.C7I(), c2ec.Cf8(userSession)));
                }
                c63535Sp22.A00 = A0i;
                interfaceC03960Jm.AIn(null);
                return;
            default:
                AbstractC167007dF.A1K(userSession, interfaceC03960Jm);
                C25671My A00 = AbstractC25651Mw.A00(userSession);
                C63535Sp2 c63535Sp23 = (C63535Sp2) this.A01;
                A00.A02(c63535Sp23.A05, C2Io.class);
                AbstractC25651Mw.A00(userSession).A02(c63535Sp23.A04, C2In.class);
                AbstractC25651Mw.A00(userSession).A02(c63535Sp23.A03, C48032Iq.class);
                interfaceC03960Jm.AIn(null);
                AbstractC58322PtE.A0G(c63535Sp23.A02, c63535Sp23.A01).edit().putBoolean(AnonymousClass001.A0R("com.instagram.direct.appwidget.IS_THREAD_LISTENER_ADDED", userSession.token), false).apply();
                return;
        }
    }
}
