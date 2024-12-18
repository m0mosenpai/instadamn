package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.api.schemas.ImmutablePandoGraphGuardianContent;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EhR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33023EhR extends C17T implements InterfaceC168297fO {
    public InterfaceC169427hG A00;
    public InterfaceC115905Mg A01;
    public List A02;
    public C38321qM A03;
    public User A04;
    public List A05;
    public List A06;
    public List A07;
    public List A08;

    public final void A0q(C1DY c1dy) {
        ArrayList arrayList;
        C38321qM c38321qM;
        ArrayList arrayList2;
        ArrayList A0i;
        ArrayList arrayList3;
        ArrayList arrayList4;
        InterfaceC169427hG interfaceC169427hG = this.A00;
        if (interfaceC169427hG == null) {
            interfaceC169427hG = (InterfaceC169427hG) A05(-323028952, Eh2.class);
        }
        InterfaceC115905Mg interfaceC115905Mg = null;
        if (interfaceC169427hG != null) {
            interfaceC169427hG.E8j(c1dy);
        } else {
            interfaceC169427hG = null;
        }
        this.A00 = interfaceC169427hG;
        List<InterfaceC37277GbU> BAk = BAk();
        if (BAk != null) {
            arrayList = AbstractC167007dF.A0i(BAk);
            for (InterfaceC37277GbU interfaceC37277GbU : BAk) {
                interfaceC37277GbU.E9r(c1dy);
                arrayList.add(interfaceC37277GbU);
            }
        } else {
            arrayList = null;
        }
        this.A05 = arrayList;
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(1939536937, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            C38801rC c38801rC = C38321qM.A0h;
            c38321qM = C38801rC.A00(c1dy, immutablePandoMediaDict);
        } else {
            c38321qM = null;
        }
        this.A03 = c38321qM;
        ImmutableList A08 = A08(1647260332, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList2 = AbstractC167007dF.A0i(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList2, it);
            }
        } else {
            arrayList2 = null;
        }
        this.A06 = arrayList2;
        List<InterfaceC37259GbC> list = this.A02;
        if (list == null && (list = A08(947936814, C33015EhE.class)) == null) {
            A0i = null;
        } else {
            A0i = AbstractC167007dF.A0i(list);
            for (InterfaceC37259GbC interfaceC37259GbC : list) {
                interfaceC37259GbC.E95(c1dy);
                A0i.add(interfaceC37259GbC);
            }
        }
        this.A02 = A0i;
        ImmutableList A082 = A08(-1612548628, ImmutablePandoUserDict.class);
        if (A082 != null) {
            arrayList3 = AbstractC167007dF.A0i(A082);
            Iterator<E> it2 = A082.iterator();
            while (it2.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList3, it2);
            }
        } else {
            arrayList3 = null;
        }
        this.A07 = arrayList3;
        this.A04 = AbstractC31179DnN.A0T(c1dy, this);
        InterfaceC115905Mg interfaceC115905Mg2 = this.A01;
        if (interfaceC115905Mg2 != null || (interfaceC115905Mg2 = (InterfaceC115905Mg) A05(1934820225, HWQ.class)) != null) {
            interfaceC115905Mg2.EBg(c1dy);
            interfaceC115905Mg = interfaceC115905Mg2;
        }
        this.A01 = interfaceC115905Mg;
        ImmutableList A083 = A08(111578632, ImmutablePandoUserDict.class);
        if (A083 != null) {
            arrayList4 = AbstractC167007dF.A0i(A083);
            Iterator<E> it3 = A083.iterator();
            while (it3.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList4, it3);
            }
        } else {
            arrayList4 = null;
        }
        this.A08 = arrayList4;
    }

    @Override // X.InterfaceC168297fO
    public final List Ams() {
        return A08(1666777871, V8U.class);
    }

    @Override // X.InterfaceC168297fO
    public final InterfaceC169407hE B8j() {
        return (InterfaceC169407hE) A05(-1813145531, C33014EhD.class);
    }

    @Override // X.InterfaceC168297fO
    public final List BAk() {
        List list = this.A05;
        if (list == null) {
            return A08(-1237460524, C33034Ehg.class);
        }
        return list;
    }

    @Override // X.InterfaceC168297fO
    public final List Bfn() {
        return A08(1123011774, C33038Ehk.class);
    }

    @Override // X.InterfaceC168297fO
    public final GraphGuardianContent Bz6() {
        return (GraphGuardianContent) A05(-1225322343, ImmutablePandoGraphGuardianContent.class);
    }

    @Override // X.InterfaceC168297fO
    public final InterfaceC169447hK CDy() {
        return (InterfaceC169447hK) A05(1420423129, C33044Ehr.class);
    }

    @Override // X.InterfaceC168297fO
    public final Boolean AeE() {
        return getOptionalBooleanValueByHashCode(-592063754);
    }

    @Override // X.InterfaceC168297fO
    public final Boolean BBJ() {
        return getOptionalBooleanValueByHashCode(-1571575418);
    }

    @Override // X.InterfaceC168297fO
    public final boolean BC6() {
        return getBooleanValueByHashCode(140636634);
    }

    @Override // X.InterfaceC168297fO
    public final Integer BD6() {
        return getOptionalIntValueByHashCode(1809213148);
    }

    @Override // X.InterfaceC168297fO
    public final Boolean BUv() {
        return getOptionalBooleanValueByHashCode(1361887688);
    }

    @Override // X.InterfaceC168297fO
    public final String Bb6() {
        return A0i(1630607433);
    }

    @Override // X.InterfaceC168297fO
    public final String Bk6() {
        return A0i(1582405670);
    }

    @Override // X.InterfaceC168297fO
    public final Boolean Bv9() {
        return getOptionalBooleanValueByHashCode(-525352034);
    }

    @Override // X.InterfaceC168297fO
    public final List C3u() {
        return this.A07;
    }

    @Override // X.InterfaceC168297fO
    public final Integer C5P() {
        return getOptionalIntValueByHashCode(169889308);
    }

    @Override // X.InterfaceC168297fO
    public final Integer C5Q() {
        return getOptionalIntValueByHashCode(-1960232141);
    }

    @Override // X.InterfaceC168297fO
    public final Integer C9y() {
        return getOptionalIntValueByHashCode(-253163307);
    }

    @Override // X.InterfaceC168297fO
    public final Boolean CDZ() {
        return getOptionalBooleanValueByHashCode(1419958838);
    }

    @Override // X.InterfaceC168297fO
    public final List CEC() {
        return this.A08;
    }

    @Override // X.InterfaceC168297fO
    public final Boolean Cbc() {
        return getOptionalBooleanValueByHashCode(-1416067627);
    }

    @Override // X.InterfaceC168297fO
    public final String getNextMaxId() {
        return A0i(1314516130);
    }
}
