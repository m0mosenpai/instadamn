package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66002yc extends AbstractC65632xz {
    public C3GB A00;
    public final Context A01;
    public final UserSession A02;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "ReelFeed";
    }

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

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        this.A00 = (C3GB) obj;
        anonymousClass306.A7a(0);
    }

    public C66002yc(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3;
        ViewGroup viewGroup;
        int A03 = C0f9.A03(-2140336967);
        C3GB c3gb = this.A00;
        c3gb.getClass();
        View C13 = c3gb.A00.C13();
        this.A00.getClass();
        if (view != null) {
            obj3 = view.getTag();
        } else {
            obj3 = null;
        }
        C3OS c3os = (C3OS) obj3;
        if (C13 != null) {
            ViewGroup viewGroup2 = (ViewGroup) C13.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(C13);
            }
            if (c3os != null && (viewGroup = c3os.A00) != null) {
                viewGroup.addView(C13, 0);
            }
        }
        C0f9.A0A(175995539, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        if (X.C18U.A06(r3, r7, 36320279270662396L) != false) goto L11;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View createView(int r9, android.view.ViewGroup r10) {
        /*
            r8 = this;
            r0 = -1541471685(0xffffffffa41f023b, float:-3.447952E-17)
            int r2 = X.C0f9.A03(r0)
            if (r9 != 0) goto L99
            X.3GB r0 = r8.A00
            if (r0 != 0) goto L1f
            java.lang.String r5 = "ReelFeedBinderGroup"
            java.lang.String r4 = "Model is null in createView for viewType = "
            r3 = 0
            java.lang.String r1 = " and parent = "
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = X.AnonymousClass001.A05(r3, r4, r1, r0)
            X.C0w9.A03(r5, r0)
        L1f:
            android.content.Context r5 = r8.A01
            com.instagram.common.session.UserSession r1 = r8.A02
            r4 = 0
            X.C14360o3.A0B(r5, r4)
            r0 = 1
            X.C14360o3.A0B(r10, r0)
            r0 = 2
            X.C14360o3.A0B(r1, r0)
            X.1Lr r6 = X.AbstractC25351Lp.A00(r1)
            com.instagram.common.session.UserSession r7 = r6.A00
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36320279270596859(0x81091a001120fb, double:3.032429088526677E-306)
            boolean r0 = X.C18U.A06(r3, r7, r0)
            if (r0 != 0) goto L4e
            r0 = 36320279270662396(0x81091a001220fc, double:3.032429088568123E-306)
            boolean r1 = X.C18U.A06(r3, r7, r0)
            r0 = 0
            if (r1 == 0) goto L4f
        L4e:
            r0 = 1
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            if (r0 == 0) goto L72
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131625943(0x7f0e07d7, float:1.8879108E38)
        L5a:
            android.view.View r1 = r1.inflate(r0, r10, r4)
            X.C14360o3.A0C(r1, r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.3OS r0 = new X.3OS
            r0.<init>(r1)
            r1.setTag(r0)
            r0 = 708698273(0x2a3de0a1, float:1.6864506E-13)
            X.C0f9.A0A(r0, r2)
            return r1
        L72:
            boolean r0 = X.C25371Lr.A00(r6)
            if (r0 != 0) goto L91
            X.0do r0 = r6.A01
            java.lang.Object r0 = r0.getValue()
            X.C14360o3.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L91
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131629511(0x7f0e15c7, float:1.8886345E38)
            goto L5a
        L91:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131629516(0x7f0e15cc, float:1.8886355E38)
            goto L5a
        L99:
            r0 = 342(0x156, float:4.79E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            r0 = 530500778(0x1f9eccaa, float:6.725419E-20)
            X.C0f9.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66002yc.createView(int, android.view.ViewGroup):android.view.View");
    }
}
