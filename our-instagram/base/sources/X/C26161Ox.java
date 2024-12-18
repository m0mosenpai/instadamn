package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;

/* renamed from: X.1Ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26161Ox {
    public final HashMap A00 = new HashMap();

    public static synchronized C1OZ A00(C26161Ox c26161Ox, String str) {
        C1OZ c1oz;
        synchronized (c26161Ox) {
            c1oz = (C1OZ) c26161Ox.A00.get(str);
            if (c1oz == null) {
                throw new RuntimeException(StringFormatUtil.formatStrLocaleSafe("No TypeAdapter registered for type name: %s", str));
            }
        }
        return c1oz;
    }

    public final synchronized void A03(C1OZ c1oz, String str) {
        HashMap hashMap = this.A00;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, c1oz);
        } else {
            throw new RuntimeException(StringFormatUtil.formatStrLocaleSafe("Duplicate type name. %s is already mapped to %s", str, ((C1OZ) hashMap.get(str)).getClass().getName()));
        }
    }

    public final C1OX A01(C16L c16l) {
        if (c16l.A11() == C16R.A0D) {
            c16l.A1J();
            if (c16l.A11() == C16R.A0A) {
                String A1P = c16l.A1P();
                c16l.A1J();
                C1OX c1ox = (C1OX) A00(this, A1P).E3S(c16l);
                c16l.A1J();
                return c1ox;
            }
        }
        c16l.A0z();
        return null;
    }

    public final void A02(AnonymousClass182 anonymousClass182, C1OX c1ox) {
        anonymousClass182.A0d();
        anonymousClass182.A0r(c1ox.getTypeName());
        A00(this, c1ox.getTypeName()).EOu(anonymousClass182, c1ox);
        anonymousClass182.A0a();
    }
}
