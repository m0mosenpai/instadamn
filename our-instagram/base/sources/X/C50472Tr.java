package X;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.2Tr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50472Tr {
    public static String A00;
    public static String A01;
    public static final C50472Tr A02 = new Object();

    private final synchronized long A00(String str) {
        long j;
        try {
            File file = new File(str, AnonymousClass001.A0R(Environment.DIRECTORY_DCIM, "/Camera"));
            A00 = file.getAbsolutePath();
            file.mkdirs();
            if (file.isDirectory() && file.canWrite()) {
                StatFs statFs = new StatFs(str);
                j = statFs.getAvailableBlocks() * statFs.getBlockSize();
            } else {
                j = -1;
            }
        } catch (Exception e) {
            Object[] objArr = {str};
            if (C0K8.A01.isLoggable(5)) {
                C0K8.A0H(C50472Tr.class.getSimpleName(), StringFormatUtil.formatStrLocaleSafe("Failed to access external storage %s", objArr), e);
            }
            j = -3;
        }
        return j;
    }

    public static final String A03(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        if (AbstractC23021Ah.A00(userSession).A1x()) {
            return AnonymousClass001.A0R(str, ".jpg");
        }
        return "temp.jpg";
    }

    public static final synchronized String A01() {
        String str;
        synchronized (C50472Tr.class) {
            str = A01;
            if (str == null) {
                C14360o3.A0F("tempDirectory");
                throw C00O.createAndThrow();
            }
        }
        return str;
    }

    public static final synchronized String A02(Context context, boolean z) {
        String str;
        synchronized (C50472Tr.class) {
            if (z) {
                if (Build.VERSION.SDK_INT >= 33 || AbstractC23451Ch.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (A00 == null) {
                        A04();
                    }
                    str = A00;
                    if (str == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            str = A01();
        }
        return str;
    }

    public static final synchronized void A04() {
        List list;
        synchronized (C50472Tr.class) {
            synchronized (C0eT.class) {
            }
            String path = Environment.getExternalStorageDirectory().getPath();
            long j = -1;
            if ("mounted".equals(Environment.getExternalStorageState())) {
                C50472Tr c50472Tr = A02;
                C14360o3.A0A(path);
                j = c50472Tr.A00(path);
                if (j > 50000000) {
                }
            }
            String str = System.getenv("SECONDARY_STORAGE");
            if (str != null) {
                List A03 = new C11L(":").A03(str);
                if (!A03.isEmpty()) {
                    ListIterator listIterator = A03.listIterator(A03.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = C16930sl.A00;
                for (String str2 : (String[]) list.toArray(new String[0])) {
                    long A002 = A02.A00(str2);
                    if (A002 > 50000000) {
                        break;
                    }
                    if (A002 > j) {
                        path = str2;
                        j = A002;
                    }
                }
            }
            C14360o3.A0A(path);
            A00 = new File(path, AnonymousClass001.A0R(Environment.DIRECTORY_DCIM, "/Camera")).getAbsolutePath();
        }
    }
}
