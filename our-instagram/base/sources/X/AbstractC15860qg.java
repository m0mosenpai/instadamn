package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.0qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15860qg {
    public static File A00;
    public static String A01;

    public static File A00(Context context, String str) {
        File file = A00;
        if (file == null) {
            file = new File(C0eT.A00(Environment.DIRECTORY_PICTURES), AbstractC13180m4.A00(context).replace(' ', '_'));
            A00 = file;
        }
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return new File(file, AbstractC13670mt.A06("%s%s%s", "IMG_", new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(new Date()), str));
    }

    public static String A02() {
        File A012 = A01(".jpg");
        if (A012 != null) {
            return A012.getAbsolutePath();
        }
        return null;
    }

    public static String A03(Context context) {
        String str = A01;
        if (str == null) {
            String A0R = AnonymousClass001.A0R("Pictures/", AbstractC13180m4.A00(context).replace(' ', '_'));
            A01 = A0R;
            return A0R;
        }
        return str;
    }

    public static File A01(String str) {
        try {
            if (!AbstractC23881Ey.A00().CHo(null, 761593505).exists()) {
                AbstractC23881Ey.A00().CHo(null, 761593505).mkdirs();
            }
            return File.createTempFile("pending_media_", str, AbstractC23881Ey.A00().CHo(null, 761593505));
        } catch (IOException e) {
            C0K8.A0F("PhotoFileUtil", "unable to create temp file", e);
            return null;
        }
    }

    public static void A04(final String str, final String str2, final WeakReference weakReference) {
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.0uv
            /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r5 = this;
                    r1 = 0
                    java.lang.String r0 = r5     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L48
                    java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L48
                    r4.<init>(r0)     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L48
                    java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
                    r3.<init>(r4)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
                    java.lang.String r1 = r6     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L46
                    java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L46
                    r0.<init>(r1)     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L46
                    boolean r1 = X.AbstractC13530mf.A0B(r0, r3)     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L46
                    com.google.common.io.Closeables.A01(r4)
                    com.google.common.io.Closeables.A01(r3)
                    goto L38
                L1f:
                    r2 = move-exception
                    goto L2a
                L21:
                    r0 = move-exception
                    r3 = r1
                    goto L4b
                L24:
                    r2 = move-exception
                    r3 = r1
                    goto L2a
                L27:
                    r2 = move-exception
                    r3 = r1
                    r4 = r1
                L2a:
                    java.lang.String r1 = "PhotoFileUtil"
                    java.lang.String r0 = "Photo copy error"
                    X.C0K8.A0H(r1, r0, r2)     // Catch: java.lang.Throwable -> L46
                    com.google.common.io.Closeables.A01(r4)
                    com.google.common.io.Closeables.A01(r3)
                    r1 = 0
                L38:
                    java.lang.ref.WeakReference r0 = r7
                    java.lang.Object r0 = r0.get()
                    X.0qf r0 = (X.InterfaceC15850qf) r0
                    if (r0 == 0) goto L45
                    r0.DYY(r1)
                L45:
                    return
                L46:
                    r0 = move-exception
                    goto L4b
                L48:
                    r0 = move-exception
                    r3 = r1
                    r4 = r1
                L4b:
                    com.google.common.io.Closeables.A01(r4)
                    com.google.common.io.Closeables.A01(r3)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C18110uv.run():void");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(74, 3, true, false);
            }
        });
    }
}
