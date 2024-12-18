package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mdm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50855Mdm extends C9U7 {
    public final C51761Mtk A00;
    public final UserSession A01;
    public final List A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50855Mdm(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, C51761Mtk c51761Mtk, List list) {
        super(bundle, interfaceC08430c6);
        C14360o3.A0B(list, 3);
        this.A02 = list;
        this.A00 = c51761Mtk;
        this.A01 = AbstractC31171DnF.A0G(bundle);
    }

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        C14360o3.A0B(c152406tQ, 2);
        return new C50931Mf0(c152406tQ, this.A00, this.A01, this.A02);
    }
}
