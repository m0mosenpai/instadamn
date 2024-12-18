package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lo3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49124Lo3 implements C7QC {
    public final InterfaceC11380iw A00;
    public final C75Y A01;
    public final C7YR A02;
    public final C49024LmC A03;
    public final C162907Rb A04;
    public final C7QB A05;
    public final UserSession A06;
    public final InterfaceC164897Zc A07;
    public final C163437Tg A08;

    public C49124Lo3(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C75Y c75y, InterfaceC164897Zc interfaceC164897Zc, C7YR c7yr, C49024LmC c49024LmC, C163437Tg c163437Tg, C162907Rb c162907Rb, C7QB c7qb) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A04 = c162907Rb;
        this.A01 = c75y;
        this.A05 = c7qb;
        this.A02 = c7yr;
        this.A07 = interfaceC164897Zc;
        this.A08 = c163437Tg;
        this.A03 = c49024LmC;
        this.A00 = interfaceC11380iw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x016b, code lost:
    
        if (r15.A0A != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r1 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025d  */
    @Override // X.C7QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADy(X.KT2 r33, X.C44781Js2 r34) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49124Lo3.ADy(X.KT2, X.Js2):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 1);
        C44781Js2 c44781Js2 = new C44781Js2(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_two_card_xma_message, false));
        C162907Rb c162907Rb = this.A04;
        if (c162907Rb != null) {
            c162907Rb.A00(c44781Js2);
        }
        return c44781Js2;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        C162907Rb c162907Rb = this.A04;
        if (c162907Rb != null) {
            c162907Rb.A01(c7qd);
        }
    }
}
