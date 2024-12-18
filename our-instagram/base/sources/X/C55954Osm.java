package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Osm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55954Osm implements C3WI {
    public final /* synthetic */ ExtendedImageUrl A00;
    public final /* synthetic */ MUB A01;
    public final /* synthetic */ String A02;

    public C55954Osm(ExtendedImageUrl extendedImageUrl, MUB mub, String str) {
        this.A01 = mub;
        this.A00 = extendedImageUrl;
        this.A02 = str;
    }

    @Override // X.C3WI
    public final void DLK(C25821No c25821No) {
        C14360o3.A0B(c25821No, 0);
        UserSession userSession = this.A01.A0A;
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        boolean A06 = C18U.A06(A0j, userSession, 36319978623344522L);
        boolean A062 = C18U.A06(A0j, userSession, 36319978623410059L);
        C1OG A0J = c25821No.A0J(this.A00, this.A02);
        A0J.A0I = A06;
        A0J.A0G = A062;
        A0J.A01();
    }
}
