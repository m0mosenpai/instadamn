package X;

import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ahw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23903Ahw implements InterfaceC25189BCm {
    public final /* synthetic */ C8TT A00;

    public C23903Ahw(C8TT c8tt) {
        this.A00 = c8tt;
    }

    @Override // X.InterfaceC25189BCm
    public final void Cz2(AGv aGv, C183978Ee c183978Ee) {
        Double d;
        Double d2;
        Long l;
        Long l2;
        ArrayList arrayList;
        Long l3;
        ArrayList A0B;
        Long l4;
        long j;
        long j2;
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
        C8TT c8tt = this.A00;
        C449124v c449124v = AnonymousClass229.A01(c8tt.A09).A0A;
        AnonymousClass249 anonymousClass249 = AnonymousClass249.PHOTO;
        C1810981l c1810981l = c8tt.A0B;
        ArrayList A1F = AbstractC166987dD.A1F((Collection) c1810981l.A09.A00);
        C55U A02 = C1810981l.A02(c1810981l);
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A06;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        TargetViewSizeProvider targetViewSizeProvider = c8tt.A0K;
        String moduleName = c8tt.A0G.getModuleName();
        C84B c84b = (C84B) c8tt.A0b.A0G.A02();
        if (c84b != null) {
            arrayList = AbstractC449424y.A0C(c84b.A05());
        } else {
            arrayList = null;
        }
        C14360o3.A0B(A02, 5);
        C22M c22m = ((C22F) c449124v).A04;
        c22m.A0A = anonymousClass249;
        boolean z = true;
        if (!C449124v.A06(anonymousClass249, A02, A1F)) {
            l3 = null;
            AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", AbstractC166997dE.A0z("logCameraCapture() mediaType is not valid: entryPoint=%s mediaType=%d, captureFormat=%d, cameraSurface=%d cameraPosition=%d", Arrays.copyOf(new Object[]{c22m.A09, 1L, 2, 4L, -1}, 5)), null);
        } else {
            l3 = null;
        }
        ArrayList A1E4 = AbstractC166987dD.A1E();
        ArrayList A1E5 = AbstractC166987dD.A1E();
        if (!A1E.isEmpty() && A1E.size() == A1E2.size()) {
            int size = A1E.size();
            int i = 0;
            while (i < size) {
                String str = (String) AbstractC001800i.A0O(A1E, i);
                if (str != null) {
                    l4 = AbstractC166997dE.A0j(str);
                } else {
                    l4 = null;
                }
                String str2 = (String) AbstractC001800i.A0O(A1E2, i);
                if (str2 != null) {
                    l3 = AbstractC166997dE.A0j(str2);
                }
                if (l4 != null && l3 != null) {
                    A1E4.add(l4);
                    A1E5.add(l3);
                }
                i++;
                l3 = null;
            }
        }
        C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(((C22F) c449124v).A01, "ig_camera_capture"), 199);
        if (arrayList == null) {
            A0B = c449124v.A0N(0);
        } else {
            A0B = AbstractC449424y.A0B(arrayList);
        }
        String str3 = c22m.A0L;
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled() && str3 != null) {
            c25531Mh.A0S("applied_effect_ids", A1E4);
            c25531Mh.A0S("applied_effect_instance_ids", A1E5);
            c25531Mh.A0V(1);
            c25531Mh.A0R("camera_session_id", str3);
            c25531Mh.A0S("camera_tools", c449124v.A0O(A1F, null, null, false, false));
            c25531Mh.A0S("camera_tools_struct", A0B);
            c25531Mh.A0Q("capture_format_index", AbstractC167007dF.A0d());
            c25531Mh.A0M(c449124v.A0I(), "capture_type");
            c25531Mh.A0M(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            c25531Mh.A0W(2);
            c25531Mh.A0c(anonymousClass249);
            c25531Mh.A0m(moduleName);
            c25531Mh.A0M(enumC50631MWs, "surface");
            c25531Mh.A0a(A02.A00);
            c25531Mh.A0M(AbstractC190188bc.A00(targetViewSizeProvider), "nine_sixteen_layout_config");
            c25531Mh.A0Q("media_id", null);
            c25531Mh.A0R("discovery_session_id", c22m.A0O);
            ((AbstractC02600Aj) c25531Mh).A00.A9M("effect_indices", C449124v.A04(A1E, A1E3));
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
                z = false;
            }
            c25531Mh.A0O("did_zoom", Boolean.valueOf(z));
            c25531Mh.A0Q("flash_status", l2);
            c25531Mh.A0M(enumC196938nO, "scene_mode");
            EnumC174597pt enumC174597pt = c22m.A06;
            if (enumC174597pt != null) {
                c25531Mh.A0M(enumC174597pt, "folding_state");
            }
            c25531Mh.Cht();
        }
        c8tt.A0S.A00().Cns(c183978Ee);
        c8tt.A0M.A02.A08(C05F.A00);
        ((C1809981b) c8tt.A0Z).A02.A04(new C188498Wo(C198318pg.A00, AbstractC166987dD.A1J(new C198308pf(c183978Ee)), AbstractC166987dD.A1J(aGv.A01())));
    }

    @Override // X.InterfaceC25189BCm
    public final void Cz4(AGv aGv, C195868lW c195868lW) {
        C8TT c8tt = this.A00;
        c8tt.A0M.A02.A08(C05F.A00);
        List A1J = AbstractC166987dD.A1J(new C198308pf(c195868lW));
        InterfaceC1810081c interfaceC1810081c = c8tt.A0Z;
        ((C1809981b) interfaceC1810081c).A02.A04(new C188498Wo(C198318pg.A00, A1J, AbstractC166987dD.A1J(aGv.A01())));
    }
}
