package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HVn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39290HVn extends C17T implements InterfaceC110214xq {
    @Override // X.InterfaceC110214xq
    public final InterfaceC110104xf AdG() {
        return (InterfaceC110104xf) A05(114689134, C39200HNp.class);
    }

    @Override // X.InterfaceC110214xq
    public final InterfaceC110134xi B0l() {
        return (InterfaceC110134xi) A05(512292299, C39201HNq.class);
    }

    @Override // X.InterfaceC110214xq
    public final InterfaceC43505JJr Bp4() {
        return (InterfaceC43505JJr) A05(-469458501, C39205HNu.class);
    }

    @Override // X.InterfaceC110214xq
    public final List BsT() {
        return A0o(-50816531, C39203HNs.class);
    }

    @Override // X.InterfaceC110214xq
    public final InterfaceC43503JJp Bxu() {
        return (InterfaceC43503JJp) A05(-1762451107, C39196HNk.class);
    }

    @Override // X.InterfaceC110214xq
    public final JK2 C8X() {
        return (JK2) A05(-1961016977, C220659op.class);
    }

    @Override // X.InterfaceC110214xq
    public final InterfaceC110164xl C8Y() {
        return (InterfaceC110164xl) A05(1011536495, C39291HVo.class);
    }

    @Override // X.InterfaceC110214xq
    public final List CAa() {
        return A08(-1924529035, C39204HNt.class);
    }

    @Override // X.InterfaceC110214xq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC225849y3.A00(this));
    }

    @Override // X.InterfaceC110214xq
    public final Integer BTu() {
        return getOptionalIntValueByHashCode(410680582);
    }

    @Override // X.InterfaceC110214xq
    public final Boolean Bv7() {
        return getOptionalBooleanValueByHashCode(-410717537);
    }

    @Override // X.InterfaceC110214xq
    public final C110204xp F4L() {
        C110094xe c110094xe;
        C110124xh c110124xh;
        C38704H2p c38704H2p;
        C38698H2j c38698H2j;
        C211809a7 c211809a7;
        C110154xk c110154xk;
        InterfaceC110104xf AdG = AdG();
        ArrayList arrayList = null;
        if (AdG != null) {
            c110094xe = AdG.EsA();
        } else {
            c110094xe = null;
        }
        InterfaceC110134xi B0l = B0l();
        if (B0l != null) {
            c110124xh = B0l.EsB();
        } else {
            c110124xh = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(410680582);
        InterfaceC43505JJr Bp4 = Bp4();
        if (Bp4 != null) {
            c38704H2p = Bp4.EsF();
        } else {
            c38704H2p = null;
        }
        List BsT = BsT();
        ArrayList A0i = AbstractC167007dF.A0i(BsT);
        Iterator it = BsT.iterator();
        while (it.hasNext()) {
            A0i.add(((InterfaceC110074xc) it.next()).EsD());
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-410717537);
        InterfaceC43503JJp Bxu = Bxu();
        if (Bxu != null) {
            c38698H2j = Bxu.Es4();
        } else {
            c38698H2j = null;
        }
        long A03 = A03(1491920727);
        JK2 C8X = C8X();
        if (C8X != null) {
            c211809a7 = C8X.F4M();
        } else {
            c211809a7 = null;
        }
        InterfaceC110164xl C8Y = C8Y();
        if (C8Y != null) {
            c110154xk = C8Y.F4N();
        } else {
            c110154xk = null;
        }
        List CAa = CAa();
        if (CAa != null) {
            arrayList = AbstractC167007dF.A0i(CAa);
            Iterator it2 = CAa.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C5J2) it2.next()).EsE());
            }
        }
        return new C110204xp(c38698H2j, c110094xe, c110124xh, c38704H2p, c211809a7, c110154xk, optionalBooleanValueByHashCode, optionalIntValueByHashCode, A0i, arrayList, A03);
    }

    @Override // X.InterfaceC110214xq
    public final long getTemplateClipsMediaId() {
        return A03(1491920727);
    }
}
