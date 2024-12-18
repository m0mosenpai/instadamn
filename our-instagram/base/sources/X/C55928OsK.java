package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.OsK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55928OsK implements InterfaceC24551Hy {
    public final /* synthetic */ OU4 A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ InterfaceC71543Iw A02;

    @Override // X.InterfaceC24551Hy
    public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
        String message;
        C14360o3.A0B(abstractC115105If, 1);
        OU4 ou4 = this.A00;
        Throwable A01 = abstractC115105If.A01();
        String valueOf = String.valueOf(A01);
        String A00 = AbstractC43591JPw.A00(371);
        C14360o3.A0B(valueOf, 1);
        Long l = ou4.A01;
        if (l != null) {
            OU4.A00(ou4).flowEndFail(l.longValue(), A00, valueOf);
        }
        ou4.A01 = null;
        if (A01 != null && (message = A01.getMessage()) != null) {
            AnonymousClass194.A04(message, this.A02);
        }
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVR() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void Dg4() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DgK() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    public C55928OsK(OU4 ou4, Map map, InterfaceC71543Iw interfaceC71543Iw) {
        this.A00 = ou4;
        this.A02 = interfaceC71543Iw;
        this.A01 = map;
    }

    @Override // X.InterfaceC24551Hy
    public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        OU4 ou4 = this.A00;
        Long l = ou4.A01;
        if (l != null) {
            OU4.A00(ou4).flowMarkPoint(l.longValue(), "STREAMING_SUCCESS");
        }
        Long l2 = ou4.A01;
        if (l2 != null) {
            OU4.A00(ou4).flowEndSuccess(l2.longValue());
        }
        ou4.A01 = null;
        this.A02.AID(null);
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        C50627MWo c50627MWo;
        H91 h91 = (H91) interfaceC40801un;
        C14360o3.A0B(h91, 2);
        OU4 ou4 = this.A00;
        Long l = ou4.A01;
        if (l != null) {
            long longValue = l.longValue();
            ou4.A00++;
            OU4.A00(ou4).flowMarkPoint(longValue, AnonymousClass001.A0O("STREAMING_RESPONSE_", ou4.A00));
        }
        C54522O6z c54522O6z = h91.A01;
        if (c54522O6z == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        List<MUW> list = c54522O6z.A01;
        if (list != null) {
            Map map = this.A01;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (MUW muw : list) {
                map.put(muw.A02, new C50627MWo(muw));
                A0q.add(C0eB.A00);
            }
        }
        C51751Mta c51751Mta = c54522O6z.A00;
        if (c51751Mta != null && (c50627MWo = (C50627MWo) this.A01.get(c51751Mta.A02)) != null) {
            c50627MWo.A00 = c51751Mta;
        }
        this.A02.F8s(c54522O6z);
    }
}
