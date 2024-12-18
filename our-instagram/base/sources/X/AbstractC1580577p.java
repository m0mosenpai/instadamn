package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.77p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1580577p {
    public static void A06(Drawable drawable, View view, C7QL c7ql, boolean z) {
        A07(drawable, c7ql, z, false, c7ql.A07);
        view.setBackground(drawable);
    }

    public static int A00(C7QL c7ql) {
        C7IM c7im = c7ql.A03;
        boolean z = c7ql.A07;
        C14360o3.A0B(c7im, 0);
        return AbstractC162737Qk.A04(c7im, z).A07;
    }

    public static C74843Xy A01(Context context, C7QL c7ql) {
        return AbstractC162737Qk.A03(context, c7ql.A03, c7ql.A04, c7ql.A07, c7ql.A00, c7ql.A01);
    }

    public static AnonymousClass791 A02(C74843Xy c74843Xy) {
        C162817Qs c162817Qs = new C162817Qs();
        float[] fArr = c74843Xy.A01;
        float f = fArr[6];
        float f2 = fArr[7];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f;
        fArr[7] = f2;
        C74843Xy.A01(c74843Xy);
        c162817Qs.A02(c74843Xy, C05F.A00);
        return new AnonymousClass791(c162817Qs, AnonymousClass790.A00);
    }

    public static AnonymousClass791 A03(C74843Xy c74843Xy) {
        C162817Qs c162817Qs = new C162817Qs();
        float[] fArr = c74843Xy.A01;
        float f = fArr[4];
        float f2 = fArr[5];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = f;
        fArr[5] = f2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        C74843Xy.A01(c74843Xy);
        c162817Qs.A02(c74843Xy, C05F.A00);
        return new AnonymousClass791(c162817Qs, AnonymousClass790.A00);
    }

    public static AnonymousClass791 A04(C74843Xy c74843Xy, IgImageView igImageView) {
        AnonymousClass791 anonymousClass791;
        InterfaceC59152nG interfaceC59152nG = igImageView.A0I;
        if (interfaceC59152nG instanceof AnonymousClass791) {
            anonymousClass791 = (AnonymousClass791) interfaceC59152nG;
            C162817Qs A00 = anonymousClass791.A04.A00();
            if (A00 != null) {
                C14360o3.A0B(c74843Xy, 0);
                A00.A02(c74843Xy, C05F.A00);
                igImageView.setImageRendererAndReset(anonymousClass791);
                return anonymousClass791;
            }
        }
        C162817Qs c162817Qs = new C162817Qs();
        C14360o3.A0B(c74843Xy, 0);
        c162817Qs.A02(c74843Xy, C05F.A00);
        anonymousClass791 = new AnonymousClass791(c162817Qs, AnonymousClass790.A00);
        igImageView.setImageRendererAndReset(anonymousClass791);
        return anonymousClass791;
    }

    public static void A07(Drawable drawable, C7QL c7ql, boolean z, boolean z2, boolean z3) {
        C7IM c7im = c7ql.A03;
        C7R2 A01 = AbstractC162807Qr.A01(c7ql.A00, c7ql.A01);
        drawable.getClass();
        AbstractC162737Qk.A06(drawable, null, A01, c7im, z3, z, z2, c7ql.A09, false);
    }

    public static AnonymousClass791 A05(IgImageView igImageView, C7QL c7ql) {
        return A04(AbstractC162737Qk.A03(igImageView.getContext(), c7ql.A03, c7ql.A04, c7ql.A07, c7ql.A00, c7ql.A01), igImageView);
    }
}
