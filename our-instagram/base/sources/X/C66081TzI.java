package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.snackbar.IgdsSnackBar;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TzI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66081TzI extends C1P1 {
    public final int A00;
    public final Object A01;

    public C66081TzI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v164, types: [java.lang.Object, X.WfZ, X.1vN] */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        String str;
        String str2;
        String str3;
        String localizedMessage;
        Exception runtimeException;
        Exception runtimeException2;
        switch (this.A00) {
            case 2:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -962217749);
                Q0S q0s = (Q0S) this.A01;
                q0s.A02.execute(new RunnableC64667TOy(q0s, abstractC115105If));
                i = 1580517613;
                C0f9.A0A(i, A0N);
                return;
            case 3:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1329699503);
                C70088W2k c70088W2k = (C70088W2k) this.A01;
                Throwable A01 = abstractC115105If.A01();
                Iterator it = c70088W2k.A04.iterator();
                while (it.hasNext()) {
                    ((XCI) it.next()).onError(A01);
                }
                i = 1641419756;
                C0f9.A0A(i, A0N);
                return;
            case 4:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -5592773);
                C70088W2k c70088W2k2 = (C70088W2k) this.A01;
                Throwable A012 = abstractC115105If.A01();
                Iterator it2 = c70088W2k2.A04.iterator();
                while (it2.hasNext()) {
                    ((XCI) it2.next()).onError(A012);
                }
                i = 1378517459;
                C0f9.A0A(i, A0N);
                return;
            case 5:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1878237890);
                super.onFail(abstractC115105If);
                V0N.A01((V0N) this.A01);
                i = -840109906;
                C0f9.A0A(i, A0N);
                return;
            case 6:
                A0N = C0f9.A03(535744681);
                V0N.A02((V0N) this.A01);
                i = -789644781;
                C0f9.A0A(i, A0N);
                return;
            case 7:
                A0N = C0f9.A03(-1476110109);
                W6I w6i = ((V16) this.A01).A07;
                if (w6i == null) {
                    str = "adsManagerLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                w6i.A09("two_fac_acct_freeze", "ads_manager", null, null);
                i = -650981426;
                C0f9.A0A(i, A0N);
                return;
            case 8:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 21:
            case 22:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            case 35:
            case 37:
            case 38:
            default:
                super.onFail(abstractC115105If);
                return;
            case 10:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -89919315);
                super.onFail(abstractC115105If);
                V16.A05((V16) this.A01);
                i = 1394100704;
                C0f9.A0A(i, A0N);
                return;
            case 11:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -650395570);
                super.onFail(abstractC115105If);
                C67870V0b c67870V0b = (C67870V0b) this.A01;
                if (c67870V0b.getContext() != null) {
                    C70399WUb c70399WUb = c67870V0b.A02;
                    if (c70399WUb != null) {
                        String obj = VG4.A1U.toString();
                        PromoteData promoteData = c67870V0b.A05;
                        if (promoteData == null) {
                            str = "promoteData";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        List list = promoteData.A0p.A07;
                        if (list != null && !list.isEmpty()) {
                            str2 = "edit_auto_audience_location";
                        } else {
                            str2 = "delete_auto_audience_location";
                        }
                        c70399WUb.A0Z(obj, str2, abstractC115105If.A01());
                    }
                    AbstractC31173DnH.A13(c67870V0b.getContext(), c67870V0b, 2131970493);
                }
                i = 1527172057;
                C0f9.A0A(i, A0N);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 77663357);
                super.onFail(abstractC115105If);
                V11 v11 = (V11) this.A01;
                C70399WUb c70399WUb2 = v11.A03;
                if (c70399WUb2 != null) {
                    c70399WUb2.A0Z(VG4.A0B.toString(), "hec_appeal", abstractC115105If.A01());
                }
                Context context = v11.getContext();
                if (context != null) {
                    AbstractC31173DnH.A13(context, v11, 2131961896);
                }
                i = -1563218235;
                C0f9.A0A(i, A0N);
                return;
            case 14:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1417740096);
                V0Q v0q = (V0Q) this.A01;
                V0Q.A01(v0q, AbstractC25227BEk.A0v(v0q, 2131970545));
                V0Q.A02(v0q, "delete", AbstractC31180DnO.A0k(abstractC115105If.A01()));
                i = 1210099717;
                C0f9.A0A(i, A0N);
                return;
            case Process.SIGTERM /* 15 */:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -833481241);
                super.onFail(abstractC115105If);
                V0Q v0q2 = (V0Q) this.A01;
                W6I w6i2 = (W6I) v0q2.A09.getValue();
                String str4 = v0q2.A04;
                if (str4 == null) {
                    str = "mediaId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                Throwable A013 = abstractC115105If.A01();
                if (A013 == null || (str3 = A013.toString()) == null) {
                    str3 = "";
                }
                w6i2.A09("campaign_controls", "ads_manager", str4, str3);
                String string = v0q2.getString(2131961896);
                Context requireContext = v0q2.requireContext();
                if (string == null || string.length() == 0) {
                    string = v0q2.getString(2131961896);
                }
                C9GR.A09(requireContext, string);
                i = -1714921619;
                C0f9.A0A(i, A0N);
                return;
            case 16:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1831294152);
                V0Q v0q3 = (V0Q) this.A01;
                V0Q.A01(v0q3, AbstractC25227BEk.A0v(v0q3, 2131970823));
                V0Q.A02(v0q3, "paused", AbstractC31180DnO.A0k(abstractC115105If.A01()));
                i = 1572884608;
                C0f9.A0A(i, A0N);
                return;
            case 17:
                A0N = C0f9.A03(2133425915);
                C14360o3.A0B(abstractC115105If, 0);
                V0Y v0y = (V0Y) this.A01;
                AbstractC65702TsY.A0N(v0y.A0G).A0Z(VG4.A0k.toString(), "take_page_onwership", abstractC115105If.A01());
                W65 w65 = v0y.A06;
                if (w65 != null) {
                    w65.A05(false);
                    String A0v = AbstractC25227BEk.A0v(v0y, 2131970711);
                    Context context2 = v0y.getContext();
                    if (context2 != null) {
                        C9GR.A09(context2, A0v);
                    }
                    i = 643490072;
                    C0f9.A0A(i, A0N);
                    return;
                }
                str = "actionButtonHolder";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 18:
                A0N = C0f9.A03(-1558884281);
                C14360o3.A0B(abstractC115105If, 0);
                V0Y v0y2 = (V0Y) this.A01;
                AbstractC65702TsY.A0N(v0y2.A0G).A0Z(VG4.A0k.toString(), "page_created", abstractC115105If.A01());
                W65 w652 = v0y2.A06;
                if (w652 != null) {
                    w652.A05(false);
                    String A0v2 = AbstractC25227BEk.A0v(v0y2, 2131970714);
                    Context context3 = v0y2.getContext();
                    if (context3 != null) {
                        C9GR.A09(context3, A0v2);
                    }
                    i = 250552039;
                    C0f9.A0A(i, A0N);
                    return;
                }
                str = "actionButtonHolder";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Process.SIGSTOP /* 19 */:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1972987727);
                Throwable A014 = abstractC115105If.A01();
                if (A014 != null) {
                    W6j.A02((XDK) this.A01, A014);
                }
                i = 864195230;
                C0f9.A0A(i, A0N);
                return;
            case 20:
                A0N = C0f9.A03(-667417870);
                C67891V0y c67891V0y = (C67891V0y) this.A01;
                AbstractC65702TsY.A0N(c67891V0y.A05).A0W(VG4.A14.toString(), "ACCEPTED_NON_DISCRIMINATION", AbstractC111324zv.A00(656));
                C9GR.A09(c67891V0y.requireContext(), c67891V0y.getString(2131970770));
                W65 w653 = c67891V0y.A00;
                if (w653 == null) {
                    str = "acceptButtonHolder";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                w653.A05(false);
                i = -54862551;
                C0f9.A0A(i, A0N);
                return;
            case 23:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1922830737);
                super.onFail(abstractC115105If);
                ((XCR) this.A01).DFf();
                i = 1948263830;
                C0f9.A0A(i, A0N);
                return;
            case 24:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1896397936);
                super.onFail(abstractC115105If);
                ((XCQ) this.A01).Dwe();
                i = -328642498;
                C0f9.A0A(i, A0N);
                return;
            case 25:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -381681427);
                super.onFail(abstractC115105If);
                ((XCS) this.A01).DFf();
                i = 269501776;
                C0f9.A0A(i, A0N);
                return;
            case 26:
                A0N = C0f9.A03(633609456);
                C70807WhN c70807WhN = (C70807WhN) this.A01;
                C34925FaB.A00(c70807WhN.A09, null, null, null, null, "welcome_message_settings_saved_error", null, "There was a HTTP request failure to modify welcome message");
                V0R v0r = c70807WhN.A02;
                if (v0r != null) {
                    V0R.A02(v0r);
                    if (C14360o3.A0K(v0r.A0B, "business_setting")) {
                        Drawable drawable = v0r.A04().getDrawable(R.drawable.instagram_error_pano_outline_24);
                        C146106i8 c146106i8 = new C146106i8();
                        if (drawable != null) {
                            c146106i8.A02();
                            c146106i8.A08(drawable, AbstractC31173DnH.A03(v0r.A04(), v0r.A04(), R.attr.igds_color_creation_tools_grey_03));
                        }
                        c146106i8.A0D = v0r.A04().getString(2131960877);
                        c146106i8.A0G = AbstractC166997dE.A0p(v0r.A04(), 2131960876);
                        c146106i8.A0A(new G97(v0r, 3));
                        c146106i8.A01();
                        c146106i8.A00();
                        AbstractC31178DnM.A1S(c146106i8);
                    } else {
                        Activity activity = v0r.A00;
                        if (activity != null) {
                            activity.setResult(3);
                        } else {
                            str = "activity";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                }
                C0w9.A03("DirectWelcomeMessageSettingManager", "Failed to update the welcome message from the server");
                i = 1175927368;
                C0f9.A0A(i, A0N);
                return;
            case 27:
                A0N = C0f9.A03(542921520);
                C70807WhN c70807WhN2 = (C70807WhN) this.A01;
                C14120nc.A00().ATO(new V68(c70807WhN2));
                V0R v0r2 = c70807WhN2.A02;
                if (v0r2 != null) {
                    V0R.A02(v0r2);
                    V0R.A03(v0r2);
                    AbstractC34057F1k.A00(v0r2.A04(), v0r2.A06(), 2131974293);
                }
                C0w9.A03("DirectWelcomeMessageSettingManager", "Failed to get the welcome message from the server");
                i = 749446791;
                C0f9.A0A(i, A0N);
                return;
            case 31:
                A0N = C0f9.A03(-1486032112);
                Throwable A015 = abstractC115105If.A01();
                InterfaceC71955XCh interfaceC71955XCh = (InterfaceC71955XCh) this.A01;
                if (A015 == null) {
                    localizedMessage = null;
                } else {
                    localizedMessage = A015.getLocalizedMessage();
                }
                interfaceC71955XCh.DLx(localizedMessage);
                i = -86206948;
                C0f9.A0A(i, A0N);
                return;
            case 32:
                A0N = C0f9.A03(-548777577);
                C71139Woa c71139Woa = (C71139Woa) this.A01;
                C9GR.A01(c71139Woa.A00, AbstractC111324zv.A00(2676), 2131972429, 1);
                c71139Woa.A03.A05("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
                i = 665450051;
                C0f9.A0A(i, A0N);
                return;
            case 33:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 788833056);
                Throwable A016 = abstractC115105If.A01();
                if (!(A016 instanceof Exception) || (runtimeException = (Exception) A016) == null) {
                    runtimeException = new RuntimeException("Failed to allocate turn.");
                }
                AbstractC70118W4q.A01((AbstractC70118W4q) this.A01, runtimeException);
                i = 886069796;
                C0f9.A0A(i, A0N);
                return;
            case 34:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 6974398);
                Throwable A017 = abstractC115105If.A01();
                if (!(A017 instanceof Exception) || (runtimeException2 = (Exception) A017) == null) {
                    runtimeException2 = new RuntimeException("Failed to discover relays.");
                }
                A00(runtimeException2);
                i = -1894261168;
                C0f9.A0A(i, A0N);
                return;
            case 36:
                A0N = C0f9.A03(-435986041);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                C69153Vii c69153Vii = (C69153Vii) this.A01;
                C25671My A00 = AbstractC25651Mw.A00(c69153Vii.A01);
                ?? obj2 = new Object();
                obj2.A00 = false;
                A00.E4s(obj2);
                Context context4 = c69153Vii.A00;
                new IgdsSnackBar(context4, null, 0);
                C146106i8 c146106i82 = new C146106i8();
                c146106i82.A05();
                c146106i82.A0H = "search_history_clear_all_fail";
                c146106i82.A0D = context4.getResources().getString(2131973016);
                AbstractC25233BEq.A1F(c146106i82);
                i = -809158667;
                C0f9.A0A(i, A0N);
                return;
            case 39:
                A0N = C0f9.A03(1890773790);
                C0w9.A03("RapidFeedbackAnalyticsUtil", AnonymousClass001.A0g("Survey Post Impression:", AbstractC68581VWi.A00((Integer) this.A01), " Failed"));
                i = -1395216774;
                C0f9.A0A(i, A0N);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        String str;
        String str2;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(2141299135);
                i = 482072106;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(2066174810);
                V0N v0n = (V0N) this.A01;
                C3FR c3fr = v0n.A03;
                if (c3fr == null) {
                    str2 = "recyclerViewProxy";
                } else {
                    c3fr.EWc(false);
                    InterfaceC70513Em interfaceC70513Em = v0n.A04;
                    str = "pullToRefresh";
                    if (interfaceC70513Em != null) {
                        interfaceC70513Em.setIsLoading(false);
                        InterfaceC70513Em interfaceC70513Em2 = v0n.A04;
                        if (interfaceC70513Em2 != null) {
                            if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                                C67920V2k c67920V2k = v0n.A01;
                                if (c67920V2k == null) {
                                    str2 = "promoteAdToolsAdapter";
                                } else {
                                    c67920V2k.A00(v0n.A0A);
                                    SpinnerImageView spinnerImageView = v0n.A05;
                                    if (spinnerImageView != null) {
                                        spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                                    }
                                }
                            }
                            i = -940760602;
                            C0f9.A0A(i, A03);
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 8:
                A03 = C0f9.A03(-1671561229);
                V16.A05((V16) this.A01);
                i = 661191896;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A03 = C0f9.A03(699661083);
                V16 v16 = (V16) this.A01;
                if (!v16.A0V) {
                    C70814WhX c70814WhX = v16.A08;
                    if (c70814WhX == null) {
                        str = "userFlowLogger";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    long j = c70814WhX.A00;
                    if (j != 0) {
                        c70814WhX.A01.flowMarkPoint(j, "ads_manager_suggested_boost_loaded");
                    }
                }
                V16.A05(v16);
                i = 978693704;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A03 = C0f9.A03(1946366105);
                super.onFinish();
                FRW frw = ((C67870V0b) this.A01).A04;
                if (frw != null) {
                    frw.A01.setIsLoading(false);
                    i = -1625717304;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "actionBarButtonController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-1078378236);
                super.onFinish();
                V11 v11 = (V11) this.A01;
                FRW frw2 = v11.A04;
                if (frw2 != null) {
                    frw2.A01.setIsLoading(false);
                    C70813WhW c70813WhW = (C70813WhW) v11.A0M.getValue();
                    long j2 = c70813WhW.A00;
                    if (j2 != 0) {
                        c70813WhW.A01.flowMarkPoint(j2, "promote_audience_hec_appeal_rendered");
                    }
                    i = 497158692;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "actionBarButtonController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 14:
                A03 = C0f9.A03(-1912780442);
                SpinnerImageView spinnerImageView2 = ((V0Q) this.A01).A01;
                if (spinnerImageView2 != null) {
                    spinnerImageView2.setLoadingStatus(C3T1.SUCCESS);
                    i = 493529488;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "loadingSpinner";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-688829320);
                SpinnerImageView spinnerImageView3 = ((V0Q) this.A01).A01;
                if (spinnerImageView3 != null) {
                    spinnerImageView3.setLoadingStatus(C3T1.SUCCESS);
                    i = 2003314079;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "loadingSpinner";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 16:
                A03 = C0f9.A03(186436521);
                SpinnerImageView spinnerImageView4 = ((V0Q) this.A01).A01;
                if (spinnerImageView4 != null) {
                    spinnerImageView4.setLoadingStatus(C3T1.SUCCESS);
                    i = -2071539960;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "loadingSpinner";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 28:
                A03 = C0f9.A03(435279281);
                Iterator it = ((C69619VsM) this.A01).A04.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                i = 1963724113;
                C0f9.A0A(i, A03);
                return;
            case 32:
                A03 = C0f9.A03(2041700101);
                C71139Woa c71139Woa = (C71139Woa) this.A01;
                c71139Woa.A03.A06("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", c71139Woa.A02);
                i = 1824785794;
                C0f9.A0A(i, A03);
                return;
            case 38:
                A03 = C0f9.A03(678179285);
                super.onFinish();
                U06.A01 = false;
                i = -739092460;
                C0f9.A0A(i, A03);
                return;
            default:
                super.onFinish();
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        String str;
        String str2;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(-1872373836);
                i = 2053190460;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(92303399);
                V0N v0n = (V0N) this.A01;
                C3FR c3fr = v0n.A03;
                if (c3fr == null) {
                    str2 = "recyclerViewProxy";
                } else {
                    c3fr.EWc(true);
                    InterfaceC70513Em interfaceC70513Em = v0n.A04;
                    str = "pullToRefresh";
                    if (interfaceC70513Em != null) {
                        interfaceC70513Em.setIsLoading(true);
                        InterfaceC70513Em interfaceC70513Em2 = v0n.A04;
                        if (interfaceC70513Em2 != null) {
                            if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                                C67920V2k c67920V2k = v0n.A01;
                                if (c67920V2k == null) {
                                    str2 = "promoteAdToolsAdapter";
                                } else {
                                    c67920V2k.A00(new ArrayList());
                                    SpinnerImageView spinnerImageView = v0n.A05;
                                    if (spinnerImageView != null) {
                                        spinnerImageView.setLoadingStatus(C3T1.LOADING);
                                    }
                                }
                            }
                            i = -332393585;
                            C0f9.A0A(i, A03);
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 8:
                A03 = C0f9.A03(303014324);
                V16.A06((V16) this.A01);
                i = 1982021556;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A03 = C0f9.A03(-497545006);
                V16.A06((V16) this.A01);
                i = -1621977622;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = C0f9.A03(-865189123);
                super.onStart();
                V16.A06((V16) this.A01);
                i = 812538530;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A03 = C0f9.A03(56477904);
                super.onStart();
                FRW frw = ((C67870V0b) this.A01).A04;
                if (frw != null) {
                    frw.A01.setIsLoading(true);
                    i = -498034288;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "actionBarButtonController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(1059442304);
                super.onStart();
                FRW frw2 = ((V11) this.A01).A04;
                if (frw2 != null) {
                    frw2.A01.setIsLoading(true);
                    i = 46644464;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "actionBarButtonController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 14:
                A03 = C0f9.A03(2116986142);
                super.onStart();
                V0Q v0q = (V0Q) this.A01;
                List list = v0q.A07;
                list.clear();
                C66412UGg c66412UGg = (C66412UGg) v0q.A0B.getValue();
                c66412UGg.A00 = list;
                c66412UGg.notifyDataSetChanged();
                SpinnerImageView spinnerImageView2 = v0q.A01;
                if (spinnerImageView2 != null) {
                    spinnerImageView2.setLoadingStatus(C3T1.LOADING);
                    i = -750732443;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "loadingSpinner";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-564982228);
                V0Q v0q2 = (V0Q) this.A01;
                if (v0q2.A07.isEmpty()) {
                    SpinnerImageView spinnerImageView3 = v0q2.A01;
                    if (spinnerImageView3 != null) {
                        spinnerImageView3.setLoadingStatus(C3T1.LOADING);
                    }
                    str = "loadingSpinner";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i = 520826202;
                C0f9.A0A(i, A03);
                return;
            case 16:
                A03 = C0f9.A03(1052260905);
                super.onStart();
                V0Q v0q3 = (V0Q) this.A01;
                List list2 = v0q3.A07;
                list2.clear();
                C66412UGg c66412UGg2 = (C66412UGg) v0q3.A0B.getValue();
                c66412UGg2.A00 = list2;
                c66412UGg2.notifyDataSetChanged();
                SpinnerImageView spinnerImageView4 = v0q3.A01;
                if (spinnerImageView4 != null) {
                    spinnerImageView4.setLoadingStatus(C3T1.LOADING);
                    i = 678833700;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "loadingSpinner";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 28:
                A03 = C0f9.A03(-1609917549);
                Iterator it = ((C69619VsM) this.A01).A04.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                i = 362426013;
                C0f9.A0A(i, A03);
                return;
            case 32:
                A03 = C0f9.A03(525739454);
                i = 1068563387;
                C0f9.A0A(i, A03);
                return;
            default:
                super.onStart();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c4, code lost:
    
        if (r6 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08a5, code lost:
    
        if (r5.length() == 0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0a03, code lost:
    
        if (r1 != com.instagram.api.schemas.InstagramMediaProductType.A0k) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x13d0, code lost:
    
        if (r0.A01 == true) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x13d2, code lost:
    
        r0 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x13d4, code lost:
    
        if (r0 == null) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x13d6, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x13d8, code lost:
    
        if (r0 == null) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x13da, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x13dc, code lost:
    
        if (r0 == null) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x13de, code lost:
    
        r2 = new java.util.ArrayList();
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x13eb, code lost:
    
        if (r1.hasNext() == false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x13ed, code lost:
    
        r0 = ((X.C68796VcD) r1.next()).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x13f5, code lost:
    
        if (r0 == null) goto L903;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x13f7, code lost:
    
        r2.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x1400, code lost:
    
        r10 = new java.util.ArrayList();
        r9 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x140d, code lost:
    
        if (r9.hasNext() == false) goto L906;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x140f, code lost:
    
        r2 = r9.next();
        r1 = (X.C69454Vnd) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x1418, code lost:
    
        if (r1.A0A == null) goto L910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x141c, code lost:
    
        if (r1.A09 == null) goto L911;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x1420, code lost:
    
        if (r1.A0B == null) goto L912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x1422, code lost:
    
        r10.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x1426, code lost:
    
        r0 = X.AbstractC167017dG.A0q(r10);
        r12 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x1432, code lost:
    
        if (r12.hasNext() == false) goto L914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x1434, code lost:
    
        r11 = (X.C69454Vnd) r12.next();
        r1 = r11.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x143c, code lost:
    
        if (r1 == null) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x143e, code lost:
    
        r10 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x1444, code lost:
    
        if (r11.A0A == null) goto L915;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x1446, code lost:
    
        r9 = r11.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x1448, code lost:
    
        if (r9 == null) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x144a, code lost:
    
        r15 = new com.instagram.common.typedurl.SimpleImageUrl(r11.A09);
        r14 = X.VRI.A00(r11.A08);
        r2 = r11.A01;
        X.VRK.A00(r10, "CALL");
        X.VRK.A00(r10, com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion.EMAIL);
        X.VRK.A00(r10, "DIRECTION");
        X.VRK.A00(r10, "TEXT");
        X.VRK.A00(r10, "BIO_LINK_CLICKED");
        r0.add(new X.C69282Vkq(r14, r15, false, r9, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x148a, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x1490, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x1483, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x1493, code lost:
    
        r2 = new X.C69092Vhi(r8, r0, r5);
        r1 = r6.A04.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x14a2, code lost:
    
        if (r1.hasNext() == false) goto L917;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x14a4, code lost:
    
        ((X.XCI) r1.next()).onSuccess(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x14ae, code lost:
    
        X.C0f9.A0A(-1976844391, r4);
        r0 = 447118604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x1491, code lost:
    
        r0 = X.C16930sl.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x13fd, code lost:
    
        if (r1 != null) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x14e6, code lost:
    
        if (r0.A01 == true) goto L749;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x14e8, code lost:
    
        r0 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x14ea, code lost:
    
        if (r0 == null) goto L801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x14ec, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x14ee, code lost:
    
        if (r0 == null) goto L801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x14f0, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x14f2, code lost:
    
        if (r0 == null) goto L801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x14f4, code lost:
    
        r5 = new java.util.ArrayList();
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x1501, code lost:
    
        if (r1.hasNext() == false) goto L918;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x1503, code lost:
    
        r0 = ((X.C68782Vbz) r1.next()).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x150b, code lost:
    
        if (r0 == null) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x150d, code lost:
    
        r5.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x1516, code lost:
    
        r10 = new java.util.ArrayList();
        r9 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x1523, code lost:
    
        if (r9.hasNext() == false) goto L923;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x1525, code lost:
    
        r5 = r9.next();
        r1 = (X.C69458Vnh) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x152e, code lost:
    
        if (r1.A0B == null) goto L929;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x1530, code lost:
    
        r0 = r1.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x1532, code lost:
    
        if (r0 == null) goto L930;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x1536, code lost:
    
        if (r0.A00 == null) goto L931;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x153a, code lost:
    
        if (r1.A0C == null) goto L932;
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x153c, code lost:
    
        r10.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x1540, code lost:
    
        r5 = X.AbstractC167017dG.A0q(r10);
        r12 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:893:0x154c, code lost:
    
        if (r12.hasNext() == false) goto L936;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x154e, code lost:
    
        r11 = (X.C69458Vnh) r12.next();
        r0 = r11.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:895:0x1556, code lost:
    
        if (r0 == null) goto L794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x1558, code lost:
    
        r10 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:898:0x155e, code lost:
    
        if (r11.A0B == null) goto L937;
     */
    /* JADX WARN: Code restructure failed: missing block: B:899:0x1560, code lost:
    
        r9 = r11.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x1562, code lost:
    
        if (r9 == null) goto L934;
     */
    /* JADX WARN: Code restructure failed: missing block: B:901:0x1564, code lost:
    
        r0 = r11.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x1566, code lost:
    
        if (r0 == null) goto L935;
     */
    /* JADX WARN: Code restructure failed: missing block: B:903:0x1568, code lost:
    
        r15 = new com.instagram.common.typedurl.SimpleImageUrl(r0.A00);
        r14 = X.VRI.A00(r11.A0A);
     */
    /* JADX WARN: Code restructure failed: missing block: B:904:0x1575, code lost:
    
        if (r10 == null) goto L793;
     */
    /* JADX WARN: Code restructure failed: missing block: B:905:0x1577, code lost:
    
        r1 = r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:907:0x1579, code lost:
    
        X.VRJ.A00(r10, "BIO_LINK_CLICKED");
        X.VRJ.A00(r10, "CALL");
        X.VRJ.A00(r10, com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion.EMAIL);
        X.VRJ.A00(r10, "DIRECTION");
        X.VRJ.A00(r10, "TEXT");
        r5.add(new X.C69282Vkq(r14, r15, false, r9, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:908:0x15a3, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:912:0x15ac, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x15b2, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:918:0x15b8, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:919:0x15a5, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:921:0x15bb, code lost:
    
        r2 = new X.C69575Vre(r8, r5, r6);
        r1 = r7.A04.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:923:0x15ca, code lost:
    
        if (r1.hasNext() == false) goto L940;
     */
    /* JADX WARN: Code restructure failed: missing block: B:924:0x15cc, code lost:
    
        ((X.XCI) r1.next()).onSuccess(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x15d6, code lost:
    
        X.C0f9.A0A(177922502, r4);
        r0 = 402042892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x15b9, code lost:
    
        r5 = X.C16930sl.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:929:0x1513, code lost:
    
        if (r1 != null) goto L749;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:548:0x0e67. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:742:0x132b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x01fa. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0e4c  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0e70  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0e78  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0e7f  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0e87  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0e8e  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0e6a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0e95  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0ebc  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0f95  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x1206  */
    /* JADX WARN: Type inference failed for: r0v150, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v164, types: [com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v222, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v358, types: [java.lang.Object, X.WfZ, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v48, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v193, types: [X.1My] */
    /* JADX WARN: Type inference failed for: r1v223, types: [X.1My] */
    /* JADX WARN: Type inference failed for: r1v338, types: [X.VkF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v344, types: [X.VlG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v367, types: [X.U11] */
    /* JADX WARN: Type inference failed for: r1v368, types: [X.U2R] */
    /* JADX WARN: Type inference failed for: r1v370, types: [X.W61] */
    /* JADX WARN: Type inference failed for: r33v0, types: [X.1P1, X.TzI] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, X.VJl] */
    /* JADX WARN: Type inference failed for: r4v65, types: [X.1My] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 5894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66081TzI.onSuccess(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(693394347);
                Q0U q0u = (Q0U) obj;
                int A0N = AbstractC167017dG.A0N(q0u, 988641867);
                Q0S q0s = (Q0S) this.A01;
                q0s.A02.execute(new Q0T(q0u, q0s));
                C0f9.A0A(-1012851173, A0N);
                i = -133045799;
                C0f9.A0A(i, A03);
                return;
            case 21:
                A03 = C0f9.A03(217018337);
                int A032 = C0f9.A03(-1644042935);
                UserSession userSession = ((C67892V0z) this.A01).A0H;
                if (userSession != null) {
                    AbstractC25651Mw.A00(userSession).E4s(new C155046xt(C05F.A1I));
                    C0f9.A0A(933479065, A032);
                    i = 578672950;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            case 22:
                A03 = C0f9.A03(-1495660459);
                int A033 = C0f9.A03(941990356);
                UserSession userSession2 = ((C67892V0z) this.A01).A0H;
                if (userSession2 != null) {
                    AbstractC25651Mw.A00(userSession2).E4s(new C155046xt(C05F.A03));
                    C0f9.A0A(1685141030, A033);
                    i = -550417738;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            default:
                super.onSuccessInBackground(obj);
                return;
        }
    }

    public final void A00(Exception exc) {
        C0K8.A0O("IGMultiRelayDiscoveryQuery:", AbstractC43591JPw.A00(621), exc.getMessage());
        AbstractC70118W4q.A01((AbstractC70118W4q) this.A01, exc);
    }
}
