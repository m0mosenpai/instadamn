package X;

import java.util.List;

/* renamed from: X.WwC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71562WwC implements Runnable {
    public final /* synthetic */ WFQ A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ List A02;

    public RunnableC71562WwC(WFQ wfq, AbstractC12990ll abstractC12990ll, List list) {
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
            c006802i2.markerPoint(896612552, "add_active_fblite_account_start");
            try {
                try {
                    String str = "";
                    boolean z = false;
                    for (C203148yW c203148yW : WFQ.A02(wfq, abstractC12990ll, EnumC200808uN.A05, EnumC200938ua.ACTIVE_ACCOUNT)) {
                        C09530e4 c09530e4 = new C09530e4("account_type", "");
                        C203128yU c203128yU = c203148yW.A01;
                        str = c203128yU.A01.A02;
                        list.add(AbstractC06930Yk.A06(c09530e4, new C09530e4("uid", str), new C09530e4("credential_type", "facebook_lite_active_session"), new C09530e4("token", c203128yU.A00)));
                        z = true;
                    }
                    if (z) {
                        wfq.A06.A03(abstractC12990ll, "facebook_lite_active_session", AbstractC16960so.A1M(str));
                    } else {
                        wfq.A06.A01(abstractC12990ll, "facebook_lite_active_session");
                    }
                } catch (SecurityException unused) {
                    wfq.A06.A02(abstractC12990ll, "facebook_lite_active_session", "security_exception");
                } catch (Exception e) {
                    wfq.A06.A02(abstractC12990ll, "facebook_lite_active_session", "other_exception");
                    C0K8.A0K("CaaFetchClientDataHelper", "Failed to fetch Facebook Lite active account from lite provider", e);
                }
                if (c006802i != null) {
                    return;
                }
            } finally {
                c006802i = wfq.A01;
                if (c006802i != null) {
                    c006802i.markerPoint(896612552, "add_active_fblite_account_end");
                }
            }
        }
        C14360o3.A0F("qplLogger");
        throw C00O.createAndThrow();
    }
}
