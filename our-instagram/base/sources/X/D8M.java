package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class D8M extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8M(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int A00;
        C07T lifecycle;
        C07N c07n;
        InterfaceC52932ba defaultViewModelProviderFactory;
        C07N c07n2;
        Object invoke;
        C75113Zb c75113Zb;
        Object obj;
        C07T lifecycle2;
        switch (this.A00) {
            case 0:
                Context A0P = AbstractC25226BEj.A0P(this.A01);
                C26532Bnr c26532Bnr = (C26532Bnr) this.A02;
                UserSession userSession = c26532Bnr.A01;
                InterfaceC60442pS interfaceC60442pS = c26532Bnr.A05;
                CP2 cp2 = c26532Bnr.A03;
                AnonymousClass399 anonymousClass399 = c26532Bnr.A07;
                C33P c33p = c26532Bnr.A0A;
                C3VU c3vu = c26532Bnr.A04;
                C41V AmT = c3vu.AmT();
                boolean z = c26532Bnr.A0E;
                C57332k8 c57332k8 = c26532Bnr.A09;
                return new CUS(A0P, c26532Bnr.A00, userSession, c26532Bnr.A02, cp2, c3vu, AmT, interfaceC60442pS, c26532Bnr.A06, anonymousClass399, c26532Bnr.A08, c57332k8, c33p, c26532Bnr.A0B, c26532Bnr.A0C, c26532Bnr.A0D, z);
            case 1:
                UserSession userSession2 = ((CSF) this.A02).A00;
                C38321qM c38321qM = (C38321qM) this.A01;
                return new C139366Sr(AbstractC41071vF.A07(userSession2, c38321qM), c38321qM.A33());
            case 2:
                ((C22848A5r) this.A02).A00.DZp(MediaControlEventSourceEnum.A05, (C38321qM) this.A01);
                return C0eB.A00;
            case 3:
                C07X c07x = (C07X) this.A01;
                if (c07x != null && (lifecycle2 = c07x.getLifecycle()) != null) {
                    lifecycle2.A0A((C65968TxL) this.A02);
                }
                return C0eB.A00;
            case 4:
                C07X c07x2 = (C07X) ((C26447BmU) this.A02).A02.A00.A01.get();
                C65968TxL c65968TxL = new C65968TxL(this.A01, 1);
                if (c07x2 != null && (lifecycle = c07x2.getLifecycle()) != null) {
                    lifecycle.A09(c65968TxL);
                }
                return AbstractC25225BEi.A0f(new D8M(3, c07x2, c65968TxL));
            case 5:
            case 10:
                c75113Zb = (C75113Zb) this.A01;
                obj = this.A02;
                c75113Zb.A0M((C33R) obj, null, false);
                return C0eB.A00;
            case 6:
            case 7:
                C92494Cg c92494Cg = (C92494Cg) this.A01;
                c92494Cg.A01(DCQ.A00);
                C006802i c006802i = c92494Cg.A00;
                if (c006802i != null) {
                    c006802i.markerPoint(1056313521, "on_loading_start");
                }
                ((C51762Yz) this.A02).A00();
                return C0eB.A00;
            case 8:
                InterfaceC41501vz interfaceC41501vz = (InterfaceC41501vz) this.A02;
                if (interfaceC41501vz != null) {
                    ((C25671My) this.A01).A02(interfaceC41501vz, LYK.class);
                }
                return C0eB.A00;
            case 9:
                return ((C5LT) this.A02).A00.A03.invoke(AbstractC25226BEj.A0P(this.A01));
            case 11:
                ((InterfaceC909543n) this.A01).DME((C38321qM) this.A02);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                String id = ((C38321qM) this.A02).getId();
                if (id != null) {
                    ((InterfaceC31057Dkz) this.A01).DcB(id);
                }
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((InterfaceC31057Dkz) this.A01).DPq((C38321qM) this.A02);
                return C0eB.A00;
            case 14:
                ((C28361CfL) this.A02).A00.D31((C38321qM) this.A01);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                UserSession userSession3 = ((C22850A5t) this.A02).A00;
                C38321qM c38321qM2 = (C38321qM) this.A01;
                return new C139366Sr(AbstractC41071vF.A07(userSession3, c38321qM2), c38321qM2.A33());
            case 16:
                ((C85453ra) this.A02).A00.A09.A0W((C85563rl) this.A01);
                return C0eB.A00;
            case 17:
                c75113Zb = ((C100874fz) this.A02).A01;
                obj = this.A01;
                c75113Zb.A0M((C33R) obj, null, false);
                return C0eB.A00;
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
                C114205Dh c114205Dh = (C114205Dh) this.A01;
                return new C207559Gj((View) this.A02, (int) C119365at.A01(c114205Dh.A00()), (int) c114205Dh.A03, false);
            case 21:
                ((C77133cz) this.A02).A01.BRs().D66((InterfaceC16820sZ) this.A01);
                return C0eB.A00;
            case 22:
                if (AbstractC25226BEj.A1A(this.A01) != null) {
                    AbstractC166987dD.A1Y(this.A02);
                }
                return C0eB.A00;
            case 23:
                ((C131325wL) this.A01).A01(AbstractC25225BEi.A16(this.A02));
                return C25676BWm.A00();
            case 24:
            case 26:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null && (invoke = interfaceC16820sZ.invoke()) != null) {
                    return invoke;
                }
                InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A02);
                if ((A0i instanceof C07N) && (c07n2 = (C07N) A0i) != null) {
                    return c07n2.getDefaultViewModelCreationExtras();
                }
                return C52962bd.A00;
            case 25:
                C26830Bss c26830Bss = (C26830Bss) this.A02;
                C38321qM c38321qM3 = (C38321qM) ((C37838Gks) this.A01).A05;
                if (c38321qM3 != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    User A14 = AbstractC25226BEj.A14(c38321qM3);
                    if (A14 != null) {
                        A1E.add(A14);
                    }
                    List Ab8 = c38321qM3.A0C.Ab8();
                    if (Ab8 != null) {
                        A1E.addAll(Ab8);
                    }
                    AbstractC55229Oez.A0C(c26830Bss, AbstractC166987dD.A0r(c26830Bss.A01), c38321qM3, c26830Bss, c26830Bss.getString(2131975629), A1E);
                }
                return C0eB.A00;
            case 27:
                InterfaceC018407e A0i2 = AbstractC25228BEl.A0i(this.A01);
                if ((A0i2 instanceof C07N) && (c07n = (C07N) A0i2) != null && (defaultViewModelProviderFactory = c07n.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
            case 28:
                return ((C38321qM) this.A01).A1e(((C37994Gnf) this.A02).A00);
            case 30:
                AbstractC166987dD.A1Z(new MBp(this.A02, null, 30), (C19L) this.A01);
                return C0eB.A00;
            case 31:
            case 32:
            case 33:
            default:
                ((InterfaceC16660sJ) this.A01).invoke(((C9C6) this.A02).A03);
                return C0eB.A00;
            case 34:
                String id2 = ((C38321qM) this.A02).getId();
                if (id2 != null) {
                    ((InterfaceC30995Dju) this.A01).D3W(id2);
                }
                return C0eB.A00;
            case 35:
                ((JH9) this.A01).DkP((C38321qM) this.A02);
                return C0eB.A00;
            case 36:
            case 44:
                A00 = AbstractC903640v.A00(((C692439k) this.A02).A02, (C38321qM) this.A01);
                return Integer.valueOf(A00);
            case 37:
            case Seq.NULL_REFNUM /* 41 */:
                ((C692439k) this.A02).A05.A0g.getValue();
                C38321qM c38321qM4 = (C38321qM) this.A01;
                C14360o3.A0B(c38321qM4, 0);
                A00 = Arrays.hashCode(new Object[]{c38321qM4.getId(), c38321qM4.A1c()});
                return Integer.valueOf(A00);
            case 38:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                ((C692439k) this.A02).A05.A0d.getValue();
                A00 = C28361CfL.A00((C38321qM) this.A01);
                return Integer.valueOf(A00);
            case 39:
                ((C692439k) this.A02).A05.A09.getValue();
                A00 = IQM.A00((C38321qM) this.A01);
                return Integer.valueOf(A00);
            case 40:
                ((C692439k) this.A02).A05.A09.getValue();
                Object obj2 = this.A01;
                C14360o3.A0B(obj2, 0);
                return new C51755Mte(new C51760Mtj(new J7K(obj2, 35), new J7K(obj2, 36), new J7K(obj2, 37), 35), 20);
            case 43:
                C692439k c692439k = (C692439k) this.A02;
                return ((C28361CfL) c692439k.A05.A0d.getValue()).A02(c692439k.A00, (C38321qM) this.A01);
            case 45:
            case 47:
                return AbstractC22726A0w.A00(EnumC71343Hv.A0f, (C75113Zb) this.A01, ((C115015Hw) this.A02).A09);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                CPA cpa = (CPA) this.A01;
                C51761Mtk c51761Mtk = (C51761Mtk) this.A02;
                C14360o3.A0B(c51761Mtk, 0);
                cpa.A00.A00.D5R((C38321qM) c51761Mtk.A02);
                return C0eB.A00;
            case 48:
                if (this.A02 != null) {
                    View view = (View) this.A01;
                    view.setVisibility(0);
                    view.setOnClickListener(null);
                }
                return C0eB.A00;
            case 49:
                C76743cM c76743cM = (C76743cM) this.A02;
                if (!c76743cM.A03.A02) {
                    ((InterfaceC75453aC) this.A01).Dcz(c76743cM.A02.A01);
                }
                return C0eB.A00;
        }
    }
}
