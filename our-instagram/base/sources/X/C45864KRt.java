package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This is slated to be merged with GenericXmaMessageItemDefinitionShimViewHolder.")
/* renamed from: X.KRt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45864KRt extends AbstractC161677Mc {
    public final UserSession A00;
    public final C48966LlF A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.LlF] */
    public C45864KRt(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, AnonymousClass988 anonymousClass988, KIQ kiq, C7IM c7im) {
        super(kiq.createViewHolder(layoutInflater, viewGroup), kiq);
        C14360o3.A0B(kiq, 3);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new Object();
    }

    @Override // X.AbstractC161677Mc
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A04(C7VC c7vc) {
        C14360o3.A0B(c7vc, 0);
        C48966LlF c48966LlF = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48966LlF.AWm(A03, userSession, this.A02, c7vc, this.A03, c18a, false);
    }
}
