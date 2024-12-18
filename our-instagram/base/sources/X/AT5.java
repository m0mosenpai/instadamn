package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes4.dex */
public final class AT5 implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public AT5(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A01 = obj5;
        this.A03 = obj2;
        this.A07 = obj6;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A06 = obj7;
        this.A02 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.A00 != 0) {
            view.removeOnLayoutChangeListener(this);
            C6XW c6xw = (C6XW) this.A04;
            C41618Ib8 c41618Ib8 = ((C41181vS) this.A05).A0E;
            c41618Ib8.getClass();
            Object obj = this.A02;
            Object obj2 = this.A01;
            Object obj3 = this.A07;
            c6xw.A06(c41618Ib8, new C50245MHa(6, c6xw, obj2, obj, this.A06, view, this.A03, obj3));
            return;
        }
        view.removeOnLayoutChangeListener(this);
        ImageUrl imageUrl = ((C67846UzR) this.A01).A03;
        if (imageUrl != null) {
            View view2 = (View) this.A05;
            C14360o3.A0A(view2);
            View view3 = (View) this.A04;
            C14360o3.A0A(view3);
            View view4 = (View) this.A06;
            C14360o3.A0A(view4);
            C69763Bk.A00((Context) this.A02, view2, view3, view4, imageUrl);
        }
        ((View) this.A03).requestLayout();
    }
}
