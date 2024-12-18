package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Anc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24153Anc implements BD3 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C8ER A03;
    public final /* synthetic */ C83o A04;
    public final /* synthetic */ InteractiveDrawableContainer A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;

    public C24153Anc(Context context, View view, UserSession userSession, C8ER c8er, C83o c83o, InteractiveDrawableContainer interactiveDrawableContainer, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = context;
        this.A04 = c83o;
        this.A02 = userSession;
        this.A01 = view;
        this.A06 = interfaceC16820sZ;
        this.A05 = interactiveDrawableContainer;
        this.A03 = c8er;
        this.A07 = interfaceC16660sJ;
    }

    @Override // X.BD3
    public final void DIZ(boolean z) {
        AbstractC125325le A0C;
        Context context = this.A00;
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_media_background);
        int color = context.getColor(R.color.fds_transparent);
        C83o c83o = this.A04;
        UserSession userSession = this.A02;
        if (z) {
            c83o.A04 = true;
            c83o.A08.A0B(true);
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            A00.A6A.Egi(A00, true, C23031Ai.A8c[485]);
            AbstractC125325le A01 = AbstractC125325le.A01(this.A01, 1);
            A01.A0G();
            A01.A01 = color;
            A01.A02 = A09;
            A01.A0A = true;
            A0C = A01.A0C(200L);
            A0C.A05 = new J0J(A09, 0, this.A07);
        } else {
            c83o.A04 = false;
            c83o.A08.A0B(false);
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            A002.A6A.Egi(A002, false, C23031Ai.A8c[485]);
            this.A06.invoke();
            AbstractC125325le A012 = AbstractC125325le.A01(this.A01, 1);
            A012.A0G();
            A012.A01 = A09;
            A012.A02 = color;
            A012.A0A = true;
            A0C = A012.A0C(200L);
        }
        A0C.A0H();
        InteractiveDrawableContainer interactiveDrawableContainer = this.A05;
        interactiveDrawableContainer.setHapticFeedbackEnabled(true);
        interactiveDrawableContainer.performHapticFeedback(1);
        this.A03.A01.setVisibility(8);
    }

    @Override // X.BD3
    public final void DiN(float f) {
        C8ER c8er = this.A03;
        int i = 8;
        if (f >= 0.8f) {
            i = 0;
        }
        c8er.A01.setVisibility(i);
    }
}
