package com.instagram.barcelona.permalink.ui.component;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AbstractC31581Du9;
import X.C05F;
import X.C0eB;
import X.C66277U6x;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.ui.component.PermalinkContentKt$PermalinkContent$6", f = "PermalinkContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class PermalinkContentKt$PermalinkContent$6 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermalinkContentKt$PermalinkContent$6(Context context, UserSession userSession, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        super(2, interfaceC23621Ds);
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A03 = str;
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A05;
        return new PermalinkContentKt$PermalinkContent$6(this.A00, this.A01, this.A03, this.A02, interfaceC23621Ds, interfaceC16820sZ, interfaceC16820sZ2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PermalinkContentKt$PermalinkContent$6) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        this.A04.invoke();
        this.A05.invoke();
        C66277U6x A01 = C66277U6x.A01("com.bloks.www.instagram.igwb.exp.geogating_viewer", AbstractC25233BEq.A0p(AbstractC31581Du9.A00(), "", AbstractC166987dD.A1L("media_id", this.A03)));
        Context context = this.A00;
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(this.A01);
        A0C.A0P = C05F.A00;
        A0C.A0U = this.A02;
        A01.A04(context, A0C);
        return C0eB.A00;
    }
}
