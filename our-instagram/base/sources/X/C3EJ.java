package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.3EJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EJ {
    public View.OnClickListener A00;
    public View A01;
    public IgTextView A02;
    public boolean A03;
    public final View A04;
    public final ViewStub A05;
    public final UserSession A06;
    public final Integer A07;
    public final InterfaceC09390do A08;
    public final InterfaceC16820sZ A09;
    public final Activity A0A;
    public final C23031Ai A0B;
    public final InterfaceC16820sZ A0C;

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.CharSequence r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3EJ.A01(java.lang.CharSequence, boolean):void");
    }

    public C3EJ(Activity activity, View view, ViewStub viewStub, UserSession userSession, Integer num, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        IgTextView igTextView;
        this.A06 = userSession;
        this.A0A = activity;
        this.A04 = view;
        this.A05 = viewStub;
        this.A09 = interfaceC16820sZ;
        this.A0C = interfaceC16820sZ2;
        this.A07 = num;
        if (!C18U.A06(C06090Tz.A05, userSession, 36324630071816495L)) {
            igTextView = (IgTextView) viewStub.inflate().findViewById(R.id.ongoing_call_notification_bar);
        } else {
            igTextView = null;
        }
        this.A02 = igTextView;
        this.A0B = AbstractC23021Ah.A00(userSession);
        this.A08 = C1XM.A00(new C9E3(this, 46));
    }

    public static final void A00(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
