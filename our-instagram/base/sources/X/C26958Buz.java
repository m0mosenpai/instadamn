package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Buz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26958Buz extends AbstractC65632xz {
    public final LayoutInflater A00;
    public final UserSession A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C26958Buz(Context context, UserSession userSession) {
        this.A00 = LayoutInflater.from(context);
        this.A01 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(428897324);
        Object tag = view.getTag();
        tag.getClass();
        CPO cpo = (CPO) tag;
        C14360o3.A0B(cpo, 0);
        TextView textView = cpo.A00;
        textView.setText((CharSequence) obj);
        AbstractC25227BEk.A11(textView);
        C0f9.A0A(-1454279402, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r1 == false) goto L6;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View createView(int r8, android.view.ViewGroup r9) {
        /*
            r7 = this;
            r0 = -918611600(0xffffffffc93f1970, float:-782743.0)
            int r6 = X.C0f9.A03(r0)
            android.view.LayoutInflater r5 = r7.A00
            com.instagram.common.session.UserSession r4 = r7.A01
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r3 = 0
            if (r4 == 0) goto L22
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36328894973886296(0x8110f000003f58, double:3.0378776939795695E-306)
            boolean r1 = X.C18U.A06(r2, r4, r0)
            r0 = 2131628993(0x7f0e13c1, float:1.8885294E38)
            if (r1 != 0) goto L25
        L22:
            r0 = 2131628992(0x7f0e13c0, float:1.8885292E38)
        L25:
            android.view.View r1 = r5.inflate(r0, r3)
            X.C14360o3.A0A(r1)
            X.CPO r0 = new X.CPO
            r0.<init>(r1)
            r1.setTag(r0)
            r0 = -529468653(0xffffffffe070f313, float:-6.9448968E19)
            X.C0f9.A0A(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26958Buz.createView(int, android.view.ViewGroup):android.view.View");
    }
}
