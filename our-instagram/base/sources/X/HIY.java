package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class HIY extends AbstractC66412zI {
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final ID9 A02;
    public final C41046IFp A03;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0103, code lost:
    
        if (r9.A00.A01 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02a0, code lost:
    
        if (r1 == null) goto L89;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r28, X.C3OO r29) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HIY.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42327Iop.class;
    }

    public HIY(Fragment fragment, InterfaceC11380iw interfaceC11380iw, ID9 id9, C41046IFp c41046IFp) {
        this.A02 = id9;
        this.A01 = interfaceC11380iw;
        this.A00 = fragment;
        this.A03 = c41046IFp;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38508GwT(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.tagging_feed_commerce_item, false));
    }
}
