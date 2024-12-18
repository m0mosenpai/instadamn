package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.location.Location;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import com.instagram.creation.genai.magicmod.model.MagicModTopicInfo;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.effect.AREffect;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188598Wy {
    public Rect A00;
    public C194648jP A01;
    public final C1810981l A02;
    public final C81J A03;
    public final Activity A04;
    public final C1815283f A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C187198Rm A08;
    public final C8LZ A09;
    public final TargetViewSizeProvider A0A;
    public final C8HI A0B;
    public final AnonymousClass840 A0C;
    public final C8FR A0D;
    public final C8GE A0E;
    public final InterfaceC1810081c A0F;
    public final ClipsCreationViewModel A0G;
    public final AnonymousClass825 A0H;

    public final void A03(C183978Ee c183978Ee, boolean z) {
        Location location;
        int width;
        int height;
        int height2;
        int width2;
        int i;
        int i2;
        Rect rect;
        OpenCarouselCaptureConfig openCarouselCaptureConfig;
        C45123Jxs c45123Jxs;
        Double d;
        Double d2;
        Long l;
        Long l2;
        ArrayList arrayList;
        Long l3;
        Long l4;
        ArrayList A0B;
        Long l5;
        int i3;
        PromptStickerModel promptStickerModel;
        String str;
        long j;
        long j2;
        int i4 = c183978Ee.A08;
        if (i4 == 1) {
            List singletonList = Collections.singletonList(this.A05.A00().A05.A09);
            C14360o3.A07(singletonList);
            Double d3 = null;
            if (c183978Ee.A0O != null) {
                d = AbstractC200528tv.A00(r0.floatValue());
            } else {
                d = null;
            }
            if (c183978Ee.A0W != null) {
                d2 = AbstractC200528tv.A00(r0.longValue() / 1.0E9d);
                if (d2 != null) {
                    d3 = AbstractC200528tv.A00(-(Math.log(d2.doubleValue()) / AbstractC177667v0.A00));
                }
            } else {
                d2 = null;
            }
            if (c183978Ee.A0T != null) {
                C14360o3.A07(Collections.singletonList(Long.valueOf(r0.intValue())));
            }
            Integer num = c183978Ee.A0S;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                j2 = -1;
                            }
                        } else {
                            j2 = 2;
                        }
                    }
                    j2 = 1;
                } else {
                    j2 = 0;
                }
                l = Long.valueOf(j2);
            } else {
                l = null;
            }
            Integer num2 = c183978Ee.A0V;
            Boolean bool = c183978Ee.A0N;
            if (bool != null) {
                if (bool.booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                l2 = Long.valueOf(j);
            } else {
                l2 = null;
            }
            Integer num3 = c183978Ee.A0U;
            EnumC196938nO enumC196938nO = null;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                if (intValue2 != 0 && intValue2 != 1) {
                    if (intValue2 != 5) {
                        if (intValue2 == 17) {
                            enumC196938nO = EnumC196938nO.HDR;
                        }
                    } else {
                        enumC196938nO = EnumC196938nO.NIGHT;
                    }
                } else {
                    enumC196938nO = EnumC196938nO.AUTO;
                }
            }
            UserSession userSession = this.A07;
            C14360o3.A06(userSession);
            AnonymousClass249 anonymousClass249 = AnonymousClass249.PHOTO;
            C81J c81j = this.A03;
            String str2 = c81j.A2J;
            Integer valueOf = Integer.valueOf(c183978Ee.A00);
            C8FR c8fr = this.A0D;
            C1810981l c1810981l = this.A02;
            Integer A0A = c1810981l.A0A();
            List A0a = AbstractC001800i.A0a((Iterable) c1810981l.A09.A00);
            C55U c55u = (C55U) c1810981l.A08.A00;
            TargetViewSizeProvider targetViewSizeProvider = this.A0A;
            String moduleName = this.A06.getModuleName();
            C84B c84b = (C84B) this.A0G.A0G.A02();
            if (c84b != null) {
                arrayList = AbstractC449424y.A0C(c84b.A05());
            } else {
                arrayList = null;
            }
            C1816683y c1816683y = c81j.A12;
            if (c1816683y != null && (promptStickerModel = c1816683y.A01) != null && (str = promptStickerModel.A03) != null) {
                l3 = AbstractC003100w.A0k(10, str);
            } else {
                l3 = null;
            }
            C14360o3.A0B(c55u, 8);
            C14360o3.A0B(moduleName, 15);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : singletonList) {
                AREffect aREffect = (AREffect) obj;
                if (aREffect != null && aREffect.A0D()) {
                    arrayList6.add(obj);
                }
            }
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                CameraAREffect cameraAREffect = (CameraAREffect) it.next();
                if (cameraAREffect != null) {
                    String str3 = cameraAREffect.A0B;
                    if (str3 != null) {
                        arrayList5.add(str3);
                    }
                    String str4 = cameraAREffect.A0K;
                    C14360o3.A07(str4);
                    arrayList2.add(str4);
                    String str5 = cameraAREffect.A0M;
                    C14360o3.A0A(str5);
                    arrayList3.add(str5);
                    String str6 = cameraAREffect.A0K;
                    C14360o3.A07(str6);
                    Integer B0Z = c8fr.B0Z(str6);
                    if (B0Z != null) {
                        i3 = B0Z.intValue();
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    arrayList4.add(Integer.valueOf(i3));
                    if (B0Z == null) {
                        AbstractC12120kG.A07("CameraLoggerHelper", AnonymousClass001.A0R("Unable to find effect position for effect: ", cameraAREffect.A0K), null);
                    }
                }
            }
            C449124v c449124v = AnonymousClass229.A01(userSession).A0A;
            int A03 = AbstractC50677MYv.A03(valueOf);
            int A01 = AbstractC449424y.A01(A0A);
            EnumC50631MWs A08 = AbstractC50677MYv.A08(A0A, true);
            C14360o3.A0B(A08, 6);
            C22M c22m = ((C22F) c449124v).A04;
            c22m.A0A = anonymousClass249;
            boolean z2 = true;
            if (A01 != 2 && A03 == -1) {
                String format = String.format("logCameraCapture() cameraPosition is unknown: entryPoint=%s mediaType=%d, captureFormat=%d, cameraSurface=%d ", Arrays.copyOf(new Object[]{c22m.A09, 1L, Integer.valueOf(A01), Long.valueOf(A08.A00)}, 4));
                C14360o3.A07(format);
                AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", format, null);
            }
            if (!C449124v.A06(anonymousClass249, c55u, A0a)) {
                String format2 = String.format("logCameraCapture() mediaType is not valid: entryPoint=%s mediaType=%d, captureFormat=%d, cameraSurface=%d cameraPosition=%d", Arrays.copyOf(new Object[]{c22m.A09, 1L, Integer.valueOf(A01), Long.valueOf(A08.A00), Integer.valueOf(A03)}, 5));
                C14360o3.A07(format2);
                l4 = null;
                AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", format2, null);
            } else {
                l4 = null;
            }
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            if (!arrayList2.isEmpty() && arrayList2.size() == arrayList3.size()) {
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    String str7 = (String) AbstractC001800i.A0O(arrayList2, i5);
                    if (str7 != null) {
                        l5 = AbstractC003100w.A0k(10, str7);
                    } else {
                        l5 = l4;
                    }
                    String str8 = (String) AbstractC001800i.A0O(arrayList3, i5);
                    if (str8 != null) {
                        l4 = AbstractC003100w.A0k(10, str8);
                    }
                    if (l5 != null && l4 != null) {
                        arrayList7.add(l5);
                        arrayList8.add(l4);
                    }
                    i5++;
                    l4 = null;
                }
            }
            int i6 = 2;
            if (A03 != 2) {
                i6 = 1;
            }
            C18920wW c18920wW = ((C22F) c449124v).A01;
            C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_camera_capture"), 199);
            if (arrayList == null) {
                A0B = c449124v.A0N(0);
            } else {
                A0B = AbstractC449424y.A0B(arrayList);
            }
            String str9 = c22m.A0L;
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled() && str9 != null) {
                c25531Mh.A0S("applied_effect_ids", arrayList7);
                c25531Mh.A0S("applied_effect_instance_ids", arrayList8);
                c25531Mh.A0V(i6);
                c25531Mh.A0R("camera_session_id", str9);
                c25531Mh.A0S("camera_tools", c449124v.A0O(A0a, null, null, false, false));
                c25531Mh.A0S("camera_tools_struct", A0B);
                c25531Mh.A0Q("capture_format_index", 0L);
                c25531Mh.A0M(c449124v.A0I(), "capture_type");
                c25531Mh.A0M(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                c25531Mh.A0W(2);
                c25531Mh.A0c(anonymousClass249);
                c25531Mh.A0m(moduleName);
                c25531Mh.A0M(A08, "surface");
                c25531Mh.A0a(c55u.A00);
                c25531Mh.A0M(AbstractC190188bc.A00(targetViewSizeProvider), "nine_sixteen_layout_config");
                c25531Mh.A0Q("media_id", C22F.A0F(str2));
                c25531Mh.A0R("discovery_session_id", c22m.A0O);
                ((AbstractC02600Aj) c25531Mh).A00.A9M("effect_indices", C449124v.A04(arrayList2, arrayList4));
                c25531Mh.A0Q("audio_asset_id", null);
                c25531Mh.A0R("composition_str_id", c22m.A0M);
                c25531Mh.A0M(anonymousClass249, "composition_media_type");
                c25531Mh.A0S("preloaded_audio_asset_id", c449124v.A01);
                c25531Mh.A0S("preloaded_effect_id", c449124v.A02);
                c25531Mh.A0S("preloaded_media_id", c449124v.A03);
                c25531Mh.A0O("is_panavision", false);
                c25531Mh.A0t(C1QM.A00.A02.A00);
                c25531Mh.A0R("source_media_id", c449124v.A00);
                c25531Mh.A0N(AbstractC449424y.A07(((C22F) c449124v).A00, ((C22F) c449124v).A03), "system_info");
                c25531Mh.A0P("aperture", d);
                c25531Mh.A0P("exposure_time", d2);
                c25531Mh.A0P("shutter_speed", d3);
                c25531Mh.A0Q("flash_mode", l);
                if (num2 == null || num2.intValue() == 0) {
                    z2 = false;
                }
                c25531Mh.A0O("did_zoom", Boolean.valueOf(z2));
                c25531Mh.A0Q("flash_status", l2);
                c25531Mh.A0M(enumC196938nO, "scene_mode");
                EnumC174597pt enumC174597pt = c22m.A06;
                if (enumC174597pt != null) {
                    c25531Mh.A0M(enumC174597pt, "folding_state");
                }
                if (l3 != null) {
                    c25531Mh.A0Q(MSV.A00(1034), l3);
                }
                c25531Mh.Cht();
            }
        } else if (i4 == 0 && !(this.A02.A08.A00 instanceof C81V)) {
            UserSession userSession2 = this.A07;
            C14360o3.A06(userSession2);
            C449124v c449124v2 = AnonymousClass229.A01(userSession2).A0A;
            EnumC193318hB enumC193318hB = EnumC193318hB.A04;
            int i7 = c183978Ee.A09;
            int i8 = c183978Ee.A06;
            String A06 = c183978Ee.A06();
            Boolean valueOf2 = Boolean.valueOf(z);
            long j3 = c183978Ee.A0B;
            if (j3 <= 0) {
                j3 = c183978Ee.A0A;
            }
            c449124v2.A0W(null, enumC193318hB, false, valueOf2, null, null, null, A06, 1, i7, i8, j3 / 1000, false);
        }
        C22P c22p = this.A0H.A00;
        if (AbstractC189418aK.A02(c22p) && (c45123Jxs = C198278pc.A0A.A00().A02) != null) {
            String str10 = c183978Ee.A01().A03;
            if (str10 == null || str10.length() == 0) {
                c183978Ee.A01().A03 = c45123Jxs.A04;
                c183978Ee.A01().A04 = c45123Jxs.A05;
                c183978Ee.A0Z = c45123Jxs.A02;
            }
            String str11 = c45123Jxs.A04;
            if (str11 != null && (AbstractC001900j.A0a(str11, "com.facebook.stella", false) || AbstractC001900j.A0a(str11, "com.facebook.mwa.ai", false))) {
                c183978Ee.A08 = 110;
            }
        }
        InterfaceC1810081c interfaceC1810081c = this.A0F;
        UserSession userSession3 = this.A07;
        C14360o3.A06(userSession3);
        AbstractC197108nf.A00(interfaceC1810081c);
        C1811981v c1811981v = this.A02.A08;
        Object obj2 = c1811981v.A00;
        C128535rM c128535rM = C128535rM.A00;
        if (C14360o3.A0K(obj2, c128535rM) || ((openCarouselCaptureConfig = this.A03.A0b) != null && openCarouselCaptureConfig.A00 > 0.0f)) {
            if (this.A00 != null) {
                C8HI c8hi = this.A0B;
                C174757qB c174757qB = c8hi.A06;
                if (c174757qB != null) {
                    width = c174757qB.A0H.A00().getWidth();
                } else {
                    width = c8hi.A0T.getWidth();
                }
                C174757qB c174757qB2 = c8hi.A06;
                if (c174757qB2 != null) {
                    height = c174757qB2.A0H.A00().getHeight();
                } else {
                    height = c8hi.A0T.getHeight();
                }
                Rect A00 = c183978Ee.A00();
                if (A00 == null) {
                    if (z) {
                        int i9 = c183978Ee.A09;
                        int i10 = c183978Ee.A06;
                        rect = new Rect();
                        int min = Math.min(i9, i10);
                        if (min == i9) {
                            rect.left = 0;
                            int i11 = (i10 - min) / 2;
                            rect.top = i11;
                            rect.right = min;
                            rect.bottom = i11 + min;
                        } else {
                            int i12 = (i9 - min) / 2;
                            rect.left = i12;
                            rect.top = 0;
                            rect.right = i12 + min;
                            rect.bottom = min;
                        }
                    } else {
                        AbstractC12120kG.A07("QCC", "Feed photo flow has a null crop rectangle", null);
                    }
                } else {
                    int i13 = c183978Ee.A07;
                    if (i13 != 90 && i13 != 270) {
                        height2 = A00.width();
                    } else {
                        height2 = A00.height();
                    }
                    if (i13 != 90 && i13 != 270) {
                        width2 = A00.height();
                    } else {
                        width2 = A00.width();
                    }
                    double d4 = height2 / width;
                    double d5 = width2 / height;
                    if (i13 != 90 && i13 != 270) {
                        i = A00.left;
                    } else {
                        i = A00.top;
                    }
                    if (i13 != 90 && i13 != 270) {
                        i2 = A00.top;
                    } else {
                        i2 = A00.left;
                    }
                    double d6 = r0.top * d5;
                    double d7 = r0.left * d4;
                    rect = new Rect(C1H4.A00(d7) + i, C1H4.A00(d6) + i2, C1H4.A00(d7 + (r0.width() * d4) + i), C1H4.A00(d6 + (r0.height() * d5) + i2));
                    if (i13 == 90 || i13 == 270) {
                        rect.set(rect.top, rect.left, rect.bottom, rect.right);
                    }
                }
                c183978Ee.A03 = rect.left;
                c183978Ee.A05 = rect.top;
                c183978Ee.A04 = rect.right;
                c183978Ee.A02 = rect.bottom;
            }
            if (c1811981v.A00 == c128535rM) {
                C43846JaA c43846JaA = new C43846JaA(EnumC69983Ch.A02);
                C81J c81j2 = this.A03;
                c43846JaA.A04 = c81j2.A3O;
                c43846JaA.A00 = c81j2.A1N;
                MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(c43846JaA);
                Activity activity = this.A04;
                C14360o3.A06(activity);
                PendingRecipient pendingRecipient = this.A0C.A02.A01.A0j;
                Medium medium = c183978Ee.A0F;
                if (medium != null) {
                    location = new Location("photo");
                    ContentResolver contentResolver = activity.getContentResolver();
                    C14360o3.A07(contentResolver);
                    double[] A07 = medium.A07(contentResolver);
                    if (A07 != null) {
                        location.setLatitude(A07[0]);
                        location.setLatitude(A07[1]);
                    }
                } else {
                    location = null;
                }
                String A072 = c183978Ee.A07();
                Rect A002 = c183978Ee.A00();
                if (A002 == null) {
                    A002 = new Rect(0, 0, c183978Ee.A09, c183978Ee.A06);
                }
                CropInfo cropInfo = new CropInfo(A002, c183978Ee.A09, c183978Ee.A06);
                String A062 = c183978Ee.A06();
                boolean z3 = c183978Ee.A14;
                int i14 = c183978Ee.A07;
                C14360o3.A0B(A062, 2);
                LBU.A00(activity, location, null, c22p, new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), userSession3, cropInfo, null, mediaCaptureConfig, pendingRecipient, A062, A072, i14, 1, z3, false);
                return;
            }
        }
        interfaceC1810081c.E4u(new C187688Tl(this.A03.A0w, c183978Ee));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r1 == X.C81T.A00) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.C195868lW r9) {
        /*
            r8 = this;
            r3 = 0
            X.C14360o3.A0B(r9, r3)
            X.81l r0 = r8.A02
            X.81v r6 = r0.A08
            java.lang.Object r1 = r6.A00
            X.5rM r0 = X.C128535rM.A00
            r7 = 0
            if (r1 != r0) goto L10
            r7 = 1
        L10:
            X.9Kk r0 = X.C208509Kk.A00
            if (r1 == r0) goto L19
            X.81T r0 = X.C81T.A00
            r5 = 0
            if (r1 != r0) goto L1a
        L19:
            r5 = 1
        L1a:
            X.81J r4 = r8.A03
            boolean r0 = r4.A3L
            if (r0 == 0) goto L48
            if (r5 != 0) goto L48
            if (r7 != 0) goto L48
            X.0wb r2 = X.C18950wb.A01
            r1 = 817901047(0x30c02df7, float:1.3982903E-9)
            java.lang.String r0 = "CapturedMediaProcessor"
            X.0f5 r2 = r2.AEp(r0, r1)
            X.22P r0 = r4.A0B
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "entry_point"
            r2.ABW(r0, r1)
            java.lang.Object r0 = r6.A00
            X.55U r0 = (X.C55U) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "camera_destination"
            r2.ABW(r0, r1)
            r2.report()
        L48:
            boolean r0 = r4.A3L
            if (r0 == 0) goto L89
            if (r5 != 0) goto L89
            if (r7 != 0) goto L89
            java.lang.String r0 = r9.A0k
            X.Jdk r0 = X.C44059Jdk.A00(r0, r3)
            X.C14360o3.A07(r0)
            long r4 = r0.A03
            r1 = 15500(0x3c8c, double:7.658E-320)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L89
            r2 = 10
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 15000(0x3a98, float:2.102E-41)
            java.util.ArrayList r2 = X.AbstractC23035ADr.A01(r9, r2, r0, r1)
        L6b:
            X.8GE r0 = r8.A0E
            X.8ay r0 = r0.A00()
            r0.Cnt(r2)
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L91
            java.lang.Object r1 = X.AbstractC001800i.A0O(r2, r3)
            X.8lW r1 = (X.C195868lW) r1
            if (r1 == 0) goto L88
            X.8pg r0 = X.C198318pg.A00
            r8.A01(r0, r1, r3)
        L88:
            return
        L89:
            java.util.List r2 = java.util.Collections.singletonList(r9)
            X.C14360o3.A07(r2)
            goto L6b
        L91:
            java.lang.Integer r0 = X.C05F.A00
            r8.A05(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188598Wy.A04(X.8lW):void");
    }

    public final void A05(Integer num, List list) {
        C194648jP c194648jP = this.A01;
        if (c194648jP != null) {
            c194648jP.A01(false);
        }
        this.A0C.A02.A08(num);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C198308pf((C195868lW) it.next()));
        }
        C187198Rm c187198Rm = this.A08;
        c187198Rm.A0A(arrayList);
        c187198Rm.A0B(arrayList);
    }

    public final void A00(C198308pf c198308pf) {
        if (c198308pf.A05.ordinal() != 0) {
            C195868lW c195868lW = c198308pf.A03;
            if (c195868lW != null) {
                A01(C198318pg.A00, c195868lW, false);
                return;
            }
            return;
        }
        C183978Ee c183978Ee = c198308pf.A02;
        if (c183978Ee == null) {
            return;
        }
        A03(c183978Ee, false);
    }

    public final void A01(C8KC c8kc, C195868lW c195868lW, boolean z) {
        String str;
        ArrayList arrayList;
        Long l;
        int i;
        PromptStickerModel promptStickerModel;
        String str2;
        C14360o3.A0B(c8kc, 2);
        int i2 = c195868lW.A0F;
        if (i2 == 1) {
            List list = c195868lW.A0u;
            if (list == null) {
                list = Collections.singletonList(this.A05.A00().A05.A09);
                C14360o3.A07(list);
            }
            MusicOverlayStickerModel musicOverlayStickerModel = c195868lW.A0V;
            if (musicOverlayStickerModel != null) {
                str = musicOverlayStickerModel.A0S;
            } else {
                str = null;
            }
            UserSession userSession = this.A07;
            C14360o3.A06(userSession);
            AnonymousClass249 anonymousClass249 = AnonymousClass249.VIDEO;
            C81J c81j = this.A03;
            String str3 = c81j.A2J;
            Integer valueOf = Integer.valueOf(c195868lW.A01);
            C8FR c8fr = this.A0D;
            C1810981l c1810981l = this.A02;
            Integer A0A = c1810981l.A0A();
            ArrayList arrayList2 = new ArrayList((Collection) c1810981l.A09.A00);
            C55U c55u = (C55U) c1810981l.A08.A00;
            TargetViewSizeProvider targetViewSizeProvider = this.A0A;
            String moduleName = this.A06.getModuleName();
            C84B c84b = (C84B) this.A0G.A0F.A02();
            if (c84b != null) {
                arrayList = AbstractC449424y.A0C(c84b.A05());
            } else {
                arrayList = null;
            }
            C1816683y c1816683y = c81j.A12;
            if (c1816683y != null && (promptStickerModel = c1816683y.A01) != null && (str2 = promptStickerModel.A03) != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            C14360o3.A0B(list, 3);
            C14360o3.A0B(c55u, 8);
            C14360o3.A0B(moduleName, 15);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj : list) {
                AREffect aREffect = (AREffect) obj;
                if (aREffect != null && aREffect.A0D()) {
                    arrayList7.add(obj);
                }
            }
            Iterator it = arrayList7.iterator();
            while (it.hasNext()) {
                CameraAREffect cameraAREffect = (CameraAREffect) it.next();
                if (cameraAREffect != null) {
                    String str4 = cameraAREffect.A0B;
                    if (str4 != null) {
                        arrayList6.add(str4);
                    }
                    String str5 = cameraAREffect.A0K;
                    C14360o3.A07(str5);
                    arrayList3.add(str5);
                    String str6 = cameraAREffect.A0M;
                    C14360o3.A0A(str6);
                    arrayList4.add(str6);
                    String str7 = cameraAREffect.A0K;
                    C14360o3.A07(str7);
                    Integer B0Z = c8fr.B0Z(str7);
                    if (B0Z != null) {
                        i = B0Z.intValue();
                    } else {
                        i = Integer.MIN_VALUE;
                    }
                    arrayList5.add(Integer.valueOf(i));
                    if (B0Z == null) {
                        AbstractC12120kG.A07("CameraLoggerHelper", AnonymousClass001.A0R("Unable to find effect position for effect: ", cameraAREffect.A0K), null);
                    }
                }
            }
            AnonymousClass229.A01(userSession).A0A.A0b(anonymousClass249, AbstractC50677MYv.A08(A0A, true), c55u, targetViewSizeProvider, l, str3, str, moduleName, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList, AbstractC50677MYv.A03(valueOf), AbstractC449424y.A01(A0A));
        } else if (i2 == 0 && !(this.A02.A08.A00 instanceof C81V)) {
            UserSession userSession2 = this.A07;
            C14360o3.A06(userSession2);
            C449124v c449124v = AnonymousClass229.A01(userSession2).A0A;
            EnumC193318hB enumC193318hB = EnumC193318hB.A04;
            int i3 = c195868lW.A0K;
            int i4 = c195868lW.A08;
            Long valueOf2 = Long.valueOf(c195868lW.A00());
            String str8 = c195868lW.A0k;
            Double valueOf3 = Double.valueOf(c195868lW.A07 / 1000.0d);
            Boolean valueOf4 = Boolean.valueOf(z);
            long j = c195868lW.A0M;
            if (j <= 0) {
                j = c195868lW.A0L;
            }
            c449124v.A0W(null, enumC193318hB, false, valueOf4, valueOf3, valueOf2, null, str8, 2, i3, i4, j / 1000, false);
        }
        C22P c22p = this.A0H.A00;
        if (AbstractC189418aK.A02(c22p)) {
            C45123Jxs c45123Jxs = C198278pc.A0A.A00().A02;
            if (c45123Jxs != null) {
                String str9 = c195868lW.A02().A03;
                if (str9 == null || str9.length() == 0) {
                    c195868lW.A02().A03 = c45123Jxs.A04;
                    c195868lW.A02().A04 = c45123Jxs.A05;
                    c195868lW.A0e = c45123Jxs.A02;
                }
                String str10 = c45123Jxs.A04;
                if (str10 != null && AbstractC001900j.A0a(str10, "com.facebook.stella", false)) {
                    c195868lW.A0F = 110;
                }
            }
        } else if (c22p == C22P.A5I) {
            c195868lW.A02().A03 = C198278pc.A0A.A00().A06;
        }
        if (this.A02.A08.A00 == C128535rM.A00) {
            C43846JaA c43846JaA = new C43846JaA(EnumC69983Ch.A02);
            C81J c81j2 = this.A03;
            c43846JaA.A04 = c81j2.A3O;
            c43846JaA.A00 = c81j2.A1N;
            MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(c43846JaA);
            Activity activity = this.A04;
            C14360o3.A06(activity);
            UserSession userSession3 = this.A07;
            C14360o3.A06(userSession3);
            PendingRecipient pendingRecipient = this.A0C.A02.A01.A0j;
            if (AbstractC23048AEe.A01(new C44059Jdk(c195868lW.A0k, c195868lW.A01, c195868lW.A07, false), new C7FH(activity), true, true)) {
                List singletonList = Collections.singletonList(C8IU.A03(AMc.A00(C2Ps.A00(activity, userSession3), new File(c195868lW.A0k)), 3, 0));
                C14360o3.A07(singletonList);
                AbstractC86593tX.A0L(activity, c22p, userSession3, mediaCaptureConfig.A00, pendingRecipient, null, null, singletonList, mediaCaptureConfig.A04);
                return;
            }
            return;
        }
        InterfaceC1810081c interfaceC1810081c = this.A0F;
        interfaceC1810081c.E4u(new C187698Tm(c8kc, c195868lW));
        if (!(c8kc instanceof C199348rb)) {
            return;
        }
        interfaceC1810081c.E4u(new C8UN(EnumC222689s9.A03, false, false, false, null, false, false));
    }

    public final void A02(C8CS c8cs, C183978Ee c183978Ee) {
        StoryPromptType storyPromptType;
        FragmentActivity fragmentActivity;
        GenAIToolInfoDict genAIToolInfoDict;
        CameraTool cameraTool;
        String str;
        String str2;
        String str3;
        String str4;
        GenAIToolInfoDictIntf B9Z;
        this.A0F.E4u(new Object());
        C1122855d A00 = this.A09.A0M.A05(c183978Ee).A00();
        MagicModPostCaptureTransform magicModPostCaptureTransform = new MagicModPostCaptureTransform(A00.A02, A00.A03, A00.A01, A00.A04, A00.A05);
        C81J c81j = this.A03;
        PromptStickerModel promptStickerModel = c81j.A1h;
        if (promptStickerModel != null) {
            storyPromptType = promptStickerModel.A03();
        } else {
            storyPromptType = null;
        }
        boolean z = false;
        if (storyPromptType == StoryPromptType.A09) {
            z = true;
        }
        UserSession userSession = this.A07;
        C14360o3.A06(userSession);
        Activity activity = this.A04;
        if ((activity instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) activity) != null && (genAIToolInfoDict = c81j.A0I) != null && (cameraTool = genAIToolInfoDict.A00) != null) {
            boolean z2 = c81j.A3R;
            String str5 = genAIToolInfoDict.A03;
            if (str5 == null || z) {
                str5 = null;
            }
            Integer num = C05F.A00;
            TargetViewSizeProvider targetViewSizeProvider = this.A0A;
            if (promptStickerModel != null) {
                str = promptStickerModel.A00.getText();
            } else {
                str = null;
            }
            PromptStickerModel promptStickerModel2 = c81j.A1h;
            if (promptStickerModel2 != null && (B9Z = promptStickerModel2.A00.B9Z()) != null) {
                str2 = B9Z.Bid();
            } else {
                str2 = null;
            }
            PromptStickerModel promptStickerModel3 = c81j.A1h;
            if (promptStickerModel3 != null) {
                str3 = promptStickerModel3.A03;
            } else {
                str3 = null;
            }
            GenAIToolInfoDict genAIToolInfoDict2 = c81j.A0I;
            if (genAIToolInfoDict2 != null) {
                str4 = genAIToolInfoDict2.A02;
            } else {
                str4 = null;
            }
            MagicModTopicInfo magicModTopicInfo = new MagicModTopicInfo(str, str2, str3, str4, false);
            if (!z) {
                magicModTopicInfo = null;
            }
            CYJ.A01(fragmentActivity, cameraTool, userSession, new MagicModLaunchParams(targetViewSizeProvider, null, magicModPostCaptureTransform, magicModTopicInfo), c8cs, c183978Ee, num, str5, z2);
        }
    }

    public C188598Wy(C1815283f c1815283f, InterfaceC11380iw interfaceC11380iw, C1810981l c1810981l, C187198Rm c187198Rm, C8LZ c8lz, TargetViewSizeProvider targetViewSizeProvider, C8HI c8hi, AnonymousClass840 anonymousClass840, C81J c81j, C8FR c8fr, C8GE c8ge, InterfaceC1810081c interfaceC1810081c, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass825 anonymousClass825) {
        this.A03 = c81j;
        this.A06 = interfaceC11380iw;
        this.A05 = c1815283f;
        this.A0D = c8fr;
        this.A0B = c8hi;
        this.A02 = c1810981l;
        this.A0F = interfaceC1810081c;
        this.A0E = c8ge;
        this.A0H = anonymousClass825;
        this.A0C = anonymousClass840;
        this.A08 = c187198Rm;
        this.A0G = clipsCreationViewModel;
        this.A0A = targetViewSizeProvider;
        this.A09 = c8lz;
        this.A04 = c81j.A05;
        this.A07 = c81j.A0S;
    }
}
