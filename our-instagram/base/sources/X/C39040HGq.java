package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.HGq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39040HGq extends AbstractC65806TuP {
    public InterfaceC41501vz A00;
    public InterfaceC41501vz A01;

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(final View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        ColorFilter A00;
        Drawable drawable;
        String str;
        UserSession A01 = AbstractC03270Dk.A01(C6BQ.A0A(c6fg));
        if (A01 == null) {
            str = "Attempt to render product save button outside logged in user context";
        } else {
            view.post(new Runnable() { // from class: X.J2y
                @Override // java.lang.Runnable
                public final void run() {
                    final View view2 = view;
                    final View view3 = (View) view2.getParent();
                    if (view3 != null) {
                        view3.post(new Runnable() { // from class: X.J4N
                            @Override // java.lang.Runnable
                            public final void run() {
                                View view4 = view2;
                                View view5 = view3;
                                int A04 = (int) AbstractC13880nE.A04(view4.getContext(), 15);
                                Rect A0U = AbstractC166987dD.A0U();
                                view4.getHitRect(A0U);
                                A0U.top -= A04;
                                A0U.left -= A04;
                                A0U.bottom += A04;
                                A0U.right += A04;
                                view5.setTouchDelegate(new TouchDelegate(A0U, view4));
                            }
                        });
                    }
                }
            });
            Fragment A002 = C6BQ.A00(c6fg);
            C42588It6 c42588It6 = new C42588It6(this, c6fg, c102884kP);
            ImageView A0I = AbstractC31173DnH.A0I(view, R.id.save_button);
            C102884kP A08 = c102884kP.A08(38);
            if (A08 == null) {
                str = "Product is null";
            } else {
                Product A012 = AbstractC41287IPc.A01(A08);
                A0I.setSelected(AbstractC1563570f.A00(A01).A03(A012));
                boolean equals = "large".equals(c102884kP.A0L(54));
                int i = R.drawable.ufi_save_icon_reduced_size;
                if (equals) {
                    i = R.drawable.ufi_save_icon;
                }
                A0I.setImageResource(i);
                if (A0I.getDrawable() != null) {
                    boolean equals2 = "light".equals(c102884kP.A0L(53));
                    Context context = c6fg.A00;
                    if (equals2) {
                        int color = context.getColor(R.color.design_dark_default_color_on_background);
                        drawable = A0I.getDrawable();
                        A00 = C3DY.A00(color);
                    } else {
                        A00 = C3DY.A00(AbstractC53242c7.A01(context));
                        drawable = A0I.getDrawable();
                    }
                    drawable.setColorFilter(A00);
                }
                C684336g c684336g = new C684336g();
                c684336g.A04(AbstractC25225BEi.A16(A0I));
                C41196ILk c41196ILk = new C41196ILk(c6fg, c102884kP, c102884kP.A0B(55), c102884kP.A0B(58));
                view.setVisibility(0);
                C0fQ.A00(new ViewOnClickListenerC42012Ijh(0, c684336g, A012, A01, c102884kP, c41196ILk, A0I, A002, c42588It6), view);
                this.A01 = new C42270Inu(0, A012, A01, A0I);
                this.A00 = new C42266Inq(0, new IMC(c6fg, c102884kP, c102884kP.A0B(57), c102884kP.A0B(56), c102884kP.A0B(61), c102884kP.A0B(59)), A012);
                C25671My A003 = AbstractC25651Mw.A00(A01);
                A003.A01(this.A01, C3HW.class);
                A003.A01(this.A00, C42257Inh.class);
                return null;
            }
        }
        AbstractC25241Le.A02("MiniBloksProductSaveButtonBinderUtils", str);
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        return AbstractC31172DnG.A0A(LayoutInflater.from(context), null, R.layout.save_card_button);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        UserSession A01 = AbstractC03270Dk.A01(C6BQ.A0A(c6fg));
        if (A01 == null) {
            AbstractC25241Le.A02("MiniBloksProductSaveButtonBinderUtils", "Attempt to unbind product save button outside logged in user context");
            return;
        }
        InterfaceC41501vz interfaceC41501vz = this.A01;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(A01).A02(interfaceC41501vz, C3HW.class);
        }
        InterfaceC41501vz interfaceC41501vz2 = this.A00;
        if (interfaceC41501vz2 == null) {
            return;
        }
        AbstractC25651Mw.A00(A01).A02(interfaceC41501vz2, C42257Inh.class);
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }

    public C39040HGq(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
