package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.6Ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC139716Ua {
    public static final void A00(C6TY c6ty) {
        View view = c6ty.A04;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        InterfaceC56392iX interfaceC56392iX = c6ty.A05;
        Context context = interfaceC56392iX.getView().getContext();
        C14360o3.A07(context);
        C6QO.A00((TextView) interfaceC56392iX.getView(), context);
        c6ty.A00();
        ((TextView) interfaceC56392iX.getView()).setText("");
    }
}
