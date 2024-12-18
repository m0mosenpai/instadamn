package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.V5h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67992V5h extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final C66362zD A01;
    public final UserSession A02;
    public final XAq A03;
    public final XAq A04;
    public final C69680VtQ A05;
    public final C69681VtR A06;
    public final InterfaceC16660sJ A07;
    public final boolean A08;
    public final XAq A09;

    public C67992V5h(InterfaceC11380iw interfaceC11380iw, C66362zD c66362zD, UserSession userSession, XAq xAq, XAq xAq2, XAq xAq3, C69680VtQ c69680VtQ, C69681VtR c69681VtR, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        AbstractC25234BEr.A0j(1, c69680VtQ, userSession, xAq, xAq2);
        AbstractC167017dG.A1U(xAq3, c66362zD);
        C14360o3.A0B(c69681VtR, 10);
        this.A05 = c69680VtQ;
        this.A00 = interfaceC11380iw;
        this.A02 = userSession;
        this.A04 = xAq;
        this.A03 = xAq2;
        this.A09 = xAq3;
        this.A01 = c66362zD;
        this.A07 = interfaceC16660sJ;
        this.A08 = z;
        this.A06 = c69681VtR;
        c69680VtQ.A00.A0O = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:135:0x03ab. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0295  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r35, X.C3OO r36) {
        /*
            Method dump skipped, instructions count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67992V5h.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return VA1.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.layout_high_confidence_module, false);
        A0C.setTag(new C66483UJj(A0C));
        return new C66483UJj(A0C);
    }
}
