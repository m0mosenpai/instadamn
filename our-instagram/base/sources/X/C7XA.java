package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.7XA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7XA {
    public int A00;
    public View A01;
    public C55982hj A02;
    public CircularImageView A03;
    public InterfaceC56392iX A04;
    public C7KJ A05;
    public C7KN A06;
    public final AbstractC59962oe A07;
    public final UserSession A08;
    public final C164357Wy A09;
    public final InterfaceC60442pS A0A;
    public final InterfaceC16820sZ A0B;
    public final InterfaceC16820sZ A0C;
    public final InterfaceC16820sZ A0D;
    public final InterfaceC16820sZ A0E;

    public C7XA(AbstractC59962oe abstractC59962oe, UserSession userSession, C164357Wy c164357Wy, InterfaceC60442pS interfaceC60442pS, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4) {
        C14360o3.A0B(abstractC59962oe, 2);
        C14360o3.A0B(interfaceC16820sZ2, 6);
        C14360o3.A0B(interfaceC16820sZ3, 7);
        C14360o3.A0B(interfaceC16820sZ4, 8);
        this.A08 = userSession;
        this.A07 = abstractC59962oe;
        this.A0A = interfaceC60442pS;
        this.A09 = c164357Wy;
        this.A0E = interfaceC16820sZ;
        this.A0B = interfaceC16820sZ2;
        this.A0D = interfaceC16820sZ3;
        this.A0C = interfaceC16820sZ4;
    }

    public static final void A00(InterfaceC56392iX interfaceC56392iX, final C7XA c7xa) {
        View view;
        C7O4 c7o4;
        if (interfaceC56392iX != null && !interfaceC56392iX.CWW() && (view = interfaceC56392iX.getView()) != null) {
            final View requireViewById = view.requireViewById(R.id.direct_thread_new_message_indicator_avatar_view);
            C14360o3.A07(requireViewById);
            C0fQ.A00(new View.OnClickListener() { // from class: X.7KI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int A05 = C0f9.A05(913526403);
                    c7xa.A09.A00(true);
                    requireViewById.setVisibility(8);
                    C0f9.A0C(-556729993, A05);
                }
            }, requireViewById);
            c7xa.A01 = requireViewById;
            c7xa.A03 = (CircularImageView) view.requireViewById(R.id.direct_thread_new_message_indicator_avatar);
            c7xa.A05 = new C7KJ(requireViewById);
            C55982hj A02 = AbstractC13560mi.A00().A02();
            A02.A09(C55942hf.A04(10.0d, 3.0d));
            A02.A0A(new C668630d(requireViewById) { // from class: X.7KK
                public final View A00;

                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnm(C55982hj c55982hj) {
                    C14360o3.A0B(c55982hj, 0);
                    double d = c55982hj.A09.A00;
                    this.A00.setTranslationY((float) AbstractC70163Da.A04(d, 0.0d, 1.0d, -(r3.getHeight() / 4), 0.0d));
                }

                {
                    this.A00 = requireViewById;
                }
            });
            c7xa.A02 = A02;
            if (C18U.A06(C06090Tz.A05, c7xa.A08, 36329603643556266L) && (c7o4 = (C7O4) c7xa.A0C.invoke()) != null) {
                c7o4.A0D.add(new C7OV() { // from class: X.7OZ
                    @Override // X.C7OV
                    public final void DOk() {
                        C7KN c7kn = C7XA.this.A06;
                        if (c7kn != null) {
                            c7kn.A00 = false;
                            InterfaceC56392iX interfaceC56392iX2 = c7kn.A02;
                            if (interfaceC56392iX2.CWW()) {
                                interfaceC56392iX2.getView().setAlpha(0.0f);
                            }
                        }
                    }
                });
            }
        }
    }

    public static final void A01(C7XA c7xa) {
        View view = c7xa.A01;
        if (view != null) {
            AbstractC13880nE.A0U(view, c7xa.A00);
        }
        C7KN c7kn = c7xa.A06;
        if (c7kn != null) {
            int i = c7xa.A00;
            InterfaceC56392iX interfaceC56392iX = c7kn.A02;
            View view2 = interfaceC56392iX.getView();
            Context context = interfaceC56392iX.getView().getContext();
            C14360o3.A07(context);
            AbstractC13880nE.A0U(view2, i + ((int) AbstractC13880nE.A04(context, 8)));
        }
    }
}
