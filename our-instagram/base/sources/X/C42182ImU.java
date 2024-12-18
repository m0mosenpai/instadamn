package X;

import android.content.Context;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.ImU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42182ImU implements C5R5 {
    public final ClipsViewerSource A00;
    public final String A01;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        return AbstractC41705Idb.A01(this.A00, userSession, this.A01, null);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        return AbstractC41705Idb.A01(this.A00, userSession, this.A01, str);
    }

    @Override // X.C5R5
    public final /* synthetic */ void ERc(C37682GiJ c37682GiJ) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void ES6(Context context) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void EcO(String str) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void Eee(InterfaceC120815dY interfaceC120815dY) {
    }

    public C42182ImU(ClipsViewerSource clipsViewerSource, String str) {
        this.A01 = str;
        this.A00 = clipsViewerSource;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
