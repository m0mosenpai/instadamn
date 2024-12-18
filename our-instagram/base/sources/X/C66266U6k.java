package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.U6k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66266U6k extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final InterfaceC71989XEc A04;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0655, code lost:
    
        if (r8.CQf() != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0630, code lost:
    
        if (r9.A0H != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x076c, code lost:
    
        if (r13 != r12.hashCode()) goto L213;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x069c  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r40, android.view.View r41, java.lang.Object r42, java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 2123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66266U6k.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 != X.C05F.A15) goto L8;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.AnonymousClass306 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r3 = this;
            X.GsB r5 = (X.C38266GsB) r5
            X.ViW r0 = r5.A0I
            if (r0 == 0) goto L15
            com.instagram.model.reels.Reel r0 = r0.A02
            X.1NB r0 = r0.A0W
            if (r0 == 0) goto L15
            java.lang.Integer r2 = r0.CBs()
            java.lang.Integer r1 = X.C05F.A15
            r0 = 1
            if (r2 == r1) goto L16
        L15:
            r0 = 0
        L16:
            r4.A7a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66266U6k.buildRowViewTypes(X.306, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        String id;
        if (i != 0) {
            if (i != 1) {
                return Integer.MAX_VALUE;
            }
            C69141ViW c69141ViW = ((C38266GsB) obj).A0I;
            c69141ViW.getClass();
            id = c69141ViW.A02.getId();
        } else {
            User user = ((C38266GsB) obj).A0L;
            user.getClass();
            id = user.getId();
        }
        return id.hashCode();
    }

    public C66266U6k(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC71989XEc interfaceC71989XEc) {
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = interfaceC71989XEc;
        this.A01 = interfaceC11380iw;
        this.A02 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int i2;
        View view;
        int A03 = C0f9.A03(1934320243);
        if (i != 0) {
            if (i == 1) {
                View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.reel_dashboard_aggregate_product_row);
                A0A.setTag(new C69306VlE(A0A));
                i2 = 786646145;
                view = A0A;
            } else {
                IllegalStateException A0U = AbstractC31175DnJ.A0U(MSV.A00(AbstractC62862SUj.MAX_FACTORIAL), i);
                C0f9.A0A(-42183208, A03);
                throw A0U;
            }
        } else {
            ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_reel_viewer);
            viewGroup2.setTag(new C69485Vo8(viewGroup2));
            i2 = 1558656181;
            view = viewGroup2;
        }
        C0f9.A0A(i2, A03);
        return view;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
