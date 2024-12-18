package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;

/* renamed from: X.BWg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25670BWg implements InterfaceC31056Dkw, InterfaceC31025DkO {
    public InterfaceC16820sZ A00;
    public InterfaceC16820sZ A01;
    public final UserSession A02;
    public final BWU A03;
    public final C37522Gfe A04;
    public final C51759Mti A05;
    public final /* synthetic */ InterfaceC31056Dkw A06;

    @Override // X.InterfaceC31025DkO
    public final C51759Mti BrV() {
        return null;
    }

    @Override // X.InterfaceC31056Dkw
    public final void CKX(ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C38663Gz4 c38663Gz4, String str, int i) {
        AbstractC167027dH.A12(instagramMidcardType, clipsMidCardSubtype, c38663Gz4);
        C14360o3.A0B(str, 4);
        this.A06.CKX(clipsMidCardSubtype, instagramMidcardType, c38663Gz4, str, i);
    }

    @Override // X.InterfaceC31056Dkw
    public final void EXD(InterfaceC16570sA interfaceC16570sA) {
        C14360o3.A0B(interfaceC16570sA, 0);
        this.A06.EXD(interfaceC16570sA);
    }

    @Override // X.InterfaceC31056Dkw
    public final void EXm(InterfaceC16600sD interfaceC16600sD) {
        C14360o3.A0B(interfaceC16600sD, 0);
        this.A06.EXm(interfaceC16600sD);
    }

    @Override // X.InterfaceC31056Dkw
    public final void EXt(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        this.A06.EXt(interfaceC16620sF);
    }

    public C25670BWg(UserSession userSession, BWU bwu, InterfaceC31056Dkw interfaceC31056Dkw, C37522Gfe c37522Gfe) {
        this.A06 = interfaceC31056Dkw;
        this.A02 = userSession;
        this.A04 = c37522Gfe;
        this.A03 = bwu;
        this.A05 = new C51759Mti(new BIE(this, 52), bwu.A02 ? 2131963888 : 2131963728);
    }

    @Override // X.InterfaceC31025DkO
    public final C51759Mti BgM() {
        return this.A05;
    }
}
