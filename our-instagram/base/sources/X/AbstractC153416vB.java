package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;

/* renamed from: X.6vB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153416vB {
    public static final IgMultiImageButton A00(Context context) {
        IgMultiImageButton igMultiImageButton = new IgMultiImageButton(context, null, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        igMultiImageButton.setLayoutParams(marginLayoutParams);
        return igMultiImageButton;
    }

    public static final void A02(final InterfaceC11380iw interfaceC11380iw, final UserSession userSession, final C38321qM c38321qM, C53Q c53q, final C38N c38n, InterfaceC152866uG interfaceC152866uG, IgMultiImageButton igMultiImageButton, String str, String str2, float f, int i, int i2, final int i3, int i4, boolean z, boolean z2, boolean z3) {
        final boolean z4;
        View.OnClickListener onClickListener;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(igMultiImageButton, 1);
        C14360o3.A0B(c38321qM, 2);
        C14360o3.A0B(interfaceC11380iw, 12);
        C38321qM A1e = c38321qM.A1e(0);
        if (A1e == null) {
            A1e = c38321qM;
        }
        final boolean A5n = A1e.A5n();
        boolean A05 = C3YS.A00(userSession).A05(c38321qM);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36326867749320874L) || ((C18U.A06(c06090Tz, userSession, 36326867749386411L) && C1BU.A00().A03()) || (C18U.A06(c06090Tz, userSession, 36326867749451948L) && C1BU.A00().A02()))) {
            z4 = true;
        } else {
            z4 = false;
        }
        View.OnTouchListener onTouchListener = null;
        if (A05) {
            onClickListener = null;
        } else {
            onClickListener = new View.OnClickListener() { // from class: X.6vC
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A052 = C0f9.A05(-454979231);
                    C38N c38n2 = c38n;
                    if (c38n2 != null) {
                        C38321qM c38321qM2 = c38321qM;
                        if (c38321qM2.A59() && z4) {
                            Context context = view.getContext();
                            C14360o3.A07(context);
                            C4VX c4vx = new C4VX(context, userSession, c38321qM2.CFR(), interfaceC11380iw.getModuleName());
                            c4vx.A02 = true;
                            C4VZ.A00(c4vx.A00());
                        }
                        c38n2.DJj(view, c38321qM2, i3);
                        if (A5n) {
                            UserSession userSession2 = userSession;
                            AbstractC41647Ibf.A00(EnumC39628Hem.GO_TO_POST, EnumC39624Hei.MEDIA_GRID, c38321qM2, interfaceC11380iw, userSession2, C05F.A01);
                        }
                    }
                    C0f9.A0C(-1691968609, A052);
                }
            };
            onTouchListener = new View.OnTouchListener() { // from class: X.6vD
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    C38N c38n2 = c38n;
                    if (c38n2 != null) {
                        C14360o3.A0A(view);
                        C14360o3.A0A(motionEvent);
                        if (c38n2.DJk(motionEvent, view, c38321qM, i3)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            };
        }
        if (!A5n && !A05) {
            AbstractC153386v7.A02(onClickListener, onTouchListener, interfaceC11380iw, userSession, c38321qM, c53q, interfaceC152866uG, igMultiImageButton, str, str2, f, i2, i, i4, z, false, false, z2, z3);
            return;
        }
        IZ9.A00(onClickListener, interfaceC11380iw, c38321qM, igMultiImageButton, i2, i, A5n, false);
        if (!A5n) {
            return;
        }
        AbstractC41647Ibf.A02(c38321qM, interfaceC11380iw, userSession, C05F.A01);
    }

    public static final void A01(Context context, IgMultiImageButton igMultiImageButton, boolean z) {
        int i;
        ViewGroup.LayoutParams layoutParams = igMultiImageButton.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z) {
            i = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        } else {
            i = 0;
        }
        marginLayoutParams.setMarginEnd(i);
        igMultiImageButton.setLayoutParams(marginLayoutParams);
    }
}
