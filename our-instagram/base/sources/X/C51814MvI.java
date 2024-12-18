package X;

import com.instagram.rtc.statemodel.RtcSettingsParticipant;

/* renamed from: X.MvI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51814MvI extends C0T6 implements InterfaceC66482zP {
    public final RtcSettingsParticipant A00;
    public final InterfaceC16660sJ A01;

    public C51814MvI(RtcSettingsParticipant rtcSettingsParticipant, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(rtcSettingsParticipant, 1);
        this.A00 = rtcSettingsParticipant;
        this.A01 = interfaceC16660sJ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51814MvI) {
                C51814MvI c51814MvI = (C51814MvI) obj;
                if (!C14360o3.A0K(this.A00, c51814MvI.A00) || !C14360o3.A0K(this.A01, c51814MvI.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A04;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A00) + AbstractC53644Nnp.A00()) * 31) + AbstractC167017dG.A0M(this.A01);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51814MvI c51814MvI = (C51814MvI) obj;
        C14360o3.A0B(c51814MvI, 0);
        if (c51814MvI.equals(this) || C14360o3.A0K(c51814MvI.A00, this.A00)) {
            return true;
        }
        return false;
    }
}
