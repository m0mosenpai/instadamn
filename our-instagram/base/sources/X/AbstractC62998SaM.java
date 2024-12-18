package X;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.SaM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62998SaM {
    public static final Map A04;
    public int A00;
    public int A01;
    public Interpolator A02;
    public Integer A03;

    static {
        EnumC61131Rfl enumC61131Rfl = EnumC61131Rfl.A05;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        EnumC61131Rfl enumC61131Rfl2 = EnumC61131Rfl.A02;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        EnumC61131Rfl enumC61131Rfl3 = EnumC61131Rfl.A04;
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        EnumC61131Rfl enumC61131Rfl4 = EnumC61131Rfl.A03;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        HashMap A12 = AbstractC31174DnI.A12(enumC61131Rfl, linearInterpolator);
        A12.put(enumC61131Rfl2, accelerateInterpolator);
        A12.put(enumC61131Rfl3, decelerateInterpolator);
        A12.put(enumC61131Rfl4, accelerateDecelerateInterpolator);
        A04 = A12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (((int) r18.getY()) != r20) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.animation.Animation A00(android.view.View r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62998SaM.A00(android.view.View, int, int, int, int):android.view.animation.Animation");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0082. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(int r5, com.facebook.react.bridge.ReadableMap r6) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62998SaM.A01(int, com.facebook.react.bridge.ReadableMap):void");
    }

    public final boolean A02() {
        if (this instanceof R6I) {
            return AbstractC167007dF.A1O(this.A01);
        }
        if (this.A01 > 0 && this.A03 != null) {
            return true;
        }
        return false;
    }
}
