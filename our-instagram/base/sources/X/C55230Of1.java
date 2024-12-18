package X;

import android.os.Build;
import android.util.Base64;
import android.util.JsonWriter;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AppInstallCTAInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Of1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55230Of1 {
    public static final C55230Of1 A00 = new Object();
    public static final Integer[] A01 = {C05F.A00, C05F.A01, C05F.A0C, C05F.A0N, C05F.A0Y, C05F.A0u, C05F.A15};

    public static final C25621Ms A01(C22P c22p, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, EnumC53323Ni0 enumC53323Ni0, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167007dF.A1D(userSession, 1, str);
        AbstractC167007dF.A1H(str3, 5, mediaUploadMetadata);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0R = true;
        StringBuilder A1C = AbstractC166987dD.A1C();
        enumC53323Ni0.A00(A0c, userSession, A1C);
        if (z) {
            A1C.append("?video=1");
        }
        A0c.A0E = AbstractC166987dD.A19(A1C);
        String str6 = mediaUploadMetadata.A05;
        String str7 = mediaUploadMetadata.A03;
        if (!AbstractC13670mt.A0B(str6) && AbstractC178007vZ.A02(userSession, str7, C16930sl.A00).length() > 0) {
            A0c.A9s("attributed_device_name", str6);
        }
        String str8 = mediaUploadMetadata.A03;
        String str9 = mediaUploadMetadata.A04;
        A0c.A9s("upload_id", str);
        A0c.A9s("underlying_spinnable_clip_video_upload_id", str5);
        if (!AbstractC13670mt.A0B(str8)) {
            A0c.A9s("app_attribution_android_namespace", str8);
            if (C14360o3.A0K(str8, "com.wearable.facebook.monza")) {
                A0c.A9s("internal_features", EnumC223259tC.A0W.toString());
            }
            if (!AbstractC13670mt.A0B(str9)) {
                A0c.A9s("app_attribution_android_raw_namespace", str8);
            }
        }
        if (z) {
            A0c.A9s(AbstractC43591JPw.A00(1397), str2);
        }
        if (list != null && !list.isEmpty()) {
            JSONArray A0p = AbstractC31171DnF.A0p();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C51743MtS c51743MtS = (C51743MtS) it.next();
                JSONObject A0q = AbstractC31171DnF.A0q();
                A0q.put(TraceFieldType.ContentType, c51743MtS.A03);
                A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c51743MtS.A01);
                A0q.put(AbstractC31188DnX.A01(), c51743MtS.A05);
                A0q.put(DialogModule.KEY_TITLE, c51743MtS.A02);
                A0q.put("segment_index", c51743MtS.A00);
                A0q.put("thumbnail_url", c51743MtS.A04);
                A0p.put(A0q);
            }
            A0c.AA6(AbstractC111324zv.A00(4413), AbstractC166987dD.A19(A0p));
        }
        if (z2) {
            A0c.A9s("from_drafts", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (AbstractC14490oL.A09(AbstractC12290kX.A00)) {
            A0c.A9s("is_upload_type_override_allowed", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        A0c.A9s(AbstractC31188DnX.A02(0, 9, 10), str3);
        if (c22p != null) {
            A0c.A0D("camera_entry_point", (int) c22p.A00);
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36310843226325330L)) {
            A0c.A0G("X-IG-EU-CONFIGURE-DISABLED", "true");
        }
        A0c.A0D("include_e2ee_mentioned_user_list", 1);
        if (z4) {
            A0c.A0G(AbstractC43591JPw.A00(31), AbstractC43591JPw.A00(60));
        }
        if (!AbstractC13670mt.A0B(mediaUploadMetadata.A03)) {
            String str10 = mediaUploadMetadata.A0A;
            String str11 = mediaUploadMetadata.A03;
            if (!AbstractC13670mt.A0B(str10) && AbstractC178007vZ.A02(userSession, str11, C16930sl.A00).length() > 0) {
                A0c.A9s("wearable_shared_media_global_id", str10);
            }
        }
        if (z3) {
            A0c.A0D("is_ads_mode", 1);
        }
        if (str4 != null) {
            A0c.A9s("publish_id", str4);
        }
        return A0c;
    }

    public static final String A04(C9C9 c9c9) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        JsonWriter jsonWriter = new JsonWriter(A0O);
        String str = c9c9.A00;
        String A0J = str != null ? AbstractC001900j.A0J(str, str, '_') : null;
        String str2 = c9c9.A01;
        try {
            jsonWriter.beginObject();
            if (A0J != null) {
                MSX.A0z(jsonWriter, AbstractC111324zv.A00(2408), A0J);
            }
            if (str2 != null) {
                MSX.A0z(jsonWriter, AbstractC111324zv.A00(2409), str2);
            }
            jsonWriter.endObject();
            jsonWriter.close();
        } catch (IOException unused) {
        }
        return A0O.toString();
    }

    public static final LinkedHashMap A0G(UserSession userSession, C47Z c47z, String str) {
        String valueOf;
        String str2;
        String A002;
        String str3;
        C14360o3.A0B(str, 2);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put("upload_id", str);
        A1I.put("media_type", String.valueOf(c47z.A1G.A00));
        A1I.put("upload_engine_config_enum", String.valueOf(c47z.A0N));
        if (AbstractC167007dF.A1W(c47z.A3O)) {
            A1I.put("is_sidecar", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (AbstractC167007dF.A1W(c47z.A3Q)) {
            A1I.put("is_threads", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        String str4 = c47z.A3N;
        if (str4 != null && str4.length() != 0) {
            A1I.put("original_photo_pdq_hash", str4);
        }
        if (c47z.A2U != null && !c47z.A14(ShareType.A02)) {
            A1I.put("is_post_live_clips", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A1I.put(TraceFieldType.BroadcastId, c47z.A2U);
        }
        if (AbstractC31171DnF.A1b(c47z.A4t) || AbstractC23131AMn.A08(userSession, c47z)) {
            if (c47z.A14(ShareType.A02)) {
                A1I.put("for_album", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            if (AbstractC210079Qv.A05(c47z)) {
                valueOf = "-1";
            } else {
                valueOf = String.valueOf(AbstractC23131AMn.A01(c47z));
            }
            A1I.put("photo_to_video_duration_ms", valueOf);
            A0N(c47z, A1I);
            java.util.Set set = c47z.A4t;
            try {
                StringWriter A0O = AbstractC37300Gc1.A0O();
                C17z A06 = AbstractC37301Gc2.A06(A0O);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    AEJ.A00(A06, (AGS) it.next());
                }
                str2 = MSZ.A0s(A06, A0O);
            } catch (IOException unused) {
                str2 = null;
            }
            A1I.put("sticker_burnin_params", str2);
        }
        int i = c47z.A0H;
        int i2 = c47z.A0G;
        Double d = c47z.A24;
        Double d2 = c47z.A25;
        int i3 = c47z.A0A;
        String str5 = c47z.A33;
        if (str5 == null) {
            A002 = null;
        } else {
            A002 = AbstractC13570mj.A00(str5);
        }
        A1I.put("image_compression", A07(userSession, d, d2, A002, i, i2, i3));
        try {
            str3 = AbstractC13590ml.A00(C0BQ.A00(userSession).BOc(userSession.userId));
        } catch (IOException unused2) {
            str3 = "";
        }
        A1I.put("xsharing_user_ids", str3);
        A1I.put("retry_context", c47z.A0G());
        if (c47z.A1G == EnumC40111tc.A0Q) {
            A0L(userSession, c47z, A1I);
        }
        A0M(userSession, c47z, A1I);
        if (c47z.A1G == EnumC40111tc.A06 && c47z.A57) {
            A1I.put("render_as_sticker", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (c47z.A0D() == ShareType.A0D || c47z.A0D() == ShareType.A0Y) {
            A1I.put("upload_engine_config_enum", String.valueOf(c47z.A0N));
        }
        return A1I;
    }

    public static final void A0H(InterfaceC23731Ed interfaceC23731Ed, UserSession userSession, InterfaceC58205PrB interfaceC58205PrB, String str, String str2, String str3) {
        AbstractC167007dF.A1E(userSession, 0, str);
        if (interfaceC58205PrB.CUC()) {
            AbstractC54097Nvv.A00(interfaceC23731Ed, userSession, str, str2, str3);
        }
        if (interfaceC58205PrB.Ccv() && interfaceC58205PrB.BuI() != null) {
            interfaceC23731Ed.A9s("share_to_threads", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            interfaceC23731Ed.A9s("share_to_threads_destination_id", interfaceC58205PrB.BuI());
            List BuJ = interfaceC58205PrB.BuJ();
            if (BuJ != null && !BuJ.isEmpty()) {
                interfaceC23731Ed.AA6("share_to_threads_validation_bypass", AbstractC13590ml.A00(BuJ));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x00a1, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11, 36312999299909204L) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (X.MSZ.A0h(r11) != X.C05F.A01) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (X.MSZ.A0h(r11) != X.C05F.A0C) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f8, code lost:
    
        if (r4.length() == 0) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0I(X.InterfaceC23731Ed r10, com.instagram.common.session.UserSession r11, X.InterfaceC58205PrB r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55230Of1.A0I(X.1Ed, com.instagram.common.session.UserSession, X.PrB, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0J(X.InterfaceC23731Ed r10, com.instagram.common.session.UserSession r11, X.C54743OFu r12, long r13, boolean r15) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55230Of1.A0J(X.1Ed, com.instagram.common.session.UserSession, X.OFu, long, boolean):void");
    }

    public static final void A0L(UserSession userSession, C47Z c47z, Map map) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((!C18U.A06(c06090Tz, userSession, 36315932762640198L) && !C18U.A06(c06090Tz, userSession, 36315932762705735L)) || AbstractC13670mt.A0B(c47z.A3y)) {
            return;
        }
        String str = c47z.A3y;
        if (str != null) {
            Charset charset = StandardCharsets.UTF_8;
            C14360o3.A08(charset);
            byte[] bytes = str.getBytes(charset);
            C14360o3.A07(bytes);
            map.put("xmp_data", Base64.encodeToString(bytes, 2));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final AppInstallCTAInfo A02(BrandedContentProjectMetadata brandedContentProjectMetadata) {
        String str = brandedContentProjectMetadata.A05;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = brandedContentProjectMetadata.A06;
        if (str3 != null) {
            str2 = str3;
        }
        if (str.length() <= 0 && str2.length() <= 0) {
            return null;
        }
        return new AppInstallCTAInfo(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r4.A01 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A09(X.C54743OFu r4) {
        /*
            int r0 = r4.A02
            if (r0 == 0) goto L9
            int r1 = r4.A01
            r0 = 1
            if (r1 != 0) goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L41
            java.io.StringWriter r3 = X.AbstractC37300Gc1.A0O()     // Catch: java.lang.Throwable -> L41
            android.util.JsonWriter r1 = X.MSY.A0C(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "source_width"
            android.util.JsonWriter r2 = r1.name(r0)     // Catch: java.lang.Throwable -> L41
            int r0 = r4.A02     // Catch: java.lang.Throwable -> L41
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L41
            android.util.JsonWriter r1 = r2.value(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "source_height"
            android.util.JsonWriter r2 = r1.name(r0)     // Catch: java.lang.Throwable -> L41
            int r0 = r4.A01     // Catch: java.lang.Throwable -> L41
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L41
            android.util.JsonWriter r0 = r2.value(r0)     // Catch: java.lang.Throwable -> L41
            android.util.JsonWriter r0 = r0.endObject()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3c
            r0.close()     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L41
            return r0
        L3c:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55230Of1.A09(X.OFu):java.lang.String");
    }

    public static final void A0M(UserSession userSession, C47Z c47z, Map map) {
        String str;
        if (AbstractC167007dF.A1W(c47z.A3Q)) {
            str = "threads";
        } else {
            if (!C18U.A06(C06090Tz.A05, userSession, 36319072383671204L)) {
                return;
            }
            if (c47z.A0v()) {
                str = "feed";
            } else if (!c47z.A14(ShareType.A02)) {
                return;
            } else {
                str = "story";
            }
        }
        map.put("IG-FB-Xpost-entry-point-v2", str);
    }

    public static final void A0N(C47Z c47z, Map map) {
        int i;
        MusicOverlayStickerModel A02 = AbstractC50710Ma7.A00.A02(c47z.A4b);
        try {
            if (AbstractC50707Ma2.A03(c47z)) {
                if (A02 != null) {
                    String str = A02.A0S;
                    Integer num = A02.A0K;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    if (str != null && !str.equals("0")) {
                        StringWriter A0O = AbstractC37300Gc1.A0O();
                        C17z A0S = AbstractC167007dF.A0S(A0O);
                        A0S.A0S("asset_fbid", str);
                        A0S.A0Q("offset_ms", i);
                        String A0l = AbstractC167017dG.A0l(A0S, A0O);
                        C14360o3.A07(A0l);
                        map.put("music_burnin_params", A0l);
                        if (C48r.A00(EnumC75383a5.A0r, c47z.A4b) != null) {
                            map.put("story_has_lyrics", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                        }
                        C84823qW A002 = C48r.A00(EnumC75383a5.A0k, c47z.A4b);
                        if (A002 != null) {
                            ProductType productType = A002.A0n;
                            if (productType == ProductType.FEED || productType == ProductType.FEED_CAROUSEL) {
                                map.put("is_feed_reshare", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C0w9.A03("missingAudioAssetId", "We are music muxing, but are missing an asset ID.");
                    return;
                }
                C0w9.A03("isMusicMuxingWithNoParams", "We are music muxing, but have no parameters somehow.");
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:38|(3:40|(1:98)|44)|100|(19:51|(1:53)|55|(1:57)|58|(1:60)|61|(1:63)|64|(3:66|(1:68)(1:71)|(1:70))|72|(1:74)|75|76|77|78|(1:80)|81|(2:83|(5:87|(2:90|88)|91|92|93)))|97|55|(0)|58|(0)|61|(0)|64|(0)|72|(0)|75|76|77|78|(0)|81|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0182, code lost:
    
        if (r6 == com.instagram.pendingmedia.model.constants.ShareType.A0W) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r12.A5L != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f8, code lost:
    
        if (r0 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        if (X.AbstractC25226BEj.A1b(r12.A0J(new X.C55800OqB(r0), X.InterfaceC40171tl.class)) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f9, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f5, code lost:
    
        if (r12.A0D() == com.instagram.pendingmedia.model.constants.ShareType.A0V) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C20030yX A00(com.instagram.common.session.UserSession r11, X.C47Z r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55230Of1.A00(com.instagram.common.session.UserSession, X.47Z, java.lang.String):X.0yX");
    }

    public static final String A03() {
        try {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            JsonWriter endObject = MSY.A0C(A0O).name(AbstractC58317Pt9.A00(116)).value(Build.MANUFACTURER).name("model").value(Build.MODEL).name(AbstractC111324zv.A00(3907)).value(Build.VERSION.SDK_INT).name("android_release").value(Build.VERSION.RELEASE).endObject();
            if (endObject != null) {
                endObject.close();
                return A0O.toString();
            }
            throw AbstractC166997dE.A0g();
        } catch (IOException | NullPointerException unused) {
            return null;
        }
    }

    public static final String A05(AppInstallCTAInfo appInstallCTAInfo) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0S = AbstractC167007dF.A0S(A0O);
        String str = appInstallCTAInfo.A00;
        if (str != null) {
            A0S.A0S("android_package", str);
        }
        String str2 = appInstallCTAInfo.A01;
        if (str2 != null) {
            A0S.A0S("ios_content_id", str2);
        }
        String A0l = AbstractC167017dG.A0l(A0S, A0O);
        C14360o3.A07(A0l);
        return A0l;
    }

    public static final String A06(UserSession userSession, InterfaceC58205PrB interfaceC58205PrB) {
        List Ab3 = interfaceC58205PrB.Ab3();
        String str = null;
        if (Ab3 != null && !Ab3.isEmpty()) {
            try {
                JSONObject A0q = AbstractC31171DnF.A0q();
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = Ab3.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    User A15 = AbstractC25226BEj.A15(it);
                    if (!AbstractC31171DnF.A1W(userSession, A15.getId())) {
                        if (A15.getId().length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            AbstractC31173DnH.A1X(A15, A1E);
                        }
                    }
                }
                if (AbstractC25226BEj.A1b(A1E)) {
                    A0q.put("thread_member_ids", new JSONArray((Collection) A1E));
                }
                String Byh = interfaceC58205PrB.Byh();
                if (Byh == null) {
                    Byh = "";
                }
                A0q.put("chat_name", Byh);
                str = A0q.toString();
                return str;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        if (java.lang.Double.isNaN(r1) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        if (java.lang.Double.isNaN(r1) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A07(com.instagram.common.session.UserSession r8, java.lang.Double r9, java.lang.Double r10, java.lang.String r11, int r12, int r13, int r14) {
        /*
            java.io.StringWriter r7 = X.AbstractC37300Gc1.A0O()     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            android.util.JsonWriter r4 = X.MSY.A0C(r7)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            java.lang.String r0 = "lib_name"
            android.util.JsonWriter r1 = r4.name(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r0.equals(r11)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            if (r0 == 0) goto L42
            boolean r0 = com.instagram.util.jpeg.JpegBridge.A01()     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            if (r0 == 0) goto L3f
            java.lang.String r0 = com.instagram.util.jpeg.JpegBridge.getJpegLibraryNameNative()     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
        L20:
            android.util.JsonWriter r1 = r1.value(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            java.lang.String r0 = "lib_version"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            java.lang.String r0 = X.C55187Ods.A04(r11)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            r1.value(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            java.lang.String r0 = "quality"
            android.util.JsonWriter r1 = r4.name(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            r1.value(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            goto L5b
        L3f:
            java.lang.String r0 = "library_not_loaded"
            goto L20
        L42:
            java.lang.String r0 = "image/webp"
            boolean r0 = r0.equals(r11)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            if (r0 == 0) goto L4d
            java.lang.String r0 = "libwebp"
            goto L20
        L4d:
            java.lang.String r0 = "image/heic"
            boolean r0 = r0.equals(r11)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            if (r0 == 0) goto L58
            java.lang.String r0 = "androidx.heifwriter"
            goto L20
        L58:
            java.lang.String r0 = "unknown"
            goto L20
        L5b:
            if (r12 == 0) goto L73
            if (r13 == 0) goto L73
            java.lang.String r0 = "original_width"
            android.util.JsonWriter r2 = r4.name(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            long r0 = (long) r12     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            r2.value(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            java.lang.String r0 = "original_height"
            android.util.JsonWriter r2 = r4.name(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            long r0 = (long) r13     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            r2.value(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
        L73:
            if (r9 == 0) goto L99
            double r1 = r9.doubleValue()     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            X.0Tz r0 = X.C06090Tz.A05     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            r5 = 36322156170586142(0x810acf0006281e, double:3.033616047637569E-306)
            boolean r0 = X.C18U.A06(r0, r8, r5)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            if (r0 == 0) goto L8d
            boolean r3 = java.lang.Double.isNaN(r1)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            r0 = 0
            if (r3 != 0) goto L8e
        L8d:
            r0 = 1
        L8e:
            if (r0 == 0) goto L99
            java.lang.String r0 = "msssim"
            android.util.JsonWriter r0 = r4.name(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            r0.value(r1)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
        L99:
            if (r10 == 0) goto Lbf
            double r1 = r10.doubleValue()     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            X.0Tz r0 = X.C06090Tz.A05     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            r5 = 36322156170586142(0x810acf0006281e, double:3.033616047637569E-306)
            boolean r0 = X.C18U.A06(r0, r8, r5)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            if (r0 == 0) goto Lb3
            boolean r3 = java.lang.Double.isNaN(r1)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            r0 = 0
            if (r3 != 0) goto Lb4
        Lb3:
            r0 = 1
        Lb4:
            if (r0 == 0) goto Lbf
            java.lang.String r0 = "ssim"
            android.util.JsonWriter r0 = r4.name(r0)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            r0.value(r1)     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
        Lbf:
            android.util.JsonWriter r0 = r4.endObject()     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            if (r0 == 0) goto Lcd
            r0.close()     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            java.lang.String r0 = r7.toString()     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            return r0
        Lcd:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
            throw r0     // Catch: java.lang.NullPointerException -> Ld2 java.io.IOException -> Ld9
        Ld2:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        Ld9:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55230Of1.A07(com.instagram.common.session.UserSession, java.lang.Double, java.lang.Double, java.lang.String, int, int, int):java.lang.String");
    }

    public static final String A08(InterfaceC58205PrB interfaceC58205PrB) {
        String str;
        StringWriter A0O = AbstractC37300Gc1.A0O();
        JsonWriter jsonWriter = new JsonWriter(A0O);
        String BnS = interfaceC58205PrB.BnS();
        String BnO = interfaceC58205PrB.BnO();
        String BNN = interfaceC58205PrB.BNN();
        int BnA = interfaceC58205PrB.BnA();
        String AzF = interfaceC58205PrB.AzF();
        MUD B9o = interfaceC58205PrB.B9o();
        C38801H6q Aff = interfaceC58205PrB.Aff();
        String Afe = interfaceC58205PrB.Afe();
        Boolean Afa = interfaceC58205PrB.Afa();
        String AfY = interfaceC58205PrB.AfY();
        List AfZ = interfaceC58205PrB.AfZ();
        Integer AfX = interfaceC58205PrB.AfX();
        Boolean Afc = interfaceC58205PrB.Afc();
        String Afd = interfaceC58205PrB.Afd();
        String Byn = interfaceC58205PrB.Byn();
        try {
            jsonWriter.beginObject();
            if (BnS != null) {
                JsonWriter name = jsonWriter.name("reply_id");
                AtomicBoolean atomicBoolean = C38321qM.A0i;
                name.value(C38801rC.A06(BnS));
            }
            if (BnO != null) {
                JsonWriter name2 = jsonWriter.name("reply_repost_id");
                AtomicBoolean atomicBoolean2 = C38321qM.A0i;
                name2.value(C38801rC.A06(BnO));
            }
            if (BNN != null) {
                MSX.A0z(jsonWriter, "link_attachment_url", BNN);
            }
            if (BnA != -1) {
                jsonWriter.name("reply_control").value(Integer.valueOf(BnA));
            }
            if (Afa != null) {
                jsonWriter.name("fediverse_composer_enabled").value(Afa.booleanValue());
            }
            if (AzF != null) {
                MSX.A0z(jsonWriter, "draft_client_uuid", AzF);
            }
            if (B9o != null) {
                str = B9o.A02;
            } else {
                str = null;
            }
            if (str != null) {
                jsonWriter.name("gif_media_id").value(B9o.A02);
            }
            if (Aff != null) {
                JsonWriter name3 = jsonWriter.name("text_with_entities");
                StringWriter A0O2 = AbstractC37300Gc1.A0O();
                C17z A0O3 = MSW.A0O(A0O2);
                IPR.A00(A0O3, Aff);
                name3.value(MSY.A0e(A0O3, A0O2));
            }
            if (Afe != null) {
                MSX.A0z(jsonWriter, "special_effects_enabled_str", Afe);
            }
            if (AfY != null) {
                MSX.A0z(jsonWriter, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AfY);
            }
            if (AbstractC166987dD.A1b(AfZ)) {
                jsonWriter.name("excluded_inline_media_ids").value(AbstractC13590ml.A00(AfZ));
            }
            if (AfX != null) {
                jsonWriter.name("auto_delete_after").value(AfX);
            }
            if (Afc != null) {
                jsonWriter.name("is_loop_community").value(Afc.booleanValue());
            }
            if (Afd != null) {
                MSX.A0z(jsonWriter, "loop_community_name", Afd);
            }
            if (Byn != null) {
                MSX.A0z(jsonWriter, "ranking_info_token", Byn);
            }
            jsonWriter.endObject();
            jsonWriter.close();
        } catch (IOException unused) {
        }
        return AbstractC166987dD.A19(A0O);
    }

    public static final String A0A(String str, int i) {
        try {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            JsonWriter jsonWriter = new JsonWriter(A0O);
            jsonWriter.beginObject();
            MSX.A0z(jsonWriter, AbstractC111324zv.A00(2386), str);
            jsonWriter.name(AbstractC111324zv.A00(4466)).value(Float.valueOf(i / 100.0f));
            jsonWriter.endObject();
            jsonWriter.close();
            return A0O.toString();
        } catch (IOException unused) {
            return null;
        }
    }

    public static final String A0B(String str, List list) {
        String str2;
        try {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            JsonWriter jsonWriter = new JsonWriter(A0O);
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ClipInfo clipInfo = (ClipInfo) it.next();
                jsonWriter.beginObject();
                jsonWriter.name("length").value((clipInfo.A05 - clipInfo.A07) / 1000.0d);
                MSX.A0z(jsonWriter, "source_type", str);
                if (clipInfo.A0E != null) {
                    jsonWriter.name("software").value(clipInfo.A0E);
                }
                int i = clipInfo.A03;
                if (i != -1) {
                    if (i == 1) {
                        str2 = "front";
                    } else {
                        str2 = "back";
                    }
                    MSX.A0z(jsonWriter, "camera_position", str2);
                }
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.close();
            return A0O.toString();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.Mqx, java.lang.Object] */
    public static final String A0C(List list) {
        String str;
        C5NL A002;
        C5NG BlQ;
        C5NH c5nh;
        String str2;
        String str3;
        Integer num;
        C5QL c5ql;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C203318yo c203318yo = (C203318yo) it.next();
            C5NM c5nm = c203318yo.A00;
            Boolean bool = null;
            if (c5nm != null && (A002 = c5nm.A00()) != null && (BlQ = A002.BlQ()) != null && (c5nh = BlQ.A01) != null) {
                if ((A002 instanceof C5QK) && (c5ql = ((C5QK) A002).A0D) != null) {
                    str2 = c5ql.A00;
                } else {
                    str2 = null;
                }
                C5NH c5nh2 = C5NH.A06;
                if (c5nh == c5nh2) {
                    str3 = BlQ.A00();
                } else {
                    str3 = null;
                }
                C202278x7 c202278x7 = c203318yo.A02;
                if (c202278x7 != null) {
                    bool = Boolean.valueOf(c202278x7.A0D);
                }
                if (c5nh == c5nh2) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                boolean A1b = AbstractC31177DnL.A1b(bool);
                ?? obj = new Object();
                obj.A00 = num;
                obj.A01 = str3;
                obj.A03 = A1b;
                obj.A02 = str2;
                A1E.add(obj);
            }
        }
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A06 = AbstractC37301Gc2.A06(A0O);
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            C51605Mqx c51605Mqx = (C51605Mqx) it2.next();
            A06.A0d();
            Integer num2 = c51605Mqx.A00;
            if (num2 != null) {
                if (1 - num2.intValue() != 0) {
                    str = "text";
                } else {
                    str = "sticker";
                }
                A06.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            }
            String str4 = c51605Mqx.A01;
            if (str4 != null) {
                A06.A0S("sticker_id", str4);
            }
            A06.A0T(AbstractC111324zv.A00(1057), c51605Mqx.A03);
            String str5 = c51605Mqx.A02;
            if (str5 != null) {
                A06.A0S("text", str5);
            }
            A06.A0a();
        }
        A06.A0Z();
        return MSY.A0e(A06, A0O);
    }

    public static final String A0D(List list) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A06 = AbstractC37301Gc2.A06(A0O);
        if (AbstractC166987dD.A1b(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OQC.A00((C51730MtA) it.next(), A06);
            }
        }
        A06.A0Z();
        return MSY.A0e(A06, A0O);
    }

    public static final String A0E(List list) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A06 = AbstractC37301Gc2.A06(A0O);
        if (AbstractC166987dD.A1b(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC54881OPc.A00(MSW.A0J(it), A06);
            }
        }
        A06.A0Z();
        return MSY.A0e(A06, A0O);
    }

    public static final String A0F(List list, boolean z) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A06 = AbstractC37301Gc2.A06(A0O);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BrandedContentTag A0n = MSW.A0n(it);
            A0n.A04 = z;
            AbstractC54880OPb.A00(A06, A0n);
        }
        A06.A0Z();
        return MSY.A0e(A06, A0O);
    }

    public static final void A0K(InterfaceC23731Ed interfaceC23731Ed, C54424O3e c54424O3e) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0O2 = MSW.A0O(A0O);
        OPP.A00(A0O2, c54424O3e);
        interfaceC23731Ed.A9s("creator_geo_gating_info", MSY.A0e(A0O2, A0O));
    }
}
