package com.instagram.direct.messagethread;

import X.AbstractC09560e7;
import X.AbstractC1581477z;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C47368KwJ;
import X.C98K;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.messagethread.DirectMessageLinkifyHelper$buildLinksInfoAsync$1", f = "DirectMessageLinkifyHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class DirectMessageLinkifyHelper$buildLinksInfoAsync$1 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C47368KwJ A02;
    public final /* synthetic */ C98K A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectMessageLinkifyHelper$buildLinksInfoAsync$1(Context context, UserSession userSession, C47368KwJ c47368KwJ, C98K c98k, String str, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(1, interfaceC23621Ds);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = str;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = list;
        this.A03 = c98k;
        this.A02 = c47368KwJ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        String str = this.A04;
        boolean z = this.A07;
        boolean z2 = this.A06;
        List list = this.A05;
        return new DirectMessageLinkifyHelper$buildLinksInfoAsync$1(context, userSession, this.A02, this.A03, str, list, interfaceC23621Ds, z, z2);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((DirectMessageLinkifyHelper$buildLinksInfoAsync$1) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        Context context = this.A00;
        UserSession userSession = this.A01;
        String str = this.A04;
        boolean z = this.A07;
        List list = this.A05;
        this.A02.A00.A0H = AbstractC1581477z.A01(context, userSession, this.A03, str, list, z);
        return C0eB.A00;
    }
}
