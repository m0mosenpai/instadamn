package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WwB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71561WwB implements Runnable {
    public final /* synthetic */ WFQ A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ List A02;

    public RunnableC71561WwB(WFQ wfq, AbstractC12990ll abstractC12990ll, List list) {
        this.A00 = wfq;
        this.A01 = abstractC12990ll;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C006802i c006802i;
        EnumC200808uN enumC200808uN;
        WFQ wfq = this.A00;
        AbstractC12990ll abstractC12990ll = this.A01;
        List list = this.A02;
        C006802i c006802i2 = wfq.A01;
        if (c006802i2 != null) {
            c006802i2.markerPoint(896612552, "add_saved_msgr_accounts_start");
            try {
                try {
                } catch (SecurityException e) {
                    C0K8.A0K("CaaFetchClientDataHelper", "Failed to fetch saved Messenger accounts", e);
                    wfq.A06.A02(abstractC12990ll, "messenger_local_auth", "security_exception");
                } catch (Exception unused) {
                    wfq.A06.A02(abstractC12990ll, "messenger_local_auth", "other_exception");
                }
                if (wfq.A00 == null) {
                    C14360o3.A0F("caaIgOfflineExperimentManager");
                } else {
                    if (!C1AD.A06(C06090Tz.A05, 18312812837353884L)) {
                        enumC200808uN = EnumC200808uN.A09;
                    } else {
                        enumC200808uN = EnumC200808uN.A08;
                    }
                    List<C203148yW> A02 = WFQ.A02(wfq, abstractC12990ll, enumC200808uN, EnumC200938ua.ACTIVE_ACCOUNT);
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (C203148yW c203148yW : A02) {
                        C09530e4 c09530e4 = new C09530e4("account_type", "");
                        C203128yU c203128yU = c203148yW.A01;
                        String str = c203128yU.A01.A02;
                        list.add(AbstractC06930Yk.A06(c09530e4, new C09530e4("uid", str), new C09530e4("credential_type", "messenger_local_auth"), new C09530e4("token", c203128yU.A00)));
                        i++;
                        arrayList.add(WFQ.A01(str));
                    }
                    if (i != 0) {
                        wfq.A06.A03(abstractC12990ll, "messenger_local_auth", arrayList);
                        C006802i c006802i3 = wfq.A01;
                        if (c006802i3 == null) {
                            C14360o3.A0F("qplLogger");
                        } else {
                            c006802i3.markerAnnotate(896612552, "count_of_msgr_local_auth_accounts", i);
                        }
                    } else {
                        wfq.A06.A01(abstractC12990ll, "messenger_local_auth");
                    }
                    if (c006802i != null) {
                        return;
                    }
                }
                throw C00O.createAndThrow();
            } finally {
                c006802i = wfq.A01;
                if (c006802i != null) {
                    c006802i.markerPoint(896612552, "add_saved_msgr_accounts_end");
                }
            }
        }
        C14360o3.A0F("qplLogger");
        throw C00O.createAndThrow();
    }
}
