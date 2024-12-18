package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MWu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50633MWu {
    public static final long A00 = TimeUnit.MINUTES.toMillis(20);

    public static C121275eQ A00(Context context, UserSession userSession, C38321qM c38321qM, String str) {
        return A03(context, userSession, A05(context, c38321qM, str, false, false));
    }

    public static C121275eQ A04(Context context, UserSession userSession, OUQ ouq, long j, boolean z) {
        return new C121275eQ(new PUR(context, userSession, ouq, ouq.A01, ouq.A00, j, z), 483);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OUQ A06(com.instagram.model.mediasize.ExtendedImageUrl r6, com.instagram.music.common.model.MusicOverlayStickerModel r7, X.C75363a3 r8, java.lang.String r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            r5 = r13
            if (r13 == 0) goto L2b
            com.instagram.model.mediasize.VideoUrlImpl r0 = X.AbstractC88593xJ.A00(r8)
            r0.getClass()
            X.17b r0 = X.C3WL.A00(r0)
            X.C14360o3.A0A(r0)
            com.instagram.model.mediasize.VideoUrlImpl r0 = (com.instagram.model.mediasize.VideoUrlImpl) r0
            java.lang.String r1 = r0.A06
            r3 = 0
            r4 = 0
        L17:
            if (r10 != 0) goto L20
            boolean r0 = X.AbstractC101614hW.A0D(r7)
            r7 = 1
            if (r0 == 0) goto L21
        L20:
            r7 = 0
        L21:
            r6 = 0
            X.OUQ r0 = new X.OUQ
            r2 = r9
            r9 = r11
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L2b:
            com.instagram.common.typedurl.ImageUrl r0 = X.AbstractC59522nv.A00(r6)
            java.lang.String r1 = r0.getUrl()
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50633MWu.A06(com.instagram.model.mediasize.ExtendedImageUrl, com.instagram.music.common.model.MusicOverlayStickerModel, X.3a3, java.lang.String, boolean, boolean, boolean, boolean):X.OUQ");
    }

    public static C121275eQ A01(Context context, UserSession userSession, C7Q5 c7q5) {
        String str;
        String A002 = AbstractC43591JPw.A00(608);
        boolean A01 = c7q5.A01();
        if (A01) {
            str = c7q5.A05;
        } else {
            str = c7q5.A04;
        }
        List list = c7q5.A07;
        if (list == null) {
            list = Collections.emptyList();
        }
        return A04(context, userSession, new OUQ(str, A002, 0, 0, A01, true, !AbstractC101614hW.A0D(AbstractC101614hW.A05(list)), false, false), -1L, true);
    }

    public static C121275eQ A03(Context context, UserSession userSession, OUQ ouq) {
        return A04(context, userSession, ouq, -1L, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r13 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r1 = r10.A1r(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        return A06(r1, X.AbstractC101614hW.A03(null, r10, null), r3, r11, r12, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r1 = r10.A1q(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0010, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (X.AbstractC121575f6.A09(r1) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r0 = r1.B9a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0.isEmpty() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r8 = r10.Cff();
        r3 = r10.CFR();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OUQ A05(android.content.Context r9, X.C38321qM r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            X.1rF r0 = r10.A0C
            com.instagram.feed.media.CreativeConfigIntf r1 = r0.Asm()
            if (r1 == 0) goto Lf
            boolean r0 = X.AbstractC121575f6.A09(r1)
            r7 = 1
            if (r0 != 0) goto L12
        Lf:
            r7 = 0
            if (r1 == 0) goto L1f
        L12:
            java.util.List r0 = r1.B9a()
            if (r0 == 0) goto L1f
            boolean r0 = r0.isEmpty()
            r6 = 1
            if (r0 == 0) goto L20
        L1f:
            r6 = 0
        L20:
            boolean r8 = r10.Cff()
            X.3a3 r3 = r10.CFR()
            if (r13 == 0) goto L3e
            r0 = 0
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r10.A1r(r0)
        L2f:
            r1.getClass()
            r0 = 0
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = X.AbstractC101614hW.A03(r0, r10, r0)
            r4 = r11
            r5 = r12
            X.OUQ r0 = A06(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L3e:
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r10.A1q(r9)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50633MWu.A05(android.content.Context, X.1qM, java.lang.String, boolean, boolean):X.OUQ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r2.isEmpty() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r0.isEmpty() != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OUQ A07(X.C105814ps r12, java.lang.String r13) {
        /*
            X.47Z r3 = r12.A00
            boolean r8 = r3.A11()
            if (r8 == 0) goto L3d
            java.lang.String r4 = r3.A3V
        La:
            r6 = 0
            java.util.List r1 = r3.A4b
            X.48r r0 = X.AbstractC50710Ma7.A00
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A02(r1)
            boolean r0 = X.AbstractC101614hW.A0D(r0)
            r10 = r0 ^ 1
            java.util.List r0 = r3.A4S
            if (r0 == 0) goto L47
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r0.iterator()
        L25:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r1.next()
            X.OTK r0 = (X.OTK) r0
            com.instagram.api.schemas.CameraTool r0 = r0.A00
            X.9H2 r0 = X.AbstractC207699Gz.A00(r0)
            if (r0 == 0) goto L25
            r2.add(r0)
            goto L25
        L3d:
            java.lang.String r4 = r3.A33
            goto La
        L40:
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L48
        L47:
            r0 = 1
        L48:
            r11 = r0 ^ 1
            java.util.List r0 = r3.A4S
            if (r0 == 0) goto L55
            boolean r0 = r0.isEmpty()
            r12 = 1
            if (r0 == 0) goto L56
        L55:
            r12 = 0
        L56:
            r9 = 1
            X.OUQ r3 = new X.OUQ
            r5 = r13
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50633MWu.A07(X.4ps, java.lang.String):X.OUQ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    public static File A08(AbstractC12990ll abstractC12990ll, File file, String str, long j) {
        String canonicalPath;
        C4J7 A08;
        long j2 = "This operation can't be run on UI thread.";
        C11T.A05("This operation can't be run on UI thread.");
        File file2 = null;
        try {
            j2 = j;
            C2n4 E3L = C2n4.A09.E3L(str);
            C1QY A002 = MSY.A0J().A00();
            if (j != -1) {
                A08 = C14M.A03().A07(null, A002, E3L, abstractC12990ll, null, 0L, j);
            } else {
                A08 = C14M.A03().A08(A002, E3L, abstractC12990ll);
            }
            if (file != null) {
                try {
                    if (!AbstractC13530mf.A0B(file, A08.A02.AjT()) && abstractC12990ll != null) {
                        try {
                            C0f5 AEp = C18950wb.A01.AEp("copyFile failed", 817899034);
                            AEp.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A0R("saveFile=", file.getCanonicalPath()));
                            AEp.ABV("maxByteRange", j2);
                            AEp.ABW("videoUrl", str);
                            AEp.report();
                        } catch (Throwable th) {
                            th = th;
                            file2 = file;
                            try {
                                A08.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    }
                    file2 = file;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            A08.close();
            return file2;
        } catch (IOException e) {
            if (abstractC12990ll != null) {
                try {
                    C0f5 AEp2 = C18950wb.A01.AEp("IOException", 817899034);
                    if (file == null) {
                        canonicalPath = "null";
                    } else {
                        canonicalPath = file.getCanonicalPath();
                    }
                    AEp2.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A0R("saveFile=", canonicalPath));
                    AEp2.ABV("maxByteRange", j2);
                    AbstractC167007dF.A15(AEp2, "videoUrl", str, e);
                    return file2;
                } catch (IOException unused) {
                    return file2;
                }
            }
            return file2;
        }
    }

    public static void A09(Context context, File file) {
        if (context != null) {
            Intent intent = new Intent(AbstractC43591JPw.A00(751));
            intent.setData(android.net.Uri.fromFile(file));
            context.sendBroadcast(intent);
            return;
        }
        throw AbstractC166987dD.A12("null arguments");
    }

    public static C121275eQ A02(Context context, UserSession userSession, C41181vS c41181vS, String str, boolean z, boolean z2) {
        OUQ A05;
        if (c41181vS.A1Z()) {
            C105814ps c105814ps = c41181vS.A0d;
            c105814ps.getClass();
            A05 = A07(c105814ps, str);
        } else {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            A05 = A05(context, c38321qM, str, z2, false);
        }
        return A04(context, userSession, A05, -1L, z);
    }
}
