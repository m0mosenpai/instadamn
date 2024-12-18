package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bw4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27024Bw4 extends AbstractC61132qb {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C27024Bw4(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50929Mey(this.A00, this.A01);
    }
}
