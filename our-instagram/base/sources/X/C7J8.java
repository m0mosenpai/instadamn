package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.7J8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7J8 implements C3Ow {
    public final InterfaceC56392iX A00;
    public final GradientSpinnerAvatarView A01;

    public C7J8(InterfaceC56392iX interfaceC56392iX, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        C14360o3.A0B(gradientSpinnerAvatarView, 1);
        C14360o3.A0B(interfaceC56392iX, 2);
        this.A01 = gradientSpinnerAvatarView;
        this.A00 = interfaceC56392iX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C3AY r11, X.InterfaceC11380iw r12, com.instagram.common.session.UserSession r13, final X.C7J6 r14, final com.instagram.direct.model.messaginguser.MessagingUser r15, final com.instagram.model.reels.Reel r16, java.util.List r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7J8.A00(X.3AY, X.0iw, com.instagram.common.session.UserSession, X.7J6, com.instagram.direct.model.messaginguser.MessagingUser, com.instagram.model.reels.Reel, java.util.List, int, int, boolean, boolean):void");
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A01);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A01;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A01);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A01.A0O;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A01.setVisibility(8);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A01.setVisibility(0);
    }
}
