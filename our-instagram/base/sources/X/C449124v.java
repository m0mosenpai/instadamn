package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.24v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C449124v extends C22F {
    public String A00;
    public List A01;
    public List A02;
    public List A03;
    public final C449224w A04;

    public final void A0R() {
        EnumC114925Hg enumC114925Hg;
        C22M c22m = super.A04;
        c22m.A0W = false;
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_start_gallery_session");
        if (!A0P()) {
            AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", "logStartGallerySession failed", null);
            return;
        }
        if (!A00.isSampled()) {
            return;
        }
        EnumC114925Hg A0J = A0J();
        String str = c22m.A0L;
        if (str == null) {
            str = "";
        }
        A00.AAP("camera_session_id", str);
        if (A0J == null) {
            enumC114925Hg = EnumC114925Hg.NONE;
        } else {
            enumC114925Hg = A0J;
        }
        A00.A8R(enumC114925Hg, "camera_destination");
        A00.AAk("camera_tools", A0O(null, null, null, false, false));
        int i = 2;
        if (c22m.A01 != 2) {
            i = 1;
        }
        A00.A8p("camera_position", Integer.valueOf(i));
        A00.A9K("capture_format_index", 0L);
        A00.A8R(A0I(), "capture_type");
        A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A00.A8p("event_type", 2);
        A00.A8R(c22m.A0A, "media_type");
        A00.AAP("module", C22F.A08.getModuleName());
        EnumC50631MWs enumC50631MWs = c22m.A0B;
        if (enumC50631MWs == null) {
            enumC50631MWs = EnumC50631MWs.A0J;
        }
        A00.A8R(enumC50631MWs, "surface");
        A00.AAP("composition_str_id", c22m.A0M);
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.AAQ(AbstractC449424y.A07(super.A00, super.A03), "system_info");
        A00.A8R(c22m.A0D, "template_browser_entry_point");
        A00.A9K("clips_template_media_id", c22m.A0H);
        A00.AAP("template_browser_section", c22m.A0V);
        A00.A9K("media_id", c22m.A0I);
        if (A0J == null) {
            A0J = EnumC114925Hg.NONE;
        }
        A00.A8R(A0J, "bottom_camera_dial_selected");
        A00.Cht();
    }

    public final void A0W(EnumC223419tY enumC223419tY, EnumC193318hB enumC193318hB, Boolean bool, Boolean bool2, Double d, Long l, Long l2, String str, int i, int i2, int i3, long j, boolean z) {
        A05(enumC223419tY, enumC193318hB, null, new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), this, bool, bool2, d, null, null, l, l2, str, i, i2, i3, j, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if ((r0 instanceof X.C208509Kk) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Y(X.EnumC193318hB r12, X.EnumC114925Hg r13, X.EnumC114925Hg r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C449124v.A0Y(X.8hB, X.5Hg, X.5Hg, boolean):void");
    }

    public final void A0a(EnumC114925Hg enumC114925Hg, AnonymousClass249 anonymousClass249, EnumC50631MWs enumC50631MWs, C81X c81x, PromptStickerModel promptStickerModel, boolean z, boolean z2) {
        String str;
        String str2;
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_start_capture_format_session");
        if (A00.isSampled()) {
            C22M c22m = super.A04;
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            String str3 = c22m.A0L;
            if (str3 == null) {
                str3 = "";
            }
            A00.AAP("camera_session_id", str3);
            if (enumC114925Hg == null) {
                enumC114925Hg = EnumC114925Hg.NONE;
            }
            A00.A8R(enumC114925Hg, "camera_destination");
            A00.A9K("capture_format_index", -1L);
            A00.A8R(A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(anonymousClass249, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(enumC50631MWs, "surface");
            A00.A8R(c81x, "camera_tool");
            A00.A7v("is_gallery_first", Boolean.valueOf(z2));
            A00.A9K("media_id", c22m.A0I);
            A00.AAk("camera_tools_struct", A0N(0));
            A00.AAP("discovery_session_id", c22m.A0O);
            A00.AAP("search_session_id", c22m.A0P);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.A7v("is_panavision", Boolean.valueOf(z));
            A00.AAP("app_package_name", c22m.A0J);
            Long l = null;
            if (promptStickerModel != null) {
                str = promptStickerModel.A00.getText();
            } else {
                str = null;
            }
            A00.AAP("add_yours_prompt", str);
            if (promptStickerModel != null && (str2 = promptStickerModel.A03) != null) {
                l = AbstractC003100w.A0k(10, str2);
            }
            A00.A9K("add_yours_prompt_id", l);
            A00.AAQ(AbstractC449424y.A07(super.A00, super.A03), "system_info");
            EnumC174597pt enumC174597pt = c22m.A06;
            if (enumC174597pt != null) {
                A00.A8R(enumC174597pt, "folding_state");
            }
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Long] */
    public final void A0b(AnonymousClass249 anonymousClass249, EnumC50631MWs enumC50631MWs, C55U c55u, CreationLayoutConfig creationLayoutConfig, Long l, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, int i, int i2) {
        List list7;
        ArrayList A0B;
        Object obj;
        C14360o3.A0B(list, 4);
        C14360o3.A0B(enumC50631MWs, 6);
        C14360o3.A0B(list2, 7);
        C14360o3.A0B(list3, 8);
        C14360o3.A0B(list4, 9);
        C14360o3.A0B(list5, 10);
        C14360o3.A0B(str3, 18);
        C22M c22m = super.A04;
        c22m.A0A = anonymousClass249;
        if (i2 != 2 && i == -1) {
            String format = String.format("logCameraCapture() cameraPosition is unknown: entryPoint=%s mediaType=%d, captureFormat=%d, cameraSurface=%d ", Arrays.copyOf(new Object[]{c22m.A09, Long.valueOf(anonymousClass249.A00), Integer.valueOf(i2), Long.valueOf(enumC50631MWs.A00)}, 4));
            C14360o3.A07(format);
            AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", format, null);
        }
        if (!A06(anonymousClass249, c55u, list)) {
            String format2 = String.format("logCameraCapture() mediaType is not valid: entryPoint=%s mediaType=%d, captureFormat=%d, cameraSurface=%d cameraPosition=%d", Arrays.copyOf(new Object[]{c22m.A09, Long.valueOf(anonymousClass249.A00), Integer.valueOf(i2), Long.valueOf(enumC50631MWs.A00), Integer.valueOf(i)}, 5));
            C14360o3.A07(format2);
            list7 = null;
            AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", format2, null);
        } else {
            list7 = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!list2.isEmpty() && list2.size() == list3.size()) {
            int size = list2.size();
            int i3 = 0;
            list7 = list7;
            while (i3 < size) {
                String str4 = (String) AbstractC001800i.A0O(list2, i3);
                if (str4 != null) {
                    obj = AbstractC003100w.A0k(10, str4);
                } else {
                    obj = list7;
                }
                String str5 = (String) AbstractC001800i.A0O(list3, i3);
                List list8 = list7;
                if (str5 != null) {
                    list8 = AbstractC003100w.A0k(10, str5);
                }
                if (obj != null && list8 != null) {
                    arrayList.add(obj);
                    arrayList2.add(list8);
                }
                i3++;
                list7 = null;
            }
        }
        int i4 = 2;
        if (i != 2) {
            i4 = 1;
        }
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_capture");
        if (list6 == null) {
            A0B = A0N(0);
        } else {
            A0B = AbstractC449424y.A0B(list6);
        }
        String str6 = c22m.A0L;
        if (A00.isSampled() && str6 != null) {
            A00.AAk("applied_effect_ids", arrayList);
            A00.AAk("applied_effect_instance_ids", arrayList2);
            A00.A8p("camera_position", Integer.valueOf(i4));
            A00.AAP("camera_session_id", str6);
            A00.AAk("camera_tools", A0O(list, list7, list7, false, false));
            A00.AAk("camera_tools_struct", A0B);
            A00.A9K("capture_format_index", 0L);
            A00.A8R(A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(anonymousClass249, "media_type");
            A00.AAP("module", str3);
            A00.A8R(enumC50631MWs, "surface");
            A00.A8R(c55u.A00, "camera_destination");
            A00.A8R(AbstractC190188bc.A00(creationLayoutConfig), "nine_sixteen_layout_config");
            A00.A9K("media_id", C22F.A0F(str));
            A00.AAP("discovery_session_id", c22m.A0O);
            A00.A9M("effect_indices", A04(list2, list4));
            A00.A9K("audio_asset_id", AbstractC449424y.A08(str2));
            A00.AAP("composition_str_id", c22m.A0M);
            A00.A8R(anonymousClass249, "composition_media_type");
            A00.AAk("preloaded_audio_asset_id", this.A01);
            A00.AAk("preloaded_effect_id", this.A02);
            A00.AAk("preloaded_media_id", this.A03);
            A00.A7v("is_panavision", false);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("source_media_id", this.A00);
            A00.AAQ(AbstractC449424y.A07(super.A00, super.A03), "system_info");
            EnumC174597pt enumC174597pt = c22m.A06;
            if (enumC174597pt != null) {
                A00.A8R(enumC174597pt, "folding_state");
            }
            if (l != null) {
                A00.A9K("clips_template_media_id", l);
            }
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    public final void A0c(C55U c55u) {
        C22M c22m;
        String str;
        C14360o3.A0B(c55u, 0);
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_capture_format_session");
        if (A00.isSampled() && (str = (c22m = super.A04).A0L) != null) {
            EnumC193318hB enumC193318hB = EnumC193318hB.A08;
            EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0F;
            boolean z = c55u instanceof C81V;
            if (z) {
                enumC193318hB = EnumC193318hB.A02;
                enumC50631MWs = c22m.A0B;
                if (enumC50631MWs == null) {
                    enumC50631MWs = EnumC50631MWs.A0J;
                }
            }
            boolean z2 = c55u instanceof C128535rM;
            if (z2) {
                enumC193318hB = enumC193318hB;
                enumC50631MWs = EnumC50631MWs.A0H;
            }
            A00.A8R(c55u.A00, "camera_destination");
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.AAP("camera_session_id", str);
            A00.AAk("camera_tools", A0O(null, null, null, false, false));
            A00.AAk("camera_tools_struct", A0N(0));
            A00.A8R(enumC193318hB, "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            if (z) {
                A00.A9K("capture_format_index", 0L);
                A00.AAP("discovery_session_id", c22m.A0O);
                A00.AAP("search_session_id", c22m.A0P);
                A00.AAQ(AbstractC449424y.A07(super.A00, super.A03), "system_info");
                EnumC174597pt enumC174597pt = c22m.A06;
                if (enumC174597pt != null) {
                    A00.A8R(enumC174597pt, "folding_state");
                }
            } else if (!z2) {
                return;
            }
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    public final void A0d(List list, List list2, List list3, double d, int i, long j, boolean z) {
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_clips_combine_segments");
        if (A00.isSampled()) {
            C22M c22m = super.A04;
            String str = c22m.A0L;
            if (str != null) {
                EnumC114925Hg A0J = A0J();
                if (A0J == null) {
                    A0J = EnumC114925Hg.NONE;
                }
                A00.A8R(A0J, "camera_destination");
                A00.AAP("camera_session_id", str);
                A00.AAk("camera_tools", A0O(null, null, null, false, false));
                UserSession userSession = super.A03;
                A00.AAk("camera_tools_struct", AbstractC449424y.A0B(list3));
                A00.A9K("capture_format_index", 0L);
                A00.A8R(A0I(), "capture_type");
                A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A00.A8p("event_type", 1);
                A00.A9K("max_duration", Long.valueOf(j));
                A00.A8R(AnonymousClass249.VIDEO, "media_type");
                A00.AAP("module", C22F.A08.getModuleName());
                A00.A9K("num_segments", Long.valueOf(i));
                A00.A8R(EnumC50631MWs.A0I, "surface");
                A00.A8I("total_duration", Double.valueOf(d));
                A00.AAk("applied_effect_ids", list);
                A00.AAk("applied_effect_instance_ids", list2);
                int i2 = 2;
                if (c22m.A01 != 2) {
                    i2 = 1;
                }
                A00.A8p("camera_position", Integer.valueOf(i2));
                A00.AAP("discovery_session_id", c22m.A0O);
                A00.AAP("search_session_id", c22m.A0P);
                A00.AAP("sessions_chain", null);
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.A7v("is_panavision", Boolean.valueOf(z));
                A00.AAQ(AbstractC449424y.A07(super.A00, userSession), "system_info");
                A00.A8R(c22m.A0D, "template_browser_entry_point");
                A00.A9K("clips_template_media_id", c22m.A0H);
                A00.AAP("template_browser_section", c22m.A0V);
                EnumC174597pt enumC174597pt = c22m.A06;
                if (enumC174597pt != null) {
                    A00.A8R(enumC174597pt, "folding_state");
                }
                A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                A00.AAP("device_fold_state", AbstractC82683mW.A00);
                A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                A00.Cht();
                return;
            }
            AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", "logClipsCombineSegments() cameraSession is null", null);
        }
    }

    public final void A0f(boolean z) {
        Object obj;
        C22M c22m = super.A04;
        C1810981l c1810981l = c22m.A0E;
        if (c1810981l != null && (obj = c1810981l.A08.A00) != null && !(obj instanceof C81V) && !(obj instanceof C128535rM) && !(obj instanceof C208509Kk)) {
            return;
        }
        EnumC114925Hg A0J = A0J();
        EnumC50631MWs enumC50631MWs = c22m.A0B;
        if (enumC50631MWs == null) {
            enumC50631MWs = EnumC50631MWs.A0J;
        }
        A0a(A0J, c22m.A0A, enumC50631MWs, null, null, c22m.A0W, z);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A03(java.util.List r4) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r4 == 0) goto L60
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L60
            java.util.Iterator r2 = r4.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.hashCode()
            switch(r0) {
                case 99348: goto L45;
                case 100574: goto L51;
                case 101653: goto L39;
                case 101657: goto L35;
                case 102228: goto L31;
                case 114084: goto L25;
                default: goto L24;
            }
        L24:
            goto L11
        L25:
            java.lang.String r0 = "spa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L11
            X.Py6 r0 = X.Py6.A05
            goto L5c
        L31:
            java.lang.String r0 = "ger"
            goto L48
        L35:
            java.lang.String r0 = "fre"
            goto L3c
        L39:
            java.lang.String r0 = "fra"
        L3c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L11
            X.Py6 r0 = X.Py6.A03
            goto L5c
        L45:
            java.lang.String r0 = "deu"
        L48:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L11
            X.Py6 r0 = X.Py6.A04
            goto L5c
        L51:
            java.lang.String r0 = "eng"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L11
            X.Py6 r0 = X.Py6.A02
        L5c:
            r3.add(r0)
            goto L11
        L60:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C449124v.A03(java.util.List):java.util.ArrayList");
    }

    public static final HashMap A04(List list, List list2) {
        Long l;
        HashMap hashMap = new HashMap();
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) AbstractC001800i.A0O(list, i);
                Long l2 = null;
                if (str != null) {
                    l = AbstractC003100w.A0k(10, str);
                } else {
                    l = null;
                }
                if (((Number) AbstractC001800i.A0O(list2, i)) != null) {
                    l2 = Long.valueOf(r0.intValue());
                }
                if (l != null && l2 != null) {
                    hashMap.put(l, l2);
                }
            }
        }
        return hashMap;
    }

    public static final boolean A06(AnonymousClass249 anonymousClass249, C55U c55u, List list) {
        AnonymousClass249 anonymousClass2492 = AnonymousClass249.VIDEO;
        if ((anonymousClass249 != anonymousClass2492 && anonymousClass249 != AnonymousClass249.PHOTO) || ((list.contains(C81W.A0B) || list.contains(C81W.A0M) || c55u == C1811281o.A00 || c55u == C81S.A00) && anonymousClass249 != anonymousClass2492)) {
            return false;
        }
        return true;
    }

    public final void A0X(EnumC223419tY enumC223419tY, EnumC193318hB enumC193318hB, String str, String str2, String str3, String str4, String str5, int i, long j) {
        Long A0k;
        Long l;
        List list;
        EnumC193318hB enumC193318hB2 = enumC193318hB;
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_clips_segment_capture");
        if (A0P() && A00.isSampled()) {
            C22M c22m = super.A04;
            String str6 = c22m.A0R;
            if (str6 == null && (str6 = this.A00) == null) {
                A0k = C22F.A0F(str3);
            } else {
                A0k = AbstractC003100w.A0k(10, str6);
            }
            String str7 = c22m.A0S;
            if (str7 == null && (str7 = c22m.A0T) == null) {
                str7 = str4;
            }
            int i2 = 2;
            if (c22m.A01 != 2) {
                i2 = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i2));
            String str8 = c22m.A0L;
            if (str8 == null) {
                str8 = "";
            }
            A00.AAP("camera_session_id", str8);
            A00.A8R(C81U.A00.A00, "camera_destination");
            A00.AAk("camera_tools_struct", A0N(i));
            A00.A9K("capture_format_index", 0L);
            if (enumC193318hB == null) {
                enumC193318hB2 = A0I();
            }
            A00.A8R(enumC193318hB2, "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A9K("max_duration", Long.valueOf(j));
            A00.A8R(AnonymousClass249.VIDEO, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0J, "surface");
            UserSession userSession = super.A03;
            A00.AAk("applied_effect_ids", AbstractC449424y.A0D(str));
            A00.AAk("applied_effect_instance_ids", AbstractC449424y.A0D(str2));
            A00.AAk("camera_tools", A0O(null, null, null, false, false));
            A00.AAP("discovery_session_id", c22m.A0O);
            A00.AAP("search_session_id", c22m.A0P);
            if (str3 != null) {
                l = AbstractC003100w.A0k(10, str3);
            } else {
                l = null;
            }
            A00.A9K("pivot_page_seeded_media_id", l);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.A9K("media_id", A0k);
            A00.AAP("ranking_info_token", str7);
            A00.AAQ(AbstractC449424y.A07(super.A00, userSession), "system_info");
            EnumC203578zI A04 = AbstractC449424y.A04(str, str5);
            if (A04 != null) {
                list = Collections.singletonList(A04);
                C14360o3.A07(list);
            } else {
                list = C16930sl.A00;
            }
            A00.AAk("green_screen_source", list);
            A00.A8R(enumC223419tY, "action_entry_point");
            EnumC174597pt enumC174597pt = c22m.A06;
            if (enumC174597pt != null) {
                A00.A8R(enumC174597pt, "folding_state");
            }
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0012, code lost:
    
        if (r5.A03.A0E(17638868, r5.A00) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0e(boolean r7) {
        /*
            r6 = this;
            X.24w r5 = r6.A04
            java.lang.Object r4 = r5.A05
            monitor-enter(r4)
            r3 = 17638868(0x10d25d4, float:2.592475E-38)
            if (r7 == 0) goto L14
            X.24Q r2 = r5.A03     // Catch: java.lang.Throwable -> L20
            long r0 = r5.A00     // Catch: java.lang.Throwable -> L20
            boolean r0 = r2.A0E(r3, r0)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1e
        L14:
            X.24Q r2 = r5.A03     // Catch: java.lang.Throwable -> L20
            long r0 = r5.A00     // Catch: java.lang.Throwable -> L20
            long r0 = r2.A02(r3, r0)     // Catch: java.lang.Throwable -> L20
            r5.A00 = r0     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r4)
            return
        L20:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C449124v.A0e(boolean):void");
    }

    public C449124v(C24Q c24q, UserSession userSession, C22M c22m, String str, String str2, String str3) {
        super(userSession, c22m);
        this.A04 = new C449224w(c24q);
        this.A00 = str3;
        this.A01 = AbstractC449424y.A0D(str);
        this.A02 = AbstractC449424y.A0D(str2);
        this.A03 = AbstractC449424y.A0D(str3);
    }

    public static final long A00(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        if (mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            return 0L;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        Bitmap.Config config = options.outConfig;
        if (config != null) {
            int i = AbstractC62351S7w.A00[config.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return 8L;
                    }
                    return -1L;
                }
                return 16L;
            }
            return 32L;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.PpU, java.lang.Object] */
    public static final long A01(String str) {
        int i;
        C50719MaI A00;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        if (mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            if (str == null) {
                str = "";
            }
            try {
                A00 = C50719MaI.A00(new Object(), str);
            } catch (Exception e) {
                C0K8.A0F("MediaFormatUtil", "Exception while extracting video media format metadata:", e);
            }
            if (A00 != null) {
                i = A00.A04;
                return i;
            }
            i = 0;
            return i;
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.PpU, java.lang.Object] */
    public static final String A02(String str) {
        String obj;
        C50719MaI c50719MaI;
        String str2;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        boolean z = false;
        if (mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            z = true;
        }
        if (z) {
            if (str == null) {
                str = "";
            }
            obj = null;
            try {
                c50719MaI = C50719MaI.A00(new Object(), str);
            } catch (Exception e) {
                C0K8.A0F("MediaFormatUtil", "Exception while extracting video media format metadata:", e);
                c50719MaI = null;
            }
            if (c50719MaI != null) {
                int i = c50719MaI.A00;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                str2 = String.valueOf(i);
                            } else {
                                str2 = "RANGE_EXTENDED";
                            }
                        } else {
                            str2 = "RANGE_LIMITED";
                        }
                    } else {
                        str2 = "RANGE_FULL";
                    }
                } else {
                    str2 = "RANGE_UNSPECIFIED";
                }
                obj = AnonymousClass001.A11(str2, " ", AbstractC69825VwB.A00(c50719MaI.A01), " ", AbstractC69825VwB.A01(c50719MaI.A02));
            }
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            ColorSpace colorSpace = options.outColorSpace;
            if (colorSpace != null) {
                obj = colorSpace.toString();
            }
            return "";
        }
        if (obj == null) {
            return "";
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0ps, java.lang.Object] */
    public static final void A05(EnumC223419tY enumC223419tY, EnumC193318hB enumC193318hB, EnumC114925Hg enumC114925Hg, MediaUploadMetadata mediaUploadMetadata, C449124v c449124v, Boolean bool, Boolean bool2, Double d, Integer num, Integer num2, Long l, Long l2, String str, int i, int i2, int i3, long j, boolean z) {
        AnonymousClass249 anonymousClass249;
        C18920wW c18920wW;
        InterfaceC11380iw interfaceC11380iw;
        Double d2;
        EnumC114925Hg enumC114925Hg2 = enumC114925Hg;
        if (i == 1) {
            anonymousClass249 = AnonymousClass249.PHOTO;
        } else {
            anonymousClass249 = AnonymousClass249.VIDEO;
        }
        C22M c22m = ((C22F) c449124v).A04;
        c22m.A0A = anonymousClass249;
        if (z) {
            c18920wW = ((C22F) c449124v).A02;
        } else {
            c18920wW = ((C22F) c449124v).A01;
        }
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_camera_gallery_select_media"), 202);
        if (c449124v.A0P() && ((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            ArrayList A0N = c449124v.A0N(0);
            EnumC114925Hg A0J = c449124v.A0J();
            if (A0J == null) {
                A0J = EnumC114925Hg.NONE;
            }
            String str2 = mediaUploadMetadata.A01;
            ?? obj = new Object();
            if (str2 == null) {
                str2 = "";
            }
            c25531Mh.A0R("album_name", str2);
            String str3 = c22m.A0L;
            c25531Mh.A0R("camera_session_id", str3 != null ? str3 : "");
            if (enumC114925Hg == null) {
                enumC114925Hg2 = A0J;
            }
            c25531Mh.A0M(enumC114925Hg2, "camera_destination");
            c25531Mh.A0S("camera_tools", c449124v.A0O(null, null, null, false, false));
            c25531Mh.A0S("camera_tools_struct", A0N);
            c25531Mh.A0M(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            c25531Mh.A0Q("media_height", Long.valueOf(i3));
            c25531Mh.A0c(anonymousClass249);
            c25531Mh.A0Q("media_width", Long.valueOf(i2));
            if (z) {
                interfaceC11380iw = C22F.A09;
            } else {
                interfaceC11380iw = C22F.A08;
            }
            c25531Mh.A0m(interfaceC11380iw.getModuleName());
            c25531Mh.A0O("is_multi_select", bool);
            c25531Mh.A0O("is_timeline", Boolean.valueOf(z));
            UserSession userSession = ((C22F) c449124v).A03;
            c25531Mh.A0N(AbstractC449424y.A07(((C22F) c449124v).A00, userSession), "system_info");
            c25531Mh.A0M(enumC223419tY, "action_entry_point");
            c25531Mh.A0M(c22m.A0D, "template_browser_entry_point");
            c25531Mh.A0Q("clips_template_media_id", c22m.A0H);
            c25531Mh.A0R("template_browser_section", c22m.A0V);
            c25531Mh.A0O("is_drag_and_drop", bool2);
            if (j > 0) {
                d2 = Double.valueOf(j);
            } else {
                d2 = null;
            }
            c25531Mh.A0P("media_date", d2);
            c25531Mh.A0M(A0J, "bottom_camera_dial_selected");
            obj.A00 = c25531Mh;
            if (num2 != null && num != null) {
                c25531Mh.A0Q("original_media_height", Long.valueOf(num2.intValue()));
                c25531Mh.A0Q("original_media_width", Long.valueOf(num.intValue()));
            }
            if (l != null) {
                ((AbstractC02600Aj) obj.A00).A0Q(TraceFieldType.Bitrate, l);
            }
            if (d != null) {
                ((AbstractC02600Aj) obj.A00).A0P("segment_duration", d);
            }
            if (l2 != null) {
                ((AbstractC02600Aj) obj.A00).A0Q("max_duration", l2);
            }
            EnumC174597pt enumC174597pt = c22m.A06;
            if (enumC174597pt != null) {
                AbstractC02600Aj abstractC02600Aj = (AbstractC02600Aj) obj.A00;
                abstractC02600Aj.A0M(enumC174597pt, "folding_state");
                obj.A00 = abstractC02600Aj;
            }
            String str4 = mediaUploadMetadata.A09;
            if (str4 != null) {
                AbstractC02600Aj abstractC02600Aj2 = (AbstractC02600Aj) obj.A00;
                abstractC02600Aj2.A0R("upload_media_source", str4);
                obj.A00 = abstractC02600Aj2;
            }
            C25531Mh c25531Mh2 = (C25531Mh) obj.A00;
            c25531Mh2.A0M(c22m.A0C, "surface");
            c25531Mh2.A0R("composition_str_id", c22m.A0M);
            c25531Mh2.A0M(anonymousClass249, "composition_media_type");
            c25531Mh2.A0t(C1QM.A00.A02.A00);
            c25531Mh2.A0M(enumC193318hB, "capture_type");
            if (AbstractC199368rd.A00(userSession).booleanValue()) {
                C14120nc.A00().ATO(new V6V(c449124v, str, obj));
            } else {
                ((C0Ah) obj.A00).Cht();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        if (r90.isEmpty() != false) goto L48;
     */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0S(android.util.Pair r39, X.EnumC53342Nis r40, X.EnumC114925Hg r41, X.MYO r42, X.AnonymousClass249 r43, X.EnumC190198bd r44, X.EnumC53371NjM r45, X.EnumC50631MWs r46, X.C24H r47, X.EnumC53349Niz r48, X.C55U r49, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r50, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo r51, java.lang.Boolean r52, java.lang.Boolean r53, java.lang.Boolean r54, java.lang.Integer r55, java.lang.Integer r56, java.lang.Long r57, java.lang.Long r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.util.List r75, java.util.List r76, java.util.List r77, java.util.List r78, java.util.List r79, java.util.List r80, java.util.List r81, java.util.List r82, java.util.List r83, java.util.List r84, java.util.List r85, java.util.List r86, java.util.List r87, java.util.List r88, java.util.List r89, java.util.Map r90, int r91, int r92, int r93, int r94, int r95, boolean r96, boolean r97, boolean r98, boolean r99, boolean r100, boolean r101, boolean r102, boolean r103, boolean r104) {
        /*
            Method dump skipped, instructions count: 1485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C449124v.A0S(android.util.Pair, X.Nis, X.5Hg, X.MYO, X.249, X.8bd, X.NjM, X.MWs, X.24H, X.Niz, X.55U, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x018c, code lost:
    
        if (r105.isEmpty() != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0T(android.util.Pair r48, X.EnumC33503Erc r49, X.EnumC114925Hg r50, X.MYO r51, X.AnonymousClass249 r52, X.EnumC50631MWs r53, X.C24H r54, X.EnumC72420XdQ r55, X.EnumC53349Niz r56, com.instagram.api.schemas.ACRType r57, com.instagram.common.gallery.metadata.MediaUploadMetadata r58, X.C55U r59, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r60, com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig r61, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo r62, X.C3o9 r63, java.lang.Boolean r64, java.lang.Boolean r65, java.lang.Boolean r66, java.lang.Boolean r67, java.lang.Integer r68, java.lang.Integer r69, java.lang.Long r70, java.lang.Long r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.lang.String r87, java.util.List r88, java.util.List r89, java.util.List r90, java.util.List r91, java.util.List r92, java.util.List r93, java.util.List r94, java.util.List r95, java.util.List r96, java.util.List r97, java.util.List r98, java.util.List r99, java.util.List r100, java.util.List r101, java.util.List r102, java.util.List r103, java.util.List r104, java.util.Map r105, java.util.Map r106, int r107, int r108, int r109, int r110, int r111, int r112, boolean r113, boolean r114, boolean r115, boolean r116, boolean r117, boolean r118, boolean r119, boolean r120, boolean r121, boolean r122) {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C449124v.A0T(android.util.Pair, X.Erc, X.5Hg, X.MYO, X.249, X.MWs, X.24H, X.XdQ, X.Niz, com.instagram.api.schemas.ACRType, com.instagram.common.gallery.metadata.MediaUploadMetadata, X.55U, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo, X.3o9, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, java.util.Map, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void A0U(Pair pair, MYO myo, AnonymousClass249 anonymousClass249, EnumC190198bd enumC190198bd, EnumC53371NjM enumC53371NjM, EnumC50631MWs enumC50631MWs, C55U c55u, MediaTransformation mediaTransformation, GallerySuggestionsInfo gallerySuggestionsInfo, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, Map map, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        A0S(pair, null, null, myo, anonymousClass249, enumC190198bd, enumC53371NjM, enumC50631MWs, null, null, c55u, mediaTransformation, gallerySuggestionsInfo, bool, null, null, num, null, null, null, str, str2, str3, null, null, str4, null, null, str5, null, str6, str7, str8, null, null, str9, list, list2, list3, list4, list5, list6, list7, null, null, null, null, list8, null, null, null, map, i, i2, i3, i4, i5, z, z2, z3, false, false, false, z4, false, false);
    }

    public final void A0V(Pair pair, MYO myo, AnonymousClass249 anonymousClass249, EnumC50631MWs enumC50631MWs, MediaUploadMetadata mediaUploadMetadata, C55U c55u, Boolean bool, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, Map map, int i, int i2, boolean z) {
        A0T(pair, null, null, myo, anonymousClass249, enumC50631MWs, null, null, null, null, mediaUploadMetadata, c55u, null, null, null, null, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, str2, null, null, null, null, null, str3, list, list2, list3, list4, null, null, null, null, null, null, null, null, list5, null, null, null, null, map, null, 0, -1, i, 0, 0, i2, false, false, false, false, false, false, z, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r12.A0L() != false) goto L36;
     */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Z(X.EnumC193318hB r9, X.EnumC114925Hg r10, X.AnonymousClass249 r11, com.instagram.reels.prompt.model.PromptStickerModel r12, java.lang.String r13, java.util.List r14, java.util.List r15, java.util.List r16, java.util.List r17, java.util.List r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C449124v.A0Z(X.8hB, X.5Hg, X.249, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, boolean):void");
    }
}
