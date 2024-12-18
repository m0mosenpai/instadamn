package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ww8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71559Ww8 implements Runnable {
    public final /* synthetic */ WFQ A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ List A02;

    public RunnableC71559Ww8(WFQ wfq, AbstractC12990ll abstractC12990ll, List list) {
        this.A00 = wfq;
        this.A01 = abstractC12990ll;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C006802i c006802i;
        WFQ wfq = this.A00;
        AbstractC12990ll abstractC12990ll = this.A01;
        List list = this.A02;
        C006802i c006802i2 = wfq.A01;
        if (c006802i2 != null) {
            c006802i2.markerPoint(896612552, "add_active_fb_account_start");
            try {
                try {
                    try {
                        List A02 = WFQ.A02(wfq, abstractC12990ll, EnumC200808uN.A03, EnumC200938ua.ACTIVE_ACCOUNT);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = A02.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            C203128yU c203128yU = ((C203148yW) it.next()).A01;
                            String str = c203128yU.A01.A02;
                            list.add(AbstractC06930Yk.A06(AbstractC167007dF.A1b("token", c203128yU.A00, new C09530e4("uid", str), new C09530e4("credential_type", "facebook_active_session"))));
                            i++;
                            arrayList.add(WFQ.A01(str));
                        }
                        if (i == 0) {
                            wfq.A06.A01(abstractC12990ll, "facebook_active_session");
                        } else {
                            wfq.A06.A03(abstractC12990ll, "facebook_active_session", arrayList);
                            C006802i c006802i3 = wfq.A01;
                            if (c006802i3 == null) {
                                C14360o3.A0F("qplLogger");
                                throw C00O.createAndThrow();
                            }
                            c006802i3.markerAnnotate(896612552, "count_of_fb_sso_accounts", i);
                        }
                    } catch (SecurityException e) {
                        C0K8.A0K("CaaFetchClientDataHelper", "Failed to fetch active Facebook accounts", e);
                        wfq.A06.A02(abstractC12990ll, "facebook_active_session", "security_exception");
                    }
                } catch (Exception unused) {
                    wfq.A06.A02(abstractC12990ll, "facebook_active_session", "other_exception");
                }
                if (c006802i != null) {
                    return;
                }
            } finally {
                c006802i = wfq.A01;
                if (c006802i != null) {
                    c006802i.markerPoint(896612552, "add_active_fb_account_end");
                }
            }
        }
        C14360o3.A0F("qplLogger");
        throw C00O.createAndThrow();
    }
}
