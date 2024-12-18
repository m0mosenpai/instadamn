package X;

import android.app.Activity;
import android.graphics.drawable.shapes.RectShape;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lz5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49798Lz5 implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C49798Lz5(C1346766r c1346766r, C41761wQ c41761wQ, C47707L4o c47707L4o, int i) {
        this.A00 = i;
        switch (i) {
            case 1:
                this.A01 = c1346766r;
                this.A03 = c47707L4o;
                this.A02 = c41761wQ;
                break;
            case 2:
                this.A01 = c1346766r;
                this.A02 = c41761wQ;
                this.A03 = c47707L4o;
                break;
            default:
                this.A03 = c47707L4o;
                this.A01 = c1346766r;
                this.A02 = c41761wQ;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Exception exc;
        Object kow;
        C42221xC A00;
        InterfaceC42241xE c44109JeZ;
        LK0 A04;
        LSI lsi;
        C1346766r c1346766r;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        AbstractC2056898s abstractC2056898s;
        String str;
        C41761wQ c41761wQ;
        UserSession userSession;
        C116155Nu c116155Nu;
        PushChannelType pushChannelType;
        String str2;
        String str3;
        int i2;
        OUD oud;
        switch (this.A00) {
            case 0:
                if (!((EnumC61185Rgl) obj).A01) {
                    L97 l97 = (L97) this.A03;
                    C56138Ovy c56138Ovy = l97.A05;
                    C45125Jxu c45125Jxu = (C45125Jxu) this.A02;
                    List list = (List) c45125Jxu.A04;
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        A0q.add(((C45048Jwd) it.next()).A04);
                    }
                    c56138Ovy.A04(new C48204LVc(0, c45125Jxu, l97, this.A01), A0q, null);
                    return;
                }
                InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
                interfaceC24741Ir.F8s(new C45155Jyv("iap_init_failure", null, null));
                interfaceC24741Ir.AID(null);
                return;
            case 1:
                AbstractC46420Kgg abstractC46420Kgg = (AbstractC46420Kgg) obj;
                if (C14360o3.A0K(abstractC46420Kgg, C45782KOj.A00)) {
                    C1346766r c1346766r2 = (C1346766r) this.A01;
                    c1346766r2.A02(KOX.A00);
                    C47707L4o c47707L4o = (C47707L4o) this.A03;
                    boolean A08 = ((C48519LdH) c47707L4o.A07.getValue()).A08();
                    C41761wQ c41761wQ2 = (C41761wQ) this.A02;
                    if (A08) {
                        C14360o3.A0A(c1346766r2);
                        A00 = C42221xC.A06(new C44091JeG(c41761wQ2, c47707L4o, 2));
                        c44109JeZ = new C49798Lz5(c1346766r2, c41761wQ2, c47707L4o, 3);
                    } else {
                        C14360o3.A0B(c41761wQ2, 0);
                        A00 = C48486Lcd.A00(c47707L4o.A02, c41761wQ2, new MM0(c47707L4o, 26), 1);
                        c44109JeZ = new C44109JeZ(1, c1346766r2, c47707L4o);
                    }
                    c41761wQ2.A02(A00, c44109JeZ);
                    return;
                }
                if (abstractC46420Kgg instanceof C45783KOk) {
                    exc = ((C45783KOk) abstractC46420Kgg).A00;
                } else {
                    exc = null;
                }
                kow = new KOW(exc, "Failed to save to cloud prefs");
                KPQ kpq = ((C47707L4o) this.A03).A05;
                List list2 = kpq.A00;
                list2.add("Failed to save to cloud prefs");
                AbstractC43594JPz.A1H(kpq, list2);
                kpq.A04(C05F.A01);
                c1346766r = (C1346766r) this.A01;
                C14360o3.A0A(c1346766r);
                c1346766r.A02(kow);
                c1346766r.A00();
                return;
            case 2:
                A04 = ((LAI) obj).A04(EnumC46206Kci.A08);
                lsi = new LSI(1, this.A03, this.A01, this.A02);
                A04.A04(lsi);
                return;
            case 3:
                C14360o3.A0B(obj, 0);
                if (obj instanceof C44826Jt0) {
                    ((C47707L4o) this.A03).A05.A02();
                    c1346766r = (C1346766r) this.A01;
                    obj2 = C45774KOb.A00;
                    c1346766r.A02(obj2);
                    c1346766r.A00();
                    c1346766r.A00();
                    return;
                }
                C41761wQ c41761wQ3 = (C41761wQ) this.A02;
                C47707L4o c47707L4o2 = (C47707L4o) this.A03;
                C14360o3.A0B(c41761wQ3, 0);
                C42221xC A002 = C48486Lcd.A00(c47707L4o2.A02, c41761wQ3, new MM0(c47707L4o2, 26), 1);
                c1346766r = (C1346766r) this.A01;
                C44109JeZ.A00(A002, c41761wQ3, c1346766r, c47707L4o2, 2);
                c1346766r.A00();
                return;
            case 4:
                A04 = (LK0) obj;
                obj3 = this.A01;
                obj4 = this.A03;
                obj5 = this.A02;
                i = 2;
                lsi = new LSI(i, obj4, obj3, obj5);
                A04.A04(lsi);
                return;
            case 5:
                if (obj instanceof K53) {
                    c1346766r = (C1346766r) this.A01;
                    c1346766r.A02(C45787KOo.A00);
                    LAF laf = (LAF) this.A03;
                    if (((C48519LdH) laf.A08.getValue()).A08()) {
                        C41761wQ c41761wQ4 = (C41761wQ) this.A02;
                        C14360o3.A0A(c1346766r);
                        c41761wQ4.A02(C42221xC.A06(new C44091JeG(c41761wQ4, laf, 4)), new C49798Lz5(c1346766r, c41761wQ4, laf, 7));
                        return;
                    } else {
                        kow = new C45786KOn("Invalid backup status for VD creation");
                        laf.A06.A00.add("Invalid backup status for VD creation");
                        LK0.A01(laf.A00(laf.A00), laf, 9);
                        C14360o3.A0A(c1346766r);
                        c1346766r.A02(kow);
                        c1346766r.A00();
                        return;
                    }
                }
                kow = new C45786KOn("Failed to backup RC");
                LAF laf2 = (LAF) this.A03;
                laf2.A06.A00.add("Failed to backup RC");
                LK0.A01(laf2.A00(laf2.A00), laf2, 10);
                c1346766r = (C1346766r) this.A01;
                C14360o3.A0A(c1346766r);
                c1346766r.A02(kow);
                c1346766r.A00();
                return;
            case 6:
                A04 = (LK0) obj;
                obj3 = this.A01;
                obj4 = this.A03;
                obj5 = this.A02;
                i = 3;
                lsi = new LSI(i, obj4, obj3, obj5);
                A04.A04(lsi);
                return;
            case 7:
                C14360o3.A0B(obj, 0);
                if (obj instanceof C44826Jt0) {
                    LAF laf3 = (LAF) this.A03;
                    LK0.A01(laf3.A00(laf3.A00), laf3, 13);
                    c1346766r = (C1346766r) this.A01;
                    obj2 = C27190Bz9.A00;
                    c1346766r.A02(obj2);
                    c1346766r.A00();
                    c1346766r.A00();
                    return;
                }
                C41761wQ c41761wQ5 = (C41761wQ) this.A02;
                LAF laf4 = (LAF) this.A03;
                C42221xC A01 = laf4.A01(c41761wQ5);
                c1346766r = (C1346766r) this.A01;
                C44109JeZ.A00(A01, c41761wQ5, c1346766r, laf4, 4);
                c1346766r.A00();
                return;
            case 8:
                A04 = (LK0) obj;
                obj3 = this.A01;
                obj4 = this.A03;
                obj5 = this.A02;
                i = 4;
                lsi = new LSI(i, obj4, obj3, obj5);
                A04.A04(lsi);
                return;
            case 9:
                AbstractC46423Kgj abstractC46423Kgj = (AbstractC46423Kgj) obj;
                if (C14360o3.A0K(abstractC46423Kgj, C45790KOv.A00)) {
                    ((AbstractC2056898s) this.A02).A05("BLOCKSTORE_RECOVERY_CODE_FETCHED");
                    return;
                }
                if (C14360o3.A0K(abstractC46423Kgj, C45792KOx.A00)) {
                    ((AbstractC2056898s) this.A02).A02();
                    Jn4.A01((Jn4) this.A03);
                    return;
                }
                if (!C14360o3.A0K(abstractC46423Kgj, KOu.A00) && !C14360o3.A0K(abstractC46423Kgj, C45791KOw.A00) && !(abstractC46423Kgj instanceof KOt)) {
                    throw B4Z.A00();
                }
                Jn4 jn4 = (Jn4) this.A03;
                jn4.A0M.F8m(EnumC46140Kbe.A02);
                if (abstractC46423Kgj instanceof KOt) {
                    abstractC2056898s = (AbstractC2056898s) this.A02;
                    str = ((KOt) abstractC46423Kgj).A00;
                } else if (abstractC46423Kgj instanceof KOu) {
                    abstractC2056898s = (AbstractC2056898s) this.A02;
                    str = "Blockstore Not Supported";
                } else {
                    if (abstractC46423Kgj instanceof C45791KOw) {
                        AbstractC2056898s abstractC2056898s2 = (AbstractC2056898s) this.A02;
                        abstractC2056898s2.A05("BLOCKSTORE_RECOVERY_CODE_NOT_FOUND");
                        abstractC2056898s2.A01();
                    }
                    LGY lgy = jn4.A08;
                    Activity activity = (Activity) this.A01;
                    Integer num = C05F.A0C;
                    lgy.A02(activity, AbstractC166987dD.A0b(), EnumC46149Kbn.A04, num, null);
                    return;
                }
                C14360o3.A0B(str, 0);
                abstractC2056898s.A07("BLOCKSTORE_FAILURE_REASON", str);
                LGY lgy2 = jn4.A08;
                Activity activity2 = (Activity) this.A01;
                Integer num2 = C05F.A0C;
                lgy2.A02(activity2, AbstractC166987dD.A0b(), EnumC46149Kbn.A04, num2, null);
                return;
            case 10:
                L1J l1j = (L1J) obj;
                AnonymousClass791 anonymousClass791 = new AnonymousClass791(new RectShape(), AnonymousClass790.A00);
                anonymousClass791.A00 = l1j.A01;
                anonymousClass791.A02 = false;
                AnonymousClass791.A00(anonymousClass791);
                ((IgProgressImageView) this.A01).setBitmapAndImageRenderer(l1j.A02, anonymousClass791);
                MRJ mrj = (MRJ) this.A02;
                mrj.DSH(LnR.A00);
                mrj.DfQ();
                ((InterfaceC16660sJ) this.A03).invoke(Float.valueOf(l1j.A00));
                return;
            case 11:
                String A0Q = AbstractC167027dH.A0Q(obj);
                SimpleImageUrl A0t = AbstractC25225BEi.A0t(A0Q);
                MRJ mrj2 = (MRJ) this.A03;
                ImageUrlBase.A00(A0t);
                AbstractC05810Sj.A00(((ImageUrlBase) A0t).A00);
                String str4 = ((ImageUrlBase) A0t).A00.A03;
                C14360o3.A07(str4);
                mrj2.DSH(new JUO(str4));
                ((IgImageView) this.A02).setUrl(AbstractC25225BEi.A0t(A0Q), (InterfaceC11380iw) this.A01);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((C49298Lqs) this.A03).A00.E4s(new C48032Iq((InterfaceC83733oI) ((C3o9) this.A02)));
                c41761wQ = (C41761wQ) this.A01;
                c41761wQ.A01();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                FragmentActivity fragmentActivity = (FragmentActivity) this.A02;
                C47920LEp c47920LEp = (C47920LEp) this.A03;
                C31320Dpg c31320Dpg = new C31320Dpg(fragmentActivity, (InterfaceC11380iw) this.A01, c47920LEp.A03);
                JUk.A00(EnumC46292KeO.PROACTIVE_WARNING_BANNER_PRIMARY_ACTION, c47920LEp.A04);
                c31320Dpg.A00(((C45127Jxw) obj).A01);
                return;
            case 14:
                EnumC46176KcE enumC46176KcE = (EnumC46176KcE) obj;
                if (enumC46176KcE != null) {
                    int ordinal = enumC46176KcE.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            return;
                        }
                        if (ordinal == 4) {
                            userSession = ((L9c) this.A03).A01;
                            c116155Nu = (C116155Nu) this.A01;
                            pushChannelType = (PushChannelType) this.A02;
                            str2 = "processPushPathNotification: invalid mailbox";
                            C14360o3.A0B(pushChannelType, 3);
                            str3 = pushChannelType.A01;
                            i2 = 7;
                            AbstractC44086JeB.A02(c116155Nu, userSession, str2, str3, i2);
                            return;
                        }
                    } else {
                        userSession = ((L9c) this.A03).A01;
                        c116155Nu = (C116155Nu) this.A01;
                        PushChannelType pushChannelType2 = (PushChannelType) this.A02;
                        str2 = "insert push notification in the push path";
                        C14360o3.A0B(pushChannelType2, 3);
                        str3 = pushChannelType2.A01;
                        i2 = 10;
                        AbstractC44086JeB.A02(c116155Nu, userSession, str2, str3, i2);
                        return;
                    }
                }
                userSession = ((L9c) this.A03).A01;
                c116155Nu = (C116155Nu) this.A01;
                pushChannelType = (PushChannelType) this.A02;
                str2 = "processPushPathNotification: Unable to insert into DB";
                C14360o3.A0B(pushChannelType, 3);
                str3 = pushChannelType.A01;
                i2 = 7;
                AbstractC44086JeB.A02(c116155Nu, userSession, str2, str3, i2);
                return;
            default:
                int ordinal2 = ((EnumC61182Rgi) ((QIy) obj).A04).ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 5) {
                            oud = (OUD) this.A02;
                        } else {
                            return;
                        }
                    } else {
                        oud = (OUD) this.A02;
                        C147716kw c147716kw = (C147716kw) this.A01;
                        C54801OJv c54801OJv = c147716kw.A08;
                        if (c54801OJv != null) {
                            c54801OJv.A00(C05F.A0Y);
                        }
                        C193328hC A0O = AbstractC31175DnJ.A0O(c147716kw.A0K);
                        A0O.A0A(2131965601);
                        A0O.A09(2131965600);
                        A0O.A07();
                        AbstractC166987dD.A1W(A0O);
                        NRG A003 = AbstractC54273Nyt.A00(c147716kw.A0N);
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A003.A00, "ig_user_pay_viewer_payment_error_dialog_shown");
                        OCW ocw = A003.A01;
                        A0f.AAP("media_id", ocw.A02);
                        A0f.AAP("container_module", ocw.A01);
                        A0f.AAP("product_type", ocw.A03);
                        A0f.AAP(DevServerEntity.COLUMN_DESCRIPTION, "");
                        A0f.Cht();
                    }
                    c41761wQ = oud.A01;
                    c41761wQ.A01();
                    return;
                }
                OUD.A00(((C109724wz) this.A03).A01, (C147716kw) this.A01, (OUD) this.A02);
                return;
        }
    }

    public C49798Lz5(C1346766r c1346766r, C41761wQ c41761wQ, LAF laf, int i) {
        this.A00 = i;
        switch (i) {
            case 5:
                this.A01 = c1346766r;
                this.A03 = laf;
                this.A02 = c41761wQ;
                break;
            case 6:
                this.A01 = c1346766r;
                this.A03 = c41761wQ;
                this.A02 = laf;
                break;
            default:
                this.A03 = laf;
                this.A01 = c1346766r;
                this.A02 = c41761wQ;
                break;
        }
    }

    public C49798Lz5(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }
}
