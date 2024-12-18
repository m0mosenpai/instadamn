package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;

/* renamed from: X.6fJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144376fJ {
    public C120435cm A00;
    public View A01;
    public final Context A02;
    public final View A03;
    public final ViewStub A04;
    public final UserSession A05;

    public static View A00(C144376fJ c144376fJ) {
        View view = c144376fJ.A01;
        if (view == null) {
            View inflate = c144376fJ.A04.inflate();
            c144376fJ.A01 = inflate;
            return inflate;
        }
        return view;
    }

    public C144376fJ(View view, ViewStub viewStub, UserSession userSession) {
        this.A02 = view.getContext();
        this.A05 = userSession;
        this.A03 = view;
        this.A04 = viewStub;
    }
}
