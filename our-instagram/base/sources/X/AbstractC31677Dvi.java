package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dvi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31677Dvi {
    public static final BigInteger A00 = new BigInteger("ffffffffffffffff", 16);

    public static DirectShareTarget A00(Context context, UserSession userSession, C2EC c2ec) {
        ArrayList A01 = C4GO.A01(c2ec.BSH());
        return new DirectShareTarget(c2ec.C4i(), AbstractC31232DoF.A00(c2ec.C7I(), A01), null, null, C4GQ.A07(context, userSession, c2ec), null, A01, c2ec.CRD(), c2ec.CSF());
    }

    public static ArrayList A01(Context context, UserSession userSession, List list) {
        String str;
        DirectShareTarget directShareTarget;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC37096GWf interfaceC37096GWf = (InterfaceC37096GWf) it.next();
            if (interfaceC37096GWf instanceof C36441G5q) {
                C36441G5q c36441G5q = (C36441G5q) interfaceC37096GWf;
                Integer num = c36441G5q.A02;
                if (num == C05F.A00) {
                    C43707JUs c43707JUs = c36441G5q.A00;
                    ArrayList A01 = C4GO.A01(Collections.unmodifiableList(c43707JUs.A1d));
                    String str2 = c43707JUs.A1L;
                    if (TextUtils.isEmpty(str2) || !c43707JUs.A1r) {
                        str2 = AbstractC101904i3.A00(context, userSession, A01);
                    }
                    if (C4GR.A05(c43707JUs.A0I)) {
                        str = new BigInteger(c43707JUs.A1E).and(A00).toString();
                    } else {
                        str = c43707JUs.A1E;
                    }
                    C83693oE c83693oE = new C83693oE(str);
                    boolean z = c43707JUs.A1e;
                    CreatorSubscriberThreadInfo creatorSubscriberThreadInfo = c43707JUs.A0n;
                    CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = c43707JUs.A0m;
                    DiscoverableThreadInfo discoverableThreadInfo = c43707JUs.A0p;
                    String str3 = c43707JUs.A1B;
                    directShareTarget = new DirectShareTarget(c43707JUs.A0l, creatorBroadcastThreadInfo, creatorSubscriberThreadInfo, discoverableThreadInfo, null, c83693oE, true, c43707JUs.A0y, null, null, Integer.valueOf(c43707JUs.A0I), null, str2, null, str3, c43707JUs.A1P, null, A01, z, false);
                } else if (num == C05F.A01) {
                    List singletonList = Collections.singletonList(new PendingRecipient(c36441G5q.A01));
                    directShareTarget = new DirectShareTarget(new C122145g6(singletonList), true, null, AbstractC101904i3.A07(c36441G5q.A01), singletonList, true);
                }
                A1E.add(directShareTarget);
            }
        }
        return A1E;
    }

    public static ArrayList A02(List list) {
        User user;
        Boolean bool;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list != null && !list.isEmpty()) {
            HashSet A1H = AbstractC166987dD.A1H();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC37096GWf interfaceC37096GWf = (InterfaceC37096GWf) it.next();
                if (interfaceC37096GWf instanceof C36441G5q) {
                    C36441G5q c36441G5q = (C36441G5q) interfaceC37096GWf;
                    C43707JUs c43707JUs = c36441G5q.A00;
                    if (c36441G5q.A02 == C05F.A00 && (((bool = c43707JUs.A11) == null || !bool.booleanValue()) && Boolean.FALSE.equals(c43707JUs.A0z) && Collections.unmodifiableList(c43707JUs.A1d).size() == 1)) {
                        user = (User) AbstractC166987dD.A16(Collections.unmodifiableList(c36441G5q.A00.A1d));
                        if (A1H.add(user)) {
                            A1E.add(new DirectShareTarget(user));
                        }
                    } else if (c36441G5q.A02 == C05F.A01 && A1H.add(c36441G5q.A01)) {
                        user = c36441G5q.A01;
                        A1E.add(new DirectShareTarget(user));
                    }
                }
            }
        }
        return A1E;
    }
}
