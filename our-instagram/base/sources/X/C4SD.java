package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.4SD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SD implements C26H, InterfaceC13000lm, InterfaceC75483aF {
    public WeakReference A00 = new WeakReference(null);
    public CQ4 A01;
    public final UserSession A02;
    public final String A03;

    /* JADX WARN: Removed duplicated region for block: B:41:0x008c A[Catch: IOException -> 0x00a8, TRY_ENTER, TryCatch #1 {IOException -> 0x00a8, blocks: (B:3:0x0008, B:6:0x0010, B:7:0x001b, B:9:0x0021, B:19:0x0055, B:21:0x0058, B:24:0x0066, B:30:0x005d, B:41:0x008c, B:44:0x0091, B:49:0x0096, B:50:0x00a3, B:62:0x00a4), top: B:2:0x0008, inners: #2, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // X.C26H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map B3s(com.instagram.common.session.UserSession r12, java.io.File r13) {
        /*
            r11 = this;
            r0 = 0
            X.C14360o3.A0B(r12, r0)
            r0 = 1
            X.C14360o3.A0B(r13, r0)
            X.CQ4 r1 = r11.A01     // Catch: java.io.IOException -> La8
            com.instagram.common.session.UserSession r0 = r11.A02     // Catch: java.io.IOException -> La8
            if (r12 != r0) goto Lb0
            if (r1 == 0) goto Lb0
            java.util.HashMap r8 = new java.util.HashMap     // Catch: java.io.IOException -> La8
            r8.<init>()     // Catch: java.io.IOException -> La8
            java.util.List r0 = r1.A00     // Catch: java.io.IOException -> La8
            java.util.Iterator r10 = r0.iterator()     // Catch: java.io.IOException -> La8
        L1b:
            boolean r0 = r10.hasNext()     // Catch: java.io.IOException -> La8
            if (r0 == 0) goto La4
            java.lang.Object r2 = r10.next()     // Catch: java.io.IOException -> La8
            X.AAy r2 = (X.C22974AAy) r2     // Catch: java.io.IOException -> La8
            java.lang.String r4 = "Exception closing stream %s"
            java.lang.String r3 = "FileAttachmentEntry"
            r9 = 0
            r0 = 556(0x22c, float:7.79E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            r1.<init>(r13, r0)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            android.net.Uri r7 = android.net.Uri.fromFile(r1)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            java.lang.String r2 = r2.A00     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L89
            int r1 = r2.length()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L89
            if (r1 == 0) goto L55
            r5.print(r2)     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L89
        L55:
            r5.close()     // Catch: java.io.IOException -> La8
            r6.close()     // Catch: java.io.IOException -> L5c java.io.IOException -> La8
            goto L64
        L5c:
            r1 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}     // Catch: java.io.IOException -> La8
            X.C0K8.A0O(r3, r4, r1)     // Catch: java.io.IOException -> La8
        L64:
            if (r7 == 0) goto L1b
            r8.put(r0, r7)     // Catch: java.io.IOException -> La8
            goto L1b
        L6a:
            r2 = move-exception
            goto L91
        L6c:
            r2 = move-exception
            r5 = r9
            goto L70
        L6f:
            r2 = move-exception
        L70:
            r9 = r6
            goto L76
        L72:
            r2 = move-exception
            goto La3
        L74:
            r2 = move-exception
            r5 = r9
        L76:
            java.lang.String r1 = "Exception saving trace %s"
            r0 = 556(0x22c, float:7.79E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch: java.lang.Throwable -> L86
            X.C0K8.A0O(r3, r1, r0)     // Catch: java.lang.Throwable -> L86
            throw r2     // Catch: java.lang.Throwable -> L86
        L86:
            r2 = move-exception
            r6 = r9
            goto L8a
        L89:
            r2 = move-exception
        L8a:
            if (r5 == 0) goto L8f
            r5.close()     // Catch: java.io.IOException -> La8
        L8f:
            if (r6 == 0) goto La3
        L91:
            r6.close()     // Catch: java.io.IOException -> L95 java.io.IOException -> La8
            goto La3
        L95:
            r1 = move-exception
            r0 = 556(0x22c, float:7.79E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)     // Catch: java.io.IOException -> La8
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch: java.io.IOException -> La8
            X.C0K8.A0O(r3, r4, r0)     // Catch: java.io.IOException -> La8
        La3:
            throw r2     // Catch: java.io.IOException -> La8
        La4:
            r0 = 0
            r11.A01 = r0     // Catch: java.io.IOException -> La8
            return r8
        La8:
            r2 = move-exception
            java.lang.String r1 = "VideoPlayerFlytrapExtrasProvider"
            java.lang.String r0 = "Failed to create video snapshot files to be included in bug report!"
            X.C0K8.A0F(r1, r0, r2)
        Lb0:
            X.0sk r8 = X.AbstractC06930Yk.A0E()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4SD.B3s(com.instagram.common.session.UserSession, java.io.File):java.util.Map");
    }

    @Override // X.C26H
    public final boolean CLD(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        if (userSession == this.A02 && this.A01 != null) {
            return true;
        }
        return false;
    }

    @Override // X.C26H
    public final void Ega(long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x04a7, code lost:
    
        if (r1 == false) goto L182;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // X.InterfaceC75483aF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map B3w() {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4SD.B3w():java.util.Map");
    }

    @Override // X.C26H
    public final String getTag() {
        return this.A03;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC75493aG.A00(this.A02).A00(this);
        this.A01 = null;
    }

    public C4SD(UserSession userSession) {
        this.A02 = userSession;
        C75503aH A00 = AbstractC75493aG.A00(userSession);
        A00.A00.add(new WeakReference(this));
        C25O.A00(userSession).A00(this);
        this.A03 = "VideoPlayerFlytrapExtrasProvider";
    }
}
