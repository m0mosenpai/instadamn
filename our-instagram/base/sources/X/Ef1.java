package X;

import android.app.Activity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class Ef1 extends C31253Dob {
    public final int A00 = 0;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef1(FragmentActivity fragmentActivity, UserSession userSession, ENH enh) {
        super(fragmentActivity, enh, userSession);
        this.A01 = enh;
        C14360o3.A0A(fragmentActivity);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void DAw(C47P c47p, String str, int i) {
        C47K c47k;
        List list;
        List list2;
        String str2;
        List list3;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c47p, 0);
                C54781OIv c54781OIv = (C54781OIv) ((N86) ((C26872BtZ) this.A01).A0H.getValue()).A04.A04.getValue();
                String A0p = AbstractC31173DnH.A0p(c47p);
                N82 n82 = c54781OIv.A01;
                AbstractC166987dD.A1Z(new MCF(n82, A0p, null, 34), n82.A03());
                return;
            case 1:
                super.DAw(c47p, str, i);
                C32415EPq c32415EPq = ((ENP) this.A01).A02;
                C14360o3.A0B(c47p, 0);
                C47K c47k2 = c32415EPq.A01;
                if (c47k2 != null) {
                    if (!c47k2.A08()) {
                        C47K c47k3 = c32415EPq.A01;
                        if (c47k3 != null) {
                            c47k3.A06(c47p.getId());
                        }
                    } else {
                        C47K c47k4 = c32415EPq.A01;
                        if (c47k4 != null && !c47k4.A07() && (c47k = c32415EPq.A01) != null && (list = c47k.A0M) != null) {
                            list.remove(i);
                        }
                    }
                    C32415EPq.A01(c32415EPq);
                    return;
                }
                return;
            case 2:
                C14360o3.A0B(c47p, 0);
                super.DAw(c47p, str, i);
                C32413EPo c32413EPo = ((ENQ) this.A01).A02;
                if (c32413EPo == null) {
                    str2 = "adapter";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                C47K c47k5 = c32413EPo.A00;
                if (c47k5 != null) {
                    if (!c47k5.A08()) {
                        c47k5.A06(c47p.getId());
                    } else if (!c47k5.A07() && (list2 = c47k5.A0M) != null) {
                        list2.remove(i);
                    }
                    C32413EPo.A00(c32413EPo);
                    return;
                }
                return;
            case 3:
                C14360o3.A0B(c47p, 0);
                String A0p2 = AbstractC31173DnH.A0p(c47p);
                ENH enh = (ENH) this.A01;
                String str3 = enh.A04;
                str2 = "targetId";
                if (str3 != null) {
                    if (str3.length() != 0 && A0p2.length() != 0) {
                        UserSession A0r = AbstractC166987dD.A0r(enh.A0C);
                        String str4 = enh.A04;
                        if (str4 != null) {
                            C1GJ.A03(FY5.A00(A0r, str4, A0p2));
                        }
                    }
                    C32414EPp A0b = enh.A0b();
                    A0b.A04.A00.remove(c47p);
                    C32414EPp.A00(A0b);
                    C123835ix c123835ix = enh.A01;
                    if (c123835ix == null) {
                        str2 = "followChainingLogger";
                    } else {
                        String A0p3 = AbstractC31173DnH.A0p(c47p);
                        String str5 = enh.A04;
                        if (str5 != null) {
                            Integer num = enh.A03;
                            if (num == null) {
                                str2 = "chainingSource";
                            } else {
                                String A00 = FCN.A00(num);
                                String A01 = ENH.A01(c47p, enh);
                                if (A01 == null) {
                                    A01 = "";
                                }
                                c123835ix.A01(A0p3, str5, A00, A01, c47p.ByJ(), i);
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 4:
                C14360o3.A0B(c47p, 0);
                super.DAw(c47p, str, i);
                C31542DtS c31542DtS = ((C31535DtK) this.A01).A0E;
                if (c31542DtS == null) {
                    str2 = "followListAdapter";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                User CDj = c47p.CDj();
                C14360o3.A0B(CDj, 0);
                C47K c47k6 = c31542DtS.A03;
                if (c47k6 != null) {
                    if (!c47k6.A08()) {
                        c47k6.A06(CDj.getId());
                    } else if (!c47k6.A07() && (list3 = c47k6.A0M) != null) {
                        list3.remove(i);
                    }
                    c31542DtS.A0y.remove(CDj.getId());
                    c31542DtS.A0G(false, false);
                    return;
                }
                throw AbstractC166997dE.A0g();
            default:
                C14360o3.A0B(c47p, 0);
                super.DAw(c47p, str, i);
                C32411EPm c32411EPm = ((ENY) this.A01).A03;
                if (c32411EPm == null) {
                    str2 = "socialContextFollowListAdapter";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                c32411EPm.A06.remove(c47p);
                c32411EPm.A08.remove(c47p.getId());
                c32411EPm.A0C();
                return;
        }
    }

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void DHq(C47P c47p, String str, int i) {
        String str2;
        if (3 - this.A00 != 0) {
            super.DHq(c47p, str, i);
            return;
        }
        C14360o3.A0B(c47p, 0);
        ENH enh = (ENH) this.A01;
        C123835ix c123835ix = enh.A01;
        if (c123835ix == null) {
            str2 = "followChainingLogger";
        } else {
            String A0p = AbstractC31173DnH.A0p(c47p);
            String str3 = enh.A04;
            if (str3 == null) {
                str2 = "targetId";
            } else {
                Integer num = enh.A03;
                if (num == null) {
                    str2 = "chainingSource";
                } else {
                    String A00 = FCN.A00(num);
                    String A01 = ENH.A01(c47p, enh);
                    if (A01 == null) {
                        A01 = "";
                    }
                    c123835ix.A02(A0p, str3, A00, A01, c47p.ByJ(), i);
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void Dhu(C47P c47p, String str, int i) {
        String str2;
        if (3 - this.A00 != 0) {
            super.Dhu(c47p, str, i);
            return;
        }
        C14360o3.A0B(c47p, 0);
        ENH enh = (ENH) this.A01;
        if (!enh.A0B.add(AbstractC31173DnH.A0p(c47p))) {
            return;
        }
        C123835ix c123835ix = enh.A01;
        if (c123835ix == null) {
            str2 = "followChainingLogger";
        } else {
            String A0p = AbstractC31173DnH.A0p(c47p);
            String str3 = enh.A04;
            if (str3 == null) {
                str2 = "targetId";
            } else {
                Integer num = enh.A03;
                if (num == null) {
                    str2 = "chainingSource";
                } else {
                    String A00 = FCN.A00(num);
                    String A01 = ENH.A01(c47p, enh);
                    if (A01 == null) {
                        A01 = "";
                    }
                    c123835ix.A04(A0p, str3, A00, A01, c47p.ByJ(), i, 0L);
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void Dxe(C47P c47p, String str, int i) {
        String str2;
        UserSession A0r;
        UserDetailLaunchConfig A03;
        Activity requireActivity;
        int i2;
        String A00;
        switch (this.A00) {
            case 3:
                C14360o3.A0B(c47p, 0);
                ENH enh = (ENH) this.A01;
                FragmentActivity requireActivity2 = enh.requireActivity();
                InterfaceC09390do interfaceC09390do = enh.A0C;
                C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity2, interfaceC09390do);
                A0c.A0F = true;
                C31368DqX.A02(A0c, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31173DnH.A0p(c47p), "similar_accounts_user_button", "see_all_suggested_user_fragment"));
                C123835ix c123835ix = enh.A01;
                if (c123835ix == null) {
                    str2 = "followChainingLogger";
                } else {
                    String A0p = AbstractC31173DnH.A0p(c47p);
                    String str3 = enh.A04;
                    if (str3 == null) {
                        str2 = "targetId";
                    } else {
                        Integer num = enh.A03;
                        if (num == null) {
                            str2 = "chainingSource";
                        } else {
                            String A002 = FCN.A00(num);
                            String A01 = ENH.A01(c47p, enh);
                            if (A01 == null) {
                                A01 = "";
                            }
                            c123835ix.A03(A0p, str3, A002, A01, c47p.ByJ(), i);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 4:
                C14360o3.A0B(c47p, 0);
                C31535DtK c31535DtK = (C31535DtK) this.A01;
                if (c31535DtK.A0Y) {
                    A01(c47p, str, i);
                    Integer num2 = c31535DtK.A0K;
                    if (num2 == null) {
                        str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    int intValue = num2.intValue();
                    if (intValue != 1) {
                        if (intValue != 0) {
                            A00 = "follow_list_user_row";
                            A0r = C31535DtK.A03(c31535DtK);
                            A03 = AbstractC31402Dr6.A03(C31535DtK.A03(c31535DtK), AbstractC31173DnH.A0p(c47p), A00, c31535DtK.getModuleName());
                            requireActivity = c31535DtK.getRootActivity();
                            FYC.A00(requireActivity, A0r, A03);
                            return;
                        }
                        i2 = 2397;
                    } else {
                        i2 = 2394;
                    }
                    A00 = AbstractC111324zv.A00(i2);
                    A0r = C31535DtK.A03(c31535DtK);
                    A03 = AbstractC31402Dr6.A03(C31535DtK.A03(c31535DtK), AbstractC31173DnH.A0p(c47p), A00, c31535DtK.getModuleName());
                    requireActivity = c31535DtK.getRootActivity();
                    FYC.A00(requireActivity, A0r, A03);
                    return;
                }
                super.Dxe(c47p, str, i);
                return;
            case 5:
                C14360o3.A0B(c47p, 0);
                ENY eny = (ENY) this.A01;
                if (eny.A05) {
                    A01(c47p, str, i);
                    InterfaceC09390do interfaceC09390do2 = eny.A0C;
                    A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                    A03 = AbstractC31402Dr6.A03(AbstractC166987dD.A0r(interfaceC09390do2), AbstractC31173DnH.A0p(c47p), "social_context_follow_list", "profile_social_context");
                    requireActivity = eny.requireActivity();
                    FYC.A00(requireActivity, A0r, A03);
                    return;
                }
                super.Dxe(c47p, str, i);
                AbstractC25233BEq.A14(eny);
                return;
            default:
                super.Dxe(c47p, str, i);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef1(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C26872BtZ c26872BtZ) {
        super(fragmentActivity, interfaceC11380iw, userSession);
        this.A01 = c26872BtZ;
        C14360o3.A0A(fragmentActivity);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef1(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ENP enp) {
        super(fragmentActivity, interfaceC11380iw, userSession);
        this.A01 = enp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef1(FragmentActivity fragmentActivity, UserSession userSession, C31535DtK c31535DtK) {
        super(fragmentActivity, c31535DtK, userSession);
        this.A01 = c31535DtK;
        C14360o3.A0A(fragmentActivity);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef1(FragmentActivity fragmentActivity, UserSession userSession, ENY eny) {
        super(fragmentActivity, eny, userSession);
        this.A01 = eny;
        C14360o3.A0A(fragmentActivity);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef1(FragmentActivity fragmentActivity, UserSession userSession, ENQ enq) {
        super(fragmentActivity, enq, userSession);
        this.A01 = enq;
        C14360o3.A0A(fragmentActivity);
    }
}
