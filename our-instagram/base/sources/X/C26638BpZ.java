package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;

/* renamed from: X.BpZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26638BpZ extends AbstractC77583di {
    public static final C51532Yb A07 = AbstractC25227BEk.A0d(C29018Cr7.A00, 5, false);
    public final int A00;
    public final int A01;
    public final InterfaceC11380iw A02;
    public final ImageUrl A03;
    public final String A04;
    public final HashMap A05;
    public final C51722Yv A06;

    public C26638BpZ(C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, String str, HashMap hashMap, int i, int i2) {
        AbstractC25233BEq.A0w(1, hashMap, str, interfaceC11380iw);
        this.A05 = hashMap;
        this.A01 = i;
        this.A04 = str;
        this.A02 = interfaceC11380iw;
        this.A00 = i2;
        this.A03 = imageUrl;
        this.A06 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        return AbstractC25225BEi.A0g(this.A06, C29061Cro.A00, AbstractC25229BEm.A0c(c77993eR, A07, C29880DFu.A00, DRX.A00(this, 13)));
    }
}
