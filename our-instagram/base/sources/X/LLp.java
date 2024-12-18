package X;

import android.animation.Animator;
import android.os.VibrationEffect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class LLp implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public LLp(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A00 != 0) {
            C47988LJq c47988LJq = (C47988LJq) this.A02;
            if (c47988LJq.A0C) {
                c47988LJq.A0S.A00(this.A03, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, "emoji_tray");
                View view = (View) this.A01;
                view.performHapticFeedback(0);
                if (c47988LJq.A0b) {
                    UserSession userSession = c47988LJq.A0Q;
                    int i = AbstractC166987dD.A0x(userSession).getInt("direct_reactions_super_react_nux_count", 0);
                    if (i < 2) {
                        AbstractC167007dF.A18(AbstractC23021Ah.A00(userSession).A01, "direct_reactions_super_react_nux_count", i + 1);
                    }
                }
                if (view.getParent() != null) {
                    ViewGroup A00 = AbstractC124845kp.A00(view);
                    while (A00 != null) {
                        int id = A00.getId();
                        A00.setClipChildren(true);
                        if (id != R.id.message_actions_container) {
                            A00.setClipToPadding(true);
                            ViewParent parent = A00.getParent();
                            if (parent instanceof ViewGroup) {
                                A00 = (ViewGroup) parent;
                            } else {
                                return;
                            }
                        } else {
                            A00.setClipToPadding(true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass693 anonymousClass693 = (AnonymousClass693) this.A02;
        C1820485o c1820485o = (C1820485o) this.A01;
        if (c1820485o.A04 != null) {
            anonymousClass693.pause();
            c1820485o.A04.setVisibility(8);
            String str = this.A03;
            if (str != null) {
                c1820485o.A04(str, 1000L);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            C47988LJq c47988LJq = (C47988LJq) this.A02;
            if (AbstractC167007dF.A1Z(c47988LJq.A0W)) {
                long[] jArr = new long[10];
                Arrays.fill(jArr, c47988LJq.A0F / 10);
                c47988LJq.A0K.vibrate(VibrationEffect.createWaveform(jArr, new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50}, -1));
                return;
            }
            ((View) this.A01).performHapticFeedback(0);
        }
    }
}
