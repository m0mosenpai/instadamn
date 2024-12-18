package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;

/* renamed from: X.OrG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55866OrG implements InterfaceC449925e {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0075, code lost:
    
        if (r1.getBoolean("has_liked") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        if (r1.getBoolean("has_viewer_saved") == false) goto L17;
     */
    @Override // X.InterfaceC449925e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getContentInBackground(android.content.Context r17) {
        /*
            r16 = this;
            r0 = 0
            r1 = r17
            X.C14360o3.A0B(r1, r0)
            r0 = r16
            android.content.Context r2 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A01
            java.lang.String r1 = r0.userId
            java.lang.String r0 = X.AbstractC12880la.A04(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "MainFeed-%s-%s.json"
            java.lang.String r1 = X.AbstractC13670mt.A06(r0, r1)
            java.io.File r0 = r2.getCacheDir()
            java.io.File r1 = X.MSW.A0w(r0, r1)
            boolean r0 = r1.exists()
            if (r0 == 0) goto Ld0
            org.json.JSONObject r14 = X.AbstractC31171DnF.A0q()
            java.lang.StringBuilder r0 = X.AbstractC166987dD.A1C()
            java.lang.String r1 = X.AbstractC13530mf.A07(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r13 = "feed_items"
            org.json.JSONArray r12 = r0.getJSONArray(r13)
            org.json.JSONArray r11 = X.AbstractC31171DnF.A0p()
            int r10 = r12.length()
            r9 = 0
        L4a:
            if (r9 >= r10) goto Lc5
            java.lang.Object r2 = r12.get(r9)
            r0 = 1215(0x4bf, float:1.703E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.C14360o3.A0C(r2, r0)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r1 = "media_or_ad"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto Lc0
            org.json.JSONObject r1 = r2.getJSONObject(r1)
            java.lang.String r8 = "has_liked"
            boolean r0 = r1.has(r8)
            r7 = 1
            if (r0 == 0) goto L77
            boolean r0 = r1.getBoolean(r8)
            r6 = 1
            if (r0 != 0) goto L78
        L77:
            r6 = 0
        L78:
            java.lang.String r5 = "has_viewer_saved"
            boolean r0 = r1.has(r5)
            if (r0 == 0) goto L87
            boolean r0 = r1.getBoolean(r5)
            r4 = 1
            if (r0 != 0) goto L88
        L87:
            r4 = 0
        L88:
            java.lang.String r3 = "is_seen"
            boolean r0 = r1.has(r3)
            if (r0 == 0) goto Lc3
            boolean r0 = r1.getBoolean(r3)
            if (r0 == 0) goto Lc3
        L96:
            org.json.JSONObject r2 = X.AbstractC31171DnF.A0q()
            java.lang.String r15 = "id"
            java.lang.String r0 = r1.getString(r15)
            r2.put(r15, r0)
            java.lang.String r0 = "user"
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            java.lang.String r1 = X.AbstractC31182DnR.A01()
            java.lang.Object r0 = r0.get(r1)
            r2.put(r1, r0)
            r2.put(r8, r6)
            r2.put(r5, r4)
            r2.put(r3, r7)
            r11.put(r2)
        Lc0:
            int r9 = r9 + 1
            goto L4a
        Lc3:
            r7 = 0
            goto L96
        Lc5:
            r14.put(r13, r11)
            java.lang.String r0 = r14.toString()
            X.C14360o3.A0A(r0)
            return r0
        Ld0:
            java.lang.String r0 = "home feed cache file doesn't exist"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55866OrG.getContentInBackground(android.content.Context):java.lang.String");
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "feed_cache";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "FeedCacheLogCollector";
    }

    public C55866OrG(Context context, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
