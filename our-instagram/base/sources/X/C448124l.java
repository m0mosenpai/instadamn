package X;

import java.util.List;

/* renamed from: X.24l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C448124l extends C22F {
    public final void A0S(EnumC193318hB enumC193318hB, EnumC114925Hg enumC114925Hg, C22P c22p, MYO myo, AnonymousClass249 anonymousClass249, EnumC50631MWs enumC50631MWs, Integer num, String str) {
        long j;
        C14360o3.A0B(str, 0);
        C25531Mh A08 = C25531Mh.A08(this.A01);
        if (enumC50631MWs == null) {
            enumC50631MWs = this.A04.A0C;
        }
        if (((AbstractC02600Aj) A08).A00.isSampled() && A0J() != null && enumC50631MWs != null) {
            A08.A0s("IG_CAMERA_VIDEO_COVER_PHOTO_FRAME_SELECTED");
            A08.A0q("VIDEO_COVER_PHOTO_FRAME_SELECTED");
            A00(A08, this);
            if (enumC114925Hg == null) {
                enumC114925Hg = A0J();
            }
            A08.A0a(enumC114925Hg);
            if (c22p == null) {
                c22p = this.A04.A09;
            }
            A08.A0b(c22p);
            A08.A0T();
            A08.A0M(enumC50631MWs, "surface");
            if (anonymousClass249 == null) {
                anonymousClass249 = this.A04.A0A;
            }
            A08.A0c(anonymousClass249);
            if (myo == null) {
                myo = MYO.CAPTURE;
            }
            A08.A0M(myo, "media_source");
            A08.A0m(C22F.A08.getModuleName());
            A08.A0Q("media_id", AbstractC003100w.A0k(10, str));
            if (enumC193318hB == null) {
                enumC193318hB = A0I();
            }
            A08.A0M(enumC193318hB, "capture_type");
            if (num != null) {
                j = num.intValue();
            } else {
                j = 0;
            }
            A08.A0Q("frame_index", Long.valueOf(j));
            A08.A0O("is_recommended_frame", false);
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
    }

    public static final void A00(C25531Mh c25531Mh, C448124l c448124l) {
        String str = c448124l.A04.A0L;
        if (str == null) {
            str = "";
        }
        c25531Mh.A0R("camera_session_id", str);
    }

    public final void A0R(EnumC46263Kdv enumC46263Kdv, AnonymousClass249 anonymousClass249, EnumC203578zI enumC203578zI, EnumC50631MWs enumC50631MWs, C81X c81x, Boolean bool, Long l, Long l2, String str, String str2, String str3, List list, boolean z, boolean z2) {
        C18920wW c18920wW;
        InterfaceC11380iw interfaceC11380iw;
        if (z) {
            c18920wW = this.A02;
        } else {
            c18920wW = this.A01;
        }
        C25531Mh A08 = C25531Mh.A08(c18920wW);
        if (((AbstractC02600Aj) A08).A00.isSampled() && enumC50631MWs != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q(str);
            A00(A08, this);
            A08.A0a(A0J());
            C22M c22m = this.A04;
            A08.A0b(c22m.A09);
            A08.A0W(2);
            A08.A0M(enumC50631MWs, "surface");
            A08.A0M(enumC203578zI, "surface_element");
            if (z) {
                interfaceC11380iw = C22F.A09;
            } else {
                interfaceC11380iw = C22F.A08;
            }
            A08.A0m(interfaceC11380iw.getModuleName());
            A08.A0c(anonymousClass249);
            A08.A0M(c81x, "camera_tool");
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(anonymousClass249, "composition_media_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0P("speed_value", null);
            A08.A0P("audio_enhance_value", null);
            A08.A0O("is_panavision", Boolean.valueOf(z2));
            A08.A0R("user_behavior", str2);
            A08.A0O("is_timeline", Boolean.valueOf(z));
            A08.A0Q("number_of_audio_track_clips", l);
            A08.A0O("contains_mix", bool);
            A08.A0S("audio_asset_ids", list);
            A08.A0Q("media_id", l2);
            A08.A0M(enumC46263Kdv, "audio_editor_entry_point");
            A08.A0R("search_session_id", str3);
            A08.Cht();
        }
    }

    public final void A0T(String str, String str2) {
        C25531Mh A08 = C25531Mh.A08(this.A01);
        EnumC114925Hg A0J = A0J();
        if (((AbstractC02600Aj) A08).A00.isSampled() && A0J != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q(str);
            A00(A08, this);
            A08.A0a(A0J);
            C22M c22m = this.A04;
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0U();
            A08.A0m(C22F.A08.getModuleName());
            A08.A0R("sticker_tray_session_id", c22m.A0U);
            A08.A0c(c22m.A0A);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0R("sticker_id", str2);
            A08.Cht();
        }
    }
}
