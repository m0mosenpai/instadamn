package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OKE {
    public final /* synthetic */ C56284Oyv A00;

    public final void A00(O2A o2a, String str, float f) {
        ArrayList A0i;
        C09530e4 c09530e4;
        C87H c87h;
        Float valueOf;
        List A1J;
        C09530e4 c09530e42;
        C14360o3.A0B(o2a, 1);
        C56284Oyv c56284Oyv = this.A00;
        C187358Sd c187358Sd = c56284Oyv.A09;
        if (c187358Sd.A0E() instanceof C8TB) {
            if (o2a instanceof NIH) {
                ArrayList A1E = AbstractC166987dD.A1E();
                float A00 = AbstractC54867OOc.A00(f);
                C56284Oyv.A04(c56284Oyv, A1E, A00);
                if (AbstractC25226BEj.A1b(A1E)) {
                    c56284Oyv.A0A.A0B(A1E);
                }
                int i = 0;
                boolean A1O = AbstractC167007dF.A1O((A00 > 0.0f ? 1 : (A00 == 0.0f ? 0 : -1)));
                C51141Mik c51141Mik = c56284Oyv.A02;
                if (c51141Mik != null) {
                    for (Object obj : c51141Mik.A00) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C51631MrO c51631MrO = (C51631MrO) obj;
                        if ((c51631MrO.A03 instanceof NIK) && A1O != c51631MrO.A01) {
                            if (!A1O) {
                                c51631MrO.A00 = 0.0f;
                            }
                            c51631MrO.A01 = A1O;
                            C51141Mik c51141Mik2 = c56284Oyv.A02;
                            if (c51141Mik2 != null) {
                                c51141Mik2.notifyItemChanged(i);
                            }
                        }
                        i = i2;
                    }
                    AbstractC187378Sf A0E = c187358Sd.A0E();
                    C14360o3.A0C(A0E, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.edit.api.model.TimelineState.VolumeControls");
                    C8TB c8tb = (C8TB) A0E;
                    c187358Sd.A0G(new C8TB(c8tb.A01, c8tb.A03, c8tb.A02, c8tb.A00, AbstractC167007dF.A1N((A00 > 0.0f ? 1 : (A00 == 0.0f ? 0 : -1)))));
                    return;
                }
                C14360o3.A0F("volumeSliderAdapter");
                throw C00O.createAndThrow();
            }
            if (o2a.equals(NIL.A00)) {
                float A002 = AbstractC54867OOc.A00(f);
                List A1A = MSW.A1A(c56284Oyv.A08.A0K.A0S);
                A0i = AbstractC167007dF.A0i(A1A);
                Iterator it = A1A.iterator();
                while (it.hasNext()) {
                    String str2 = ((C24239Ap6) it.next()).A06;
                    if (str2 != null) {
                        c09530e42 = AbstractC166987dD.A1L(str2, Float.valueOf(A002));
                    } else {
                        c09530e42 = null;
                    }
                    A0i.add(c09530e42);
                }
            } else {
                if (o2a instanceof NIG) {
                    if (str != null) {
                        c87h = c56284Oyv.A0A;
                        valueOf = Float.valueOf(AbstractC54867OOc.A00(f));
                    } else {
                        c56284Oyv.A07.A01.A0F(AbstractC54867OOc.A00(f));
                        return;
                    }
                } else if (o2a.equals(NII.A00)) {
                    c87h = c56284Oyv.A0A;
                    valueOf = Float.valueOf(AbstractC54867OOc.A00(f));
                    str = "sound_effects";
                } else if (o2a.equals(NIJ.A00)) {
                    float A003 = AbstractC54867OOc.A00(f);
                    List A1B = MSW.A1B(c56284Oyv.A08.A0K.A0h);
                    A0i = AbstractC167007dF.A0i(A1B);
                    Iterator it2 = A1B.iterator();
                    while (it2.hasNext()) {
                        String A004 = ((C9ZW) it2.next()).A00();
                        if (A004 != null) {
                            c09530e4 = AbstractC166987dD.A1L(A004, Float.valueOf(A003));
                        } else {
                            c09530e4 = null;
                        }
                        A0i.add(c09530e4);
                    }
                } else {
                    if (o2a.equals(NIK.A00)) {
                        c56284Oyv.A06.A01(f);
                        return;
                    }
                    throw B4Z.A00();
                }
                A1J = AbstractC166987dD.A1J(AbstractC166987dD.A1L(str, valueOf));
                c87h.A0B(A1J);
            }
            c87h = c56284Oyv.A0A;
            A1J = AbstractC001800i.A0X(A0i);
            c87h.A0B(A1J);
        }
    }

    public final void A01(O2A o2a, String str, String str2, String str3, float f) {
        String str4;
        Long l;
        String str5;
        C14360o3.A0B(o2a, 1);
        if (o2a instanceof NIG) {
            double d = f;
            C448724r c448724r = AnonymousClass229.A01(this.A00.A05).A0F;
            InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
            if (A0M.isSampled()) {
                MSW.A1N(C81X.A1g, A0M);
                MSW.A1V(A0M, "IG_CAMERA_CLIPS_AUDIO_BROWSER_VOLUME_CHANGE");
                C22M c22m = c448724r.A04;
                AbstractC166987dD.A1S(A0M, MSX.A0f(c22m));
                AbstractC167017dG.A1A(c22m.A09, A0M);
                MSX.A1C(A0M);
                AbstractC167007dF.A11(A0M, c448724r);
                AbstractC167017dG.A1B(A0M);
                A0M.A8I("volume_value", Double.valueOf(d));
                MSW.A1O(AnonymousClass249.VIDEO, A0M);
                AbstractC167017dG.A1C(A0M);
            }
            str4 = AbstractC111324zv.A00(742);
        } else if (o2a instanceof NIH) {
            C56284Oyv c56284Oyv = this.A00;
            C22C A01 = AnonymousClass229.A01(c56284Oyv.A05);
            double d2 = f;
            Integer A012 = C56284Oyv.A01(c56284Oyv);
            if (A012 != null) {
                l = AbstractC25229BEm.A0n(A012);
            } else {
                l = null;
            }
            C448124l c448124l = A01.A09;
            C25531Mh A0G = MSW.A0G(c448124l);
            if (AbstractC25226BEj.A1Z(A0G)) {
                A0G.A0s("IG_CAMERA_CLIPS_AUDIO_VIDEO_VOLUME_CHANGE");
                A0G.A0q("CLIPS_AUDIO_VIDEO_VOLUME_CHANGE");
                C448124l.A00(A0G, c448124l);
                AbstractC167007dF.A14(A0G, c448124l.A04);
                A0G.A0U();
                MSY.A19(A0G, c448124l);
                AbstractC167007dF.A13(A0G);
                A0G.A0P("volume_value", Double.valueOf(d2));
                A0G.A0Q("segment_index", l);
                A0G.A0c(AnonymousClass249.VIDEO);
                AbstractC167017dG.A1D(A0G);
            }
            str4 = "camera_audio";
        } else if (o2a.equals(NII.A00)) {
            AnonymousClass229.A01(this.A00.A05).A1R(EnumC50631MWs.A0I, "AUDIO_CONTROLS_SOUND_EFFECTS_VOLUME");
            str4 = "sound_effects";
        } else if (o2a.equals(NIL.A00)) {
            str4 = "voice_over";
        } else if (o2a.equals(NIJ.A00)) {
            str4 = "video_sticker";
        } else if (o2a.equals(NIK.A00)) {
            str4 = "voice_enhancement";
        } else {
            throw B4Z.A00();
        }
        C447024a c447024a = AnonymousClass229.A01(this.A00.A05).A02;
        AbstractC167027dH.A10(c447024a);
        StringBuilder A11 = AbstractC166997dE.A11("user_post_capture_volume_slider_adjusting_finished_");
        if (f < 0.01f) {
            A11.append(str4);
            str5 = "_zero";
        } else {
            A11.append(str4);
            str5 = "_nonzero";
        }
        C447024a.A01(c447024a, AbstractC166997dE.A0x(str5, A11), str, str2, str3, null, null, null, null, null);
    }

    public OKE(C56284Oyv c56284Oyv) {
        this.A00 = c56284Oyv;
    }
}
