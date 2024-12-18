package X;

import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

/* renamed from: X.PFk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56718PFk implements InterfaceC58068Pot {
    public final /* synthetic */ DirectMessagesInteropOptionsViewModel A00;
    public final /* synthetic */ C56719PFl A01;

    @Override // X.InterfaceC58068Pot
    public final void D71(N3R n3r) {
        DirectMessagesInteropOptionsViewModel A00 = N3R.A00(n3r);
        C56719PFl c56719PFl = this.A01;
        C55174Odd c55174Odd = c56719PFl.A06;
        String str = c56719PFl.A0A;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = this.A00;
        EnumC222416a enumC222416a = c56719PFl.A08;
        boolean z = c56719PFl.A0C;
        boolean z2 = c56719PFl.A0D;
        C14360o3.A0B(str, 0);
        C55174Odd.A03(c55174Odd, directMessagesInteropOptionsViewModel, A00, enumC222416a, str, z, z2, true);
        DirectMessageInteropReachabilityOptions A002 = A00.A00(str);
        if (A002 != null) {
            String str2 = A002.A03;
            C52779NXm c52779NXm = c56719PFl.A02;
            if (c52779NXm != null) {
                C34960Fak c34960Fak = c56719PFl.A03;
                if (c34960Fak != null) {
                    c34960Fak.A00 = str2;
                }
                c52779NXm.A01();
            }
            c56719PFl.A07.A02(A00, str);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C56718PFk(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, C56719PFl c56719PFl) {
        this.A01 = c56719PFl;
        this.A00 = directMessagesInteropOptionsViewModel;
    }

    @Override // X.InterfaceC58068Pot
    public final void D20() {
        C56719PFl.A00(this.A01);
    }
}
