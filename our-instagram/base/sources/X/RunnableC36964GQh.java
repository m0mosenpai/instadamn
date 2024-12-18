package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GQh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36964GQh implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ G4S A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public RunnableC36964GQh(Activity activity, G4S g4s, User user, String str, boolean z) {
        this.A02 = user;
        this.A01 = g4s;
        this.A00 = activity;
        this.A03 = str;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        C189478aR A00;
        Fragment c32233EHr;
        List BdF;
        String fanClubId;
        int i;
        Integer C7h;
        User user = this.A02;
        InterfaceC81183jn BdE = user.A03.BdE();
        if (BdE != null && (BdF = BdE.BdF()) != null) {
            boolean z = this.A04;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : BdF) {
                C44Q c44q = (C44Q) obj;
                if (!z || ((C7h = c44q.C7h()) != null && C7h.intValue() == 29)) {
                    A1E.add(obj);
                }
            }
            if (A1E.size() == 1) {
                C44Q c44q2 = (C44Q) A1E.get(0);
                Integer C7h2 = c44q2.C7h();
                if (C7h2 != null) {
                    int intValue = C7h2.intValue();
                    if (intValue != 28 && intValue != 61) {
                        if (intValue == 29) {
                            G4S g4s = this.A01;
                            Activity activity2 = this.A00;
                            String str = this.A03;
                            C44O Ast = c44q2.Ast();
                            if (Ast != null) {
                                i = Ast.AdZ();
                            } else {
                                i = 1;
                            }
                            C28531Zo c28531Zo = C28531Zo.A04;
                            UserSession userSession = g4s.A00;
                            AbstractC31171DnF.A1P(activity2);
                            c28531Zo.A03((FragmentActivity) activity2, AbstractC31171DnF.A0D("pinned_channel_navigator"), userSession, c44q2.C7K(), c44q2.BJP(), user.getId(), str, i);
                            return;
                        }
                    } else {
                        G4S g4s2 = this.A01;
                        activity = this.A00;
                        FanClubInfoDict A0M = AbstractC31172DnG.A0M(user);
                        C189448aO A0y = AbstractC25225BEi.A0y(g4s2.A00);
                        A00 = A0y.A00();
                        if (A0M != null && (fanClubId = A0M.getFanClubId()) != null) {
                            c32233EHr = AbstractC35059FcW.A02(EnumC33373Ep6.A0L, new G3X(0, g4s2, A00, A0y), c44q2.C7K(), fanClubId, null);
                            A00.A02(activity, c32233EHr);
                        } else {
                            AbstractC35234FgS.A01(activity);
                            return;
                        }
                    }
                }
                G4S g4s3 = this.A01;
                Activity activity3 = this.A00;
                C44Q c44q3 = (C44Q) A1E.get(0);
                String str2 = this.A03;
                String BJP = c44q3.BJP();
                if (BJP == null) {
                    return;
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                AbstractC31174DnI.A1T("s", str2, A1E2);
                AbstractC31174DnI.A1T("st", AbstractC31180DnO.A0k(c44q3.C7h()), A1E2);
                AbstractC31174DnI.A1T("cid", user.getId(), A1E2);
                AbstractC41776Ies.A0C(activity3, g4s3.A00, AbstractC35186Ffe.A02(BJP, AbstractC001800i.A0a(A1E2)), "pinned_channel_navigator");
                return;
            }
        }
        G4S g4s4 = this.A01;
        activity = this.A00;
        String str3 = this.A03;
        boolean z2 = this.A04;
        UserSession userSession2 = g4s4.A00;
        C189448aO A0y2 = AbstractC25225BEi.A0y(userSession2);
        AbstractC25226BEj.A1M(activity, A0y2, 2131955108);
        AbstractC25225BEi.A1Q(A0y2, true);
        A0y2.A03 = 0.5f;
        A0y2.A1O = true;
        A00 = A0y2.A00();
        String id = user.getId();
        AbstractC167017dG.A1N(userSession2, id);
        Bundle A0b = AbstractC166987dD.A0b();
        c32233EHr = new C32233EHr();
        AbstractC31173DnH.A1C(A0b, userSession2);
        A0b.putString("ChannelsListFragment.USER_ID", id);
        A0b.putString("ChannelsListFragment.ENTRY_POINT", str3);
        A0b.putBoolean("is_broadcast_channel_only", z2);
        c32233EHr.setArguments(A0b);
        A00.A02(activity, c32233EHr);
    }
}
