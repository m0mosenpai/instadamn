package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.1Ye, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Ye {
    public InterfaceC28351Yw A00;
    public Executor A01;
    public Executor A02;
    public boolean A03;
    public boolean A04;
    public java.util.Set A07;
    public final Context A0A;
    public final Class A0C;
    public final String A0D;
    public final List A09 = new ArrayList();
    public final List A0E = new ArrayList();
    public List A06 = new ArrayList();
    public boolean A05 = true;
    public final C1Yf A0B = new C1Yf();
    public java.util.Set A08 = new LinkedHashSet();

    public C1Ye(Context context, Class cls, String str) {
        this.A0A = context;
        this.A0C = cls;
        this.A0D = str;
    }

    public final void A01() {
        this.A05 = false;
        this.A03 = true;
    }

    public final void A02(int... iArr) {
        C14360o3.A0B(iArr, 0);
        for (int i : iArr) {
            this.A08.add(Integer.valueOf(i));
        }
    }

    public final void A03(C1Ym... c1YmArr) {
        C14360o3.A0B(c1YmArr, 0);
        if (this.A07 == null) {
            this.A07 = new HashSet();
        }
        int length = c1YmArr.length;
        for (C1Ym c1Ym : c1YmArr) {
            java.util.Set set = this.A07;
            C14360o3.A0A(set);
            set.add(Integer.valueOf(c1Ym.startVersion));
            java.util.Set set2 = this.A07;
            C14360o3.A0A(set2);
            set2.add(Integer.valueOf(c1Ym.endVersion));
        }
        this.A0B.A00((C1Ym[]) Arrays.copyOf(c1YmArr, length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1YP A00() {
        Integer num;
        String A0T;
        ActivityManager activityManager;
        Executor executor = this.A01;
        Executor executor2 = this.A02;
        if (executor == null) {
            if (executor2 == null) {
                executor2 = C72051XLs.A02;
                this.A02 = executor2;
            }
            this.A01 = executor2;
        } else if (executor2 == null) {
            this.A02 = executor;
        }
        java.util.Set set = this.A07;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!(!this.A08.contains(Integer.valueOf(intValue)))) {
                    throw new IllegalArgumentException(AnonymousClass001.A0O("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue));
                }
            }
        }
        InterfaceC28351Yw interfaceC28351Yw = this.A00;
        InterfaceC28351Yw interfaceC28351Yw2 = interfaceC28351Yw;
        if (interfaceC28351Yw == null) {
            interfaceC28351Yw2 = new Object();
        }
        Context context = this.A0A;
        String str = this.A0D;
        C1Yf c1Yf = this.A0B;
        List list = this.A09;
        boolean z = this.A04;
        Object systemService = context.getSystemService("activity");
        if ((systemService instanceof ActivityManager) && (activityManager = (ActivityManager) systemService) != null && !activityManager.isLowRamDevice()) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        Executor executor3 = this.A01;
        if (executor3 != null) {
            Executor executor4 = this.A02;
            if (executor4 != null) {
                C28381Yz c28381Yz = new C28381Yz(context, c1Yf, interfaceC28351Yw2, num, str, list, this.A0E, this.A06, this.A08, executor3, executor4, z, this.A05, this.A03);
                Class cls = this.A0C;
                Package r0 = cls.getPackage();
                C14360o3.A0A(r0);
                String name = r0.getName();
                String canonicalName = cls.getCanonicalName();
                C14360o3.A0A(canonicalName);
                C14360o3.A07(name);
                int length = name.length();
                if (length != 0) {
                    canonicalName = canonicalName.substring(length + 1);
                    C14360o3.A07(canonicalName);
                }
                C14360o3.A0B(canonicalName, 0);
                String replace = canonicalName.replace('.', '_');
                C14360o3.A07(replace);
                String A0R = AnonymousClass001.A0R(replace, "_Impl");
                if (length == 0) {
                    A0T = A0R;
                } else {
                    try {
                        A0T = AnonymousClass001.A0T(name, A0R, '.');
                    } catch (ClassNotFoundException unused) {
                        throw new RuntimeException(AnonymousClass001.A11("Cannot find implementation for ", cls.getCanonicalName(), ". ", A0R, " does not exist"));
                    } catch (IllegalAccessException unused2) {
                        throw new RuntimeException(AnonymousClass001.A0R("Cannot access the constructor ", cls.getCanonicalName()));
                    } catch (InstantiationException unused3) {
                        throw new RuntimeException(AnonymousClass001.A0R("Failed to create an instance of ", cls.getCanonicalName()));
                    }
                }
                Class<?> cls2 = Class.forName(A0T, true, cls.getClassLoader());
                C14360o3.A0C(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                C1YP c1yp = (C1YP) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                c1yp.init(c28381Yz);
                return c1yp;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
