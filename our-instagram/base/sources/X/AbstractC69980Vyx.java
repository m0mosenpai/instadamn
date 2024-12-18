package X;

import android.graphics.Point;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Vyx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69980Vyx {
    public static final void A00(View view, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        Point point = new Point();
        view.setOnTouchListener(new ViewOnTouchListenerC70252WNx(1, point, new int[2], z));
        C0fQ.A00(new LOz(3, point, interfaceC16660sJ), view);
    }

    public static final void A01(C139606Tp c139606Tp) {
        String str;
        c139606Tp.A01().setVisibility(8);
        c139606Tp.A01().setOnTouchListener(null);
        c139606Tp.A01().setOnClickListener(null);
        c139606Tp.A00().setVisibility(8);
        c139606Tp.A00().A04 = null;
        c139606Tp.A00().setOnClickListener(null);
        IgTextView igTextView = c139606Tp.A01;
        if (igTextView != null) {
            igTextView.setVisibility(8);
            IgTextView igTextView2 = c139606Tp.A02;
            if (igTextView2 != null) {
                igTextView2.setVisibility(8);
                IgTextView igTextView3 = c139606Tp.A00;
                if (igTextView3 != null) {
                    igTextView3.setVisibility(8);
                    return;
                }
                str = "cta";
            } else {
                str = "secondaryText";
            }
        } else {
            str = "primaryText";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
