package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;
import java.util.regex.Pattern;

/* renamed from: X.EUt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32543EUt extends C1P1 {
    public final Handler A00 = new Handler();
    public final AbstractC59962oe A01;
    public final AbstractC12990ll A02;
    public final GY6 A03;
    public final RegFlowExtras A04;
    public final EVN A05;
    public final String A06;
    public final /* synthetic */ EKF A07;
    public final /* synthetic */ String A08;

    public C32543EUt(AbstractC59962oe abstractC59962oe, AbstractC12990ll abstractC12990ll, EKF ekf, GY6 gy6, RegFlowExtras regFlowExtras, EVN evn, String str, String str2) {
        this.A07 = ekf;
        this.A08 = str2;
        this.A02 = abstractC12990ll;
        this.A06 = str;
        this.A01 = abstractC59962oe;
        this.A05 = evn;
        this.A03 = gy6;
        this.A04 = regFlowExtras;
    }

    private void A00(String str) {
        C35037FcA A06 = C1Q9.A1D.A02(this.A02).A06(EnumC33445EqI.A03, EnumC31713DwI.A0d);
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        A06.A04("reason", str);
        A06.A02();
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A03 = C0f9.A03(-160887957);
        this.A03.Eks(AbstractC31173DnH.A0m(this.A01), C05F.A00);
        if (abstractC115105If instanceof C115115Ig) {
            str = ((InterfaceC40821up) ((C115115Ig) abstractC115105If).A00).getErrorType();
        } else {
            str = "network_error";
        }
        A00(str);
        C0f9.A0A(-1861243388, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1613360542);
        super.onFinish();
        this.A05.A00();
        C0f9.A0A(-842995130, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(679603632);
        super.onStart();
        this.A05.A01();
        C0f9.A0A(2093865782, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        final String str;
        String str2;
        GY6 gy6;
        Resources A0N;
        int i;
        int A03 = C0f9.A03(-268504843);
        final EDG edg = (EDG) obj;
        int A032 = C0f9.A03(1396813970);
        EKF ekf = this.A07;
        String A0J = AbstractC13880nE.A0J(ekf.A00);
        String str3 = edg.A01;
        if (str3 != null) {
            A0J = str3;
        }
        RegFlowExtras regFlowExtras = ekf.A0J;
        if (!regFlowExtras.A0t || !AbstractC50102Ry.A00(regFlowExtras.A0I, A0J)) {
            if (edg.A05) {
                DialogInterfaceOnClickListenerC35446Fk3 dialogInterfaceOnClickListenerC35446Fk3 = new DialogInterfaceOnClickListenerC35446Fk3(this.A08, ekf, 8);
                C193328hC A0c = AbstractC31176DnK.A0c(ekf);
                A0c.A0A(2131973816);
                A0c.A09(2131973813);
                AbstractC31175DnJ.A1O(A0c);
                A0c.A0J(dialogInterfaceOnClickListenerC35446Fk3, 2131973815);
                AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC35454FkB.A00(ekf, 26), A0c, 2131973814);
                AbstractC31173DnH.A1S(C35230FgN.A00(ekf, C1Q9.A1e), ekf.A05);
            } else if (!edg.A08 || !edg.A06) {
                int A033 = C0f9.A03(665935505);
                if (!edg.A08) {
                    gy6 = this.A03;
                    A0N = AbstractC166997dE.A0N(this.A01);
                    i = 2131961718;
                } else if (!edg.A06) {
                    if (edg.A03 == null) {
                        gy6 = this.A03;
                        A0N = AbstractC166997dE.A0N(this.A01);
                        i = 2131961717;
                    }
                    A00(edg.mErrorType);
                    C0f9.A0A(1018993330, A033);
                } else {
                    if (TextUtils.isEmpty(edg.A01)) {
                        str = this.A06;
                    } else {
                        str = edg.A01;
                    }
                    AbstractC12990ll abstractC12990ll = this.A02;
                    Context requireContext = this.A01.requireContext();
                    AbstractC167017dG.A1O(abstractC12990ll, str);
                    C35269Fh4.A05(abstractC12990ll, "email");
                    if (AbstractC23451Ch.A07(requireContext, "android.permission.GET_ACCOUNTS")) {
                        AccountManager accountManager = AccountManager.get(requireContext);
                        Account[] accounts = accountManager.getAccounts();
                        C14360o3.A07(accounts);
                        int length = accounts.length;
                        for (Account account : accounts) {
                            if (account != null && "com.google".equalsIgnoreCase(account.type) && str.equalsIgnoreCase(account.name)) {
                                C35269Fh4.A06(abstractC12990ll, "email", length);
                                C1GJ.A03(new KK4(6, account, accountManager, abstractC12990ll));
                                break;
                            }
                        }
                        str2 = "no_match_found";
                    } else {
                        str2 = "no_permission";
                    }
                    C35269Fh4.A07(abstractC12990ll, "email", str2);
                    this.A00.post(new Runnable() { // from class: X.GPg
                        @Override // java.lang.Runnable
                        public final void run() {
                            C140966Yy A0C;
                            Bundle A0b;
                            Fragment abstractC32319ELj;
                            C32543EUt c32543EUt = this;
                            String str4 = str;
                            EDG edg2 = edg;
                            RegFlowExtras regFlowExtras2 = new RegFlowExtras();
                            regFlowExtras2.A08 = str4;
                            regFlowExtras2.A0n = edg2.A07;
                            regFlowExtras2.A0X = edg2.A02;
                            regFlowExtras2.A0C = edg2.A00;
                            regFlowExtras2.A0g = edg2.A04;
                            RegFlowExtras regFlowExtras3 = c32543EUt.A04;
                            if (regFlowExtras3 != null) {
                                EnumC33445EqI enumC33445EqI = EnumC33445EqI.A07;
                                if (enumC33445EqI == regFlowExtras3.A01()) {
                                    regFlowExtras2.A0g = regFlowExtras3.A0g;
                                    regFlowExtras2.A0J = regFlowExtras3.A0J;
                                    regFlowExtras2.A0M = regFlowExtras3.A0M;
                                    regFlowExtras2.A0u = regFlowExtras3.A0u;
                                }
                                regFlowExtras2.A04 = regFlowExtras3.A04;
                                regFlowExtras2.A03 = regFlowExtras3.A03;
                                if (enumC33445EqI == regFlowExtras3.A01()) {
                                    regFlowExtras2.A0Z = regFlowExtras3.A0Z;
                                    regFlowExtras2.A0P = regFlowExtras3.A0P;
                                    regFlowExtras2.A03(enumC33445EqI);
                                    Integer A02 = regFlowExtras3.A02();
                                    if (A02 != null) {
                                        regFlowExtras2.A0V = AbstractC34293FAn.A00(A02);
                                    }
                                    regFlowExtras2.A0w = regFlowExtras3.A0w;
                                    regFlowExtras2.A06 = regFlowExtras3.A06;
                                    regFlowExtras2.A07 = regFlowExtras3.A07;
                                    AbstractC35090Fd1.A01(regFlowExtras3, regFlowExtras2);
                                    if (regFlowExtras3.A0t) {
                                        regFlowExtras2.A0u = false;
                                        A0C = AbstractC25225BEi.A0r(c32543EUt.A01.requireActivity(), c32543EUt.A02);
                                        A0b = AbstractC166987dD.A0b();
                                        A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
                                        abstractC32319ELj = new AbstractC59962oe();
                                    } else {
                                        if (regFlowExtras2.A0u) {
                                            regFlowExtras2.A0u = false;
                                            C07270a1 c07270a1 = (C07270a1) c32543EUt.A02;
                                            String str5 = regFlowExtras3.A0Z;
                                            Pattern pattern = AbstractC13670mt.A01;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            AbstractC59962oe abstractC59962oe = c32543EUt.A01;
                                            AbstractC35794FrW.A02(AbstractC167007dF.A0J(), abstractC59962oe, abstractC59962oe, c07270a1, null, c32543EUt.A03, regFlowExtras2, c32543EUt.A05, EnumC31713DwI.A1M, str5, null, false);
                                            return;
                                        }
                                        A0C = AbstractC25225BEi.A0r(c32543EUt.A01.requireActivity(), c32543EUt.A02);
                                        A0b = AbstractC166987dD.A0b();
                                        A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
                                        abstractC32319ELj = new AbstractC32319ELj();
                                    }
                                    AbstractC31175DnJ.A0u(A0b, abstractC32319ELj, A0C);
                                    A0C.A04();
                                }
                            }
                            AbstractC31172DnG.A1A();
                            Bundle A0b2 = AbstractC166987dD.A0b();
                            A0b2.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
                            AbstractC12990ll abstractC12990ll2 = c32543EUt.A02;
                            AbstractC31175DnJ.A0r(A0b2, abstractC12990ll2);
                            EKC ekc = new EKC();
                            ekc.setArguments(A0b2);
                            A0C = AbstractC31175DnJ.A0C(c32543EUt.A01, abstractC12990ll2);
                            A0C.A0E(ekc);
                            A0C.A04();
                        }
                    });
                    C0f9.A0A(1018993330, A033);
                }
                gy6.Eks(A0N.getString(i), C05F.A0N);
                A00(edg.mErrorType);
                C0f9.A0A(1018993330, A033);
            }
            C0f9.A0A(1834351006, A032);
            C0f9.A0A(555304901, A03);
        }
        EKF.A05(ekf, A0J);
        C0f9.A0A(1834351006, A032);
        C0f9.A0A(555304901, A03);
    }
}
