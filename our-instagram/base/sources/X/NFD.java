package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* loaded from: classes9.dex */
public final class NFD extends AbstractC66422zJ {
    public final int A00;
    public final int A01;
    public final O2V A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56080Oux c56080Oux = (C56080Oux) interfaceC66482zP;
        C51246MkV c51246MkV = (C51246MkV) c3oo;
        AbstractC167017dG.A1N(c56080Oux, c51246MkV);
        O2V o2v = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        C14360o3.A0B(o2v, 2);
        String str = c56080Oux.A00;
        C55941OsZ c55941OsZ = new C55941OsZ(c51246MkV);
        boolean z = C1NC.A02;
        C14120nc.A00().ATO(new C52385NGg(c55941OsZ, str, i, i2));
        ViewOnClickListenerC55464OkJ.A01(c51246MkV.A00, 64, c51246MkV, o2v);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56080Oux.class;
    }

    public NFD(O2V o2v, int i, int i2) {
        this.A02 = o2v;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = this.A01;
        int i2 = this.A00;
        View inflate = layoutInflater.inflate(R.layout.share_photo_media_preview_layout, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(48));
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
        MSY.A10(igFrameLayout, i, i2);
        Object A0Q = AbstractC37303Gc4.A0Q(igFrameLayout, new C51246MkV(igFrameLayout));
        C14360o3.A0C(A0Q, "null cannot be cast to non-null type com.instagram.creation.fragment.sharepreview.SharePhotoMediaPreviewViewBinder.Companion.Holder");
        return (C3OO) A0Q;
    }
}
