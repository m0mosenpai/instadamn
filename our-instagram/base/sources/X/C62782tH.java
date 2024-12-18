package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.2tH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62782tH extends C1BX {
    public final int A00;
    public final SharedPreferences A01;
    public final Object A02;
    public volatile boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62782tH(SharedPreferences sharedPreferences, String str, boolean z) {
        super(str);
        C14360o3.A0B(sharedPreferences, 1);
        this.A01 = sharedPreferences;
        this.A00 = 3;
        this.A02 = new Object();
        if (z) {
            final C9E0 c9e0 = new C9E0(this, 3);
            InterfaceC14020nS A00 = C14120nc.A00();
            final int i = this.A00;
            A00.ATO(new AbstractRunnableC14200nk(i) { // from class: X.9IK
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC16820sZ.this.invoke();
                }
            });
        }
    }

    @Override // X.C1BX
    public final long A04(String str, long j) {
        C14360o3.A0B(str, 0);
        long j2 = this.A01.getLong(str, j);
        this.A03 = true;
        return j2;
    }

    @Override // X.C1BX
    public final java.util.Set A06(String str, java.util.Set set) {
        java.util.Set<String> stringSet = this.A01.getStringSet(str, set);
        if (stringSet == null) {
            stringSet = C16910sj.A00;
        }
        java.util.Set A0j = AbstractC001800i.A0j(stringSet);
        this.A03 = true;
        return A0j;
    }

    @Override // X.C1BX
    public final void A09() {
    }

    @Override // X.C1BX
    public final void A0A(String str) {
        C14360o3.A0B(str, 0);
        this.A01.edit().remove(str).apply();
        this.A03 = true;
    }

    @Override // X.C1BX
    public final void A0C(String str, long j) {
        C14360o3.A0B(str, 0);
        this.A01.edit().putLong(str, j).apply();
        A07();
        this.A03 = true;
    }

    @Override // X.C1BX
    public final boolean A0F(String str) {
        C14360o3.A0B(str, 0);
        boolean contains = this.A01.contains(str);
        this.A03 = true;
        return contains;
    }

    @Override // X.C1BX
    public final boolean A0G(String str, boolean z) {
        boolean z2 = this.A01.getBoolean(str, false);
        this.A03 = true;
        return z2;
    }

    @Override // X.C1BX
    public final float A02(String str, float f) {
        float f2 = this.A01.getFloat(str, -1.0f);
        this.A03 = true;
        return f2;
    }

    @Override // X.C1BX
    public final int A03() {
        int size = this.A01.getAll().size();
        this.A03 = true;
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.6PR] */
    @Override // X.C1BX
    public final java.util.Set A05() {
        java.util.Set<Map.Entry<String, ?>> entrySet = this.A01.getAll().entrySet();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(entrySet, 10));
        for (Map.Entry<String, ?> entry : entrySet) {
            String key = entry.getKey();
            C14360o3.A07(key);
            String str = key;
            Object value = entry.getValue();
            C14360o3.A0B(str, 1);
            ?? obj = new Object();
            obj.A01 = str;
            obj.A00 = value;
            arrayList.add(obj);
        }
        this.A03 = true;
        return AbstractC001800i.A0j(arrayList);
    }

    @Override // X.C1BX
    public final void A08() {
        this.A01.edit().clear().apply();
        this.A03 = true;
    }

    @Override // X.C1BX
    public final void A0B(String str, float f) {
        this.A01.edit().putFloat(str, f).apply();
        A07();
        this.A03 = true;
    }

    @Override // X.C1BX
    public final void A0D(String str, java.util.Set set) {
        this.A01.edit().putStringSet("cellar_captured_event_names", set).apply();
        A07();
        this.A03 = true;
    }

    @Override // X.C1BX
    public final void A0E(String str, boolean z) {
        this.A01.edit().putBoolean(str, z).apply();
        A07();
        this.A03 = true;
    }
}
