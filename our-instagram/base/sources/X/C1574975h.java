package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.75h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1574975h extends C1P1 {
    public final UserSession A00;
    public final AnonymousClass776 A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        List list;
        int A03 = C0f9.A03(617654934);
        C1574875f c1574875f = (C1574875f) obj;
        int A032 = C0f9.A03(-1130747864);
        C14360o3.A0B(c1574875f, 0);
        String str = this.A03;
        C28891aS A00 = AbstractC207749He.A00();
        UserSession userSession = this.A00;
        JV9 A002 = A00.A00(userSession);
        String str2 = this.A02;
        boolean z = this.A04;
        AnonymousClass776 anonymousClass776 = this.A01;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 4);
        C4KV c4kv = A002.A02;
        if (anonymousClass776 != null) {
            c4kv.A00.markerPoint(anonymousClass776.A01, anonymousClass776.A00, "network_fetch_end");
        }
        C43707JUs c43707JUs = c1574875f.A02;
        if (c43707JUs == null) {
            c4kv.A0A(anonymousClass776, "server_response", "server_response_has_no_thread_result");
        } else {
            c4kv.A0B(anonymousClass776, "may_run_after_thread_jid_cache_loaded", !c43707JUs.A05(userSession));
            c4kv.A0B(anonymousClass776, "should_query_reverb_for_thread", c43707JUs.A05(userSession));
            List list2 = c43707JUs.A06;
            if (list2 != null) {
                List A0X = AbstractC001800i.A0X(list2);
                i = A0X.size();
                ArrayList arrayList = new ArrayList();
                Iterator it = A0X.iterator();
                while (it.hasNext()) {
                    String str3 = ((C83403nh) it.next()).A1Y;
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                }
                i2 = arrayList.size();
                list = new ArrayList();
                Iterator it2 = A0X.iterator();
                while (it2.hasNext()) {
                    String A0h = ((C83403nh) it2.next()).A0h();
                    if (A0h == null) {
                        A0h = "";
                    }
                    list.add(A0h);
                }
            } else {
                i = -1;
                i2 = 0;
                list = C16930sl.A00;
            }
            c4kv.A0G(anonymousClass776, list, i, i2, c43707JUs.A00().longValue(), c43707JUs.A03(), c43707JUs.A04(userSession));
            JV0 jv0 = A002.A01;
            if (jv0 != null) {
                jv0.A01(c43707JUs, "thread_fetch", true);
            }
            DirectThreadKey directThreadKey = new DirectThreadKey(c43707JUs.A1E, null);
            List unmodifiableList = Collections.unmodifiableList(c43707JUs.A1d);
            C14360o3.A07(unmodifiableList);
            C14360o3.A0K(c43707JUs.A0z, true);
            C7OH c7oh = new C7OH(directThreadKey, unmodifiableList);
            AbstractC207749He.A00();
            JVE.A01(userSession).A0B(c7oh, anonymousClass776, c43707JUs, str2, str, 20, c43707JUs.A00().longValue(), C18U.A01(C06090Tz.A05, userSession, 36600336913338232L), z);
            List list3 = c43707JUs.A06;
            C14360o3.A07(list3);
            c43707JUs.A06 = list3;
            c4kv.A0F(anonymousClass776);
            if (jv0 != null) {
                jv0.A01(c43707JUs, "thread_fetch", false);
            }
        }
        C0f9.A0A(1798181848, A032);
        C0f9.A0A(-1182410741, A03);
    }

    public C1574975h(UserSession userSession, AnonymousClass776 anonymousClass776, String str, String str2, boolean z) {
        this.A00 = userSession;
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A01 = anonymousClass776;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        C0f9.A0A(-844195795, C0f9.A03(-1002950445));
    }

    @Override // X.C1P1
    public final void onStart() {
        C0f9.A0A(1370172776, C0f9.A03(81223662));
    }
}
