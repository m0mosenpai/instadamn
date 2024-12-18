package X;

import android.content.Context;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;

/* renamed from: X.ImS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42180ImS implements C5R5 {
    public final AudioPageAssetModel A00;
    public final boolean A01;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        return C41748IeM.A00.A04(this.A00, userSession, null, this.A01);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        return C41748IeM.A00.A04(this.A00, userSession, str, this.A01);
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

    public C42180ImS(AudioPageAssetModel audioPageAssetModel, boolean z) {
        this.A00 = audioPageAssetModel;
        this.A01 = z;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
