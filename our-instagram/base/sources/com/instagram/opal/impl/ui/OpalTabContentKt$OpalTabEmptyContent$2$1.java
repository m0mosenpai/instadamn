package com.instagram.opal.impl.ui;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC34277F9x;
import X.B4Z;
import X.C0eB;
import X.C69;
import X.InterfaceC11380iw;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.opal.impl.ui.OpalTabContentKt$OpalTabEmptyContent$2$1", f = "OpalTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class OpalTabContentKt$OpalTabEmptyContent$2$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C69 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpalTabContentKt$OpalTabEmptyContent$2$1(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C69 c69, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = c69;
        this.A04 = z;
        this.A03 = str;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C69 c69 = this.A02;
        boolean z = this.A04;
        String str = this.A03;
        return new OpalTabContentKt$OpalTabEmptyContent$2$1(this.A00, this.A01, c69, str, interfaceC23621Ds, z);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OpalTabContentKt$OpalTabEmptyContent$2$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        AbstractC09560e7.A00(obj);
        int ordinal = this.A02.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                str = "empty_reel";
            } else {
                throw B4Z.A00();
            }
        } else {
            str = "empty_post";
        }
        boolean z = this.A04;
        String str3 = this.A03;
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        if (z) {
            str2 = "opal_self_profile";
        } else {
            str2 = "opal_profile";
        }
        AbstractC34277F9x.A00(interfaceC11380iw, userSession, "impression", str, str2, str3, null);
        return C0eB.A00;
    }
}
