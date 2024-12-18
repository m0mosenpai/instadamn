package X;

import com.instagram.common.gallery.Medium;
import java.io.File;

/* renamed from: X.AdG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23621AdG implements InterfaceC189048Yu {
    @Override // X.InterfaceC189048Yu
    public final boolean CfT(Medium medium) {
        File A11 = AbstractC166987dD.A11(medium.A0X);
        if (A11.exists() && A11.canRead()) {
            return true;
        }
        return false;
    }
}
