package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NativeInfoCardCommentLayout;

/* renamed from: X.V8k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68058V8k extends C17T implements XG9 {
    @Override // X.XG9
    public final InterfaceC43559JLt Apj() {
        return (InterfaceC43559JLt) A05(795620109, HRI.class);
    }

    @Override // X.XG9
    public final XGA BEv() {
        return (XGA) A05(-1390435021, C68062V8q.class);
    }

    @Override // X.XG9
    public final NativeInfoCardCommentLayout BMO() {
        return (NativeInfoCardCommentLayout) A0N(-1109722326, C71805X5j.A00);
    }

    @Override // X.XG9
    public final InterfaceC43559JLt CDx() {
        return (InterfaceC43559JLt) A05(339340927, HRI.class);
    }

    @Override // X.XG9
    public final InterfaceC72036XFy CE1() {
        return (InterfaceC72036XFy) A05(-1382195328, V8r.class);
    }

    @Override // X.XG9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC68372VOg.A00(this), this);
    }

    @Override // X.XG9
    public final UR5 Ex7() {
        H4N h4n;
        URB urb;
        H4N h4n2;
        InterfaceC43559JLt Apj = Apj();
        URC urc = null;
        if (Apj != null) {
            h4n = Apj.ExC();
        } else {
            h4n = null;
        }
        XGA BEv = BEv();
        if (BEv != null) {
            urb = BEv.ExD();
        } else {
            urb = null;
        }
        NativeInfoCardCommentLayout BMO = BMO();
        InterfaceC43559JLt CDx = CDx();
        if (CDx != null) {
            h4n2 = CDx.ExC();
        } else {
            h4n2 = null;
        }
        InterfaceC72036XFy CE1 = CE1();
        if (CE1 != null) {
            urc = CE1.ExE();
        }
        return new UR5(BMO, h4n, h4n2, urb, urc);
    }
}
