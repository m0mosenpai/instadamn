package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Idw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41725Idw {
    public int A00;
    public int A01;
    public J26 A02;
    public boolean A03;
    public final Runnable A05;
    public final Runnable A06;
    public final Runnable A07;
    public final long A09;
    public final long A0A;
    public final Context A0B;
    public final InterfaceC11380iw A0C;
    public final UserSession A0D;
    public final List A08 = AbstractC166987dD.A1E();
    public final Handler A04 = AbstractC167007dF.A0J();

    public C41725Idw(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        long j;
        this.A0B = context;
        this.A0D = userSession;
        this.A0C = interfaceC11380iw;
        C06090Tz c06090Tz = C06090Tz.A06;
        this.A09 = C1H4.A02(C18U.A00(c06090Tz, userSession, 37163634753470759L) * 1000.0d);
        if (C18U.A06(c06090Tz, userSession, 2342162219040054347L)) {
            j = 100;
        } else {
            j = 900;
        }
        this.A0A = j;
        this.A06 = new RunnableC43101J3q(this);
        this.A07 = new RunnableC43102J3r(this);
        this.A05 = new RunnableC43100J3p(this);
        this.A03 = true;
    }

    public static final void A00(C41725Idw c41725Idw) {
        J2V j2v;
        for (J26 j26 : c41725Idw.A08) {
            J27 j27 = j26.A00;
            if (j27 != null) {
                C5TA c5ta = j27.A00;
                if (c5ta != null) {
                    c5ta.A04(0, false);
                }
            } else {
                InterfaceC43447JHl interfaceC43447JHl = j26.A08;
                if ((interfaceC43447JHl instanceof J2V) && (j2v = (J2V) interfaceC43447JHl) != null) {
                    IM1 im1 = j2v.A00;
                    if (im1 == null) {
                        C14360o3.A0F("photoDelegate");
                        throw C00O.createAndThrow();
                    }
                    UserSession userSession = im1.A03;
                    if (C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36319209823280172L)) {
                        Animator animator = im1.A00;
                        if (animator != null) {
                            animator.end();
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(im1.A00(1.0f, 100L));
                        animatorSet.start();
                        im1.A00 = animatorSet;
                    }
                }
            }
        }
        c41725Idw.A04.postDelayed(c41725Idw.A07, 150L);
    }

    public static final void A01(C41725Idw c41725Idw) {
        Handler handler;
        Runnable runnable;
        long j;
        C5TA c5ta;
        J26 j26 = c41725Idw.A02;
        if (j26 != null) {
            J27 j27 = j26.A00;
            if (j27 != null && (c5ta = j27.A00) != null) {
                c5ta.A09("paused_for_replay");
            }
            int i = c41725Idw.A00 + 1;
            c41725Idw.A00 = i;
            List list = c41725Idw.A08;
            if (i < list.size()) {
                J26 j262 = (J26) AbstractC001800i.A0O(list, c41725Idw.A00);
                c41725Idw.A02 = j262;
                if (j262 != null) {
                    j262.A01();
                }
                handler = c41725Idw.A04;
                runnable = c41725Idw.A06;
                j = c41725Idw.A09;
            } else {
                c41725Idw.A00 = 0;
                handler = c41725Idw.A04;
                runnable = c41725Idw.A05;
                j = c41725Idw.A0A;
            }
            handler.postDelayed(runnable, j);
        }
    }

    public static final void A02(C41725Idw c41725Idw) {
        if (c41725Idw.A03) {
            c41725Idw.A00 = 0;
            J26 j26 = (J26) AbstractC001800i.A0O(c41725Idw.A08, 0);
            c41725Idw.A02 = j26;
            if (j26 != null) {
                j26.A01();
            }
            c41725Idw.A04.postDelayed(c41725Idw.A06, c41725Idw.A09);
            return;
        }
        A01(c41725Idw);
        c41725Idw.A03 = true;
    }

    public final void A03() {
        Handler handler = this.A04;
        handler.removeCallbacks(this.A06);
        handler.removeCallbacks(this.A07);
        handler.removeCallbacks(this.A05);
        List list = this.A08;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((J26) it.next()).A00();
        }
        list.clear();
        this.A01 = 0;
    }
}
