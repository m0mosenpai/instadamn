package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.SiL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63362SiL {
    public static final int[] A09 = {0, 0};
    public Map A06;
    public Map A07;
    public final ViewGroup A08;
    public java.util.Set A05 = AbstractC166987dD.A1H();
    public int A00 = -1;
    public int A03 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public Map A04 = AbstractC166987dD.A1G();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(android.view.MotionEvent r12, X.X9J r13, X.C61576Rpz r14, int r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63362SiL.A01(android.view.MotionEvent, X.X9J, X.Rpz, int):void");
    }

    public final void A04(MotionEvent motionEvent, View view, X9J x9j) {
        if (this.A00 == -1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.A08.getLocationOnScreen(new int[2]);
            obtain.setLocation(motionEvent.getRawX() - r3[0], motionEvent.getRawY() - r3[1]);
            obtain.setAction(3);
            A05(obtain, x9j, false);
            this.A00 = view.getId();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0182, code lost:
    
        if (r8 != false) goto L127;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0153. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ef  */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.SiL] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.X9J] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Rpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.util.List, java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v20, types: [X.Rpz, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(android.view.MotionEvent r22, X.X9J r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63362SiL.A05(android.view.MotionEvent, X.X9J, boolean):void");
    }

    public C63362SiL(ViewGroup viewGroup) {
        this.A08 = viewGroup;
    }

    public static ArrayList A00(EnumC61078Res enumC61078Res, EnumC61078Res enumC61078Res2, List list, boolean z) {
        ArrayList A1F = AbstractC166987dD.A1F(list);
        if (!z) {
            boolean z2 = false;
            for (int size = list.size() - 1; size >= 0; size--) {
                View view = ((SNX) list.get(size)).A01;
                if (!z2) {
                    if (!C63053Sba.A00(view, enumC61078Res2) && !C63053Sba.A00(view, enumC61078Res)) {
                        A1F.remove(size);
                    } else if (C63053Sba.A00(view, enumC61078Res2)) {
                        z2 = true;
                    }
                }
            }
        }
        return A1F;
    }

    public static void A02(MotionEvent motionEvent, X9J x9j, C61576Rpz c61576Rpz, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x9j.APn(R6E.A01(motionEvent, c61576Rpz, str, ((SNX) it.next()).A00));
        }
    }

    public static boolean A03(EnumC61078Res enumC61078Res, EnumC61078Res enumC61078Res2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = ((SNX) it.next()).A01;
            if (C63053Sba.A00(view, enumC61078Res) || C63053Sba.A00(view, enumC61078Res2)) {
                return true;
            }
        }
        return false;
    }
}
