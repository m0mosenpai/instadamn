package com.instagram.creation.capture.quickcapture.controller.helper;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC54104Nw2;
import X.C05F;
import X.C0eB;
import X.C128175qm;
import X.C47Z;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.LBT;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$2", f = "ClipsDirectSendHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ClipsDirectSendHelper$sendVideoToDirect$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C128175qm A03;
    public final /* synthetic */ C47Z A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsDirectSendHelper$sendVideoToDirect$2(Context context, FragmentActivity fragmentActivity, UserSession userSession, C128175qm c128175qm, C47Z c47z, String str, String str2, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = c47z;
        this.A07 = list;
        this.A01 = fragmentActivity;
        this.A06 = str;
        this.A03 = c128175qm;
        this.A09 = z;
        this.A05 = str2;
        this.A08 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Context context = this.A00;
        UserSession userSession = this.A02;
        C47Z c47z = this.A04;
        List list = this.A07;
        FragmentActivity fragmentActivity = this.A01;
        String str = this.A06;
        return new ClipsDirectSendHelper$sendVideoToDirect$2(context, fragmentActivity, userSession, this.A03, c47z, str, this.A05, list, interfaceC23621Ds, this.A09, this.A08);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsDirectSendHelper$sendVideoToDirect$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        AbstractC09560e7.A00(obj);
        Context context = this.A00;
        UserSession userSession = this.A02;
        C47Z c47z = this.A04;
        if (AbstractC54104Nw2.A00(context, null, userSession, c47z, C05F.A01) && (str = c47z.A3V) != null && str.length() != 0) {
            List list = this.A07;
            LBT.A00(this.A01, context, userSession, this.A03, c47z, str, this.A06, this.A05, list, this.A09, this.A08);
        }
        return C0eB.A00;
    }
}
