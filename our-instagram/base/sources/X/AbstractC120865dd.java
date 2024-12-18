package X;

import android.graphics.Region;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5dd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC120865dd {
    public static final C114205Dh A00 = new C114205Dh(0.0f, 0.0f, 10.0f, 10.0f);

    public static final String A03(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final C127055oj A01(C113505An c113505An) {
        InterfaceC16660sJ interfaceC16660sJ;
        ArrayList arrayList = new ArrayList();
        C120895dg c120895dg = (C120895dg) C5B6.A00(c113505An, AbstractC120875de.A08);
        if (c120895dg == null || (interfaceC16660sJ = (InterfaceC16660sJ) c120895dg.A01) == null || !((Boolean) interfaceC16660sJ.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C127055oj) arrayList.get(0);
    }

    public static final BT9 A02(C137456Kq c137456Kq, int i) {
        Object obj;
        Iterator it = c137456Kq.A01.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((AnonymousClass599) ((Map.Entry) obj).getKey()).A01 == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (BT9) entry.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r6.A0A == null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.5b8, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(android.graphics.Region r14, android.graphics.Region r15, X.C18750w2 r16, X.C113525Ap r17, X.C113525Ap r18) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC120865dd.A04(android.graphics.Region, android.graphics.Region, X.0w2, X.5Ap, X.5Ap):void");
    }

    public static final boolean A05(C113525Ap c113525Ap) {
        C113505An c113505An = c113525Ap.A05;
        if (!c113505An.A01) {
            java.util.Set keySet = c113505An.A02.keySet();
            if ((keySet instanceof Collection) && keySet.isEmpty()) {
                return false;
            }
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                if (((C113565At) it.next()).A00) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final C18750w2 A00(C113455Ah c113455Ah) {
        C113525Ap A002 = c113455Ah.A00();
        C18750w2 c18750w2 = C01N.A00;
        C18750w2 c18750w22 = new C18750w2(6);
        AnonymousClass599 anonymousClass599 = A002.A04;
        if (anonymousClass599.A0U.A0J.A0F && anonymousClass599.A0A != null) {
            C114205Dh A03 = A002.A03();
            A04(new Region(Math.round(A03.A01), Math.round(A03.A03), Math.round(A03.A02), Math.round(A03.A00)), new Region(), c18750w22, A002, A002);
        }
        return c18750w22;
    }
}
