package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.HaL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39381HaL extends AbstractC57542kT {
    public IHP A00;
    public final C25301Lk A01;

    @Override // X.AbstractC57542kT
    public final /* bridge */ /* synthetic */ C1ON A03(Object obj) {
        IHP ihp = (IHP) obj;
        UserSession userSession = this.A02;
        try {
            C41051IFu c41051IFu = ihp.A01;
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0A = AbstractC221915u.A00.A0A(A0O);
            AbstractC41369ISw.A00(A0A, c41051IFu);
            A0A.close();
            String obj2 = A0O.toString();
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0B("igtv/write_seen_state/");
            AbstractC31176DnK.A1P(A0M, "seen_state", obj2);
            return AbstractC31172DnG.A0U(A0M, true);
        } catch (IOException e) {
            C0K8.A0F("PendingIGTVSeenStateRequest", "failed to serialize to json", e);
            return null;
        }
    }

    @Override // X.AbstractC57542kT
    public final Integer A04() {
        return C05F.A0C;
    }

    @Override // X.AbstractC57542kT
    public final void A09() {
        this.A01.A04(AnonymousClass001.A0R("pending_felix_seen_states_", this.A02.userId));
    }

    @Override // X.AbstractC57542kT
    public final void A0K() {
        HashMap hashMap;
        C25301Lk c25301Lk = this.A01;
        UserSession userSession = this.A02;
        IDZ idz = (IDZ) c25301Lk.A02(AnonymousClass001.A0R("pending_felix_seen_states_", userSession.userId), true);
        if (idz != null && (hashMap = idz.A00) != null) {
            Iterator A0l = AbstractC167007dF.A0l(hashMap);
            while (A0l.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A0l);
                Object obj = idz.A00.get(A1B);
                obj.getClass();
                A0H(A1B, obj);
            }
            A0C();
        }
        c25301Lk.A04(AnonymousClass001.A0R("pending_felix_seen_states_", userSession.userId));
    }

    public C39381HaL(C25301Lk c25301Lk, UserSession userSession) {
        super(userSession);
        this.A01 = c25301Lk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.IDZ, java.lang.Object] */
    @Override // X.AbstractC57542kT
    public final void A0A() {
        A02();
        ?? obj = new Object();
        obj.A00 = A08();
        this.A01.A05(AnonymousClass001.A0R("pending_felix_seen_states_", this.A02.userId), obj);
    }
}
