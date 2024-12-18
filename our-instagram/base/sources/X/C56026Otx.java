package X;

import androidx.fragment.app.Fragment;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Otx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56026Otx implements InterfaceC42271xH, InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public C56026Otx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        String str;
        switch (this.A00) {
            case 0:
                return ((C3DH) obj).A02;
            case 1:
                C55961Ost c55961Ost = (C55961Ost) obj;
                C14360o3.A0B(c55961Ost, 0);
                return C14360o3.A0K(c55961Ost.A00, AbstractC31173DnH.A0t(((C52171N7a) this.A01).A07));
            case 2:
                C55993OtQ c55993OtQ = (C55993OtQ) obj;
                C14360o3.A0B(c55993OtQ, 0);
                if (!AbstractC31174DnI.A1Y(C17060sy.A01.A01(((AbstractC26782Bs6) this.A01).A07()), AbstractC25231BEo.A0t(c55993OtQ.A00.A0i))) {
                    return false;
                }
                return true;
            case 3:
                C3DH c3dh = (C3DH) obj;
                C14360o3.A0B(c3dh, 0);
                User A01 = C17060sy.A01.A01(((AbstractC26782Bs6) this.A01).A07());
                List list = c3dh.A04;
                C14360o3.A06(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C1NB c1nb = ((Reel) it.next()).A0W;
                    if (c1nb != null) {
                        str = c1nb.getId();
                    } else {
                        str = null;
                    }
                    if (AbstractC31174DnI.A1Y(A01, str)) {
                        return true;
                    }
                }
                return false;
            case 4:
                C36092FwS c36092FwS = (C36092FwS) obj;
                C14360o3.A0B(c36092FwS, 0);
                String str2 = c36092FwS.A00;
                C56719PFl c56719PFl = ((C52779NXm) this.A01).A00;
                if (c56719PFl != null) {
                    return str2.equals(c56719PFl.A0A);
                }
                C14360o3.A0F("controller");
                throw C00O.createAndThrow();
            case 5:
                C2AS c2as = (C2AS) obj;
                C14360o3.A0B(c2as, 0);
                java.util.Set set = (java.util.Set) ((C51037Mgm) this.A01).A08.A03.getValue();
                if (set == null) {
                    return false;
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    if (AbstractC50102Ry.A00(((C51751Mta) it2.next()).A02, c2as.A00.getId())) {
                        return true;
                    }
                }
                return false;
            default:
                C2AS c2as2 = (C2AS) obj;
                C14360o3.A0B(c2as2, 0);
                return c2as2.A00.equals(((N5R) this.A01).A06.getValue());
        }
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        int i2;
        int i3;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1487369032);
                int A032 = C0f9.A03(1682702686);
                if (((C3DH) obj).A02) {
                    AbstractC25231BEo.A16((Fragment) this.A01);
                }
                C0f9.A0A(1404522125, A032);
                i = 302428150;
                break;
            case 1:
                A03 = C0f9.A03(-749582918);
                int A033 = C0f9.A03(-370557207);
                C52171N7a.A00((C52171N7a) this.A01, true);
                C0f9.A0A(-155894302, A033);
                i = 1979315754;
                break;
            case 2:
                A03 = C0f9.A03(-1932685645);
                C55993OtQ c55993OtQ = (C55993OtQ) obj;
                int A0N = AbstractC167017dG.A0N(c55993OtQ, 1431098965);
                C08730cb c08730cb = C17060sy.A01;
                C0O c0o = (C0O) this.A01;
                if (AbstractC31174DnI.A1Y(c08730cb.A01(c0o.A07()), AbstractC25231BEo.A0t(c55993OtQ.A00.A0i))) {
                    C51030Mgd A00 = C0O.A00(c0o);
                    String str2 = A00.A00;
                    if (str2 != null) {
                        PZ1.A01(A00, str2, AbstractC141776au.A00(A00), 11);
                    }
                    i2 = -341566188;
                } else {
                    i2 = -1559363805;
                }
                C0f9.A0A(i2, A0N);
                i = 1618092825;
                break;
            case 3:
                A03 = C0f9.A03(-1905098532);
                C3DH c3dh = (C3DH) obj;
                int A0N2 = AbstractC167017dG.A0N(c3dh, -1631029627);
                C08730cb c08730cb2 = C17060sy.A01;
                C0O c0o2 = (C0O) this.A01;
                User A01 = c08730cb2.A01(c0o2.A07());
                List list = c3dh.A04;
                C14360o3.A06(list);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Reel reel = (Reel) it.next();
                        C1NB c1nb = reel.A0W;
                        if (c1nb != null) {
                            str = c1nb.getId();
                        } else {
                            str = null;
                        }
                        if (AbstractC31174DnI.A1Y(A01, str) && reel.A0O(c0o2.A07()).size() > 0) {
                            C51030Mgd A002 = C0O.A00(c0o2);
                            String str3 = A002.A00;
                            if (str3 != null) {
                                PZ1.A01(A002, str3, AbstractC141776au.A00(A002), 11);
                            }
                            i3 = 9983932;
                        }
                    } else {
                        i3 = -862024979;
                    }
                }
                C0f9.A0A(i3, A0N2);
                i = 1025388932;
                break;
            case 4:
                A03 = C0f9.A03(-624943053);
                int A034 = C0f9.A03(-1153563529);
                C52779NXm c52779NXm = (C52779NXm) this.A01;
                C52779NXm.A00(AbstractC166987dD.A0r(c52779NXm.A04), c52779NXm);
                C0f9.A0A(187885712, A034);
                i = -439430337;
                break;
            case 5:
                A03 = C0f9.A03(-178056559);
                C2AS c2as = (C2AS) obj;
                int A035 = C0f9.A03(406259600);
                C14360o3.A0B(c2as, 0);
                User user = c2as.A00;
                if (user.A1t()) {
                    AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                    PZY.A02(user, abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 0);
                }
                C0f9.A0A(893743588, A035);
                i = -1289530632;
                break;
            default:
                A03 = C0f9.A03(-368717555);
                C2AS c2as2 = (C2AS) obj;
                int A0N3 = AbstractC167017dG.A0N(c2as2, -1649950238);
                InterfaceC74953Yl interfaceC74953Yl = ((N5R) this.A01).A06;
                interfaceC74953Yl.Egh(null);
                interfaceC74953Yl.Egh(c2as2.A00);
                C0f9.A0A(92434755, A0N3);
                i = -625184986;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
