package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.ModalActivity;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.Gko, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37834Gko {
    public static final void A05(FragmentActivity fragmentActivity, UserSession userSession, Venue venue) {
        String A05 = venue.A05();
        Venue venue2 = new Venue();
        venue2.A06(A05);
        AbstractC68491VSw.A00(fragmentActivity, null, null, userSession, venue2, null, "", null, false);
    }

    public static final boolean A07(ClipsViewerSource clipsViewerSource, boolean z) {
        int A05 = AbstractC25227BEk.A05(clipsViewerSource, 0);
        if (A05 != 15 && A05 != 17 && A05 != 18 && A05 != 20) {
            if (A05 == 87) {
                return false;
            }
            return true;
        }
        return z;
    }

    public static final void A00(FragmentActivity fragmentActivity, C8JW c8jw, C120985dq c120985dq, UserSession userSession, C38321qM c38321qM, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String str7;
        ImageUrl imageUrl;
        String str8;
        InterfaceC88553xD A1Q;
        AudioPageMetadata A01;
        C8JW c8jw2 = c8jw;
        boolean A1V = AbstractC167007dF.A1V(c38321qM);
        String A08 = AbstractC41770Iem.A08(c120985dq);
        String A07 = AbstractC41770Iem.A07(c120985dq);
        Boolean A06 = AbstractC41770Iem.A06(c120985dq);
        if (A08 != null) {
            str7 = AbstractC41770Iem.A09(c120985dq);
            imageUrl = AbstractC41770Iem.A01(c120985dq);
        } else {
            str7 = null;
            imageUrl = null;
        }
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        if (A0u != null) {
            str8 = A0u.getMusicCanonicalId();
        } else {
            str8 = null;
        }
        C3x9 A0u2 = AbstractC25226BEj.A0u(c38321qM);
        if (A0u2 == null || (A1Q = AbstractC117245Sj.A01(A0u2)) == null) {
            A1Q = c38321qM.A1Q();
        }
        OriginalSoundDataIntf A1K = c38321qM.A1K();
        AudioFilterType A012 = AbstractC92574Cr.A01(AbstractC25226BEj.A0u(c38321qM));
        if (A1Q != null) {
            A01 = AbstractC41763Iee.A00(fragmentActivity, A012, A1Q, c38321qM.getId(), str, str2, str3, str4, str5, null, str8, z, A1V);
        } else if (A1K == null) {
            return;
        } else {
            A01 = AbstractC41763Iee.A01(A012, A1K, false);
        }
        if (c8jw2 == null) {
            c8jw2 = C8JW.A09;
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("args_audio_model", A01);
        A0b.putString(AbstractC111324zv.A00(347), str6);
        if (A08 != null) {
            A0b.putString("args_preloaded_effect_id", A08);
        }
        if (A07 != null) {
            A0b.putString("args_preloaded_effect_attribution_user_id", A07);
        }
        if (A06 != null) {
            A0b.putBoolean("args_preloaded_effect_supported", A06.booleanValue());
        }
        if (str7 != null) {
            A0b.putString("args_preloaded_effect_name", str7);
        }
        if (imageUrl != null) {
            A0b.putParcelable("args_preloaded_effect_thumbnail_url", imageUrl);
        }
        A0b.putSerializable(AbstractC43591JPw.A00(33), c8jw2);
        AbstractC25228BEl.A1G(fragmentActivity, A0b, userSession, ModalActivity.class, "audio_page");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (X.AbstractC167007dF.A1W(r30.getFailureReason()) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(androidx.fragment.app.FragmentActivity r26, X.C8JW r27, X.InterfaceC11380iw r28, com.instagram.common.session.UserSession r29, com.instagram.feed.media.EffectPreviewIntf r30, X.C38321qM r31, com.instagram.music.common.config.MusicAttributionConfig r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, boolean r37) {
        /*
            r25 = 0
            r1 = 1
            r0 = 4
            r3 = r30
            X.C14360o3.A0B(r3, r0)
            java.lang.String r10 = X.AbstractC41732Ie4.A02(r3)
            java.lang.String r11 = X.AbstractC41732Ie4.A03(r3)
            com.instagram.common.typedurl.ImageUrl r5 = X.AbstractC41732Ie4.A00(r3)
            java.lang.String r12 = r3.getId()
            java.lang.String r15 = r3.getName()
            com.instagram.api.schemas.AttributionUser r0 = r3.AdP()
            java.lang.Boolean r0 = r0.CfY()
            boolean r18 = X.AbstractC166997dE.A1Z(r0, r1)
            if (r37 == 0) goto L37
            java.lang.String r0 = r3.getFailureReason()
            boolean r0 = X.AbstractC167007dF.A1W(r0)
            r19 = 1
            if (r0 == 0) goto L39
        L37:
            r19 = 0
        L39:
            r4 = 0
            java.lang.String r2 = r3.getSaveStatus()
            java.lang.String r0 = "SAVED"
            boolean r20 = r0.equals(r2)
            java.lang.String r2 = r3.getSaveStatus()
            java.lang.String r0 = "NOT_SUPPORTED"
            boolean r0 = r0.equals(r2)
            r21 = r0 ^ 1
            java.lang.String r14 = ""
            com.instagram.ar.features.effectspage.models.EffectsPageModel r3 = new com.instagram.ar.features.effectspage.models.EffectsPageModel
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r13 = r4
            r16 = r14
            r17 = r4
            r22 = r1
            r23 = r1
            r24 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r9 = r31.getId()
            X.9tZ r5 = X.EnumC223429tZ.REELS_ATTRIBUTION
            r6 = r27
            r8 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r7 = r3
            android.os.Bundle r3 = instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r10 = r28.getModuleName()
            X.MWs r7 = X.EnumC50631MWs.A0G
            java.lang.Integer r9 = X.C05F.A01
            r2 = r26
            r6 = r4
            r8 = r29
            X.AbstractC40465Hwu.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37834Gko.A01(androidx.fragment.app.FragmentActivity, X.8JW, X.0iw, com.instagram.common.session.UserSession, com.instagram.feed.media.EffectPreviewIntf, X.1qM, com.instagram.music.common.config.MusicAttributionConfig, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A02(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC25546BRi enumC25546BRi, C38321qM c38321qM, MusicAttributionConfig musicAttributionConfig) {
        C14360o3.A0B(enumC25546BRi, 5);
        String id = c38321qM.getId();
        EnumC223429tZ enumC223429tZ = EnumC223429tZ.REELS_ATTRIBUTION;
        Context applicationContext = fragmentActivity.getApplicationContext();
        C14360o3.A0B(applicationContext, 5);
        AbstractC40465Hwu.A00(fragmentActivity, EffectsPageFragment.A00(enumC223429tZ, null, new EffectsPageModel(null, null, Integer.valueOf(enumC25546BRi.A00), Integer.valueOf(enumC25546BRi.A02), 2131957014, null, "", "", null, enumC25546BRi.A03, "", AbstractC166997dE.A0p(applicationContext, enumC25546BRi.A01), null, enumC25546BRi.A04, false, true, false, true, false, false, false, false), musicAttributionConfig, id, "-1", null, null, null), null, enumC223429tZ, null, EnumC50631MWs.A0G, userSession, C05F.A01, interfaceC11380iw.getModuleName());
    }

    public static final void A03(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, int[] iArr) {
        boolean A1U = AbstractC167007dF.A1U(userSession);
        C31368DqX A0J = AbstractC37304Gc5.A0J(interfaceC11380iw, userSession, str, str2);
        if (str3 != null) {
            A0J.A04 = new SourceModelInfoParams(str3, A1U ? 1 : 0, A1U ? 1 : 0);
        }
        C6XJ A0L = AbstractC31171DnF.A0L(fragmentActivity, AbstractC37303Gc4.A02(userSession, A0J), userSession, ModalActivity.class, "profile");
        A0L.A02 = interfaceC11380iw;
        if (iArr != null) {
            A0L.A0J = iArr;
        }
        A0L.A0C(fragmentActivity);
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        AbstractC167027dH.A13(userSession, str, str2);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("attribution_app_id", str);
        A0b.putString("attribution_app_name", str2);
        A0b.putString("content_url", str3);
        A0b.putParcelable(AbstractC58317Pt9.A00(10), imageUrl);
        A0b.putString(AbstractC111324zv.A00(1193), str4);
        A0b.putBoolean(AbstractC111324zv.A00(2927), z);
        A0b.putParcelable("profile_picture_url", imageUrl2);
        A0b.putString("profile_id", str5);
        A0b.putString("media_count", str6);
        A0b.putString("media_id", str7);
        AbstractC25228BEl.A1G(fragmentActivity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(5479));
    }

    public static final void A06(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AbstractC167027dH.A12(fragmentActivity, userSession, str);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC43591JPw.A00(StringTreeSet.MAX_SYMBOL_COUNT), str);
        AbstractC25228BEl.A1G(fragmentActivity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(1328));
    }
}
