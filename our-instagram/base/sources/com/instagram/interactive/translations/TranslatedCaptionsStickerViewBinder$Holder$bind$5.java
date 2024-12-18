package com.instagram.interactive.translations;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC69933Vxy;
import X.C0eB;
import X.C1JX;
import X.C4ZT;
import X.C5RM;
import X.C5RU;
import X.C66646URk;
import X.C70076W1t;
import X.C84823qW;
import X.H41;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC56392iX;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder$bind$5", f = "TranslatedCaptionsStickerViewBinder.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class TranslatedCaptionsStickerViewBinder$Holder$bind$5 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C70076W1t A03;
    public final /* synthetic */ TranslatedCaptionsStickerViewBinder$Holder A04;
    public final /* synthetic */ C84823qW A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslatedCaptionsStickerViewBinder$Holder$bind$5(UserSession userSession, C70076W1t c70076W1t, TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder, C84823qW c84823qW, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, float f, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = translatedCaptionsStickerViewBinder$Holder;
        this.A02 = userSession;
        this.A08 = z;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = c84823qW;
        this.A01 = f;
        this.A03 = c70076W1t;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder = this.A04;
        UserSession userSession = this.A02;
        boolean z = this.A08;
        String str = this.A07;
        String str2 = this.A06;
        return new TranslatedCaptionsStickerViewBinder$Holder$bind$5(userSession, this.A03, translatedCaptionsStickerViewBinder$Holder, this.A05, str, str2, interfaceC23621Ds, this.A01, z);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        Integer num;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder = this.A04;
            UserSession userSession = this.A02;
            if (!translatedCaptionsStickerViewBinder$Holder.A04 && this.A08) {
                str = this.A06;
            } else {
                str = this.A07;
            }
            H41 h41 = this.A05.A0J;
            this.A00 = 1;
            obj = TranslatedCaptionsStickerViewBinder$Holder.A03(h41, userSession, translatedCaptionsStickerViewBinder$Holder, str, this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        C66646URk c66646URk = (C66646URk) obj;
        if (c66646URk != null) {
            TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder2 = this.A04;
            C4ZT A02 = TranslatedCaptionsStickerViewBinder$Holder.A02(translatedCaptionsStickerViewBinder$Holder2);
            C84823qW c84823qW = this.A05;
            TranslatedCaptionsStickerViewBinder$Holder.A04(A02, translatedCaptionsStickerViewBinder$Holder2, c84823qW, this.A01);
            if (!this.A08) {
                TranslatedCaptionsStickerViewBinder$Holder.A00(translatedCaptionsStickerViewBinder$Holder2).setBackgroundColor(AbstractC167017dG.A0K(c66646URk.A04));
            }
            InterfaceC56392iX interfaceC56392iX = translatedCaptionsStickerViewBinder$Holder2.A06;
            C5RU A01 = AbstractC69933Vxy.A01(AbstractC166997dE.A0L(interfaceC56392iX.getView()), c66646URk, this.A03);
            Float f = c84823qW.A1L;
            Integer num2 = null;
            if (f != null) {
                num = new Integer((int) f.floatValue());
            } else {
                num = null;
            }
            Float f2 = c84823qW.A1K;
            if (f2 != null) {
                num2 = new Integer((int) f2.floatValue());
            }
            if (num != null && num2 != null) {
                int i = C5RM.A0D;
                C5RM c5rm = new C5RM(AbstractC166997dE.A0L(interfaceC56392iX.getView()), A01, AbstractC167017dG.A0j());
                c5rm.Efo(num.intValue(), num2.intValue());
                TranslatedCaptionsStickerViewBinder$Holder.A01(translatedCaptionsStickerViewBinder$Holder2).setImageDrawable(c5rm);
            } else {
                TranslatedCaptionsStickerViewBinder$Holder.A01(translatedCaptionsStickerViewBinder$Holder2).setImageDrawable(A01);
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslatedCaptionsStickerViewBinder$Holder$bind$5) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
