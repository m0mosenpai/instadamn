package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;

/* renamed from: X.LmI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49030LmI implements C7Q8 {
    public final /* synthetic */ L5W A00;

    public C49030LmI(L5W l5w) {
        this.A00 = l5w;
    }

    @Override // X.C7Q8
    public final /* bridge */ /* synthetic */ boolean DBb(Object obj, Object obj2) {
        KQ8 kq8 = (KQ8) obj;
        L5W l5w = this.A00;
        if (C18U.A06(C06090Tz.A05, l5w.A04, 36325214187238282L)) {
            User user = new User(kq8.A01, null);
            InterfaceC165017Zq interfaceC165017Zq = l5w.A0C;
            MessageIdentifier messageIdentifier = kq8.A02;
            C83403nh c83403nh = kq8.A00;
            long C8i = c83403nh.C8i();
            interfaceC165017Zq.DT8(((AbstractC49034LmM) kq8).A01, messageIdentifier, "double_tap", c83403nh.A0q(user), null, C8i, c83403nh.A1k(user));
            return true;
        }
        return true;
    }
}
