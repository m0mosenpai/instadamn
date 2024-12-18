package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ImQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42178ImQ implements C5R5 {
    public final String A00;
    public final String A01;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A01;
        String str2 = this.A00;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/reshared_media/");
        A0c.A0H("query", str);
        return AbstractC37303Gc4.A0A(A0c, "max_id", str2);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A01;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/reshared_media/");
        A0c.A0H("query", str2);
        return AbstractC37303Gc4.A0A(A0c, "max_id", str);
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

    public C42178ImQ(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
