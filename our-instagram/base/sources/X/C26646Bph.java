package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;

/* renamed from: X.Bph, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26646Bph extends AbstractC77583di {
    public static final C51532Yb A09 = AbstractC25227BEk.A0d(C29023CrC.A00, 5, false);
    public final int A00;
    public final int A01;
    public final InterfaceC11380iw A02;
    public final ImageUrl A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final HashMap A07;
    public final C51722Yv A08;

    public C26646Bph(C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, String str, String str2, String str3, HashMap hashMap, int i, int i2) {
        C14360o3.A0B(hashMap, 3);
        AbstractC167017dG.A1T(str2, interfaceC11380iw);
        C14360o3.A0B(str3, 10);
        this.A04 = str;
        this.A03 = imageUrl;
        this.A07 = hashMap;
        this.A01 = i;
        this.A06 = str2;
        this.A02 = interfaceC11380iw;
        this.A00 = i2;
        this.A08 = c51722Yv;
        this.A05 = str3;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        return AbstractC25225BEi.A0g(this.A08, C29063Crq.A00, AbstractC25229BEm.A0c(c77993eR, A09, DGK.A00, DRY.A00(this, c77993eR, 38)));
    }
}
