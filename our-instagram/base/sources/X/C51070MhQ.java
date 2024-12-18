package X;

import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MhQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51070MhQ extends PagingDataAdapter {
    public final O4D A00;
    public final InterfaceC16620sF A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51070MhQ(X.O4D r3, X.InterfaceC16620sF r4) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            X.Mhq r1 = X.C51091Mhq.A00
            X.12T r0 = X.C12P.A00
            X.137 r0 = X.AnonymousClass131.A00
            r2.<init>(r1, r0)
            r2.A00 = r3
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51070MhQ.<init>(X.O4D, X.0sF):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51360MmL(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.story_template_discovery_surface_section_view, false), this.A00);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51360MmL c51360MmL = (C51360MmL) c3oo;
        C14360o3.A0B(c51360MmL, 0);
        C38687GzS c38687GzS = (C38687GzS) A02(i);
        if (c38687GzS != null) {
            Object obj = c38687GzS.A00;
            if (obj != EnumC39612HeM.UNSET_OR_UNRECOGNIZED_ENUM_VALUE && obj != null) {
                IgTextView igTextView = c51360MmL.A02;
                igTextView.setText(c38687GzS.A01);
                AbstractC166997dE.A1L(AbstractC167007dF.A0L(c51360MmL.A03), true);
                AbstractC167007dF.A0y(igTextView, true);
            } else {
                AbstractC167017dG.A1W(c51360MmL.A03, 0);
                c51360MmL.A02.setVisibility(8);
            }
            Object obj2 = c38687GzS.A00;
            if (obj2 != null) {
                this.A01.invoke(c51360MmL.A01, obj2);
            }
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        C51360MmL c51360MmL = (C51360MmL) c3oo;
        C14360o3.A0B(c51360MmL, 0);
        c51360MmL.A02.setText((CharSequence) null);
    }
}
