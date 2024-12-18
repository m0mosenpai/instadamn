package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66062yi extends AbstractC65632xz {
    public C5GM A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC64632wM A04;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "FeedMegaphone";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 == false) goto L6;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.AnonymousClass306 r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            r2 = this;
            X.5GM r4 = (X.C5GM) r4
            r2.A00 = r4
            X.V80 r0 = r4.A02
            if (r0 == 0) goto L13
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "v3"
            boolean r1 = r0.equalsIgnoreCase(r1)
            r0 = 1
            if (r1 != 0) goto L14
        L13:
            r0 = 0
        L14:
            r3.A7a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66062yi.buildRowViewTypes(X.306, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((C5GM) obj).A00.A00.hashCode();
    }

    public C66062yi(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC64632wM interfaceC64632wM) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = interfaceC64632wM;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1416017342);
        W6o.A02(this.A01, view, this.A02, this.A04, (C5GM) obj);
        C0f9.A0A(-1574240663, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(2029693650);
        Context context = this.A01;
        C5GM c5gm = this.A00;
        c5gm.getClass();
        LinearLayout A01 = W6o.A01(context, c5gm);
        C0f9.A0A(897800622, A03);
        return A01;
    }
}
