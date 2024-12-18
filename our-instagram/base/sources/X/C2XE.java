package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.view.View;

/* renamed from: X.2XE, reason: invalid class name */
/* loaded from: classes.dex */
public class C2XE {
    public int A00;
    public AbstractC50812Vc A01;
    public C75703ab A02;
    public C75793ak A03;
    public InterfaceC51012Vx A04;
    public C2Y5 A05;
    public C2XU A06;
    public C2XU A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final C2XH A0D;
    public final ThreadLocal A0E;

    public C2XE(Context context, C75703ab c75703ab, C75793ak c75793ak, InterfaceC51012Vx interfaceC51012Vx, C2XU c2xu, C2XU c2xu2, String str) {
        C2XF A00;
        this.A00 = 0;
        this.A0E = new ThreadLocal();
        C02R.A03(context, "ComponentContext requires a non null Android Context");
        this.A0C = context;
        Configuration configuration = context.getResources().getConfiguration();
        synchronized (C2XF.class) {
            A00 = C2XF.A01.A00(configuration);
        }
        this.A0D = new C2XH(context, A00);
        this.A07 = c2xu;
        if (c75703ab == null) {
            C2V3 c2v3 = C2V3.defaultInstance;
            C14360o3.A0B(c2v3, 1);
            c75703ab = new C75703ab(null, c2v3, C51132Wj.A00(context));
        }
        this.A02 = c75703ab;
        this.A03 = c75793ak;
        this.A08 = str;
        this.A04 = interfaceC51012Vx;
        this.A01 = null;
        this.A06 = c2xu2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r4.A0A != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2XE A00(X.AbstractC50812Vc r3, X.C2XE r4, java.lang.String r5) {
        /*
            X.2XU r0 = r4.A07
            X.2XE r2 = new X.2XE
            r2.<init>(r4, r0)
            r2.A01 = r3
            r2.A08 = r5
            X.2XU r0 = r4.A07
            r2.A06 = r0
            boolean r0 = X.AbstractC50812Vc.A02(r3)
            if (r0 != 0) goto L1a
            boolean r1 = r4.A0A
            r0 = 0
            if (r1 == 0) goto L1b
        L1a:
            r0 = 1
        L1b:
            r2.A0A = r0
            X.2V9 r1 = r4.A04()
            X.C14360o3.A0A(r1)
            X.2Y5 r0 = new X.2Y5
            r0.<init>(r3, r2, r1)
            r2.A05 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2XE.A00(X.2Vc, X.2XE, java.lang.String):X.2XE");
    }

    public static C2XE A01(C2XE c2xe) {
        C2XU A00;
        Context context = c2xe.A0C;
        C2XU c2xu = c2xe.A07;
        if (c2xu == null) {
            A00 = null;
        } else {
            A00 = AbstractC170427iv.A00(c2xu);
        }
        return new C2XE(context, c2xe.A02, null, null, A00, null, null);
    }

    public final TypedArray A02(int i, int[] iArr) {
        Context context = this.A0C;
        if (i == 0) {
            i = 0;
        }
        return context.obtainStyledAttributes(null, iArr, i, this.A00);
    }

    public final C2V9 A04() {
        if (this.A01 != null) {
            try {
                C2Y5 c2y5 = this.A05;
                c2y5.getClass();
                C2V9 c2v9 = c2y5.A01;
                if (c2v9 != null) {
                    return c2v9;
                }
            } catch (IllegalStateException unused) {
                return this.A02.A01.A01;
            }
        }
        return this.A02.A01.A01;
    }

    public final Object A05(Class cls) {
        C2XU c2xu = this.A06;
        if (c2xu == null) {
            return null;
        }
        return c2xu.A00.get(new C170187iX(cls));
    }

    public final Object A06(Class cls) {
        C2XU c2xu = this.A07;
        if (c2xu == null) {
            return null;
        }
        return c2xu.A00.get(new C170187iX(cls));
    }

    public final Object A07(Object obj, String str, int i) {
        C75793ak c75793ak = this.A03;
        if (c75793ak == null) {
            return null;
        }
        return c75793ak.A03.Ajj(obj, str, i, this.A0A);
    }

    public String A08() {
        if (this.A01 != null) {
            String str = this.A08;
            if (str == null) {
                return "undefined";
            }
            return str;
        }
        throw new RuntimeException("getGlobalKey cannot be accessed from a ComponentContext without a scope");
    }

    public final String A09(int i) {
        String A04 = this.A0D.A04(i);
        if (A04 != null) {
            return A04;
        }
        throw new RuntimeException(AnonymousClass001.A0R("String resource not found for ID #0x", Integer.toHexString(i)));
    }

    public void A0A(C125975mo c125975mo) {
        C75793ak c75793ak = this.A03;
        if (c75793ak != null) {
            c75793ak.A03.FCJ(c125975mo, A08(), this.A0A);
        }
    }

    public void A0C(C125975mo c125975mo, String str) {
        String str2 = this.A09;
        if (str2 == null) {
            C75793ak c75793ak = this.A03;
            if (c75793ak != null) {
                c75793ak.A03.FCK(c125975mo, A08(), str, this.A0A);
                return;
            }
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Updating the state of a component during ", str2, " leads to unexpected behaviour, consider using lazy state updates."));
    }

    public final void A0D(Object obj, Object obj2, String str, int i) {
        C75793ak c75793ak = this.A03;
        if (c75793ak != null) {
            c75793ak.A03.E78(obj, obj2, str, i, this.A0A);
        }
    }

    public final View A03(Object obj) {
        C2XV.A00();
        C75793ak c75793ak = this.A03;
        if (c75793ak != null) {
            View BV3 = c75793ak.A02.BV3();
            if (BV3 == null) {
                return null;
            }
            return BV3.findViewWithTag(obj);
        }
        throw new RuntimeException("Calling findViewWithTag on a ComponentContext which isn't associated with a Tree. Make sure it's one received in `render` or `onCreateLayout`");
    }

    public void A0B(C125975mo c125975mo, String str) {
        String str2 = this.A09;
        if (str2 == null) {
            C75793ak c75793ak = this.A03;
            if (c75793ak != null) {
                c75793ak.A03.FCI(c125975mo, A08(), "updateState:RootBloksComponent.onNewTree", this.A0A);
                return;
            }
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Updating the state of a component during ", str2, " leads to unexpected behaviour, consider using lazy state updates."));
    }

    public C2XE(C2XE c2xe, C2XU c2xu) {
        this.A00 = 0;
        this.A0C = c2xe.A0C;
        this.A0D = c2xe.A0D;
        this.A01 = c2xe.A01;
        this.A04 = c2xe.A04;
        this.A03 = c2xe.A03;
        this.A07 = c2xu == null ? c2xe.A07 : c2xu;
        this.A06 = c2xe.A06;
        this.A08 = c2xe.A08;
        this.A0E = c2xe.A0E;
        this.A02 = c2xe.A02;
    }

    public C2XE(Context context) {
        this(context, null, null, null, null, null, null);
    }
}
