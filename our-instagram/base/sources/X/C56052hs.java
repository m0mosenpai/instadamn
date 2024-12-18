package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.2hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56052hs {
    public View.OnTouchListener A00;
    public boolean A01;
    public boolean A02;
    public final ViewGroup A03;
    public final Stack A04 = new Stack();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.CAP, java.lang.Object] */
    public final void A00(View.OnTouchListener onTouchListener, View.OnTouchListener onTouchListener2) {
        this.A00 = onTouchListener;
        this.A03.setOnTouchListener(onTouchListener2);
        Stack stack = this.A04;
        ?? obj = new Object();
        obj.A00 = onTouchListener;
        obj.A01 = onTouchListener2;
        stack.push(obj);
    }

    public final boolean A02(boolean z) {
        this.A01 = z;
        if (!this.A02) {
            return false;
        }
        ViewGroup viewGroup = this.A03;
        if (viewGroup.getParent() != null) {
            viewGroup.getParent().requestDisallowInterceptTouchEvent(z);
            return true;
        }
        return true;
    }

    public C56052hs(Context context, AttributeSet attributeSet, ViewGroup viewGroup) {
        this.A03 = viewGroup;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2M);
        this.A02 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public final boolean A01(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            if (!AbstractC12440km.A00) {
                AbstractC12440km.A00 = true;
                List list = AbstractC12440km.A01;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC16820sZ) it.next()).invoke();
                }
                list.clear();
            }
            this.A01 = false;
        }
        View.OnTouchListener onTouchListener = this.A00;
        if (onTouchListener == null || !onTouchListener.onTouch(this.A03, motionEvent)) {
            return false;
        }
        return true;
    }
}
