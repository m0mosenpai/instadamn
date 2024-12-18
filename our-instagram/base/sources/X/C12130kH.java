package X;

import android.content.Context;
import com.facebook.flexiblesampling.SamplingResult;
import java.util.Collections;
import java.util.Random;

/* renamed from: X.0kH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12130kH {
    public static C12130kH A04;
    public C12140kI A00;
    public Random A01 = new Random();
    public final Context A02;
    public volatile C19010wh A03;

    public static synchronized C12140kI A02(C12130kH c12130kH) {
        C12140kI c12140kI;
        synchronized (c12130kH) {
            c12140kI = c12130kH.A00;
            if (c12140kI == null) {
                c12140kI = new C12140kI(c12130kH.A02);
                c12130kH.A00 = c12140kI;
            }
        }
        return c12140kI;
    }

    public static synchronized C12130kH A00() {
        C12130kH c12130kH;
        synchronized (C12130kH.class) {
            c12130kH = A04;
        }
        return c12130kH;
    }

    public static synchronized C12130kH A01(Context context) {
        C12130kH c12130kH;
        synchronized (C12130kH.class) {
            boolean z = false;
            if (A04 == null) {
                z = true;
            }
            C18C.A0E(z);
            c12130kH = new C12130kH(context);
            A04 = c12130kH;
        }
        return c12130kH;
    }

    public final boolean A03(InterfaceC39211ry interfaceC39211ry, C19280xC c19280xC, String str) {
        int i;
        if (c19280xC.A05) {
            return true;
        }
        String str2 = c19280xC.A04;
        if (str2.equals("perf")) {
            return true;
        }
        if (interfaceC39211ry != null) {
            SamplingResult Eiw = interfaceC39211ry.Eiw(str2);
            c19280xC.A01 = Eiw;
            i = Eiw.A00;
        } else {
            C12140kI A02 = A02(this);
            String str3 = c19280xC.A04;
            if (str == null) {
                str = "0";
            }
            C1UM A00 = A02.A00.A00(AnonymousClass001.A0R("ig_pigeon_sampling_policy_v2_", str));
            java.util.Set emptySet = Collections.emptySet();
            C1UP c1up = (C1UP) A00;
            C1UP.A03(c1up);
            synchronized (c1up.A03) {
                try {
                    java.util.Set set = (java.util.Set) c1up.A05.get("__blacklist__");
                    if (set != null) {
                        emptySet = set;
                    }
                } catch (ClassCastException e) {
                    throw C1UP.A00(c1up, e, "__blacklist__");
                }
            }
            if (!emptySet.contains(str3) && (i = A00.getInt(str3, -1)) != -2) {
                if (i == -1) {
                    i = 1;
                }
            } else {
                i = 0;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        c19280xC.A02 = valueOf;
        int intValue = valueOf.intValue();
        if (intValue == 0) {
            return false;
        }
        if (intValue == 1 || this.A01.nextInt(intValue) == 0) {
            return true;
        }
        return false;
    }

    public C12130kH(Context context) {
        this.A02 = context;
    }
}
