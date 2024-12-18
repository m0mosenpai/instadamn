package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219949ng extends C35045FcI {
    public final FragmentActivity A00;
    public final Context A01;
    public final View A02;
    public final UserSession A03;

    public C219949ng(Context context, View view, FragmentActivity fragmentActivity, UserSession userSession) {
        super(context, view, userSession, true);
        this.A01 = context;
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = view;
    }
}
