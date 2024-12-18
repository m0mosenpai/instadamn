package X;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.FdB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35100FdB {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r1.length() != 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A01(android.content.Context r2, X.AbstractC12990ll r3) {
        /*
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            java.util.ArrayList r2 = X.AbstractC34340FCi.A00(r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L30
            java.lang.String r1 = A00(r3)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L20
            if (r1 == 0) goto L20
            int r0 = r1.length()
            if (r0 != 0) goto L31
        L20:
            java.lang.String r1 = X.FEW.A00
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L30
            if (r1 == 0) goto L30
            int r0 = r1.length()
            if (r0 != 0) goto L31
        L30:
            return r2
        L31:
            r2.add(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35100FdB.A01(android.content.Context, X.0ll):java.util.ArrayList");
    }

    public static final String A00(AbstractC12990ll abstractC12990ll) {
        Object obj;
        Pair pair;
        String A02 = C36007Fv5.A00().A02(abstractC12990ll, "ig_android_growth_fx_access_fb_ig_prefill_email", "EmailPrefillGenerator");
        if (AbstractC33580Ess.A00 == null) {
            return null;
        }
        Pair pair2 = AbstractC33580Ess.A00;
        if (pair2 != null) {
            obj = pair2.first;
        } else {
            obj = null;
        }
        if (!C14360o3.A0K(obj, A02) || (pair = AbstractC33580Ess.A00) == null) {
            return null;
        }
        return (String) pair.second;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.EtY] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.EtY] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.EtY] */
    public static final ArrayList A02(Context context, AbstractC12990ll abstractC12990ll, Integer num) {
        AbstractC167017dG.A1P(context, abstractC12990ll);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = AbstractC34340FCi.A00(context).iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            C14360o3.A0B(A1B, 1);
            Integer num2 = C05F.A00;
            ?? obj = new Object();
            obj.A02 = A1B;
            obj.A00 = num2;
            obj.A01 = "android_account_manager";
            A1E.add(obj);
        }
        if (num != C05F.A0C && num != C05F.A0N) {
            String A00 = A00(abstractC12990ll);
            if (A00 != null && A00.length() != 0) {
                Integer num3 = C05F.A00;
                ?? obj2 = new Object();
                obj2.A02 = A00;
                obj2.A00 = num3;
                obj2.A01 = "fb_first_party";
                A1E.add(obj2);
            }
            String str = FEW.A00;
            if (str != null && str.length() != 0) {
                Integer num4 = C05F.A00;
                ?? obj3 = new Object();
                obj3.A02 = str;
                obj3.A00 = num4;
                obj3.A01 = "uig_via_phone_id";
                A1E.add(obj3);
            }
        }
        return A1E;
    }
}
