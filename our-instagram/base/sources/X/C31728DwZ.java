package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController;
import com.instagram.profile.edit.fragment.CompleteYourProfileFragment;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DwZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31728DwZ implements InterfaceC42271xH, InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public C31728DwZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C31728DwZ A00(Object obj, int i) {
        return new C31728DwZ(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0153  */
    @Override // X.InterfaceC42271xH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean A79(java.lang.Object r4) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31728DwZ.A79(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        String str;
        C64842wi c64842wi;
        ENJ enj;
        int i2;
        int i3;
        String str2;
        C0SG c0sg;
        Boolean bool;
        int i4;
        Object[] objArr;
        C0SG c0sg2;
        switch (this.A00) {
            case 0:
                C0f9.A03(-861977203);
                C0f9.A03(-1826809818);
                throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            case 1:
                A03 = C0f9.A03(415509412);
                C2Io c2Io = (C2Io) obj;
                int A0N = AbstractC167017dG.A0N(c2Io, 787335052);
                Integer num = c2Io.A01;
                if (num != C05F.A0F && num != C05F.A00) {
                    C32314ELd.A07((C32314ELd) this.A01);
                }
                C0f9.A0A(299491133, A0N);
                i = -1505789281;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(1449624720);
                int A032 = C0f9.A03(706152996);
                C32314ELd.A07((C32314ELd) this.A01);
                C0f9.A0A(-483356125, A032);
                i = 375520245;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(1194979025);
                int A033 = C0f9.A03(-787523832);
                InterfaceC37169GZg interfaceC37169GZg = ((C32327ELv) this.A01).A02;
                if (interfaceC37169GZg != null) {
                    InterfaceC37279GbW.A00(interfaceC37169GZg);
                    C0f9.A0A(41742081, A033);
                    i = 1954457354;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "clientInfra";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                A03 = C0f9.A03(-1255619115);
                int A034 = C0f9.A03(297384381);
                ENA.A01((ENA) this.A01);
                C0f9.A0A(1290009539, A034);
                i = 470215377;
                C0f9.A0A(i, A03);
                return;
            case 5:
                A03 = C0f9.A03(1967842435);
                int A035 = C0f9.A03(-1927305076);
                ENA.A01((ENA) this.A01);
                C0f9.A0A(639146249, A035);
                i = -451197403;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(-1759347428);
                int A036 = C0f9.A03(2140372443);
                InterfaceC37169GZg interfaceC37169GZg2 = ((ELx) this.A01).A02;
                if (interfaceC37169GZg2 == null) {
                    C14360o3.A0F("clientInfra");
                    throw C00O.createAndThrow();
                }
                InterfaceC37279GbW.A00(interfaceC37169GZg2);
                C0f9.A0A(1807405613, A036);
                i = 39597278;
                C0f9.A0A(i, A03);
                return;
            case 7:
                A03 = C0f9.A03(1185189920);
                int A037 = C0f9.A03(-1311687002);
                ELP elp = (ELP) this.A01;
                E70 e70 = elp.A03;
                if (e70 != null) {
                    int i5 = e70.A09;
                    if (C4GR.A01(i5) || i5 == 29) {
                        InterfaceC37169GZg interfaceC37169GZg3 = elp.A01;
                        if (interfaceC37169GZg3 != null) {
                            InterfaceC37279GbW.A00(interfaceC37169GZg3);
                        }
                        str = "clientInfra";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                C0f9.A0A(1608530190, A037);
                i = -1288050571;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A03 = C0f9.A03(-1617968489);
                C121285eR c121285eR = (C121285eR) obj;
                int A0N2 = AbstractC167017dG.A0N(c121285eR, -1798267335);
                C31539DtP c31539DtP = (C31539DtP) this.A01;
                c31539DtP.A03.ChP();
                if (c121285eR.A00.isRestricted() && (c64842wi = c31539DtP.A04) != null) {
                    java.util.Set singleton = Collections.singleton(Trigger.A13);
                    C14360o3.A07(singleton);
                    c64842wi.AVr(singleton);
                }
                C0f9.A0A(1217084518, A0N2);
                i = -228586767;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A03 = C0f9.A03(801406501);
                C151746sK c151746sK = (C151746sK) obj;
                int A0N3 = AbstractC167017dG.A0N(c151746sK, -1139381319);
                C47P c47p = c151746sK.A00;
                EQK eqk = ((C32354ENb) this.A01).A00;
                if (eqk == null) {
                    str = "accountDiscoveryAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                eqk.A01(c47p);
                C0f9.A0A(1721475458, A0N3);
                i = 1362861656;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = C0f9.A03(-1111901678);
                int A038 = C0f9.A03(1320688677);
                C31440Drk c31440Drk = (C31440Drk) this.A01;
                List list = c31440Drk.A04.A00;
                int size = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        if (list.get(i6) instanceof C34437FGb) {
                            if (i6 >= 0) {
                                C31440Drk.A00(c31440Drk, i6);
                            }
                        } else {
                            i6++;
                        }
                    }
                }
                C0f9.A0A(652450175, A038);
                i = -1619272316;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A03 = C0f9.A03(-2038480668);
                int A039 = C0f9.A03(-1692247779);
                User user = ((C70073Cr) obj).A00;
                if (user.B7L() != FollowStatus.A05 && user.B7L() != FollowStatus.A07) {
                    enj = (ENJ) this.A01;
                    enj.A0H.remove(user);
                } else {
                    enj = (ENJ) this.A01;
                    enj.A0H.add(user);
                }
                String id = user.getId();
                if (enj.A04 != null) {
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put(AbstractC111324zv.A00(2393), id);
                    enj.A04.Cm3(new Y7A("invite_followers_via_suma_followings", enj.A07, "follow_user", null, null, null, A1G, null));
                }
                C0f9.A0A(1412558333, A039);
                i = -1579686085;
                C0f9.A0A(i, A03);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(1293686008);
                C36115Fwp c36115Fwp = (C36115Fwp) obj;
                int A0N4 = AbstractC167017dG.A0N(c36115Fwp, -1633899202);
                ArrayList A1E = AbstractC166987dD.A1E();
                List list2 = c36115Fwp.A01;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        A1E.add(((InterfaceC81873l7) it.next()).F3a());
                    }
                }
                C34649FOh c34649FOh = ((EditProfileFieldsController) this.A01).A02;
                if (c34649FOh != null) {
                    c34649FOh.A0Q = A1E;
                    boolean z = false;
                    if (list2 != null && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((InterfaceC81873l7) it2.next()).BNW() == IgUserBioLinkTypeEnum.A05) {
                                    z = true;
                                }
                            }
                        }
                    }
                    c34649FOh.A0b = z;
                }
                C0f9.A0A(-1591330718, A0N4);
                i = -1408905080;
                C0f9.A0A(i, A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(1284931339);
                C36099FwZ c36099FwZ = (C36099FwZ) obj;
                int A0N5 = AbstractC167017dG.A0N(c36099FwZ, -672310621);
                EditProfileFieldsController editProfileFieldsController = (EditProfileFieldsController) this.A01;
                C34649FOh c34649FOh2 = editProfileFieldsController.A02;
                if (c34649FOh2 != null) {
                    c34649FOh2.A04 = c36099FwZ.A00.F3L();
                }
                editProfileFieldsController.A09();
                InterfaceC37218GaT interfaceC37218GaT = editProfileFieldsController.A04;
                if (interfaceC37218GaT == null) {
                    str = "dataProvider";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                interfaceC37218GaT.Bhd().DGv();
                C0f9.A0A(369957495, A0N5);
                i = 1538496927;
                C0f9.A0A(i, A03);
                return;
            case 14:
                A03 = C0f9.A03(-1992823970);
                int A0310 = C0f9.A03(1934453873);
                EditProfileFieldsController editProfileFieldsController2 = (EditProfileFieldsController) this.A01;
                if (editProfileFieldsController2.view == null) {
                    i2 = -932355181;
                } else if (editProfileFieldsController2.A02 == null) {
                    i2 = 1945251981;
                } else {
                    UserSession userSession = editProfileFieldsController2.A0C;
                    if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36318110311520144L) && editProfileFieldsController2.A02 != null) {
                        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    }
                    throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }
                C0f9.A0A(i2, A0310);
                i = 640908393;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(1566678134);
                C36109Fwj c36109Fwj = (C36109Fwj) obj;
                int A0311 = C0f9.A03(-2037847835);
                C14360o3.A0B(c36109Fwj, 0);
                EditProfileFieldsController editProfileFieldsController3 = (EditProfileFieldsController) this.A01;
                User user2 = editProfileFieldsController3.A06;
                if (user2 == null) {
                    i3 = 825166165;
                } else {
                    user2.A03.EZC(Boolean.valueOf(c36109Fwj.A02));
                    user2.A03.EZB(Integer.valueOf(c36109Fwj.A00));
                    AnonymousClass189.A00(editProfileFieldsController3.A0C).A01(user2, true, false);
                    EditProfileFieldsController.A05(editProfileFieldsController3);
                    i3 = -1766053324;
                }
                C0f9.A0A(i3, A0311);
                i = -112215184;
                C0f9.A0A(i, A03);
                return;
            case 16:
                A03 = C0f9.A03(-1488570770);
                int A0312 = C0f9.A03(-1384702842);
                EditProfileExpressionController editProfileExpressionController = ((EditProfileFieldsController) this.A01).A05;
                if (editProfileExpressionController != null && editProfileExpressionController.usernameField != null) {
                    throw AbstractC166987dD.A15(AbstractC31188DnX.A01());
                }
                C0f9.A0A(1310963900, A0312);
                i = -234116245;
                C0f9.A0A(i, A03);
                return;
            case 17:
                A03 = C0f9.A03(486531972);
                int A0313 = C0f9.A03(-11622917);
                CompleteYourProfileFragment completeYourProfileFragment = (CompleteYourProfileFragment) this.A01;
                completeYourProfileFragment.A05 = ((C2AS) obj).A00;
                completeYourProfileFragment.A07 = true;
                CompleteYourProfileFragment.A02(completeYourProfileFragment);
                C34649FOh c34649FOh3 = completeYourProfileFragment.A03;
                if (c34649FOh3 != null) {
                    c34649FOh3.A05 = completeYourProfileFragment.A05.Bhu();
                }
                CompleteYourProfileFragment.A01(completeYourProfileFragment);
                C0f9.A0A(32719138, A0313);
                i = -508529438;
                C0f9.A0A(i, A03);
                return;
            case 18:
                A03 = C0f9.A03(1079498815);
                C3HS c3hs = (C3HS) obj;
                int A0314 = C0f9.A03(-666463104);
                boolean z2 = c3hs.A04;
                C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
                if (z2) {
                    C31721DwQ.A0C(c31721DwQ);
                } else {
                    C34649FOh c34649FOh4 = c31721DwQ.A0f;
                    c34649FOh4.getClass();
                    c34649FOh4.A0M = c3hs.A02;
                    C34649FOh c34649FOh5 = c31721DwQ.A0f;
                    c34649FOh5.A0B = c3hs.A00;
                    c34649FOh5.A0H = c3hs.A01;
                    c34649FOh5.A0Z = false;
                    TextView textView = c31721DwQ.A0M;
                    if (textView != null) {
                        textView.setText(c34649FOh5.A0M);
                    }
                }
                C0f9.A0A(-859832929, A0314);
                i = 518100952;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGSTOP /* 19 */:
                A03 = C0f9.A03(1419016642);
                int A0315 = C0f9.A03(558819736);
                C31721DwQ c31721DwQ2 = (C31721DwQ) this.A01;
                C34649FOh c34649FOh6 = c31721DwQ2.A0f;
                c34649FOh6.getClass();
                c34649FOh6.A07 = AbstractC166997dE.A0a();
                c31721DwQ2.A0f.A0D = ((C36100Fwa) obj).A00;
                C31721DwQ.A07(c31721DwQ2);
                C0f9.A0A(1146613863, A0315);
                i = -1136781356;
                C0f9.A0A(i, A03);
                return;
            case 20:
                A03 = C0f9.A03(-2138235224);
                int A0316 = C0f9.A03(1365546515);
                C31721DwQ c31721DwQ3 = (C31721DwQ) this.A01;
                C34649FOh c34649FOh7 = c31721DwQ3.A0f;
                c34649FOh7.getClass();
                c34649FOh7.A0M = ((C36102Fwc) obj).A00;
                C31721DwQ.A08(c31721DwQ3);
                C0f9.A0A(-347793913, A0316);
                i = -454012919;
                C0f9.A0A(i, A03);
                return;
            case 21:
                A03 = C0f9.A03(922730834);
                C36108Fwi c36108Fwi = (C36108Fwi) obj;
                int A0317 = C0f9.A03(89710272);
                C31721DwQ c31721DwQ4 = (C31721DwQ) this.A01;
                C34649FOh c34649FOh8 = c31721DwQ4.A0f;
                c34649FOh8.getClass();
                c34649FOh8.A00 = c36108Fwi.A00;
                C34649FOh c34649FOh9 = c31721DwQ4.A0f;
                if (c31721DwQ4.A19) {
                    str2 = c36108Fwi.A01;
                } else {
                    str2 = null;
                }
                c34649FOh9.A0C = str2;
                C31721DwQ.A09(c31721DwQ4);
                C0f9.A0A(-1936972681, A0317);
                i = 193806048;
                C0f9.A0A(i, A03);
                return;
            case 22:
                A03 = C0f9.A03(-1846635644);
                int A0318 = C0f9.A03(-472664942);
                C31721DwQ.A0C((C31721DwQ) this.A01);
                C0f9.A0A(1583789694, A0318);
                i = -2009562691;
                C0f9.A0A(i, A03);
                return;
            case 23:
                A03 = C0f9.A03(1935802877);
                int A0319 = C0f9.A03(-803247401);
                C31721DwQ.A0C((C31721DwQ) this.A01);
                C0f9.A0A(-1301101088, A0319);
                i = 1411078134;
                C0f9.A0A(i, A03);
                return;
            case 24:
                A03 = C0f9.A03(17799383);
                int A0320 = C0f9.A03(85168854);
                C31721DwQ c31721DwQ5 = (C31721DwQ) this.A01;
                c31721DwQ5.A17 = true;
                AbstractC35083Fcu.A01(c31721DwQ5.getActivity(), c31721DwQ5.A0V, ((C36101Fwb) obj).A00);
                C0f9.A0A(-1845192590, A0320);
                i = 1032410637;
                C0f9.A0A(i, A03);
                return;
            case 25:
                A03 = C0f9.A03(1651900573);
                int A0321 = C0f9.A03(-1617902319);
                ((C31721DwQ) this.A01).A0s = ((C2AS) obj).A00;
                C0f9.A0A(910330877, A0321);
                i = 1711752806;
                C0f9.A0A(i, A03);
                return;
            case 26:
                A03 = C0f9.A03(380600363);
                int A0322 = C0f9.A03(-127312051);
                C31721DwQ c31721DwQ6 = (C31721DwQ) this.A01;
                User user3 = c31721DwQ6.A0s;
                String str3 = ((C36104Fwe) obj).A00;
                user3.A03.EP9(str3);
                TextView textView2 = c31721DwQ6.A0E;
                if (textView2 != null) {
                    textView2.setText(str3);
                }
                C0f9.A0A(328889169, A0322);
                i = -1775593538;
                C0f9.A0A(i, A03);
                return;
            case 27:
                A03 = C0f9.A03(-17033919);
                int A0323 = C0f9.A03(-880560752);
                C33226ElG c33226ElG = (C33226ElG) this.A01;
                C33226ElG.A01(AbstractC166987dD.A0r(c33226ElG.A0E), c33226ElG);
                C0f9.A0A(1883357815, A0323);
                i = 375448240;
                C0f9.A0A(i, A03);
                return;
            case 28:
                C0f9.A03(-716688607);
                C0f9.A03(-1053918457);
                if (((C31535DtK) this.A01).A0E == null) {
                    C14360o3.A0F("followListAdapter");
                    throw C00O.createAndThrow();
                }
                throw AbstractC166987dD.A15("getUser");
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A03 = C0f9.A03(-18430266);
                C36093FwT c36093FwT = (C36093FwT) obj;
                int A0N6 = AbstractC167017dG.A0N(c36093FwT, -11516150);
                C31542DtS c31542DtS = ((C31535DtK) this.A01).A0E;
                if (c31542DtS == null) {
                    str = "followListAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c31542DtS.A0D(c36093FwT.A00);
                C0f9.A0A(-404452461, A0N6);
                i = 1200177748;
                C0f9.A0A(i, A03);
                return;
            case 30:
                A03 = C0f9.A03(636148184);
                C36112Fwm c36112Fwm = (C36112Fwm) obj;
                int A0324 = C0f9.A03(957107720);
                C36300Fzv c36300Fzv = (C36300Fzv) this.A01;
                InterfaceC37268GbL interfaceC37268GbL = c36300Fzv.A03;
                if (interfaceC37268GbL != null) {
                    String str4 = c36112Fwm.A00;
                    switch (str4.hashCode()) {
                        case -1867169789:
                            if (str4.equals("success")) {
                                if (interfaceC37268GbL.CcF(true) && (c0sg2 = (C0SG) interfaceC37268GbL.B8S().A0Q("BLOCK_MUTATION_PROGRESS_DIALOG_FRAGMENT")) != null) {
                                    c0sg2.A08();
                                }
                                Integer num2 = c36300Fzv.A06;
                                if (num2 != null && num2.intValue() != 1 && (bool = c36300Fzv.A05) != null && c36300Fzv.A00 != null && c36300Fzv.A08 != null && c36300Fzv.A02 == null) {
                                    if (c36300Fzv.A01 != null) {
                                        Context context = c36300Fzv.A03.getContext();
                                        AbstractC12990ll abstractC12990ll = c36300Fzv.A09;
                                        int intValue = c36300Fzv.A06.intValue();
                                        boolean z3 = !c36300Fzv.A05.booleanValue();
                                        C17C c17c = c36300Fzv.A00;
                                        InterfaceC37187GZy interfaceC37187GZy = c36300Fzv.A01;
                                        C14360o3.A0B(c17c, 1);
                                        String fullName = c17c.getFullName();
                                        String username = c17c.getUsername();
                                        if (z3) {
                                            i4 = 2131952147;
                                            objArr = new Object[]{fullName};
                                        } else {
                                            i4 = 2131952146;
                                            objArr = new Object[]{fullName, username};
                                        }
                                        String string = context.getString(i4, objArr);
                                        C14360o3.A07(string);
                                        int i7 = 2131952144;
                                        if (intValue == 2) {
                                            i7 = 2131952145;
                                        }
                                        String A0u = AbstractC25227BEk.A0u(context, i7);
                                        IgdsHeadline igdsHeadline = new IgdsHeadline(context);
                                        igdsHeadline.setHeadline(string);
                                        igdsHeadline.setBody(A0u);
                                        FrameLayout frameLayout = new FrameLayout(context);
                                        frameLayout.addView(igdsHeadline);
                                        C14360o3.A0B(abstractC12990ll, 1);
                                        C50674MYs c50674MYs = new C50674MYs(context, abstractC12990ll);
                                        c50674MYs.A01 = frameLayout;
                                        c50674MYs.A03(ViewOnClickListenerC35682FpH.A00(interfaceC37187GZy, 43), 2131972368);
                                        c50674MYs.A01(ViewOnClickListenerC35682FpH.A00(interfaceC37187GZy, 44), 2131957640);
                                        c50674MYs.A03 = new C42685Iug(interfaceC37187GZy, 3);
                                        C31727DwY.A01(context, c50674MYs);
                                    } else if (bool.booleanValue()) {
                                        AbstractC35098Fd9.A02(c36300Fzv.A03.getContext(), null, c36300Fzv.A08, c36300Fzv.A06.intValue());
                                    }
                                }
                                InterfaceC37219GaU interfaceC37219GaU = c36300Fzv.A02;
                                if (interfaceC37219GaU != null) {
                                    interfaceC37219GaU.onSuccess();
                                }
                                c36300Fzv.cleanUp();
                                break;
                            }
                            break;
                        case -753541113:
                            if (str4.equals("in_progress")) {
                                boolean z4 = c36112Fwm.A02;
                                if (interfaceC37268GbL.CcF(false) && interfaceC37268GbL.B8S().A0Q("BLOCK_MUTATION_PROGRESS_DIALOG_FRAGMENT") == null) {
                                    Context context2 = interfaceC37268GbL.getContext();
                                    int i8 = 2131976059;
                                    if (z4) {
                                        i8 = 2131953937;
                                    }
                                    String A0p = AbstractC166997dE.A0p(context2, i8);
                                    C67858Uzp c67858Uzp = new C67858Uzp();
                                    Bundle A0b = AbstractC166987dD.A0b();
                                    A0b.putString("extra_progress_message", A0p);
                                    A0b.putBoolean(AbstractC111324zv.A00(2341), true);
                                    c67858Uzp.setArguments(A0b);
                                    c67858Uzp.A0B(interfaceC37268GbL.B8S(), "BLOCK_MUTATION_PROGRESS_DIALOG_FRAGMENT");
                                }
                                InterfaceC37219GaU interfaceC37219GaU2 = c36300Fzv.A02;
                                if (interfaceC37219GaU2 != null) {
                                    interfaceC37219GaU2.D6t();
                                    break;
                                }
                            }
                            break;
                        case 3135262:
                            if (str4.equals(RealtimeConstants.SEND_FAIL)) {
                                if (interfaceC37268GbL.CcF(true) && (c0sg = (C0SG) interfaceC37268GbL.B8S().A0Q("BLOCK_MUTATION_PROGRESS_DIALOG_FRAGMENT")) != null) {
                                    c0sg.A08();
                                }
                                InterfaceC37219GaU interfaceC37219GaU3 = c36300Fzv.A02;
                                if (interfaceC37219GaU3 != null) {
                                    interfaceC37219GaU3.DFf();
                                }
                                c36300Fzv.cleanUp();
                                break;
                            }
                            break;
                    }
                }
                C0f9.A0A(-986554809, A0324);
                i = -1962259887;
                C0f9.A0A(i, A03);
                return;
            case 31:
                A03 = C0f9.A03(-1049740176);
                int A0325 = C0f9.A03(-1177798027);
                EMN.A00((EMN) this.A01);
                C0f9.A0A(626465565, A0325);
                i = -2023389154;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(1245331796);
                C70073Cr c70073Cr = (C70073Cr) obj;
                int A0326 = C0f9.A03(1508590102);
                EMO emo = (EMO) this.A01;
                EMO.A01(emo);
                if (emo.A0C && c70073Cr.A03) {
                    UserSession userSession2 = emo.A01;
                    User user4 = emo.A04;
                    user4.getClass();
                    String str5 = emo.A08;
                    C14360o3.A0B(userSession2, 0);
                    AJw.A00(emo, userSession2, user4, str5, "share_business_bottom_sheet_follow");
                }
                C0f9.A0A(1329049157, A0326);
                i = 716929769;
                C0f9.A0A(i, A03);
                return;
        }
    }
}
