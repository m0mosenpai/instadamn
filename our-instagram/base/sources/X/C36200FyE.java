package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FyE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36200FyE implements InterfaceC66482zP {
    public String A00;
    public final int A01;
    public final DirectShareTarget A02;

    public C36200FyE(DirectShareTarget directShareTarget, int i) {
        C14360o3.A0B(directShareTarget, 1);
        this.A02 = directShareTarget;
        this.A01 = i;
        String A08 = directShareTarget.A08();
        this.A00 = A08 == null ? AbstractC31173DnH.A0o(directShareTarget) : A08;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36200FyE c36200FyE = (C36200FyE) obj;
        C14360o3.A0B(c36200FyE, 0);
        DirectShareTarget directShareTarget = this.A02;
        DirectShareTarget directShareTarget2 = c36200FyE.A02;
        if (C14360o3.A0K(directShareTarget, directShareTarget2)) {
            ImageUrl imageUrl = directShareTarget.A02;
            ImageUrl imageUrl2 = directShareTarget2.A02;
            if (imageUrl != null ? imageUrl.equals(imageUrl2) : imageUrl2 == null) {
                if (this.A01 == c36200FyE.A01) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }
}
