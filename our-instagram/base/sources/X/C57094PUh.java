package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.PUh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57094PUh implements InterfaceC09250da, InterfaceC16600sD {
    public final int A00;
    public final Object A01;

    public C57094PUh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16600sD
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A00) {
            case 0:
                C183688Ct c183688Ct = (C183688Ct) this.A01;
                C23108AGw c23108AGw = (C23108AGw) obj;
                Drawable drawable = (Drawable) obj2;
                C148276lx c148276lx = (C148276lx) obj3;
                if (c23108AGw != null && drawable != null && c148276lx != null) {
                    ((C8NW) c183688Ct.A1h.get()).A1G(drawable, c148276lx, c23108AGw);
                    return null;
                }
                return null;
            case 1:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                DirectShareSheetFragment.A08((Bitmap) obj4, directShareSheetFragment, directShareSheetFragment.A0m.A0I);
                return null;
            default:
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                String str2 = (String) obj3;
                String str3 = (String) obj4;
                C31370Dqa c31370Dqa = ((C31721DwQ) this.A01).A0j;
                if (c31370Dqa != null) {
                    c31370Dqa.A04(bool.booleanValue(), str, str2, str3);
                }
                return C0eB.A00;
        }
    }
}
