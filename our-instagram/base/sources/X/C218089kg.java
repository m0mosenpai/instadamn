package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.9kg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218089kg extends ACt implements C1NJ {
    public int A00;
    public Bitmap A01;
    public Drawable A02;
    public Drawable A03;
    public List A04;
    public final Context A05;
    public final View A06;
    public final UserSession A07;
    public final C88Y A08;
    public final TargetViewSizeProvider A09;
    public final C8FC A0A;
    public final C8FC A0B;

    public C218089kg(Context context, View view, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C88Y c88y) {
        AbstractC167007dF.A1E(c88y, 1, userSession);
        AbstractC167017dG.A1S(view, targetViewSizeProvider);
        this.A08 = c88y;
        this.A05 = context;
        this.A07 = userSession;
        this.A06 = view;
        this.A09 = targetViewSizeProvider;
        Integer num = C05F.A00;
        this.A0A = new C8FC((C8D0) null, (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, true, true, true, true, true, false, false);
        this.A0B = new C8FC((C8D0) null, (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, false, false, false, true, false, false, false, true, true, true, true, true, false, false);
        this.A04 = C16930sl.A00;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    public final void A0A() {
        JM1 jm1 = (JM1) this.A04.get(this.A00);
        this.A01 = null;
        C1OG A0J = C25821No.A00().A0J(new SimpleImageUrl(jm1.BGu()), null);
        A0J.A02(this);
        A0J.A08 = Integer.valueOf(this.A00);
        A0J.A01();
        AnonymousClass229.A01(this.A07).A0v(EnumC223439ta.TEMPLATES, jm1.C5f());
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
        C88Y c88y = this.A08;
        if (c88y.A0L(this)) {
            Drawable drawable = this.A03;
            if (drawable == null) {
                drawable = AbstractC226049yN.A00(this.A05, 0.65f);
                this.A03 = drawable;
            }
            c88y.A0C(drawable, this.A0B, true);
        }
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        boolean A1a = AbstractC167017dG.A1a(interfaceC59502nt, c73033Pe);
        Object C4x = interfaceC59502nt.C4x();
        if (C4x != null) {
            if (C4x.equals(Integer.valueOf(this.A00))) {
                C88Y c88y = this.A08;
                if (!c88y.A0L(this)) {
                    c88y.A08(this.A03);
                    return;
                }
                Bitmap bitmap = c73033Pe.A01;
                if (bitmap != null) {
                    this.A01 = AbstractC226439z0.A00(bitmap, this.A09);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(this.A05.getResources(), this.A01);
                    this.A02 = bitmapDrawable;
                    c88y.A0C(bitmapDrawable, this.A0A, A1a);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
