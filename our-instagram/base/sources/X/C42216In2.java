package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.In2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42216In2 implements InterfaceC24551Hy {
    public boolean A00 = true;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16620sF A03;

    @Override // X.InterfaceC24551Hy
    public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
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

    public C42216In2(UserSession userSession, String str, InterfaceC16620sF interfaceC16620sF) {
        this.A03 = interfaceC16620sF;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        List AoP;
        Object obj;
        C38321qM c38321qM;
        InterfaceC124295jj interfaceC124295jj = (InterfaceC124295jj) interfaceC40801un;
        C14360o3.A0B(interfaceC124295jj, 2);
        if (this.A00 && (AoP = interfaceC124295jj.AoP()) != null) {
            Iterator it = AoP.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C120985dq) obj).A02 != null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C120985dq c120985dq = (C120985dq) obj;
            if (c120985dq != null && (c38321qM = c120985dq.A02) != null) {
                C4AG.A00(this.A01).A01(new C4AD(c38321qM.CFR(), this.A02));
            }
        }
        this.A03.invoke(interfaceC124295jj, Boolean.valueOf(this.A00));
        this.A00 = false;
    }
}
