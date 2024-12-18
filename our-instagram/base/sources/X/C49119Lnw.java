package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lnw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49119Lnw implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C49037LmP A02;
    public final C162907Rb A03;
    public final InterfaceC165247aD A04;
    public final AnonymousClass988 A05;

    public C49119Lnw(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988, C49037LmP c49037LmP) {
        C14360o3.A0B(c49037LmP, 5);
        this.A04 = interfaceC165247aD;
        this.A05 = anonymousClass988;
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A02 = c49037LmP;
        C49018Lm6 c49018Lm6 = new C49018Lm6(userSession, (C7Zf) interfaceC165247aD);
        C7Q7 c7q7 = new C7Q7(interfaceC165247aD);
        C7Q9 c7q9 = new C7Q9((InterfaceC165307aJ) interfaceC165247aD, anonymousClass988.A1U);
        this.A03 = new C162907Rb(AbstractC166987dD.A1J(new C1580177l(new C162897Ra((InterfaceC165207a9) interfaceC165247aD), c49018Lm6, c7q7, c7q9, (InterfaceC165507ad) interfaceC165247aD, anonymousClass988, null, false)));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C49154LoX c49154LoX = new C49154LoX(AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.direct_portrait_video_share_message, false));
        this.A03.A00(c49154LoX);
        return c49154LoX;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        C49037LmP c49037LmP = this.A02;
        if (!C18U.A06(C06090Tz.A05, c49037LmP.A00, 2342159118070452219L)) {
            ((KV3) c49037LmP.A01).A00.A03("scroll");
        }
        this.A03.A01(c7qd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0126, code lost:
    
        if (r3 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0190, code lost:
    
        if (r0.length() != 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d5  */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r25, X.InterfaceC129555tK r26) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49119Lnw.ADy(X.7QD, X.5tK):void");
    }
}
