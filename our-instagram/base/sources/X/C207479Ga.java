package X;

import com.facebook.stash.core.Stash;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Ga, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207479Ga {
    public final Stash A00;
    public final UserSession A01;

    public C207479Ga(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        C1M7 A01 = C1M7.A01();
        C1MC c1mc = new C1MC();
        c1mc.A05 = "<override-ignore>";
        c1mc.A02 = new C1FC(TimeUnit.MINUTES.toSeconds(C18U.A01(C06090Tz.A05, userSession, 36592099160228121L)), false);
        this.A00 = A01.A06(A01.A08(c1mc.A00(), 106224433), 106224433);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.user.model.User A00(java.lang.String r7) {
        /*
            r6 = this;
            r4 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r4)
            if (r0 == 0) goto L10
            r1 = -1511671905(0xffffffffa5e5b79f, float:-3.9849594E-16)
            java.lang.String r0 = "ReelTrayPogUserCache.readUser"
            X.C0fO.A01(r0, r1)
        L10:
            java.lang.String r2 = "ReelTrayPogUserCache.readUser, userId: %s"
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L81
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch: java.lang.Throwable -> L81
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> L81
            com.facebook.stash.core.Stash r0 = r6.A00     // Catch: java.lang.Throwable -> L81
            byte[] r3 = r0.readResourceToMemory(r7)     // Catch: java.lang.Throwable -> L81
            boolean r0 = com.facebook.systrace.Systrace.A0E(r4)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L36
            r1 = 1468177928(0x57829e08, float:2.872305E14)
            java.lang.String r0 = "ReelTrayPerPogCache.deserializeFromBytes"
            X.C0fO.A01(r0, r1)     // Catch: java.lang.Throwable -> L81
        L36:
            r2 = 0
            if (r3 != 0) goto L43
            boolean r0 = com.facebook.systrace.Systrace.A0E(r4)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L74
            r0 = 250577125(0xeef80e5, float:5.904217E-30)
            goto L71
        L43:
            java.nio.charset.Charset r0 = X.C15W.A05     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            com.instagram.user.model.User r2 = X.AbstractC38851rI.A04(r1)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            boolean r0 = com.facebook.systrace.Systrace.A0E(r4)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L74
            r0 = 1921085586(0x72817092, float:5.127636E30)
            goto L71
        L5a:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r4)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L67
            r0 = 1278295993(0x4c313fb9, float:4.646474E7)
            X.C0fO.A00(r0)     // Catch: java.lang.Throwable -> L81
        L67:
            throw r1     // Catch: java.lang.Throwable -> L81
        L68:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r4)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L74
            r0 = 1086157945(0x40bd7479, float:5.920468)
        L71:
            X.C0fO.A00(r0)     // Catch: java.lang.Throwable -> L81
        L74:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r4)
            if (r0 == 0) goto L80
            r0 = 971830455(0x39ecf4b7, float:4.5195755E-4)
            X.C0fO.A00(r0)
        L80:
            return r2
        L81:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r4)
            if (r0 == 0) goto L8e
            r0 = 123063675(0x755cd7b, float:1.6084724E-34)
            X.C0fO.A00(r0)
        L8e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207479Ga.A00(java.lang.String):com.instagram.user.model.User");
    }
}
