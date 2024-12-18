package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U1F extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final XLT A01;
    public final InterfaceC72020XFi A02;
    public final boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bb, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r22, X.C3OO r23) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1F.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUZ.class;
    }

    public U1F(InterfaceC11380iw interfaceC11380iw, XLT xlt, InterfaceC72020XFi interfaceC72020XFi, boolean z) {
        this.A00 = interfaceC11380iw;
        this.A01 = xlt;
        this.A02 = interfaceC72020XFi;
        this.A03 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.row_place, false);
        A0C.setTag(new C69395Vmf(A0C));
        C3OO c3oo = new C3OO(A0C);
        if (A0C.getTag() instanceof C69395Vmf) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }
}
