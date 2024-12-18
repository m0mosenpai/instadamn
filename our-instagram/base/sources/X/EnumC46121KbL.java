package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.KbL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class EnumC46121KbL {
    public static final EnumC46121KbL A00 = new K58(1);
    public static final EnumC46121KbL A01 = new K58(2);
    public static final EnumC46121KbL A02;

    static {
        new K58(3);
        new K58(4);
        new K58(5);
        new K58(6);
        new K58(7);
        new K58(8);
        new K58(9);
        A02 = new K58(0);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.11N, X.K55] */
    public final K55 A00(Context context) {
        File file;
        try {
            switch (((K58) this).A00) {
                case 0:
                    file = new File("/");
                    break;
                case 1:
                    file = context.getCacheDir();
                    break;
                case 2:
                    file = context.getFilesDir();
                    break;
                case 3:
                    file = context.getExternalFilesDir(null);
                    if (file == null) {
                        throw new SecurityException("Your scope does not exist on device yet.");
                    }
                    break;
                case 4:
                    file = context.getExternalFilesDir(Environment.DIRECTORY_DCIM);
                    if (file == null) {
                        throw new SecurityException("Your scope does not exist on device yet.");
                    }
                    break;
                case 5:
                    file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                    if (file == null) {
                        throw new SecurityException("Your scope does not exist on device yet.");
                    }
                    break;
                case 6:
                    file = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                    if (file == null) {
                        throw new SecurityException("Your scope does not exist on device yet.");
                    }
                    break;
                case 7:
                    file = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
                    if (file == null) {
                        throw new SecurityException("Your scope does not exist on device yet.");
                    }
                    break;
                case 8:
                    file = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                    if (file == null) {
                        throw new SecurityException("Your scope does not exist on device yet.");
                    }
                    break;
                default:
                    file = context.getExternalCacheDir();
                    if (file == null) {
                        throw new SecurityException("Your scope does not exist on device yet.");
                    }
                    break;
            }
            return new C11N(file.getCanonicalPath());
        } catch (IOException unused) {
            throw new SecurityException("Cannot resolve the scope's path with passed in context.");
        }
    }

    public EnumC46121KbL(String str, int i) {
    }
}
