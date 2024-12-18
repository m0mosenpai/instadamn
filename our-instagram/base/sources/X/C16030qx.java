package X;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.UUID;

/* renamed from: X.0qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16030qx {
    public static final long A01 = System.currentTimeMillis();
    public static final C16030qx A02 = new Object();
    public static final String[] A03 = {"9774d56d682e549c", "9d1d1f0dfa440886", "fc067667235b8f19"};
    public String A00;

    public final synchronized String A05(Context context) {
        String str;
        if (A03(this.A00)) {
            str = this.A00;
            str.getClass();
        } else {
            File file = new File("/mnt/sdcard/.profig.os");
            File file2 = new File(context.getFilesDir(), "INSTALLATION");
            String A012 = A01(file);
            this.A00 = A012;
            if (!A03(A012)) {
                String A013 = A01(file2);
                this.A00 = A013;
                if (A013 != null) {
                    A02(file, A013);
                }
            } else if (!file2.exists()) {
                String str2 = this.A00;
                str2.getClass();
                A02(file2, str2);
            }
            if (!A03(this.A00)) {
                String obj = UUID.randomUUID().toString();
                String[] split = obj.split("-");
                if (split.length >= 2) {
                    obj = obj.replaceFirst(split[1], AnonymousClass001.A0R(Integer.toHexString(new Random().nextInt(15)), Long.toHexString(((System.currentTimeMillis() - A01) / 1000) + 1635)));
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    obj.getClass();
                    fileOutputStream.write(obj.getBytes());
                    fileOutputStream.flush();
                    try {
                        fileOutputStream.getFD().sync();
                    } catch (IOException unused) {
                    }
                    fileOutputStream.close();
                    A02(file, obj);
                    String A014 = A01(file2);
                    if (A03(A014)) {
                        A014.getClass();
                        this.A00 = A014;
                    } else {
                        throw new RuntimeException("Failed to read installation file and create a valid UUID");
                    }
                } catch (IOException e) {
                    C0K8.A05(C16030qx.class, "Failed to generate internal installation file.", e);
                    throw new RuntimeException(e);
                }
            }
            str = this.A00;
            str.getClass();
        }
        return str;
    }

    public static final String A00(Context context) {
        String str;
        if (context != null) {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            String[] strArr = A03;
            int i = 0;
            while (!strArr[i].equalsIgnoreCase(str)) {
                i++;
                if (i >= 3) {
                    break;
                }
            }
        }
        str = "";
        return AnonymousClass001.A0R("android-", str);
    }

    public static void A02(File file, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException unused) {
            }
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
    }

    public static boolean A03(String str) {
        if (str != null && !TextUtils.isEmpty(str) && str.matches("[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}")) {
            return true;
        }
        return false;
    }

    public static String A01(File file) {
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    byte[] bArr = new byte[(int) randomAccessFile.length()];
                    randomAccessFile.readFully(bArr);
                    randomAccessFile.close();
                    return new String(bArr);
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public final String A04(Context context) {
        try {
            return A05(context);
        } catch (RuntimeException e) {
            C0K8.A08(C16030qx.class, "Failed to get custom UUID", e, new Object[0]);
            return null;
        }
    }
}
