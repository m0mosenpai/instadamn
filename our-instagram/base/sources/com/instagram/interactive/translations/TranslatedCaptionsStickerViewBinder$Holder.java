package com.instagram.interactive.translations;

import X.C05F;
import X.C09530e4;
import X.C138436Oz;
import X.C14360o3;
import X.C4ZQ;
import X.C4ZR;
import X.C4ZS;
import X.C4ZT;
import X.C5RM;
import X.C5RQ;
import X.C5RU;
import X.C84823qW;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC56392iX;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes2.dex */
public final class TranslatedCaptionsStickerViewBinder$Holder implements C4ZQ {
    public String A00;
    public boolean A03;
    public final InterfaceC56392iX A06;
    public InterfaceC16820sZ A01 = C4ZR.A00;
    public InterfaceC16620sF A02 = C4ZS.A00;
    public C4ZT A05 = new C4ZT(null, null, null);
    public boolean A04 = true;

    public TranslatedCaptionsStickerViewBinder$Holder(InterfaceC56392iX interfaceC56392iX) {
        this.A06 = interfaceC56392iX;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x011f, code lost:
    
        if (r15.isEmpty() != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, X.US9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.JMI r14, com.instagram.common.session.UserSession r15, com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder r16, java.lang.String r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder.A03(X.JMI, com.instagram.common.session.UserSession, com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final ViewGroup A00(TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder) {
        View requireViewById = translatedCaptionsStickerViewBinder$Holder.A06.getView().requireViewById(R.id.translated_captions_sticker_container);
        C14360o3.A07(requireViewById);
        return (ViewGroup) requireViewById;
    }

    public static final IgSimpleImageView A01(TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder) {
        View requireViewById = translatedCaptionsStickerViewBinder$Holder.A06.getView().requireViewById(R.id.translated_captions_sticker);
        C14360o3.A07(requireViewById);
        return (IgSimpleImageView) requireViewById;
    }

    public static final C4ZT A02(TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder) {
        Integer num;
        C4ZT c4zt = translatedCaptionsStickerViewBinder$Holder.A05;
        if (c4zt.A00()) {
            return c4zt;
        }
        View view = (View) translatedCaptionsStickerViewBinder$Holder.A06.getView().getParent();
        Integer num2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getWidth());
            num2 = Integer.valueOf(view.getHeight());
        } else {
            num = null;
        }
        C4ZT c4zt2 = new C4ZT(num, num2, 0);
        translatedCaptionsStickerViewBinder$Holder.A05 = c4zt2;
        return c4zt2;
    }

    public final void A05(int i, int i2) {
        C5RQ c5rq;
        if (!this.A03 && this.A06.CGb() == 0) {
            this.A03 = true;
            this.A01.invoke();
        }
        Drawable drawable = A01(this).getDrawable();
        if (!(drawable instanceof C5RM) || (c5rq = (C5RM) drawable) == null) {
            Drawable drawable2 = A01(this).getDrawable();
            if (!(drawable2 instanceof C5RU) || (c5rq = (C5RU) drawable2) == null) {
                return;
            }
        }
        c5rq.EUp(i, i2);
    }

    @Override // X.C4ZQ
    public final boolean Cdl() {
        return this.A04;
    }

    @Override // X.C4ZQ
    public final boolean FCM(boolean z, boolean z2) {
        if (z == this.A04) {
            return false;
        }
        this.A04 = z;
        this.A02.invoke(Boolean.valueOf(z), Boolean.valueOf(z2));
        return true;
    }

    public static final void A04(C4ZT c4zt, TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder, C84823qW c84823qW, float f) {
        int i;
        int i2;
        ViewGroup A00 = A00(translatedCaptionsStickerViewBinder$Holder);
        Integer num = c4zt.A01;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = c4zt.A00;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        Integer num3 = C05F.A0C;
        C138436Oz c138436Oz = C138436Oz.A00;
        C138436Oz.A03(A00, A00, c84823qW, num3, new C09530e4(0, 0), f, i, i2);
    }
}
