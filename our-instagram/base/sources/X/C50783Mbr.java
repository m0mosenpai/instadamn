package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: X.Mbr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50783Mbr extends TouchDelegate {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ OXO A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50783Mbr(Rect rect, Rect rect2, View view, OXO oxo) {
        super(rect, view);
        this.A01 = oxo;
        this.A00 = rect2;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (AbstractC43594JPz.A1V(this.A00, motionEvent)) {
            float x = motionEvent.getX();
            OXO oxo = this.A01;
            Rect rect = oxo.A09;
            motionEvent.setLocation(x - rect.left, motionEvent.getY() - rect.top);
            return oxo.A0I.onTouchEvent(motionEvent);
        }
        return this.A01.A06(motionEvent);
    }
}
