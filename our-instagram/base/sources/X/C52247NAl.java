package X;

import android.graphics.Bitmap;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.video.common.camera.IgLiveCameraCapturer$CameraCloseRequestedException;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.NAl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52247NAl extends AbstractC70118W4q {
    public final int A00;
    public final Object A01;

    public static Object A00(C52247NAl c52247NAl, Object obj) {
        C14360o3.A0B(obj, 0);
        return c52247NAl.A01;
    }

    public C52247NAl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC70118W4q
    public final void A03(Exception exc) {
        switch (this.A00) {
            case 0:
                IgLiveWithGuestFragment igLiveWithGuestFragment = (IgLiveWithGuestFragment) A00(this, exc);
                String str = "liveWithGuestWaterfall";
                C56804PIv c56804PIv = igLiveWithGuestFragment.A05;
                if (c56804PIv != null) {
                    InterfaceC174767qC interfaceC174767qC = igLiveWithGuestFragment.A00;
                    if (interfaceC174767qC == null) {
                        str = "cameraDeviceController";
                    } else {
                        c56804PIv.A02 = MSX.A0Y(interfaceC174767qC.CR9() ? 1 : 0);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
            default:
                super.A03(exc);
                return;
            case 2:
                C53021Nct c53021Nct = ((PJC) A00(this, exc)).A0X;
                C14360o3.A0B("switchCamera", 1);
                C52029N0d c52029N0d = new C52029N0d("switchCamera", null, exc);
                C56805PIw c56805PIw = c53021Nct.A0a;
                int i = c52029N0d.errorCode;
                String str2 = c52029N0d.domain;
                if (str2 == null) {
                    str2 = "";
                }
                c56805PIw.A0D(i, str2, c52029N0d.reason, c52029N0d.description, c52029N0d.fullDescription);
                return;
            case 3:
                C53021Nct c53021Nct2 = (C53021Nct) A00(this, exc);
                AbstractC55102ObF.A0C(c53021Nct2, exc);
                C53021Nct.A08(c53021Nct2);
                return;
            case 4:
                C14360o3.A0B(exc, 0);
                C53021Nct c53021Nct3 = (C53021Nct) this.A01;
                String A06 = AbstractC13670mt.A06(AnonymousClass001.A0L("Exception in openCamera(paused=", ')', c53021Nct3.A0O), new Object[0]);
                AbstractC55102ObF.A0C(c53021Nct3, exc);
                C56805PIw c56805PIw2 = c53021Nct3.A0a;
                c56805PIw2.A0I("open camera error", exc);
                if (exc instanceof IgLiveCameraCapturer$CameraCloseRequestedException) {
                    String A0m = AbstractC50522MSa.A0m(exc);
                    C14360o3.A07(A0m);
                    LiveStreamingError liveStreamingError = new LiveStreamingError("openCamera", A0m, exc, S1U.A00(exc), false);
                    int i2 = liveStreamingError.errorCode;
                    String str3 = liveStreamingError.domain;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = liveStreamingError.reason;
                    String str5 = liveStreamingError.description;
                    String str6 = liveStreamingError.fullDescription;
                    C14360o3.A0B(str4, 2);
                    if (!c56805PIw2.A0r) {
                        return;
                    }
                    C25531Mh A04 = C56805PIw.A04(c56805PIw2, C05F.A06);
                    AbstractC55113ObX.A03(A04, str3, str4, str5, str6, i2);
                    A04.Cht();
                    return;
                }
                AbstractC55102ObF.A0B(BroadcastFailureType.A02, c53021Nct3, "openCamera", A06, exc);
                return;
            case 5:
                AbstractC55102ObF.A0C((C53021Nct) A00(this, exc), exc);
                return;
            case 6:
                C53020Ncs c53020Ncs = (C53020Ncs) A00(this, exc);
                c53020Ncs.A0K.A0B("endBroadcastSession", "mCurrentStreamingSession.release failed", exc.toString(), true);
                return;
            case 7:
                C14360o3.A0B(exc, 0);
                C53020Ncs c53020Ncs2 = (C53020Ncs) this.A01;
                String A062 = AbstractC13670mt.A06(AnonymousClass001.A0L("Exception in openCamera(paused=", ')', c53020Ncs2.A0F), new Object[0]);
                C0w9.A06("IgLiveWithGuestStreamingController", A062, exc);
                C56804PIv c56804PIv2 = c53020Ncs2.A0K;
                c56804PIv2.A0C("open camera error", exc);
                if (exc instanceof IgLiveCameraCapturer$CameraCloseRequestedException) {
                    c56804PIv2.A0B("openCamera", A062, exc.getMessage(), false);
                    return;
                } else {
                    C53020Ncs.A01(BroadcastFailureType.A02, c53020Ncs2, "openCamera", A062);
                    return;
                }
            case 8:
                C53020Ncs c53020Ncs3 = (C53020Ncs) A00(this, exc);
                BroadcastFailureType broadcastFailureType = BroadcastFailureType.A03;
                String message = exc.getMessage();
                if (message == null) {
                    message = "null_message";
                }
                C53020Ncs.A01(broadcastFailureType, c53020Ncs3, "ApiStartBroadcast", message);
                return;
        }
    }

    @Override // X.AbstractC70118W4q
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        switch (this.A00) {
            case 0:
                ODP odp = (ODP) obj;
                IgLiveWithGuestFragment igLiveWithGuestFragment = (IgLiveWithGuestFragment) A00(this, odp);
                String str = "liveWithGuestWaterfall";
                C56804PIv c56804PIv = igLiveWithGuestFragment.A05;
                if (c56804PIv != null) {
                    c56804PIv.A08(MSX.A0Y(odp.A04 ? 1 : 0));
                    C56804PIv c56804PIv2 = igLiveWithGuestFragment.A05;
                    if (c56804PIv2 != null) {
                        InterfaceC174767qC interfaceC174767qC = igLiveWithGuestFragment.A00;
                        if (interfaceC174767qC == null) {
                            str = "cameraDeviceController";
                        } else {
                            c56804PIv2.A02 = MSX.A0Y(interfaceC174767qC.CR9() ? 1 : 0);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) A00(this, obj);
                C57157PZb.A01(obj, abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 3);
                return;
            case 2:
                ODP odp2 = (ODP) obj;
                C53021Nct c53021Nct = ((PJC) A00(this, odp2)).A0X;
                boolean z = odp2.A04;
                C56805PIw c56805PIw = c53021Nct.A0a;
                c56805PIw.A07 = MSX.A0Y(z ? 1 : 0);
                AbstractC23021Ah.A00(((AbstractC55102ObF) c53021Nct).A07).A1c(z);
                Integer A0Y = MSX.A0Y(z ? 1 : 0);
                c56805PIw.A0f.incrementAndGet();
                OQU.A01(C56805PIw.A02(c56805PIw, C05F.A0L), A0Y);
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("{'width': ");
                A1C.append(odp2.A01);
                A1C.append(", 'height': ");
                A1C.append(odp2.A00);
                A1C.append(", 'front':'");
                A1C.append(z);
                c56805PIw.A0H("switchCamera", AbstractC166997dE.A0x("'}", A1C));
                C53021Nct.A05(odp2, c53021Nct);
                return;
            case 3:
                Bitmap bitmap = (Bitmap) obj;
                C53021Nct c53021Nct2 = (C53021Nct) A00(this, bitmap);
                c53021Nct2.A06 = bitmap;
                C53021Nct.A08(c53021Nct2);
                return;
            case 4:
                ODP odp3 = (ODP) obj;
                C53021Nct c53021Nct3 = (C53021Nct) A00(this, odp3);
                C56805PIw c56805PIw2 = c53021Nct3.A0a;
                c56805PIw2.A0F("open camera");
                C53021Nct.A05(odp3, c53021Nct3);
                c56805PIw2.A07 = MSX.A0Y(odp3.A04 ? 1 : 0);
                return;
            case 5:
                Bitmap bitmap2 = (Bitmap) obj;
                ((C53021Nct) A00(this, bitmap2)).A07 = bitmap2;
                return;
            case 6:
                C11T.A02(new RunnableC56952POt((C53020Ncs) this.A01));
                return;
            case 7:
                ODP odp4 = (ODP) obj;
                C14360o3.A0B(odp4, 0);
                int i = odp4.A01;
                int i2 = odp4.A00;
                C53020Ncs c53020Ncs = (C53020Ncs) this.A01;
                C56804PIv c56804PIv3 = c53020Ncs.A0K;
                c56804PIv3.A0A("open camera", "");
                C73314Y4c c73314Y4c = ((AbstractC55102ObF) c53020Ncs).A09;
                c73314Y4c.A09.obtainMessage(2, odp4.A03, odp4.A02, null).sendToTarget();
                ((C54817OKs) AbstractC54266Nym.A00(((AbstractC55102ObF) c53020Ncs).A07, EnumC142806cg.A04).A07.getValue()).A01(MSY.A0D(Integer.valueOf(i), i2), null, null);
                c56804PIv3.A02 = MSX.A0Y(odp4.A04 ? 1 : 0);
                return;
            default:
                return;
        }
    }
}
