package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class LnW implements InterfaceC50515MRs {
    public final C0f6 A00;
    public final C7DK A01;

    public LnW(C0f6 c0f6, C7DK c7dk) {
        C14360o3.A0B(c0f6, 2);
        this.A01 = c7dk;
        this.A00 = c0f6;
    }

    @Override // X.InterfaceC50515MRs
    public final void E4U(C7GU c7gu, DirectMessageIdentifier directMessageIdentifier, String str, long j, long j2) {
        try {
            if (j2 > 0 && j < j2) {
                ArrayList A1E = AbstractC166987dD.A1E();
                A1E.add("undefined");
                Integer num = C05F.A0u;
                String A0j = AbstractC167017dG.A0j();
                ProductType productType = ProductType.DIRECT_AUDIO;
                C48536LdZ c48536LdZ = new C48536LdZ(str, 0);
                boolean z = true;
                int i = (int) j;
                int i2 = (int) j2;
                if (str.length() <= 0) {
                    z = false;
                }
                C75363a3 c75363a3 = new C75363a3(c48536LdZ, productType, null, null, null, num, null, A0j, null, null, null, null, "undefined", null, null, null, null, A1E, null, i, i2, -1L, false, false, false, true, false, false, z, false);
                C7DK c7dk = this.A01;
                Integer num2 = C05F.A00;
                c7dk.A07(c7gu, EnumC92794Ds.A07, null, null, directMessageIdentifier, c75363a3, num2, num2, num2, 0L, null, null, false, false);
                return;
            }
            throw AbstractC166987dD.A12("Invalid clip positions");
        } catch (Exception unused) {
            this.A00.AEp("Failed to start music sticker audio playback", 20134884);
        }
    }

    @Override // X.InterfaceC50515MRs
    public final boolean CSC(DirectMessageIdentifier directMessageIdentifier) {
        return this.A01.A0D(directMessageIdentifier);
    }

    @Override // X.InterfaceC50515MRs
    public final void E0d(C7GU c7gu, DirectMessageIdentifier directMessageIdentifier) {
        this.A01.A08(c7gu, directMessageIdentifier, null);
    }

    @Override // X.InterfaceC50515MRs
    public final void E0e(C7GU c7gu) {
        this.A01.A06(c7gu);
    }

    @Override // X.InterfaceC50515MRs
    public final void stop() {
        C7DK c7dk = this.A01;
        c7dk.A0B(true);
        c7dk.A0A("music_sticker_stopped_by_user");
    }
}
