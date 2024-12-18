package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LH4 {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r25.B0S().isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration A01(android.content.Context r24, com.instagram.feed.media.CreativeConfigIntf r25, java.lang.String r26) {
        /*
            r5 = 5
            r4 = 0
            java.util.List r0 = r25.B0S()
            if (r0 == 0) goto L13
            java.util.List r0 = r25.B0S()
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L14
        L13:
            r0 = 0
        L14:
            X.C18C.A0F(r0)
            boolean r0 = X.AbstractC121575f6.A0A(r25)
            r12 = 0
            if (r0 == 0) goto Ld4
            X.6Pd r3 = X.AbstractC121575f6.A03(r25)
        L22:
            boolean r0 = X.C6PX.A00(r24)
            if (r0 != 0) goto Ld1
            android.content.res.Resources r1 = r24.getResources()
            r0 = 2131976219(0x7f13601b, float:1.9589552E38)
            java.lang.String r2 = r1.getString(r0)
        L33:
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            r1.<init>()
            java.util.List r0 = r25.B0S()
            java.util.Iterator r8 = r0.iterator()
        L40:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Ld7
            java.lang.Object r0 = r8.next()
            com.instagram.feed.media.EffectPreviewIntf r0 = (com.instagram.feed.media.EffectPreviewIntf) r0
            X.C14360o3.A0B(r0, r4)
            java.lang.String r6 = r0.getId()
            int r6 = r6.length()
            if (r6 != 0) goto L61
            java.lang.String r6 = "EffectPreview"
            java.lang.String r0 = "Effect config is invalid due to empty effect ID"
            X.C0w9.A03(r6, r0)
            goto L40
        L61:
            java.lang.String r14 = r0.getId()
            java.lang.String r15 = r0.getName()
            com.instagram.common.typedurl.ImageUrl r10 = X.AbstractC41732Ie4.A00(r0)
            java.lang.String r16 = X.AbstractC41732Ie4.A03(r0)
            java.lang.String r17 = X.AbstractC41732Ie4.A02(r0)
            com.instagram.api.schemas.AttributionUser r6 = r0.AdP()
            com.instagram.api.schemas.ProfilePicture r6 = r6.Bhx()
            if (r6 == 0) goto Lcf
            com.instagram.common.typedurl.ImageUrl r11 = r6.CDO()
        L83:
            java.lang.String r7 = r0.getSaveStatus()
            java.lang.String r6 = "SAVED"
            boolean r25 = r6.equals(r7)
            com.instagram.feed.media.EffectActionSheetIntf r6 = r0.B0O()
            if (r6 == 0) goto L99
            java.util.List r21 = r6.BgC()
            if (r21 != 0) goto L9b
        L99:
            X.0sl r21 = X.C16930sl.A00
        L9b:
            com.instagram.feed.media.EffectActionSheetIntf r6 = r0.B0O()
            if (r6 == 0) goto La7
            java.util.List r22 = r6.BrM()
            if (r22 != 0) goto La9
        La7:
            X.0sl r22 = X.C16930sl.A00
        La9:
            com.instagram.model.effect.AttributedAREffect r9 = new com.instagram.model.effect.AttributedAREffect
            r13 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r23 = r12
            r24 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r0 = X.AbstractC41732Ie4.A03(r0)
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration r6 = new com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration
            r6.<init>(r9, r0)
            r6.A09 = r2
            r6.A02 = r3
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r0 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.NORMAL
            r6.A01 = r0
            r1.add(r6)
            goto L40
        Lcf:
            r11 = 0
            goto L83
        Ld1:
            r2 = r12
            goto L33
        Ld4:
            r3 = r12
            goto L22
        Ld7:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration r2 = new com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration
            r2.<init>()
            com.google.common.collect.ImmutableList r1 = r1.build()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lfb
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r1)
            r2.A02 = r0
            r2.A00 = r5
            X.22P r0 = X.C22P.A4g
            r2.A01 = r0
            r2.A06 = r4
            r2.A04 = r4
            r0 = r26
            r2.A03 = r0
            return r2
        Lfb:
            java.lang.String r0 = "at least one effect is needed"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LH4.A01(android.content.Context, com.instagram.feed.media.CreativeConfigIntf, java.lang.String):com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration");
    }

    public static String A02(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 7) {
                        if (i != 11) {
                            AbstractC12120kG.A01(MSV.A00(758), AnonymousClass001.A0O("Unhandled effect surface: ", i));
                            return "camera_effect_bottom_sheet";
                        }
                        return "ig_map";
                    }
                    return "search_effect_preview_video";
                }
                return "direct_effect_preview_video";
            }
            return "gallery_effect_preview_video";
        }
        return "profile_effect_preview_video";
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, com.instagram.model.shopping.ProductAREffectContainer] */
    public static EffectInfoBottomSheetConfiguration A00(Context context, UserSession userSession, ImageUrl imageUrl, ImageUrl imageUrl2, EnumC138476Pd enumC138476Pd, EnumC223179sw enumC223179sw, ProductItemWithARIntf productItemWithARIntf, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        EffectInfoBottomSheetMode effectInfoBottomSheetMode;
        ProductAREffectContainer productAREffectContainer;
        List list3 = list;
        String str8 = str3;
        String str9 = str5;
        String str10 = str2;
        if (z3) {
            list3 = Collections.singletonList("REPORT");
            list2.clear();
        }
        if (!C6PX.A00(context)) {
            str9 = context.getResources().getString(2131976219);
        }
        if (productItemWithARIntf != null) {
            str10 = AbstractC46663Kkg.A00(AbstractC38048Gob.A01(productItemWithARIntf.BhA()), false);
        }
        String str11 = str8;
        if (productItemWithARIntf != null && productItemWithARIntf.BhA().BSW() != null) {
            str11 = productItemWithARIntf.BhA().BSW().A03.getUsername();
        }
        AttributedAREffect attributedAREffect = new AttributedAREffect(imageUrl, imageUrl2, null, null, str, str10, str11, str4, null, null, null, list3, list2, null, i, z);
        if (productItemWithARIntf != null && productItemWithARIntf.BhA().BSW() != null) {
            str8 = productItemWithARIntf.BhA().BSW().A03.getUsername();
        }
        str8.getClass();
        EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration(attributedAREffect, str8);
        effectInfoAttributionConfiguration.A08 = str6;
        effectInfoAttributionConfiguration.A09 = str9;
        effectInfoAttributionConfiguration.A02 = enumC138476Pd;
        if (productItemWithARIntf != null) {
            effectInfoBottomSheetMode = EffectInfoBottomSheetMode.SHOPPING;
        } else {
            effectInfoBottomSheetMode = EffectInfoBottomSheetMode.NORMAL;
        }
        effectInfoAttributionConfiguration.A01 = effectInfoBottomSheetMode;
        if (productItemWithARIntf != null) {
            ProductItemWithAR F5w = productItemWithARIntf.F5w(C1DS.A00(userSession));
            boolean A1Z = AbstractC25229BEm.A1Z(productItemWithARIntf.BhA());
            ?? obj = new Object();
            obj.A00 = F5w;
            obj.A01 = A1Z;
            productAREffectContainer = obj;
        } else {
            productAREffectContainer = null;
        }
        effectInfoAttributionConfiguration.A05 = productAREffectContainer;
        effectInfoAttributionConfiguration.A03 = enumC223179sw;
        effectInfoAttributionConfiguration.A0A = AbstractC31174DnI.A1b(z2);
        EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
        effectInfoBottomSheetConfiguration.A02 = ImmutableList.of((Object) effectInfoAttributionConfiguration);
        effectInfoBottomSheetConfiguration.A00 = i;
        effectInfoBottomSheetConfiguration.A01 = C22P.A4g;
        effectInfoBottomSheetConfiguration.A06 = false;
        effectInfoBottomSheetConfiguration.A03 = str7;
        effectInfoBottomSheetConfiguration.A04 = false;
        return effectInfoBottomSheetConfiguration;
    }
}
