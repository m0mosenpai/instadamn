package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class AMc {
    public static final File A00(C49602Pt c49602Pt, File file) {
        C14360o3.A0B(c49602Pt, 0);
        try {
            String A04 = A04(file);
            if (!c49602Pt.A01) {
                AbstractC13530mf.A08(new File(c49602Pt.A04, "panavideo"));
                c49602Pt.A01 = true;
            }
            File createTempFile = File.createTempFile(CacheBehaviorLogger.SOURCE, A04, c49602Pt.A07);
            C14360o3.A07(createTempFile);
            MT6.A04(file, createTempFile, true);
            return createTempFile;
        } catch (IOException e) {
            AbstractC12120kG.A07("ClipsFileUtil", AbstractC166997dE.A0z("Unable to copy source video file to clips panavideo source directory: fileLocation = %s", AbstractC166997dE.A1b(file.getAbsolutePath(), 1)), e);
            return file;
        }
    }

    public static final File A02(C49602Pt c49602Pt, String str) {
        Object c09540e5;
        C14360o3.A0B(c49602Pt, 0);
        Object obj = null;
        if (str != null) {
            try {
                c09540e5 = new File(c49602Pt.A01(), str);
            } catch (Throwable th) {
                c09540e5 = new C09540e5(th);
            }
        } else {
            c09540e5 = null;
        }
        if (!(c09540e5 instanceof C09540e5)) {
            obj = c09540e5;
        }
        File file = (File) obj;
        if (file != null) {
            AbstractC189888b7.A00(file);
        }
        return file;
    }

    public static final synchronized File A01(C49602Pt c49602Pt, File file, String str) {
        String A0T;
        File file2;
        synchronized (AMc.class) {
            C14360o3.A0B(str, 2);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                File file3 = new File(c49602Pt.C5c(), parentFile.getName());
                try {
                    AbstractC189888b7.A00(file3);
                    if (AbstractC167007dF.A1O(MT6.A01(file).length())) {
                        A0T = AnonymousClass001.A0j(MT6.A02(file), str, MT6.A01(file), '-', '.');
                    } else {
                        A0T = AnonymousClass001.A0T(MT6.A02(file), str, '-');
                    }
                    file2 = new File(file3, A0T);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return file2;
    }

    public static final File A03(C49602Pt c49602Pt, String str, String str2, String str3) {
        AbstractC167017dG.A1N(c49602Pt, str);
        File file = new File(c49602Pt.A01(), str);
        AbstractC189888b7.A00(file);
        File createTempFile = File.createTempFile(AnonymousClass001.A0R("source_", str3), str2, file);
        C14360o3.A07(createTempFile);
        return createTempFile;
    }

    public static final String A04(File file) {
        String path = file.getPath();
        C14360o3.A0A(path);
        C14360o3.A0B(path, 0);
        int A05 = AbstractC001900j.A05(path, '.', path.length() - 1);
        if (A05 >= 0) {
            String substring = path.substring(A05);
            C14360o3.A07(substring);
            return substring;
        }
        return "";
    }

    public static final void A05(UserSession userSession, C49602Pt c49602Pt) {
        PendingMediaStore A00 = C25A.A00(userSession);
        synchronized (A00) {
            C14120nc.A00().ATO(new NGW(c49602Pt, A00.A06()));
        }
    }
}
