package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioRecord;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: X.AhT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23874AhT implements InterfaceC58283Psb, C8I8, InterfaceC23471Cj {
    public C24239Ap6 A00;
    public ShutterButton A01;
    public C185458Kn A02;
    public C24239Ap6 A03;
    public final Activity A04;
    public final Context A05;
    public final UserSession A06;
    public final AK8 A07;
    public final ClipsCreationViewModel A08;
    public final C87H A09;
    public final InterfaceC16820sZ A0A;
    public final C187358Sd A0B;
    public final C49602Pt A0C;

    public C23874AhT(Activity activity, Context context, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, C87H c87h, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 3);
        this.A04 = activity;
        this.A05 = context;
        this.A06 = userSession;
        this.A09 = c87h;
        this.A08 = clipsCreationViewModel;
        this.A0B = c187358Sd;
        this.A0A = interfaceC16820sZ;
        C49602Pt A00 = C2Ps.A00(context, userSession);
        this.A0C = A00;
        this.A07 = new AK8(this, new C22894A7o(A00, str), AbstractC166987dD.A0H(interfaceC16820sZ.invoke()));
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58283Psb
    public final void AQM(float f) {
    }

    @Override // X.C8I8
    public final boolean COr() {
        return false;
    }

    @Override // X.InterfaceC58283Psb
    public final boolean CRk() {
        return true;
    }

    @Override // X.InterfaceC58283Psb
    public final boolean CRl() {
        return true;
    }

    @Override // X.C8I8
    public final void D1w(String str, String str2) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC58283Psb
    public final void DHV(float f, float f2) {
    }

    @Override // X.C8I8
    public final void Dzi(float f) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C23874AhT c23874AhT, Integer num) {
        C24239Ap6 c24239Ap6;
        String str;
        String str2;
        c23874AhT.A04.getWindow().clearFlags(128);
        C185458Kn c185458Kn = c23874AhT.A02;
        if (c185458Kn != null) {
            c185458Kn.A02.removeCallbacksAndMessages(null);
        }
        if (c23874AhT.A07.A05) {
            ShutterButton shutterButton = c23874AhT.A01;
            if (shutterButton == null) {
                return;
            }
            switch (num.intValue()) {
                case 0:
                    str2 = "stacked_timeline_voiceover_audio_recorder_error";
                    break;
                case 1:
                    str2 = "stacked_timeline_voiceover_video_pause";
                    break;
                case 2:
                    str2 = "stacked_timeline_voiceover_bottomsheet_cancel";
                    break;
                case 3:
                    str2 = "stacked_timeline_voiceover_bottomsheet_confirm";
                    break;
                case 4:
                    str2 = "stacked_timeline_voiceover_bottomsheet_dismissed";
                    break;
                case 5:
                    str2 = "stacked_timeline_voiceover_max_duration";
                    break;
                default:
                    str2 = "stacked_timeline_voiceover_fragment_on_pause";
                    break;
            }
            shutterButton.Dp4(str2);
            return;
        }
        if (num == C05F.A00) {
            c23874AhT.A09.A01();
            A01(c23874AhT, false);
        } else {
            if (num != C05F.A0C || (c24239Ap6 = c23874AhT.A03) == null || (str = c24239Ap6.A06) == null) {
                return;
            }
            c23874AhT.A08.A0h(str);
        }
    }

    public static final void A01(C23874AhT c23874AhT, boolean z) {
        C24239Ap6 c24239Ap6;
        String str;
        AK8 ak8 = c23874AhT.A07;
        if (!ak8.A05 && (c24239Ap6 = c23874AhT.A00) != null) {
            C187358Sd c187358Sd = c23874AhT.A0B;
            if (C14360o3.A0K(c187358Sd.A0E(), C219489mw.A00)) {
                c187358Sd.A0G(C52415NHl.A00);
            }
            ClipsCreationViewModel clipsCreationViewModel = c23874AhT.A08;
            ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
            clipsAudioStore.A0N.Egh(null);
            if (z && c24239Ap6.A00 > c24239Ap6.A01) {
                C24239Ap6 A00 = c24239Ap6.A00();
                C14360o3.A0C(A00, MSV.A00(529));
                A8H a8h = ak8.A04;
                if (a8h != null) {
                    str = a8h.A01;
                } else {
                    str = null;
                }
                A00.A06 = str;
                A00.A08 = false;
                clipsCreationViewModel.A0Q.A01(EnumC191648eM.A0k);
                List list = clipsAudioStore.A0C;
                list.add(A00);
                clipsAudioStore.A0S.Egh(C9O3.A00(list, ClipsAudioStore.A00(clipsAudioStore)));
                C22C A01 = AnonymousClass229.A01(c23874AhT.A06);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_clips_voiceover_segment_capture");
                if (A0f.isSampled()) {
                    AbstractC167007dF.A11(A0f, A01);
                    C22M c22m = ((C22F) A01).A04;
                    AbstractC166987dD.A1S(A0f, c22m.A0L);
                    AbstractC166997dE.A1N(A0f, "camera_position", AbstractC167017dG.A0I(c22m));
                    AbstractC167017dG.A1A(c22m.A09, A0f);
                    A0f.A8R(AnonymousClass249.VIDEO, "media_type");
                    A0f.AAP("module", C22F.A09.getModuleName());
                    A0f.A8R(EnumC50631MWs.A0I, "surface");
                    A0f.AAP("discovery_session_id", c22m.A0O);
                    AbstractC167017dG.A1C(A0f);
                }
            }
            c23874AhT.A03 = c23874AhT.A00;
            c23874AhT.A00 = null;
            C87H c87h = c23874AhT.A09;
            c87h.A05.A0B(false);
            c87h.A08.A0B(true);
            ShutterButton shutterButton = c23874AhT.A01;
            if (shutterButton != null) {
                shutterButton.setInnerCircleAlpha(1.0f);
            }
            ShutterButton shutterButton2 = c23874AhT.A01;
            if (shutterButton2 != null) {
                C131485wf c131485wf = shutterButton2.A0h;
                c131485wf.A0B.clear();
                c131485wf.A04 = 0;
                c131485wf.A03 = 0;
                shutterButton2.invalidate();
            }
            ShutterButton shutterButton3 = c23874AhT.A01;
            if (shutterButton3 != null) {
                shutterButton3.A0h.A03 = 0;
                shutterButton3.invalidate();
            }
            ShutterButton shutterButton4 = c23874AhT.A01;
            if (shutterButton4 != null) {
                shutterButton4.setEnabled(true);
            }
            ShutterButton shutterButton5 = c23874AhT.A01;
            if (shutterButton5 != null) {
                shutterButton5.setHandsFreeRecordingEnabled(true);
            }
            C185458Kn c185458Kn = c23874AhT.A02;
            if (c185458Kn != null) {
                c185458Kn.A02.removeCallbacksAndMessages(null);
                c185458Kn.A01 = 3;
                c185458Kn.A00 = 1000;
            }
        }
    }

    public final void A02(Exception exc) {
        A00(this, C05F.A00);
        C9GR.A0B(this.A05, "clips_stacked_timeline_voiceover_error");
        AbstractC167017dG.A1J(C18950wb.A01, "Stacked Timeline Voiceover Failure", exc, 613297770);
    }

    @Override // X.InterfaceC58283Psb
    public final void AJN() {
        A00(this, C05F.A0N);
    }

    @Override // X.InterfaceC58283Psb
    public final int B91() {
        return (int) this.A05.getResources().getDimension(R.dimen.avatar_sticker_max_height);
    }

    @Override // X.InterfaceC58283Psb
    public final List Ben() {
        return AbstractC166987dD.A1J(EnumC53256Ngu.A07);
    }

    @Override // X.InterfaceC58283Psb
    public final void D0G() {
        A00(this, C05F.A0Y);
        this.A03 = null;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        if (map == null || !map.containsKey("android.permission.RECORD_AUDIO") || map.get("android.permission.RECORD_AUDIO") == EnumC172127lh.A04) {
            A02(AbstractC166987dD.A14("Could not get record audio permission"));
        }
    }

    @Override // X.InterfaceC58283Psb
    public final void DhM() {
        this.A09.A01();
    }

    @Override // X.C8I8
    public final void DmC() {
        ShutterButton shutterButton = this.A01;
        if (shutterButton != null) {
            shutterButton.setHandsFreeRecordingEnabled(false);
        }
    }

    @Override // X.C8I8
    public final void DoG(String str) {
        ShutterButton shutterButton;
        C87J c87j = (C87J) this.A09.A0G.A02();
        if (c87j != null) {
            int CFM = c87j.CFM();
            int A0H = AbstractC166987dD.A0H(this.A0A.invoke()) - CFM;
            C24239Ap6 c24239Ap6 = new C24239Ap6();
            c24239Ap6.A01 = CFM;
            c24239Ap6.A00 = CFM;
            c24239Ap6.A06 = null;
            c24239Ap6.A05 = 0;
            c24239Ap6.A03 = CFM;
            c24239Ap6.A02 = CFM;
            this.A00 = c24239Ap6;
            ShutterButton shutterButton2 = this.A01;
            if (shutterButton2 != null) {
                shutterButton2.A08 = A0H;
                C131485wf c131485wf = shutterButton2.A0h;
                if (c131485wf != null) {
                    c131485wf.A01 = A0H;
                }
            }
            final AK8 ak8 = this.A07;
            ak8.A01 = A0H;
            try {
                if (!ak8.A05) {
                    ak8.A06 = false;
                    ak8.A04 = new A8H(ak8.A08);
                    try {
                        int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
                        ak8.A00 = minBufferSize;
                        if (minBufferSize != -2) {
                            AudioRecord audioRecord = new AudioRecord(1, 44100, 16, 2, minBufferSize);
                            ak8.A02 = audioRecord;
                            if (audioRecord.getState() != 0) {
                                AudioRecord audioRecord2 = ak8.A02;
                                if (audioRecord2 != null) {
                                    audioRecord2.startRecording();
                                }
                                ak8.A05 = true;
                                CountDownTimer countDownTimer = ak8.A03;
                                if (countDownTimer != null) {
                                    countDownTimer.cancel();
                                }
                                long j = ak8.A01;
                                CountDownTimerC50749MbE countDownTimerC50749MbE = new CountDownTimerC50749MbE(ak8, j, 1, j);
                                ak8.A03 = countDownTimerC50749MbE;
                                countDownTimerC50749MbE.start();
                                C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9iV
                                    {
                                        super(1907234631, 3, false, false);
                                    }

                                    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
                                    
                                        if (r13 <= r14) goto L77;
                                     */
                                    /* JADX WARN: Not initialized variable reg: 10, insn: 0x015c: IGET (r0 I:X.AK8) = (r10 I:X.9iV) (LINE:348) X.9iV.A00 X.AK8, block:B:78:0x015c */
                                    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0165: IGET (r0 I:X.AK8) = (r10 I:X.9iV) (LINE:357) X.9iV.A00 X.AK8, block:B:74:0x0165 */
                                    /* JADX WARN: Type inference failed for: r10v0, types: [X.9iV] */
                                    /* JADX WARN: Type inference failed for: r10v1, types: [X.9iV] */
                                    @Override // java.lang.Runnable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void run() {
                                        /*
                                            Method dump skipped, instructions count: 370
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C216749iV.run():void");
                                    }
                                });
                            } else {
                                throw AbstractC166987dD.A14("Could not prepare audio recording");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Could not get min buffer size in audio recording");
                        }
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        ak8.A07.A02(e);
                    }
                }
            } catch (IllegalStateException e2) {
                ak8.A07.A02(e2);
            }
            if (ak8.A05 && (shutterButton = this.A01) != null) {
                shutterButton.A03(C05F.A00);
            }
        }
    }

    @Override // X.C8I8
    public final void DoI(boolean z) {
        int i;
        C24239Ap6 c24239Ap6 = this.A00;
        if (c24239Ap6 != null) {
            this.A0B.A0G(C219489mw.A00);
            A8H a8h = this.A07.A04;
            if (a8h != null) {
                String str = a8h.A01;
                c24239Ap6.A06 = str;
                File A11 = AbstractC166987dD.A11(str);
                File parentFile = A11.getParentFile();
                if (parentFile != null && parentFile.isDirectory()) {
                    i = parentFile.listFiles().length + (!A11.exists() ? 1 : 0);
                } else {
                    i = -1;
                }
                c24239Ap6.A04 = i;
                c24239Ap6.A08 = true;
            }
            C87H c87h = this.A09;
            c87h.A05.A0B(AbstractC166997dE.A0b());
            c87h.A03();
            c87h.A08.A0B(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r7.equals("stacked_timeline_voiceover_audio_recorder_error") != false) goto L8;
     */
    @Override // X.C8I8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dp3(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "stacked_timeline_voiceover_bottomsheet_cancel"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L19
            java.lang.String r0 = "stacked_timeline_voiceover_fragment_on_pause"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L19
            java.lang.String r0 = "stacked_timeline_voiceover_audio_recorder_error"
            boolean r0 = r7.equals(r0)
            r4 = 0
            if (r0 == 0) goto L1a
        L19:
            r4 = 1
        L1a:
            X.AK8 r2 = r5.A07
            r2.A06 = r4     // Catch: java.lang.IllegalStateException -> L3a
            r0 = 0
            r2.A05 = r0     // Catch: java.lang.IllegalStateException -> L3a
            android.media.AudioRecord r0 = r2.A02     // Catch: java.lang.IllegalStateException -> L3a
            if (r0 == 0) goto L28
            r0.stop()     // Catch: java.lang.IllegalStateException -> L3a
        L28:
            android.media.AudioRecord r0 = r2.A02     // Catch: java.lang.IllegalStateException -> L3a
            if (r0 == 0) goto L2f
            r0.release()     // Catch: java.lang.IllegalStateException -> L3a
        L2f:
            r0 = 0
            r2.A02 = r0     // Catch: java.lang.IllegalStateException -> L3a
            android.os.CountDownTimer r0 = r2.A03     // Catch: java.lang.IllegalStateException -> L3a
            if (r0 == 0) goto L40
            r0.cancel()     // Catch: java.lang.IllegalStateException -> L3a
            goto L40
        L3a:
            r1 = move-exception
            X.AhT r0 = r2.A07
            r0.A02(r1)
        L40:
            r3 = 0
            if (r4 == 0) goto L4c
            X.87H r0 = r5.A09
            r0.A01()
            A01(r5, r3)
        L4b:
            return
        L4c:
            X.Ap6 r2 = r5.A00
            if (r2 == 0) goto L4b
            X.87H r1 = r5.A09
            r1.A01()
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r5.A01
            if (r0 == 0) goto L5c
            r0.setEnabled(r3)
        L5c:
            X.2GS r0 = r1.A0G
            java.lang.Object r0 = r0.A02()
            X.87J r0 = (X.C87J) r0
            if (r0 == 0) goto L7f
            int r6 = r0.CFM()
        L6a:
            X.0sZ r0 = r5.A0A
            java.lang.Object r0 = r0.invoke()
            int r0 = X.AbstractC166987dD.A0H(r0)
            if (r6 <= r0) goto L77
            r6 = r0
        L77:
            r2.A00 = r6
            r2.A02 = r6
            r1.A06(r6)
            return
        L7f:
            int r0 = r2.A01
            int r6 = r6 + r0
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23874AhT.Dp3(int, java.lang.String):void");
    }

    @Override // X.InterfaceC58283Psb
    public final void cancel() {
        A00(this, C05F.A0C);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        A00(this, C05F.A0u);
    }

    @Override // X.InterfaceC58283Psb
    public final void COD(ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        this.A03 = null;
        this.A00 = null;
        Context context = this.A05;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_stacked_timeline_bottom_sheet_voiceover, viewGroup, true);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4));
        this.A01 = (ShutterButton) inflate.findViewById(R.id.stacked_timeline_voiceover_shutter_button);
        this.A02 = new C185458Kn(new C24170Ant(this), new C24172Anv(this), 3, 1000);
        ShutterButton shutterButton = this.A01;
        if (shutterButton != null) {
            shutterButton.setShutterButtonRecordingStyle(new C208609Ku(context, 1.0f));
        }
        ShutterButton shutterButton2 = this.A01;
        if (shutterButton2 != null) {
            shutterButton2.setHandsFreeRecordingEnabled(true);
            shutterButton2.setEnabled(true);
        }
        ShutterButton shutterButton3 = this.A01;
        if (shutterButton3 != null) {
            shutterButton3.setOnRecordVideoListener(this);
            shutterButton3.setOnSingleTapCaptureListener(new C24169Ans(this, 4));
        }
        AbstractC13880nE.A0W(viewGroup, -2);
        AbstractC13880nE.A0W(AbstractC124845kp.A01(viewGroup), -2);
    }
}
