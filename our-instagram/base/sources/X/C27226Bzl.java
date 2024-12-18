package X;

import android.view.View;
import com.instagram.newsfeed.ui.InlineLinkUrn;

/* renamed from: X.Bzl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27226Bzl extends AbstractC85543rj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C27226Bzl(C25282BGy c25282BGy, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        this.A00 = 1;
        this.A01 = interfaceC16660sJ;
        this.A02 = c25282BGy;
        ((AbstractC85543rj) this).A01 = "";
        ((AbstractC85543rj) this).A00 = i;
        ((AbstractC85543rj) this).A02 = (i2 & 1) == 1;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                AbstractC25651Mw.A00((AbstractC12990ll) this.A02).E4s(new C211839aA((C38321qM) this.A01, 1));
                return;
            case 1:
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                C25282BGy c25282BGy = (C25282BGy) this.A02;
                interfaceC16660sJ.invoke(new InlineLinkUrn(c25282BGy.A02, c25282BGy.A03));
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27226Bzl(int i, int i2, Object obj, Object obj2) {
        super(true, i);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
