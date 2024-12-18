package X;

import android.app.Dialog;
import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.Gf2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37484Gf2 extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C37484Gf2(C120985dq c120985dq, C37610Gh5 c37610Gh5, int i) {
        this.A00 = i;
        if (26 - i != 0) {
            this.A02 = c37610Gh5;
            this.A01 = c120985dq;
        } else {
            this.A01 = c120985dq;
            this.A02 = c37610Gh5;
        }
    }

    public static void A00(C1ON c1on, Object obj, Object obj2, int i) {
        c1on.A00 = new C37484Gf2(i, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        int A0N;
        int i2;
        String str;
        int A032;
        int i3;
        String message;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(2120523645);
                i = 530186943;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1291712584);
                super.onFail(abstractC115105If);
                ((JH1) this.A01).DGi();
                i2 = -1928386844;
                C0f9.A0A(i2, A0N);
                return;
            case 2:
            case 3:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 22:
            case 23:
            case 25:
            case 31:
            case 32:
            default:
                super.onFail(abstractC115105If);
                return;
            case 4:
                A0N = C0f9.A03(719545393);
                ((Dialog) this.A01).hide();
                C9GR.A0E(((IL2) this.A02).A00, AbstractC111324zv.A00(5219));
                i2 = 1000100275;
                C0f9.A0A(i2, A0N);
                return;
            case 5:
                A0N = C0f9.A03(-1497773182);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                ((C38321qM) this.A01).A0C.EVQ(false);
                i2 = -1275930493;
                C0f9.A0A(i2, A0N);
                return;
            case 6:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1412797472);
                super.onFail(abstractC115105If);
                i2 = -1495952000;
                C0f9.A0A(i2, A0N);
                return;
            case 7:
                A0N = C0f9.A03(-1089976787);
                C8KO c8ko = (C8KO) this.A02;
                if (!c8ko.A00) {
                    i2 = 434550384;
                } else {
                    c8ko.A00 = false;
                    ((JHD) this.A01).DBk();
                    i2 = 1688107445;
                }
                C0f9.A0A(i2, A0N);
                return;
            case 8:
                A0N = C0f9.A03(-526565374);
                C8KO c8ko2 = (C8KO) this.A02;
                if (!c8ko2.A00) {
                    i2 = -1773844198;
                } else {
                    c8ko2.A00 = false;
                    ((JHD) this.A01).DBk();
                    i2 = 1888501441;
                }
                C0f9.A0A(i2, A0N);
                return;
            case 9:
                A0N = C0f9.A03(1364184085);
                C111364zz c111364zz = (C111364zz) this.A02;
                c111364zz.A05.remove(EnumC2045493n.A09);
                C111364zz.A02((InterfaceC1116050z) this.A01, c111364zz);
                i2 = -875252569;
                C0f9.A0A(i2, A0N);
                return;
            case 11:
                A0N = C0f9.A03(-759467915);
                if (((ReactContextBaseJavaModule) this.A01).getCurrentActivity() != null) {
                    InterfaceC65622ToD interfaceC65622ToD = (InterfaceC65622ToD) this.A02;
                    Object A00 = abstractC115105If.A00();
                    if (A00 != null) {
                        str = ((InterfaceC40821up) A00).getErrorMessage();
                    } else {
                        str = "";
                    }
                    interfaceC65622ToD.reject(IgReactCommentModerationModule.ERROR_SERVER_ERR, str);
                }
                i2 = 1210771937;
                C0f9.A0A(i2, A0N);
                return;
            case 14:
                A0N = C0f9.A03(2078002895);
                C41080IGx c41080IGx = (C41080IGx) this.A01;
                JI6 ji6 = c41080IGx.A00.A07;
                C41726Idx c41726Idx = c41080IGx.A01;
                C41753IeT c41753IeT = new C41753IeT(c41726Idx);
                C41595Iai c41595Iai = c41726Idx.A02;
                c41753IeT.A02 = new C41595Iai(c41595Iai.A00, c41595Iai.A01, c41595Iai.A02, c41595Iai.A03, c41595Iai.A04, EnumC39591He1.A04, c41595Iai.A06);
                C41726Idx.A02(ji6, c41753IeT);
                i2 = 93212669;
                C0f9.A0A(i2, A0N);
                return;
            case Process.SIGTERM /* 15 */:
                A032 = C0f9.A03(5422404);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                C41148IJn c41148IJn = (C41148IJn) this.A02;
                Map map = c41148IJn.A05;
                C42506Irl c42506Irl = (C42506Irl) this.A01;
                map.put(c42506Irl, EnumC39538HdA.A04);
                Integer num = C05F.A01;
                c42506Irl.A00 = num;
                ID6 id6 = c41148IJn.A03;
                Throwable A01 = abstractC115105If.A01();
                HD9 hd9 = id6.A00;
                HEW hew = hd9.A02;
                if (hew != null) {
                    c42506Irl.A00 = num;
                    HEW.A00(hew);
                    C9GR.A01(hd9.getContext(), "catalog_load_more_failed", 2131970016, 0);
                    C41762Ied c41762Ied = hd9.A03;
                    if (c41762Ied == null) {
                        str2 = "logger";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    Integer num2 = c42506Irl.A01;
                    C14360o3.A07(num2);
                    C19280xC A002 = C41762Ied.A00(c41762Ied, "catalog_load_more_failure");
                    A002.A0C("products_source_type", I8Y.A00(num2));
                    if (A01 != null && (message = A01.getMessage()) != null) {
                        A002.A0C("error_message", message);
                    }
                    C41762Ied.A05(A002, c41762Ied);
                    i3 = -819792548;
                    C0f9.A0A(i3, A032);
                    return;
                }
                str2 = "adapter";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 16:
                A032 = C0f9.A03(-430070735);
                AbstractC166987dD.A1Y(this.A01);
                i3 = -400270284;
                C0f9.A0A(i3, A032);
                return;
            case 17:
                A032 = C0f9.A03(1565843025);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                C41632IbN c41632IbN = (C41632IbN) this.A02;
                C9GR.A01(c41632IbN.A00, "schedule_back_in_stock_reminder_failed", 2131974293, 1);
                JI6 ji62 = c41632IbN.A06;
                C41753IeT A003 = C41753IeT.A00(ji62);
                A003.A0B.put(((IH9) this.A01).A00.A0H, false);
                C41726Idx.A02(ji62, A003);
                i3 = 70878361;
                C0f9.A0A(i3, A032);
                return;
            case 18:
                A032 = C0f9.A03(-306881721);
                super.onFail(abstractC115105If);
                C41145IJk c41145IJk = ((ShoppingMoreProductsFragment) this.A01).A04;
                C006802i c006802i = c41145IJk.A00;
                C14360o3.A06(c006802i);
                ISD.A01(c006802i, c41145IJk.A04, 37365602);
                i3 = -1764729113;
                C0f9.A0A(i3, A032);
                return;
            case 21:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -93684593);
                super.onFail(abstractC115105If);
                ((InterfaceC43427JGr) this.A01).D0Q();
                i3 = 1827366483;
                C0f9.A0A(i3, A032);
                return;
            case 24:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -1178081552);
                super.onFail(abstractC115105If);
                i3 = 2018596917;
                C0f9.A0A(i3, A032);
                return;
            case 26:
                A032 = C0f9.A03(-238023534);
                AbstractC63248Sg4.A00(((C37610Gh5) this.A02).A00);
                i3 = 1727186320;
                C0f9.A0A(i3, A032);
                return;
            case 27:
                A032 = C0f9.A03(-1960342279);
                AbstractC63248Sg4.A00(((C37610Gh5) this.A02).A00);
                i3 = -649329218;
                C0f9.A0A(i3, A032);
                return;
            case 28:
                A032 = C0f9.A03(-1186056491);
                AbstractC63248Sg4.A00(((C37610Gh5) this.A02).A00);
                i3 = -1084877059;
                C0f9.A0A(i3, A032);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A032 = C0f9.A03(-273537191);
                AbstractC63248Sg4.A00(((C37610Gh5) this.A02).A00);
                i3 = -1037290767;
                C0f9.A0A(i3, A032);
                return;
            case 30:
                A032 = C0f9.A03(666026018);
                C9GR.A0A((Context) this.A01, "clips_restore_original_audio_failed");
                i3 = 1016360868;
                C0f9.A0A(i3, A032);
                return;
            case 33:
                A03 = C0f9.A03(-637635280);
                HDC hdc = (HDC) this.A02;
                C31543DtT c31543DtT = hdc.A04;
                str2 = "paginationHelper";
                if (c31543DtT != null) {
                    c31543DtT.A01 = true;
                    if (c31543DtT.CLJ()) {
                        HEC hec = hdc.A05;
                        if (hec != null) {
                            C0fA.A00(hec, -1801224562);
                        }
                        str2 = "adapter";
                    }
                    C9GR.A03(hdc.getActivity(), AbstractC25227BEk.A0v(hdc, 2131972429), "fetchData_request_error", 1);
                    i = 1505317104;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 34:
                A03 = C0f9.A03(-327771211);
                C9GR.A0D((Context) this.A01, "requestMentionTask_network_error");
                i = -564144948;
                C0f9.A0A(i, A03);
                return;
        }
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(81149194);
                super.onFinish();
                ((C37466Gek) this.A01).A06.removeAll((LinkedHashSet) this.A02);
                i = 1898822116;
                break;
            case 33:
                A03 = C0f9.A03(125171757);
                HDC hdc = (HDC) this.A02;
                C31543DtT c31543DtT = hdc.A04;
                if (c31543DtT == null) {
                    str = "paginationHelper";
                } else {
                    c31543DtT.A02 = false;
                    AbstractC31177DnL.A18(hdc, C56352iT.A0t, false);
                    HEC hec = hdc.A05;
                    if (hec == null) {
                        str = "adapter";
                    } else {
                        if (hec.A02.isEmpty()) {
                            HDC.A03(hdc);
                        }
                        i = -761943370;
                        break;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 6:
                A03 = C0f9.A03(-1081281600);
                super.onStart();
                i = 1324508198;
                break;
            case 23:
                A03 = C0f9.A03(-250201865);
                super.onStart();
                C226218q.A01(AbstractC12960li.A00).A0H();
                i = 195064937;
                break;
            case 24:
                A03 = C0f9.A03(1236109617);
                super.onStart();
                i = -1827508176;
                break;
            case 33:
                A03 = C0f9.A03(645586713);
                HDC.A02((HDC) this.A02);
                i = 1231580542;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 2696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37484Gf2.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 9:
                A03 = C0f9.A03(314578097);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A0N = AbstractC167017dG.A0N(anonymousClass435, 1020788672);
                C111364zz c111364zz = (C111364zz) this.A02;
                C11T.A02(new RunnableC57040PSf((InterfaceC1116050z) this.A01, c111364zz, AbstractC37979GnM.A00(anonymousClass435, c111364zz.A03)));
                C0f9.A0A(664738268, A0N);
                i = -960626038;
                break;
            case 10:
                A03 = C0f9.A03(1828310847);
                int A032 = C0f9.A03(-2042248305);
                C38321qM c38321qM = (C38321qM) this.A02;
                UserSession userSession = ((C41138IJd) this.A01).A03;
                c38321qM.A4J(AbstractC166987dD.A10(userSession));
                c38321qM.AEH(userSession);
                C0f9.A0A(892419488, A032);
                i = -796073477;
                break;
            case 23:
                A03 = C0f9.A03(1552302339);
                int A033 = C0f9.A03(-870871343);
                C226218q.A01(AbstractC12960li.A00).A0I();
                C0f9.A0A(1969301407, A033);
                i = -2032173673;
                break;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }

    public C37484Gf2(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
