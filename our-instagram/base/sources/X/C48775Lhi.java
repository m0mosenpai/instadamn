package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import kotlin.enums.EnumEntries;

/* renamed from: X.Lhi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48775Lhi implements InterfaceC50493MQv {
    public InterfaceC50507MRk A00;
    public int A01;
    public final Activity A02;
    public final C41761wQ A03;
    public final UserSession A04;
    public final C7O4 A05;
    public final LA7 A06;
    public final C47374KwP A07;
    public final C7TQ A08;
    public final L7K A09;
    public final C47920LEp A0A;
    public final InterfaceC83713oG A0B;

    public C48775Lhi(Activity activity, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C42221xC c42221xC, UserSession userSession, C7O4 c7o4, C163947Vi c163947Vi, InterfaceC164947Zj interfaceC164947Zj, C7TQ c7tq, InterfaceC83713oG interfaceC83713oG) {
        AbstractC167007dF.A1G(c7tq, 2, interfaceC164947Zj);
        this.A02 = activity;
        this.A08 = c7tq;
        this.A0B = interfaceC83713oG;
        this.A04 = userSession;
        this.A05 = c7o4;
        this.A03 = AbstractC31173DnH.A0S();
        C47920LEp c47920LEp = new C47920LEp(interfaceC11380iw, userSession);
        this.A0A = c47920LEp;
        L7K l7k = new L7K(activity, interfaceC11380iw, userSession);
        this.A09 = l7k;
        this.A06 = new LA7(fragmentActivity, interfaceC11380iw, c42221xC, userSession, c163947Vi, interfaceC164947Zj, l7k, c47920LEp, interfaceC83713oG);
        this.A07 = new C47374KwP(userSession);
    }

    @Override // X.InterfaceC50493MQv
    public final void reset() {
        this.A01 = 0;
    }

    @Override // X.InterfaceC50493MQv
    public final AbstractC46524KiP Csr() {
        C7X c7x;
        C7X c7x2;
        EnumC46188KcQ enumC46188KcQ;
        AbstractC46524KiP krb;
        EnumC46188KcQ enumC46188KcQ2;
        C7O4 c7o4 = this.A05;
        C7K c7k = null;
        if (c7o4 != null) {
            return new C31295DpH(c7o4);
        }
        InterfaceC50507MRk interfaceC50507MRk = this.A00;
        if (interfaceC50507MRk == null) {
            return null;
        }
        while (this.A01 < AbstractC43592JPx.A02(((C49200LpH) interfaceC50507MRk).A00)) {
            int i = this.A01;
            C45304K3h c45304K3h = ((C49200LpH) interfaceC50507MRk).A00;
            if (c45304K3h.mResultSet.getInteger(i, 2) == 0) {
                UserSession userSession = this.A04;
                long j = c45304K3h.mResultSet.getLong(this.A01, 0);
                String string = c45304K3h.mResultSet.getString(this.A01, 7);
                String string2 = c45304K3h.mResultSet.getString(this.A01, 11);
                EnumEntries enumEntries = EnumC46205Kch.A02;
                EnumC46205Kch enumC46205Kch = (EnumC46205Kch) AbstractC06930Yk.A01(Integer.valueOf(c45304K3h.mResultSet.getInteger(this.A01, 1)), EnumC46205Kch.A01);
                Long nullableLong = c45304K3h.mResultSet.getNullableLong(this.A01, 29);
                String string3 = c45304K3h.mResultSet.getString(this.A01, 30);
                String string4 = c45304K3h.mResultSet.getString(this.A01, 31);
                Integer A0q = AbstractC43593JPy.A0q(c45304K3h.mResultSet, this.A01, 32);
                if (A0q != null) {
                    c7x = (C7X) AbstractC06930Yk.A01(A0q, C7X.A01);
                } else {
                    c7x = null;
                }
                Long nullableLong2 = c45304K3h.mResultSet.getNullableLong(this.A01, 33);
                String string5 = c45304K3h.mResultSet.getString(this.A01, 34);
                String string6 = c45304K3h.mResultSet.getString(this.A01, 35);
                Integer A0q2 = AbstractC43593JPy.A0q(c45304K3h.mResultSet, this.A01, 36);
                if (A0q2 != null) {
                    c7x2 = (C7X) AbstractC06930Yk.A01(A0q2, C7X.A01);
                } else {
                    c7x2 = null;
                }
                Integer A0q3 = AbstractC43593JPy.A0q(c45304K3h.mResultSet, this.A01, 28);
                if (A0q3 != null) {
                    c7k = (C7K) AbstractC06930Yk.A01(A0q3, C7K.A01);
                }
                String string7 = c45304K3h.mResultSet.getString(this.A01, 47);
                if (string7 == null || (enumC46188KcQ = (EnumC46188KcQ) AbstractC06930Yk.A01(string7, EnumC46188KcQ.A01)) == null) {
                    enumC46188KcQ = EnumC46188KcQ.A04;
                }
                krb = new KRB(this.A03, userSession, this.A06, this.A07, c7k, c7x, c7x2, enumC46188KcQ, enumC46205Kch, this.A08, nullableLong, nullableLong2, string, string2, string3, string4, string5, string6, j);
            } else if (c45304K3h.mResultSet.getInteger(this.A01, 2) == 2) {
                Activity activity = this.A02;
                UserSession userSession2 = this.A04;
                long j2 = c45304K3h.mResultSet.getLong(this.A01, 0);
                String string8 = c45304K3h.mResultSet.getString(this.A01, 6);
                String string9 = c45304K3h.mResultSet.getString(this.A01, 7);
                String string10 = c45304K3h.mResultSet.getString(this.A01, 11);
                EnumEntries enumEntries2 = EnumC46205Kch.A02;
                EnumC46205Kch enumC46205Kch2 = (EnumC46205Kch) AbstractC06930Yk.A01(Integer.valueOf(c45304K3h.mResultSet.getInteger(this.A01, 1)), EnumC46205Kch.A01);
                Long nullableLong3 = c45304K3h.mResultSet.getNullableLong(this.A01, 29);
                String string11 = c45304K3h.mResultSet.getString(this.A01, 30);
                String string12 = c45304K3h.mResultSet.getString(this.A01, 31);
                Long nullableLong4 = c45304K3h.mResultSet.getNullableLong(this.A01, 33);
                String string13 = c45304K3h.mResultSet.getString(this.A01, 34);
                String string14 = c45304K3h.mResultSet.getString(this.A01, 35);
                String string15 = c45304K3h.mResultSet.getString(this.A01, 21);
                String string16 = c45304K3h.mResultSet.getString(this.A01, 19);
                String string17 = c45304K3h.mResultSet.getString(this.A01, 24);
                String string18 = c45304K3h.mResultSet.getString(this.A01, 22);
                String string19 = c45304K3h.mResultSet.getString(this.A01, 27);
                String string20 = c45304K3h.mResultSet.getString(this.A01, 25);
                String string21 = c45304K3h.mResultSet.getString(this.A01, 47);
                if (string21 == null || (enumC46188KcQ2 = (EnumC46188KcQ) AbstractC06930Yk.A01(string21, EnumC46188KcQ.A01)) == null) {
                    enumC46188KcQ2 = EnumC46188KcQ.A04;
                }
                krb = new KRC(activity, this.A03, userSession2, this.A06, enumC46188KcQ2, enumC46205Kch2, this.A08, nullableLong3, nullableLong4, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, j2);
            } else {
                this.A01++;
            }
            this.A01++;
            return krb;
        }
        return null;
    }

    @Override // X.InterfaceC50493MQv
    public final void E5G() {
        MsysThreadId msysThreadId;
        InterfaceC2056098k A04 = AbstractC140946Yw.A04(this.A0B);
        if (A04 != null && (A04 instanceof MsysThreadId) && (msysThreadId = (MsysThreadId) A04) != null) {
            C47920LEp c47920LEp = this.A0A;
            UserSession userSession = c47920LEp.A03;
            if (C18U.A06(C06090Tz.A05, userSession, 36314287790098953L)) {
                JQn.A00(C137746Lw.A00(userSession, "MsysProactiveWarningBannerManager").A01.A01(msysThreadId).A0P(AbstractC142856cl.A00), c47920LEp.A02, c47920LEp, 66);
            }
        }
    }

    @Override // X.InterfaceC50493MQv
    public final void destroy() {
        this.A03.A01();
        this.A0A.A02.A01();
    }
}
