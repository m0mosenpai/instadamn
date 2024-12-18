package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;

/* loaded from: classes5.dex */
public final class D0X implements InterfaceC31056Dkw, InterfaceC31025DkO {
    public final C51759Mti A00;
    public final C51759Mti A01;
    public final /* synthetic */ InterfaceC31056Dkw A02;

    @Override // X.InterfaceC31056Dkw
    public final void CKX(ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C38663Gz4 c38663Gz4, String str, int i) {
        AbstractC167027dH.A12(instagramMidcardType, clipsMidCardSubtype, c38663Gz4);
        C14360o3.A0B(str, 4);
        this.A02.CKX(clipsMidCardSubtype, instagramMidcardType, c38663Gz4, str, i);
    }

    @Override // X.InterfaceC31056Dkw
    public final void EXD(InterfaceC16570sA interfaceC16570sA) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31056Dkw
    public final void EXm(InterfaceC16600sD interfaceC16600sD) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31056Dkw
    public final void EXt(InterfaceC16620sF interfaceC16620sF) {
        throw C00O.createAndThrow();
    }

    public D0X(C51759Mti c51759Mti, C51759Mti c51759Mti2, InterfaceC31056Dkw interfaceC31056Dkw) {
        this.A02 = interfaceC31056Dkw;
        this.A00 = c51759Mti;
        this.A01 = c51759Mti2;
    }

    @Override // X.InterfaceC31025DkO
    public final C51759Mti BgM() {
        return this.A00;
    }

    @Override // X.InterfaceC31025DkO
    public final C51759Mti BrV() {
        return this.A01;
    }
}
