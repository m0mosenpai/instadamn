package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class JY5 {
    public static Animator.AnimatorListener A00;
    public static C58652mO A01;

    public static final View A00(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession) {
        View inflate;
        AbstractC167007dF.A1D(layoutInflater, 0, userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36328186304544050L)) {
            inflate = C50802Vb.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.search_row_redesign, 0, false, true);
        } else {
            inflate = layoutInflater.inflate(R.layout.search_row_redesign, viewGroup, false);
        }
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        JYW jyw = new JYW(inflate);
        inflate.setTag(jyw);
        Resources A0M = AbstractC25228BEl.A0M(jyw.A05);
        C14360o3.A07(A0M);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36329985895645800L);
        int i2 = R.drawable.meta_ai_animations_conversion_kf_mai_28dp_ambient_spin;
        if (A06) {
            i2 = R.drawable.gen_ai_assets_meta_ai_fast_fade_twist_thick_kf_28dp;
        }
        JYX.A00(A0M, i2);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (r13 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r13 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.session.UserSession r13, X.MR8 r14, X.JYW r15, X.JTJ r16) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY5.A01(com.instagram.common.session.UserSession, X.MR8, X.JYW, X.JTJ):void");
    }

    public static final void A02(UserSession userSession, JYW jyw, int i, boolean z, boolean z2, boolean z3) {
        ImageView imageView;
        AbstractC58662mP abstractC58662mP;
        C14360o3.A0B(userSession, 5);
        if (jyw != null && (imageView = jyw.A05) != null) {
            imageView.setScaleX(2.0f);
            imageView.setScaleY(2.0f);
            C58652mO c58652mO = A01;
            if (c58652mO != null && c58652mO.isPlaying()) {
                c58652mO.stop();
            }
            if (z2 && (A01 == null || z)) {
                Context context = imageView.getContext();
                C06090Tz c06090Tz = C06090Tz.A05;
                boolean A06 = C18U.A06(c06090Tz, userSession, 36329985895645800L);
                int i2 = R.drawable.meta_ai_animations_conversion_kf_mai_24dp_flip_28px;
                if (A06) {
                    i2 = R.drawable.gen_ai_assets_meta_ai_fast_wink_fade_twist_fade_twist_thick_kf_28dp;
                }
                C58652mO c58652mO2 = (C58652mO) context.getDrawable(i2);
                A01 = c58652mO2;
                imageView.setImageDrawable(c58652mO2);
                if (z3) {
                    boolean A062 = C18U.A06(c06090Tz, userSession, 36329985895645800L);
                    int i3 = R.drawable.meta_ai_animations_conversion_kf_mai_28dp_ambient_spin;
                    if (A062) {
                        i3 = R.drawable.gen_ai_assets_meta_ai_fast_fade_twist_thick_kf_28dp;
                    }
                    C58652mO c58652mO3 = (C58652mO) context.getDrawable(i3);
                    C14360o3.A07(c58652mO3);
                    c58652mO3.setVisible(true, true);
                    C58652mO c58652mO4 = A01;
                    if (c58652mO4 != null) {
                        Animator.AnimatorListener animatorListener = A00;
                        if (animatorListener == null) {
                            animatorListener = new C43785JXy(c58652mO3, jyw, i);
                            A00 = animatorListener;
                        }
                        c58652mO4.A8x(animatorListener);
                    }
                }
                abstractC58662mP = A01;
                if (abstractC58662mP == null) {
                    return;
                }
            } else {
                if (!z3) {
                    return;
                }
                Context context2 = imageView.getContext();
                boolean A063 = C18U.A06(C06090Tz.A05, userSession, 36329985895645800L);
                int i4 = R.drawable.meta_ai_animations_conversion_kf_mai_28dp_ambient_spin;
                if (A063) {
                    i4 = R.drawable.gen_ai_assets_meta_ai_fast_fade_twist_thick_kf_28dp;
                }
                abstractC58662mP = (AbstractC58662mP) context2.getDrawable(i4);
                C14360o3.A07(abstractC58662mP);
                long j = i;
                imageView.setImageDrawable(abstractC58662mP);
                if (j > 0) {
                    abstractC58662mP.EH0((int) j);
                } else {
                    abstractC58662mP.EH1();
                }
            }
            abstractC58662mP.E4S();
        }
    }
}
