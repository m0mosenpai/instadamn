package X;

import android.app.Activity;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.747, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass747 {
    public C152546th A00;
    public C152546th A01;
    public final C0JO A02 = new Object();
    public final UserSession A03;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (((androidx.fragment.app.Fragment) r5.get(0)).mTag == "fragment_search") goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(androidx.fragment.app.FragmentActivity r8) {
        /*
            r7 = this;
            r2 = 0
            X.6th r4 = r7.A01
            if (r4 == 0) goto L7a
            X.0h2 r0 = r8.getSupportFragmentManager()
            X.06g r0 = r0.A0U
            java.util.List r5 = r0.A04()
            X.C14360o3.A07(r5)
            boolean r0 = r5.isEmpty()
            java.lang.String r3 = "fragment_search"
            r6 = 1
            if (r0 != 0) goto L26
            java.lang.Object r0 = r5.get(r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r0 = r0.mTag
            r1 = 1
            if (r0 != r3) goto L27
        L26:
            r1 = 0
        L27:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L7b
            java.lang.Object r0 = r5.get(r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r0 = r0.mTag
            if (r0 != r3) goto L7b
            java.lang.Object r0 = r5.get(r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0h2 r0 = r0.getChildFragmentManager()
            int r0 = r0.A0L()
            if (r0 != 0) goto L7b
        L47:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "search_session_id"
            r5.put(r0, r1)
            r0 = 0
            r7.A01 = r0
            com.instagram.common.session.UserSession r4 = r7.A03
            X.C14360o3.A0B(r4, r2)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36599074186792380(0x8206aa00030dbc, double:3.208740116145744E-306)
            long r0 = X.C18U.A01(r2, r4, r0)
            int r2 = (int) r0
            java.lang.String r1 = "Required value was null."
            if (r2 == r6) goto La0
            r0 = 2
            java.lang.String r3 = "935001260753650"
            if (r2 == r0) goto L84
            r0 = 3
            if (r2 != r0) goto L7a
            X.1VN r0 = X.C1VN.A00
            if (r0 == 0) goto L7e
            r0.A00(r8, r4, r3, r5)
        L7a:
            return
        L7b:
            if (r1 != 0) goto L47
            return
        L7e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L84:
            X.1VN r0 = X.C1VN.A00
            if (r0 == 0) goto L9a
            java.lang.Class<X.5wO> r2 = X.C131345wO.class
            r1 = 4
            X.PbN r0 = new X.PbN
            r0.<init>(r4, r1)
            java.lang.Object r0 = r4.A01(r2, r0)
            X.5wO r0 = (X.C131345wO) r0
            r0.A01(r8, r3, r5, r6)
            return
        L9a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        La0:
            X.1VN r0 = X.C1VN.A00
            if (r0 == 0) goto Laf
            java.lang.String r1 = "1111276766222125"
            X.V3m r0 = new X.V3m
            r0.<init>(r4, r8, r1)
            X.C70188WFr.A02(r0, r4, r1)
            return
        Laf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass747.A01(androidx.fragment.app.FragmentActivity):void");
    }

    public final void A00(Activity activity) {
        C152546th c152546th = this.A00;
        if (c152546th != null) {
            long now = this.A02.now() - c152546th.A00;
            if (now < 300000 && now >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                HashMap hashMap = new HashMap();
                hashMap.put("entity_type", c152546th.A02);
                hashMap.put("entity_name", c152546th.A01);
                hashMap.put("search_session_id", c152546th.A04);
                hashMap.put("query_text", c152546th.A03);
                C1VN c1vn = C1VN.A00;
                if (c1vn != null) {
                    c1vn.A00(activity, this.A03, "474680169747204", hashMap);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            this.A00 = null;
        }
    }

    public final void A02(String str) {
        this.A01 = new C152546th("", "", "", str, this.A02.now());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0JO, java.lang.Object] */
    public AnonymousClass747(UserSession userSession) {
        this.A03 = userSession;
    }
}
