package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ea6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32679Ea6 extends C35045FcI {
    public ViewStub A00;
    public FRJ A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final Animation A05;
    public final Animation A06;
    public final AnimationAnimationListenerC35726Fq0 A07;
    public final UserSession A08;
    public final C19L A09;
    public final boolean A0A;

    public C32679Ea6(Activity activity, Context context, View view, UserSession userSession, boolean z) {
        super(context, view, userSession, z);
        this.A03 = context;
        this.A08 = userSession;
        this.A02 = activity;
        this.A04 = view;
        this.A0A = z;
        this.A09 = AnonymousClass194.A02(C12L.A00.A04);
        this.A05 = AnimationUtils.loadAnimation(context, R.anim.broadcast_chat_hide_cta_button_animation);
        this.A06 = AnimationUtils.loadAnimation(context, R.anim.broadcast_chat_show_disabled_composer_animation);
        this.A07 = new AnimationAnimationListenerC35726Fq0(this, 2);
    }

    @Override // X.C35045FcI
    public final void A07(C7IK c7ik) {
        super.A07(c7ik);
        FRJ frj = this.A01;
        if (frj == null) {
            C14360o3.A0F("dailyPromptsPersistentBannerHelper");
            throw C00O.createAndThrow();
        }
        frj.A00(c7ik);
    }
}
