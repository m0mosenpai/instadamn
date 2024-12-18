package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.WeG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70636WeG implements XCL {
    public boolean A00 = false;
    public final View.OnClickListener A01;
    public final ImageUrl A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;

    public C70636WeG(View.OnClickListener onClickListener, ImageUrl imageUrl, Integer num, Long l, String str) {
        this.A05 = str;
        this.A02 = imageUrl;
        this.A04 = l;
        this.A03 = num;
        this.A01 = onClickListener;
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
