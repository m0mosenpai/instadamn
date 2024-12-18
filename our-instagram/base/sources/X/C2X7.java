package X;

import android.graphics.Rect;

/* renamed from: X.2X7, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2X7 {
    public abstract Object A0A();

    public void A0B(Rect rect, C79073gE c79073gE, Object obj) {
    }

    public void A0C(C79073gE c79073gE) {
    }

    public void A0D(C79073gE c79073gE) {
    }

    public void A0E(C79073gE c79073gE) {
    }

    public final String A09() {
        Class<?> cls = getClass();
        String name = cls.getName();
        if (name.length() > 80) {
            String simpleName = cls.getSimpleName();
            C14360o3.A07(simpleName);
            return simpleName;
        }
        return AnonymousClass001.A0g("<cls>", name, "</cls>");
    }
}
