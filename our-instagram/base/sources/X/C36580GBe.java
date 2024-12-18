package X;

import android.content.Context;
import com.instagram.model.business.ProfileAddressData;

/* renamed from: X.GBe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36580GBe implements GZM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ProfileAddressData A01;
    public final /* synthetic */ GBV A02;
    public final /* synthetic */ String A03;

    public C36580GBe(Context context, ProfileAddressData profileAddressData, GBV gbv, String str) {
        this.A00 = context;
        this.A01 = profileAddressData;
        this.A03 = str;
        this.A02 = gbv;
    }

    @Override // X.GZM
    public final void DWo() {
        Context context = this.A00;
        ProfileAddressData profileAddressData = this.A01;
        AbstractC35180FfX.A03(context, profileAddressData.A03, profileAddressData.A05, profileAddressData.A08);
    }

    @Override // X.GZM
    public final void E0k() {
        GBV.A05(this.A02, this.A03, "profile_multiple_addresses_bottomsheet");
    }
}
