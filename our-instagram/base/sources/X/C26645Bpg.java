package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bpg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26645Bpg extends AbstractC77583di {
    public static final C51532Yb A09 = AbstractC25232BEp.A1B(C28999Cqo.A00);
    public final float A00;
    public final int A01;
    public final int A02;
    public final ImageView.ScaleType A03;
    public final InterfaceC11380iw A04;
    public final ImageUrl A05;
    public final boolean A06;
    public final C51722Yv A07;
    public final boolean A08;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        if (this.A08) {
            C1OG A0J = C25821No.A00().A0J(this.A05, this.A04.getModuleName());
            A0J.A0I = false;
            A0J.A0J = true;
            A0J.A01();
        }
        return AbstractC25225BEi.A0g(this.A07, C29058Crl.A00, AbstractC25229BEm.A0c(c77993eR, A09, C29798DCq.A00, new C50362MLo(32, c77993eR, this)));
    }

    public C26645Bpg(ImageView.ScaleType scaleType, C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, float f, int i, int i2, boolean z, boolean z2) {
        AbstractC167017dG.A1P(imageUrl, interfaceC11380iw);
        this.A05 = imageUrl;
        this.A04 = interfaceC11380iw;
        this.A00 = f;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = scaleType;
        this.A07 = c51722Yv;
        this.A06 = z;
        this.A08 = z2;
    }
}
