package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.WoE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71117WoE implements InterfaceC37287Gbo {
    public final /* synthetic */ C5HW A00;

    public C71117WoE(C5HW c5hw) {
        this.A00 = c5hw;
    }

    @Override // X.InterfaceC37287Gbo
    public final String Bho() {
        ImageUrl imageUrl = this.A00.A04.A0E;
        if (imageUrl != null) {
            return imageUrl.getUrl();
        }
        return null;
    }

    @Override // X.InterfaceC37287Gbo
    public final int Bo4() {
        return AbstractC167017dG.A0K(this.A00.A04.A05);
    }
}
