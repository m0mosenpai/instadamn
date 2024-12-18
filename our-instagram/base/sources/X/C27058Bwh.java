package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Bwh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27058Bwh extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(null, 0);
        throw C00O.createAndThrow();
    }

    public C27058Bwh(Context context, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_iglive_fundraiser_redesign_row, false);
        A0D.setTag(new C25942Bdj(A0D));
        Object tag = A0D.getTag();
        if (tag instanceof C25942Bdj) {
            return (C3OO) tag;
        }
        return null;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AbstractC26167Bhs.class;
    }
}
