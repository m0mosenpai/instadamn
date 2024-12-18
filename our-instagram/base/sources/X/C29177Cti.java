package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cti, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29177Cti implements InterfaceC30989Djo {
    public boolean A00;
    public final Context A01;
    public final C26949Buq A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16610sE A06;
    public final InterfaceC16610sE A07;
    public final InterfaceC16600sD A08;
    public final InterfaceC16600sD A09;
    public final InterfaceC16590sC A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C29177Cti(Context context, C26949Buq c26949Buq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE, InterfaceC16610sE interfaceC16610sE2, InterfaceC16600sD interfaceC16600sD, InterfaceC16600sD interfaceC16600sD2, InterfaceC16590sC interfaceC16590sC, boolean z, boolean z2) {
        AbstractC25233BEq.A0w(2, context, userSession, interfaceC60442pS);
        this.A02 = c26949Buq;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A0C = z;
        this.A0B = z2;
        this.A05 = interfaceC16660sJ;
        this.A09 = interfaceC16600sD;
        this.A07 = interfaceC16610sE;
        this.A0A = interfaceC16590sC;
        this.A06 = interfaceC16610sE2;
        this.A08 = interfaceC16600sD2;
    }

    @Override // X.InterfaceC30989Djo
    public final /* bridge */ /* synthetic */ void ADv(View view, Object obj) {
        int i;
        String str;
        C166047bW c166047bW = (C166047bW) obj;
        C14360o3.A0B(c166047bW, 1);
        boolean z = this.A0C;
        if (z) {
            view.findViewById(R.id.header_section).setVisibility(0);
        }
        boolean z2 = this.A0B;
        if (z2) {
            boolean z3 = this.A02.A01;
            int i2 = R.id.creator_view_footer_text_aligned_right;
            if (z3) {
                i2 = R.id.creator_view_footer_text_aligned_left;
            }
            view.findViewById(i2).setVisibility(0);
            view.findViewById(R.id.footer_nux).setVisibility(0);
        }
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0R(view, R.id.option_rows);
        C26949Buq c26949Buq = this.A02;
        InterfaceC101404gy interfaceC101404gy = c26949Buq.A00;
        List C5D = interfaceC101404gy.C5D();
        if (C5D != null) {
            i = C5D.size();
        } else {
            i = 4;
        }
        for (int i3 = 0; i3 < i; i3++) {
            viewGroup.addView(LayoutInflater.from(this.A01).inflate(R.layout.comment_poll_consumption_option_row, viewGroup, false));
        }
        CTJ ctj = new CTJ(view);
        List C5D2 = interfaceC101404gy.C5D();
        C15370ps A1F = AbstractC25225BEi.A1F();
        A1F.A00 = interfaceC101404gy.CGO();
        if (C5D2 != null) {
            if (z) {
                CFV.A00(this.A01, ctj, this.A03, this.A04, c166047bW.A0A, interfaceC101404gy.getQuestion(), C30480DbP.A00(this, 39), new C30750Dfn(this, 8), AbstractC25232BEp.A0t(c166047bW.A0C));
            }
            UserSession userSession = this.A03;
            Integer A00 = AbstractC25549BRl.A00(userSession).A00(interfaceC101404gy);
            Context context = this.A01;
            CFU.A00(context, interfaceC101404gy.ApJ());
            ArrayList A1E = AbstractC166987dD.A1E();
            ctj.A02.removeAllViews();
            Ch9 ch9 = Ch9.A00;
            int size = C5D2.size();
            String str2 = c166047bW.A0I;
            Integer num = c166047bW.A0B;
            if (num != null) {
                str = AbstractC86623ta.A00(num);
            } else {
                str = "null";
            }
            Ch9.A00(ctj, new C29114Csf(c166047bW, this, interfaceC101404gy, A1E, A1F), str2, str, A1E, size);
            Ch9.A02(ctj, userSession, A00, C5D2, A1E, AbstractC140306Wi.A04(userSession, interfaceC101404gy, true), this.A00);
            C28193Cbn c28193Cbn = C28193Cbn.A00;
            String moduleName = this.A04.getModuleName();
            boolean z4 = c166047bW.A0f;
            c28193Cbn.A00(context, ctj, userSession, interfaceC101404gy, moduleName, new C50368MLv(this, 26), new C30485DbU(10, c166047bW, this), z4);
            boolean z5 = this.A00;
            boolean z6 = c26949Buq.A01;
            ch9.A05(ctj, A00, new ME7(24, ctj, this, A1E, interfaceC101404gy), z5, z4, z6);
            ch9.A06(ctj, new MEB(8, ctj, c166047bW, this, interfaceC101404gy, A1E), AbstractC167007dF.A1W(A00), z6);
            if (z2) {
                AbstractC23021Ah.A00(userSession).A0T(1);
                ctj.A07.setVisibility(0);
            } else {
                ctj.A07.setVisibility(8);
            }
        }
    }

    @Override // X.InterfaceC30989Djo
    public final View ANS(Context context) {
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.comment_poll_consumption);
        C14360o3.A07(A0C);
        return A0C;
    }
}
