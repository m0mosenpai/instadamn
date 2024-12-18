package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class V9C extends C17T implements XG1 {
    @Override // X.XG1
    public final XG3 AxT() {
        return (XG3) A05(1437321244, C68051V8d.class);
    }

    @Override // X.XG1
    public final InterfaceC72030XFs BkP() {
        return (InterfaceC72030XFs) A05(-1704725185, C68052V8e.class);
    }

    @Override // X.XG1
    public final InterfaceC72035XFx C9h() {
        return (InterfaceC72035XFx) A05(460806889, C68053V8f.class);
    }

    @Override // X.XG1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC68549VVc.A00(this), this);
    }

    @Override // X.XG1
    public final C66644URi F5o() {
        UQy uQy;
        UQz uQz;
        XG3 AxT = AxT();
        UR0 ur0 = null;
        if (AxT != null) {
            uQy = AxT.EvN();
        } else {
            uQy = null;
        }
        InterfaceC72030XFs BkP = BkP();
        if (BkP != null) {
            uQz = BkP.EvO();
        } else {
            uQz = null;
        }
        InterfaceC72035XFx C9h = C9h();
        if (C9h != null) {
            ur0 = C9h.EvP();
        }
        return new C66644URi(uQy, uQz, ur0);
    }
}
