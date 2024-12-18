package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: X.Gct, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37351Gct extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    public C37351Gct(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A04 = z;
        this.A01 = obj2;
        this.A05 = z2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        IllegalStateException A14;
        int i2;
        String str;
        int i3;
        String str2;
        Object obj;
        String A00;
        C54696ODy c54696ODy;
        C54696ODy c54696ODy2;
        if (this.A00 != 0) {
            A0N = C0f9.A03(393522596);
            C14360o3.A0B(abstractC115105If, 0);
            boolean z = this.A05;
            if (z && (c54696ODy2 = (C54696ODy) this.A01) != null) {
                AbstractC54123NwL.A00(c54696ODy2, AbstractC43591JPw.A00(1281), "dialog", null, this.A04);
            }
            C55084Oag c55084Oag = (C55084Oag) this.A03;
            UserSession userSession = c55084Oag.A02;
            OMa A002 = AbstractC54126NwO.A00(userSession);
            String A003 = MSV.A00(518);
            A002.A03(TraceFieldType.FailureReason, A003);
            OMa A004 = AbstractC54126NwO.A00(userSession);
            Throwable A01 = abstractC115105If.A01();
            if (A01 != null) {
                A00 = A01.getMessage();
            } else {
                A00 = MSV.A00(164);
            }
            A004.A04(A003, A00);
            boolean z2 = this.A04;
            if (z2) {
                C9GR.A01(c55084Oag.A00, MSV.A00(1111), 2131957610, 1);
                if (z && (c54696ODy = (C54696ODy) this.A01) != null) {
                    AbstractC54123NwL.A00(c54696ODy, "view", MSV.A00(1160), MSV.A00(1261), z2);
                }
            } else {
                C55084Oag.A01((C54696ODy) this.A01, c55084Oag, false, z, true);
            }
            i3 = -1115633412;
        } else {
            A0N = AbstractC167017dG.A0N(abstractC115105If, 488791439);
            Object A005 = abstractC115105If.A00();
            if (A005 != null) {
                C40741uh c40741uh = (C40741uh) A005;
                i = c40741uh.mStatusCode;
                c40741uh.A09 = (UUID) this.A02;
            } else {
                i = 0;
            }
            C37347Gcp c37347Gcp = (C37347Gcp) this.A03;
            C37347Gcp.A01(c37347Gcp, null, i);
            AbstractC70903Gc abstractC70903Gc = c37347Gcp.A09;
            if (abstractC70903Gc != null) {
                long currentTimeMillis = System.currentTimeMillis() - c37347Gcp.A06;
                if (C18U.A06(C06090Tz.A05, c37347Gcp.A0D, 36322224889735228L)) {
                    String A006 = AbstractC111324zv.A00(952);
                    C40781ul c40781ul = (C40781ul) A005;
                    if (c40781ul != null) {
                        str2 = c40781ul.getErrorMessage();
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "n/a";
                    }
                    String A0R = AnonymousClass001.A0R(A006, str2);
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append(AbstractC111324zv.A00(951));
                    Throwable A012 = abstractC115105If.A01();
                    if (A012 == null || (obj = A012.getCause()) == null) {
                        obj = "n/a";
                    }
                    str = AnonymousClass001.A0g(A0R, " | ", AbstractC166997dE.A0v(obj, A1C));
                } else {
                    str = null;
                }
                abstractC70903Gc.A02(i, str, currentTimeMillis);
                c37347Gcp.A07.onFail(abstractC115105If);
                if (c37347Gcp.A0K) {
                    AbstractC70903Gc abstractC70903Gc2 = c37347Gcp.A09;
                    if (abstractC70903Gc2 != null) {
                        abstractC70903Gc2.A03 = C05F.A00;
                        c37347Gcp.A07.onFinish();
                    } else {
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i2 = 1232720934;
                    }
                }
                i3 = -509493708;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i2 = -1394924690;
            }
            C0f9.A0A(i2, A0N);
            throw A14;
        }
        C0f9.A0A(i3, A0N);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        if (this.A00 != 0) {
            super.onFailInBackground(abstractC115105If);
            return;
        }
        int A03 = C0f9.A03(1207745383);
        ((C37347Gcp) this.A03).A05 = System.currentTimeMillis();
        C0f9.A0A(-2001665370, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(1185188203);
            ((C54809OKh) this.A02).A00();
            i = 1636112348;
        } else {
            A03 = C0f9.A03(-608291935);
            C37347Gcp c37347Gcp = (C37347Gcp) this.A03;
            System.currentTimeMillis();
            if (!c37347Gcp.A0K) {
                AbstractC70903Gc abstractC70903Gc = c37347Gcp.A09;
                if (abstractC70903Gc != null) {
                    abstractC70903Gc.A03 = C05F.A00;
                    c37347Gcp.A07.onFinish();
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0A(780565029, A03);
                    throw A0g;
                }
            }
            i = 1547113949;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-1815153972);
            ((C54809OKh) this.A02).A01();
            i = 911716486;
        } else {
            A03 = C0f9.A03(496169982);
            C37347Gcp c37347Gcp = (C37347Gcp) this.A03;
            long currentTimeMillis = System.currentTimeMillis();
            c37347Gcp.A06 = currentTimeMillis;
            c37347Gcp.A0E.A0M = Long.valueOf(currentTimeMillis);
            i = 866609642;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (X.C14360o3.A0K(r3.A0I.getSessionId(), r6.A06) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b9  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37351Gct.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        Collection<C37771pE> emptyList;
        if (this.A00 != 0) {
            super.onSuccessInBackground(obj);
            return;
        }
        int A03 = C0f9.A03(-532425632);
        C40741uh c40741uh = (C40741uh) obj;
        int A0N = AbstractC167017dG.A0N(c40741uh, -1359496671);
        C37347Gcp c37347Gcp = (C37347Gcp) this.A03;
        c37347Gcp.A05 = System.currentTimeMillis();
        UserSession userSession = c37347Gcp.A0D;
        if (c40741uh.A03(userSession) != null) {
            emptyList = c40741uh.A03(userSession).values();
        } else {
            emptyList = Collections.emptyList();
        }
        for (C37771pE c37771pE : emptyList) {
            C14360o3.A0A(c37771pE);
            Iterator it = AbstractC37741pB.A05(c37771pE).iterator();
            while (it.hasNext()) {
                C38321qM A0i = AbstractC31172DnG.A0i(it);
                Context context = c37347Gcp.A0C;
                ExtendedImageUrl A1q = A0i.A1q(context);
                AbstractC131155w3.A00(context, userSession, A0i, "");
                if (A1q != null) {
                    C1OG A0J = C25821No.A00().A0J(A1q, c37347Gcp.A0F.getModuleName());
                    A0J.A0I = true;
                    A0J.A01();
                }
                if (A0i.Cff() && (!A0i.A5M() || (A0i = A0i.A1e(A0i.A0x())) != null)) {
                    A0i.CFR();
                    C4AG.A00(userSession).A01(new C4AD(A0i.CFR(), c37347Gcp.A0F.getModuleName()));
                }
            }
        }
        C0f9.A0A(-290426827, A0N);
        C0f9.A0A(-1938525585, A03);
    }
}
