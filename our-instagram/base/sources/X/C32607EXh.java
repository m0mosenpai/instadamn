package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EXh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32607EXh extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final FFG A03;
    public final C34646FOd A04;

    public C32607EXh(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, FFG ffg, C34646FOd c34646FOd) {
        AbstractC167007dF.A1G(userSession, 2, ffg);
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = c34646FOd;
        this.A01 = interfaceC11380iw;
        this.A03 = ffg;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        List list = E49.A0I;
        Context context = this.A00;
        UserSession userSession = this.A02;
        return new E49(context, AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_challenge_winner_item_layout, false), this.A01, userSession, this.A03, this.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x026a, code lost:
    
        if (r0.A05 != r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0293, code lost:
    
        if (r11 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0295, code lost:
    
        r0 = 2131954992;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02f9, code lost:
    
        if (r0 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0317, code lost:
    
        if (r1.equals("CUSTOMIZED_PRIZE") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x030e, code lost:
    
        if (r11 != false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cd  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r20, X.C3OO r21) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32607EXh.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        E49 e49 = (E49) c3oo;
        C14360o3.A0B(e49, 0);
        e49.A08.setVisibility(8);
        e49.A09.setVisibility(8);
        e49.A0A.setVisibility(8);
        e49.A0B.setVisibility(8);
        e49.A0C.setVisibility(8);
        e49.A0F.setVisibility(8);
        e49.A03.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32717Eai.class;
    }
}
