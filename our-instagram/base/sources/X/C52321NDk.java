package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* renamed from: X.NDk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52321NDk extends AbstractC61132qb {
    public final C8BN A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final MusicProduct A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final C50669MYn A06;

    public C52321NDk(C8BN c8bn, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, AbstractC59962oe abstractC59962oe, UserSession userSession, C50669MYn c50669MYn) {
        AbstractC167007dF.A1H(userSession, 2, c50669MYn);
        this.A04 = abstractC59962oe;
        this.A05 = userSession;
        this.A03 = musicProduct;
        this.A02 = immutableList;
        this.A01 = immutableList2;
        this.A00 = c8bn;
        this.A06 = c50669MYn;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        AbstractC59962oe abstractC59962oe = this.A04;
        UserSession userSession = this.A05;
        MusicProduct musicProduct = this.A03;
        return new C51055Mh9(this.A00, this.A02, this.A01, musicProduct, abstractC59962oe, userSession, this.A06);
    }
}
