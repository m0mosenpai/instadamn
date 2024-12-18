package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.U7x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66299U7x extends AnimatorListenerAdapter {
    public final float A00;
    public final int A01;
    public final Object A02;

    public C66299U7x(Object obj, float f, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        String str;
        String str2;
        switch (this.A01) {
            case 2:
                ((View) this.A02).setTranslationX(this.A00);
                return;
            case 3:
                ((View) this.A02).setTranslationY(this.A00);
                return;
            case 4:
                if (this.A00 <= 0.7f) {
                    return;
                }
                UHS uhs = (UHS) this.A02;
                ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = uhs.A07;
                C70666Wem c70666Wem = uhs.A08;
                if (c70666Wem != null) {
                    String str3 = c70666Wem.A02;
                    if ("slideshow".equals(str3)) {
                        V2M A00 = c70666Wem.A00(viewOnKeyListenerC67976V4r.A0M.A00(c70666Wem).A00);
                        if (A00 != null) {
                            FragmentActivity requireActivity = viewOnKeyListenerC67976V4r.A0I.requireActivity();
                            UserSession userSession = viewOnKeyListenerC67976V4r.A0O;
                            List list = A00.A02;
                            C68729Vb8 c68729Vb8 = c70666Wem.A00;
                            if (c68729Vb8 != null) {
                                str2 = c68729Vb8.A00;
                            } else {
                                str2 = null;
                            }
                            String str4 = A00.A00.A00;
                            C1NI c1ni = viewOnKeyListenerC67976V4r.A08;
                            if (c1ni != null) {
                                Wk6 wk6 = viewOnKeyListenerC67976V4r.A04;
                                if (wk6 != null) {
                                    AbstractC40544HyQ.A00(requireActivity, userSession, wk6, c1ni, null, viewOnKeyListenerC67976V4r, null, str3, str2, str4, "swipe_up", list, viewOnKeyListenerC67976V4r.A0S);
                                    return;
                                }
                                C14360o3.A0F("insightProcessor");
                            }
                            C14360o3.A0F("impressionItem");
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        FragmentActivity requireActivity2 = viewOnKeyListenerC67976V4r.A0I.requireActivity();
                        UserSession userSession2 = viewOnKeyListenerC67976V4r.A0O;
                        List list2 = c70666Wem.A03;
                        C68729Vb8 c68729Vb82 = c70666Wem.A00;
                        if (c68729Vb82 != null) {
                            str = c68729Vb82.A00;
                        } else {
                            str = null;
                        }
                        C1NI c1ni2 = viewOnKeyListenerC67976V4r.A08;
                        if (c1ni2 != null) {
                            Wk6 wk62 = viewOnKeyListenerC67976V4r.A04;
                            if (wk62 != null) {
                                AbstractC40544HyQ.A00(requireActivity2, userSession2, wk62, c1ni2, null, viewOnKeyListenerC67976V4r, null, str3, str, null, "swipe_up", list2, viewOnKeyListenerC67976V4r.A0S);
                                return;
                            }
                            C14360o3.A0F("insightProcessor");
                        }
                        C14360o3.A0F("impressionItem");
                    }
                    throw C00O.createAndThrow();
                }
                throw AbstractC166997dE.A0g();
            default:
                ((View) this.A02).setAlpha(this.A00);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (4 - this.A01 != 0) {
            super.onAnimationStart(animator);
        }
    }
}
