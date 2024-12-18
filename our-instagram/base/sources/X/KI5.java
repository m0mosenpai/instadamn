package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

/* loaded from: classes8.dex */
public final class KI5 extends AbstractC66412zI {
    public final int A00;
    public final C47246KuJ A01;
    public final C8SG A02;

    public KI5(C47246KuJ c47246KuJ, C8SG c8sg, int i) {
        C14360o3.A0B(c8sg, 1);
        this.A02 = c8sg;
        this.A00 = i;
        this.A01 = c47246KuJ;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = MediaPickerItemView.A0X;
        MediaPickerItemView mediaPickerItemView = new MediaPickerItemView(AbstractC166997dE.A0L(viewGroup), (MQJ) null, false);
        mediaPickerItemView.setMinimumHeight(this.A00);
        return new Jp1(mediaPickerItemView);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZF lzf = (LZF) interfaceC66482zP;
        Jp1 jp1 = (Jp1) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, lzf, jp1);
        MediaPickerItemView mediaPickerItemView = jp1.A00;
        C0fQ.A00(new ViewOnClickListenerC48068LPt(A1R ? 1 : 0, this, mediaPickerItemView, lzf), mediaPickerItemView);
        mediaPickerItemView.setOnLongClickListener(new LQL(mediaPickerItemView, 0));
        mediaPickerItemView.A03(new C9BB(null, 0, 0, 15, 3, false, false), this.A02, lzf.A00, false, false, false, false);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZF.class;
    }
}
