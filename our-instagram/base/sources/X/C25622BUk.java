package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BUk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25622BUk extends AbstractC77583di {
    public final ImageView.ScaleType A00;
    public final InterfaceC11380iw A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final InterfaceC73023Pd A04;
    public final InterfaceC59142nF A05;
    public final String A06;
    public final boolean A07;
    public final int A08;
    public final C51722Yv A09;
    public final boolean A0A;

    public C25622BUk(ImageView.ScaleType scaleType, C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, ImageUrl imageUrl2, InterfaceC73023Pd interfaceC73023Pd, InterfaceC59142nF interfaceC59142nF, String str, int i, boolean z, boolean z2) {
        AbstractC167007dF.A1G(imageUrl, 1, interfaceC11380iw);
        this.A03 = imageUrl;
        this.A00 = scaleType;
        this.A06 = str;
        this.A01 = interfaceC11380iw;
        this.A05 = interfaceC59142nF;
        this.A04 = interfaceC73023Pd;
        this.A09 = c51722Yv;
        this.A0A = z;
        this.A07 = z2;
        this.A08 = i;
        this.A02 = imageUrl2;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        if (this.A0A) {
            C1OG A0J = C25821No.A00().A0J(this.A03, this.A01.getModuleName());
            A0J.A0J = true;
            A0J.A01();
        }
        return AbstractC25225BEi.A0g(this.A09, C25624BUm.A00, AbstractC25229BEm.A0c(c77993eR, AbstractC25227BEk.A0d(C25623BUl.A00, this.A08, false), C25625BUn.A00, new C50362MLo(30, c77993eR, this)));
    }
}
