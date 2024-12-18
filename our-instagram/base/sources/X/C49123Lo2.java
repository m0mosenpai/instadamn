package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lo2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49123Lo2 implements C7QC {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C49017Lm5 A06;
    public final C7QB A07;
    public final Context A08;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ba, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r18.A05, 36327962965982219L) != false) goto L55;
     */
    @Override // X.C7QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADy(X.C7QY r19, X.C44782Js3 r20) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49123Lo2.ADy(X.7QY, X.Js3):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A07.Dw5(c7qd);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        throw AbstractC166987dD.A14("should not be called");
    }

    public C49123Lo2(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C49017Lm5 c49017Lm5, C7QB c7qb) {
        this.A08 = context;
        this.A04 = interfaceC11380iw;
        this.A06 = c49017Lm5;
        this.A07 = c7qb;
        this.A05 = userSession;
        this.A01 = AbstractC31174DnI.A01(context);
        this.A02 = AbstractC53242c7.A01(context);
        this.A00 = AbstractC53242c7.A0F(context, R.attr.messageFromOthersGrayBackground);
        context.getColor(R.color.black);
        context.getColor(R.color.grey_6);
        this.A03 = AbstractC167017dG.A07(context);
    }
}
