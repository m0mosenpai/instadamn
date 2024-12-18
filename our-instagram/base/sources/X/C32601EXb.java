package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;

/* renamed from: X.EXb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32601EXb extends AbstractC66412zI {
    public View A00;
    public final Context A01;
    public final EOT A02;
    public final InterfaceC11380iw A03;
    public final boolean A04;

    /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0131  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r32, X.C3OO r33) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32601EXb.bind(X.2zP, X.3OO):void");
    }

    public C32601EXb(Context context, EOT eot, InterfaceC11380iw interfaceC11380iw, boolean z) {
        this.A01 = context;
        this.A03 = interfaceC11380iw;
        this.A02 = eot;
        this.A04 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_audience_list_row_item, false);
        this.A00 = A0R;
        return new C31983E3l(A0R);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AudienceListViewModel.class;
    }
}
