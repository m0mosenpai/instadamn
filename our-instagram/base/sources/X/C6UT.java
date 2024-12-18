package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6UT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UT extends FrameLayout {
    public List A00;
    public final C6UR A01;
    public final InterfaceC02550Ad A02;
    public final C9BA A03;
    public final C6US A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6UT(Context context, C6UR c6ur, InterfaceC02550Ad interfaceC02550Ad, C9BA c9ba, C6US c6us, List list) {
        super(context);
        C14360o3.A0B(list, 2);
        this.A04 = c6us;
        this.A01 = c6ur;
        this.A03 = c9ba;
        this.A02 = interfaceC02550Ad;
        this.A00 = new ArrayList();
        A01(null, null, list);
    }

    private final FrameLayout.LayoutParams A00(C25991Bef c25991Bef, C38688GzT c38688GzT) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (c38688GzT == null) {
            float width = getWidth();
            float f2 = c25991Bef.A00;
            layoutParams.setMarginStart(C1H4.A01(width * f2));
            Float f3 = c25991Bef.A03;
            if (f3 != null) {
                f2 = 1.0f - f3.floatValue();
            }
            layoutParams.setMarginEnd(C1H4.A01(getWidth() * f2));
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C1H4.A01(getHeight() * c25991Bef.A01);
            Float f4 = c25991Bef.A04;
            if (f4 != null) {
                f = 1.0f - f4.floatValue();
            } else {
                f = 0.0f;
            }
            i = (int) (getHeight() * f);
        } else {
            Number number = (Number) c38688GzT.A02;
            i = 0;
            if (number != null) {
                i2 = number.intValue();
            } else {
                i2 = 0;
            }
            layoutParams.setMarginStart(i2);
            Number number2 = (Number) c38688GzT.A01;
            if (number2 != null) {
                i3 = number2.intValue();
            } else {
                i3 = 0;
            }
            layoutParams.setMarginEnd(i3);
            Number number3 = (Number) c38688GzT.A03;
            if (number3 != null) {
                i4 = number3.intValue();
            } else {
                i4 = 0;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
            Number number4 = (Number) c38688GzT.A00;
            if (number4 != null) {
                i = number4.intValue();
            }
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
        return layoutParams;
    }

    public final void A01(String str, String str2, List list) {
        C14360o3.A0B(list, 0);
        List list2 = this.A00;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            removeView(((C27071Bwv) ((InterfaceC30786DgN) it.next())).A03);
        }
        list2.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C9CI c9ci = (C9CI) it2.next();
            Context context = getContext();
            C14360o3.A07(context);
            C9BA c9ba = this.A03;
            InterfaceC02550Ad interfaceC02550Ad = this.A02;
            C14360o3.A0B(c9ci, 1);
            C14360o3.A0B(c9ba, 2);
            C27071Bwv c27071Bwv = new C27071Bwv(context, interfaceC02550Ad, c9ba, c9ci, str, str2);
            C6UR c6ur = this.A01;
            if (c6ur != null) {
                c27071Bwv.A01 = c6ur;
            }
            addView(c27071Bwv.A03, A00((C25991Bef) c9ci.A03, (C38688GzT) c9ci.A02));
            list2.add(c27071Bwv);
        }
        A02(false, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r2 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(boolean r8, float r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.A00
            java.util.Iterator r6 = r0.iterator()
        L6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r5 = r6.next()
            X.DgN r5 = (X.InterfaceC30786DgN) r5
            X.Bwv r5 = (X.C27071Bwv) r5
            X.9CI r0 = r5.A06
            java.lang.Object r2 = r0.A05
            X.MWo r2 = (X.C50627MWo) r2
            if (r2 == 0) goto L46
            java.lang.Object r0 = r2.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L46
            long r0 = r0.longValue()
            float r4 = (float) r0
        L27:
            java.lang.Object r0 = r2.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L4a
            long r0 = r0.longValue()
            float r3 = (float) r0
        L32:
            android.view.View r2 = r5.A03
            r1 = 0
            if (r8 != 0) goto L43
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 > 0) goto L43
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 > 0) goto L43
        L3f:
            r2.setVisibility(r1)
            goto L6
        L43:
            r1 = 8
            goto L3f
        L46:
            r4 = 0
            if (r2 == 0) goto L4a
            goto L27
        L4a:
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L32
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6UT.A02(boolean, float):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                C27071Bwv c27071Bwv = (C27071Bwv) ((InterfaceC30786DgN) it.next());
                View view = c27071Bwv.A03;
                C9CI c9ci = c27071Bwv.A06;
                view.setLayoutParams(A00((C25991Bef) c9ci.A03, (C38688GzT) c9ci.A02));
            }
        }
    }
}
