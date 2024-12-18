package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* renamed from: X.9kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218049kc extends ACt {
    public int A00;
    public Drawable A01;
    public SparseArray A02;
    public C202668xk A03;
    public List A04;
    public final Context A05;
    public final View A06;
    public final UserSession A07;
    public final TargetViewSizeProvider A08;
    public final C88Y A09;
    public final C23108AGw A0A;
    public final C8FC A0B;
    public final C8FC A0C;

    public C218049kc(Context context, View view, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C88Y c88y) {
        AbstractC167007dF.A1E(c88y, 1, userSession);
        AbstractC167017dG.A1S(view, targetViewSizeProvider);
        this.A09 = c88y;
        this.A05 = context;
        this.A07 = userSession;
        this.A06 = view;
        this.A08 = targetViewSizeProvider;
        Integer num = C05F.A00;
        this.A0B = new C8FC((C8D0) null, (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 0.7f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, true, true, true, true, true, false, false);
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A0F = true;
        c23108AGw.A04 = 0.7f;
        c23108AGw.A0R = false;
        this.A0A = c23108AGw;
        this.A0C = new C8FC((C8D0) null, (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, false, false, true, true, false, false, false, true, true, true, true, true, false, false);
        this.A04 = C16930sl.A00;
        this.A02 = new SparseArray();
    }

    public static final void A00(C5GJ c5gj, C218049kc c218049kc, int i) {
        if (c218049kc.A00 == i) {
            C88Y c88y = c218049kc.A09;
            if (c88y.A0L(c218049kc)) {
                Drawable drawable = c218049kc.A01;
                if (drawable == null) {
                    drawable = AbstractC226049yN.A00(c218049kc.A05, 0.65f);
                    c218049kc.A01 = drawable;
                }
                c88y.A0C(drawable, c218049kc.A0C, true);
                Medium medium = (Medium) c218049kc.A02.get(i, null);
                C38321qM c38321qM = (C38321qM) c218049kc.A04.get(i);
                if (medium == null) {
                    Context context = c218049kc.A05;
                    C121275eQ A03 = AbstractC50633MWu.A03(context, c218049kc.A07, AbstractC50633MWu.A05(context, c38321qM, "CanvasMentionsController", false, false));
                    A03.A00 = new C215919h7(i, 0, c5gj, c218049kc, c38321qM);
                    C1GJ.A03(A03);
                    return;
                }
                Context context2 = c218049kc.A05;
                ExtendedImageUrl A1q = c38321qM.A1q(context2);
                InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c218049kc.A08).A0K;
                C202728xq c202728xq = new C202728xq(context2, null, medium, A1q, C8OK.A0A, null, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight(), false, true, false, false);
                c202728xq.A9I(new C23679AeE(i, 0, c5gj, medium, c202728xq, c218049kc, c38321qM));
            }
        }
    }
}
