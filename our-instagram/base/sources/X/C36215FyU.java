package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.FyU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36215FyU implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final DirectShareTarget A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C36215FyU(DirectShareTarget directShareTarget, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        StringBuilder A1C;
        C14360o3.A0B(directShareTarget, 1);
        this.A05 = directShareTarget;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append("-DELETION-");
        A1C2.append(z2);
        A1C2.append("-SECTION-");
        A1C2.append(i);
        String obj = A1C2.toString();
        String A08 = directShareTarget.A08();
        if (A08 != null) {
            A1C = AbstractC166987dD.A1C();
            A1C.append("THREAD-");
        } else {
            ArrayList A1F = AbstractC166987dD.A1F(directShareTarget.A0B());
            Collections.sort(A1F);
            A1C = AbstractC166987dD.A1C();
            A1C.append("RECIPIENTS_ID-");
            A08 = AbstractC13670mt.A05(":", A1F);
        }
        A1C.append(A08);
        this.A06 = AbstractC166997dE.A0x(obj, A1C);
    }

    public static final ArrayList A00(List list, int i, int i2, int i3, int i4, boolean z) {
        C14360o3.A0B(list, 0);
        return F3Q.A00(null, null, list, i, i2, i3, i4, false, false, z);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36215FyU c36215FyU = (C36215FyU) obj;
        C14360o3.A0B(c36215FyU, 0);
        DirectShareTarget directShareTarget = this.A05;
        DirectShareTarget directShareTarget2 = c36215FyU.A05;
        if (C14360o3.A0K(directShareTarget, directShareTarget2)) {
            ImageUrl imageUrl = directShareTarget.A02;
            ImageUrl imageUrl2 = directShareTarget2.A02;
            if (imageUrl != null ? imageUrl.equals(imageUrl2) : imageUrl2 == null) {
                if (this.A02 == c36215FyU.A02 && this.A00 == c36215FyU.A00 && this.A01 == c36215FyU.A01 && this.A04 == c36215FyU.A04 && this.A03 == c36215FyU.A03 && this.A07 == c36215FyU.A07 && this.A08 == c36215FyU.A08 && this.A09 == c36215FyU.A09) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }
}
