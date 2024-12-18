package X;

import android.content.Context;
import android.os.Process;
import android.os.WorkSource;
import java.lang.reflect.Method;

/* renamed from: X.SdT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63125SdT {
    public static Boolean A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;
    public static final Method A06;
    public static final Method A07;
    public static final Method A08;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Process.myUid();
        Method method8 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        A01 = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        A02 = method2;
        try {
            method3 = AbstractC58318PtA.A0t(WorkSource.class, "size");
        } catch (Exception unused3) {
            method3 = null;
        }
        A03 = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        A05 = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
            method5 = null;
        }
        A04 = method5;
        try {
            method6 = AbstractC58318PtA.A0t(WorkSource.class, "createWorkChain");
        } catch (Exception e) {
            android.util.Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            method6 = null;
        }
        A06 = method6;
        try {
            method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        } catch (Exception e2) {
            android.util.Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            method7 = null;
        }
        A07 = method7;
        try {
            method8 = AbstractC58318PtA.A0t(WorkSource.class, "isEmpty");
            method8.setAccessible(true);
        } catch (Exception unused6) {
        }
        A08 = method8;
    }

    public static synchronized boolean A00(Context context) {
        boolean booleanValue;
        synchronized (C63125SdT.class) {
            Boolean bool = A00;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                boolean z = false;
                if (context == null) {
                    return false;
                }
                if (C02G.A00(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                A00 = valueOf;
                booleanValue = valueOf.booleanValue();
            }
            return booleanValue;
        }
    }
}
