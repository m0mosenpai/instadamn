package com.instagram.creation.capture.assetpicker.cutout.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC58002lE;
import X.C05F;
import X.C09540e5;
import X.C09550e6;
import X.C0eB;
import X.C1JX;
import X.C217609jt;
import X.C40121td;
import X.C46347KfV;
import X.C47614L0z;
import X.C8OP;
import X.InterfaceC11380iw;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.LKV;
import X.M56;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$uploadPhotoCutoutSticker$2", f = "CutoutStickerViewModel.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class CutoutStickerViewModel$uploadPhotoCutoutSticker$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ C8OP A04;
    public final /* synthetic */ C40121td A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ WeakReference A09;
    public final /* synthetic */ WeakReference A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutStickerViewModel$uploadPhotoCutoutSticker$2(Activity activity, Bitmap bitmap, InterfaceC11380iw interfaceC11380iw, C8OP c8op, C40121td c40121td, Integer num, String str, String str2, WeakReference weakReference, WeakReference weakReference2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = c8op;
        this.A07 = str;
        this.A02 = bitmap;
        this.A08 = str2;
        this.A05 = c40121td;
        this.A0A = weakReference;
        this.A06 = num;
        this.A09 = weakReference2;
        this.A01 = activity;
        this.A03 = interfaceC11380iw;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C8OP c8op = this.A04;
        String str = this.A07;
        Bitmap bitmap = this.A02;
        String str2 = this.A08;
        C40121td c40121td = this.A05;
        WeakReference weakReference = this.A0A;
        return new CutoutStickerViewModel$uploadPhotoCutoutSticker$2(this.A01, bitmap, this.A03, c8op, c40121td, this.A06, str, str2, weakReference, this.A09, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object A00;
        WeakReference weakReference;
        C46347KfV c46347KfV;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
            A00 = ((C09550e6) obj).A00;
        } else {
            AbstractC09560e7.A00(obj);
            CutoutStickerRepository cutoutStickerRepository = (CutoutStickerRepository) this.A04.A0F.getValue();
            String str = this.A07;
            Bitmap bitmap = this.A02;
            String str2 = this.A08;
            C40121td c40121td = this.A05;
            this.A00 = 1;
            A00 = cutoutStickerRepository.A00(bitmap, c40121td, str, str2, this);
            if (A00 == c1jx) {
                return c1jx;
            }
        }
        boolean z = A00 instanceof C09540e5;
        Integer num = null;
        if ((!z) && !z && A00 != null) {
            C8OP c8op = this.A04;
            c8op.A0A.Egh(C217609jt.A00);
            weakReference = this.A0A;
            Context context = (Context) weakReference.get();
            if (context != null) {
                LKV.A03(context, AbstractC166997dE.A0p(context, 2131957436), null, ((NineSixteenLayoutConfigImpl) AbstractC58002lE.A00(context, c8op.A0E)).A0G);
            }
        } else {
            weakReference = this.A0A;
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                int i = ((NineSixteenLayoutConfigImpl) AbstractC58002lE.A00(context2, this.A04.A0E)).A0G;
                Resources A0M = AbstractC166997dE.A0M(context2);
                Throwable A002 = C09550e6.A00(A00);
                if ((A002 instanceof C46347KfV) && (c46347KfV = (C46347KfV) A002) != null) {
                    num = c46347KfV.A00;
                }
                LKV.A02(context2, A0M, num, i);
            }
        }
        if (this.A06 == C05F.A0C && this.A09.get() != null) {
            Activity activity = this.A01;
            C8OP c8op2 = this.A04;
            InterfaceC11380iw interfaceC11380iw = this.A03;
            Bitmap bitmap2 = this.A02;
            C47614L0z c47614L0z = new C47614L0z(activity, c8op2.A0E);
            AbstractC167017dG.A1O(interfaceC11380iw, weakReference);
            if ((!c47614L0z.A02.A1p()) && bitmap2 != null) {
                AbstractC167007dF.A0J().postDelayed(new M56(bitmap2, interfaceC11380iw, c47614L0z), 500L);
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CutoutStickerViewModel$uploadPhotoCutoutSticker$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
