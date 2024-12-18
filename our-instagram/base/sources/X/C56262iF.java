package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* renamed from: X.2iF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56262iF implements InterfaceC56272iG {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ConstraintLayout A06;
    public final /* synthetic */ ConstraintLayout A07;

    public static boolean A00(int lastMeasureSpec, int spec, int widgetSize) {
        if (lastMeasureSpec != spec) {
            int mode = View.MeasureSpec.getMode(lastMeasureSpec);
            View.MeasureSpec.getSize(lastMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode2 == 1073741824) {
                if ((mode != Integer.MIN_VALUE && mode != 0) || widgetSize != size) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public C56262iF(final ConstraintLayout this$0, ConstraintLayout l) {
        this.A07 = this$0;
        this.A06 = l;
    }

    @Override // X.InterfaceC56272iG
    public final void APF() {
        ConstraintLayout constraintLayout = this.A06;
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            constraintLayout.getChildAt(i2);
        }
        ArrayList arrayList = constraintLayout.A0E;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        do {
            arrayList.get(i);
            i++;
        } while (i < size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0273, code lost:
    
        if (r3 != (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0188, code lost:
    
        if (r5 == X.C05F.A00) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0192, code lost:
    
        if (r3 == X.C05F.A00) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019f, code lost:
    
        if (r21.A01 <= 0.0f) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ab, code lost:
    
        if (r21.A01 <= 0.0f) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d4, code lost:
    
        if (r14 != r22.A05) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f0, code lost:
    
        if (r2 != false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b1  */
    @Override // X.InterfaceC56272iG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cp9(X.C56082hw r21, X.C56132i1 r22) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56262iF.Cp9(X.2hw, X.2i1):void");
    }
}
