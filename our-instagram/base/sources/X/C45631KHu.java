package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

/* renamed from: X.KHu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45631KHu extends AbstractC66412zI {
    public final int A00;
    public final C47247KuK A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, X.8SG] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZX lzx = (LZX) interfaceC66482zP;
        C44658Jq3 c44658Jq3 = (C44658Jq3) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, lzx, c44658Jq3);
        C46077KaZ c46077KaZ = c44658Jq3.A01;
        c46077KaZ.A03(new C9BB(null, 0, 0, 15, 3, false, false), new Object(), AbstractC167017dG.A0d(new Medium(null, "", lzx.A00, A1R ? 1 : 0, 0, 0, 0L, 0L)), false, false, false, false);
        c46077KaZ.setMinHeight(c46077KaZ.A00);
        lzx.A01.A01(new C48544Ldh(0, c44658Jq3, lzx));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZX.class;
    }

    public C45631KHu(C47247KuK c47247KuK, int i) {
        this.A00 = i;
        this.A01 = c47247KuK;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JQ0.A1M(viewGroup);
        int i = MediaPickerItemView.A0X;
        return new C44658Jq3(this.A01, new C46077KaZ(AbstractC166997dE.A0L(viewGroup), this.A00));
    }
}
