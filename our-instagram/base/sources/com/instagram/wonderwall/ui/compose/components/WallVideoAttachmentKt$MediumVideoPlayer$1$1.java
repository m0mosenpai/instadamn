package com.instagram.wonderwall.ui.compose.components;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC25230BEn;
import X.AbstractC25231BEo;
import X.C07S;
import X.C07T;
import X.C0eB;
import X.C12L;
import X.C14090nZ;
import X.C14360o3;
import X.C1JX;
import X.C27955CTv;
import X.C3HN;
import X.C47786L8r;
import X.C48283LYg;
import X.C57157PZb;
import X.DGU;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC60032ol;
import X.InterfaceC74953Yl;
import X.KL9;
import X.MCF;
import android.media.MediaMetadataRetriever;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wonderwall.ui.compose.components.WallVideoAttachmentKt$MediumVideoPlayer$1$1", f = "WallVideoAttachment.kt", i = {}, l = {151, 167}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class WallVideoAttachmentKt$MediumVideoPlayer$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final /* synthetic */ InterfaceC74953Yl A02;
    public final /* synthetic */ C07T A03;
    public final /* synthetic */ C47786L8r A04;
    public final /* synthetic */ C27955CTv A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WallVideoAttachmentKt$MediumVideoPlayer$1$1(InterfaceC74953Yl interfaceC74953Yl, C07T c07t, C47786L8r c47786L8r, C27955CTv c27955CTv, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = c47786L8r;
        this.A06 = str;
        this.A08 = z;
        this.A03 = c07t;
        this.A02 = interfaceC74953Yl;
        this.A07 = interfaceC16660sJ;
        this.A05 = c27955CTv;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C47786L8r c47786L8r = this.A04;
        String str = this.A06;
        boolean z = this.A08;
        C07T c07t = this.A03;
        return new WallVideoAttachmentKt$MediumVideoPlayer$1$1(this.A02, c07t, c47786L8r, this.A05, str, interfaceC23621Ds, this.A07, z);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC74953Yl interfaceC74953Yl;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        try {
            if (i != 0) {
                if (i != 1) {
                    AbstractC09560e7.A00(obj);
                    C47786L8r c47786L8r = this.A04;
                    c47786L8r.A00();
                    c47786L8r.volumeKeyListener = null;
                    return C0eB.A00;
                }
                interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                C47786L8r c47786L8r2 = this.A04;
                String str = this.A06;
                boolean z = this.A08;
                C14360o3.A0B(str, 0);
                c47786L8r2.A01.setVideoPath(str, new KL9(c47786L8r2, z));
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                interfaceC74953Yl = this.A02;
                C14090nZ A0e = AbstractC25231BEo.A0e(C12L.A00);
                MCF mcf = new MCF(mediaMetadataRetriever, str, null, 38);
                this.A01 = interfaceC74953Yl;
                this.A00 = 1;
                obj = AbstractC23641Du.A00(this, A0e, mcf);
                if (obj == c1jx) {
                    return c1jx;
                }
            }
            interfaceC74953Yl.Egh(obj);
            if (AbstractC25230BEn.A1X(this.A02)) {
                C47786L8r c47786L8r3 = this.A04;
                DGU dgu = new DGU(this.A07, 2);
                c47786L8r3.volumeKeyListener = null;
                Object context = c47786L8r3.A01.getContext();
                if (context instanceof InterfaceC60032ol) {
                    C48283LYg c48283LYg = new C48283LYg(c47786L8r3, dgu);
                    ((InterfaceC60032ol) context).getVolumeKeyPressController().A00(c48283LYg);
                    c47786L8r3.volumeKeyListener = c48283LYg;
                }
            }
            C07T c07t = this.A03;
            C07S c07s = C07S.RESUMED;
            C57157PZb c57157PZb = new C57157PZb(this.A05, this.A04, (InterfaceC23621Ds) null, 29);
            this.A01 = null;
            this.A00 = 2;
            if (C3HN.A00(c07s, c07t, this, c57157PZb) == c1jx) {
                return c1jx;
            }
            C47786L8r c47786L8r4 = this.A04;
            c47786L8r4.A00();
            c47786L8r4.volumeKeyListener = null;
            return C0eB.A00;
        } catch (Throwable th) {
            C47786L8r c47786L8r5 = this.A04;
            c47786L8r5.A00();
            c47786L8r5.volumeKeyListener = null;
            throw th;
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WallVideoAttachmentKt$MediumVideoPlayer$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
