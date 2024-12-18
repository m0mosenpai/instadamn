package com.instagram.profile.fragment.channels;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.B4Z;
import X.C0eB;
import X.C115095Ie;
import X.C115115Ig;
import X.C14360o3;
import X.C25849Bc4;
import X.C26226Biq;
import X.C36291Fzl;
import X.CRV;
import X.FAE;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC40821up;
import X.MU9;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.profile.fragment.channels.ProfileChannelsListViewModel$onSubmit$1$3", f = "ProfileChannelsListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ProfileChannelsListViewModel$onSubmit$1$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ C25849Bc4 A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileChannelsListViewModel$onSubmit$1$3(C25849Bc4 c25849Bc4, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = c25849Bc4;
        this.A02 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ProfileChannelsListViewModel$onSubmit$1$3 profileChannelsListViewModel$onSubmit$1$3 = new ProfileChannelsListViewModel$onSubmit$1$3(this.A01, this.A02, interfaceC23621Ds);
        profileChannelsListViewModel$onSubmit$1$3.A00 = obj;
        return profileChannelsListViewModel$onSubmit$1$3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ProfileChannelsListViewModel$onSubmit$1$3) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C25849Bc4 c25849Bc4;
        C36291Fzl A00;
        String str;
        String errorMessage;
        String errorCode;
        String str2;
        String str3;
        AbstractC09560e7.A00(obj);
        Object obj2 = ((MU9) this.A00).A01;
        if (obj2 instanceof C115095Ie) {
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Exception");
            Throwable th = ((C115095Ie) obj2).A00;
            c25849Bc4 = this.A01;
            A00 = FAE.A00(c25849Bc4.A02);
            str = this.A02;
            errorMessage = null;
            str2 = th.getStackTrace().toString();
            str3 = AbstractC31180DnO.A0k(th.getCause());
            errorCode = null;
        } else if (obj2 instanceof C115115Ig) {
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<com.instagram.api.response.IgResponse>");
            InterfaceC40821up interfaceC40821up = (InterfaceC40821up) ((C115115Ig) obj2).A00;
            c25849Bc4 = this.A01;
            A00 = FAE.A00(c25849Bc4.A02);
            str = this.A02;
            errorMessage = interfaceC40821up.getErrorMessage();
            errorCode = interfaceC40821up.getErrorCode();
            str2 = null;
            str3 = null;
        } else {
            throw B4Z.A00();
        }
        A00.A01(str, errorMessage, errorCode, str2, str3);
        c25849Bc4.A04.Egh(new C26226Biq(AbstractC50523MSb.A0E()));
        CRV crv = c25849Bc4.A00;
        if (crv != null) {
            c25849Bc4.A03.A03(crv);
        }
        c25849Bc4.A00();
        return C0eB.A00;
    }
}
