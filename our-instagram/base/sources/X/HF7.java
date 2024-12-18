package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HF7 extends AbstractC65632xz {
    public final JPp A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, obj);
        anonymousClass306.A7a(0);
        anonymousClass306.A7a(A1R ? 1 : 0);
        this.A00.AAq(obj);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d3, code lost:
    
        if (r10 == r1) goto L54;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r18, android.view.View r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HF7.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public HF7(InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPp jPp) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = jPp;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A00;
        int i2;
        int A03 = C0f9.A03(-1388355232);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i == 1) {
                A00 = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.featured_product_row, false);
                A00.setTag(new IIA(A00));
                i2 = -1434351889;
            } else {
                IllegalArgumentException A12 = AbstractC166987dD.A12("unexpected view type");
                C0f9.A0A(-19314914, A03);
                throw A12;
            }
        } else {
            A00 = IS7.A00(viewGroup);
            i2 = 1247998490;
        }
        C0f9.A0A(i2, A03);
        return A00;
    }
}
