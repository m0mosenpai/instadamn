package X;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WSz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70371WSz implements X75 {
    public final C66422UGr A03;
    public List A01 = new ArrayList();
    public final IdentityHashMap A06 = new IdentityHashMap();
    public List A02 = new ArrayList();
    public C69042Vgj A00 = new Object();
    public final X78 A05 = new WT3();
    public final X77 A04 = new WT1();

    public static int A00(C70371WSz c70371WSz, C69319VlR c69319VlR) {
        C69319VlR c69319VlR2;
        Iterator it = c70371WSz.A02.iterator();
        int i = 0;
        while (it.hasNext() && (c69319VlR2 = (C69319VlR) it.next()) != c69319VlR) {
            i += c69319VlR2.A00;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C69042Vgj A01(C70371WSz c70371WSz, int i) {
        C69042Vgj c69042Vgj;
        C69042Vgj c69042Vgj2 = c70371WSz.A00;
        if (c69042Vgj2.A02) {
            c69042Vgj = new Object();
        } else {
            c69042Vgj2.A02 = true;
            c69042Vgj = c69042Vgj2;
        }
        Iterator it = c70371WSz.A02.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C69319VlR c69319VlR = (C69319VlR) it.next();
            int i3 = c69319VlR.A00;
            if (i3 > i2) {
                c69042Vgj.A01 = c69319VlR;
                c69042Vgj.A00 = i2;
                break;
            }
            i2 -= i3;
        }
        if (c69042Vgj.A01 != null) {
            return c69042Vgj;
        }
        throw AbstractC25230BEn.A0n("Cannot find wrapper for ", i);
    }

    public static void A02(C70371WSz c70371WSz) {
        EnumC65362xY enumC65362xY;
        Iterator it = c70371WSz.A02.iterator();
        while (true) {
            if (it.hasNext()) {
                C69319VlR c69319VlR = (C69319VlR) it.next();
                EnumC65362xY enumC65362xY2 = c69319VlR.A03.mStateRestorationPolicy;
                enumC65362xY = EnumC65362xY.PREVENT;
                if (enumC65362xY2 == enumC65362xY || (enumC65362xY2 == EnumC65362xY.PREVENT_WHEN_EMPTY && c69319VlR.A00 == 0)) {
                    break;
                }
            } else {
                enumC65362xY = EnumC65362xY.ALLOW;
                break;
            }
        }
        C66422UGr c66422UGr = c70371WSz.A03;
        if (enumC65362xY != c66422UGr.mStateRestorationPolicy) {
            c66422UGr.A00(enumC65362xY);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Vgj] */
    public C70371WSz(C66422UGr c66422UGr) {
        this.A03 = c66422UGr;
    }
}
