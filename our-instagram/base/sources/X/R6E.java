package X;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes10.dex */
public final class R6E extends Sb5 {
    public static final C12550kz A06 = new C12550kz(6);
    public MotionEvent A00;
    public InterfaceC65363Tiv A01;
    public C61576Rpz A02;
    public String A03;
    public List A04;
    public short A05 = -1;

    public static R6E A01(MotionEvent motionEvent, C61576Rpz c61576Rpz, String str, int i) {
        R6E r6e = (R6E) A06.A7H();
        if (r6e == null) {
            r6e = new R6E();
        }
        int i2 = c61576Rpz.A03;
        long eventTime = motionEvent.getEventTime();
        ((Sb5) r6e).A00 = i2;
        ((Sb5) r6e).A02 = i;
        ((Sb5) r6e).A03 = eventTime;
        ((Sb5) r6e).A05 = true;
        r6e.A03 = str;
        r6e.A00 = MotionEvent.obtain(motionEvent);
        r6e.A05 = (short) 0;
        r6e.A02 = c61576Rpz;
        return r6e;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List A02(X.R6E r3) {
        /*
            android.view.MotionEvent r0 = r3.A00
            int r2 = r0.getActionIndex()
            java.lang.String r1 = r3.A03
            int r0 = r1.hashCode()
            switch(r0) {
                case -1786514288: goto L4d;
                case -1780335505: goto L49;
                case -1304584214: goto L45;
                case -1304316135: goto L25;
                case -1304250340: goto L21;
                case -1065042973: goto L1d;
                case -992108237: goto L19;
                case 383186882: goto L15;
                case 1343400710: goto L11;
                default: goto Lf;
            }
        Lf:
            r2 = 0
        L10:
            return r2
        L11:
            java.lang.String r0 = "topPointerOut"
            goto L50
        L15:
            java.lang.String r0 = "topPointerCancel"
            goto L28
        L19:
            java.lang.String r0 = "topClick"
            goto L50
        L1d:
            java.lang.String r0 = "topPointerUp"
            goto L50
        L21:
            java.lang.String r0 = "topPointerOver"
            goto L50
        L25:
            java.lang.String r0 = "topPointerMove"
        L28:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            r1 = 0
        L33:
            android.view.MotionEvent r0 = r3.A00
            int r0 = r0.getPointerCount()
            if (r1 >= r0) goto L10
            com.facebook.react.bridge.WritableNativeMap r0 = r3.A00(r1)
            r2.add(r0)
            int r1 = r1 + 1
            goto L33
        L45:
            java.lang.String r0 = "topPointerDown"
            goto L50
        L49:
            java.lang.String r0 = "topPointerLeave"
            goto L50
        L4d:
            java.lang.String r0 = "topPointerEnter"
        L50:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            com.facebook.react.bridge.WritableNativeMap r0 = r3.A00(r2)
            X.Tqj[] r0 = new X.InterfaceC65657Tqj[]{r0}
            java.util.List r2 = java.util.Arrays.asList(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R6E.A02(X.R6E):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x014d, code lost:
    
        if (r1 != 16) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.react.bridge.WritableNativeMap A00(int r18) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R6E.A00(int):com.facebook.react.bridge.WritableNativeMap");
    }
}
