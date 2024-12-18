package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import com.instagram.common.session.UserSession;

/* renamed from: X.3sC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85833sC extends AbstractC85803s9 {
    public final Activity A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C59712oE A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public static final void A00(View view) {
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            Animation animation = view.getAnimation();
            view.clearAnimation();
            if (animate != null) {
                animate.cancel();
            }
            if (animation != null) {
                animation.cancel();
            }
        }
    }

    public static final void A01(View view, final EnumC85043qs enumC85043qs, final C85833sC c85833sC, final C85233rE c85233rE, final boolean z) {
        C0fQ.A00(new View.OnClickListener() { // from class: X.4hn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterfaceC16820sZ interfaceC16820sZ;
                int A05 = C0f9.A05(549368379);
                boolean z2 = z;
                C85233rE c85233rE2 = c85233rE;
                if (z2) {
                    c85233rE2.A05.A0E.invoke(c85833sC.A00, enumC85043qs);
                } else {
                    boolean z3 = c85233rE2.A0E;
                    C85103qy c85103qy = c85233rE2.A05;
                    if (z3) {
                        interfaceC16820sZ = c85103qy.A02;
                    } else {
                        interfaceC16820sZ = c85103qy.A05;
                    }
                    interfaceC16820sZ.invoke();
                }
                C0f9.A0C(-495889041, A05);
            }
        }, view);
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.4ho
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                if (view2 != null) {
                    int[] iArr = new int[2];
                    view2.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    Rect rect = new Rect(i, i2, view2.getWidth() + i, view2.getHeight() + i2);
                    InterfaceC16620sF interfaceC16620sF = C85233rE.this.A05.A0F;
                    ViewParent parent = view2.getParent();
                    C14360o3.A07(parent);
                    interfaceC16620sF.invoke(rect, parent);
                }
                return true;
            }
        });
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.4hp
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C14360o3.A0B(motionEvent, 1);
                C85233rE.this.A05.A0B.invoke(motionEvent);
                return false;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C85833sC(Activity activity, Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, boolean z, boolean z2) {
        super(context);
        C59712oE A00 = AbstractC76923ce.A00(userSession);
        C14360o3.A0B(activity, 1);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(A00, 7);
        this.A00 = activity;
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = z;
        this.A03 = interfaceC60442pS;
        this.A07 = z2;
        this.A04 = A00;
        this.A06 = C18U.A06(C06090Tz.A05, userSession, 36324342308548733L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x043f, code lost:
    
        if (r6 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0456, code lost:
    
        if (r2 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x046c, code lost:
    
        if (r2 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C81313k1 r32, final X.C85233rE r33, X.C75113Zb r34) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85833sC.A06(X.3k1, X.3rE, X.3Zb):void");
    }
}
