package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.7mD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172447mD extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewStub A01;
    public final /* synthetic */ AbstractC59962oe A02;
    public final /* synthetic */ C1819485e A03;
    public final /* synthetic */ C1810981l A04;
    public final /* synthetic */ TargetViewSizeProvider A05;
    public final /* synthetic */ AnonymousClass840 A06;
    public final /* synthetic */ C172437mC A07;
    public final /* synthetic */ C1828989k A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C172447mD(View view, ViewStub viewStub, AbstractC59962oe abstractC59962oe, C1819485e c1819485e, C1810981l c1810981l, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, C172437mC c172437mC, C1828989k c1828989k, boolean z) {
        super(0);
        this.A07 = c172437mC;
        this.A02 = abstractC59962oe;
        this.A01 = viewStub;
        this.A03 = c1819485e;
        this.A05 = targetViewSizeProvider;
        this.A06 = anonymousClass840;
        this.A00 = view;
        this.A04 = c1810981l;
        this.A08 = c1828989k;
        this.A09 = z;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C172437mC c172437mC = this.A07;
        Context context = c172437mC.A09;
        Activity activity = c172437mC.A08;
        AbstractC59962oe abstractC59962oe = this.A02;
        UserSession userSession = c172437mC.A0C;
        ViewStub viewStub = this.A01;
        C8Q4 c8q4 = c172437mC.A0E;
        C8DN c8dn = c172437mC.A0F;
        C1819485e c1819485e = this.A03;
        TargetViewSizeProvider targetViewSizeProvider = this.A05;
        AnonymousClass840 anonymousClass840 = this.A06;
        AnonymousClass856 anonymousClass856 = c172437mC.A0N;
        return new C8Q6(activity, context, this.A00, viewStub, abstractC59962oe, c1819485e, userSession, this.A04, c8q4, c8dn, targetViewSizeProvider, anonymousClass840, anonymousClass856, c172437mC.A0O, this.A08, R.layout.layout_post_capture_button_share_container_default, this.A09, c172437mC.A0a, c172437mC.A0Z);
    }
}
