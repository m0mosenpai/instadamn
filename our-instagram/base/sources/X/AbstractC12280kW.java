package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import java.io.File;

/* renamed from: X.0kW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12280kW {
    public static final C11O Companion = new Object();
    public static final long MISSING_VALUE = -1;
    public static String _processName;
    public final Context context;

    public AbstractC12280kW(Context context) {
        C14360o3.A0B(context, 1);
        this.context = context;
        AbstractC12960li.A00.A00 = context;
    }

    public File getCacheDir(File file) {
        C14360o3.A0B(file, 0);
        return file;
    }

    public File getDirOverride(String str, int i) {
        return null;
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        C14360o3.A0B(str, 0);
        Context context = this.context;
        if (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, i);
        C14360o3.A0A(sharedPreferences);
        return sharedPreferences;
    }

    public void onConfigurationChangedCallback(Configuration configuration) {
    }

    public abstract void onCreate(String str, long j, long j2, long j3, long j4);
}
