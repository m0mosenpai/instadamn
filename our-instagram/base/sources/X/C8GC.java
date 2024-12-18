package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.config.MusicAttributionConfig;

/* renamed from: X.8GC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GC extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AbstractC59962oe A03;
    public final /* synthetic */ C1815283f A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C1810981l A06;
    public final /* synthetic */ TargetViewSizeProvider A07;
    public final /* synthetic */ C8GA A08;
    public final /* synthetic */ C8G3 A09;
    public final /* synthetic */ C8GB A0A;
    public final /* synthetic */ AnonymousClass856 A0B;
    public final /* synthetic */ AnonymousClass844 A0C;
    public final /* synthetic */ MusicAttributionConfig A0D;
    public final /* synthetic */ C677733r A0E;
    public final /* synthetic */ C8GD A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8GC(Drawable drawable, View view, AbstractC59962oe abstractC59962oe, C1815283f c1815283f, UserSession userSession, C1810981l c1810981l, TargetViewSizeProvider targetViewSizeProvider, C8GA c8ga, C8G3 c8g3, C8GB c8gb, AnonymousClass856 anonymousClass856, AnonymousClass844 anonymousClass844, MusicAttributionConfig musicAttributionConfig, C677733r c677733r, C8GD c8gd, int i) {
        super(0);
        this.A02 = view;
        this.A03 = abstractC59962oe;
        this.A09 = c8g3;
        this.A08 = c8ga;
        this.A05 = userSession;
        this.A04 = c1815283f;
        this.A0C = anonymousClass844;
        this.A0E = c677733r;
        this.A0B = anonymousClass856;
        this.A0D = musicAttributionConfig;
        this.A00 = i;
        this.A06 = c1810981l;
        this.A0A = c8gb;
        this.A07 = targetViewSizeProvider;
        this.A0F = c8gd;
        this.A01 = drawable;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view = this.A02;
        AbstractC59962oe abstractC59962oe = this.A03;
        C8G3 c8g3 = this.A09;
        C8GA c8ga = this.A08;
        UserSession userSession = this.A05;
        C1815283f c1815283f = this.A04;
        AnonymousClass844 anonymousClass844 = this.A0C;
        C677733r c677733r = this.A0E;
        AnonymousClass856 anonymousClass856 = this.A0B;
        MusicAttributionConfig musicAttributionConfig = this.A0D;
        int i = this.A00;
        C1810981l c1810981l = this.A06;
        C8GB c8gb = this.A0A;
        return new C189788ax(this.A01, view, abstractC59962oe, c1815283f, userSession, c1810981l, this.A07, c8ga, c8g3, c8gb, anonymousClass856, anonymousClass844, musicAttributionConfig, c677733r, this.A0F, i);
    }
}
