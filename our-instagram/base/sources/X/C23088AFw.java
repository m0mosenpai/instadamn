package X;

import android.os.Bundle;

/* renamed from: X.AFw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23088AFw {
    public final /* synthetic */ C214899fR A00;

    public C23088AFw(C214899fR c214899fR) {
        this.A00 = c214899fR;
    }

    public static final void A00(C23088AFw c23088AFw, String str) {
        Bundle bundle;
        C214899fR c214899fR = c23088AFw.A00;
        InterfaceC09390do interfaceC09390do = c214899fR.A0M;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, A0o, 36320644341900069L);
        boolean A062 = C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36321146852877487L);
        if (A06 || A062) {
            String str2 = null;
            if (A062 && (bundle = c214899fR.mArguments) != null) {
                str2 = bundle.getString(MSV.A00(42));
            }
            C22867A6n c22867A6n = c214899fR.A07;
            if (c22867A6n != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c22867A6n.A00, "ar_ads_camera_event");
                if (A0f.isSampled()) {
                    A0f.AAP("effect_id", str);
                    A0f.AAP("action", "end_capture");
                    A0f.AAP(MSV.A00(923), str2);
                    A0f.Cht();
                    return;
                }
                return;
            }
            C14360o3.A0F("igArAdsLogger");
            throw C00O.createAndThrow();
        }
    }
}
