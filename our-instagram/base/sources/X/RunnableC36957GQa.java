package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.R;
import com.instagram.user.model.User;

/* renamed from: X.GQa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36957GQa implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View.OnClickListener A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C1564670r A03;

    public RunnableC36957GQa(Context context, View.OnClickListener onClickListener, View view, C1564670r c1564670r) {
        this.A03 = c1564670r;
        this.A02 = view;
        this.A00 = context;
        this.A01 = onClickListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        User user;
        C1564670r c1564670r = this.A03;
        View view = this.A02;
        Context context = this.A00;
        View.OnClickListener onClickListener = this.A01;
        if (c1564670r.A02 == EnumC1564770s.A05 && (user = c1564670r.A03) != null && c1564670r.A03()) {
            View findViewById = view.findViewById(R.id.profile_upsell_container);
            C14360o3.A0C(findViewById, AbstractC111324zv.A00(2));
            findViewById.setOnClickListener(null);
            AbstractC31177DnL.A0r(context, AbstractC166987dD.A0e(findViewById, R.id.profile_upsell_header_text), user.B8y(), 2131970260);
            if (user.A06() > 0) {
                AbstractC166987dD.A0e(findViewById, R.id.profile_upsell_body_text).setText(2131970258);
            }
            AbstractC31172DnG.A0a(findViewById, R.id.profile_image_view).setUrl(user.Bhu(), c1564670r.A05);
            ViewOnClickListenerC35684FpJ.A00(findViewById.findViewById(R.id.close_button_container), context, c1564670r, view, 45);
            View findViewById2 = findViewById.findViewById(R.id.profile_upsell_follow_link);
            C0fQ.A00(onClickListener, findViewById2);
            C14360o3.A0A(findViewById2);
            AbstractC99834e5.A02(findViewById2, c1564670r.A06, user.getId());
            if (findViewById.getVisibility() != 0) {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.mention_conversion_popup_animation);
                C14360o3.A07(loadAnimation);
                loadAnimation.setAnimationListener(new AnimationAnimationListenerC35726Fq0(findViewById, 4));
                findViewById.setVisibility(0);
                findViewById.startAnimation(loadAnimation);
                C23031Ai c23031Ai = c1564670r.A07;
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
                A0w.E7G("third_party_profile_upsell_last_seen_timestamp_ms", currentTimeMillis);
                A0w.apply();
                C1564670r.A00(c1564670r, user, "impression_profile_upsell_banner", AbstractC111324zv.A00(2926));
            }
            c1564670r.A02 = EnumC1564770s.A04;
        }
    }
}
