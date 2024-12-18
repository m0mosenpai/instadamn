package X;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.Loo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49171Loo implements C7QD, InterfaceC161707Mf {
    public int A00;
    public DirectMessageIdentifier A01;
    public final LayoutInflater A02;
    public final ViewGroup A03;
    public final JoG A04;
    public final HorizontalRecyclerPager A05;

    public C49171Loo(LayoutInflater layoutInflater, View view, ViewGroup viewGroup, JoG joG) {
        C14360o3.A0B(view, 1);
        this.A04 = joG;
        this.A05 = (HorizontalRecyclerPager) AbstractC166997dE.A0R(view, R.id.horizontal_scroll_view);
        this.A03 = viewGroup;
        this.A02 = layoutInflater;
    }

    @Override // X.InterfaceC161707Mf
    public final void APo(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A05.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC161707Mf
    public final void DBy(float f, float f2) {
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Eiq(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        HorizontalRecyclerPager horizontalRecyclerPager = this.A05;
        if (horizontalRecyclerPager.onInterceptTouchEvent(motionEvent) && this.A00 > 1 && AbstractC31174DnI.A0A(horizontalRecyclerPager).contains(motionEvent.getRawX(), motionEvent.getRawY())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Ej5() {
        return true;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A05;
    }
}
