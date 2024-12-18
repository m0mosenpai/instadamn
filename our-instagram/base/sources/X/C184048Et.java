package X;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.pendingmedia.model.ClipInfo;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8Et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184048Et implements InterfaceC184058Eu, C8BD {
    public C185948Mo A00;
    public C185948Mo A01;
    public InterfaceC143326dX A02;
    public ClipInfo A03;
    public C195868lW A04;
    public boolean A05;
    public boolean A06;
    public final Fragment A07;
    public final UserSession A08;
    public final InterfaceC184088Ex A09;
    public final String A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC1810081c A0D;
    public final InterfaceC1810781j A0E;

    public C184048Et(ViewStub viewStub, Fragment fragment, UserSession userSession, InterfaceC143326dX interfaceC143326dX, InterfaceC1810081c interfaceC1810081c, String str) {
        C14360o3.A0B(fragment, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(viewStub, 4);
        this.A07 = fragment;
        this.A08 = userSession;
        this.A0D = interfaceC1810081c;
        this.A0A = str;
        this.A02 = interfaceC143326dX;
        this.A0C = AbstractC09440dt.A01(new C9E4(viewStub, 18));
        this.A0B = AbstractC09440dt.A01(new C9E4(this, 17));
        InterfaceC1810781j interfaceC1810781j = new InterfaceC1810781j() { // from class: X.8Ev
            @Override // X.InterfaceC1810781j
            public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
                String str2;
                InterfaceC02590Ai A00;
                ClipInfo clipInfo;
                EnumC1810181d enumC1810181d = EnumC1810181d.A1R;
                if (obj2 == enumC1810181d) {
                    C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.event.QuickCaptureEvent.LongVideoImportedFromGallery");
                    C184048Et c184048Et = C184048Et.this;
                    if (c184048Et.A05) {
                        Object value = c184048Et.A0B.getValue();
                        C14360o3.A07(value);
                        AbstractC13880nE.A0q((View) value, new RunnableC24385ArS(c184048Et));
                        C185948Mo c185948Mo = c184048Et.A00;
                        if (c185948Mo == null) {
                            str2 = "delegate";
                        } else {
                            C47Z c47z = c185948Mo.A0D;
                            if (c47z != null && (clipInfo = c47z.A1N) != null) {
                                c185948Mo.A0M(clipInfo.A07, clipInfo.A05);
                                C185948Mo.A0A(c185948Mo, clipInfo.A07);
                            }
                            c184048Et.A02.DWb(c184048Et);
                            C22C A01 = AnonymousClass229.A01(c184048Et.A08);
                            C195868lW c195868lW = c184048Et.A04;
                            str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
                            if (c195868lW != null) {
                                double d = c195868lW.A07;
                                double d2 = c195868lW.A0H;
                                double d3 = c195868lW.A06;
                                String str3 = c184048Et.A0A;
                                C448524p c448524p = A01.A0D;
                                C18920wW c18920wW = c448524p.A01;
                                A00 = c18920wW.A00(c18920wW.A00, "ig_camera_start_session");
                                if (A00.isSampled()) {
                                    A00.AAP("legacy_falco_event_name", "IG_CAMERA_START_TRIM_SESSION");
                                    A00.AAP("entity", "TRIM");
                                    C22M c22m = c448524p.A04;
                                    String str4 = c22m.A0L;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    A00.AAP("camera_session_id", str4);
                                    A00.A8R(C208509Kk.A00.A00, "camera_destination");
                                    A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                                    A00.A8p("event_type", 2);
                                    A00.AAP("module", str3);
                                    A00.AAP("session_start_reason", "manual");
                                    A00.A8I("orignal_length", Double.valueOf(d));
                                    A00.A8I("amount_trimmed_from_start", Double.valueOf(d2));
                                    A00.A8I("amount_trimmed_from_end", Double.valueOf(d3));
                                    A00.AAP("composition_str_id", c22m.A0M);
                                    A00.A8R(c22m.A0A, "composition_media_type");
                                    A00.A8R(c22m.A0C, "surface");
                                    A00.AAk("camera_tools_struct", c448524p.A0N(0));
                                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                                    A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                                    A00.AAP("device_fold_state", AbstractC82683mW.A00);
                                    A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                                    A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                                    A00.Cht();
                                    return;
                                }
                                return;
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    return;
                }
                if (obj == enumC1810181d) {
                    C184048Et c184048Et2 = C184048Et.this;
                    if (c184048Et2.A05) {
                        c184048Et2.A02.D5W(c184048Et2);
                        C22C A012 = AnonymousClass229.A01(c184048Et2.A08);
                        C195868lW c195868lW2 = c184048Et2.A04;
                        str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
                        if (c195868lW2 != null) {
                            double d4 = c195868lW2.A07;
                            double d5 = c195868lW2.A0J;
                            double d6 = c195868lW2.A0I;
                            String str5 = c184048Et2.A0A;
                            C448024k c448024k = A012.A07;
                            C18920wW c18920wW2 = c448024k.A01;
                            A00 = c18920wW2.A00(c18920wW2.A00, "ig_camera_end_session");
                            if (A00.isSampled()) {
                                A00.AAP("entity", "TRIM");
                                A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_TRIM_SESSION");
                                C22M c22m2 = c448024k.A04;
                                String str6 = c22m2.A0L;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                A00.AAP("camera_session_id", str6);
                                A00.A8R(C208509Kk.A00.A00, "camera_destination");
                                A00.A8R(c22m2.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                                A00.A8p("event_type", 2);
                                A00.AAP("module", str5);
                                A00.AAP("session_exit_reason", "done");
                                A00.A8I("orignal_length", Double.valueOf(d4));
                                A00.A8I("amount_trimmed_from_start", Double.valueOf(d5));
                                A00.A8I("amount_trimmed_from_end", Double.valueOf(d6));
                                A00.AAP("composition_str_id", c22m2.A0M);
                                A00.A8R(c22m2.A0A, "composition_media_type");
                                A00.A8R(c22m2.A0C, "surface");
                                A00.AAk("camera_tools_struct", c448024k.A0N(0));
                                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                                A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                                A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                                A00.AAP("device_fold_state", AbstractC82683mW.A00);
                                A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                                A00.Cht();
                                return;
                            }
                            return;
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                }
            }
        };
        this.A0E = interfaceC1810781j;
        this.A09 = new InterfaceC184088Ex() { // from class: X.8Ew
            @Override // X.InterfaceC184088Ex
            public final void Djy(int i) {
            }

            @Override // X.InterfaceC184088Ex
            public final void DOq(int i) {
                ClipInfo clipInfo;
                C184048Et c184048Et = C184048Et.this;
                C195868lW c195868lW = c184048Et.A04;
                String str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
                if (c195868lW != null) {
                    c195868lW.A0J = i;
                    c195868lW.A1G = true;
                    C185948Mo c185948Mo = c184048Et.A00;
                    if (c185948Mo == null) {
                        str2 = "delegate";
                    } else {
                        C47Z c47z = c185948Mo.A0D;
                        if (c47z != null && (clipInfo = c47z.A1N) != null) {
                            clipInfo.A07 = i;
                            return;
                        }
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }

            @Override // X.InterfaceC184088Ex
            public final void DhS(int i) {
                ClipInfo clipInfo;
                C184048Et c184048Et = C184048Et.this;
                C195868lW c195868lW = c184048Et.A04;
                String str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
                if (c195868lW != null) {
                    c195868lW.A0I = i;
                    c195868lW.A1G = true;
                    C185948Mo c185948Mo = c184048Et.A00;
                    if (c185948Mo == null) {
                        str2 = "delegate";
                    } else {
                        C47Z c47z = c185948Mo.A0D;
                        if (c47z != null && (clipInfo = c47z.A1N) != null) {
                            clipInfo.A05 = i;
                            return;
                        }
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }

            @Override // X.InterfaceC184088Ex
            public final void DuJ(boolean z) {
                ClipInfo clipInfo;
                C184048Et c184048Et = C184048Et.this;
                c184048Et.A06 = false;
                C185948Mo c185948Mo = c184048Et.A00;
                if (c185948Mo == null) {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
                c185948Mo.A0J = false;
                C47Z c47z = c185948Mo.A0D;
                if (c47z != null && (clipInfo = c47z.A1N) != null) {
                    c185948Mo.A0M(clipInfo.A07, clipInfo.A05);
                    C185948Mo.A0A(c185948Mo, clipInfo.A07);
                }
            }

            @Override // X.InterfaceC184088Ex
            public final void DuL(boolean z) {
                C184048Et c184048Et = C184048Et.this;
                c184048Et.A06 = true;
                C185948Mo c185948Mo = c184048Et.A00;
                if (c185948Mo == null) {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
                c185948Mo.A0J = true;
                C9KJ c9kj = c185948Mo.A0B;
                if (c9kj != null) {
                    c9kj.A09(false);
                }
            }
        };
        interfaceC1810081c.A82(interfaceC1810781j);
    }

    @Override // X.InterfaceC184058Eu
    public final void DzQ(int i) {
        if (!this.A06) {
            Object value = this.A0B.getValue();
            C14360o3.A07(value);
            ((ClipsTrimFilmstrip) value).setSeekPosition(i);
        }
    }

    @Override // X.C8BD
    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }
}
