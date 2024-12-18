package X;

import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SkQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class SharedPreferencesEditorC63447SkQ implements SharedPreferences.Editor {
    public AtomicBoolean A00;
    public final SharedPreferences.Editor A01;
    public final SharedPreferencesC63448SkR A02;
    public final List A03;

    public SharedPreferencesEditorC63447SkQ(SharedPreferences.Editor editor, SharedPreferencesC63448SkR sharedPreferencesC63448SkR) {
        int A03 = C0f9.A03(-651397151);
        this.A00 = AbstractC166997dE.A17();
        this.A02 = sharedPreferencesC63448SkR;
        this.A01 = editor;
        this.A03 = new CopyOnWriteArrayList();
        C0f9.A0A(-480377139, A03);
    }

    private void A00() {
        int A03 = C0f9.A03(-2004015218);
        if (this.A00.getAndSet(false)) {
            SharedPreferencesC63448SkR sharedPreferencesC63448SkR = this.A02;
            Iterator A12 = AbstractC43593JPy.A12(sharedPreferencesC63448SkR.getAll());
            while (A12.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A12);
                if (!this.A03.contains(A1B) && !sharedPreferencesC63448SkR.A04(A1B)) {
                    this.A01.remove(sharedPreferencesC63448SkR.A03(A1B));
                }
            }
        }
        C0f9.A0A(1958749870, A03);
    }

    private void A01() {
        int A03 = C0f9.A03(514123398);
        SharedPreferencesC63448SkR sharedPreferencesC63448SkR = this.A02;
        Iterator it = sharedPreferencesC63448SkR.A04.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.A03.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC63448SkR, AbstractC166987dD.A1B(it2));
            }
        }
        C0f9.A0A(834024435, A03);
    }

    private void A02(String str, byte[] bArr) {
        int A03 = C0f9.A03(506072280);
        SharedPreferencesC63448SkR sharedPreferencesC63448SkR = this.A02;
        if (!sharedPreferencesC63448SkR.A04(str)) {
            this.A03.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                int A032 = C0f9.A03(2076925802);
                String A033 = sharedPreferencesC63448SkR.A03(str);
                Pair pair = new Pair(A033, AbstractC63099Sd0.A00(sharedPreferencesC63448SkR.A01.ASM(bArr, A033.getBytes(StandardCharsets.UTF_8))));
                C0f9.A0A(1114495862, A032);
                this.A01.putString((String) pair.first, (String) pair.second);
                C0f9.A0A(316908228, A03);
                return;
            } catch (GeneralSecurityException e) {
                SecurityException securityException = new SecurityException(AbstractC166997dE.A0y("Could not encrypt data: ", e), e);
                C0f9.A0A(-483965803, A03);
                throw securityException;
            }
        }
        SecurityException A0o = AbstractC58319PtB.A0o(str, " is a reserved key for the encryption keyset.");
        C0f9.A0A(-721632018, A03);
        throw A0o;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        int A03 = C0f9.A03(167835877);
        A00();
        this.A01.apply();
        A01();
        this.A03.clear();
        C0f9.A0A(145687036, A03);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        int A03 = C0f9.A03(282658565);
        this.A00.set(true);
        C0f9.A0A(-1656198250, A03);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        int A03 = C0f9.A03(1744181652);
        A00();
        try {
            boolean commit = this.A01.commit();
            A01();
            this.A03.clear();
            C0f9.A0A(-486781779, A03);
            return commit;
        } catch (Throwable th) {
            A01();
            this.A03.clear();
            C0f9.A0A(-1771923622, A03);
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        int A03 = C0f9.A03(2030925703);
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(5);
        allocate.put(z ? (byte) 1 : (byte) 0);
        A02(str, allocate.array());
        C0f9.A0A(-1562137838, A03);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        int A03 = C0f9.A03(-343291869);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(4);
        allocate.putFloat(f);
        A02(str, allocate.array());
        C0f9.A0A(547026731, A03);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        int A03 = C0f9.A03(823310973);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(2);
        allocate.putInt(i);
        A02(str, allocate.array());
        C0f9.A0A(2115638928, A03);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        int A03 = C0f9.A03(2044625631);
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(3);
        allocate.putLong(j);
        A02(str, allocate.array());
        C0f9.A0A(-439170613, A03);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        int A03 = C0f9.A03(-844666613);
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(0);
        allocate.putInt(length);
        allocate.put(bytes);
        A02(str, allocate.array());
        C0f9.A0A(-1235774795, A03);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, java.util.Set set) {
        int A03 = C0f9.A03(657249646);
        java.util.Set set2 = set;
        if (set == null) {
            C012504o c012504o = new C012504o(0);
            c012504o.add("__NULL__");
            set2 = c012504o;
        }
        ArrayList A17 = AbstractC25225BEi.A17(set2.size());
        int size = set2.size() * 4;
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            byte[] bytes = AbstractC166987dD.A1B(it).getBytes(StandardCharsets.UTF_8);
            A17.add(bytes);
            size += bytes.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(size + 4);
        allocate.putInt(1);
        Iterator it2 = A17.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        A02(str, allocate.array());
        C0f9.A0A(-757274001, A03);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        int A03 = C0f9.A03(2143696393);
        SharedPreferencesC63448SkR sharedPreferencesC63448SkR = this.A02;
        if (!sharedPreferencesC63448SkR.A04(str)) {
            this.A01.remove(sharedPreferencesC63448SkR.A03(str));
            this.A03.add(str);
            C0f9.A0A(-2006644008, A03);
            return this;
        }
        SecurityException A0o = AbstractC58319PtB.A0o(str, " is a reserved key for the encryption keyset.");
        C0f9.A0A(-551029895, A03);
        throw A0o;
    }
}
