package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.build.BuildConstants;
import com.facebook.pando.TreeJNI;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductTagDictIntf;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HGe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39028HGe extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C39028HGe(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-225071350);
                super.onFail(abstractC115105If);
                EKF.A04((EKF) this.A02, (RegFlowExtras) this.A03, this.A04);
                i = -857923774;
                break;
            case 2:
                A03 = C0f9.A03(-2142311351);
                AbstractC166987dD.A1Y(this.A01);
                i = 698121896;
                break;
            case 3:
                A03 = C0f9.A03(2140724949);
                AbstractC166987dD.A1Y(this.A01);
                i = 2071281574;
                break;
            case 4:
                A03 = C0f9.A03(2057549924);
                JI5 ji5 = (JI5) this.A02;
                if (ji5 != null) {
                    ji5.Df9();
                }
                i = -730318460;
                break;
            case 5:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 186324889);
                super.onFail(abstractC115105If);
                ((Dialog) this.A01).dismiss();
                Throwable A01 = abstractC115105If.A01();
                if (A01 == null || (str = A01.getMessage()) == null) {
                    str = "";
                }
                C37947Gmp.A01("Deep link", AnonymousClass001.A0R("Fetch Superlative fail - ", str));
                Activity activity = (Activity) this.A03;
                C9GR.A0C(activity, "DeeplinkSuperlative_unknown_error_occured");
                if (activity.isTaskRoot()) {
                    C12260kU.A0C(activity, C14H.A03.A00().A01(activity));
                }
                activity.finish();
                i = -2002760630;
                break;
            case 6:
                A03 = C0f9.A03(909451057);
                AbstractC166987dD.A1Y(this.A02);
                C9GR.A0B((Context) this.A01, "clips_spins_like");
                i = -884325899;
                break;
            case 7:
                A03 = C0f9.A03(-95996219);
                C9GR.A0A((Context) this.A01, "clips_archive_failed");
                i = 2089000184;
                break;
            default:
                super.onFail(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(1598134867);
                super.onStart();
                ((EKF) this.A02).A0L.A01();
                i = 2076668558;
                break;
            case 2:
            case 3:
            case 4:
            default:
                super.onStart();
                return;
            case 5:
                A03 = C0f9.A03(1800115290);
                super.onStart();
                C0fJ.A00((Dialog) this.A01);
                i = 921723710;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        String str;
        int i;
        int i2;
        C37771pE c37771pE;
        C3G2 c3g2;
        String str2;
        Object A00;
        String str3;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1045159593);
                C38855H9d c38855H9d = (C38855H9d) obj;
                int A0N = AbstractC167017dG.A0N(c38855H9d, 1005103023);
                List list = c38855H9d.F7f().A01;
                if (list == null) {
                    i = 982302464;
                } else {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A2u = AbstractC31172DnG.A0i(it).A2u();
                        if (A2u != null) {
                            A1E.add(A2u);
                        }
                    }
                    ArrayList A1F = AbstractC166987dD.A1F(A1E);
                    if (list.isEmpty()) {
                        ((C38321qM) this.A02).A40();
                    } else {
                        Activity activity = (Activity) this.A01;
                        if (!activity.isFinishing() && !activity.isDestroyed()) {
                            C41717Idn c41717Idn = new C41717Idn((UserSession) this.A03);
                            String str4 = this.A04;
                            ImageUrl A1S = ((C38321qM) this.A02).A1S();
                            if (A1S != null) {
                                str = A1S.getUrl();
                            } else {
                                str = null;
                            }
                            C41717Idn.A01(activity, c41717Idn, str4, str, c38855H9d.F7f().A00, A1F);
                        }
                    }
                    i = -1158159451;
                }
                C0f9.A0A(i, A0N);
                i2 = 1488449212;
                C0f9.A0A(i2, A03);
                return;
            case 1:
                A03 = C0f9.A03(-382469146);
                ED2 ed2 = (ED2) obj;
                int A032 = C0f9.A03(-1551275834);
                int A033 = C0f9.A03(-159289508);
                super.onSuccess(ed2);
                RegFlowExtras regFlowExtras = (RegFlowExtras) this.A01;
                if (regFlowExtras != null) {
                    regFlowExtras.A0g = ed2.A01;
                    regFlowExtras.A0n = ed2.A02;
                    regFlowExtras.A0X = ed2.A00;
                    regFlowExtras.A12 = ed2.A03;
                }
                C0f9.A0A(-1710448244, A033);
                EKF.A04((EKF) this.A02, (RegFlowExtras) this.A03, this.A04);
                C0f9.A0A(532788274, A032);
                i2 = 200387740;
                C0f9.A0A(i2, A03);
                return;
            case 2:
                A03 = C0f9.A03(-64377853);
                HAE hae = (HAE) obj;
                int A0N2 = AbstractC167017dG.A0N(hae, 1084387429);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                C38321qM c38321qM = hae.A00;
                if (c38321qM != null) {
                    A00(this, c38321qM, interfaceC16660sJ);
                    C0f9.A0A(1843158789, A0N2);
                    i2 = 646020936;
                    C0f9.A0A(i2, A03);
                    return;
                }
                str2 = "media";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 3:
                A03 = C0f9.A03(-1067593382);
                HAE hae2 = (HAE) obj;
                int A0N3 = AbstractC167017dG.A0N(hae2, 1831964698);
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A02;
                C38321qM c38321qM2 = hae2.A00;
                if (c38321qM2 != null) {
                    A00(this, c38321qM2, interfaceC16660sJ2);
                    C0f9.A0A(-1417374626, A0N3);
                    i2 = 2041652886;
                    C0f9.A0A(i2, A03);
                    return;
                }
                str2 = "media";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 4:
                A03 = C0f9.A03(-1877783635);
                int A034 = C0f9.A03(-1108247132);
                JI5 ji5 = (JI5) this.A02;
                if (ji5 != null) {
                    ji5.DfA(this.A04);
                }
                C38321qM c38321qM3 = (C38321qM) this.A03;
                String str5 = this.A04;
                InterfaceC111164zd BhM = c38321qM3.A0C.BhM();
                if (BhM != 0) {
                    InterfaceC38831rF interfaceC38831rF = c38321qM3.A0C;
                    BhM.CIr();
                    List CIr = BhM.CIr();
                    ArrayList<ProductTagDictIntf> arrayList = null;
                    if (CIr != null) {
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        for (Object obj2 : CIr) {
                            ProductDetailsProductItemDictIntf Bgl = ((ProductTagDictIntf) obj2).Bgl();
                            if (Bgl != null) {
                                str3 = Bgl.getProductId();
                            } else {
                                str3 = null;
                            }
                            AbstractC25232BEp.A1Q(str3, str5, obj2, A1E2);
                        }
                        arrayList = A1E2;
                    }
                    ArrayList arrayList2 = null;
                    AbstractC37302Gc3.A0n();
                    if (BhM instanceof HP0) {
                        if (arrayList != null) {
                            arrayList2 = AbstractC166987dD.A1E();
                            for (ProductTagDictIntf productTagDictIntf : arrayList) {
                                if (productTagDictIntf != null) {
                                    arrayList2.add(productTagDictIntf.F7o());
                                }
                            }
                        }
                        TreeJNI treeJNI = (TreeJNI) BhM;
                        A00 = AbstractC25234BEr.A0P(treeJNI, AbstractC167007dF.A0n("in", arrayList2)).applyToTree(treeJNI);
                        C14360o3.A07(A00);
                    } else {
                        A00 = HnD.A00(arrayList);
                    }
                    interfaceC38831rF.Ebd((InterfaceC111164zd) A00);
                }
                if (c38321qM3.A5r() && c38321qM3.A63()) {
                    Context context = (Context) this.A01;
                    C146106i8 A0K = AbstractC31171DnF.A0K();
                    AbstractC25226BEj.A1N(context, A0K, 2131973962);
                    AbstractC25233BEq.A1F(A0K);
                }
                C0f9.A0A(-1574380667, A034);
                i2 = 1172849281;
                C0f9.A0A(i2, A03);
                return;
            case 5:
                A03 = C0f9.A03(1829580479);
                C38829H8d c38829H8d = (C38829H8d) obj;
                int A035 = C0f9.A03(2069644427);
                C14360o3.A0B(c38829H8d, 0);
                super.onSuccess(c38829H8d);
                ((Dialog) this.A01).dismiss();
                UserSessionUrlHandlerActivity userSessionUrlHandlerActivity = (UserSessionUrlHandlerActivity) this.A03;
                String str6 = this.A04;
                UserSession userSession = (UserSession) this.A02;
                InterfaceC43469JIh interfaceC43469JIh = c38829H8d.A00;
                if (interfaceC43469JIh == null) {
                    str2 = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                C37771pE c37771pE2 = ((C42134Ili) interfaceC43469JIh).A00;
                if (c37771pE2 != null) {
                    c37771pE = c37771pE2.F5S(C1DS.A00(userSession));
                } else {
                    c37771pE = null;
                }
                android.net.Uri A0B = AbstractC25227BEk.A0B(str6);
                if (AbstractC001900j.A0a(AbstractC166987dD.A19(A0B), "instagram.com/standouts", false)) {
                    c3g2 = C3G2.A21;
                } else {
                    String queryParameter = A0B.getQueryParameter(CacheBehaviorLogger.SOURCE);
                    if (queryParameter != null) {
                        int hashCode = queryParameter.hashCode();
                        if (hashCode != 3615) {
                            if (hashCode != 563217739) {
                                if (hashCode == 595233003 && queryParameter.equals("notification")) {
                                    c3g2 = C3G2.A1x;
                                }
                            } else if (queryParameter.equals("qr_code")) {
                                c3g2 = C3G2.A1z;
                            }
                        } else if (queryParameter.equals("qp")) {
                            c3g2 = C3G2.A1y;
                        }
                        C0f9.A0A(i2, A03);
                        return;
                    }
                    c3g2 = C3G2.A1w;
                }
                if (c37771pE != null) {
                    Long l = c37771pE.A1L;
                    if (l != null && l.longValue() != 0) {
                        OWL.A01.A01(c37771pE.A0F);
                        if (userSessionUrlHandlerActivity.isTaskRoot()) {
                            C12260kU.A0C(userSessionUrlHandlerActivity, C14H.A03.A00().A01(userSessionUrlHandlerActivity));
                        }
                        AbstractC18680vv abstractC18680vv = userSessionUrlHandlerActivity.A00;
                        C14360o3.A0C(abstractC18680vv, AbstractC111324zv.A00(6));
                        AbstractC41658Ibq.A01(userSessionUrlHandlerActivity, (UserSession) abstractC18680vv, c37771pE, c3g2);
                        userSessionUrlHandlerActivity.finish();
                        C0f9.A0A(-1178749072, A035);
                        i2 = -261687933;
                        C0f9.A0A(i2, A03);
                        return;
                    }
                    C37947Gmp.A01("Superlative", AnonymousClass001.A0R("Deep link : latestReelMedia is null ", AbstractC37741pB.A03(userSession, c37771pE)));
                }
                String str7 = c3g2.A00;
                if (AbstractC001900j.A0a(str6, "instagram.com/standouts", false)) {
                    try {
                        Object obj3 = BuildConstants.class.getField("INSTAGRAM_URL_SCHEME").get(EnumC33372Ep5.A0C);
                        AbstractC25225BEi.A1S(obj3);
                        str6 = AnonymousClass001.A0R((String) obj3, "://superlative");
                    } catch (Exception e) {
                        String format = String.format("Could not access %s.%s", Arrays.copyOf(new Object[]{"BuildConstants", "INSTAGRAM_URL_SCHEME"}, 2));
                        C14360o3.A07(format);
                        throw new RuntimeException(format, e);
                    }
                }
                Intent data = C14H.A03.A00().A01(userSessionUrlHandlerActivity).setData(AbstractC08820cl.A03(str6).buildUpon().appendQueryParameter(AbstractC111324zv.A00(33), "false").appendQueryParameter(CacheBehaviorLogger.SOURCE, str7).build());
                C14360o3.A07(data);
                C12260kU.A0C(userSessionUrlHandlerActivity, data);
                userSessionUrlHandlerActivity.finish();
                C0f9.A0A(-1178749072, A035);
                i2 = -261687933;
                C0f9.A0A(i2, A03);
                return;
            case 6:
                A03 = C0f9.A03(-798166786);
                int A036 = C0f9.A03(-1416413593);
                UserSession userSession2 = ((C27886CQx) this.A03).A00;
                C1DX A002 = C1DW.A00(userSession2);
                String str8 = this.A04;
                C38321qM A02 = A002.A02(str8);
                if (A02 == null) {
                    i4 = -1586325834;
                } else {
                    boolean A5l = A02.A5l();
                    int A0w = A02.A0w();
                    if (A5l) {
                        A02.A4C(EnumC77173d3.A03);
                        i3 = A0w - 1;
                    } else {
                        A02.A4C(EnumC77173d3.A02);
                        i3 = A0w + 1;
                    }
                    A02.A42(i3);
                    AbstractC37301Gc2.A1O(userSession2, A02);
                    C38321qM A0h = AbstractC25229BEm.A0h(userSession2, str8);
                    if (A0h != null) {
                        A0h.AEH(userSession2);
                    }
                    i4 = 1527315981;
                }
                C0f9.A0A(i4, A036);
                i2 = -1556758817;
                C0f9.A0A(i2, A03);
                return;
            default:
                A03 = C0f9.A03(-1988487177);
                int A037 = C0f9.A03(566194040);
                EnumC114765Gh enumC114765Gh = (EnumC114765Gh) this.A02;
                if (enumC114765Gh != null) {
                    IT8.A00(AbstractC31171DnF.A0D("activity_center"), (UserSession) this.A03, enumC114765Gh, C05F.A0C, this.A04);
                }
                UserSession userSession3 = (UserSession) this.A03;
                String str9 = userSession3.token;
                C14360o3.A0B(str9, 0);
                HDF hdf = new HDF();
                AbstractC25233BEq.A15(hdf, "IgSessionManager.SESSION_TOKEN_KEY", str9);
                AbstractC25229BEm.A18(hdf, AbstractC25225BEi.A0r((FragmentActivity) this.A01, userSession3));
                C0f9.A0A(437724213, A037);
                i2 = -128644426;
                C0f9.A0A(i2, A03);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    public static void A00(C39028HGe c39028HGe, Object obj, InterfaceC16660sJ interfaceC16660sJ) {
        interfaceC16660sJ.invoke(obj);
        long j = C42274Iny.A04;
        UserSession userSession = (UserSession) c39028HGe.A03;
        I93.A00(userSession).A00();
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(c39028HGe.A04, 1);
        A00.E4s(new Object());
    }
}
