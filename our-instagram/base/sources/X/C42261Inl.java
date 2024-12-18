package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.model.reels.Reel;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Inl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42261Inl implements InterfaceC42271xH, InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public C42261Inl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        User BSW;
        String id;
        String str;
        switch (this.A00) {
            case 0:
                C70073Cr c70073Cr = (C70073Cr) obj;
                C14360o3.A0B(c70073Cr, 0);
                C38016Go3 c38016Go3 = (C38016Go3) this.A01;
                C38018Go6 A01 = c38016Go3.A01();
                User user = c70073Cr.A00;
                if (!A01.AJn(user.getId())) {
                    C36274FzR A00 = FCM.A00(c38016Go3.A0H);
                    String id2 = user.getId();
                    Iterator A16 = AbstractC166997dE.A16(A00.A00);
                    while (A16.hasNext()) {
                        Iterator it = ((List) A16.next()).iterator();
                        while (it.hasNext()) {
                            if (id2.equals(AbstractC25226BEj.A15(it).getId())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            case 1:
                return true;
            case 2:
                C70073Cr c70073Cr2 = (C70073Cr) obj;
                C14360o3.A0B(c70073Cr2, 0);
                id = c70073Cr2.A00.getId();
                str = ((C41635IbQ) this.A01).A05;
                return C14360o3.A0K(id, str);
            case 3:
                C70073Cr c70073Cr3 = (C70073Cr) obj;
                JID jid = ((AdsProductPageFragment) this.A01).A0N;
                if (jid != null && (BSW = jid.BSW()) != null && BSW.getId().equals(c70073Cr3.A00.getId())) {
                    return true;
                }
                return false;
            default:
                C154976xm c154976xm = (C154976xm) obj;
                C14360o3.A0B(c154976xm, 0);
                id = c154976xm.A01;
                str = AbstractC25231BEo.A0t(((C37434GeE) this.A01).A01);
                return C14360o3.A0K(id, str);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        C38321qM c38321qM;
        User A14;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(461685527);
                C70073Cr c70073Cr = (C70073Cr) obj;
                int A0N = AbstractC167017dG.A0N(c70073Cr, -1141925886);
                User user = c70073Cr.A00;
                if (user.CQf()) {
                    C42748Ivm c42748Ivm = (C42748Ivm) ((AbstractC65202xI) ((C38016Go3) this.A01).A01()).A00;
                    for (Object obj2 : c42748Ivm.A04) {
                        if (obj2 instanceof C38321qM) {
                            c38321qM = (C38321qM) obj2;
                        } else if (obj2 instanceof C40971v4) {
                            c38321qM = ((C40971v4) obj2).A0K;
                        }
                        if (c38321qM != null && (A14 = AbstractC25226BEj.A14(c38321qM)) != null && AbstractC31174DnI.A1Y(user, A14.getId())) {
                            C3YS.A00(c42748Ivm.A03).A02(c38321qM, true);
                        }
                    }
                }
                C38018Go6.A00(((C38016Go3) this.A01).A01());
                C0f9.A0A(1231552687, A0N);
                i = 792379274;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(1485163188);
                C3DH c3dh = (C3DH) obj;
                int A032 = C0f9.A03(-927525452);
                C14360o3.A0B(c3dh, 0);
                C42746Ivk c42746Ivk = ((HighlightsMigrationFragment) this.A01).A02;
                if (c42746Ivk != null) {
                    List list = c3dh.A04;
                    C14360o3.A06(list);
                    Object A0I = AbstractC001800i.A0I(list);
                    C14360o3.A07(A0I);
                    Reel reel = (Reel) A0I;
                    C14360o3.A0B(reel, 0);
                    Reel A0M = C1OU.A04(c42746Ivk.A00).A0M(reel.getId());
                    if (A0M != null) {
                        IM8 im8 = new IM8(ProfileGridItemTypeEnum.A04, null, A0M);
                        C39144HKx c39144HKx = c42746Ivk.A04;
                        Number A0Q = AbstractC37300Gc1.A0Q(AbstractC37301Gc2.A0i(reel), c39144HKx.A03);
                        if (A0Q != null) {
                            c39144HKx.A0E(AbstractC37301Gc2.A0i(reel));
                            AbstractC65332xV.A01(c39144HKx, im8, A0Q.intValue(), true);
                        }
                    } else {
                        c42746Ivk.A04.A0E(AbstractC37301Gc2.A0i(reel));
                    }
                    HighlightsMigrationFragment highlightsMigrationFragment = c42746Ivk.A02.A00;
                    highlightsMigrationFragment.A03().A01(highlightsMigrationFragment.A09);
                    C0f9.A0A(1981722975, A032);
                    i = 493991385;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F("highlightsMigrationDataSource");
                throw C00O.createAndThrow();
            case 2:
                A03 = C0f9.A03(648242296);
                C70073Cr c70073Cr2 = (C70073Cr) obj;
                int A0N2 = AbstractC167017dG.A0N(c70073Cr2, -476258790);
                C41635IbQ c41635IbQ = (C41635IbQ) this.A01;
                c41635IbQ.A01 = c70073Cr2.A00;
                InterfaceC56362iU interfaceC56362iU = c41635IbQ.A00;
                if (interfaceC56362iU != null) {
                    interfaceC56362iU.AHh();
                }
                C41635IbQ.A00(c41635IbQ);
                C0f9.A0A(1807902822, A0N2);
                i = -504597788;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(-1753470090);
                int A033 = C0f9.A03(-2126476924);
                IMP imp = ((AdsProductPageFragment) this.A01).A05;
                imp.A00(imp.A00, imp.A01);
                imp.A04.notifyDataSetChanged();
                C0f9.A0A(-2072262634, A033);
                i = 1634117310;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(1403954392);
                int A034 = C0f9.A03(2019410339);
                ((AbstractC37439GeJ) this.A01).A0R(true, true);
                C0f9.A0A(-2044553068, A034);
                i = -1963401792;
                C0f9.A0A(i, A03);
                return;
        }
    }
}
