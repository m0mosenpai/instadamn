package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.user.model.User;

/* renamed from: X.PIs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56801PIs implements InterfaceC58171Pqb {
    public LiveUserPaySupportTier A00;
    public User A01;
    public String A02 = "";
    public boolean A03;

    @Override // X.InterfaceC58171Pqb
    public final long Asb() {
        return AbstractC167027dH.A03(this.A02);
    }

    @Override // X.InterfaceC58171Pqb
    public final EnumC53264Nh2 BO3() {
        return EnumC53264Nh2.A09;
    }

    @Override // X.InterfaceC58171Pqb
    public final User CDj() {
        return this.A01;
    }

    @Override // X.InterfaceC58171Pqb
    public final String getPk() {
        return AbstractC25231BEo.A0t(this.A01);
    }

    @Override // X.InterfaceC58171Pqb
    public final String getText() {
        return null;
    }
}
