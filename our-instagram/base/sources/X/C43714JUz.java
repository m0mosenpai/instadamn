package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.JUz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43714JUz implements InterfaceC28041Xi {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ DirectThreadKey A01;

    public C43714JUz(UserSession userSession, DirectThreadKey directThreadKey) {
        this.A00 = userSession;
        this.A01 = directThreadKey;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        C83403nh c83403nh = (C83403nh) obj;
        C1345366c A00 = AbstractC1345266b.A00(this.A00);
        DirectThreadKey directThreadKey = this.A01;
        C14360o3.A0A(c83403nh);
        return A00.A02(c83403nh, directThreadKey, false);
    }
}
