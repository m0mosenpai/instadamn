package X;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.19z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19z implements C0U0 {
    public static final Map A0A = new HashMap();
    public static volatile boolean A0B;
    public File A02;
    public final C003501a A03 = new C003501a();
    public final C003501a A04 = new C003501a();
    public final C003501a A05 = new C003501a();
    public final C003501a A06 = new C003501a();
    public final java.util.Set A09 = new HashSet();
    public final Map A08 = new HashMap();
    public final Map A07 = new HashMap();
    public boolean A01 = false;
    public boolean A00 = false;

    public static long A00(long j) {
        return (((int) ((j >>> 54) & 63)) << 54) | (0 << 62) | (0 << 61) | (((int) ((j >>> 48) & 63)) << 48) | (0 << 16) | ((int) (j & 65535));
    }

    public static C19z A01(File file) {
        Map map = A0A;
        if (!map.containsKey(file)) {
            synchronized (map) {
                if (!map.containsKey(file)) {
                    map.put(file, new C19z(file));
                }
            }
        }
        C19z c19z = (C19z) map.get(file);
        c19z.getClass();
        return c19z;
    }

    private void A02(long j) {
        this.A08.get(Integer.valueOf((int) ((j >>> 54) & 63)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0310, code lost:
    
        if (r25.A01 == false) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A03() {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19z.A03():void");
    }

    @Override // X.C0U0
    public final boolean boolOverrideForParam(long j, boolean z) {
        if (this.A01) {
            synchronized (this) {
                A02(j);
                Boolean bool = (Boolean) this.A03.A05(A00(j));
                if (bool != null) {
                    z = bool.booleanValue();
                }
            }
            return z;
        }
        return z;
    }

    @Override // X.C0U0
    public final double doubleOverrideForParam(long j, double d) {
        if (this.A01) {
            synchronized (this) {
                A02(j);
                Double d2 = (Double) this.A04.A05(A00(j));
                if (d2 != null) {
                    d = d2.doubleValue();
                }
            }
            return d;
        }
        return d;
    }

    @Override // X.C0U0
    public final boolean hasBoolOverrideForParam(long j) {
        boolean z = false;
        if (!this.A01) {
            return false;
        }
        synchronized (this) {
            A02(j);
            long A00 = A00(j);
            if (this.A03.A05(A00) != null || this.A09.contains(Long.valueOf(A00))) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.C0U0
    public final boolean hasDoubleOverrideForParam(long j) {
        boolean z = false;
        if (!this.A01) {
            return false;
        }
        synchronized (this) {
            A02(j);
            long A00 = A00(j);
            if (this.A04.A05(A00) != null || this.A09.contains(Long.valueOf(A00))) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.C0U0
    public final boolean hasIntOverrideForParam(long j) {
        boolean z = false;
        if (!this.A01) {
            return false;
        }
        synchronized (this) {
            A02(j);
            long A00 = A00(j);
            if (this.A05.A05(A00) != null || this.A09.contains(Long.valueOf(A00))) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.C0U0
    public final boolean hasOverridesFile() {
        return this.A00;
    }

    @Override // X.C0U0
    public final boolean hasStringOverrideForParam(long j) {
        boolean z = false;
        if (!this.A01) {
            return false;
        }
        synchronized (this) {
            A02(j);
            long A00 = A00(j);
            if (this.A06.A05(A00) != null || this.A09.contains(Long.valueOf(A00))) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.C0U0
    public final long intOverrideForParam(long j, long j2) {
        if (this.A01) {
            synchronized (this) {
                A02(j);
                Long l = (Long) this.A05.A05(A00(j));
                if (l != null) {
                    j2 = l.longValue();
                }
            }
            return j2;
        }
        return j2;
    }

    @Override // X.C0U0
    public final void removeAllOverrides() {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0U0
    public final void removeOverrideForParam(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0U0
    public final String stringOverrideForParam(long j, String str) {
        if (this.A01) {
            synchronized (this) {
                A02(j);
                String str2 = (String) this.A06.A05(A00(j));
                if (str2 != null) {
                    str = str2;
                }
            }
            return str;
        }
        return str;
    }

    @Override // X.C0U0
    public final void updateOverrideForParam(long j, double d) {
        throw new UnsupportedOperationException();
    }

    public C19z(File file) {
        this.A02 = file;
    }

    @Override // X.C0U0
    public final void updateOverrideForParam(long j, long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0U0
    public final void updateOverrideForParam(long j, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0U0
    public final void updateOverrideForParam(long j, boolean z) {
        throw new UnsupportedOperationException();
    }
}
