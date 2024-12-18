package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.AFy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23090AFy {
    public final InterfaceC56392iX A00;

    public static final void A00(View view, UserSession userSession, C23090AFy c23090AFy, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU) {
        Object parent = c23090AFy.A00.getView().getParent();
        C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View view2 = (View) parent;
        C138436Oz.A04(view, c84823qW, interfaceC41201vU.Ack(userSession), view2.getWidth(), view2.getHeight(), true);
    }

    public C23090AFy(InterfaceC56392iX interfaceC56392iX) {
        this.A00 = interfaceC56392iX;
    }
}
