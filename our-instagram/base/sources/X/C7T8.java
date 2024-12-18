package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7T8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7T8 {
    public final UserSession A00;
    public final Map A01 = new LinkedHashMap();
    public final C158857Ax A02;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
    
        if (r4 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(com.instagram.common.ui.widget.imageview.IgImageView r10, X.InterfaceC65702y7 r11, X.InterfaceC56392iX r12, X.C47Z r13, java.lang.Object r14, X.InterfaceC09390do r15) {
        /*
            r9 = this;
            r5 = 1
            X.C14360o3.A0B(r10, r5)
            r0 = 2
            X.C14360o3.A0B(r12, r0)
            r0 = 4
            X.C14360o3.A0B(r15, r0)
            com.instagram.common.session.UserSession r3 = r9.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328714585390830(0x8110c600023eee, double:3.0377636155686706E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L76
            boolean r0 = r12.CWW()
            if (r0 != 0) goto L24
            if (r13 != 0) goto L24
        L23:
            return
        L24:
            boolean r4 = A01(r9, r13)
            if (r13 == 0) goto L63
            if (r4 == 0) goto L63
            android.view.View r1 = r12.getView()
            r0 = 2131443548(0x7f0b3f5c, float:1.8509167E38)
            android.view.View r1 = r1.findViewById(r0)
            com.instagram.feed.widget.IgProgressImageViewProgressBar r1 = (com.instagram.feed.widget.IgProgressImageViewProgressBar) r1
            X.C14360o3.A0A(r1)
            java.lang.String r3 = r13.A35
            r0 = 0
            r1.setProgress(r0)
            X.Luq r2 = new X.Luq
            r2.<init>(r1, r13)
            r13.A0W(r2)
            java.util.Map r1 = r9.A01
            X.0e4 r0 = new X.0e4
            r0.<init>(r3, r2)
            r1.put(r14, r0)
            X.AbstractC158867Ay.A00(r10, r5)
            java.lang.Object r0 = r15.getValue()
            X.3Xy r0 = (X.C74843Xy) r0
            r9.A00(r0, r10)
            r10.setImageRendererAndReset(r11)
        L63:
            boolean r0 = r12.CWW()
            if (r0 == 0) goto L23
            android.view.View r1 = r12.getView()
            r0 = 8
            if (r4 == 0) goto L72
            r0 = 0
        L72:
            r1.setVisibility(r0)
            return
        L76:
            java.lang.Object r0 = r15.getValue()
            X.3Xy r0 = (X.C74843Xy) r0
            X.791 r7 = X.AbstractC1580577p.A04(r0, r10)
            java.lang.Object r8 = r15.getValue()
            X.3Xy r8 = (X.C74843Xy) r8
            android.view.View r1 = r12.getView()
            r0 = 2131443548(0x7f0b3f5c, float:1.8509167E38)
            android.view.View r6 = r1.findViewById(r0)
            com.instagram.feed.widget.IgProgressImageViewProgressBar r6 = (com.instagram.feed.widget.IgProgressImageViewProgressBar) r6
            boolean r4 = A01(r9, r13)
            if (r13 == 0) goto Lc9
            if (r4 == 0) goto Lcc
            X.C14360o3.A0A(r6)
            java.lang.String r3 = r13.A35
            r0 = 0
            r6.setProgress(r0)
            X.Luq r2 = new X.Luq
            r2.<init>(r6, r13)
            r13.A0W(r2)
            java.util.Map r1 = r9.A01
            X.0e4 r0 = new X.0e4
            r0.<init>(r3, r2)
            r1.put(r14, r0)
            X.AbstractC158867Ay.A00(r10, r5)
            r9.A00(r8, r10)
            r10.setImageRendererAndReset(r7)
        Lbf:
            r0 = 0
        Lc0:
            r6.setVisibility(r0)
            r0 = r4 ^ 1
            r6.setIndeterminate(r0)
            return
        Lc9:
            if (r4 == 0) goto Lcc
            goto Lbf
        Lcc:
            r0 = 8
            goto Lc0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7T8.A02(com.instagram.common.ui.widget.imageview.IgImageView, X.2y7, X.2iX, X.47Z, java.lang.Object, X.0do):void");
    }

    public static final boolean A01(C7T8 c7t8, C47Z c47z) {
        if (c47z != null && ((c47z.A11() || c47z.A0z()) && AbstractC210079Qv.A00(c47z))) {
            if (C18U.A06(C06090Tz.A05, c7t8.A00, 36323560624696681L)) {
                return true;
            }
        }
        return false;
    }

    public final void A03(Object obj) {
        C47Z A03;
        C09530e4 c09530e4 = (C09530e4) this.A01.remove(obj);
        if (c09530e4 != null && (A03 = C25A.A00(this.A00).A03((String) c09530e4.A00)) != null) {
            A03.A0X((InterfaceC65982ya) c09530e4.A01);
        }
    }

    public C7T8(UserSession userSession, C158857Ax c158857Ax) {
        this.A00 = userSession;
        this.A02 = c158857Ax;
    }

    private final void A00(C74843Xy c74843Xy, IgImageView igImageView) {
        View view;
        Object parent = igImageView.getParent();
        if ((parent instanceof FrameLayout) && (view = (View) parent) != null) {
            Context context = igImageView.getContext();
            C162817Qs c162817Qs = new C162817Qs(null, StringTreeSet.MAX_SYMBOL_COUNT);
            c162817Qs.A02(c74843Xy, C05F.A00);
            ShapeDrawable shapeDrawable = new ShapeDrawable(c162817Qs);
            AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_on_media_panavision)));
            view.setForeground(shapeDrawable);
        }
    }
}
