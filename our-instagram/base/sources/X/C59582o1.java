package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.2o1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59582o1 extends AbstractViewOnTouchListenerC58522mB {
    public C1QO A00;
    public final Context A01;
    public final AbstractC58112lT A02;
    public final C59572o0 A03;
    public final GestureDetector A04;

    public C59582o1(final UserSession userSession, final InstagramMainActivity instagramMainActivity, C59572o0 c59572o0, final C1QO c1qo, final ProxyFrameLayout proxyFrameLayout) {
        super(instagramMainActivity);
        AbstractC58112lT abstractC58112lT;
        this.A01 = instagramMainActivity;
        this.A03 = c59572o0;
        if (proxyFrameLayout instanceof AbstractC58112lT) {
            abstractC58112lT = (AbstractC58112lT) proxyFrameLayout;
        } else {
            abstractC58112lT = null;
        }
        this.A02 = abstractC58112lT;
        this.A04 = new GestureDetector(instagramMainActivity, new GestureDetector.SimpleOnGestureListener() { // from class: X.2o4
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                boolean A01;
                int A00;
                long j;
                boolean z;
                UserSession userSession2 = UserSession.this;
                InstagramMainActivity instagramMainActivity2 = instagramMainActivity;
                if (C3IO.A00(instagramMainActivity2, userSession2) == C05F.A00) {
                    instagramMainActivity2.A09.getClass();
                    if (instagramMainActivity2.A07 != null) {
                        boolean A02 = AbstractC54472f1.A02();
                        if (A02) {
                            CallerContext callerContext = C31518Dt2.A00;
                            int A002 = AbstractC71963Ku.A00(userSession2);
                            A01 = true;
                            C71953Kt c71953Kt = C3Ks.A01;
                            int A03 = c71953Kt.A03(userSession2, true);
                            if (A002 <= 0 && A03 <= 0) {
                                A01 = false;
                            }
                            boolean A032 = AbstractC54472f1.A03();
                            A00 = AbstractC71963Ku.A00(userSession2);
                            int A033 = c71953Kt.A03(userSession2, true);
                            if (A032) {
                                A00 += A033;
                            }
                        } else {
                            A01 = AbstractC71963Ku.A01(userSession2);
                            A00 = AbstractC71963Ku.A00(userSession2);
                        }
                        Boolean valueOf = Boolean.valueOf(A02);
                        String str = userSession2.userId;
                        C14360o3.A0B(str, 0);
                        Long A0k = AbstractC003100w.A0k(10, str);
                        String str2 = userSession2.userId;
                        C14360o3.A0B(str2, 0);
                        C31514Dsy.A02(EnumC31512Dsw.A0C, userSession2, valueOf, A0k, AbstractC003100w.A0k(10, str2), A00, A01);
                        C57932l6 c57932l6 = instagramMainActivity2.A07;
                        c57932l6.getClass();
                        UserSession userSession3 = c57932l6.A07;
                        InterfaceC02900Bo A003 = C0BQ.A00(userSession3);
                        C17110t6 c17110t6 = (C17110t6) A003;
                        C14360o3.A0B(userSession3, 0);
                        C18720vz c18720vz = AbstractC12960li.A00;
                        boolean z2 = false;
                        if (AbstractC19730y1.A00(c18720vz).A00.getInt("preference_double_tap_profile_tab_education_dialog_impression_count", -1) > 0) {
                            z2 = true;
                        }
                        Number number = (Number) ((C17110t6) C0BQ.A00(userSession3)).A02.A01.get(C08730cb.A00(userSession3).A00());
                        if (number != null) {
                            j = number.longValue();
                        } else {
                            j = -1;
                        }
                        if (j < AbstractC19730y1.A00(c18720vz).A00.getLong("preference_double_tap_profile_tab_tooltip_last_impression_time", -1L)) {
                            c17110t6.Cn0();
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2 && !z) {
                            C193328hC c193328hC = new C193328hC(c57932l6.A02);
                            c193328hC.A09(2131961134);
                            c193328hC.A0A(2131961137);
                            c193328hC.A0J(new DialogInterfaceOnClickListenerC35324Fi1(c57932l6, A003), 2131961136);
                            c193328hC.A0H(new DialogInterfaceOnClickListenerC35325Fi2(c57932l6, A003), 2131961135);
                            c193328hC.A0s(false);
                            C0fJ.A00(c193328hC.A02());
                        } else {
                            A003.CJm(c57932l6.A02, userSession3, "double_tap_tab_bar");
                        }
                        C18920wW A022 = AbstractC12220kQ.A02(userSession3);
                        InterfaceC02590Ai A004 = A022.A00(A022.A00, "account_switch_button_tapped");
                        ArrayList A005 = AbstractC35181FfY.A00(userSession3);
                        if (A004.isSampled()) {
                            A004.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "double_tap_tab_bar");
                            A004.A9K("number_of_accounts", Long.valueOf(((Number) A005.get(1)).longValue()));
                            A004.A9K("number_of_logged_in_accounts", Long.valueOf(((Number) A005.get(0)).longValue()));
                            A004.AAP("module", c57932l6.A03.getModuleName());
                            A004.Cht();
                        }
                        Runnable runnable = instagramMainActivity2.A0D;
                        if (runnable != null) {
                            Handler handler = instagramMainActivity2.A0g;
                            C14360o3.A0A(runnable);
                            handler.removeCallbacks(runnable);
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                InstagramMainActivity instagramMainActivity2 = instagramMainActivity;
                UserSession userSession2 = instagramMainActivity2.A05;
                if (instagramMainActivity2.A07 != null && userSession2 != null) {
                    ((C17110t6) C0BQ.A00(userSession2)).A01 = false;
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                InstagramMainActivity instagramMainActivity2 = instagramMainActivity;
                UserSession userSession2 = instagramMainActivity2.A05;
                C59582o1 c59582o1 = this;
                if (c59582o1.A00 != C1QO.A0E && instagramMainActivity2.A07 != null && userSession2 != null) {
                    ((C17110t6) C0BQ.A00(userSession2)).A01 = false;
                    AbstractC58112lT abstractC58112lT2 = c59582o1.A02;
                    if (abstractC58112lT2 != null) {
                        abstractC58112lT2.getViewModel().A02(true);
                    }
                }
                c59582o1.A00 = null;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                UserSession userSession2;
                C59582o1 c59582o1 = this;
                InstagramMainActivity instagramMainActivity2 = instagramMainActivity;
                C54762fZ c54762fZ = instagramMainActivity2.A09;
                c54762fZ.getClass();
                c59582o1.A00 = c54762fZ.A01.A02();
                C1QO c1qo2 = c1qo;
                if (!instagramMainActivity2.CSB(c1qo2)) {
                    C54762fZ c54762fZ2 = instagramMainActivity2.A09;
                    c54762fZ2.getClass();
                    c54762fZ2.A08(proxyFrameLayout);
                }
                if (c1qo2 == C1QO.A0E && (userSession2 = instagramMainActivity2.A05) != null) {
                    User A00 = C08730cb.A00(userSession2).A00();
                    Boolean CZQ = A00.A03.CZQ();
                    if (CZQ != null && CZQ.booleanValue() && A00.A03.getProfilePicId() == null && instagramMainActivity2.A02 < 3 && C18U.A06(C06090Tz.A05, userSession2, 36324402438156441L)) {
                        Runnable runnable = instagramMainActivity2.A0C;
                        if (runnable != null) {
                            instagramMainActivity2.A0h.removeCallbacks(runnable);
                        }
                        RunnableC36932GPb runnableC36932GPb = new RunnableC36932GPb(userSession2, instagramMainActivity2, A00);
                        instagramMainActivity2.A0h.postDelayed(runnableC36932GPb, 1000L);
                        instagramMainActivity2.A0C = runnableC36932GPb;
                        return false;
                    }
                    return false;
                }
                return false;
            }
        });
    }

    @Override // X.AbstractViewOnTouchListenerC58522mB, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(motionEvent, 1);
        super.onTouch(view, motionEvent);
        return this.A04.onTouchEvent(motionEvent);
    }
}
