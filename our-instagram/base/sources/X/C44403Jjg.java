package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView;
import java.util.List;

/* renamed from: X.Jjg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44403Jjg extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C44403Jjg(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        List list;
        switch (this.A00) {
            case 1:
                C45128JyU c45128JyU = (C45128JyU) this.A01;
                if (!c45128JyU.A0J) {
                    Rect A0U = AbstractC166987dD.A0U();
                    C44764Jrl c44764Jrl = (C44764Jrl) this.A03;
                    int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    c44764Jrl.A06.getGlobalVisibleRect(A0U);
                    Rect A0U2 = AbstractC166987dD.A0U();
                    c44764Jrl.A04.getGlobalVisibleRect(A0U2);
                    C45677KJo c45677KJo = (C45677KJo) this.A02;
                    KC6 kc6 = c45677KJo.A02;
                    PointF pointF = new PointF(A0U.centerX(), A0U.centerY());
                    PointF pointF2 = new PointF(A0U2.left - (r3.getWidth() / 2), A0U2.top - (r3.getHeight() / 2));
                    if (!c45677KJo.A03) {
                        pointF2 = null;
                    }
                    FriendMapAnimatedLikeView friendMapAnimatedLikeView = kc6.A04;
                    if (friendMapAnimatedLikeView == null) {
                        C14360o3.A0F("animatedLikeView");
                        throw C00O.createAndThrow();
                    }
                    friendMapAnimatedLikeView.A03(pointF, pointF2, new ME1(32, c45128JyU, kc6));
                    C2UY.A01.A04();
                    return true;
                }
                return true;
            case 2:
                View view = (View) this.A02;
                if (view != null) {
                    view.setVisibility(0);
                    Context context = view.getContext();
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.profile_note_like_bounce);
                    if (loadAnimator.isRunning()) {
                        loadAnimator.end();
                    }
                    loadAnimator.addListener(new C28514Ci8(4, loadAnimator, context, view));
                    loadAnimator.setTarget(view);
                    loadAnimator.start();
                }
                C6C9 c6c9 = (C6C9) this.A03;
                AnonymousClass688 anonymousClass688 = c6c9.A07;
                if (anonymousClass688 != null && (list = anonymousClass688.A01) != null && list.isEmpty()) {
                    ((C70H) this.A01).DVy(c6c9);
                    return true;
                }
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                C44691Jqa c44691Jqa = (C44691Jqa) this.A03;
                c44691Jqa.itemView.performHapticFeedback(0);
                PopupWindow popupWindow = (PopupWindow) this.A01;
                if (popupWindow == null || popupWindow.getContentView() == null || ((C45095JxP) this.A02).A03 == null) {
                    return;
                }
                int width = (c44691Jqa.itemView.getWidth() / 2) - (c44691Jqa.itemView.getWidth() / 4);
                int measuredHeight = c44691Jqa.itemView.getMeasuredHeight();
                TextView textView = c44691Jqa.A00;
                int measuredHeight2 = (measuredHeight - textView.getMeasuredHeight()) / 2;
                popupWindow.showAsDropDown(c44691Jqa.itemView, width, -(((c44691Jqa.itemView.getMeasuredHeight() - textView.getMeasuredHeight()) - measuredHeight2) - AbstractC167017dG.A0A(AbstractC31172DnG.A05(c44691Jqa))));
                return;
            case 1:
                C45128JyU c45128JyU = (C45128JyU) this.A01;
                if (c45128JyU.A0J) {
                    return;
                }
                ((C45677KJo) this.A02).A01.DW0(C44764Jrl.A00(c45128JyU));
                return;
            default:
                super.onLongPress(motionEvent);
                return;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C48757LhP c48757LhP;
        switch (this.A00) {
            case 0:
                C44691Jqa c44691Jqa = (C44691Jqa) this.A03;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c44691Jqa.A02.invoke();
                return true;
            case 1:
                C45128JyU c45128JyU = (C45128JyU) this.A01;
                if (!c45128JyU.A0J) {
                    C45677KJo c45677KJo = (C45677KJo) this.A02;
                    UserSession userSession = c45677KJo.A00;
                    if (C3LA.A01(userSession)) {
                        KC6 kc6 = c45677KJo.A02;
                        String str = c45128JyU.A0B;
                        String str2 = c45128JyU.A0A;
                        if (str2 == null) {
                            str2 = c45128JyU.A06.getId();
                        }
                        boolean z = !AbstractC167007dF.A1W(c45128JyU.A05);
                        AbstractC25230BEn.A15(1, str, str2);
                        if (z) {
                            AbstractC43592JPx.A0i(kc6.A0A).A0D(str2);
                        }
                        if (!kc6.isAdded()) {
                            return true;
                        }
                        AbstractC47029Kqm.A00(kc6.requireActivity(), AbstractC166987dD.A0r(kc6.A0F), C05F.A01, str, str2, C50233MGo.A00, new C50355MLh(kc6, 29));
                        return true;
                    }
                    if (c45128JyU.A05 == null || C3LA.A01(userSession)) {
                        return true;
                    }
                    c48757LhP = c45677KJo.A01;
                } else {
                    boolean A1W = AbstractC167007dF.A1W(c45128JyU.A05);
                    C45677KJo c45677KJo2 = (C45677KJo) this.A02;
                    if (A1W) {
                        c48757LhP = c45677KJo2.A01;
                    } else {
                        C45993KXh c45993KXh = (C45993KXh) c45677KJo2.A02.A0G.getValue();
                        C45044JwZ A0P = c45993KXh.A03.A0P();
                        if (!c45993KXh.A02.A05() || A0P != null) {
                            c45993KXh.A0M(new C49415Lsp(new ME1(44, A0P, c45993KXh)));
                        }
                        if (!C18U.A06(C06090Tz.A05, c45993KXh.A00, 36321722379347697L)) {
                            return true;
                        }
                        c45993KXh.A0M(new C49416Lsq(new MHN(c45993KXh, 35), new C50355MLh(c45993KXh, 38)));
                        return true;
                    }
                }
                c48757LhP.DW3(C44764Jrl.A00(c45128JyU));
                return true;
            default:
                ((C70H) this.A01).DW2((C6C9) this.A03, null, null);
                return true;
        }
    }
}
