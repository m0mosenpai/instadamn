package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9Ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208359Ju extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C1GL A03;
    public final /* synthetic */ C57012jc A04;
    public final /* synthetic */ TargetViewSizeProvider A05;
    public final /* synthetic */ C8XV A06;
    public final /* synthetic */ AnonymousClass840 A07;
    public final /* synthetic */ C8C0 A08;
    public final /* synthetic */ InterfaceC1810081c A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208359Ju(Activity activity, Context context, UserSession userSession, C1GL c1gl, C57012jc c57012jc, TargetViewSizeProvider targetViewSizeProvider, C8XV c8xv, AnonymousClass840 anonymousClass840, C8C0 c8c0, InterfaceC1810081c interfaceC1810081c) {
        super(0);
        this.A01 = context;
        this.A00 = activity;
        this.A02 = userSession;
        this.A09 = interfaceC1810081c;
        this.A07 = anonymousClass840;
        this.A08 = c8c0;
        this.A03 = c1gl;
        this.A06 = c8xv;
        this.A04 = c57012jc;
        this.A05 = targetViewSizeProvider;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A01;
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        InterfaceC1810081c interfaceC1810081c = this.A09;
        AnonymousClass840 anonymousClass840 = this.A07;
        C8C0 c8c0 = this.A08;
        return new C23790Ag1(activity, context, userSession, this.A03, this.A04, this.A05, this.A06, anonymousClass840, c8c0, interfaceC1810081c);
    }
}
