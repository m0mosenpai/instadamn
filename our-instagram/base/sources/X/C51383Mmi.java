package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Mmi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51383Mmi extends RecyclerView {
    public final /* synthetic */ C56283Oyu A00;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (this.A00.A03 == EnumC53114NeR.A02) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51383Mmi(Context context, C56283Oyu c56283Oyu) {
        super(context, null);
        this.A00 = c56283Oyu;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int A03 = AbstractC43593JPy.A03(motionEvent, -1454541206);
        if (this.A00.A03 == EnumC53114NeR.A02) {
            onTouchEvent = false;
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        C0f9.A0C(-973666298, A03);
        return onTouchEvent;
    }
}
