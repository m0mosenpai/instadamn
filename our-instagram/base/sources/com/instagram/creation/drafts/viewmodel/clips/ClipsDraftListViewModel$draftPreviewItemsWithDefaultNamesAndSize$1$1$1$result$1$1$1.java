package com.instagram.creation.drafts.viewmodel.clips;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC224517h;
import X.AbstractC23611Dp;
import X.B9P;
import X.B9Q;
import X.C05F;
import X.C0eB;
import X.C115525Km;
import X.C14360o3;
import X.C1JX;
import X.C49602Pt;
import X.C5JK;
import X.C75E;
import X.C9J0;
import X.C9JS;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.PV1;
import java.io.File;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.drafts.viewmodel.clips.ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1", f = "ClipsDraftListViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final /* synthetic */ C9J0 A02;
    public final /* synthetic */ C75E A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1(C9J0 c9j0, C75E c75e, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = c9j0;
        this.A03 = c75e;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1(this.A02, this.A03, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C9J0 c9j0;
        long j;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            c9j0 = (C9J0) this.A01;
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            c9j0 = this.A02;
            C49602Pt c49602Pt = this.A03.A09;
            String str = c9j0.A09;
            this.A01 = c9j0;
            this.A00 = 1;
            File file = new File(c49602Pt.A01(), str);
            if (file.exists()) {
                Iterator it = AbstractC224517h.A09(B9Q.A00, AbstractC224517h.A04(B9P.A00, new PV1(file, C05F.A00))).iterator();
                j = 0;
                while (it.hasNext()) {
                    j += AbstractC166987dD.A0N(it.next());
                }
            } else {
                j = 0;
            }
            obj2 = new Long(j);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        String str2 = c9j0.A09;
        C5JK c5jk = c9j0.A04;
        long j2 = c9j0.A02;
        String str3 = c9j0.A0C;
        String str4 = c9j0.A07;
        String str5 = c9j0.A08;
        String str6 = c9j0.A0A;
        C115525Km c115525Km = c9j0.A05;
        int i = c9j0.A00;
        C9JS c9js = c9j0.A03;
        boolean z = c9j0.A0E;
        long j3 = c9j0.A01;
        String str7 = c9j0.A0B;
        boolean z2 = c9j0.A0G;
        boolean z3 = c9j0.A0F;
        C14360o3.A0B(str2, 0);
        C14360o3.A0B(c5jk, 1);
        return new C9J0(c9js, c5jk, c115525Km, (Long) obj2, str2, str3, str4, str5, str6, str7, i, j2, j3, z, z2, z3);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
