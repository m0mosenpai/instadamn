package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class D0Y implements InterfaceC31056Dkw, InterfaceC31025DkO {
    public InterfaceC16620sF A00;
    public InterfaceC16610sE A01;
    public final C51759Mti A02;
    public final UserSession A03;
    public final C30T A04;
    public final BVC A05;
    public final C26250BjJ A06;
    public final C37522Gfe A07;

    @Override // X.InterfaceC31025DkO
    public final C51759Mti BrV() {
        return null;
    }

    @Override // X.InterfaceC31056Dkw
    public final void CKX(ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C38663Gz4 c38663Gz4, String str, int i) {
        AbstractC167027dH.A12(instagramMidcardType, clipsMidCardSubtype, c38663Gz4);
        C14360o3.A0B(str, 4);
        this.A05.CKX(clipsMidCardSubtype, instagramMidcardType, c38663Gz4, str, i);
    }

    @Override // X.InterfaceC31056Dkw
    public final void EXD(InterfaceC16570sA interfaceC16570sA) {
        C14360o3.A0B(interfaceC16570sA, 0);
        this.A05.A02 = interfaceC16570sA;
    }

    @Override // X.InterfaceC31056Dkw
    public final void EXm(InterfaceC16600sD interfaceC16600sD) {
        C14360o3.A0B(interfaceC16600sD, 0);
        this.A05.A01 = interfaceC16600sD;
    }

    @Override // X.InterfaceC31056Dkw
    public final void EXt(InterfaceC16620sF interfaceC16620sF) {
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.30T] */
    public /* synthetic */ D0Y(UserSession userSession, BVC bvc, C26250BjJ c26250BjJ, C37522Gfe c37522Gfe) {
        List list;
        C111034zF c111034zF;
        C38321qM c38321qM;
        ?? obj = new Object();
        this.A07 = c37522Gfe;
        this.A03 = userSession;
        this.A06 = c26250BjJ;
        this.A05 = bvc;
        this.A04 = obj;
        C26143BhU c26143BhU = c26250BjJ.A01.A07;
        C51759Mti c51759Mti = null;
        if (c26143BhU != null && (list = c26143BhU.A03) != null && (c111034zF = (C111034zF) AbstractC001800i.A0O(list, 0)) != null && (c38321qM = c111034zF.A00) != null) {
            c51759Mti = new C51759Mti(new D8I(21, c38321qM, this), this.A06.A03 ? 2131963730 : 2131963719);
        }
        this.A02 = c51759Mti;
    }

    @Override // X.InterfaceC31025DkO
    public final C51759Mti BgM() {
        return this.A02;
    }
}
