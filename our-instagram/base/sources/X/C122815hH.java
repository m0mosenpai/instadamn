package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.5hH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122815hH implements InterfaceC122825hI {
    public final long A00;
    public final C122845hK A01;
    public final C122585gt A02;
    public final CharSequence A03;
    public final List A04;
    public final int A05;

    @Override // X.InterfaceC122825hI
    public final void E3G(C6L5 c6l5, AnonymousClass585 anonymousClass585, C122215gH c122215gH, AbstractC119825bg abstractC119825bg, C122205gG c122205gG, float f, int i) {
        C122605gv c122605gv = this.A02.A05;
        int i2 = c122605gv.A00;
        c122605gv.A03(c6l5, f, C5YB.A00(Constraints.A01(this.A00), BDQ()));
        c122605gv.A04(c122215gH);
        c122605gv.A06(c122205gG);
        c122605gv.A05(abstractC119825bg);
        c122605gv.A01(3);
        A00(anonymousClass585, this);
        c122605gv.A01(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0256, code lost:
    
        if (r12 <= r30.A01.A09.getEllipsisStart(r13)) goto L127;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:145:0x0296. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0213  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.0sl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C122815hH(X.C122585gt r31, int r32, long r33, boolean r35) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122815hH.<init>(X.5gt, int, long, boolean):void");
    }

    @Override // X.InterfaceC122825hI
    public final float BDQ() {
        int height;
        C122845hK c122845hK = this.A01;
        boolean z = c122845hK.A0B;
        Layout layout = c122845hK.A09;
        if (z) {
            height = layout.getLineBottom(c122845hK.A06 - 1);
        } else {
            height = layout.getHeight();
        }
        return height + c122845hK.A07 + c122845hK.A04 + c122845hK.A05;
    }

    @Override // X.InterfaceC122825hI
    public final long Bk1(C114205Dh c114205Dh, InterfaceC31100Dli interfaceC31100Dli, int i) {
        C122845hK c122845hK = this.A01;
        RectF A01 = AbstractC28289Cdb.A01(c114205Dh);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        int i2 = 0;
        if (!z && i == 1) {
            i2 = 1;
        }
        int[] A07 = c122845hK.A07(A01, new C30193DRy(interfaceC31100Dli, 14), i2);
        if (A07 == null) {
            return C5C2.A01;
        }
        return C60Z.A00(A07[0], A07[1]);
    }

    public static final void A00(AnonymousClass585 anonymousClass585, C122815hH c122815hH) {
        Canvas A00 = AnonymousClass597.A00(anonymousClass585);
        C122845hK c122845hK = c122815hH.A01;
        boolean z = c122845hK.A0B;
        if (z) {
            A00.save();
            A00.clipRect(0.0f, 0.0f, Constraints.A01(c122815hH.A00), c122815hH.BDQ());
        }
        if (A00.getClipBounds(c122845hK.A08)) {
            int i = c122845hK.A07;
            if (i != 0) {
                A00.translate(0.0f, i);
            }
            C122745hA c122745hA = AbstractC122735h9.A01;
            c122745hA.A00 = A00;
            c122845hK.A09.draw(c122745hA);
            if (i != 0) {
                A00.translate(0.0f, (-1.0f) * i);
            }
        }
        if (z) {
            A00.restore();
        }
    }
}
