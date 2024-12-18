package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Ldk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48547Ldk implements InterfaceC65702y7, InterfaceC59152nG {
    public final int A00;
    public final Object A01;

    public C48547Ldk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(igImageView, 0);
                C8FY c8fy = new C8FY(igImageView.getResources(), bitmap);
                igImageView.setImageDrawable(c8fy);
                c8fy.A02(AbstractC166987dD.A02(igImageView.A02));
                C44765Jrm c44765Jrm = (C44765Jrm) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c44765Jrm.A09.set(true);
                C44765Jrm.A00(c44765Jrm);
                return;
            case 1:
                igImageView.setImageDrawable(new C8FY(igImageView.getResources(), bitmap));
                return;
            default:
                AbstractC167017dG.A1N(igImageView, bitmap);
                igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.1f, 3));
                InterfaceC09390do interfaceC09390do = ((PCR) this.A01).A05;
                Context A0L = AbstractC166997dE.A0L(AbstractC166987dD.A0d(interfaceC09390do));
                ImageView imageView = (ImageView) interfaceC09390do.getValue();
                C14360o3.A07(imageView);
                AbstractC85953sP.A03(A0L, imageView, R.color.black_55_transparent);
                return;
        }
    }
}
