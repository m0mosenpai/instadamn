package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class Jn9 extends AbstractC52922bZ implements InterfaceC193828i3 {
    public InterfaceC193828i3 A00;
    public final InterfaceC58362lv A01;
    public final UserSession A02;
    public final C48263LXm A03;
    public final C47290Kv1 A04;
    public final C05A A05;
    public final C05A A06;

    public Jn9(UserSession userSession, C48263LXm c48263LXm, C47290Kv1 c47290Kv1) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = c48263LXm;
        this.A04 = c47290Kv1;
        this.A05 = AbstractC25225BEi.A1H(AbstractC166987dD.A1E());
        this.A06 = C10E.A00(A00(this));
        C44145JfA c44145JfA = new C44145JfA(this, 1);
        this.A01 = c44145JfA;
        c48263LXm.A02.A09(c44145JfA);
        A01(this);
    }

    @Override // X.InterfaceC193828i3
    public final void CiM(L8Z l8z, int i) {
        C14360o3.A0B(l8z, 1);
        AnonymousClass229.A01(this.A02).A0p(i, l8z.A01(), 3);
    }

    @Override // X.InterfaceC193828i3
    public final boolean DRf(L8Z l8z, int i) {
        Object obj;
        boolean z;
        InterfaceC193828i3 interfaceC193828i3;
        C14360o3.A0B(l8z, 1);
        C48263LXm c48263LXm = this.A03;
        Iterator it = c48263LXm.A02().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C8Z4) obj).BF3() == l8z.A00()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C8Z4 c8z4 = (C8Z4) obj;
        if (c8z4 == null) {
            c8z4 = new Folder(l8z.A01(), null, l8z.A00(), false);
        }
        C22C A01 = AnonymousClass229.A01(this.A02);
        int BF3 = c8z4.BF3();
        String name = c8z4.getName();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(C48263LXm.A00(c48263LXm));
        A1E.addAll(C48263LXm.A01(c48263LXm));
        Folder ACa = c8z4.ACa();
        if (ACa != null) {
            z = ACa.A07;
        } else {
            z = false;
        }
        A01.A21(name, A1E, i, BF3, 3, z);
        InterfaceC193828i3 interfaceC193828i32 = this.A00;
        if ((interfaceC193828i32 != null && interfaceC193828i32.DRf(l8z, i)) || (interfaceC193828i3 = this.A00) == null) {
            return true;
        }
        interfaceC193828i3.CwI(new C51756Mtf(c8z4), i);
        return true;
    }

    @Override // X.InterfaceC193828i3
    public final void Djk(int i, String str) {
        C14360o3.A0B(str, 1);
        this.A06.Egh(new C51757Mtg(new KNP(i), C05F.A00, str));
        InterfaceC193828i3 interfaceC193828i3 = this.A00;
        if (interfaceC193828i3 != null) {
            interfaceC193828i3.Djk(i, str);
        }
    }

    public static final C51757Mtg A00(Jn9 jn9) {
        return new C51757Mtg(KNQ.A00, C05F.A01, AbstractC166997dE.A0p(jn9.A04.A00, 2131973223));
    }

    @Override // X.InterfaceC193828i3
    public final void CiN(C51756Mtf c51756Mtf, int i) {
        int i2 = 2;
        if (((C8Z4) c51756Mtf.A00).CBv() == C05F.A01) {
            i2 = 1;
        }
        AnonymousClass229.A01(this.A02).A0p(i, ((C8Z4) c51756Mtf.A00).getName(), i2);
    }

    @Override // X.InterfaceC193828i3
    public final void CwI(C51756Mtf c51756Mtf, int i) {
        boolean z;
        InterfaceC193828i3 interfaceC193828i3 = this.A00;
        if (interfaceC193828i3 != null) {
            interfaceC193828i3.CwI(c51756Mtf, i);
        }
        Integer CBv = ((C8Z4) c51756Mtf.A00).CBv();
        Integer num = C05F.A01;
        if (CBv == num) {
            AbstractC208329Jr.A09(AbstractC31171DnF.A0D("AlbumPickerViewModel"), this.A02, "cloud_album_tap", "album_picker", AbstractC167007dF.A0n("folder_name", ((C8Z4) c51756Mtf.A00).getName()));
        }
        C22C A01 = AnonymousClass229.A01(this.A02);
        C8Z4 c8z4 = (C8Z4) c51756Mtf.A00;
        int BF3 = c8z4.BF3();
        String name = c8z4.getName();
        int i2 = 2;
        if (c8z4.CBv() == num) {
            i2 = 1;
        }
        C48263LXm c48263LXm = this.A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(C48263LXm.A00(c48263LXm));
        A1E.addAll(C48263LXm.A01(c48263LXm));
        Folder ACa = ((C8Z4) c51756Mtf.A00).ACa();
        if (ACa != null) {
            z = ACa.A07;
        } else {
            z = false;
        }
        A01.A21(name, A1E, i, BF3, i2, z);
    }

    @Override // X.InterfaceC193828i3
    public final void CwM() {
        this.A06.Egh(A00(this));
        InterfaceC193828i3 interfaceC193828i3 = this.A00;
        if (interfaceC193828i3 != null) {
            interfaceC193828i3.CwM();
        }
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A03.A02.A08(this.A01);
    }

    public static final void A01(Jn9 jn9) {
        Object obj;
        Object obj2;
        String str;
        Object obj3;
        Folder ACa;
        String str2;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        ArrayList A1E4 = AbstractC166987dD.A1E();
        C48263LXm c48263LXm = jn9.A03;
        Iterator it = c48263LXm.A02().iterator();
        while (it.hasNext()) {
            C8Z4 c8z4 = (C8Z4) it.next();
            Folder ACa2 = c8z4.ACa();
            if (ACa2 != null && AbstractC166987dD.A1b(ACa2.A01())) {
                if (ACa2.A07) {
                    A1E4.add(new C51756Mtf(c8z4));
                } else {
                    A1E3.add(new C51756Mtf(c8z4));
                }
            }
            C24164Ann ACh = c8z4.ACh();
            if (ACh != null) {
                A1E2.add(new C51756Mtf(ACh));
            }
        }
        int i = 2;
        if (AbstractC25226BEj.A1b(A1E2)) {
            A1E.add(new KNZ(A1E2, 2, 1));
        }
        boolean A1b = AbstractC25226BEj.A1b(A1E4);
        if (AbstractC25226BEj.A1b(A1E3)) {
            if (A1b) {
                i = 1;
            }
            A1E.add(new KNZ(A1E3, 1, i));
        }
        if (A1b) {
            A1E.add(new KNZ(A1E4, 3, 1));
        }
        if (AbstractC25226BEj.A1b(A1E)) {
            ArrayList A02 = c48263LXm.A02();
            Context context = jn9.A04.A00;
            ArrayList A1N = AbstractC16960so.A1N(new KNL(AbstractC166997dE.A0p(context, 2131952890)), new KNJ(AbstractC166997dE.A0p(context, 2131952887)));
            UserSession userSession = jn9.A02;
            if (AbstractC47033Kqq.A00(userSession)) {
                A1N.add(new KNK(AbstractC166997dE.A0p(context, 2131952889)));
            }
            if (!c48263LXm.A04) {
                A1N.add(new KNM(AbstractC166997dE.A0p(context, 2131952891)));
            }
            Iterator it2 = A02.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    Folder ACa3 = ((C8Z4) obj).ACa();
                    if (ACa3 != null && (str2 = ACa3.A03) != null && str2.equals("Meta View") && C18U.A06(C06090Tz.A05, userSession, 36329191326630010L)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C8Z4 c8z42 = (C8Z4) obj;
            if (c8z42 != null) {
                A1N.add(new KNN(c8z42.BF3(), AbstractC166997dE.A0p(context, 2131952888)));
            }
            ArrayList A1E5 = AbstractC166987dD.A1E();
            Iterator it3 = A1N.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                L8Z l8z = (L8Z) next;
                Iterator it4 = A02.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj3 = it4.next();
                        if (((C8Z4) obj3).BF3() == l8z.A00()) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                C8Z4 c8z43 = (C8Z4) obj3;
                if (c8z43 != null && (ACa = c8z43.ACa()) != null && !ACa.A05.isEmpty()) {
                    A1E5.add(next);
                }
            }
            ArrayList A1N2 = AbstractC16960so.A1N(new KNX(A1E5));
            A1N2.addAll(A1E);
            Iterator it5 = c48263LXm.A02().iterator();
            while (true) {
                obj2 = null;
                if (!it5.hasNext()) {
                    break;
                }
                obj2 = it5.next();
                Folder ACa4 = ((C8Z4) obj2).ACa();
                if (ACa4 != null && (str = ACa4.A03) != null && str.equals("Meta View") && C18U.A06(C06090Tz.A05, userSession, 36329191326630010L)) {
                    break;
                }
            }
            C8Z4 c8z44 = (C8Z4) obj2;
            if (c8z44 != null) {
                KNW knw = new KNW(new KNO(c8z44.BF3(), AbstractC166997dE.A0p(context, 2131952888)));
                A1N2.add(new KNY());
                A1N2.add(knw);
            }
            jn9.A05.Egh(A1N2);
        }
    }
}
