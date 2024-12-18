package X;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Map;

/* renamed from: X.Skf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63460Skf implements Handler.Callback {
    public static final C61690Rs5 A0A = new C61690Rs5();
    public final Handler A00;
    public final SAU A01;
    public final SDI A07;
    public final C61690Rs5 A08;
    public volatile Sv5 A09;
    public final Map A02 = AbstractC166987dD.A1G();
    public final Map A03 = AbstractC166987dD.A1G();
    public final C20030yX A06 = new C005001p(0);
    public final C20030yX A05 = new C005001p(0);
    public final Bundle A04 = AbstractC166987dD.A0b();

    public static Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static FragmentC58696Q0z A01(FragmentManager fragmentManager, C63460Skf c63460Skf) {
        Map map = c63460Skf.A02;
        FragmentC58696Q0z fragmentC58696Q0z = (FragmentC58696Q0z) map.get(fragmentManager);
        if (fragmentC58696Q0z == null) {
            FragmentC58696Q0z fragmentC58696Q0z2 = (FragmentC58696Q0z) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (fragmentC58696Q0z2 == null) {
                FragmentC58696Q0z fragmentC58696Q0z3 = new FragmentC58696Q0z();
                map.put(fragmentManager, fragmentC58696Q0z3);
                fragmentManager.beginTransaction().add(fragmentC58696Q0z3, "com.bumptech.glide.manager").commitAllowingStateLoss();
                AbstractC58318PtA.A1F(c63460Skf.A00, fragmentManager, 1);
                return fragmentC58696Q0z3;
            }
            return fragmentC58696Q0z2;
        }
        return fragmentC58696Q0z;
    }

    public static C58763Q7s A02(AbstractC10360h2 abstractC10360h2, C63460Skf c63460Skf) {
        Map map = c63460Skf.A03;
        C58763Q7s c58763Q7s = (C58763Q7s) map.get(abstractC10360h2);
        if (c58763Q7s == null) {
            C58763Q7s c58763Q7s2 = (C58763Q7s) abstractC10360h2.A0Q("com.bumptech.glide.manager");
            if (c58763Q7s2 == null) {
                C58763Q7s c58763Q7s3 = new C58763Q7s();
                map.put(abstractC10360h2, c58763Q7s3);
                C14240no c14240no = new C14240no(abstractC10360h2);
                c14240no.A0B(c58763Q7s3, "com.bumptech.glide.manager");
                c14240no.A01();
                AbstractC58318PtA.A1F(c63460Skf.A00, abstractC10360h2, 2);
                return c58763Q7s3;
            }
            return c58763Q7s2;
        }
        return c58763Q7s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r0.isFinishing() == false) goto L21;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Tfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Tkw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.Sv5 A03(android.content.Context r7) {
        /*
            r6 = this;
            if (r7 == 0) goto Lb9
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L8a
            boolean r0 = r7 instanceof android.app.Application
            if (r0 != 0) goto L8a
            boolean r0 = r7 instanceof androidx.fragment.app.FragmentActivity
            if (r0 != 0) goto L83
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 == 0) goto L69
            android.app.Activity r7 = (android.app.Activity) r7
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L64
            boolean r0 = r7 instanceof androidx.fragment.app.FragmentActivity
            if (r0 != 0) goto L83
            boolean r0 = r7.isDestroyed()
            if (r0 != 0) goto L5d
            android.app.FragmentManager r1 = r7.getFragmentManager()
            android.app.Activity r0 = A00(r7)
            if (r0 == 0) goto L3f
            boolean r0 = r0.isFinishing()
            r4 = 0
            if (r0 != 0) goto L40
        L3f:
            r4 = 1
        L40:
            X.Q0z r3 = A01(r1, r6)
            X.Sv5 r5 = r3.A00
            if (r5 != 0) goto L5c
            X.Sju r2 = X.ComponentCallbacks2C63416Sju.A00(r7)
            X.Sv1 r1 = r3.A02
            X.Tfe r0 = r3.A03
            X.Sv5 r5 = new X.Sv5
            r5.<init>(r7, r2, r1, r0)
            if (r4 == 0) goto L5a
            r5.onStart()
        L5a:
            r3.A00 = r5
        L5c:
            return r5
        L5d:
            java.lang.String r0 = "You cannot start a load for a destroyed activity"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L64:
            android.content.Context r0 = r7.getApplicationContext()
            goto L7e
        L69:
            boolean r0 = r7 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L8a
            r1 = r7
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r0 = r1.getBaseContext()
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 == 0) goto L8a
            android.content.Context r0 = r1.getBaseContext()
        L7e:
            X.Sv5 r5 = r6.A03(r0)
            return r5
        L83:
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            X.Sv5 r5 = r6.A04(r7)
            return r5
        L8a:
            r5 = r6
            X.Sv5 r0 = r6.A09
            if (r0 != 0) goto Lb6
            monitor-enter(r5)
            X.Sv5 r0 = r6.A09     // Catch: java.lang.Throwable -> Lb3
            if (r0 != 0) goto Lb1
            android.content.Context r0 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> Lb3
            X.Sju r4 = X.ComponentCallbacks2C63416Sju.A00(r0)     // Catch: java.lang.Throwable -> Lb3
            X.Sv0 r3 = new X.Sv0     // Catch: java.lang.Throwable -> Lb3
            r3.<init>()     // Catch: java.lang.Throwable -> Lb3
            X.Sv6 r2 = new X.Sv6     // Catch: java.lang.Throwable -> Lb3
            r2.<init>()     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r1 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> Lb3
            X.Sv5 r0 = new X.Sv5     // Catch: java.lang.Throwable -> Lb3
            r0.<init>(r1, r4, r3, r2)     // Catch: java.lang.Throwable -> Lb3
            r6.A09 = r0     // Catch: java.lang.Throwable -> Lb3
        Lb1:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb3
            goto Lb6
        Lb3:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb3
            throw r0
        Lb6:
            X.Sv5 r5 = r6.A09
            return r5
        Lb9:
            java.lang.String r0 = "You cannot start a load on a null Context"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63460Skf.A03(android.content.Context):X.Sv5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        C63869Sv1 c63869Sv1;
        String str2;
        Message obtainMessage;
        Map map;
        Object obj;
        Map map2;
        Object obj2;
        Object obj3;
        boolean z = false;
        boolean z2 = true;
        boolean A1P = AbstractC167007dF.A1P(message.arg1, 1);
        int i = message.what;
        Object obj4 = null;
        if (i != 1) {
            if (i != 2) {
                obj3 = null;
                z2 = false;
            } else {
                AbstractC10360h2 abstractC10360h2 = (AbstractC10360h2) message.obj;
                Map map3 = this.A03;
                C58763Q7s c58763Q7s = (C58763Q7s) map3.get(abstractC10360h2);
                C58763Q7s c58763Q7s2 = (C58763Q7s) abstractC10360h2.A0Q("com.bumptech.glide.manager");
                obj = abstractC10360h2;
                map = map3;
                if (c58763Q7s2 != c58763Q7s) {
                    if (c58763Q7s2 != null && c58763Q7s2.A00 != null) {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("We've added two fragments with requests! Old: ");
                        A1C.append(c58763Q7s2);
                        throw AbstractC43594JPz.A0o(c58763Q7s, " New: ", A1C);
                    }
                    str = "RMRetriever";
                    if (!A1P && !abstractC10360h2.A0G) {
                        C14240no c14240no = new C14240no(abstractC10360h2);
                        c14240no.A0B(c58763Q7s, "com.bumptech.glide.manager");
                        if (c58763Q7s2 != null) {
                            c14240no.A03(c58763Q7s2);
                        }
                        c14240no.A06();
                        obtainMessage = this.A00.obtainMessage(2, 1, 0, abstractC10360h2);
                        obtainMessage.sendToTarget();
                        android.util.Log.isLoggable(str, 3);
                        obj3 = null;
                    } else {
                        if (abstractC10360h2.A0G) {
                            if (android.util.Log.isLoggable("RMRetriever", 5)) {
                                android.util.Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                            }
                        } else if (android.util.Log.isLoggable("RMRetriever", 6)) {
                            android.util.Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
                        }
                        c63869Sv1 = c58763Q7s.A02;
                        obj2 = abstractC10360h2;
                        map2 = map3;
                        c63869Sv1.A00();
                        obj = obj2;
                        map = map2;
                    }
                }
                obj4 = map.remove(obj);
                z = true;
                obj3 = obj;
            }
        } else {
            FragmentManager fragmentManager = (FragmentManager) message.obj;
            Map map4 = this.A02;
            FragmentC58696Q0z fragmentC58696Q0z = (FragmentC58696Q0z) map4.get(fragmentManager);
            FragmentC58696Q0z fragmentC58696Q0z2 = (FragmentC58696Q0z) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            obj = fragmentManager;
            map = map4;
            if (fragmentC58696Q0z2 != fragmentC58696Q0z) {
                if (fragmentC58696Q0z2 != null && fragmentC58696Q0z2.A00 != null) {
                    StringBuilder A1C2 = AbstractC166987dD.A1C();
                    A1C2.append("We've added two fragments with requests! Old: ");
                    A1C2.append(fragmentC58696Q0z2);
                    throw AbstractC43594JPz.A0o(fragmentC58696Q0z, " New: ", A1C2);
                }
                str = "RMRetriever";
                if (!A1P && !fragmentManager.isDestroyed()) {
                    FragmentTransaction add = fragmentManager.beginTransaction().add(fragmentC58696Q0z, "com.bumptech.glide.manager");
                    if (fragmentC58696Q0z2 != null) {
                        add.remove(fragmentC58696Q0z2);
                    }
                    add.commitAllowingStateLoss();
                    obtainMessage = this.A00.obtainMessage(1, 1, 0, fragmentManager);
                    obtainMessage.sendToTarget();
                    android.util.Log.isLoggable(str, 3);
                    obj3 = null;
                } else {
                    if (android.util.Log.isLoggable("RMRetriever", 5)) {
                        if (fragmentManager.isDestroyed()) {
                            str2 = "Parent was destroyed before our Fragment could be added";
                        } else {
                            str2 = "Tried adding Fragment twice and failed twice, giving up!";
                        }
                        android.util.Log.w("RMRetriever", str2);
                    }
                    c63869Sv1 = fragmentC58696Q0z.A02;
                    obj2 = fragmentManager;
                    map2 = map4;
                    c63869Sv1.A00();
                    obj = obj2;
                    map = map2;
                }
            }
            obj4 = map.remove(obj);
            z = true;
            obj3 = obj;
        }
        if (android.util.Log.isLoggable("RMRetriever", 5) && z && obj4 == null) {
            android.util.Log.w("RMRetriever", AbstractC167017dG.A0n(obj3, "Failed to remove expected request manager fragment, manager: ", AbstractC166987dD.A1C()));
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01p, X.0yX] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.01p, X.0yX] */
    public C63460Skf(SAU sau) {
        C61690Rs5 c61690Rs5 = A0A;
        this.A08 = c61690Rs5;
        this.A01 = sau;
        this.A00 = new Handler(Looper.getMainLooper(), this);
        this.A07 = new SDI(c61690Rs5);
        if (C63171SeW.A04) {
            sau.A00.containsKey(C61679Rrt.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0.isFinishing() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.Sv5 A04(androidx.fragment.app.FragmentActivity r11) {
        /*
            r10 = this;
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L94
            boolean r0 = r11.isDestroyed()
            if (r0 != 0) goto L8d
            X.0h2 r2 = r11.getSupportFragmentManager()
            android.app.Activity r0 = A00(r11)
            if (r0 == 0) goto L21
            boolean r0 = r0.isFinishing()
            r9 = 0
            if (r0 != 0) goto L22
        L21:
            r9 = 1
        L22:
            X.SAU r0 = r10.A01
            java.lang.Class<X.Rrs> r1 = X.C61678Rrs.class
            java.util.Map r0 = r0.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L70
            android.content.Context r8 = r11.getApplicationContext()
            X.Sju r7 = X.ComponentCallbacks2C63416Sju.A00(r8)
            X.SDI r6 = r10.A07
            X.07T r5 = r11.getLifecycle()
            X.0h2 r3 = r11.getSupportFragmentManager()
            X.C63375Sim.A04()
            X.C63375Sim.A04()
            java.util.Map r2 = r6.A00
            java.lang.Object r4 = r2.get(r5)
            X.Sv5 r4 = (X.Sv5) r4
            if (r4 != 0) goto L6f
            X.Sv2 r1 = new X.Sv2
            r1.<init>(r5)
            X.Sv7 r0 = new X.Sv7
            r0.<init>(r3, r6)
            X.Sv5 r4 = new X.Sv5
            r4.<init>(r8, r7, r1, r0)
            r2.put(r5, r4)
            X.Sv4 r0 = new X.Sv4
            r0.<init>(r5, r6)
            r1.A8y(r0)
            if (r9 == 0) goto L6f
            r4.onStart()
        L6f:
            return r4
        L70:
            X.Q7s r3 = A02(r2, r10)
            X.Sv5 r4 = r3.A00
            if (r4 != 0) goto L6f
            X.Sju r2 = X.ComponentCallbacks2C63416Sju.A00(r11)
            X.Sv1 r1 = r3.A02
            X.Tfe r0 = r3.A03
            X.Sv5 r4 = new X.Sv5
            r4.<init>(r11, r2, r1, r0)
            if (r9 == 0) goto L8a
            r4.onStart()
        L8a:
            r3.A00 = r4
            return r4
        L8d:
            java.lang.String r0 = "You cannot start a load for a destroyed activity"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L94:
            android.content.Context r0 = r11.getApplicationContext()
            X.Sv5 r4 = r10.A03(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63460Skf.A04(androidx.fragment.app.FragmentActivity):X.Sv5");
    }
}
