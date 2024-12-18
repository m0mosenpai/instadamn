package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Bow, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26599Bow extends AbstractC77583di {
    public final Drawable A00;
    public final ImageView.ScaleType A01;
    public final boolean A02;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        C29041CrU c29041CrU = new C29041CrU(this.A00, this.A01, this.A02);
        final C28969CqK c28969CqK = C28969CqK.A00;
        final C77603dk c77603dk = C77603dk.A00;
        return AbstractC25225BEi.A0g(null, c29041CrU, new C2YP(new InterfaceC50822Vd(c77603dk, c28969CqK) { // from class: X.2Yd
            public final InterfaceC51522Ya A00;
            public final C2V6 A01;
            public final Integer A02;

            {
                C14360o3.A0B(c77603dk, 3);
                C14360o3.A0B(c28969CqK, 4);
                this.A01 = c77603dk;
                this.A00 = c28969CqK;
                this.A02 = C05F.A00;
            }

            @Override // X.InterfaceC50822Vd
            public final boolean AFr() {
                return true;
            }

            @Override // X.InterfaceC50822Vd
            public final /* bridge */ /* synthetic */ Object ALq(Context context) {
                C14360o3.A0B(context, 0);
                return this.A00.ABB(context);
            }

            @Override // X.InterfaceC50822Vd
            public final /* synthetic */ C2Wm D8D(int i) {
                return AbstractC79733hO.A00(this, i);
            }

            @Override // X.InterfaceC50822Vd
            public final Object BeR() {
                return this.A00.getClass();
            }

            @Override // X.InterfaceC50822Vd
            public final C2V6 BeU() {
                return this.A01;
            }

            @Override // X.InterfaceC50822Vd
            public final Integer Bmh() {
                return this.A02;
            }

            @Override // X.InterfaceC50822Vd
            public final int E4c() {
                return 30;
            }
        }, null, new C65075Td4(this, 23), c77993eR.A01()));
    }

    public C26599Bow(Drawable drawable, ImageView.ScaleType scaleType, boolean z) {
        this.A00 = drawable;
        this.A01 = scaleType;
        this.A02 = z;
    }
}
