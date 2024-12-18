package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153836vs extends AbstractC66412zI {
    public int A00;
    public int A01;
    public final InterfaceC153536vO A02;
    public final C153746vj A03;
    public final C153806vp A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final InterfaceC132405yL A07;
    public final C153856vu A08;
    public final C153736vi A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final C153846vt A0E;

    /* JADX WARN: Type inference failed for: r5v0, types: [X.6vt] */
    public C153836vs(InterfaceC154856xa interfaceC154856xa, InterfaceC153536vO interfaceC153536vO, C153746vj c153746vj, C153806vp c153806vp, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC132405yL interfaceC132405yL, C153736vi c153736vi, String str, String str2, int i, int i2, boolean z, boolean z2) {
        C14360o3.A0B(c153806vp, 5);
        C14360o3.A0B(c153736vi, 6);
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A02 = interfaceC153536vO;
        this.A04 = c153806vp;
        this.A09 = c153736vi;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = c153746vj;
        this.A0D = z;
        this.A07 = interfaceC132405yL;
        this.A0C = z2;
        this.A0B = str;
        this.A0A = str2;
        ?? r5 = new Object(userSession) { // from class: X.6vt
            public final UserSession A00;

            {
                this.A00 = userSession;
            }
        };
        this.A0E = r5;
        this.A08 = new C153856vu(interfaceC154856xa, interfaceC153536vO, interfaceC11380iw, userSession, r5, c153736vi);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        C0YR[] c0yrArr = C38011Gnx.A0E;
        View inflate = layoutInflater.inflate(R.layout.layout_clips_grid_item, viewGroup, false);
        C14360o3.A07(inflate);
        return new C38011Gnx(inflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
    
        if (r11 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0152  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r24, X.C3OO r25) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153836vs.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C154026wB.class;
    }
}
