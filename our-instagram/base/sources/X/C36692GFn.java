package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.GFn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36692GFn implements InterfaceC169327h6 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ Map A02;

    public C36692GFn(UserSession userSession, List list, Map map) {
        this.A00 = userSession;
        this.A01 = list;
        this.A02 = map;
    }

    @Override // X.InterfaceC169327h6
    public final C1ON AN3(String str) {
        C14360o3.A0B(str, 0);
        return FUe.A00(this.A00, str, this.A01, this.A02);
    }
}
