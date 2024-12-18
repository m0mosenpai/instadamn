package com.instagram.trials.view;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25651Mw;
import X.B4Z;
import X.C0eB;
import X.C14360o3;
import X.C153936w2;
import X.C154976xm;
import X.C194848jk;
import X.C1JX;
import X.C3NX;
import X.C3NY;
import X.C9GR;
import X.EnumC125765mR;
import X.EnumC37319GcL;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.MSV;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.trials.view.ClipsTrialBottomSheetFragment$openActionSheet$1$2$1", f = "ClipsTrialBottomSheetFragment.kt", i = {}, l = {393}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class ClipsTrialBottomSheetFragment$openActionSheet$1$2$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ EnumC37319GcL A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C153936w2 A04;
    public final /* synthetic */ ClipsTrialBottomSheetRepositoryImpl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsTrialBottomSheetFragment$openActionSheet$1$2$1(Context context, EnumC37319GcL enumC37319GcL, UserSession userSession, C153936w2 c153936w2, ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ) {
        super(2, interfaceC23621Ds);
        this.A04 = c153936w2;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = enumC37319GcL;
        this.A05 = clipsTrialBottomSheetRepositoryImpl;
        this.A08 = interfaceC16820sZ;
        this.A03 = userSession;
        this.A01 = context;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C153936w2 c153936w2 = this.A04;
        String str = this.A06;
        String str2 = this.A07;
        EnumC37319GcL enumC37319GcL = this.A02;
        ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl = this.A05;
        InterfaceC16820sZ interfaceC16820sZ = this.A08;
        return new ClipsTrialBottomSheetFragment$openActionSheet$1$2$1(this.A01, enumC37319GcL, this.A03, c153936w2, clipsTrialBottomSheetRepositoryImpl, str, str2, interfaceC23621Ds, interfaceC16820sZ);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Context context;
        int i;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C153936w2 c153936w2 = this.A04;
            String str = this.A06;
            String str2 = this.A07;
            EnumC37319GcL enumC37319GcL = this.A02;
            C14360o3.A0B(str, 0);
            C153936w2.A04(C153936w2.A02(enumC37319GcL, str2), c153936w2, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "pre_reveal_action_sheet", "tap_share", str, null);
            ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl = this.A05;
            this.A00 = 1;
            obj = clipsTrialBottomSheetRepositoryImpl.A02(str, "pre_reveal_action_sheet", this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        C3NY c3ny = (C3NY) obj;
        boolean z = c3ny instanceof C3NX;
        String A00 = MSV.A00(1670);
        if (z) {
            if (AbstractC166987dD.A1a(((C3NX) c3ny).A00)) {
                InterfaceC16820sZ interfaceC16820sZ = this.A08;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                UserSession userSession = this.A03;
                AbstractC25651Mw.A00(userSession).E4s(new C154976xm(EnumC125765mR.A04, userSession.userId));
                context = this.A01;
                i = 2131973809;
                A00 = null;
                C9GR.A0F(context, A00, i);
                return C0eB.A00;
            }
        } else if (!(c3ny instanceof C194848jk)) {
            throw B4Z.A00();
        }
        context = this.A01;
        i = 2131974293;
        C9GR.A0F(context, A00, i);
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsTrialBottomSheetFragment$openActionSheet$1$2$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
