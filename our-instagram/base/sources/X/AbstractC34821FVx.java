package X;

import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FVx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34821FVx {
    public static final MsysPendingRecipient A00(AnonymousClass172 anonymousClass172) {
        C14360o3.A0B(anonymousClass172, 0);
        String id = anonymousClass172.getId();
        Long BTC = anonymousClass172.BTC();
        if (BTC != null) {
            long longValue = BTC.longValue();
            int BJ8 = anonymousClass172.BJ8();
            String username = anonymousClass172.getUsername();
            String fullName = anonymousClass172.getFullName();
            String shortName = anonymousClass172.getShortName();
            String B8y = anonymousClass172.B8y();
            return new MsysPendingRecipient(anonymousClass172.Bhu(), anonymousClass172.B7L(), anonymousClass172.Bkb(), id, username, fullName, shortName, B8y, BJ8, longValue, anonymousClass172.isVerified(), anonymousClass172.CQw(), anonymousClass172.Cey(), anonymousClass172.CQf(), anonymousClass172.isRestricted(), anonymousClass172.isConnected(), anonymousClass172.CYY(), anonymousClass172.CYb());
        }
        throw new IllegalStateException();
    }

    public static final List A01(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(A00(AbstractC31172DnG.A0p(it)));
        }
        return A0q;
    }
}
