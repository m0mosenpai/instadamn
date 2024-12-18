package X;

import com.instagram.model.business.ProfileAddressData;

/* loaded from: classes6.dex */
public final class E8X extends C0T6 implements InterfaceC66482zP {
    public final ProfileAddressData A00;

    public E8X(ProfileAddressData profileAddressData) {
        C14360o3.A0B(profileAddressData, 1);
        this.A00 = profileAddressData;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E8X) && C14360o3.A0K(this.A00, ((E8X) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        ProfileAddressData profileAddressData = this.A00;
        String str = profileAddressData.A06;
        if (str == null) {
            return AnonymousClass001.A0O("hash:", profileAddressData.hashCode());
        }
        return str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        E8X e8x = (E8X) obj;
        C14360o3.A0B(e8x, 0);
        ProfileAddressData profileAddressData = this.A00;
        ProfileAddressData profileAddressData2 = e8x.A00;
        C14360o3.A0B(profileAddressData2, 0);
        if (C14360o3.A0K(profileAddressData.A06, profileAddressData2.A06) && C14360o3.A0K(profileAddressData.A03, profileAddressData2.A03) && C14360o3.A0K(profileAddressData.A04, profileAddressData2.A04) && C14360o3.A0K(profileAddressData.A05, profileAddressData2.A05) && C14360o3.A0K(profileAddressData.A08, profileAddressData2.A08) && C14360o3.A0J(profileAddressData.A00, profileAddressData2.A00) && C14360o3.A0J(profileAddressData.A01, profileAddressData2.A01) && C14360o3.A0K(profileAddressData.A07, profileAddressData2.A07)) {
            return true;
        }
        return false;
    }
}
