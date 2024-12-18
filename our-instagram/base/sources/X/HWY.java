package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType;
import com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType;
import com.instagram.model.reels.netego.ShoppingNetegoType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWY extends C17T implements InterfaceC38061pq {
    public List A00;
    public List A01;

    @Override // X.InterfaceC38061pq
    public final JLG AhX() {
        return (JLG) A05(-1682227716, HWV.class);
    }

    @Override // X.InterfaceC38061pq
    public final JLG Awr() {
        return (JLG) A05(1701718064, HWV.class);
    }

    @Override // X.InterfaceC38061pq
    public final JLG Aws() {
        return (JLG) A05(507156368, HWV.class);
    }

    @Override // X.InterfaceC38061pq
    public final ShoppingNetegoInStoryIconType BEh() {
        return (ShoppingNetegoInStoryIconType) A0N(3226745, JD4.A00);
    }

    @Override // X.InterfaceC38061pq
    public final ShoppingNetegoType BWd() {
        return (ShoppingNetegoType) A0N(-1852539703, JD5.A00);
    }

    @Override // X.InterfaceC38061pq
    public final List BhR() {
        List list = this.A00;
        if (list == null) {
            return A08(-1003761308, HWT.class);
        }
        return list;
    }

    @Override // X.InterfaceC38061pq
    public final List Bup() {
        List list = this.A01;
        if (list == null) {
            return A08(109413437, HWU.class);
        }
        return list;
    }

    @Override // X.InterfaceC38061pq
    public final JLG C3d() {
        return (JLG) A05(-2060497896, HWV.class);
    }

    @Override // X.InterfaceC38061pq
    public final ShoppingNetegoInStorySuggestionType C3w() {
        return (ShoppingNetegoInStorySuggestionType) A0N(-1649467243, JD6.A00);
    }

    @Override // X.InterfaceC38061pq
    public final JLG C8s() {
        return (JLG) A05(110371416, HWV.class);
    }

    @Override // X.InterfaceC38061pq
    public final C38041po F5e(C1DY c1dy) {
        C38813H7d c38813H7d;
        C38813H7d c38813H7d2;
        C38813H7d c38813H7d3;
        ArrayList arrayList;
        ArrayList arrayList2;
        C38813H7d c38813H7d4;
        JLG AhX = AhX();
        C38813H7d c38813H7d5 = null;
        if (AhX != null) {
            c38813H7d = AhX.F5b();
        } else {
            c38813H7d = null;
        }
        JLG Awr = Awr();
        if (Awr != null) {
            c38813H7d2 = Awr.F5b();
        } else {
            c38813H7d2 = null;
        }
        JLG Aws = Aws();
        if (Aws != null) {
            c38813H7d3 = Aws.F5b();
        } else {
            c38813H7d3 = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1992012396);
        ShoppingNetegoInStoryIconType BEh = BEh();
        Long A0P = AbstractC37303Gc4.A0P(this);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1947593954);
        ShoppingNetegoType BWd = BWd();
        List BhR = BhR();
        if (BhR != null) {
            arrayList = AbstractC167007dF.A0i(BhR);
            Iterator it = BhR.iterator();
            while (it.hasNext()) {
                arrayList.add(((JMP) it.next()).F5Z(c1dy));
            }
        } else {
            arrayList = null;
        }
        List Bup = Bup();
        if (Bup != null) {
            arrayList2 = AbstractC167007dF.A0i(Bup);
            Iterator it2 = Bup.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((JMG) it2.next()).F5a(c1dy));
            }
        } else {
            arrayList2 = null;
        }
        JLG C3d = C3d();
        if (C3d != null) {
            c38813H7d4 = C3d.F5b();
        } else {
            c38813H7d4 = null;
        }
        ShoppingNetegoInStorySuggestionType C3w = C3w();
        JLG C8s = C8s();
        if (C8s != null) {
            c38813H7d5 = C8s.F5b();
        }
        return new C38041po(c38813H7d, c38813H7d2, c38813H7d3, c38813H7d4, c38813H7d5, BEh, C3w, BWd, optionalBooleanValueByHashCode, optionalIntValueByHashCode, A0P, AbstractC37304Gc5.A0f(this), A0i(273609178), arrayList, arrayList2);
    }

    @Override // X.InterfaceC38061pq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I33.A00(this));
    }

    @Override // X.InterfaceC38061pq
    public final Integer Azg() {
        return getOptionalIntValueByHashCode(-1992012396);
    }

    @Override // X.InterfaceC38061pq
    public final Long BF7() {
        return AbstractC37303Gc4.A0P(this);
    }

    @Override // X.InterfaceC38061pq
    public final String CAR() {
        return AbstractC37304Gc5.A0f(this);
    }

    @Override // X.InterfaceC38061pq
    public final String CCG() {
        return A0i(273609178);
    }

    @Override // X.InterfaceC38061pq
    public final Boolean Cf0() {
        return getOptionalBooleanValueByHashCode(-1947593954);
    }

    @Override // X.InterfaceC38061pq
    public final InterfaceC38061pq EBj(C1DY c1dy) {
        ArrayList arrayList;
        List<JMP> BhR = BhR();
        ArrayList arrayList2 = null;
        if (BhR != null) {
            arrayList = AbstractC167007dF.A0i(BhR);
            for (JMP jmp : BhR) {
                jmp.EBh(c1dy);
                arrayList.add(jmp);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        List<JMG> Bup = Bup();
        if (Bup != null) {
            arrayList2 = AbstractC167007dF.A0i(Bup);
            for (JMG jmg : Bup) {
                jmg.EBi(c1dy);
                arrayList2.add(jmg);
            }
        }
        this.A01 = arrayList2;
        return this;
    }
}
