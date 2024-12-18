package com.instagram.fanclub.gifting;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1", f = "FanClubGiftingViewModel.kt", i = {1, 1}, l = {87, 91}, m = "invokeSuspend", n = {"destination$iv$iv", "it"}, s = {"L$6", "L$8"})
/* loaded from: classes6.dex */
public final class FanClubGiftingViewModel$fetchGiftOptions$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final /* synthetic */ Context A0A;
    public final /* synthetic */ FragmentActivity A0B;
    public final /* synthetic */ FanClubGiftingViewModel A0C;
    public final /* synthetic */ User A0D;
    public final /* synthetic */ String A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FanClubGiftingViewModel$fetchGiftOptions$1(Context context, FragmentActivity fragmentActivity, FanClubGiftingViewModel fanClubGiftingViewModel, User user, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A0C = fanClubGiftingViewModel;
        this.A0D = user;
        this.A0B = fragmentActivity;
        this.A0A = context;
        this.A0E = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        FanClubGiftingViewModel fanClubGiftingViewModel = this.A0C;
        User user = this.A0D;
        return new FanClubGiftingViewModel$fetchGiftOptions$1(this.A0A, this.A0B, fanClubGiftingViewModel, user, this.A0E, interfaceC23621Ds);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0168, code lost:
    
        if (r7 == null) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0192  */
    /* JADX WARN: Type inference failed for: r15v13, types: [X.2JS] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ca -> B:5:0x0035). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FanClubGiftingViewModel$fetchGiftOptions$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
