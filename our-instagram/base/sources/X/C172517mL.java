package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7mL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172517mL implements C1NJ {
    public Drawable A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;

    public C172517mL(Drawable drawable, ImageUrl imageUrl, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C14360o3.A0B(str, 2);
        this.A01 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
        this.A00 = drawable;
        if (imageUrl != null) {
            C1OG A0J = C25821No.A00().A0J(imageUrl, str);
            A0J.A02(this);
            A0J.A01();
        }
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            Drawable drawable = (Drawable) this.A01.invoke(bitmap);
            this.A00 = drawable;
            this.A02.invoke(drawable);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }
}
