package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.ListIterator;

/* renamed from: X.4Zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97414Zb {
    public static File A00;
    public static final InterfaceC09390do A01 = AbstractC09440dt.A01(C97424Zc.A00);

    public static final File A01(Context context, UserSession userSession, String str) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 2);
        File A002 = A00(context);
        if (A002 == null || (C18U.A06(C06090Tz.A05, userSession, 36317702289167844L) && !A04(str))) {
            return null;
        }
        String canonicalPath = A002.getCanonicalPath();
        String hexString = Integer.toHexString(str.hashCode());
        C14360o3.A07(hexString);
        return new File(canonicalPath, hexString);
    }

    public static final String A02(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        if (c38321qM.CZq()) {
            return c38321qM.A0C.getOrganicTrackingToken();
        }
        if (AbstractC41071vF.A0F(userSession, c38321qM) != null) {
            return AbstractC41071vF.A0F(userSession, c38321qM);
        }
        return c38321qM.getId();
    }

    public static final void A03(Context context, Bitmap bitmap, String str) {
        File[] listFiles;
        C14360o3.A0B(context, 2);
        File A002 = A00(context);
        if (A002 != null) {
            String canonicalPath = A002.getCanonicalPath();
            String hexString = Integer.toHexString(str.hashCode());
            C14360o3.A07(hexString);
            File file = new File(canonicalPath, hexString);
            File A003 = A00(context);
            if (A003 != null) {
                InterfaceC09390do interfaceC09390do = A01;
                Object value = interfaceC09390do.getValue();
                C14360o3.A07(value);
                if (((java.util.Set) value).size() > 25 && (listFiles = A003.listFiles()) != null && listFiles.length > 25) {
                    ListIterator listIterator = AbstractC009903n.A0A(new B0N(), listFiles).listIterator(12);
                    while (listIterator.hasNext()) {
                        File file2 = (File) listIterator.next();
                        file2.delete();
                        Object value2 = interfaceC09390do.getValue();
                        C14360o3.A07(value2);
                        ((java.util.Set) value2).remove(file2.getName());
                    }
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, bitmap, fileOutputStream);
                        Object value3 = interfaceC09390do.getValue();
                        C14360o3.A07(value3);
                        String name = file.getName();
                        C14360o3.A07(name);
                        ((java.util.Set) value3).add(name);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    C0K8.A0H("VideoCoverFrameCache", "Failed to save video cover frame to disk", e);
                }
            }
        }
    }

    public static final File A00(Context context) {
        File file = A00;
        if (file == null) {
            file = AbstractC25541Mj.A00(context, "coverframe", false);
            if (file != null) {
                if (!file.exists()) {
                    file.mkdirs();
                } else {
                    String[] list = file.list();
                    if (list != null) {
                        Object value = A01.getValue();
                        C14360o3.A07(value);
                        AnonymousClass016.A18((Collection) value, list);
                    }
                }
                A00 = file;
            } else {
                return null;
            }
        }
        return file;
    }

    public static final boolean A04(String str) {
        Object value = A01.getValue();
        C14360o3.A07(value);
        String hexString = Integer.toHexString(str.hashCode());
        C14360o3.A07(hexString);
        return ((java.util.Set) value).contains(hexString);
    }
}
