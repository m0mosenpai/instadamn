package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.DirectThreadApi;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.65n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1344165n extends C1P1 {
    public int A00;
    public AbstractC115105If A01;
    public C11R A02;
    public AnonymousClass776 A03;
    public final Long A04;
    public final String A05;
    public final List A06;
    public final /* synthetic */ C4KR A07;

    public int A00() {
        return -1;
    }

    public void A02() {
        C129095sU c129095sU = (C129095sU) this;
        C4KR c4kr = c129095sU.A07;
        c4kr.A06.A00(((AbstractC1344165n) c129095sU).A05, c129095sU.A01);
        c4kr.A0D(c129095sU, "Permanent failure");
        c4kr.A08.A0D(((AbstractC1344165n) c129095sU).A03, null, false);
        c129095sU.A03();
    }

    public abstract void A04();

    public void A08(boolean z) {
        C129095sU c129095sU = (C129095sU) this;
        C4KR c4kr = c129095sU.A07;
        C4KW c4kw = c4kr.A06;
        String str = ((AbstractC1344165n) c129095sU).A05;
        String str2 = c129095sU.A01;
        if (z) {
            c4kw.A00(str, str2);
            c4kr.A0D(c129095sU, "Temporary failure, will not retry");
        } else {
            c4kw.A01(str, str2);
        }
        c4kr.A08.A0D(((AbstractC1344165n) c129095sU).A03, Boolean.valueOf(z), true);
    }

    public AbstractC1344165n(C4KR c4kr, Long l) {
        this.A07 = c4kr;
        this.A04 = l;
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A05 = obj;
        this.A06 = new ArrayList();
    }

    public void A01() {
        String str;
        AnonymousClass777 A0H;
        Integer num;
        C129095sU c129095sU = (C129095sU) this;
        String str2 = c129095sU.A02;
        if (str2 != null) {
            str = "thread";
        } else {
            str = "participants";
        }
        ThreadFetchReason threadFetchReason = c129095sU.A00;
        String fetchType = threadFetchReason.getFetchType();
        C4KR c4kr = c129095sU.A07;
        C4KV c4kv = c4kr.A08;
        UserSession userSession = c4kr.A04;
        Long l = ((AbstractC1344165n) c129095sU).A04;
        boolean A00 = c4kr.A05.A00();
        boolean A02 = AbstractC453326q.A02(userSession);
        boolean z = c129095sU.A05;
        String str3 = ((AbstractC1344165n) c129095sU).A05;
        ((AbstractC1344165n) c129095sU).A03 = c4kv.A0E(userSession, threadFetchReason, l, str2, str, "BaseSnapshotRequestManager", str3, A00, A02, z);
        if (str2 != null) {
            String str4 = c129095sU.A01;
            if (str4 != null) {
                num = C05F.A01;
            } else {
                num = null;
            }
            A0H = DirectThreadApi.A0G(userSession, ((AbstractC1344165n) c129095sU).A03, num, Integer.valueOf(DirectThreadApi.A00(userSession, fetchType)), l, str2, str4, c4kr.A07(), str3);
        } else {
            List list = c129095sU.A04;
            if (list != null) {
                A0H = DirectThreadApi.A0H(userSession, ((AbstractC1344165n) c129095sU).A03, Integer.valueOf(DirectThreadApi.A00(userSession, fetchType)), l, str3, list, z);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        A0H.A00(c129095sU);
        ((AbstractC1344165n) c129095sU).A02 = A0H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            r5 = this;
            X.5If r4 = r5.A01
            if (r4 != 0) goto L8
            X.5Ie r4 = X.C7J2.A00()
        L8:
            java.lang.Object r3 = r4.A00()
            r0 = r3
            X.1un r0 = (X.InterfaceC40801un) r0
            r2 = 1
            if (r0 == 0) goto L2f
            boolean r0 = r0.isOk()
            if (r0 != r2) goto L2f
            X.5If r0 = r5.A01
            if (r0 == 0) goto L37
            java.lang.Object r0 = r0.A00()
            X.1un r0 = (X.InterfaceC40801un) r0
            if (r0 == 0) goto L37
            int r0 = r0.getStatusCode()
        L28:
            boolean r1 = X.AbstractC37423Ge3.A00(r0)
            r0 = 1
            if (r1 == 0) goto L30
        L2f:
            r0 = 0
        L30:
            if (r3 == 0) goto L33
            r2 = 0
        L33:
            r5.A05(r4, r0, r2)
            return
        L37:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1344165n.A03():void");
    }

    public final void A05(final AbstractC115105If abstractC115105If, final boolean z, final boolean z2) {
        List<C7J1> list = this.A06;
        if (!list.isEmpty()) {
            for (final C7J1 c7j1 : list) {
                this.A07.A02.post(new Runnable() { // from class: X.9Hg
                    @Override // java.lang.Runnable
                    public final void run() {
                        c7j1.A04(abstractC115105If, z, z2);
                    }
                });
            }
        }
    }

    public final void A06(C7J1 c7j1) {
        this.A06.remove(c7j1);
        if (A09()) {
            C11R c11r = this.A02;
            if (c11r instanceof C1OO) {
                ((C1OO) c11r).cancel();
            }
            this.A02 = null;
            A07("Remove pending request");
            this.A07.A0B.remove(this);
        }
    }

    public final void A07(String str) {
        if (this instanceof C129095sU) {
            C129095sU c129095sU = (C129095sU) this;
            c129095sU.A07.A0C(c129095sU, str);
        }
    }

    public boolean A09() {
        if (this instanceof C129095sU) {
            C129095sU c129095sU = (C129095sU) this;
            if (((AbstractC1344165n) c129095sU).A06.isEmpty() && c129095sU.A03.isEmpty()) {
                return true;
            }
            return false;
        }
        return this.A06.isEmpty();
    }

    @Override // X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(734502534);
        C14360o3.A0B(abstractC115105If, 0);
        this.A01 = abstractC115105If;
        this.A07.A03.obtainMessage(2, this).sendToTarget();
        C0f9.A0A(2000931836, A03);
    }

    @Override // X.C1P1
    public void onStart() {
        int A03 = C0f9.A03(1608393867);
        this.A00++;
        C0f9.A0A(1488939936, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(1636231786);
        int A032 = C0f9.A03(-1293103676);
        C14360o3.A0B(obj, 0);
        this.A01 = new C115115Ig(obj);
        this.A07.A03.obtainMessage(2, this).sendToTarget();
        C0f9.A0A(-282096004, A032);
        C0f9.A0A(-989919707, A03);
    }
}
