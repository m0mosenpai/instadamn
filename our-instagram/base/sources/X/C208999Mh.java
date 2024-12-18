package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.9Mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208999Mh extends AbstractC176827te {
    public C9MK A00;
    public C208959Md A01;

    public final void A03() {
        A05(super.A00.A00());
    }

    public final void A04() {
        C9MK c9mk = this.A00;
        Rect rect = C9MZ.A00;
        List list = (List) c9mk.A01(AbstractC176767tY.A0w);
        int i = 4;
        if (!list.contains(4)) {
            i = 1;
            if (!list.contains(1)) {
                i = 6;
                if (!list.contains(6)) {
                    return;
                }
            }
        }
        super.A00.A01(AbstractC176797tb.A0D, Integer.valueOf(i));
    }

    public final void A05(C177007tw c177007tw) {
        C9MI c9mi;
        boolean z;
        String str;
        super.A00 = new C176837tf();
        C208959Md c208959Md = this.A01;
        try {
            c9mi = (C9MI) c208959Md.A02.clone();
        } catch (CloneNotSupportedException e) {
            android.util.Log.e("ParametersModificationApplier", "Could not clone the camera settings", e);
            c9mi = null;
        }
        if (c177007tw.A12) {
            z = c208959Md.A01(AbstractC176797tb.A0D, Integer.valueOf(c177007tw.A0C));
        } else {
            z = false;
        }
        if (c177007tw.A0b) {
            z = A01(c208959Md, AbstractC176797tb.A00, c177007tw.A06, z);
        }
        if (c177007tw.A0t) {
            z = A01(c208959Md, AbstractC176797tb.A07, c177007tw.A08, z);
        }
        if (c177007tw.A0l) {
            z = A02(c208959Md, AbstractC176797tb.A0P, c177007tw.A0k, z);
        }
        if (c177007tw.A0p) {
            z = A02(c208959Md, AbstractC176797tb.A0R, c177007tw.A0o, z);
        }
        if (c177007tw.A10) {
            z = A01(c208959Md, AbstractC176797tb.A0B, c177007tw.A0B, z);
        }
        if (c177007tw.A0w) {
            z = A01(c208959Md, AbstractC176797tb.A09, c177007tw.A0A, z);
        }
        if (c177007tw.A11) {
            z |= c208959Md.A01(AbstractC176797tb.A0C, c177007tw.A0Z);
        }
        if (c177007tw.A1J) {
            z = A01(c208959Md, AbstractC176797tb.A0a, c177007tw.A0E, z);
        }
        if (c177007tw.A1K) {
            z = A01(c208959Md, AbstractC176797tb.A0b, c177007tw.A0F, z);
        }
        if (c177007tw.A1L) {
            z |= c208959Md.A01(AbstractC176797tb.A0c, c177007tw.A0S);
        }
        if (c177007tw.A1O) {
            z |= c208959Md.A01(AbstractC176797tb.A0f, c177007tw.A0a);
        }
        if (c177007tw.A1S) {
            z = A01(c208959Md, AbstractC176797tb.A0i, c177007tw.A0I, z);
        }
        if (c177007tw.A1T) {
            z |= c208959Md.A01(AbstractC176797tb.A0k, c177007tw.A0T);
        }
        if (c177007tw.A1U) {
            z = A01(c208959Md, AbstractC176797tb.A0m, c177007tw.A0J, z);
        }
        if (c177007tw.A1W) {
            z = A01(c208959Md, AbstractC176797tb.A0o, c177007tw.A0K, z);
        }
        if (c177007tw.A1V) {
            z |= c208959Md.A01(AbstractC176797tb.A0n, c177007tw.A1o);
        }
        if (c177007tw.A1X) {
            z |= c208959Md.A01(AbstractC176797tb.A0q, c177007tw.A0U);
        }
        if (c177007tw.A1c) {
            z = A01(c208959Md, AbstractC176797tb.A0s, c177007tw.A0L, z);
        }
        if (c177007tw.A1i) {
            z = A02(c208959Md, AbstractC176797tb.A0Z, c177007tw.A1h, z);
        }
        if (c177007tw.A1g) {
            z |= c208959Md.A01(AbstractC176797tb.A0y, c177007tw.A0V);
        }
        if (c177007tw.A1j) {
            z = A01(c208959Md, AbstractC176797tb.A0z, c177007tw.A0N, z);
        }
        if (c177007tw.A1l) {
            z = A01(c208959Md, AbstractC176797tb.A11, c177007tw.A0O, z);
        }
        if (c177007tw.A1F) {
            z = A02(c208959Md, AbstractC176797tb.A0W, c177007tw.A1E, z);
        }
        if (c177007tw.A1b) {
            z = A02(c208959Md, AbstractC176797tb.A0r, c177007tw.A1a, z);
        }
        if (c177007tw.A15) {
            z |= c208959Md.A01(AbstractC176797tb.A0E, Double.valueOf(c177007tw.A00));
        }
        if (c177007tw.A16) {
            z |= c208959Md.A01(AbstractC176797tb.A0F, Double.valueOf(c177007tw.A01));
        }
        if (c177007tw.A17) {
            z |= c208959Md.A01(AbstractC176797tb.A0G, Double.valueOf(c177007tw.A02));
        }
        if (c177007tw.A18) {
            z |= c208959Md.A01(AbstractC176797tb.A0H, c177007tw.A0X);
        }
        if (c177007tw.A19) {
            z |= c208959Md.A01(AbstractC176797tb.A0I, Long.valueOf(c177007tw.A0Q));
        }
        if (c177007tw.A1R) {
            z = A01(c208959Md, AbstractC176797tb.A0g, c177007tw.A0H, z);
        }
        if (c177007tw.A1f) {
            z = A01(c208959Md, AbstractC176797tb.A0x, c177007tw.A0M, z);
        }
        if (c177007tw.A1I) {
            z = A01(c208959Md, AbstractC176797tb.A0L, c177007tw.A0D, z);
        }
        if (c177007tw.A0v) {
            z |= c208959Md.A01(AbstractC176797tb.A0l, null);
        }
        if (c177007tw.A1H) {
            z = A02(c208959Md, AbstractC176797tb.A0V, c177007tw.A1G, z);
        }
        if (c177007tw.A0h) {
            z = A02(c208959Md, AbstractC176797tb.A0N, c177007tw.A0g, z);
        }
        if (z) {
            int incrementAndGet = C208959Md.A05.incrementAndGet();
            try {
                AbstractC175037qd.A00(34, incrementAndGet, null);
                if (AbstractC176937tp.A02(AbstractC177127u8.A01)) {
                    c177007tw.A00();
                }
                c208959Md.A01.setParameters(c208959Md.A00);
                AbstractC175037qd.A00(35, incrementAndGet, null);
            } catch (RuntimeException e2) {
                AbstractC175037qd.A00(36, incrementAndGet, e2);
                if (c9mi != null) {
                    str = c9mi.A03();
                } else {
                    str = "null";
                }
                throw new RuntimeException(String.format("Failed to apply parameters. previous settings: (%s), new settings: (%s), parameters: (%s), modifications: (%s)", str, c208959Md.A02.A03(), c208959Md.A00.flatten(), c177007tw.A00()), e2);
            }
        }
    }

    public static boolean A01(C208959Md c208959Md, C176807tc c176807tc, int i, boolean z) {
        return z | c208959Md.A01(c176807tc, Integer.valueOf(i));
    }

    public static boolean A02(C208959Md c208959Md, C176807tc c176807tc, boolean z, boolean z2) {
        return z2 | c208959Md.A01(c176807tc, Boolean.valueOf(z));
    }
}
