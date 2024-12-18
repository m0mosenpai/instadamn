package X;

import android.content.SharedPreferences;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.systrace.Systrace;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.0tT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17320tT implements InterfaceC19630xq {
    public static String A05 = "";
    public static int A06;
    public static LightweightQuickPerformanceLogger A07;
    public static final C19570xk A08 = new Object();
    public static final Random A09 = new Random();
    public int A00;
    public final java.util.Set A01;
    public final SharedPreferences.OnSharedPreferenceChangeListener A02;
    public final SharedPreferences A03;
    public final String A04;

    public C17320tT(SharedPreferences sharedPreferences, String str) {
        C14360o3.A0B(sharedPreferences, 1);
        this.A03 = sharedPreferences;
        this.A04 = str;
        this.A00 = 3;
        this.A01 = new CopyOnWriteArraySet();
        this.A02 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: X.0xl
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str2) {
                C17320tT c17320tT = C17320tT.this;
                Iterator it = c17320tT.A01.iterator();
                while (it.hasNext()) {
                    ((InterfaceC19620xp) it.next()).onChanged(c17320tT, str2);
                }
            }
        };
    }

    @Override // X.InterfaceC19630xq
    public final /* synthetic */ java.util.Set C2v(String str) {
        C14360o3.A0B(str, 1);
        java.util.Set stringSet = getStringSet(str, null);
        if (stringSet == null) {
            return C16910sj.A00;
        }
        return stringSet;
    }

    @Override // X.InterfaceC19630xq
    public final void EDW(InterfaceC19620xp interfaceC19620xp) {
        C14360o3.A0B(interfaceC19620xp, 0);
        java.util.Set set = this.A01;
        synchronized (set) {
            set.add(interfaceC19620xp);
            this.A03.registerOnSharedPreferenceChangeListener(this.A02);
        }
    }

    @Override // X.InterfaceC19630xq
    public final void F9e(InterfaceC19620xp interfaceC19620xp) {
        C14360o3.A0B(interfaceC19620xp, 0);
        java.util.Set set = this.A01;
        synchronized (set) {
            set.remove(interfaceC19620xp);
            if (set.isEmpty()) {
                this.A03.unregisterOnSharedPreferenceChangeListener(this.A02);
            }
        }
    }

    @Override // X.InterfaceC19630xq
    public final InterfaceC19610xo ARD() {
        final String str = this.A04;
        String A0S = AnonymousClass001.A0S("IgSharedPreferences.edit(", str, ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0S, 1359138844);
        }
        try {
            Integer A00 = C19570xk.A00("edit", str, null, 303175565);
            final SharedPreferences.Editor edit = this.A03.edit();
            C14360o3.A07(edit);
            InterfaceC19610xo interfaceC19610xo = new InterfaceC19610xo(edit, str) { // from class: X.0tS
                public final SharedPreferences.Editor A00;
                public final String A01;

                @Override // X.InterfaceC19610xo
                public final InterfaceC19610xo AHW() {
                    Integer A002 = C19570xk.A00(QuickExperimentDumperPlugin.CLEAR_CMD, this.A01, null, 303184728);
                    this.A00.clear();
                    if (A002 != null) {
                        C19570xk.A02(303184728, A002.intValue());
                    }
                    return this;
                }

                @Override // X.InterfaceC19610xo
                public final InterfaceC19610xo E77(String str2, boolean z) {
                    Integer A002 = C19570xk.A00("putBoolean", this.A01, str2, 303184728);
                    this.A00.putBoolean(str2, z);
                    if (A002 != null) {
                        C19570xk.A02(303184728, A002.intValue());
                    }
                    return this;
                }

                @Override // X.InterfaceC19610xo
                public final InterfaceC19610xo E7A(String str2, float f) {
                    Integer A002 = C19570xk.A00("putFloat", this.A01, str2, 303184728);
                    this.A00.putFloat(str2, f);
                    if (A002 != null) {
                        C19570xk.A02(303184728, A002.intValue());
                    }
                    return this;
                }

                @Override // X.InterfaceC19610xo
                public final InterfaceC19610xo E7D(String str2, int i) {
                    Integer A002 = C19570xk.A00("putInt", this.A01, str2, 303184728);
                    this.A00.putInt(str2, i);
                    if (A002 != null) {
                        C19570xk.A02(303184728, A002.intValue());
                    }
                    return this;
                }

                @Override // X.InterfaceC19610xo
                public final InterfaceC19610xo E7G(String str2, long j) {
                    Integer A002 = C19570xk.A00("putLong", this.A01, str2, 303184728);
                    this.A00.putLong(str2, j);
                    if (A002 != null) {
                        C19570xk.A02(303184728, A002.intValue());
                    }
                    return this;
                }

                @Override // X.InterfaceC19610xo
                public final InterfaceC19610xo E7K(String str2, String str3) {
                    Integer A002 = C19570xk.A00("putString", this.A01, str2, 303184728);
                    this.A00.putString(str2, str3);
                    if (A002 != null) {
                        C19570xk.A03(303184728, str3, A002.intValue());
                    }
                    return this;
                }

                @Override // X.InterfaceC19610xo
                public final InterfaceC19610xo E7L(String str2, java.util.Set set) {
                    C19570xk c19570xk = C17320tT.A08;
                    Integer A002 = C19570xk.A00("putStringSet", this.A01, str2, 303184728);
                    this.A00.putStringSet(str2, set);
                    if (A002 != null) {
                        c19570xk.A04(set, 303184728, A002.intValue());
                    }
                    return this;
                }

                @Override // X.InterfaceC19610xo
                public final InterfaceC19610xo EEj(String str2) {
                    Integer A002 = C19570xk.A00("remove", this.A01, str2, 303184728);
                    this.A00.remove(str2);
                    if (A002 != null) {
                        C19570xk.A02(303184728, A002.intValue());
                    }
                    return this;
                }

                @Override // X.InterfaceC19610xo
                public final void apply() {
                    Integer A002 = C19570xk.A00("apply", this.A01, null, 303184728);
                    this.A00.apply();
                    if (A002 != null) {
                        C19570xk.A02(303184728, A002.intValue());
                    }
                }

                @Override // X.InterfaceC19610xo
                public final boolean commit() {
                    Integer A002 = C19570xk.A00("commit", this.A01, null, 303184728);
                    boolean commit = this.A00.commit();
                    if (A002 != null) {
                        C19570xk.A02(303184728, A002.intValue());
                    }
                    return commit;
                }

                {
                    this.A00 = edit;
                    this.A01 = str;
                }
            };
            if (A00 != null) {
                C19570xk.A02(303175565, A00.intValue());
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-246604811);
            }
            return interfaceC19610xo;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1385266655);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC19630xq
    public final /* synthetic */ String C2s(String str) {
        String string = getString(str, "");
        return string != null ? string : "";
    }

    @Override // X.InterfaceC19630xq
    public final boolean contains(String str) {
        String str2 = this.A04;
        String A0k = AnonymousClass001.A0k("IgSharedPreferences.contains(", str2, str, '.', ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0k, 1903006481);
        }
        try {
            Integer A00 = C19570xk.A00("contains", str2, str, 303175565);
            boolean contains = this.A03.contains(str);
            if (A00 != null) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A07;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerAnnotate(303175565, A00.intValue(), "value_description", C19570xk.A01(Boolean.valueOf(contains), false));
                }
                C19570xk.A02(303175565, A00.intValue());
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1720434729);
            }
            return contains;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1670481306);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC19630xq
    public final Map getAll() {
        int i;
        int length;
        long j;
        java.util.Set<String> set;
        int i2;
        String str = this.A04;
        String A0S = AnonymousClass001.A0S("IgSharedPreferences.all(", str, ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0S, -980491383);
        }
        try {
            Integer A00 = C19570xk.A00("getAll", str, null, 303175565);
            Map<String, ?> all = this.A03.getAll();
            if (A00 != null) {
                C14360o3.A0A(all);
                int intValue = A00.intValue();
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A07;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerPoint(303175565, "prefs_loaded");
                }
                long j2 = 0;
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (key != null) {
                        i = key.length() * 2;
                    } else {
                        i = 0;
                    }
                    j2 += i;
                    if (value instanceof String) {
                        length = ((String) value).length() * 2;
                    } else {
                        if (!(value instanceof Integer)) {
                            if (!(value instanceof Long)) {
                                if (!(value instanceof Float)) {
                                    if (!(value instanceof Boolean)) {
                                        if ((value instanceof java.util.Set) && (set = (java.util.Set) value) != null) {
                                            length = 0;
                                            for (String str2 : set) {
                                                if (str2 != null) {
                                                    i2 = str2.length() * 2;
                                                } else {
                                                    i2 = 0;
                                                }
                                                length += i2;
                                            }
                                        }
                                    } else {
                                        j = 1;
                                        j2 += j;
                                    }
                                }
                            } else {
                                length = 8;
                            }
                        }
                        j = 4;
                        j2 += j;
                    }
                    j = length;
                    j2 += j;
                }
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = A07;
                if (lightweightQuickPerformanceLogger2 != null) {
                    lightweightQuickPerformanceLogger2.markerAnnotate(303175565, intValue, "size_of_pref_value", all.size());
                }
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger3 = A07;
                if (lightweightQuickPerformanceLogger3 != null) {
                    lightweightQuickPerformanceLogger3.markerAnnotate(303175565, intValue, "byte_size_of_pref_value", j2);
                }
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger4 = A07;
                if (lightweightQuickPerformanceLogger4 != null) {
                    lightweightQuickPerformanceLogger4.markerEnd(303175565, intValue, (short) 2);
                }
            }
            C14360o3.A0A(all);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1634164368);
            }
            return all;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-861310832);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC19630xq
    public final boolean getBoolean(String str, boolean z) {
        String str2 = this.A04;
        String A0k = AnonymousClass001.A0k("IgSharedPreferences.getBoolean(", str2, str, '.', ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0k, 1842272229);
        }
        try {
            Integer A00 = C19570xk.A00("getBoolean", str2, str, 303175565);
            boolean z2 = this.A03.getBoolean(str, z);
            if (A00 != null) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A07;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerAnnotate(303175565, A00.intValue(), "value_description", C19570xk.A01(Boolean.valueOf(z2), Boolean.valueOf(z)));
                }
                C19570xk.A02(303175565, A00.intValue());
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-152930120);
            }
            return z2;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1693162106);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC19630xq
    public final float getFloat(String str, float f) {
        String str2 = this.A04;
        String A0k = AnonymousClass001.A0k("IgSharedPreferences.getFloat(", str2, str, '.', ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0k, 1915359392);
        }
        try {
            Integer A00 = C19570xk.A00("getFloat", str2, str, 303175565);
            float f2 = this.A03.getFloat(str, f);
            if (A00 != null) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A07;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerAnnotate(303175565, A00.intValue(), "value_description", C19570xk.A01(Float.valueOf(f2), Float.valueOf(f)));
                }
                C19570xk.A02(303175565, A00.intValue());
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1441621371);
            }
            return f2;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(537725367);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC19630xq
    public final int getInt(String str, int i) {
        String str2 = this.A04;
        String A0k = AnonymousClass001.A0k("IgSharedPreferences.getInt(", str2, str, '.', ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0k, -717379494);
        }
        try {
            Integer A00 = C19570xk.A00("getInt", str2, str, 303175565);
            int i2 = this.A03.getInt(str, i);
            if (A00 != null) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A07;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerAnnotate(303175565, A00.intValue(), "value_description", C19570xk.A01(Integer.valueOf(i2), Integer.valueOf(i)));
                }
                C19570xk.A02(303175565, A00.intValue());
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-925038339);
            }
            return i2;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(934679922);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC19630xq
    public final long getLong(String str, long j) {
        String str2 = this.A04;
        String A0k = AnonymousClass001.A0k("IgSharedPreferences.getLong(", str2, str, '.', ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0k, 147147128);
        }
        try {
            Integer A00 = C19570xk.A00("getLong", str2, str, 303175565);
            long j2 = this.A03.getLong(str, j);
            if (A00 != null) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A07;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerAnnotate(303175565, A00.intValue(), "value_description", C19570xk.A01(Long.valueOf(j2), Long.valueOf(j)));
                }
                C19570xk.A02(303175565, A00.intValue());
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1907502084);
            }
            return j2;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(881460983);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC19630xq
    public final String getString(String str, String str2) {
        String str3 = this.A04;
        String A0k = AnonymousClass001.A0k("IgSharedPreferences.getString(", str3, str, '.', ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0k, 1471910446);
        }
        try {
            Integer A00 = C19570xk.A00("getString", str3, str, 303175565);
            String string = this.A03.getString(str, str2);
            if (A00 != null) {
                int intValue = A00.intValue();
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A07;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerAnnotate(303175565, intValue, "value_description", C19570xk.A01(string, str2));
                }
                C19570xk.A03(303175565, string, intValue);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-647602466);
            }
            return string;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1849190264);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC19630xq
    public final java.util.Set getStringSet(String str, java.util.Set set) {
        String str2 = this.A04;
        String A0k = AnonymousClass001.A0k("IgSharedPreferences.getStringSet(", str2, str, '.', ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0k, -800123662);
        }
        try {
            C19570xk c19570xk = A08;
            Integer A00 = C19570xk.A00("getStringSet", str2, str, 303175565);
            java.util.Set<String> stringSet = this.A03.getStringSet(str, set);
            if (A00 != null) {
                int intValue = A00.intValue();
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A07;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerAnnotate(303175565, intValue, "value_description", C19570xk.A01(stringSet, set));
                }
                c19570xk.A04(stringSet, 303175565, intValue);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-753054239);
            }
            return stringSet;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(2058384497);
            }
            throw th;
        }
    }
}
