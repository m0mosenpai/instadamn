package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oki, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55489Oki implements View.OnTouchListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC144586fe A02;
    public final /* synthetic */ String A03;

    public ViewOnTouchListenerC55489Oki(View view, UserSession userSession, InterfaceC144586fe interfaceC144586fe, String str) {
        this.A00 = view;
        this.A01 = userSession;
        this.A02 = interfaceC144586fe;
        this.A03 = str;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            View view2 = this.A00;
            final Context A0L = AbstractC166997dE.A0L(view2);
            UserSession userSession = this.A01;
            InterfaceC144586fe interfaceC144586fe = this.A02;
            final String str = this.A03;
            C5SU c5su = new C5SU((Activity) A0L, new AbstractC149696oM(A0L, str) { // from class: X.9ob
                public final Context A00;
                public final CharSequence A01;

                @Override // X.C5ST
                public final /* bridge */ /* synthetic */ void ADz(C5SV c5sv, AbstractC117215Sg abstractC117215Sg) {
                    C201248v6 c201248v6 = (C201248v6) abstractC117215Sg;
                    AbstractC167007dF.A1K(c201248v6, c5sv);
                    TextView textView = c201248v6.A00;
                    int color = textView.getContext().getColor(c5sv.A02);
                    textView.setText(this.A01);
                    textView.setTextColor(color);
                    Drawable drawable = this.A00.getDrawable(R.drawable.chevron_right);
                    if (drawable != null) {
                        drawable.setTint(color);
                        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.chevron_right, 0);
                    }
                }

                {
                    this.A00 = A0L;
                    this.A01 = str;
                }
            });
            c5su.A04(view2, x, y, false);
            c5su.A02();
            c5su.A0B = true;
            c5su.A0G = false;
            c5su.A04 = new EfP(interfaceC144586fe, 15);
            c5su.A00().A07(userSession);
        }
        return true;
    }
}
