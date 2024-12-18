package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195588ky extends AbstractC66412zI {
    public final C9BW A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC195388ke A03;
    public final InterfaceC16820sZ A04;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        InterfaceC195388ke interfaceC195388ke = this.A03;
        UserSession userSession = this.A02;
        C9BW c9bw = this.A00;
        C14360o3.A0B(interfaceC195388ke, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c9bw, 4);
        View inflate = layoutInflater.inflate(R.layout.gallery_grid_item, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        return new C9V3((ConstraintLayout) inflate, c9bw, userSession, interfaceC195388ke);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        if (r3.A09 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        X.AbstractC125325le.A04(null, new android.view.View[]{r8.A03}, r8.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
    
        if (r2 != (-1)) goto L39;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r17, X.C3OO r18) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195588ky.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C195608l0.class;
    }

    public C195588ky(C9BW c9bw, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC195388ke interfaceC195388ke, InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = interfaceC195388ke;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A00 = c9bw;
        this.A04 = interfaceC16820sZ;
    }
}
