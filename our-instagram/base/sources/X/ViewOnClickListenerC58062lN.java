package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.2lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC58062lN implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener {
    public boolean A00;
    public final UserSession A01;
    public final View A02;
    public final C54132eL A03;
    public final InstagramMainActivity A04;
    public final C54212eX A05;
    public final C1QO A06;

    public ViewOnClickListenerC58062lN(View view, UserSession userSession, C54132eL c54132eL, InstagramMainActivity instagramMainActivity, C54212eX c54212eX, C1QO c1qo) {
        C14360o3.A0B(view, 4);
        C14360o3.A0B(c54132eL, 5);
        C14360o3.A0B(c54212eX, 6);
        this.A06 = c1qo;
        this.A04 = instagramMainActivity;
        this.A01 = userSession;
        this.A02 = view;
        this.A03 = c54132eL;
        this.A05 = c54212eX;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (!C18U.A06(C06090Tz.A05, this.A01, 36328057460440197L) || view == null) {
            return false;
        }
        onClick(view);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (C18U.A06(C06090Tz.A05, this.A01, 36328057460374660L) && motionEvent != null && motionEvent.getAction() == 1 && view != null) {
            onClick(view);
            this.A00 = true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0172, code lost:
    
        if (r7.equals(X.C1QO.A09.toString()) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a6, code lost:
    
        if (r7.equals(X.C1QO.A09.toString()) != false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0189  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r26) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC58062lN.onClick(android.view.View):void");
    }
}
