package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class Ww9 implements Runnable {
    public final /* synthetic */ WFQ A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ List A02;

    public Ww9(WFQ wfq, AbstractC12990ll abstractC12990ll, List list) {
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
            c006802i2.markerPoint(896612552, "add_saved_fb_accounts_start");
            try {
                try {
                    try {
                        List<C203148yW> A02 = WFQ.A02(wfq, abstractC12990ll, EnumC200808uN.A03, EnumC200938ua.SAVED_ACCOUNTS);
                        ArrayList arrayList = new ArrayList();
                        int i = 0;
                        for (C203148yW c203148yW : A02) {
                            C09530e4 c09530e4 = new C09530e4("account_type", "");
                            C203128yU c203128yU = c203148yW.A01;
                            String str = c203128yU.A01.A02;
                            list.add(AbstractC06930Yk.A06(c09530e4, new C09530e4("uid", str), new C09530e4("credential_type", "facebook_local_auth"), new C09530e4("token", c203128yU.A00)));
                            i++;
                            arrayList.add(WFQ.A01(str));
                        }
                        if (i == 0) {
                            wfq.A06.A01(abstractC12990ll, "facebook_local_auth");
                        } else {
                            wfq.A06.A03(abstractC12990ll, "facebook_local_auth", arrayList);
                            C006802i c006802i3 = wfq.A01;
                            if (c006802i3 == null) {
                                C14360o3.A0F("qplLogger");
                                throw C00O.createAndThrow();
                            }
                            c006802i3.markerAnnotate(896612552, "count_of_fb_local_auth_accounts", i);
                        }
                    } catch (SecurityException e) {
                        C0K8.A0K("CaaFetchClientDataHelper", "Failed to fetch saved Facebook accounts", e);
                        wfq.A06.A02(abstractC12990ll, "facebook_local_auth", "security_exception");
                    }
                } catch (Exception unused) {
                    wfq.A06.A02(abstractC12990ll, "facebook_local_auth", "other_exception");
                }
                if (c006802i != null) {
                    return;
                }
            } finally {
                c006802i = wfq.A01;
                if (c006802i != null) {
                    c006802i.markerPoint(896612552, "add_saved_fb_accounts_end");
                }
            }
        }
        C14360o3.A0F("qplLogger");
        throw C00O.createAndThrow();
    }
}
