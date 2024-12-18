package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HIb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39077HIb extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC43406JFw A02;
    public final JIG A03;
    public final C68842Vcy A04;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.card_search_item, false);
        A0R.setTag(new C38518Gwe(A0R));
        return new C38518Gwe(A0R);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r17, X.C3OO r18) {
        /*
            r16 = this;
            r1 = r18
            r14 = r17
            X.HKZ r14 = (X.HKZ) r14
            X.Gwe r1 = (X.C38518Gwe) r1
            r5 = 0
            boolean r15 = X.AbstractC167007dF.A1R(r5, r14, r1)
            r0 = r16
            X.JFw r10 = r0.A02
            com.instagram.igds.components.imagebutton.IgImageButton r11 = r1.A02
            X.5qK r13 = r14.A02
            X.5qT r12 = r14.A01
            r10.EE0(r11, r12, r13, r14, r15)
            com.instagram.common.session.UserSession r8 = r0.A01
            X.Vcy r10 = r0.A04
            X.0iw r9 = r0.A00
            X.JIG r4 = r0.A03
            X.C14360o3.A0B(r8, r5)
            r7 = 2
            X.AbstractC25233BEq.A0x(r7, r10, r9, r4)
            X.1qM r3 = r14.A02
            float r6 = r14.A00
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L36
            float r6 = r3.A0m()
        L36:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r1.A03
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            float r0 = (float) r0
            float r0 = r0 * r6
            int r0 = (int) r0
            r2.width = r0
            com.instagram.discovery.ui.FixedAspectRatioVideoLayout r2 = r1.A01
            boolean r0 = r3.Cff()
            if (r0 == 0) goto L52
            r2.setVideoSource(r3, r9)
        L52:
            r2.setAspectRatio(r6)
            r2 = 38
            X.WNX r0 = new X.WNX
            r0.<init>(r2, r10, r14, r3)
            X.C0fQ.A00(r0, r11)
            r11.A00 = r6
            r11.setVisibility(r5)
            com.instagram.common.typedurl.ImageUrl r0 = r3.A1S()
            if (r0 == 0) goto Lb3
            r11.A0F(r9, r0, r5)
            android.widget.ImageView r2 = r1.A00
            X.C14360o3.A0B(r2, r7)
            r2.setVisibility(r5)
            boolean r0 = X.AbstractC76233bT.A00(r8, r3)
            if (r0 == 0) goto L8c
            X.6vG r0 = X.EnumC153466vG.A0M
        L7d:
            int r0 = r0.A03
            r2.setImageResource(r0)
        L82:
            boolean r0 = r3.Cff()
            if (r0 == 0) goto L8b
            r4.E8Y(r1, r3)
        L8b:
            return
        L8c:
            boolean r0 = r3.A5F()
            if (r0 == 0) goto L95
            X.6vG r0 = X.EnumC153466vG.A08
            goto L7d
        L95:
            boolean r0 = r3.Cff()
            if (r0 == 0) goto Lad
            boolean r0 = r3.A5P()
            if (r0 != 0) goto Laa
            boolean r0 = r3.A5R()
            if (r0 != 0) goto Laa
            X.6vG r0 = X.EnumC153466vG.A0N
            goto L7d
        Laa:
            X.6vG r0 = X.EnumC153466vG.A0K
            goto L7d
        Lad:
            r0 = 8
            r2.setVisibility(r0)
            goto L82
        Lb3:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39077HIb.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKZ.class;
    }

    public C39077HIb(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC43406JFw interfaceC43406JFw, JIG jig, C68842Vcy c68842Vcy) {
        this.A04 = c68842Vcy;
        this.A01 = userSession;
        this.A03 = jig;
        this.A00 = interfaceC11380iw;
        this.A02 = interfaceC43406JFw;
    }
}
