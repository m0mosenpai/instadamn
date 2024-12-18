package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: X.13i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC215613i extends Resources implements InterfaceC215713j {
    public static boolean A01;
    public Resources A00;

    public static Configuration A00(Configuration configuration) {
        int i;
        if (configuration == null) {
            return null;
        }
        Configuration configuration2 = new Configuration(configuration);
        int i2 = AbstractC51982Zy.A00;
        if (i2 == 2) {
            i = 32;
        } else if (i2 == 1) {
            i = 16;
        } else {
            i = Resources.getSystem().getConfiguration().uiMode & 48;
        }
        int i3 = configuration2.uiMode;
        if (i == (i3 & 48)) {
            return configuration2;
        }
        configuration2.uiMode = i | (i3 & (-49));
        return configuration2;
    }

    public void A02(Locale locale) {
        Configuration configuration = this.A00.getConfiguration();
        if (!locale.equals(configuration.locale)) {
            configuration.locale = locale;
            Resources resources = this.A00;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        configuration.setLayoutDirection(locale);
        Locale.setDefault(locale);
        Configuration configuration2 = this.A00.getConfiguration();
        DisplayMetrics displayMetrics = this.A00.getDisplayMetrics();
        Configuration configuration3 = this.A00.getConfiguration();
        DisplayMetrics displayMetrics2 = this.A00.getDisplayMetrics();
        if (!configuration2.equals(configuration3)) {
            configuration2.setLocale(configuration3.locale);
        } else {
            configuration2 = configuration3;
        }
        if (displayMetrics.equals((Object) getDisplayMetrics())) {
            displayMetrics = displayMetrics2;
        }
        updateConfiguration(configuration2, displayMetrics);
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        if (A01) {
            Resources resources = this.A00;
            if (resources != null) {
                resources.updateConfiguration(A00(resources.getConfiguration()), resources.getDisplayMetrics());
            }
            configuration = A00(configuration);
        }
        super.updateConfiguration(configuration, displayMetrics);
    }

    public final void A01(Configuration configuration) {
        if (!configuration.equals(getConfiguration())) {
            configuration.setLocale(getConfiguration().locale);
            updateConfiguration(configuration, getDisplayMetrics());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC215613i(android.content.Context r8, android.content.res.Resources r9) {
        /*
            r7 = this;
            r0 = 36326060295468647(0x810e5c00003667, double:3.0360850319339144E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto L30
            android.content.res.AssetManager r2 = r9.getAssets()
        L13:
            android.util.DisplayMetrics r1 = r9.getDisplayMetrics()
            android.content.res.Configuration r0 = r9.getConfiguration()
            r7.<init>(r2, r1, r0)
            r7.A00 = r9
            r0 = 36326060295534184(0x810e5c00013668, double:3.03608503197536E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto Ld6
            goto L39
        L30:
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.AssetManager r2 = r0.getAssets()
            goto L13
        L39:
            X.SHz r4 = X.C62596SHz.A04     // Catch: java.lang.Exception -> Lce
            if (r4 != 0) goto L84
            java.lang.String r0 = "android.content.res.ResourcesImpl"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lce
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            r6 = 0
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> Lce
            java.lang.String r0 = "getImpl"
            java.lang.reflect.Method r5 = r2.getDeclaredMethod(r0, r1)     // Catch: java.lang.Exception -> Lce
            r4 = 1
            r5.setAccessible(r4)     // Catch: java.lang.Exception -> Lce
            java.lang.Class[] r1 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> Lce
            java.lang.String r0 = "setImpl"
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r0, r1)     // Catch: java.lang.Exception -> Lce
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> Lce
            java.lang.String r0 = "android.app.ResourcesManager"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lce
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> Lce
            java.lang.String r0 = "getInstance"
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r0, r1)     // Catch: java.lang.Exception -> Lce
            r1.setAccessible(r4)     // Catch: java.lang.Exception -> Lce
            java.lang.String r0 = "mResourceReferences"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.Exception -> Lce
            r0.setAccessible(r4)     // Catch: java.lang.Exception -> Lce
            X.SHz r4 = new X.SHz     // Catch: java.lang.Exception -> Lce
            r4.<init>(r0, r5, r3, r1)     // Catch: java.lang.Exception -> Lce
            X.C62596SHz.A04 = r4     // Catch: java.lang.Exception -> Lce
        L84:
            java.lang.reflect.Method r1 = r4.A02     // Catch: java.lang.Exception -> Lce
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lce
            java.lang.Object r0 = r1.invoke(r9, r0)     // Catch: java.lang.Exception -> Lce
            java.lang.reflect.Method r1 = r4.A03     // Catch: java.lang.Exception -> Lce
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> Lce
            r1.invoke(r7, r0)     // Catch: java.lang.Exception -> Lce
            java.lang.reflect.Method r2 = r4.A01     // Catch: java.lang.Exception -> Lce
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lce
            r0 = 0
            java.lang.Object r1 = r2.invoke(r0, r1)     // Catch: java.lang.Exception -> Lce
            java.lang.reflect.Field r0 = r4.A00     // Catch: java.lang.Exception -> Lce
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Exception -> Lce
            if (r2 == 0) goto Lc6
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Exception -> Lce
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r0 = r1.isAssignableFrom(r0)     // Catch: java.lang.Exception -> Lce
            if (r0 == 0) goto Lbe
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Exception -> Lce
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> Lce
            r0.<init>(r7)     // Catch: java.lang.Exception -> Lce
            r2.add(r0)     // Catch: java.lang.Exception -> Lce
            return
        Lbe:
            java.lang.String r0 = "Unexpected type for mResourceReferences"
            java.lang.ReflectiveOperationException r1 = new java.lang.ReflectiveOperationException     // Catch: java.lang.Exception -> Lce
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lce
            goto Lcd
        Lc6:
            java.lang.String r0 = "Unexpected null value for mResourceReferences"
            java.lang.ReflectiveOperationException r1 = new java.lang.ReflectiveOperationException     // Catch: java.lang.Exception -> Lce
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lce
        Lcd:
            throw r1     // Catch: java.lang.Exception -> Lce
        Lce:
            r2 = move-exception
            java.lang.Class<X.13i> r1 = X.AbstractC215613i.class
            java.lang.String r0 = "Failed to synchronize IgResources"
            X.C0K8.A05(r1, r0, r2)
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC215613i.<init>(android.content.Context, android.content.res.Resources):void");
    }
}
