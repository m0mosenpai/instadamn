package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class KYL extends C49489Lu2 {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ KZG A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public KYL(ImageUrl imageUrl, KZG kzg, String str, String str2) {
        this.A01 = kzg;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
    }

    @Override // X.C49489Lu2, X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        this.A01.A00(this.A00, this.A03, this.A02);
    }
}
