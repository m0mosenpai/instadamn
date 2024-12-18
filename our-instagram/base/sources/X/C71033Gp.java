package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: X.3Gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71033Gp extends C1P1 {
    public final /* synthetic */ C3GX A00;
    public final /* synthetic */ EnumC37671p4 A01;
    public final /* synthetic */ UUID A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C71033Gp(C3GX c3gx, EnumC37671p4 enumC37671p4, UUID uuid, boolean z, boolean z2) {
        this.A00 = c3gx;
        this.A02 = uuid;
        this.A03 = z;
        this.A01 = enumC37671p4;
        this.A04 = z2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        String str;
        String str2;
        Object obj;
        int A03 = C0f9.A03(-477152706);
        Object A00 = abstractC115105If.A00();
        if (A00 != null) {
            i = ((C40791um) A00).mStatusCode;
            ((C40741uh) A00).A09 = this.A02;
        } else {
            i = 0;
        }
        C3GX c3gx = this.A00;
        C3GX.A01(c3gx, null, i);
        AbstractC70903Gc abstractC70903Gc = c3gx.A09;
        long currentTimeMillis = System.currentTimeMillis() - c3gx.A06;
        if (C18U.A06(C06090Tz.A05, c3gx.A0D, 36322224889735228L)) {
            String A002 = AbstractC111324zv.A00(952);
            C40781ul c40781ul = (C40781ul) A00;
            if (c40781ul != null) {
                str2 = c40781ul.getErrorMessage();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "n/a";
            }
            String A0R = AnonymousClass001.A0R(A002, str2);
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC111324zv.A00(951));
            Throwable A01 = abstractC115105If.A01();
            if (A01 == null || (obj = A01.getCause()) == null) {
                obj = "n/a";
            }
            sb.append(obj);
            str = AnonymousClass001.A0g(A0R, " | ", sb.toString());
        } else {
            str = null;
        }
        abstractC70903Gc.A02(i, str, currentTimeMillis);
        c3gx.A07.onFail(abstractC115105If);
        if (c3gx.A0K) {
            c3gx.A09.A03 = C05F.A00;
            c3gx.A07.onFinish();
        }
        C0f9.A0A(-2033850194, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1469770298);
        this.A00.A05 = System.currentTimeMillis();
        C0f9.A0A(1304807265, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(839069815);
        C3GX c3gx = this.A00;
        System.currentTimeMillis();
        if (!c3gx.A0K) {
            c3gx.A09.A03 = C05F.A00;
            c3gx.A07.onFinish();
        }
        C0f9.A0A(-1337743265, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1044020279);
        C3GX c3gx = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        c3gx.A06 = currentTimeMillis;
        c3gx.A0E.A0M = Long.valueOf(currentTimeMillis);
        C0f9.A0A(201722647, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r2.A0I.getSessionId().equals(r15.A06) != false) goto L15;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71033Gp.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        Collection emptyList;
        int A03 = C0f9.A03(-1130207672);
        C40741uh c40741uh = (C40741uh) obj;
        int A032 = C0f9.A03(-1311160572);
        C3GX c3gx = this.A00;
        c3gx.A05 = System.currentTimeMillis();
        UserSession userSession = c3gx.A0D;
        if (c40741uh.A03(userSession) != null) {
            emptyList = c40741uh.A03(userSession).values();
        } else {
            emptyList = Collections.emptyList();
        }
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            for (C38321qM c38321qM : AbstractC37741pB.A05((C37771pE) it.next())) {
                Context context = c3gx.A0C;
                ExtendedImageUrl A1q = c38321qM.A1q(context);
                AbstractC131155w3.A00(context, userSession, c38321qM, "");
                if (A1q != null) {
                    C1OG A0J = C25821No.A00().A0J(A1q, c3gx.A0F.getModuleName());
                    A0J.A0I = true;
                    A0J.A01();
                }
                if (c38321qM.Cff() && (!c38321qM.A5M() || (c38321qM = c38321qM.A1e(c38321qM.A0x())) != null)) {
                    c38321qM.CFR();
                    C4AG.A00(userSession).A01(new C4AD(c38321qM.CFR(), c3gx.A0F.getModuleName()));
                }
            }
        }
        C0f9.A0A(627467388, A032);
        C0f9.A0A(1946812885, A03);
    }
}
