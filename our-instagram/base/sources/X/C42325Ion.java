package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Ion, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42325Ion implements InterfaceC66482zP {
    public final C38681GzM A00;
    public final IHN A01;
    public final String A02;

    public C42325Ion(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        C38681GzM c38681GzM = new C38681GzM(imageUrl, imageUrl2, num, str2, z);
        IHN ihn = new IHN(interfaceC11380iw, interfaceC16820sZ, interfaceC16820sZ2);
        this.A02 = str;
        this.A00 = c38681GzM;
        this.A01 = ihn;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38681GzM c38681GzM;
        C42325Ion c42325Ion = (C42325Ion) obj;
        C38681GzM c38681GzM2 = this.A00;
        if (c42325Ion != null) {
            c38681GzM = c42325Ion.A00;
        } else {
            c38681GzM = null;
        }
        return C14360o3.A0K(c38681GzM2, c38681GzM);
    }
}
