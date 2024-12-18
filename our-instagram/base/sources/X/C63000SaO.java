package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SaO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63000SaO {
    public final Context A00;
    public final C62665SLb A01;
    public final InterfaceC26531Qi A02;
    public final C11880jn A03;
    public final C11880jn A04;
    public final C11900jp A05;

    public C63000SaO(Context context, InterfaceC26531Qi interfaceC26531Qi, InterfaceC65348TiV interfaceC65348TiV, C11880jn c11880jn, C11880jn c11880jn2, C11900jp c11900jp) {
        C03190Dc c03190Dc = AbstractC62855SUc.A01;
        this.A00 = context;
        this.A03 = c11880jn;
        this.A04 = c11880jn2;
        this.A05 = c11900jp;
        this.A02 = interfaceC26531Qi;
        this.A01 = new C62665SLb(interfaceC65348TiV, c11880jn, c11880jn2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:22|(1:84)(3:25|(1:27)(1:83)|(1:81)(12:34|35|36|(1:72)(2:41|(1:70)(10:54|129|57|58|(1:62)|63|64|65|(1:67)|68))|71|58|(2:60|62)|63|64|65|(0)|68))|82|35|36|(0)|72|71|58|(0)|63|64|65|(0)|68) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0146, code lost:
    
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0169, code lost:
    
        ((X.SP6) r3).A00 = java.lang.System.currentTimeMillis();
        r2.A00 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0177, code lost:
    
        if (r17.A02 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0179, code lost:
    
        r0 = r7.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017d, code lost:
    
        if (r0 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017f, code lost:
    
        r0 = java.lang.String.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
    
        X.C0w9.A06("PhoneIdRequester", r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0186, code lost:
    
        if (r11 != null) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139 A[Catch: Exception -> 0x0146, all -> 0x019a, TryCatch #2 {Exception -> 0x0146, blocks: (B:36:0x00c6, B:41:0x00e6, B:43:0x00f8, B:46:0x0100, B:49:0x0108, B:52:0x0110, B:54:0x0116, B:55:0x0129, B:56:0x012a, B:58:0x0133, B:60:0x0139, B:62:0x013d, B:63:0x0142, B:70:0x012c, B:71:0x0131, B:72:0x012f), top: B:35:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.R28, X.SP6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.C19U A00(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63000SaO.A00(java.lang.String):X.19U");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19U A01() {
        /*
            r6 = this;
            X.0jn r5 = r6.A04
            if (r5 == 0) goto L17
            X.0jd r3 = r5.A00
            monitor-enter(r3)
            android.content.SharedPreferences r2 = r3.A01     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "phone_id_synced"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            if (r0 == 0) goto L17
            goto L59
        L14:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L17:
            java.util.ArrayList r4 = r6.A02()
            java.util.List r0 = X.AbstractC63103Sd6.A00
            java.util.Iterator r3 = r0.iterator()
        L21:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r2 = r3.next()
            int r1 = r4.indexOf(r2)
            r0 = -1
            if (r1 == r0) goto L21
            r4.remove(r1)
            r0 = 0
            r4.add(r0, r2)
            goto L21
        L3a:
            java.util.Iterator r1 = r4.iterator()
        L3e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L54
            java.lang.String r0 = X.AbstractC166987dD.A1B(r1)
            X.19U r0 = r6.A00(r0)
            if (r0 == 0) goto L3e
            if (r5 == 0) goto L5f
            r5.A01()
            return r0
        L54:
            if (r5 == 0) goto L59
            r5.A01()
        L59:
            X.0jn r0 = r6.A03
            X.19U r0 = r0.A00()
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63000SaO.A01():X.19U");
    }

    public final ArrayList A02() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Context context = this.A00;
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        String packageName = context.getPackageName();
        for (PackageInfo packageInfo : installedPackages) {
            String str = packageInfo.packageName;
            if (!str.equals(packageName)) {
                java.util.Set set = C0CE.A00;
                C03190Dc c03190Dc = AbstractC62855SUc.A01;
                if (set.contains(str) && AbstractC62855SUc.A00(context, str)) {
                    A1E.add(packageInfo.packageName);
                }
            }
        }
        return A1E;
    }

    public final void A03() {
        ArrayList A02 = A02();
        C11880jn c11880jn = this.A04;
        if (c11880jn != null) {
            A02.size();
        }
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            if (A00(A1B) != null) {
                if (c11880jn != null) {
                    c11880jn.A01();
                }
            } else {
                Intent A04 = AbstractC31171DnF.A04();
                A04.setAction("com.facebook.GET_PHONE_ID");
                A04.setPackage(A1B);
                int i = 134217728;
                if (Build.VERSION.SDK_INT >= 30) {
                    i = 201326592;
                }
                Context context = this.A00;
                PendingIntent activity = PendingIntent.getActivity(context, 0, AbstractC31171DnF.A04(), i);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putParcelable("auth", activity);
                context.sendOrderedBroadcast(A04, null, new Q1m(this.A01, new R29(this.A03.A00(), A1B, "broadcasts"), this.A05), null, 1, null, A0b);
            }
        }
        if (c11880jn != null) {
            c11880jn.A01();
        }
    }
}
