package X;

import com.instagram.leadgen.core.api.LeadForm;

/* renamed from: X.K2w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45294K2w extends C0T6 implements InterfaceC50508MRl {
    public final LeadForm A00;
    public final C38595Gxy A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45294K2w) {
                C45294K2w c45294K2w = (C45294K2w) obj;
                if (!C14360o3.A0K(this.A01, c45294K2w.A01) || !C14360o3.A0K(this.A00, c45294K2w.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C45294K2w(LeadForm leadForm, C38595Gxy c38595Gxy) {
        this.A01 = c38595Gxy;
        this.A00 = leadForm;
    }
}
