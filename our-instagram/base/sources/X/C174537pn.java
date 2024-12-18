package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174537pn {
    public boolean A00;
    public final ViewOnTouchListenerC174557pp A01;
    public final ViewOnTouchListenerC174547po A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7po] */
    public C174537pn(Context context, final View view, View view2, final InterfaceC174527pm interfaceC174527pm) {
        C14360o3.A0B(view2, 4);
        this.A02 = new View.OnTouchListener(view, interfaceC174527pm, this) { // from class: X.7po
            public Rect A00;
            public final View A01;
            public final InterfaceC174527pm A02;
            public final /* synthetic */ C174537pn A03;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                View view4;
                C14360o3.A0B(motionEvent, 1);
                C174537pn c174537pn = this.A03;
                boolean z = false;
                c174537pn.A00 = false;
                if (motionEvent.getActionMasked() == 0 && this.A02.CSZ() && (view4 = this.A01) != null) {
                    if (this.A00 == null) {
                        Rect rect = new Rect();
                        this.A00 = rect;
                        view4.getHitRect(rect);
                        int[] iArr = new int[2];
                        view4.getLocationOnScreen(iArr);
                        Rect rect2 = this.A00;
                        if (rect2 != null) {
                            rect2.offset(iArr[0], iArr[1]);
                        }
                    }
                    Rect rect3 = this.A00;
                    if (rect3 != null) {
                        z = rect3.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    }
                    c174537pn.A00 = z;
                }
                return z;
            }

            {
                this.A03 = this;
                this.A02 = interfaceC174527pm;
                this.A01 = view;
            }
        };
        this.A01 = new ViewOnTouchListenerC174557pp(context, view, view2, this);
    }
}
