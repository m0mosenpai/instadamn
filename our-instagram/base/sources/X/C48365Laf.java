package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/* renamed from: X.Laf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48365Laf implements C6D2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C48365Laf(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj4;
        this.A04 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        CompletableFuture A00;
        MIL mil;
        int i;
        C1346766r c1346766r;
        Object obj2;
        switch (this.A00) {
            case 0:
                if (obj instanceof C45776KOd) {
                    c1346766r = (C1346766r) this.A01;
                    C14360o3.A0A(c1346766r);
                    obj2 = C45780KOh.A00;
                    c1346766r.A02(obj2);
                    c1346766r.A00();
                    return C0eB.A00;
                }
                if (obj instanceof C45775KOc) {
                    LFN lfn = LFN.A00;
                    UserSession userSession = (UserSession) this.A03;
                    A00 = lfn.A00(userSession);
                    mil = new MIL(10, this.A01, this.A04, this.A02, userSession, obj);
                    i = 2;
                    return A00.thenAccept((Consumer) new M8M(i, mil));
                }
                throw B4Z.A00();
            case 1:
                if (obj instanceof KOr) {
                    LFN lfn2 = LFN.A00;
                    UserSession userSession2 = (UserSession) this.A03;
                    A00 = lfn2.A00(userSession2);
                    mil = new MIL(11, this.A01, this.A04, this.A02, userSession2, obj);
                    i = 3;
                    return A00.thenAccept((Consumer) new M8M(i, mil));
                }
                c1346766r = (C1346766r) this.A01;
                C14360o3.A0A(c1346766r);
                obj2 = C45791KOw.A00;
                c1346766r.A02(obj2);
                c1346766r.A00();
                return C0eB.A00;
            case 2:
                boolean z = obj instanceof KOr;
                KPL kpl = (KPL) this.A03;
                if (z) {
                    kpl.A0C("IMPLICIT_BACKUP_ALREADY_EXISTS");
                } else {
                    kpl.A05("IMPLICIT_BACKUP_CREATION_ATTEMPT");
                    C47553KzO c47553KzO = (C47553KzO) this.A04;
                    LAF laf = (LAF) this.A01;
                    C41761wQ c41761wQ = c47553KzO.A00;
                    Integer num = C05F.A1I;
                    C48675Lg5 c48675Lg5 = new C48675Lg5((Context) this.A02, c47553KzO, kpl);
                    C14360o3.A0B(c41761wQ, 2);
                    c41761wQ.A02(laf.A04(c41761wQ, num), new C29536Czo(c48675Lg5, 0));
                }
                return C0eB.A00;
            default:
                Object obj3 = this.A01;
                Object obj4 = this.A02;
                Object obj5 = this.A03;
                Object obj6 = this.A04;
                if (!AbstractC166987dD.A1a(obj)) {
                    return C42221xC.A09(new C48496Lcn(AbstractC166987dD.A18("Failed to issue receiver fetch request")));
                }
                return C42221xC.A07(new C48458LcB(0, obj5, obj3, obj6, obj4), AbstractC137146It.A00("mailbox_instagram_open_xma_receiver_fetch"));
        }
    }
}
