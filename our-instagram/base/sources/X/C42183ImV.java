package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository;

/* renamed from: X.ImV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42183ImV implements C5R5 {
    public final String A00;
    public final String A01;
    public final /* synthetic */ PromptPivotPageRepository A02;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A00;
        String str2 = this.A01;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC37301Gc2.A1M(A0c, "clips/prompt_sticker_clips/", str);
        AbstractC37304Gc5.A1B(A0c, "prompt_sticker_id", str2, null);
        return AbstractC25227BEk.A0e(A0c, C38957HDj.class, C41315IQl.class);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A00;
        String str3 = this.A01;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC37301Gc2.A1M(A0c, "clips/prompt_sticker_clips/", str2);
        AbstractC37304Gc5.A1B(A0c, "prompt_sticker_id", str3, str);
        return AbstractC25227BEk.A0e(A0c, C38957HDj.class, C41315IQl.class);
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

    public C42183ImV(PromptPivotPageRepository promptPivotPageRepository, String str, String str2) {
        this.A02 = promptPivotPageRepository;
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
