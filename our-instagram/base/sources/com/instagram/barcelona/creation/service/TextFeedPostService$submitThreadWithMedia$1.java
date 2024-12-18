package com.instagram.barcelona.creation.service;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.B4Z;
import X.C0eB;
import X.C14360o3;
import X.C166187bm;
import X.C166197bn;
import X.C26063Bfr;
import X.C40121td;
import X.C47Z;
import X.InterfaceC11380iw;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.Xi9;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.creation.service.TextFeedPostService$submitThreadWithMedia$1", f = "TextFeedPostService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class TextFeedPostService$submitThreadWithMedia$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ C26063Bfr A00;
    public final /* synthetic */ C166187bm A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFeedPostService$submitThreadWithMedia$1(C26063Bfr c26063Bfr, C166187bm c166187bm, InterfaceC11380iw interfaceC11380iw, Integer num, Integer num2, String str, String str2, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = num;
        this.A01 = c166187bm;
        this.A07 = list;
        this.A05 = str;
        this.A00 = c26063Bfr;
        this.A03 = num2;
        this.A06 = str2;
        this.A02 = interfaceC11380iw;
        this.A08 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Integer num = this.A04;
        C166187bm c166187bm = this.A01;
        List list = this.A07;
        String str = this.A05;
        return new TextFeedPostService$submitThreadWithMedia$1(this.A00, c166187bm, this.A02, num, this.A03, str, this.A06, list, interfaceC23621Ds, this.A08);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TextFeedPostService$submitThreadWithMedia$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        Integer num = this.A04;
        int intValue = num.intValue();
        String str = null;
        if (intValue != 3) {
            if (intValue != 2) {
                if (intValue != 0 && intValue != 1) {
                    throw B4Z.A00();
                }
                C166187bm c166187bm = this.A01;
                List list = this.A07;
                String str2 = this.A05;
                C26063Bfr c26063Bfr = this.A00;
                Integer num2 = this.A03;
                if (num2 != null) {
                    str = Xi9.A00(num2).A00;
                }
                String str3 = this.A06;
                InterfaceC11380iw interfaceC11380iw = this.A02;
                C47Z A01 = C166187bm.A01(c26063Bfr, c166187bm, num, str2, str, str3, list, this.A08);
                C40121td c40121td = c166187bm.A02;
                List<C47Z> list2 = A01.A4m;
                C14360o3.A0B(list2, 1);
                PendingMediaStore pendingMediaStore = c40121td.A04;
                pendingMediaStore.A0D(A01, A01.A35);
                for (C47Z c47z : list2) {
                    pendingMediaStore.A0D(c47z, c47z.A35);
                    if (c47z.A0t()) {
                        for (C47Z c47z2 : c47z.A0K()) {
                            pendingMediaStore.A0D(c47z2, c47z2.A35);
                        }
                    }
                }
                c40121td.A05.A04();
                c40121td.A09(A01);
                C14360o3.A0B(interfaceC11380iw, 1);
                C166197bn c166197bn = c166187bm.A00;
                c166197bn.A00 = null;
                c166197bn.A01 = null;
            } else {
                C166187bm c166187bm2 = this.A01;
                List list3 = this.A07;
                String str4 = this.A05;
                C26063Bfr c26063Bfr2 = this.A00;
                Integer num3 = this.A03;
                if (num3 != null) {
                    str = Xi9.A00(num3).A00;
                }
                C47Z A012 = C166187bm.A01(c26063Bfr2, c166187bm2, num, str4, str, this.A06, list3, this.A08);
                C40121td c40121td2 = c166187bm2.A02;
                List<C47Z> list4 = A012.A4m;
                C14360o3.A0B(list4, 0);
                for (C47Z c47z3 : list4) {
                    if (c47z3.A0t()) {
                        for (C47Z c47z4 : c47z3.A0K()) {
                            c40121td2.A04.A0D(c47z4, c47z4.A35);
                        }
                    } else {
                        c40121td2.A04.A0D(c47z3, c47z3.A35);
                    }
                }
                c40121td2.A05.A04();
                c166187bm2.A00.A01 = A012;
            }
        } else {
            C166187bm c166187bm3 = this.A01;
            List list5 = this.A07;
            String str5 = this.A05;
            C26063Bfr c26063Bfr3 = this.A00;
            Integer num4 = this.A03;
            if (num4 != null) {
                str = Xi9.A00(num4).A00;
            }
            C166187bm.A01(c26063Bfr3, c166187bm3, num, str5, str, this.A06, list5, this.A08);
        }
        return C0eB.A00;
    }
}
