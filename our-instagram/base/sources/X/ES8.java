package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ES8 extends AbstractC65632xz {
    public final UserSession A00;
    public final ENZ A01;
    public final Context A02;
    public final boolean A03;

    public ES8(Context context, UserSession userSession, ENZ enz, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A02 = context;
        this.A00 = userSession;
        this.A01 = enz;
        this.A03 = z;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return AbstractC31177DnL.A04(((C38321qM) obj).getId());
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return ((C38321qM) obj).A0w();
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (X.C77153d1.A03(r4, r12, r1) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017a, code lost:
    
        if (r11 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0155 A[ADDED_TO_REGION] */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r19, android.view.View r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ES8.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.A0E != null) goto L6;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.AnonymousClass306 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            X.1qM r8 = (X.C38321qM) r8
            r5 = 0
            X.AbstractC167007dF.A1K(r7, r8)
            X.ENZ r1 = r6.A01
            java.lang.CharSequence r0 = r1.A0D
            if (r0 != 0) goto L11
            java.lang.CharSequence r0 = r1.A0E
            r4 = 0
            if (r0 == 0) goto L12
        L11:
            r4 = 1
        L12:
            java.lang.Integer r3 = r1.A0F
            com.instagram.common.session.UserSession r2 = r6.A00
            X.3d1 r1 = X.C77153d1.A00
            r0 = 3
            X.C14360o3.A0B(r2, r0)
            boolean r0 = X.C77153d1.A02(r2, r8)
            if (r0 != 0) goto L2e
            boolean r0 = r1.A05(r2, r8, r3, r4)
            if (r0 != 0) goto L2e
            boolean r0 = X.C77153d1.A03(r2, r8, r3)
            if (r0 == 0) goto L31
        L2e:
            r7.A7a(r5)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ES8.buildRowViewTypes(X.306, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -610206975);
        Context context = this.A02;
        UserSession userSession = this.A00;
        AbstractC167007dF.A1D(context, 0, userSession);
        LayoutInflater from = LayoutInflater.from(context);
        boolean A01 = FYF.A01(userSession);
        int i2 = R.layout.view_and_like_counts_header_row;
        if (A01) {
            i2 = R.layout.like_and_view_counts_header_row;
        }
        View A0C = AbstractC31173DnH.A0C(from, viewGroup, i2, false);
        A0C.setTag(new C34638FNv(A0C));
        boolean A012 = FYF.A01(userSession);
        int i3 = R.drawable.instagram_play_filled_16;
        if (A012) {
            i3 = R.drawable.instagram_play_pano_outline_16;
        }
        FY7.A00(context, A0C, R.id.video_view_count_text, i3);
        boolean A013 = FYF.A01(userSession);
        int i4 = R.drawable.instagram_heart_filled_16;
        if (A013) {
            i4 = R.drawable.instagram_heart_pano_outline_16;
        }
        FY7.A00(context, A0C, R.id.like_count_text, i4);
        FY7.A00(context, A0C, R.id.impression_count_text, R.drawable.instagram_eye_pano_outline_16);
        C0f9.A0A(1744666647, A0G);
        return A0C;
    }
}
