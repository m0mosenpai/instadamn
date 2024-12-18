package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository;

/* renamed from: X.HHe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39054HHe extends AbstractC61132qb {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC018607g A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C39054HHe(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        this.A03 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = context;
        this.A02 = interfaceC11380iw;
        this.A01 = abstractC018607g;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A03;
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A00);
        String str = this.A04;
        String str2 = this.A05;
        String str3 = this.A06;
        return new C38320GtF(userSession, new PromptPivotPageRepository(this.A00, this.A01, this.A02, userSession, IZA.A00, str2, str3), A00, str);
    }
}
