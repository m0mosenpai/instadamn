package X;

import android.widget.ImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.PbF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57231PbF extends C03E implements InterfaceC16620sF {
    public static final C57231PbF A00 = new C57231PbF();

    public C57231PbF() {
        super(2, SpinnerImageView.class, "setImageResource", "setImageResource(I)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        int A0H = AbstractC166987dD.A0H(obj2);
        C14360o3.A0B(imageView, 0);
        imageView.setImageResource(A0H);
        return C0eB.A00;
    }
}
