package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Lnq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49113Lnq implements C7QC {
    public final Activity A00;
    public final UserSession A01;
    public final C47566Kzc A02;
    public final C162907Rb A03;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        boolean A01 = LC3.A01(userSession);
        int i = R.layout.direct_prompt_xma_legacy;
        if (A01) {
            i = R.layout.direct_prompt_xma_message;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        inflate.getLayoutParams().width = -2;
        C44784Js5 c44784Js5 = new C44784Js5(this.A00, inflate, userSession);
        this.A03.A00(c44784Js5);
        return c44784Js5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x009d, code lost:
    
        if (r3.length() == 0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r36, X.InterfaceC129555tK r37) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49113Lnq.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C44784Js5 c44784Js5 = (C44784Js5) c7qd;
        C14360o3.A0B(c44784Js5, 0);
        Iterator it = c44784Js5.A03.iterator();
        while (it.hasNext()) {
            ((C47650L2j) it.next()).A03.A01().A09();
        }
        this.A03.A01(c44784Js5);
    }

    public C49113Lnq(Activity activity, UserSession userSession, C47566Kzc c47566Kzc, C162907Rb c162907Rb) {
        this.A02 = c47566Kzc;
        this.A03 = c162907Rb;
        this.A00 = activity;
        this.A01 = userSession;
    }
}
