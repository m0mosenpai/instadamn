package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.Aib, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23908Aib implements InterfaceC50455MPj {
    public final /* synthetic */ C159737El A00;
    public final /* synthetic */ MessageIdentifier A01;

    @Override // X.InterfaceC50455MPj
    public final void EON(C26086BgF c26086BgF, C211689Zc c211689Zc, List list, int i, long j, boolean z, boolean z2) {
        if (c26086BgF != null) {
            C159737El c159737El = this.A00;
            C159737El.A0l(c159737El, Integer.valueOf(C159737El.A01(c159737El)), c26086BgF.A04, c26086BgF.A03, "gallery_picker", true, true);
        }
        this.A00.A1k.A06(c26086BgF, this.A01, c211689Zc, Long.valueOf(j), list, false, z2);
    }

    public C23908Aib(C159737El c159737El, MessageIdentifier messageIdentifier) {
        this.A00 = c159737El;
        this.A01 = messageIdentifier;
    }

    @Override // X.InterfaceC50455MPj
    public final void EKZ() {
        C159737El c159737El = this.A00;
        if (C18U.A06(C06090Tz.A05, c159737El.A1Z, 36325828367627690L)) {
            c159737El.A1G();
        }
    }
}
