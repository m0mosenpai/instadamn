package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.E8h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32083E8h extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final DirectShareTarget A01;
    public final String A02;
    public final List A03;

    public C32083E8h(DirectShareTarget directShareTarget, int i) {
        C14360o3.A0B(directShareTarget, 1);
        this.A01 = directShareTarget;
        this.A00 = i;
        this.A03 = AbstractC166987dD.A1J(40);
        String A08 = directShareTarget.A08();
        this.A02 = A08 == null ? AbstractC31173DnH.A0o(directShareTarget) : A08;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32083E8h) {
                C32083E8h c32083E8h = (C32083E8h) obj;
                if (!C14360o3.A0K(this.A01, c32083E8h.A01) || this.A00 != c32083E8h.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C32083E8h c32083E8h = (C32083E8h) obj;
        C14360o3.A0B(c32083E8h, 0);
        if (this.A00 == c32083E8h.A00) {
            DirectShareTarget directShareTarget = this.A01;
            String A08 = directShareTarget.A08();
            DirectShareTarget directShareTarget2 = c32083E8h.A01;
            if (C14360o3.A0K(A08, directShareTarget2.A08()) && directShareTarget.A0U == directShareTarget2.A0U && C14360o3.A0K(this.A03, c32083E8h.A03)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }
}
