package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.Imc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42190Imc implements InterfaceC31149Dmt {
    public final C5R5 A00;
    public final String A01;

    public C42190Imc(C5R5 c5r5, String str) {
        C14360o3.A0B(c5r5, 2);
        this.A01 = str;
        this.A00 = c5r5;
    }

    @Override // X.InterfaceC31149Dmt
    public final C1ON AfC(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A01;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/direct_thread_clips/");
        A0c.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A0c.A0D("limit", 6);
        return AbstractC37303Gc4.A0A(A0c, "media_cursor_timestamp_ms", str);
    }

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        return this.A00.BDA(userSession, z);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        return this.A00.C57(userSession, str);
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

    @Override // X.C5R5
    public final boolean CUz(boolean z) {
        return this.A00.CUz(z);
    }
}
