package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.common.dextricks.DexStore;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6Oz */
/* loaded from: classes3.dex */
public final class C138436Oz {
    public static final C138436Oz A00 = new Object();
    public static final RectF A03 = new RectF();
    public static final Matrix A02 = new Matrix();
    public static final List A01 = AbstractC16960so.A1Q("1772051206458957", "806120832902363", "176679082882533", "1979937175616497", "309008599532594", "673145442870578", "1208134583542612", "1176093070295937", "855777719310828", "334259729754898", "1659547504846928", "1618009362375836");

    public static final void A02(final View view, final float f, final float f2, final boolean z) {
        C14360o3.A0B(view, 0);
        Runnable runnable = new Runnable() { // from class: X.6RT
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                view2.setX(f);
                view2.setY(f2);
                if (z) {
                    view2.setRotation(0.0f);
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
            }
        };
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            runnable.run();
        } else {
            C18950wb.A01.AEp("ReelInteractiveUtil", 817897142).report();
            AbstractC13880nE.A0p(view, new C1N8() { // from class: X.6RU
                /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
                
                    if (r1.getHeight() <= 0) goto L6;
                 */
                @Override // X.C1N8
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
                    /*
                        r2 = this;
                        android.view.View r1 = r1
                        int r0 = r1.getWidth()
                        if (r0 <= 0) goto Lf
                        int r1 = r1.getHeight()
                        r0 = 1
                        if (r1 > 0) goto L10
                    Lf:
                        r0 = 0
                    L10:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C6RU.apply(java.lang.Object):java.lang.Object");
                }
            }, runnable);
        }
    }

    public static final void A03(final View view, final View view2, final C84823qW c84823qW, final Integer num, final C09530e4 c09530e4, float f, int i, int i2) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(c84823qW, 1);
        C14360o3.A0B(view2, 7);
        final Rect rect = new Rect();
        AbstractC138846Qp.A01(rect, c84823qW, f, i, i2);
        Runnable runnable = new Runnable() { // from class: X.9Gi
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // java.lang.Runnable
            public final void run() {
                View view3 = view;
                int width = view3.getWidth();
                int height = view3.getHeight();
                if (width > 0 && height > 0) {
                    C09530e4 c09530e42 = c09530e4;
                    int A0H = AbstractC166987dD.A0H(c09530e42.A00);
                    int A0H2 = AbstractC166987dD.A0H(c09530e42.A01);
                    View view4 = view2;
                    Rect rect2 = rect;
                    float f2 = width;
                    view4.setX((rect2.exactCenterX() - (f2 / 2.0f)) + A0H);
                    float f3 = height;
                    view4.setY((rect2.exactCenterY() - (f3 / 2.0f)) + A0H2);
                    view4.setRotation(c84823qW.A01 * 360.0f);
                    float width2 = rect2.width() / f2;
                    float height2 = rect2.height() / f3;
                    switch (num.intValue()) {
                        case 0:
                            width2 = Math.max(width2, height2);
                            height2 = width2;
                            break;
                        case 1:
                            width2 = Math.min(width2, height2);
                            height2 = width2;
                            break;
                        case 2:
                            height2 = width2;
                            break;
                        case 3:
                            width2 = height2;
                            break;
                    }
                    view4.setScaleX(width2);
                    view4.setScaleY(height2);
                    return;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A02(width, height, "Invalid viewWidth ", " and/or viewHeight "));
            }
        };
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            runnable.run();
            return;
        }
        C0f5 AEp = C18950wb.A01.AEp("ReelInteractiveUtil", 817897142);
        AEp.ABW("interactive_type", c84823qW.A12.name());
        AEp.report();
        AbstractC13880nE.A0p(view, new C63543SpB(view), runnable);
    }

    public static /* synthetic */ void A04(View view, C84823qW c84823qW, float f, int i, int i2, boolean z) {
        Integer num;
        C09530e4 c09530e4 = new C09530e4(0, 0);
        C14360o3.A0B(view, 0);
        if (z) {
            num = C05F.A00;
        } else {
            num = C05F.A0Y;
        }
        A03(view, view, c84823qW, num, c09530e4, f, i, i2);
    }

    public static final boolean A0A(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        Drawable A0B = A00.A0B(drawable);
        if (!(A0B instanceof C220789p2) && !(A0B instanceof V9Y) && !(A0B instanceof V9X) && !(A0B instanceof C221009pO) && !(A0B instanceof C9SK)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable A0B(Drawable drawable) {
        Drawable Afg;
        C14360o3.A0B(drawable, 0);
        if (drawable instanceof C194808jg) {
            Afg = ((C194808jg) drawable).A04();
            C14360o3.A07(Afg);
        } else {
            if (!(drawable instanceof C5RO)) {
                return drawable;
            }
            Afg = ((C5RO) drawable).Afg();
        }
        return A0B(Afg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (X.C18U.A06(r2, r3, 36320953579545617L) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(com.instagram.common.session.UserSession r3, com.instagram.music.common.model.MusicOverlayStickerModel r4, X.C84823qW r5, java.lang.String r6, java.lang.String r7) {
        /*
            X.3a5 r0 = X.EnumC75383a5.A0s
            r5.A12 = r0
            r5.A0v = r4
            if (r7 == 0) goto La
            r5.A1l = r7
        La:
            if (r6 == 0) goto L42
            r5.A1h = r6
            X.6Pl r0 = X.EnumC138556Pl.A0F
            java.lang.String r0 = r0.A02
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L22
            X.6Pl r0 = X.EnumC138556Pl.A0E
            java.lang.String r0 = r0.A02
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L42
        L22:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323165487508529(0x810bba00002c31, double:3.03425434372348E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L3b
            r0 = 36320953579545617(0x8109b700032411, double:3.032855524221096E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L3c
        L3b:
            r0 = 1
        L3c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A1J = r0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138436Oz.A05(com.instagram.common.session.UserSession, com.instagram.music.common.model.MusicOverlayStickerModel, X.3qW, java.lang.String, java.lang.String):void");
    }

    public static final void A06(AbstractC202868y4 abstractC202868y4, C84823qW c84823qW) {
        if (abstractC202868y4 instanceof C202858y3) {
            A09(c84823qW, ((C202858y3) abstractC202868y4).A00, "mention_username");
        } else {
            if (abstractC202868y4 instanceof V78) {
                A08(((V78) abstractC202868y4).A00, c84823qW, null, false);
                return;
            }
            throw new UnsupportedOperationException("Unknown tag type");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.IeH, java.lang.Object] */
    public static final void A07(NewFundraiserInfo newFundraiserInfo, C84823qW c84823qW, String str, String str2) {
        c84823qW.A12 = EnumC75383a5.A0E;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str != null) {
            hashMap.put("fundraiser_id", str);
        }
        if (newFundraiserInfo != null) {
            hashMap2.put(MSV.A00(112), OY1.A00(newFundraiserInfo));
        }
        if (str2 != null) {
            hashMap.put(CacheBehaviorLogger.SOURCE, str2);
        }
        ?? obj = new Object();
        obj.A0A = new HashMap();
        obj.A0B = new HashMap();
        obj.A0C = new HashMap();
        obj.A09 = "standalone_fundraiser_sticker_id";
        obj.A0B = hashMap;
        obj.A0C = hashMap2;
        c84823qW.A1G = obj;
    }

    public static final void A08(Hashtag hashtag, C84823qW c84823qW, String str, boolean z) {
        if (!c84823qW.A1u) {
            c84823qW.A1l = "hashtag_text";
        }
        c84823qW.A12 = EnumC75383a5.A0d;
        c84823qW.A0l = hashtag.F59();
        c84823qW.A1O = str;
        c84823qW.A1v = z;
    }

    public static final void A09(C84823qW c84823qW, User user, String str) {
        if (!c84823qW.A1u) {
            c84823qW.A1l = "mention_text";
        }
        c84823qW.A12 = EnumC75383a5.A0n;
        c84823qW.A1C = user;
        c84823qW.A1h = str;
    }

    public static final C84823qW A00(AbstractC202868y4 abstractC202868y4, C6RB c6rb, InteractiveDrawableContainer interactiveDrawableContainer, C202278x7 c202278x7) {
        int width = interactiveDrawableContainer.getWidth();
        int height = interactiveDrawableContainer.getHeight();
        int i = -C6RE.A00(c6rb.A0G);
        RectF rectF = A03;
        C14360o3.A0B(rectF, 0);
        rectF.set(abstractC202868y4.A00);
        C14360o3.A07(c6rb.getBounds());
        rectF.offset(r1.left + c6rb.A00, r1.top + c6rb.A01);
        float f = width;
        float width2 = (rectF.width() * c202278x7.A06) / f;
        float f2 = height;
        float height2 = (rectF.height() * c202278x7.A06) / f2;
        Matrix matrix = A02;
        matrix.set(c202278x7.A0E);
        matrix.preTranslate(i, 0.0f);
        matrix.mapRect(rectF);
        float centerX = rectF.centerX() / f;
        float centerY = rectF.centerY() / f2;
        float f3 = c202278x7.A05 / 360.0f;
        C84823qW c84823qW = new C84823qW();
        c84823qW.A03 = centerX;
        c84823qW.A04 = centerY;
        c84823qW.A09 = (c202278x7.A09 * DexStore.MS_IN_NS) + c202278x7.A0B;
        c84823qW.A02 = width2;
        c84823qW.A00 = height2;
        c84823qW.A01 = f3;
        A06(abstractC202868y4, c84823qW);
        return c84823qW;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(Drawable drawable, C84823qW c84823qW, InteractiveDrawableContainer interactiveDrawableContainer, C202278x7 c202278x7, boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int width = interactiveDrawableContainer.getWidth();
        int height = interactiveDrawableContainer.getHeight();
        if (drawable instanceof BCB) {
            Rect BIv = ((BCB) drawable).BIv();
            f = BIv.width();
            f2 = BIv.height();
            float[] fArr = {c202278x7.A01 + BIv.exactCenterX(), c202278x7.A02 + BIv.exactCenterY()};
            Matrix matrix = new Matrix();
            float f6 = c202278x7.A06;
            matrix.postScale(f6, f6, c202278x7.A03, c202278x7.A04);
            matrix.postRotate(c202278x7.A05, c202278x7.A03, c202278x7.A04);
            matrix.mapPoints(fArr);
            f3 = fArr[0];
            f4 = fArr[1];
        } else {
            f = c202278x7.A0A;
            f2 = c202278x7.A07;
            f3 = c202278x7.A03;
            f4 = c202278x7.A04;
        }
        if (!z2) {
            f5 = c202278x7.A06;
        } else {
            f5 = 1.0f;
        }
        float f7 = width;
        float f8 = (f * f5) / f7;
        float f9 = f2 * f5;
        float f10 = height;
        float f11 = c202278x7.A05 / 360.0f;
        c84823qW.A03 = f3 / f7;
        c84823qW.A04 = f4 / f10;
        c84823qW.A09 = (c202278x7.A09 * DexStore.MS_IN_NS) + c202278x7.A0B;
        c84823qW.A02 = f8;
        c84823qW.A00 = f9 / f10;
        c84823qW.A01 = f11;
        c84823qW.A1u = z;
    }
}
