package com.instagram.rtc.stateprovider.cowatch;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC31177DnL;
import X.C06090Tz;
import X.C0eB;
import X.C18U;
import X.C51866MwA;
import X.C54557O8j;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.stateprovider.cowatch.RtcCoWatchContentPickerProvider$bloksContentPickerState$2", f = "RtcCoWatchContentPickerProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcCoWatchContentPickerProvider$bloksContentPickerState$2 extends AbstractC23611Dp implements InterfaceC16600sD {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ C54557O8j A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCoWatchContentPickerProvider$bloksContentPickerState$2(C54557O8j c54557O8j, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A03 = str;
        this.A02 = c54557O8j;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AbstractC166987dD.A1a(obj2);
        String str = this.A03;
        RtcCoWatchContentPickerProvider$bloksContentPickerState$2 rtcCoWatchContentPickerProvider$bloksContentPickerState$2 = new RtcCoWatchContentPickerProvider$bloksContentPickerState$2(this.A02, str, (InterfaceC23621Ds) obj4);
        rtcCoWatchContentPickerProvider$bloksContentPickerState$2.A01 = A1a;
        rtcCoWatchContentPickerProvider$bloksContentPickerState$2.A00 = obj3;
        return rtcCoWatchContentPickerProvider$bloksContentPickerState$2.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        boolean z = this.A01;
        Boolean bool = (Boolean) this.A00;
        String str = this.A03;
        boolean A1a = AbstractC31177DnL.A1a(bool);
        UserSession userSession = this.A02.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        return new C51866MwA(str, A1a, z, C18U.A06(c06090Tz, userSession, 36310323535413265L), C18U.A06(c06090Tz, userSession, 36317758123742767L));
    }
}
