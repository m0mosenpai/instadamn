package com.instagram.archive.ui;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C30175DRf;
import X.C30249DUc;
import X.C50162MDp;
import X.C6KN;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC74953Yl;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.archive.ui.ArchiveReelComposeFragmentKt$fastScroll$6$1", f = "ArchiveReelComposeFragment.kt", i = {}, l = {1192}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class ArchiveReelComposeFragmentKt$fastScroll$6$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ float A06;
    public final /* synthetic */ InterfaceC74953Yl A07;
    public final /* synthetic */ InterfaceC74953Yl A08;
    public final /* synthetic */ InterfaceC74953Yl A09;
    public final /* synthetic */ InterfaceC74953Yl A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArchiveReelComposeFragmentKt$fastScroll$6$1(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC74953Yl interfaceC74953Yl3, InterfaceC74953Yl interfaceC74953Yl4, InterfaceC23621Ds interfaceC23621Ds, float f, float f2, float f3, float f4, float f5) {
        super(2, interfaceC23621Ds);
        this.A04 = f;
        this.A08 = interfaceC74953Yl;
        this.A0A = interfaceC74953Yl2;
        this.A07 = interfaceC74953Yl3;
        this.A06 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A05 = f5;
        this.A09 = interfaceC74953Yl4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        float f = this.A04;
        ArchiveReelComposeFragmentKt$fastScroll$6$1 archiveReelComposeFragmentKt$fastScroll$6$1 = new ArchiveReelComposeFragmentKt$fastScroll$6$1(this.A08, this.A0A, this.A07, this.A09, interfaceC23621Ds, f, this.A06, this.A03, this.A02, this.A05);
        archiveReelComposeFragmentKt$fastScroll$6$1.A01 = obj;
        return archiveReelComposeFragmentKt$fastScroll$6$1;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C6KN c6kn = (C6KN) this.A01;
            float f = this.A04;
            InterfaceC74953Yl interfaceC74953Yl = this.A08;
            InterfaceC74953Yl interfaceC74953Yl2 = this.A0A;
            InterfaceC74953Yl interfaceC74953Yl3 = this.A07;
            C30175DRf c30175DRf = new C30175DRf(interfaceC74953Yl, interfaceC74953Yl2, interfaceC74953Yl3, f, 2);
            C50162MDp c50162MDp = new C50162MDp(interfaceC74953Yl3, 4);
            C50162MDp c50162MDp2 = new C50162MDp(interfaceC74953Yl3, 5);
            C30249DUc c30249DUc = new C30249DUc(this.A09, interfaceC74953Yl, interfaceC74953Yl2, c6kn, this.A06, this.A03, this.A02, this.A05);
            this.A00 = 1;
            if (DragGestureDetectorKt.A07(c6kn, this, c50162MDp, c50162MDp2, c30175DRf, c30249DUc) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArchiveReelComposeFragmentKt$fastScroll$6$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
