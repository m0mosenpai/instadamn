package com.instagram.creation.capture.quickcapture.controller.helper;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
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

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1", f = "ClipsDirectSendHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C128175qm A03;
    public final /* synthetic */ C47Z A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1(Context context, FragmentActivity fragmentActivity, UserSession userSession, C128175qm c128175qm, C47Z c47z, String str, String str2, String str3, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A05 = str;
        this.A04 = c47z;
        this.A02 = userSession;
        this.A08 = list;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A07 = str2;
        this.A03 = c128175qm;
        this.A0A = z;
        this.A06 = str3;
        this.A09 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str = this.A05;
        C47Z c47z = this.A04;
        UserSession userSession = this.A02;
        List list = this.A08;
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        String str2 = this.A07;
        return new ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1(context, fragmentActivity, userSession, this.A03, c47z, str, str2, this.A06, list, interfaceC23621Ds, this.A0A, this.A09);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        String str = this.A05;
        C47Z c47z = this.A04;
        UserSession userSession = this.A02;
        List list = this.A08;
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        String str2 = this.A07;
        LBT.A00(fragmentActivity, context, userSession, this.A03, c47z, str, str2, this.A06, list, this.A0A, this.A09);
        return C0eB.A00;
    }
}
