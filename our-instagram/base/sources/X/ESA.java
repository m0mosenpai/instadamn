package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ESA extends AbstractC65632xz {
    public final FNJ A00;
    public final Activity A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final EVJ A05;
    public final String A06;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0302, code lost:
    
        if (r19 >= 86400000) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ea  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r29, android.view.View r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESA.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        FNJ fnj;
        C34686FPx c34686FPx = (C34686FPx) obj2;
        C14360o3.A0B(c34686FPx, 2);
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
        if (c34686FPx.A00() && (fnj = this.A00) != null) {
            EnumC33405Epc enumC33405Epc = EnumC33405Epc.A03;
            C14360o3.A0B(enumC33405Epc, 0);
            AbstractC31176DnK.A1V(fnj.A00, C59062n7.A00(enumC33405Epc, C0eB.A00, "discover_people"), fnj.A04, "discover_people");
        }
    }

    public ESA(Activity activity, Context context, FNJ fnj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EVJ evj, String str) {
        this.A02 = context;
        this.A01 = activity;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A05 = evj;
        this.A00 = fnj;
        this.A06 = str;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        UserSession userSession;
        EnumC72435Xdf enumC72435Xdf;
        int A03 = C0f9.A03(691585626);
        EnumC72412Xd8 enumC72412Xd8 = this.A05.A05;
        if (enumC72412Xd8 == EnumC72412Xd8.A0S) {
            userSession = this.A04;
            enumC72435Xdf = EnumC72435Xdf.A0J;
        } else {
            if (enumC72412Xd8 == EnumC72412Xd8.A0C) {
                userSession = this.A04;
                enumC72435Xdf = EnumC72435Xdf.A03;
            }
            View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(this.A02), R.layout.row_find_people_buttons);
            C14360o3.A0A(A0C);
            A0C.setTag(new FO6(A0C));
            C0f9.A0A(1886523137, A03);
            return A0C;
        }
        AbstractC35174FfR.A00(enumC72435Xdf, userSession, "upsell_impressions");
        View A0C2 = AbstractC25227BEk.A0C(LayoutInflater.from(this.A02), R.layout.row_find_people_buttons);
        C14360o3.A0A(A0C2);
        A0C2.setTag(new FO6(A0C2));
        C0f9.A0A(1886523137, A03);
        return A0C2;
    }
}
