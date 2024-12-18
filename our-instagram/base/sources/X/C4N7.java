package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.DeadObjectException;
import java.util.Map;

/* renamed from: X.4N7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4N7 implements C4N8 {
    public final Context A00;
    public final SharedPreferences A01;

    @Override // X.C4N8
    public final boolean contains(String str) {
        C14360o3.A0B(str, 0);
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            C0K8.A0D("SharedPreferencesManager", "sharedPreferences is null, returning false");
            return false;
        }
        return sharedPreferences.contains(str);
    }

    @Override // X.C4N8
    public final long getLong(String str, long j) {
        C14360o3.A0B(str, 0);
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            C0K8.A0D("SharedPreferencesManager", "sharedPreferences is null, returning default long value");
            return j;
        }
        return sharedPreferences.getLong(str, j);
    }

    @Override // X.C4N8
    public final String getString(String str, String str2) {
        C14360o3.A0B(str, 0);
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            C0K8.A0D("SharedPreferencesManager", "sharedPreferences is null, returning default string value");
        } else {
            String string = sharedPreferences.getString(str, str2);
            if (string != null) {
                return string;
            }
        }
        return str2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.91M, java.lang.Object] */
    @Override // X.C4N8
    public final C91M ARA() {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            C0K8.A0D("SharedPreferencesManager", "sharedPreferences is null, returning NoOpEditorImpl");
            return new Object();
        }
        final SharedPreferences.Editor edit = sharedPreferences.edit();
        C14360o3.A07(edit);
        return new C91M(edit) { // from class: X.91L
            public final SharedPreferences.Editor A00;

            @Override // X.C91M
            public final C91M E75(String str, boolean z) {
                C14360o3.A0B(str, 0);
                this.A00.putBoolean(str, z);
                return this;
            }

            @Override // X.C91M
            public final C91M E7B(String str, int i) {
                C14360o3.A0B(str, 0);
                this.A00.putInt(str, i);
                return this;
            }

            @Override // X.C91M
            public final C91M E7E(String str, long j) {
                C14360o3.A0B(str, 0);
                this.A00.putLong(str, j);
                return this;
            }

            @Override // X.C91M
            public final C91M E7I(String str, String str2) {
                C14360o3.A0B(str, 0);
                C14360o3.A0B(str2, 1);
                this.A00.putString(str, str2);
                return this;
            }

            @Override // X.C91M
            public final C91M EEh(String str) {
                C14360o3.A0B(str, 0);
                this.A00.remove(str);
                return this;
            }

            @Override // X.C91M
            public final C91M AHU() {
                this.A00.clear();
                return this;
            }

            @Override // X.C91M
            public final void AIY() {
                this.A00.apply();
            }

            @Override // X.C91M
            public final void AIZ() {
                this.A00.apply();
            }

            @Override // X.C91M
            public final void AIa(A81 a81) {
                this.A00.apply();
                C23483Aaw c23483Aaw = a81.A01;
                c23483Aaw.A00 = a81.A00;
                c23483Aaw.A01 = true;
                a81.A02.countDown();
            }

            @Override // X.C91M
            public final void AIb(String str, String str2) {
                this.A00.apply();
            }

            {
                this.A00 = edit;
            }
        };
    }

    @Override // X.C4N8
    public final Map getAll() {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            C0K8.A0D("SharedPreferencesManager", "sharedPreferences is null, returning empty map");
            return AbstractC06930Yk.A0E();
        }
        Map<String, ?> all = sharedPreferences.getAll();
        C14360o3.A07(all);
        return all;
    }

    @Override // X.C4N8
    public final boolean getBoolean(String str, boolean z) {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            C0K8.A0D("SharedPreferencesManager", "sharedPreferences is null, returning default boolean value");
            return z;
        }
        return sharedPreferences.getBoolean(str, z);
    }

    @Override // X.C4N8
    public final int getInt(String str, int i) {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            C0K8.A0D("SharedPreferencesManager", "sharedPreferences is null, returning default int value");
            return i;
        }
        return sharedPreferences.getInt(str, i);
    }

    public C4N7(Context context, String str, boolean z) {
        SharedPreferences sharedPreferences;
        this.A00 = context;
        try {
            sharedPreferences = context.getSharedPreferences(str, z ? 4 : 0);
            C14360o3.A07(sharedPreferences);
        } catch (DeadObjectException e) {
            C0K8.A0H("SharedPreferencesManager", "DeadObjectException initializing SharedPreferences", e);
            sharedPreferences = null;
        }
        this.A01 = sharedPreferences;
    }
}
