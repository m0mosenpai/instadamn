package X;

import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class KMN extends AbstractRunnableC14200nk {
    public final /* synthetic */ C28741aC A00;
    public final /* synthetic */ DirectThreadKey A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMN(C28741aC c28741aC, DirectThreadKey directThreadKey, String str, String str2) {
        super(521, 4, false, false);
        this.A00 = c28741aC;
        this.A01 = directThreadKey;
        this.A03 = str;
        this.A02 = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            X.1aC r1 = r8.A00
            com.instagram.model.direct.DirectThreadKey r2 = r8.A01
            java.lang.String r5 = r8.A03
            java.lang.String r4 = r8.A02
            X.2Qc r7 = X.C49682Qb.A06
            boolean r0 = r7.A03()
            if (r0 != 0) goto L81
            android.os.SystemClock.uptimeMillis()
            android.database.sqlite.SQLiteDatabase r6 = X.C28741aC.A00(r1)
            if (r6 == 0) goto L81
            com.instagram.common.session.UserSession r3 = r1.A01
            X.LAB r1 = X.AbstractC47001KqK.A00(r3)
            X.0e4 r0 = X.AbstractC166987dD.A1L(r5, r4)
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
            r1.A04(r0)
            r0 = -328781671(0xffffffffec673099, float:-1.11796544E27)
            X.C0fW.A01(r6, r0)
            X.2SB r0 = X.C2SP.A00(r3)     // Catch: java.lang.IllegalStateException -> L3b android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L7c
            r0.A0M(r2, r5, r4)     // Catch: java.lang.IllegalStateException -> L3b android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L7c
            r6.setTransactionSuccessful()     // Catch: java.lang.IllegalStateException -> L3b android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L7c
            goto L60
        L3b:
            r2 = move-exception
            goto L4e
        L3d:
            r2 = move-exception
            r7.A02(r2)     // Catch: java.lang.Throwable -> L7c
            X.LAB r1 = X.AbstractC47001KqK.A00(r3)     // Catch: java.lang.Throwable -> L7c
            X.0e4 r0 = X.AbstractC166987dD.A1L(r5, r4)     // Catch: java.lang.Throwable -> L7c
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)     // Catch: java.lang.Throwable -> L7c
            goto L5d
        L4e:
            r7.A02(r2)     // Catch: java.lang.Throwable -> L7c
            X.LAB r1 = X.AbstractC47001KqK.A00(r3)     // Catch: java.lang.Throwable -> L7c
            X.0e4 r0 = X.AbstractC166987dD.A1L(r5, r4)     // Catch: java.lang.Throwable -> L7c
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)     // Catch: java.lang.Throwable -> L7c
        L5d:
            r1.A01(r2, r0)     // Catch: java.lang.Throwable -> L7c
        L60:
            X.C4GN.A00(r6)
            boolean r0 = r7.A03()
            if (r0 != 0) goto L78
            X.LAB r1 = X.AbstractC47001KqK.A00(r3)
            X.0e4 r0 = X.AbstractC166987dD.A1L(r5, r4)
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
            r1.A03(r0)
        L78:
            android.os.SystemClock.uptimeMillis()
            return
        L7c:
            r0 = move-exception
            X.C4GN.A00(r6)
            throw r0
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMN.run():void");
    }
}
