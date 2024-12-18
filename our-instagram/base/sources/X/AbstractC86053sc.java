package X;

import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.3sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86053sc {
    public static final C3h2 A00 = new C3h2() { // from class: X.3sd
        @Override // X.C3h2
        public final void D3H(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        }

        @Override // X.C3h2
        public final void D9l(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        }

        @Override // X.C3h2
        public final void DWg(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3se, java.lang.Object] */
    public static final C86073se A00(ViewStub viewStub) {
        ?? obj = new Object();
        obj.A00 = viewStub;
        obj.A01 = null;
        obj.A04 = null;
        obj.A07 = null;
        obj.A06 = null;
        obj.A05 = null;
        obj.A02 = null;
        obj.A08 = null;
        obj.A03 = null;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r15 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C74843Xy r12, X.AnonymousClass791 r13, X.C86073se r14, int[] r15, boolean r16) {
        /*
            r3 = 0
            X.C14360o3.A0B(r14, r3)
            com.instagram.feed.widget.IgProgressImageView r2 = r14.A07
            if (r2 == 0) goto L3b
            r4 = 0
            r11 = 0
            r0 = 127(0x7f, float:1.78E-43)
            X.7Qs r1 = new X.7Qs
            r1.<init>(r4, r0)
            java.lang.Integer r0 = X.C05F.A00
            r1.A02(r12, r0)
            android.graphics.drawable.ShapeDrawable r7 = new android.graphics.drawable.ShapeDrawable
            r7.<init>(r1)
            r9 = r15
            if (r16 == 0) goto L3c
            if (r15 == 0) goto L52
            int r1 = r15.length
            r0 = 1
            if (r1 <= r0) goto L3e
            r10 = 1145044992(0x44400000, float:768.0)
            android.graphics.drawable.shapes.Shape r8 = r7.getShape()
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            android.graphics.Paint$Cap r5 = android.graphics.Paint.Cap.BUTT
            X.AbstractC148406mA.A01(r4, r5, r6, r7, r8, r9, r10, r11)
        L31:
            r2.setBackground(r7)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.getIgImageView()
            r0.setImageRendererAndReset(r13)
        L3b:
            return
        L3c:
            if (r15 == 0) goto L52
        L3e:
            java.lang.Integer r0 = X.AbstractC009903n.A04(r15, r3)
            if (r0 == 0) goto L52
            int r0 = r0.intValue()
        L48:
            android.graphics.drawable.shapes.Shape r3 = r7.getShape()
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            X.AbstractC148406mA.A02(r1, r7, r3, r11, r0)
            goto L31
        L52:
            android.content.Context r1 = r2.getContext()
            r0 = 2131099780(0x7f060084, float:1.7811923E38)
            int r0 = r1.getColor(r0)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86053sc.A01(X.3Xy, X.791, X.3se, int[], boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.InterfaceC11380iw r10, X.C116355Oo r11, X.C86073se r12, float[] r13, boolean r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86053sc.A02(X.0iw, X.5Oo, X.3se, float[], boolean, boolean, boolean):void");
    }

    public static final void A03(C86073se c86073se) {
        FrameLayout frameLayout;
        if (c86073se != null && (frameLayout = c86073se.A01) != null) {
            frameLayout.setVisibility(8);
        }
    }

    public static final void A04(C86073se c86073se) {
        IgdsMediaButton igdsMediaButton = c86073se.A08;
        if (igdsMediaButton != null) {
            igdsMediaButton.setVisibility(8);
        }
        TextView textView = c86073se.A06;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = c86073se.A05;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }
}
