package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.BQr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25529BQr {
    public static final boolean A01(C37838Gks c37838Gks, C2Y0 c2y0, C2XB c2xb, InterfaceC30808Dgj interfaceC30808Dgj, InterfaceC30939Dit interfaceC30939Dit, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(c2y0, 1);
        AbstractC25234BEr.A0j(2, c37838Gks, interfaceC30808Dgj, interfaceC16660sJ, interfaceC30939Dit);
        c2y0.onTouchEvent(c2xb.A00);
        C77123cy c77123cy = (C77123cy) c37838Gks.A06;
        C77123cy c77123cy2 = (C77123cy) c37838Gks.A07;
        C77123cy c77123cy3 = (C77123cy) c37838Gks.A03;
        C77123cy c77123cy4 = (C77123cy) c37838Gks.A04;
        C77123cy c77123cy5 = (C77123cy) c37838Gks.A01;
        C77123cy c77123cy6 = (C77123cy) c37838Gks.A02;
        View view = c2xb.A01;
        MotionEvent motionEvent = c2xb.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2 && !z) {
                    if (AbstractC166987dD.A01(AbstractC166987dD.A09(AbstractC25225BEi.A12(c77123cy5)), motionEvent.getX()) > 10.0f || AbstractC166987dD.A01(AbstractC166987dD.A09(AbstractC25225BEi.A12(c77123cy6)), motionEvent.getY()) > 10.0f) {
                        Object tag = view.getTag();
                        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.contentnotes.ui.animator.DraggingContentNotesViewTag");
                        interfaceC16660sJ.invoke(tag);
                    }
                    view.animate().x(motionEvent.getRawX() + AbstractC166987dD.A09(AbstractC25225BEi.A12(c77123cy3))).y(motionEvent.getRawY() + AbstractC166987dD.A09(AbstractC25225BEi.A12(c77123cy4))).setDuration(0L).start();
                }
            } else {
                view.getParent().requestDisallowInterceptTouchEvent(false);
                if (!interfaceC30939Dit.DC3(motionEvent, view, BRD.A00)) {
                    AbstractC65716Tsp abstractC65716Tsp = (AbstractC65716Tsp) AbstractC25225BEi.A12(c77123cy);
                    if (abstractC65716Tsp != null) {
                        abstractC65716Tsp.A02();
                    }
                    AbstractC65716Tsp abstractC65716Tsp2 = (AbstractC65716Tsp) AbstractC25225BEi.A12(c77123cy2);
                    if (abstractC65716Tsp2 != null) {
                        abstractC65716Tsp2.A02();
                        return true;
                    }
                }
            }
        } else {
            if (z || !interfaceC30808Dgj.equals(BRD.A00)) {
                return false;
            }
            C14360o3.A0A(view);
            AbstractC66379UEn abstractC66379UEn = AbstractC65716Tsp.A0J;
            float x = view.getX();
            C65726Tt0 c65726Tt0 = new C65726Tt0(abstractC66379UEn, view);
            C65717Tsq c65717Tsq = new C65717Tsq(x);
            c65717Tsq.A02(1500.0f);
            c65717Tsq.A01(0.75f);
            c65726Tt0.A01 = c65717Tsq;
            C2XV.A00();
            c77123cy.A00 = c65726Tt0;
            AbstractC66379UEn abstractC66379UEn2 = AbstractC65716Tsp.A0K;
            float y = view.getY();
            C65726Tt0 c65726Tt02 = new C65726Tt0(abstractC66379UEn2, view);
            C65717Tsq c65717Tsq2 = new C65717Tsq(y);
            c65717Tsq2.A02(1500.0f);
            c65717Tsq2.A01(0.75f);
            c65726Tt02.A01 = c65717Tsq2;
            C2XV.A00();
            c77123cy2.A00 = c65726Tt02;
            Float valueOf = Float.valueOf(view.getX() - motionEvent.getRawX());
            C2XV.A00();
            c77123cy3.A00 = valueOf;
            Float valueOf2 = Float.valueOf(view.getY() - motionEvent.getRawY());
            C2XV.A00();
            c77123cy4.A00 = valueOf2;
            Float valueOf3 = Float.valueOf(motionEvent.getX());
            C2XV.A00();
            c77123cy5.A00 = valueOf3;
            Float valueOf4 = Float.valueOf(motionEvent.getY());
            C2XV.A00();
            c77123cy6.A00 = valueOf4;
            view.bringToFront();
            view.getParent().requestDisallowInterceptTouchEvent(true);
            AbstractC65716Tsp abstractC65716Tsp3 = (AbstractC65716Tsp) AbstractC25225BEi.A12(c77123cy);
            if (abstractC65716Tsp3 != null) {
                abstractC65716Tsp3.A01();
            }
            AbstractC65716Tsp abstractC65716Tsp4 = (AbstractC65716Tsp) AbstractC25225BEi.A12(c77123cy2);
            if (abstractC65716Tsp4 != null) {
                abstractC65716Tsp4.A01();
                return true;
            }
        }
        return true;
    }

    public static final C37838Gks A00(C76223bS c76223bS) {
        return new C37838Gks(AbstractC77063cs.A00(c76223bS, BR0.A00), AbstractC77063cs.A00(c76223bS, BR1.A00), AbstractC77063cs.A00(c76223bS, BR3.A00), AbstractC77063cs.A00(c76223bS, BR4.A00), AbstractC77063cs.A00(c76223bS, BR5.A00), AbstractC77063cs.A00(c76223bS, BR6.A00), AbstractC77063cs.A00(c76223bS, BR7.A00));
    }
}
