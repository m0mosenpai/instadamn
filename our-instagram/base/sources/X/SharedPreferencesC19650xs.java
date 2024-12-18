package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.0xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesC19650xs implements SharedPreferences {
    public final java.util.Set A00;
    public final InterfaceC19620xp A01;
    public final InterfaceC19630xq A02;

    public SharedPreferencesC19650xs(InterfaceC19630xq interfaceC19630xq) {
        C14360o3.A0B(interfaceC19630xq, 1);
        int A03 = C0f9.A03(93527212);
        this.A02 = interfaceC19630xq;
        this.A00 = new LinkedHashSet();
        this.A01 = new InterfaceC19620xp() { // from class: X.0tR
            @Override // X.InterfaceC19620xp
            public final void onChanged(InterfaceC19630xq interfaceC19630xq2, String str) {
                SharedPreferencesC19650xs sharedPreferencesC19650xs = SharedPreferencesC19650xs.this;
                Iterator it = sharedPreferencesC19650xs.A00.iterator();
                while (it.hasNext()) {
                    ((SharedPreferences.OnSharedPreferenceChangeListener) it.next()).onSharedPreferenceChanged(sharedPreferencesC19650xs, str);
                }
            }
        };
        C0f9.A0A(1227277429, A03);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        int A03 = C0f9.A03(-686273038);
        boolean contains = this.A02.contains(str);
        C0f9.A0A(-1717522699, A03);
        return contains;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        int A03 = C0f9.A03(-1200329000);
        final InterfaceC19610xo ARD = this.A02.ARD();
        SharedPreferences.Editor editor = new SharedPreferences.Editor() { // from class: X.0xr
            {
                C0f9.A0A(1644270807, C0f9.A03(-1427471823));
            }

            @Override // android.content.SharedPreferences.Editor
            public final void apply() {
                int A032 = C0f9.A03(53423182);
                InterfaceC19610xo.this.apply();
                C0f9.A0A(486818516, A032);
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor clear() {
                int A032 = C0f9.A03(-771612818);
                InterfaceC19610xo.this.AHW();
                C0f9.A0A(-2139123686, A032);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final boolean commit() {
                int A032 = C0f9.A03(-398861427);
                boolean commit = InterfaceC19610xo.this.commit();
                C0f9.A0A(357954172, A032);
                return commit;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putBoolean(String str, boolean z) {
                int A032 = C0f9.A03(-1312909339);
                InterfaceC19610xo.this.E77(str, z);
                C0f9.A0A(-353584866, A032);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putFloat(String str, float f) {
                int A032 = C0f9.A03(1347955350);
                InterfaceC19610xo.this.E7A(str, f);
                C0f9.A0A(515530615, A032);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putInt(String str, int i) {
                int A032 = C0f9.A03(-1717661691);
                InterfaceC19610xo.this.E7D(str, i);
                C0f9.A0A(264771204, A032);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putLong(String str, long j) {
                int A032 = C0f9.A03(-735041319);
                InterfaceC19610xo.this.E7G(str, j);
                C0f9.A0A(1748491979, A032);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putString(String str, String str2) {
                int A032 = C0f9.A03(-1850074632);
                InterfaceC19610xo.this.E7K(str, str2);
                C0f9.A0A(-1346165205, A032);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putStringSet(String str, java.util.Set set) {
                int A032 = C0f9.A03(273766608);
                InterfaceC19610xo.this.E7L(str, set);
                C0f9.A0A(-675699489, A032);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor remove(String str) {
                int A032 = C0f9.A03(694134934);
                InterfaceC19610xo.this.EEj(str);
                C0f9.A0A(-361161586, A032);
                return this;
            }
        };
        C0f9.A0A(210915506, A03);
        return editor;
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        int A03 = C0f9.A03(2033036227);
        LinkedHashMap A032 = AbstractC06930Yk.A03(this.A02.getAll());
        C0f9.A0A(-1843916044, A03);
        return A032;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        int A03 = C0f9.A03(-36857186);
        boolean z2 = this.A02.getBoolean(str, z);
        C0f9.A0A(146481327, A03);
        return z2;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        int A03 = C0f9.A03(-1939026927);
        float f2 = this.A02.getFloat(str, f);
        C0f9.A0A(-1421708729, A03);
        return f2;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        int A03 = C0f9.A03(-1587202221);
        int i2 = this.A02.getInt(str, i);
        C0f9.A0A(-689427999, A03);
        return i2;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        int A03 = C0f9.A03(-1702858118);
        long j2 = this.A02.getLong(str, j);
        C0f9.A0A(41608195, A03);
        return j2;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        int A03 = C0f9.A03(1912362581);
        String string = this.A02.getString(str, str2);
        C0f9.A0A(-800784374, A03);
        return string;
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set getStringSet(String str, java.util.Set set) {
        int A03 = C0f9.A03(96902649);
        java.util.Set stringSet = this.A02.getStringSet(str, set);
        C0f9.A0A(-728387427, A03);
        return stringSet;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A03 = C0f9.A03(-1736436014);
        C14360o3.A0B(onSharedPreferenceChangeListener, 0);
        java.util.Set set = this.A00;
        synchronized (set) {
            try {
                set.add(onSharedPreferenceChangeListener);
                this.A02.EDW(this.A01);
            } catch (Throwable th) {
                C0f9.A0A(651284318, A03);
                throw th;
            }
        }
        C0f9.A0A(760400303, A03);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A03 = C0f9.A03(950614165);
        C14360o3.A0B(onSharedPreferenceChangeListener, 0);
        java.util.Set set = this.A00;
        synchronized (set) {
            try {
                set.remove(onSharedPreferenceChangeListener);
                if (set.isEmpty()) {
                    this.A02.F9e(this.A01);
                }
            } catch (Throwable th) {
                C0f9.A0A(-1512563385, A03);
                throw th;
            }
        }
        C0f9.A0A(2920484, A03);
    }
}
