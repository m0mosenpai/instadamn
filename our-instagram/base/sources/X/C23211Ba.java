package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.1Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23211Ba extends C1BX {
    public final SharedPreferences A00;
    public final Map A01;
    public final boolean A02;
    public final Map A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23211Ba(SharedPreferences sharedPreferences, String str, boolean z, boolean z2) {
        super(str);
        C14360o3.A0B(sharedPreferences, 1);
        this.A00 = sharedPreferences;
        this.A04 = z;
        this.A02 = z2;
        this.A03 = new HashMap(sharedPreferences.getAll());
        this.A01 = new HashMap();
    }

    @Override // X.C1BX
    public final synchronized int A03() {
        return this.A03.size();
    }

    @Override // X.C1BX
    public final synchronized long A04(String str, long j) {
        C14360o3.A0B(str, 0);
        Object obj = this.A03.get(str);
        if (obj != null) {
            j = ((Long) obj).longValue();
        }
        return j;
    }

    @Override // X.C1BX
    public final synchronized java.util.Set A05() {
        return new HashSet(this.A03.entrySet());
    }

    @Override // X.C1BX
    public final synchronized java.util.Set A06(String str, java.util.Set set) {
        java.util.Set A0j;
        java.util.Set set2 = (java.util.Set) this.A03.get(str);
        if (set2 != null) {
            A0j = new HashSet(set2);
        } else {
            A0j = AbstractC001800i.A0j(set);
        }
        return A0j;
    }

    @Override // X.C1BX
    public final synchronized void A08() {
        this.A01.clear();
        this.A03.clear();
        SharedPreferences.Editor edit = this.A00.edit();
        edit.clear();
        edit.apply();
    }

    @Override // X.C1BX
    public final synchronized void A0A(String str) {
        C14360o3.A0B(str, 0);
        this.A03.remove(str);
        this.A01.put(str, this);
    }

    @Override // X.C1BX
    public final synchronized void A0B(String str, float f) {
        A07();
        Float valueOf = Float.valueOf(f);
        this.A03.put(str, valueOf);
        this.A01.put(str, valueOf);
    }

    @Override // X.C1BX
    public final synchronized void A0C(String str, long j) {
        C14360o3.A0B(str, 0);
        A07();
        Long valueOf = Long.valueOf(j);
        this.A03.put(str, valueOf);
        this.A01.put(str, valueOf);
    }

    @Override // X.C1BX
    public final synchronized void A0E(String str, boolean z) {
        A07();
        Boolean valueOf = Boolean.valueOf(z);
        this.A03.put(str, valueOf);
        this.A01.put(str, valueOf);
    }

    @Override // X.C1BX
    public final synchronized boolean A0F(String str) {
        C14360o3.A0B(str, 0);
        return this.A03.containsKey(str);
    }

    @Override // X.C1BX
    public final synchronized boolean A0G(String str, boolean z) {
        boolean booleanValue;
        synchronized (this) {
            Boolean bool = (Boolean) this.A03.get(str);
            booleanValue = bool != null ? bool.booleanValue() : false;
        }
        return booleanValue;
    }

    @Override // X.C1BX
    public final synchronized float A02(String str, float f) {
        float floatValue;
        synchronized (this) {
            Float f2 = (Float) this.A03.get(str);
            floatValue = f2 != null ? f2.floatValue() : -1.0f;
        }
        return floatValue;
    }

    @Override // X.C1BX
    public final void A09() {
        if (this.A04) {
            if (this.A01.size() > 0) {
                InterfaceC14020nS A00 = C14120nc.A00();
                final boolean z = this.A02;
                A00.ATO(new AbstractRunnableC14200nk(z) { // from class: X.54F
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23211Ba c23211Ba = C23211Ba.this;
                        synchronized (c23211Ba) {
                            SharedPreferences.Editor edit = c23211Ba.A00.edit();
                            Map map = c23211Ba.A01;
                            for (Map.Entry entry : map.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (value == c23211Ba) {
                                    edit.remove(str);
                                } else if (value instanceof java.util.Set) {
                                    edit.putStringSet(str, (java.util.Set) value);
                                } else if (value instanceof Boolean) {
                                    edit.putBoolean(str, ((Boolean) value).booleanValue());
                                } else if (value instanceof Long) {
                                    edit.putLong(str, ((Long) value).longValue());
                                } else if (value instanceof Float) {
                                    edit.putFloat(str, ((Float) value).floatValue());
                                } else if (value instanceof Integer) {
                                    edit.putInt(str, ((Integer) value).intValue());
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("try to store unsupport value type ");
                                    sb.append(value);
                                    C0w9.A03("LazyPreferences", sb.toString());
                                }
                            }
                            edit.apply();
                            map.clear();
                        }
                    }
                });
                return;
            }
            return;
        }
        synchronized (this) {
            if (this.A01.size() > 0) {
                InterfaceC14020nS A002 = C14120nc.A00();
                final boolean z2 = this.A02;
                A002.ATO(new AbstractRunnableC14200nk(z2) { // from class: X.54F
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23211Ba c23211Ba = C23211Ba.this;
                        synchronized (c23211Ba) {
                            SharedPreferences.Editor edit = c23211Ba.A00.edit();
                            Map map = c23211Ba.A01;
                            for (Map.Entry entry : map.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (value == c23211Ba) {
                                    edit.remove(str);
                                } else if (value instanceof java.util.Set) {
                                    edit.putStringSet(str, (java.util.Set) value);
                                } else if (value instanceof Boolean) {
                                    edit.putBoolean(str, ((Boolean) value).booleanValue());
                                } else if (value instanceof Long) {
                                    edit.putLong(str, ((Long) value).longValue());
                                } else if (value instanceof Float) {
                                    edit.putFloat(str, ((Float) value).floatValue());
                                } else if (value instanceof Integer) {
                                    edit.putInt(str, ((Integer) value).intValue());
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("try to store unsupport value type ");
                                    sb.append(value);
                                    C0w9.A03("LazyPreferences", sb.toString());
                                }
                            }
                            edit.apply();
                            map.clear();
                        }
                    }
                });
            }
        }
    }

    @Override // X.C1BX
    public final synchronized void A0D(String str, java.util.Set set) {
        A07();
        HashSet hashSet = new HashSet(set);
        this.A03.put("cellar_captured_event_names", hashSet);
        this.A01.put("cellar_captured_event_names", hashSet);
    }
}
