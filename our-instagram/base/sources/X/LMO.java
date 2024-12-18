package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public final class LMO implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public LMO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A06 = obj4;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A07 = str;
        this.A05 = obj5;
        this.A04 = obj6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (this.A00 != 0) {
            WEz wEz = (WEz) this.A06;
            User user = wEz.A01;
            if (user != null && (str = wEz.A04) != null) {
                if (wEz.A08 == null) {
                    final BigInteger bigInteger = null;
                    final Long A0j = AbstractC166997dE.A0j(str);
                    if (A0j != null) {
                        C41761wQ c41761wQ = new C41761wQ(null);
                        C47984LJj c47984LJj = (C47984LJj) this.A02;
                        final ImmutableList A0L = AbstractC31173DnH.A0L((Collection) this.A05);
                        final String str2 = this.A07;
                        String str3 = wEz.A06;
                        if (str3 != null) {
                            bigInteger = AnonymousClass010.A0o(str3);
                        }
                        final Long BTC = user.BTC();
                        if (BTC != null) {
                            c41761wQ.A02(C42221xC.A01(La8.A00, C137746Lw.A00(c47984LJj.A00, "MsysReportUtil").A01.A0C.A0L(new C6D2() { // from class: X.Lag
                                @Override // X.C6D2
                                public final Object apply(Object obj) {
                                    final String str4 = str2;
                                    final Long l = A0j;
                                    final BigInteger bigInteger2 = bigInteger;
                                    final Long l2 = BTC;
                                    final ImmutableList immutableList = A0L;
                                    final K3M k3m = (K3M) obj;
                                    C137766Ly c137766Ly = C137766Ly.A0L;
                                    return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcH
                                        @Override // X.InterfaceC1345866i
                                        public final void EpD(C1346766r c1346766r) {
                                            K3M k3m2 = K3M.this;
                                            String str5 = str4;
                                            Long l3 = l;
                                            BigInteger bigInteger3 = bigInteger2;
                                            Long l4 = l2;
                                            ImmutableList immutableList2 = immutableList;
                                            C137766Ly c137766Ly2 = C137766Ly.A0L;
                                            long longValue = l3.longValue();
                                            long longValue2 = l4.longValue();
                                            JRS A00 = JRS.A00(c1346766r, 56);
                                            InterfaceExecutorC135866Co ASj = k3m2.mMailboxApiHandleMetaProvider.ASj(0);
                                            MailboxFutureImpl A0I = AbstractC43593JPy.A0I(ASj, A00);
                                            AbstractC25231BEo.A1C(ASj, new C48192LUq(A0I, k3m2, bigInteger3, immutableList2, str5, longValue, longValue2), A0I);
                                        }
                                    }, AbstractC137146It.A00("send_report"));
                                }
                            }), C47984LJj.A00(c47984LJj, str2, BTC.longValue())), new C49717Lxm(6, this.A01, this.A03, this.A04, c47984LJj));
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                InterfaceC14020nS A00 = C14120nc.A00();
                C14360o3.A07(A00);
                A00.ATO(new KMY((C6FQ) this.A01, (InterfaceC103384lE) this.A04, (InterfaceC103384lE) this.A03, user, wEz, (C47984LJj) this.A02, this.A07, (List) this.A05));
                return;
            }
            return;
        }
        UserSession userSession = (UserSession) this.A06;
        FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A03;
        C82G c82g = (C82G) this.A02;
        AbstractC54212Nxq.A00(fragmentActivity, c82g, abstractC59962oe, userSession, (C195918ld) this.A05, this.A07);
        OSV.A00(c82g, EnumC201098ur.ACCEPT, userSession);
        AbstractC166987dD.A1Y(this.A04);
    }
}
