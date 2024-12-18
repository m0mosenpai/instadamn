package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4GO, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4GO {
    public static final User A00(UserSession userSession, PendingRecipient pendingRecipient) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(pendingRecipient, 1);
        String str = pendingRecipient.A0B;
        if (str == null) {
            str = "";
        }
        User user = new User(str, pendingRecipient.A0C);
        user.A0i(pendingRecipient.A03);
        user.A0q(pendingRecipient.A0A);
        user.A1C(pendingRecipient.A0b);
        user.A1B(pendingRecipient.A0Z);
        if (pendingRecipient.A01 == 0) {
            user.A0v(pendingRecipient.A0J);
        } else {
            user.A18(pendingRecipient.A0V);
        }
        user.A03.Egg(pendingRecipient.A05);
        user.A03.EQf(Boolean.valueOf(pendingRecipient.A0K));
        user.A03.ERz(Boolean.valueOf(pendingRecipient.A0L));
        user.A0b(pendingRecipient.A01);
        user.A03.EU5(Boolean.valueOf(pendingRecipient.A0N));
        user.A03.EWG(Boolean.valueOf(pendingRecipient.A0U));
        user.A0k(pendingRecipient.A04);
        user.A03.ES7(pendingRecipient.A09);
        user.A03.Ecp(Integer.valueOf(pendingRecipient.A02));
        Integer num = pendingRecipient.A06;
        if (num != null) {
            user.A0l(C16Z.A00(num.intValue()));
        }
        user.A03.EVA(Boolean.valueOf(pendingRecipient.A0S));
        user.A03.EV9(Boolean.valueOf(pendingRecipient.A0R));
        user.A03.EPp(Boolean.valueOf(pendingRecipient.A0I));
        user.A10(pendingRecipient.A0O);
        user.A1D(pendingRecipient.A0c);
        user.A03.EfD(Boolean.valueOf(pendingRecipient.A0e));
        user.A03.EVM(Boolean.valueOf(pendingRecipient.A0F));
        user.A03.EZA(Boolean.valueOf(pendingRecipient.A0X));
        user.A03.ESR(Boolean.valueOf(pendingRecipient.A0M));
        return AnonymousClass189.A00(userSession).A01(user, false, false);
    }

    public static final ArrayList A01(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new PendingRecipient((User) it.next()));
        }
        return AbstractC001800i.A0U(arrayList);
    }
}
