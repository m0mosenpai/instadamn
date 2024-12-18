package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class Lo0 implements C7QC {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C75Y A07;
    public final InterfaceC164977Zm A08;
    public final C47969LId A09;
    public final C49020Lm8 A0A;
    public final C7TY A0B;
    public final C162907Rb A0C;
    public final C7QB A0D;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        UserSession userSession = this.A06;
        boolean A01 = LC3.A01(userSession);
        int i = R.layout.direct_prompt_xma_legacy;
        if (A01) {
            i = R.layout.direct_prompt_xma_message;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        inflate.getLayoutParams().width = -1;
        C44785Js6 c44785Js6 = new C44785Js6(inflate, userSession);
        this.A0C.A00(c44785Js6);
        return c44785Js6;
    }

    public Lo0(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C75Y c75y, InterfaceC164977Zm interfaceC164977Zm, C49020Lm8 c49020Lm8, C7TY c7ty, C162907Rb c162907Rb, C7QB c7qb) {
        boolean A1a = AbstractC31175DnJ.A1a(c7ty);
        this.A04 = context;
        this.A0C = c162907Rb;
        this.A0B = c7ty;
        this.A0A = c49020Lm8;
        this.A05 = interfaceC11380iw;
        this.A07 = c75y;
        this.A0D = c7qb;
        this.A08 = interfaceC164977Zm;
        this.A06 = userSession;
        this.A09 = new C47969LId(interfaceC11380iw, userSession, interfaceC164977Zm, 0, 472, false, A1a, false, false);
        this.A03 = AbstractC31174DnI.A01(context);
        this.A02 = context.getColor(AbstractC53242c7.A0D(context));
        this.A01 = AbstractC43594JPz.A05(context);
        this.A00 = AbstractC167017dG.A07(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0229, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r21, X.InterfaceC129555tK r22) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lo0.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C44785Js6 c44785Js6 = (C44785Js6) c7qd;
        C14360o3.A0B(c44785Js6, 0);
        this.A0C.A01(c44785Js6);
        C47969LId c47969LId = this.A09;
        Iterator it = c44785Js6.A04.iterator();
        while (it.hasNext()) {
            ((LGr) it.next()).A02();
        }
        c47969LId.A03.A03(c44785Js6);
    }
}
