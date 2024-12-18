package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.0BJ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0BJ {
    public static final void A00(String str) {
        C14360o3.A0B(str, 0);
        C0BI c0bi = C0BI.$redex_init_class;
        if (str.length() > 127) {
            str = str.substring(0, StringTreeSet.MAX_SYMBOL_COUNT);
            C14360o3.A07(str);
        }
        AbstractC09790fc.A01(str, 2105111227);
    }
}
