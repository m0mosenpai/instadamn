package X;

import android.text.TextUtils;
import com.google.common.collect.ComparatorOrdering;
import java.util.Comparator;

/* renamed from: X.4VA, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4VA extends C4VB {
    public static final C4VF A04 = new ComparatorOrdering(new Comparator() { // from class: X.4VD
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Number number = (Number) obj2;
            int intValue = ((Number) obj).intValue();
            if (intValue == -1) {
                if (number.intValue() != -1) {
                    return -1;
                }
                return 0;
            }
            int intValue2 = number.intValue();
            int i = intValue - intValue2;
            if (intValue2 != -1) {
                return i;
            }
            return 1;
        }
    });
    public static final C4VF A05 = new ComparatorOrdering(new Comparator() { // from class: X.4VG
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return 0;
        }
    });
    public C96394Ux A01;
    public final C4V8 A02;
    public final Object A03 = new Object();
    public C4UX A00 = C4UX.A02;

    public static void A01(C4VA c4va) {
        synchronized (c4va.A03) {
        }
    }

    @Override // X.C4VC
    public final void A02() {
        synchronized (this.A03) {
        }
        super.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r0 != r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair A03(X.C96394Ux r32, X.C97214Yg r33, int[] r34, int[][][] r35) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4VA.A03(X.4Ux, X.4Yg, int[], int[][][]):android.util.Pair");
    }

    public final C96394Ux A04() {
        C96394Ux c96394Ux;
        synchronized (this.A03) {
            c96394Ux = this.A01;
        }
        return c96394Ux;
    }

    public final void A05(C96414Uz c96414Uz) {
        boolean z;
        C96394Ux c96394Ux = new C96394Ux(c96414Uz);
        synchronized (this.A03) {
            z = false;
            if (!this.A01.equals(c96394Ux)) {
                z = true;
            }
            this.A01 = c96394Ux;
        }
        if (z) {
            if (c96394Ux.A0A) {
                AbstractC46512Bo.A04("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            InterfaceC96704Wf interfaceC96704Wf = ((C4VC) this).A00;
            if (interfaceC96704Wf != null) {
                interfaceC96704Wf.Dum();
            }
        }
    }

    public C4VA(C4V8 c4v8, C96404Uy c96404Uy) {
        this.A02 = c4v8;
        C96394Ux c96394Ux = (C96394Ux) c96404Uy;
        this.A01 = c96394Ux;
        if (c96394Ux.A0A) {
            AbstractC46512Bo.A04("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int A00(C4B6 c4b6, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c4b6.A0V)) {
            return 4;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            str = null;
        }
        String str2 = c4b6.A0V;
        if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "und")) {
            str2 = null;
        }
        if (str2 != null && str != null) {
            if (!str2.startsWith(str) && !str.startsWith(str2)) {
                if (!str2.split("-", 2)[0].equals(str.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z || str2 != null) {
            return 0;
        }
        return 1;
    }
}
