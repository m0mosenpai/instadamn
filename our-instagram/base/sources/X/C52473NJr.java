package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NJr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52473NJr extends OX6 {
    public final EnumC53117NeU A00;
    public final AbstractC55082Oac A01;
    public final boolean A02;
    public final boolean A03;
    public final UserSession A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52473NJr(UserSession userSession, EnumC53117NeU enumC53117NeU, AbstractC55082Oac abstractC55082Oac, boolean z) {
        super(abstractC55082Oac);
        AbstractC167017dG.A1P(userSession, abstractC55082Oac);
        this.A04 = userSession;
        this.A01 = abstractC55082Oac;
        this.A00 = enumC53117NeU;
        this.A02 = z;
        this.A03 = new C59712oE(userSession).A00();
    }
}
