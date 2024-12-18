package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.google.common.collect.ImmutableList;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;

/* loaded from: classes9.dex */
public final class NHM extends C8JF implements C88N {
    public C88O A00;
    public boolean A01;
    public final UserSession A02;
    public final C88O A03;
    public final C54458O4m A04;
    public final String A05;
    public final InterfaceC11380iw A06;
    public final C88L A07;
    public final C8FW A08;
    public final boolean A09;

    public NHM(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C88L c88l, C8FI c8fi, C54458O4m c54458O4m, String str, boolean z) {
        super(context, c8fi);
        this.A02 = userSession;
        this.A04 = c54458O4m;
        this.A06 = interfaceC11380iw;
        this.A07 = c88l;
        this.A05 = str;
        C88O c88o = new C88O(context, userSession, "FaceEffectAdapter");
        this.A03 = c88o;
        this.A00 = c88o;
        this.A08 = new C8FW(context, userSession, new C56263OyA(context), str, z);
        this.A09 = "video_call".equals(str);
    }

    @Override // X.C88N
    public final void DD9(C88X c88x, int i) {
        N75 A00;
        String url;
        if ("video_call".equals(this.A05)) {
            UserSession userSession = this.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317543375574375L) && C18U.A06(c06090Tz, userSession, 36317543375312229L)) {
                AbstractC50523MSb.A0f();
            }
        }
        if (super.A00 != i) {
            this.A01 = true;
        }
        C54458O4m c54458O4m = this.A04;
        if (c54458O4m != null) {
            C52692NTd c52692NTd = c54458O4m.A00;
            if (!c88x.A0N) {
                boolean z = false;
                if (C14360o3.A0K(c88x.A00(), c52692NTd.A03.A06) && !c52692NTd.A06) {
                    C88Z c88z = c88x.A04;
                    if (c88z == null) {
                        c88z = C88Z.A0G;
                    }
                    if (c88z == C88Z.A04) {
                        CameraAREffect A002 = c88x.A00();
                        if (A002 != null) {
                            C88Z c88z2 = c88x.A04;
                            if (c88z2 == null) {
                                c88z2 = C88Z.A0G;
                            }
                            if (c88z2 == C88Z.A08) {
                                z = true;
                            }
                            OCB ocb = c52692NTd.A0M;
                            EffectAttribution effectAttribution = c52692NTd.A03.A02;
                            boolean z2 = c52692NTd.A08;
                            String str = A002.A0C;
                            if (str == null) {
                                A00 = null;
                            } else {
                                EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration(A002, str);
                                effectInfoAttributionConfiguration.A01 = EffectInfoBottomSheetMode.NORMAL;
                                effectInfoAttributionConfiguration.A0B = AbstractC31174DnI.A1b(z);
                                effectInfoAttributionConfiguration.A00 = effectAttribution;
                                ImageUrl imageUrl = A002.A05;
                                if (imageUrl != null && (url = imageUrl.getUrl()) != null) {
                                    effectInfoAttributionConfiguration.A07 = url;
                                }
                                EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
                                effectInfoBottomSheetConfiguration.A02 = ImmutableList.of((Object) effectInfoAttributionConfiguration);
                                effectInfoBottomSheetConfiguration.A00 = 9;
                                effectInfoBottomSheetConfiguration.A01 = C22P.A5X;
                                effectInfoBottomSheetConfiguration.A06 = false;
                                effectInfoBottomSheetConfiguration.A04 = z2;
                                A00 = AbstractC55031OXo.A00(EnumC50631MWs.A0N, ocb.A02, null, effectInfoBottomSheetConfiguration, new C56260Oy7(ocb), z2);
                            }
                            C189448aO A003 = ocb.A03.A00(C57427PeP.A00, 1.0f, 1.0f, true, false, true);
                            A003.A05(ocb.A01, R.dimen.clips_audio_browser_audiomixing_height);
                            A003.A0Z = true;
                            C189478aR A004 = A003.A00();
                            if (A00 != null) {
                                c52692NTd.A0H.A05(new C56657PDb(A00, A004, true, true));
                            }
                        }
                        c52692NTd.A01 = c88x;
                    }
                }
                C88Z c88z3 = c88x.A04;
                if (c88z3 == null) {
                    c88z3 = C88Z.A0G;
                }
                if (c88z3 == C88Z.A07) {
                    if (c52692NTd.A03.A09 == C05F.A01) {
                        c52692NTd.A0H.A05(PEI.A00);
                    }
                    c52692NTd.A0H.A03(new C56705PEx(c88x, null, false));
                } else {
                    CameraAREffect A005 = c88x.A00();
                    if (A005 != null && A005.A0N()) {
                        InterfaceC09390do interfaceC09390do = c52692NTd.A0b;
                        if (!((OI7) interfaceC09390do.getValue()).A01.getBoolean("rtc_multipeer_effect_permission_dialog_shown", false)) {
                            c52692NTd.A0H.A05(new PDV(((OI7) interfaceC09390do.getValue()).A00(new C57250PbY(c52692NTd, i, 0)), C05F.A15));
                            return;
                        }
                    }
                }
                c52692NTd.A01 = c88x;
            }
        }
        A04(null, true, true, i);
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C88O c88o = this.A00;
        C177327uS c177327uS = ((C51235MkK) c3oo).A00;
        Object obj = super.A02.get(i);
        C14360o3.A07(obj);
        C88X c88x = (C88X) obj;
        InterfaceC11380iw interfaceC11380iw = this.A06;
        int i2 = super.A00;
        boolean z = this.A09;
        C8FW c8fw = this.A08;
        AbstractC167007dF.A1K(c177327uS, c88x);
        c88o.A01(c88x, interfaceC11380iw, c8fw, this, c177327uS, i, i2, false, false, z, false);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51235MkK(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.effect_tile, false), this.A07);
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(-248015377, C0f9.A03(1694954692));
        return 0;
    }
}
