package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.HGy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39048HGy extends AbstractC65806TuP {
    public final C6FG A00;
    public final C102884kP A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39048HGy(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        C14360o3.A0B(c6fg, 2);
        this.A01 = c102884kP;
        this.A00 = c6fg;
    }

    public static final void A00(View view, C6FG c6fg, C102884kP c102884kP) {
        C14360o3.A0B(c6fg, 1);
        C42279Io3 c42279Io3 = (C42279Io3) AnonymousClass634.A06(c6fg, c102884kP);
        if (c42279Io3 != null) {
            IJ6 ij6 = new IJ6(view);
            if (C6BQ.A00(c6fg).mView != null) {
                C07X viewLifecycleOwner = C6BQ.A00(c6fg).getViewLifecycleOwner();
                View requireViewById = ij6.A00.requireViewById(R.id.cta_container);
                if (requireViewById != null) {
                    if (c42279Io3.A08) {
                        requireViewById.setVisibility(8);
                    } else {
                        C38332GtR c38332GtR = c42279Io3.A06;
                        AbstractC37301Gc2.A0w(viewLifecycleOwner, c38332GtR.A02, new C30184DRp(31, ij6, requireViewById, c42279Io3), 8);
                        AbstractC18560vj.A03(C07Y.A00(viewLifecycleOwner), new C15340po(new C43171J6q(c42279Io3, null, 32), c38332GtR.A0E));
                    }
                }
            }
            C6BQ.A0I(c6fg, c42279Io3);
        }
    }

    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        C14360o3.A0B(context, 0);
        C6FG c6fg = this.A00;
        C42279Io3 c42279Io3 = (C42279Io3) AnonymousClass634.A06(c6fg, this.A01);
        View inflate = LayoutInflater.from(context).inflate(R.layout.lightbox_cta_layout, (ViewGroup) null);
        if (c42279Io3 != null) {
            Product product = c42279Io3.A07;
            C14360o3.A0B(c6fg, 0);
            UserSession A00 = IQ2.A00(c6fg, AbstractC111324zv.A00(1706));
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, A00, 36313235523110740L);
            boolean A062 = C18U.A06(c06090Tz, A00, 2342156244736935766L);
            if (A06 && !A062 && product.A04() && product.A0P) {
                inflate.setVisibility(0);
                return AbstractC41652Ibk.A00(inflate);
            }
        }
        inflate.setVisibility(8);
        return AbstractC41652Ibk.A00(inflate);
    }

    @Override // X.AbstractC65806TuP
    public final Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        AbstractC167027dH.A12(view, c6fg, c102884kP);
        A00(view, c6fg, c102884kP);
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        AbstractC167017dG.A1P(c6fg, c102884kP);
        C42279Io3 c42279Io3 = (C42279Io3) AnonymousClass634.A06(c6fg, c102884kP);
        if (c42279Io3 != null) {
            if (C6BQ.A00(c6fg).mView != null) {
                C07X viewLifecycleOwner = C6BQ.A00(c6fg).getViewLifecycleOwner();
                if (!c42279Io3.A08) {
                    c42279Io3.A06.A02.A05(viewLifecycleOwner);
                }
            }
            C6BQ.A0J(c6fg, c42279Io3);
        }
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }
}
