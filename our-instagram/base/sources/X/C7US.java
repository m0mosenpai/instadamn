package X;

import android.content.Context;

/* renamed from: X.7US, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7US {
    public static final C7UR A00(Context context) {
        C14360o3.A0B(context, 0);
        C7UR c7ur = C7UR.A0A;
        if (c7ur == null) {
            Context applicationContext = context.getApplicationContext();
            C14360o3.A07(applicationContext);
            C7UR c7ur2 = new C7UR(applicationContext);
            C7UR.A0A = c7ur2;
            return c7ur2;
        }
        return c7ur;
    }

    public static final boolean A02(String str) {
        try {
            if (java.net.URI.create(str).getPath() == null) {
                C0w9.A03("illegal url in gifcache", AnonymousClass001.A0R("missing url path: ", str));
                return false;
            }
            return true;
        } catch (IllegalArgumentException e) {
            C0w9.A06("illegal url in gifcache", AnonymousClass001.A0R("url: ", str), e);
            return false;
        }
    }

    public static final boolean A01(C24261Gv c24261Gv, String str, byte[] bArr) {
        C59732oG ARB = c24261Gv.ARB(str);
        C14360o3.A07(ARB);
        if (ARB.A00 != null) {
            AbstractC71443Ii abstractC71443Ii = (AbstractC71443Ii) ARB.A00();
            abstractC71443Ii.write(bArr);
            abstractC71443Ii.A03();
            return true;
        }
        return false;
    }
}
