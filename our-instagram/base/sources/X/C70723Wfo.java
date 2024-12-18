package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wfo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70723Wfo implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public C70723Wfo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v242, types: [java.lang.Object, X.PqH] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, X.PqH] */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        int i2;
        int A032;
        int i3;
        String str;
        XAD xad;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(53915912);
                C191228dL c191228dL = (C191228dL) obj;
                int A033 = C0f9.A03(-2145002061);
                C14360o3.A0B(c191228dL, 0);
                int intValue = c191228dL.A01.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        C70185WFo c70185WFo = (C70185WFo) this.A01;
                        if (intValue != 3) {
                            C70185WFo.A02(c70185WFo);
                            if (c70185WFo.A04 == null) {
                                View inflate = c70185WFo.A08.inflate();
                                C14360o3.A0C(inflate, AbstractC111324zv.A00(48));
                                IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
                                c70185WFo.A04 = igFrameLayout;
                                if (igFrameLayout == null) {
                                    str = "instructionImageLayout";
                                    C14360o3.A0F(str);
                                    throw C00O.createAndThrow();
                                }
                                int paddingLeft = igFrameLayout.getPaddingLeft();
                                int i4 = c70185WFo.A06;
                                igFrameLayout.setPadding(paddingLeft + i4, igFrameLayout.getPaddingTop(), igFrameLayout.getPaddingRight() + i4, igFrameLayout.getPaddingBottom());
                                c70185WFo.A02 = (ImageView) igFrameLayout.findViewById(R.id.ar_effect_instruction_image);
                            }
                            ImageView imageView = c70185WFo.A02;
                            if (imageView == null) {
                                str = "instructionImageView";
                                C14360o3.A0F(str);
                                throw C00O.createAndThrow();
                            }
                            AbstractC125325le A00 = AbstractC125325le.A00(imageView);
                            C14360o3.A07(A00);
                            A00.A0G();
                            List list = c191228dL.A04;
                            List list2 = c191228dL.A06;
                            List list3 = c191228dL.A05;
                            String str3 = c191228dL.A02;
                            if (list != null && list2 != null && list3 != null && str3 != null) {
                                C14120nc.A00().ATO(new C68015V6h(c70185WFo, str3, list, list2, list3));
                            }
                        } else {
                            if (c70185WFo.A02 != null) {
                                C70185WFo.A04(c70185WFo, true);
                            }
                            if (c70185WFo.A03 != null) {
                                C70185WFo.A01(c70185WFo);
                            }
                        }
                    } else {
                        C70185WFo c70185WFo2 = (C70185WFo) this.A01;
                        ImageView imageView2 = c70185WFo2.A02;
                        if (imageView2 != null) {
                            c70185WFo2.A05 = true;
                            AbstractC125325le.A01(imageView2, 0).A0G();
                            c70185WFo2.A08.setVisibility(8);
                            C70185WFo.A04(c70185WFo2, false);
                        }
                        String str4 = c191228dL.A03;
                        if (str4 != null) {
                            C173027nG c173027nG = (C173027nG) c70185WFo2.A09.A0F().get(str4);
                            if (c173027nG != null) {
                                str2 = c173027nG.A01;
                            } else {
                                str2 = null;
                            }
                            C70185WFo.A03(c70185WFo2, str2);
                        }
                    }
                } else {
                    C70185WFo c70185WFo3 = (C70185WFo) this.A01;
                    ImageView imageView3 = c70185WFo3.A02;
                    if (imageView3 != null) {
                        c70185WFo3.A05 = true;
                        AbstractC125325le.A01(imageView3, 0).A0G();
                        c70185WFo3.A08.setVisibility(8);
                        C70185WFo.A04(c70185WFo3, false);
                    }
                    String str5 = c191228dL.A02;
                    long j = c191228dL.A00;
                    C70185WFo.A03(c70185WFo3, str5);
                    if (j > 0) {
                        View view = c70185WFo3.A07;
                        Runnable runnable = c70185WFo3.A0D;
                        view.removeCallbacks(runnable);
                        view.postDelayed(runnable, j);
                    }
                }
                C0f9.A0A(657845776, A033);
                i = 1288804687;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(-238690322);
                C70711Wfa c70711Wfa = (C70711Wfa) obj;
                int A034 = C0f9.A03(-170646703);
                C14360o3.A0B(c70711Wfa, 0);
                UFQ ufq = (UFQ) this.A01;
                UserSession userSession = ufq.A08;
                AbstractC25651Mw.A00(userSession).A02(this, C70711Wfa.class);
                int intValue2 = c70711Wfa.A01.intValue();
                boolean z = ufq.A04;
                if (intValue2 == 1) {
                    if (z) {
                        UFQ.A00(ufq);
                    }
                    C70399WUb.A01(null, null, C70399WUb.A00(userSession), null, VG4.A1M.toString(), null, null, c70711Wfa.A00.toString(), null, null, null, null);
                } else {
                    if (z) {
                        UFQ.A02(ufq, false);
                    }
                    C70399WUb.A00(userSession).A0F(VG4.A1M, c70711Wfa.A00.toString());
                }
                C0f9.A0A(869385036, A034);
                i = -1999908028;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(-1708727015);
                int A035 = C0f9.A03(1340311529);
                V16 v16 = (V16) this.A01;
                C70654Wea c70654Wea = v16.A0E;
                if (c70654Wea != null) {
                    V16.A0A(v16, c70654Wea, "ad_tools_pro2pro");
                }
                C0f9.A0A(-745864681, A035);
                i = 777080588;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A032 = C0f9.A03(-1457103777);
                int A036 = C0f9.A03(298265);
                V16 v162 = (V16) this.A01;
                V16.A09(v162);
                V16.A04(v162);
                C0f9.A0A(-1921541743, A036);
                i3 = -273941753;
                C0f9.A0A(i3, A032);
                return;
            case 4:
                A032 = C0f9.A03(-2124804148);
                int A037 = C0f9.A03(159182532);
                V15 v15 = (V15) this.A01;
                v15.A00 = 0;
                v15.A0G.clear();
                v15.A0C = false;
                V15.A02(v15, false);
                C0f9.A0A(-1551616866, A037);
                i3 = -944185673;
                C0f9.A0A(i3, A032);
                return;
            case 5:
                A032 = C0f9.A03(916891570);
                int A038 = C0f9.A03(1472758240);
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A0D = ((Fragment) this.A01).getString(2131970425);
                AbstractC25233BEq.A1F(c146106i8);
                C0f9.A0A(-881472967, A038);
                i3 = 2097033367;
                C0f9.A0A(i3, A032);
                return;
            case 6:
                A032 = C0f9.A03(1089085131);
                int A039 = C0f9.A03(-894266010);
                ((V0X) this.A01).Czp();
                C0f9.A0A(726527651, A039);
                i3 = -1289527338;
                C0f9.A0A(i3, A032);
                return;
            case 7:
                A032 = C0f9.A03(1672621385);
                C70711Wfa c70711Wfa2 = (C70711Wfa) obj;
                int A0310 = C0f9.A03(476618362);
                C14360o3.A0B(c70711Wfa2, 0);
                C67892V0z c67892V0z = (C67892V0z) this.A01;
                UserSession userSession2 = c67892V0z.A0H;
                if (userSession2 == null) {
                    str = "userSession";
                } else {
                    AbstractC25651Mw.A00(userSession2).A02(this, C70711Wfa.class);
                    int intValue3 = c70711Wfa2.A01.intValue();
                    boolean z2 = c67892V0z.A0L;
                    if (intValue3 == 1) {
                        if (z2) {
                            C70399WUb c70399WUb = c67892V0z.A0B;
                            if (c70399WUb != null) {
                                c70399WUb.A0S(VG4.A1M.toString(), "resume_create_promotion");
                            }
                            C1UC activity = c67892V0z.getActivity();
                            if ((activity instanceof XAD) && (xad = (XAD) activity) != null) {
                                xad.AMs(VG4.A1Q, new C70651WeX(c67892V0z));
                            }
                        }
                        C70399WUb c70399WUb2 = c67892V0z.A0B;
                        if (c70399WUb2 != null) {
                            PromoteData promoteData = c67892V0z.A0F;
                            if (promoteData == null) {
                                str = "promoteData";
                            } else {
                                VG4 vg4 = VG4.A1M;
                                String obj2 = c70711Wfa2.A00.toString();
                                C70399WUb.A01(promoteData.A0S, promoteData.A0h, c70399WUb2, null, vg4.toString(), AbstractC31180DnO.A0k(promoteData.A0i), null, obj2, promoteData.A1E, null, null, null);
                            }
                        }
                    } else {
                        if (z2) {
                            C70399WUb c70399WUb3 = c67892V0z.A0B;
                            if (c70399WUb3 != null) {
                                c70399WUb3.A0V(VG4.A1Q.toString(), "create_promotion", "unresolved_billing_wizard");
                            }
                            C67892V0z.A06(c67892V0z, false);
                        }
                        C70399WUb c70399WUb4 = c67892V0z.A0B;
                        if (c70399WUb4 != null) {
                            c70399WUb4.A0F(VG4.A1M, c70711Wfa2.A00.toString());
                        }
                    }
                    C0f9.A0A(1322037692, A0310);
                    i3 = -401345127;
                    C0f9.A0A(i3, A032);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 8:
                A032 = C0f9.A03(-102052522);
                int A0311 = C0f9.A03(1875838330);
                ((V0W) this.A01).Czp();
                C0f9.A0A(705011198, A0311);
                i3 = -837725859;
                C0f9.A0A(i3, A032);
                return;
            case 9:
                A032 = C0f9.A03(651231508);
                int A0312 = C0f9.A03(-551176417);
                C69349Vlv c69349Vlv = (C69349Vlv) this.A01;
                String str6 = c69349Vlv.A05;
                if (str6.equals(((C2Io) obj).A00.A00)) {
                    C81663kb A0N = ((C2DU) c69349Vlv.A03).A0N(str6);
                    C68750VbT c68750VbT = c69349Vlv.A04;
                    if (A0N != null) {
                        WD9 wd9 = c68750VbT.A00;
                        wd9.A02 = false;
                        WD9.A00(wd9);
                        wd9.A07.A00();
                        wd9.A05.En8(str6);
                    } else {
                        WD9 wd92 = c68750VbT.A00;
                        wd92.A02 = false;
                        WD9.A00(wd92);
                        wd92.A07.A00();
                        WD9.A01(wd92, AbstractC166997dE.A0p(wd92.A03, 2131976811));
                    }
                }
                C0f9.A0A(473422465, A0312);
                i3 = 708257989;
                C0f9.A0A(i3, A032);
                return;
            case 10:
                A032 = C0f9.A03(1439765136);
                int A0313 = C0f9.A03(482395568);
                WD9 wd93 = (WD9) this.A01;
                List list4 = wd93.A01;
                if (list4 != null) {
                    wd93.A02(list4);
                }
                C0f9.A0A(1980765453, A0313);
                i3 = -82199598;
                C0f9.A0A(i3, A032);
                return;
            case 11:
                A032 = C0f9.A03(-2118631797);
                C42240InQ c42240InQ = (C42240InQ) obj;
                int A0N2 = AbstractC167017dG.A0N(c42240InQ, -1669423790);
                ((C66290U7l) this.A01).A05 = c42240InQ.A00;
                C0f9.A0A(-2096938581, A0N2);
                i3 = -624033348;
                C0f9.A0A(i3, A032);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A032 = C0f9.A03(-953052619);
                int A0314 = C0f9.A03(981270143);
                C66095TzW.A00(((LocationDetailFragment) this.A01).A01.A03);
                C0f9.A0A(-863879967, A0314);
                i3 = -1360359564;
                C0f9.A0A(i3, A032);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A032 = C0f9.A03(548925895);
                int A0315 = C0f9.A03(-1877668807);
                ((LocationDetailFragment) this.A01).A01.A03.A03(((C42251Inb) obj).A00.getId());
                C0f9.A0A(616148773, A0315);
                i3 = 1274135750;
                C0f9.A0A(i3, A032);
                return;
            case 14:
                A03 = C0f9.A03(1495661302);
                C70709WfY c70709WfY = (C70709WfY) obj;
                int A0316 = C0f9.A03(-1396384300);
                MediaMapFragment mediaMapFragment = (MediaMapFragment) this.A01;
                Iterator it = MediaMapFragment.A02(mediaMapFragment).iterator();
                while (true) {
                    if (it.hasNext()) {
                        MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                        if (AbstractC69973Vyo.A01(mediaMapPin).equals(c70709WfY.A00.A05())) {
                            mediaMapFragment.A09.A02(mediaMapFragment.A05, mediaMapPin);
                            mediaMapFragment.mMapViewController.A08();
                        }
                    }
                }
                C0f9.A0A(754928367, A0316);
                i = -1495712553;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGTERM /* 15 */:
                C0f9.A03(-295810810);
                C0f9.A03(1989044153);
                throw new NullPointerException(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            case 16:
                A032 = C0f9.A03(600441261);
                int A0317 = C0f9.A03(-879229344);
                Activity rootActivity = ((AbstractC59962oe) this.A01).getRootActivity();
                if (rootActivity != null) {
                    AbstractC31175DnJ.A0i(rootActivity);
                }
                C0f9.A0A(268526901, A0317);
                i3 = -1743125929;
                C0f9.A0A(i3, A032);
                return;
            case 17:
                A032 = C0f9.A03(-1210810095);
                int A0318 = C0f9.A03(-1207123601);
                V1F v1f = (V1F) this.A01;
                C65960TxC c65960TxC = v1f.A03;
                if (c65960TxC != null) {
                    c65960TxC.A01 = U24.A00();
                    C52198N8n c52198N8n = v1f.A02;
                    if (c52198N8n != null) {
                        c52198N8n.A00();
                        C0f9.A0A(1524805488, A0318);
                        i3 = 980568631;
                        C0f9.A0A(i3, A032);
                        return;
                    }
                    str = "searchAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "dataSource";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 18:
                int A0319 = C0f9.A03(2114275616);
                int A0320 = C0f9.A03(1777053949);
                V1F v1f2 = (V1F) this.A01;
                C65960TxC c65960TxC2 = v1f2.A03;
                if (c65960TxC2 != null) {
                    c65960TxC2.A04();
                    C52198N8n c52198N8n2 = v1f2.A02;
                    if (c52198N8n2 != null) {
                        c52198N8n2.A00();
                        C0f9.A0A(-922577956, A0320);
                        C0f9.A0A(574871750, A0319);
                        return;
                    }
                    str = "searchAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "dataSource";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Process.SIGSTOP /* 19 */:
                A032 = C0f9.A03(-1187793325);
                int A0N3 = AbstractC167017dG.A0N(obj, -2129549929);
                AbstractC65919TwQ abstractC65919TwQ = (AbstractC65919TwQ) this.A01;
                C65960TxC c65960TxC3 = abstractC65919TwQ.A07;
                if (c65960TxC3 != null) {
                    C65963TxG.A00(c65960TxC3, abstractC65919TwQ);
                    C0f9.A0A(-2059100241, A0N3);
                    i3 = -1803062446;
                    C0f9.A0A(i3, A032);
                    return;
                }
                str = "dataSource";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 20:
                A032 = C0f9.A03(-136159863);
                int A0321 = C0f9.A03(-1040047978);
                AbstractC65919TwQ abstractC65919TwQ2 = (AbstractC65919TwQ) this.A01;
                C65960TxC c65960TxC4 = abstractC65919TwQ2.A07;
                if (c65960TxC4 != null) {
                    c65960TxC4.A01 = U24.A00();
                    abstractC65919TwQ2.A0H().A01.A01();
                    C0f9.A0A(622820569, A0321);
                    i3 = -732956226;
                    C0f9.A0A(i3, A032);
                    return;
                }
                str = "dataSource";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 21:
                A032 = C0f9.A03(1026367634);
                int A0322 = C0f9.A03(1081838548);
                AbstractC65919TwQ abstractC65919TwQ3 = (AbstractC65919TwQ) this.A01;
                C65960TxC c65960TxC5 = abstractC65919TwQ3.A07;
                if (c65960TxC5 != null) {
                    C65963TxG.A00(c65960TxC5, abstractC65919TwQ3);
                    C0f9.A0A(-1071831290, A0322);
                    i3 = 948426080;
                    C0f9.A0A(i3, A032);
                    return;
                }
                str = "dataSource";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 22:
                A032 = C0f9.A03(-1091540608);
                int A0323 = C0f9.A03(1664784095);
                AbstractC65919TwQ abstractC65919TwQ4 = (AbstractC65919TwQ) this.A01;
                C65960TxC c65960TxC6 = abstractC65919TwQ4.A07;
                if (c65960TxC6 != null) {
                    C65963TxG.A00(c65960TxC6, abstractC65919TwQ4);
                    C0f9.A0A(-197131659, A0323);
                    i3 = 217367527;
                    C0f9.A0A(i3, A032);
                    return;
                }
                str = "dataSource";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 23:
                A032 = C0f9.A03(-1417111357);
                int A0324 = C0f9.A03(1284178712);
                C14360o3.A0B(obj, 0);
                C65823Tug c65823Tug = ((AbstractC67878V0j) this.A01).A06;
                if (c65823Tug != null) {
                    C66095TzW c66095TzW = c65823Tug.A0E;
                    if (c66095TzW.A03 && c66095TzW.A05) {
                        c66095TzW.A05 = false;
                        C66095TzW.A00(c66095TzW);
                    }
                    C0f9.A0A(1766497264, A0324);
                    i3 = 1433067806;
                    C0f9.A0A(i3, A032);
                    return;
                }
                str = "grid";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 24:
                A032 = C0f9.A03(1977395886);
                C42251Inb c42251Inb = (C42251Inb) obj;
                int A0N4 = AbstractC167017dG.A0N(c42251Inb, 295084816);
                C65823Tug c65823Tug2 = ((AbstractC67878V0j) this.A01).A06;
                if (c65823Tug2 == null) {
                    C14360o3.A0F("grid");
                    throw C00O.createAndThrow();
                }
                C66095TzW c66095TzW2 = c65823Tug2.A0E;
                String id = c42251Inb.A00.getId();
                if (id != null) {
                    c66095TzW2.A03(id);
                    C0f9.A0A(-168103152, A0N4);
                    i3 = 1367622871;
                    C0f9.A0A(i3, A032);
                    return;
                }
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0A(-189046684, A0N4);
                throw A0g;
            case 25:
                A032 = C0f9.A03(632895869);
                C70073Cr c70073Cr = (C70073Cr) obj;
                int A0N5 = AbstractC167017dG.A0N(c70073Cr, -1210613922);
                C65823Tug c65823Tug3 = ((AbstractC67878V0j) this.A01).A06;
                if (c65823Tug3 != null) {
                    User user = c70073Cr.A00;
                    c65823Tug3.A07(user, user.CQf());
                    C0f9.A0A(-523774600, A0N5);
                    i3 = -2140791097;
                    C0f9.A0A(i3, A032);
                    return;
                }
                str = "grid";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 26:
                A03 = C0f9.A03(-1672141350);
                C71H c71h = (C71H) obj;
                int A0N6 = AbstractC167017dG.A0N(c71h, 372180937);
                C71185WpX c71185WpX = (C71185WpX) this.A01;
                ImageView imageView4 = c71185WpX.A00;
                if (imageView4 != null && c71185WpX.A01 != null) {
                    int i5 = c71h.A00;
                    if (i5 > 0) {
                        Integer valueOf = Integer.valueOf(i5);
                        imageView4.setActivated(AbstractC167007dF.A1W(valueOf));
                        if (valueOf != null) {
                            imageView4.setImageLevel(i5);
                        }
                    }
                    i2 = -484105710;
                } else {
                    i2 = 451016933;
                }
                C0f9.A0A(i2, A0N6);
                i = -418099800;
                C0f9.A0A(i, A03);
                return;
            case 27:
                A03 = C0f9.A03(-1219613532);
                int A0325 = C0f9.A03(-748198391);
                V0T v0t = (V0T) this.A01;
                V0T.A0F(v0t, false);
                C146106i8 c146106i82 = new C146106i8();
                Resources A0N7 = AbstractC166997dE.A0N(v0t);
                int i6 = 2131971398;
                if (v0t.A0P) {
                    i6 = 2131974156;
                }
                c146106i82.A0D = A0N7.getString(i6);
                c146106i82.A01();
                Resources A0N8 = AbstractC166997dE.A0N(v0t);
                int i7 = 2131971399;
                if (v0t.A0P) {
                    i7 = 2131974157;
                }
                c146106i82.A0G = AbstractC166997dE.A0q(A0N8, i7);
                c146106i82.A0A(new Object());
                c146106i82.A06();
                AbstractC31178DnM.A1S(c146106i82);
                EnumC206089Ap enumC206089Ap = v0t.A0M;
                v0t.A0M = null;
                if (enumC206089Ap != null) {
                    V0T.A08(enumC206089Ap, v0t, false);
                }
                C0f9.A0A(1754373614, A0325);
                i = -418246998;
                C0f9.A0A(i, A03);
                return;
            case 28:
                A032 = C0f9.A03(1223796011);
                int A0326 = C0f9.A03(637868712);
                V0T v0t2 = (V0T) this.A01;
                View view2 = v0t2.A03;
                if (view2 == null) {
                    str = "quietModeTurnOnAutomaticallyRow";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (view2.getAlpha() == 1.0f) {
                    IgdsSwitch igdsSwitch = v0t2.A0L;
                    if (igdsSwitch != null) {
                        igdsSwitch.setChecked(true);
                    }
                    str = "quietModeToggle";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C0f9.A0A(-377239844, A0326);
                i3 = 784468819;
                C0f9.A0A(i3, A032);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A03 = C0f9.A03(-1180466520);
                int A0327 = C0f9.A03(-160092966);
                V0T v0t3 = (V0T) this.A01;
                IgdsSwitch igdsSwitch2 = v0t3.A0L;
                if (igdsSwitch2 != null) {
                    igdsSwitch2.setChecked(true);
                    V0T.A0C(v0t3, 0.5f);
                    V0T.A0B(v0t3, 0.5f);
                    V0T.A0A(v0t3);
                    AbstractC206099Aq.A06(v0t3.getSession());
                    AbstractC25651Mw.A00(v0t3.getSession()).E4s(new C2AT(false));
                    long A06 = AbstractC31177DnL.A06();
                    long A0328 = AbstractC206099Aq.A03(v0t3.getSession(), A06);
                    Date A04 = AbstractC206099Aq.A04(v0t3.getSession(), A06);
                    C146106i8 c146106i83 = new C146106i8();
                    Resources A0N9 = AbstractC166997dE.A0N(v0t3);
                    int i8 = 2131971402;
                    if (v0t3.A0P) {
                        i8 = 2131974160;
                    }
                    c146106i83.A0D = AbstractC166997dE.A0r(A0N9, AbstractC35218FgB.A03(v0t3.requireContext(), A0328).format(A04), i8);
                    c146106i83.A01();
                    Resources A0N10 = AbstractC166997dE.A0N(v0t3);
                    int i9 = 2131971399;
                    if (v0t3.A0P) {
                        i9 = 2131974157;
                    }
                    c146106i83.A0G = AbstractC166997dE.A0q(A0N10, i9);
                    c146106i83.A0A(new Object());
                    c146106i83.A06();
                    AbstractC31178DnM.A1S(c146106i83);
                    C0f9.A0A(986814589, A0327);
                    i = -1732149957;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "quietModeToggle";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                A032 = C0f9.A03(-1952634798);
                int A0329 = C0f9.A03(-1772011669);
                V0T v0t4 = (V0T) this.A01;
                C9GR.A0B(v0t4.getActivity(), "something_went_wrong");
                IgdsSwitch igdsSwitch3 = v0t4.A0L;
                if (igdsSwitch3 != null) {
                    igdsSwitch3.setChecked(true);
                    C0f9.A0A(789491046, A0329);
                    i3 = 1607735266;
                    C0f9.A0A(i3, A032);
                    return;
                }
                str = "quietModeToggle";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
