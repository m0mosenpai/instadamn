package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes11.dex */
public final class WeH implements XCL {
    public boolean A00;
    public final View.OnClickListener A01;
    public final VG5 A02;
    public final ImageUrl A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public WeH(View.OnClickListener onClickListener, VG5 vg5, ImageUrl imageUrl, String str, String str2, boolean z) {
        C14360o3.A0B(onClickListener, 5);
        this.A05 = str;
        this.A03 = imageUrl;
        this.A04 = str2;
        this.A02 = vg5;
        this.A01 = onClickListener;
        this.A00 = false;
        this.A06 = z;
    }

    @Override // X.XCL
    public final void EdP(boolean z) {
        this.A00 = true;
    }

    @Override // X.XCL
    public final boolean BsE() {
        return this.A00;
    }
}
