package X;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewStub;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.mediastreaming.client.livestreaming.tslog.LiveStreamingTsLogServiceProviderHolder;
import com.facebook.mediastreaming.client.livestreaming.tslog.pipeline_perf.BatteryMonitor;
import com.facebook.mediastreaming.opt.mediastreamingtimer.MediaStreamingTimerProviderHolder;
import com.facebook.mediastreaming.opt.stalldetector.StallDetectorServiceProviderHolder;
import com.facebook.mediastreaming.opt.timestampchecker.TimestampCheckerServiceProviderHolder;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;

/* renamed from: X.Pg4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57530Pg4 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57530Pg4(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C57530Pg4 A00(Object obj, Object obj2, int i) {
        return new C57530Pg4(i, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.PlK, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession;
        AbstractC59962oe abstractC59962oe;
        Context requireContext;
        EnumC142806cg enumC142806cg;
        String str;
        C07N c07n;
        Object invoke;
        switch (this.A00) {
            case 0:
                UserSession userSession2 = (UserSession) this.A02;
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                return new C52300NCp(abstractC59962oe2.requireContext(), abstractC59962oe2, userSession2);
            case 2:
                UserSession userSession3 = ((C54980OTo) this.A02).A01;
                AbstractC59962oe abstractC59962oe3 = (AbstractC59962oe) this.A01;
                return new C52301NCq(abstractC59962oe3.requireContext(), abstractC59962oe3, userSession3);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new NCE((AbstractC59962oe) this.A01, (UserSession) this.A02);
            case 16:
                C52833NZq c52833NZq = (C52833NZq) this.A02;
                UserSession userSession4 = c52833NZq.A03;
                AbstractC59962oe abstractC59962oe4 = c52833NZq.A02;
                return new NDJ(abstractC59962oe4.requireContext(), abstractC59962oe4, userSession4, (EnumC142806cg) this.A01);
            case 31:
                userSession = (UserSession) this.A02;
                abstractC59962oe = (AbstractC59962oe) this.A01;
                requireContext = abstractC59962oe.requireContext();
                enumC142806cg = EnumC142806cg.A04;
                return new NDL(requireContext, abstractC59962oe, userSession, enumC142806cg);
            case 33:
                userSession = (UserSession) this.A02;
                abstractC59962oe = (AbstractC59962oe) this.A01;
                requireContext = abstractC59962oe.requireContext();
                enumC142806cg = EnumC142806cg.A03;
                return new NDL(requireContext, abstractC59962oe, userSession, enumC142806cg);
            case 36:
                View view = (View) this.A01;
                C56256Oy3 c56256Oy3 = (C56256Oy3) this.A02;
                C0eR c0eR = c56256Oy3.A03.mLifecycleRegistry;
                C14360o3.A07(c0eR);
                return new C8D9(view, c0eR, c56256Oy3.A04, c56256Oy3);
            case 37:
                View view2 = (View) this.A01;
                C56256Oy3 c56256Oy32 = (C56256Oy3) this.A02;
                InteractiveDrawableContainer interactiveDrawableContainer = c56256Oy32.A02;
                if (interactiveDrawableContainer == null) {
                    str = "interactiveDrawableContainer";
                } else {
                    C57012jc c57012jc = c56256Oy32.A01;
                    if (c57012jc == null) {
                        str = "drawingViewStubHolder";
                    } else {
                        ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = new ViewOnTouchListenerC1829889t(view2, (ViewStub) AbstractC166987dD.A17(c56256Oy32.A08), interactiveDrawableContainer, new C63581Spo(c56256Oy32, 14), c57012jc, (EyedropperColorPickerTool) AbstractC166987dD.A17(c56256Oy32.A09), false);
                        viewOnTouchListenerC1829889t.A06(c56256Oy32);
                        return viewOnTouchListenerC1829889t;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                PJF.A0K = (AbstractC53633Nne) this.A01;
                PJF pjf = (PJF) this.A02;
                C56139Ovz c56139Ovz = pjf.A08;
                c56139Ovz.A0A.A7P(new Object());
                String str2 = pjf.A0E;
                O9F o9f = pjf.A0D;
                int i = o9f.A01;
                int i2 = o9f.A00;
                InterfaceC174767qC interfaceC174767qC = pjf.A07;
                OL3 ol3 = pjf.A09;
                O6B o6b = pjf.A02;
                C14360o3.A0B(o6b, 5);
                C55207OeK c55207OeK = c56139Ovz.A09.A0Z;
                OXE.A00.A00("RtcRsysInteractor", AnonymousClass001.A02(i, i2, "startLiveSwap() in RtcRsysInteractor streamVideoWidth = ", ", streamVideoHeight "));
                c55207OeK.A01 = interfaceC174767qC;
                c55207OeK.A04 = o6b;
                c55207OeK.A03 = ol3;
                C55207OeK.A04(c55207OeK, new C57567Pgf(i, i2, str2, 2), AbstractC167007dF.A1N((C18U.A01(C06090Tz.A05, c55207OeK.A0C, 36600616079855560L) > 2L ? 1 : (C18U.A01(C06090Tz.A05, c55207OeK.A0C, 36600616079855560L) == 2L ? 0 : -1))), false);
                return C0eB.A00;
            case 47:
                ArrayList A1E = AbstractC166987dD.A1E();
                O9G o9g = (O9G) this.A01;
                A1E.add(new MediaStreamingTimerProviderHolder(true));
                A1E.add(new StallDetectorServiceProviderHolder(1.0d, 0.25d, 10.0d, true, EnumC53197Nft.A03));
                A1E.add(new StallDetectorServiceProviderHolder(1.0d, 0.25d, 10.0d, true, EnumC53197Nft.A04));
                UserSession userSession5 = o9g.A00;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession5, 2342155677801514195L)) {
                    C53705Nou c53705Nou = TimestampCheckerServiceProviderHolder.Companion;
                    A1E.add(new TimestampCheckerServiceProviderHolder(C18U.A00(c06090Tz, userSession5, 37157093517885480L), C18U.A00(c06090Tz, userSession5, 37157093518082089L), C18U.A00(c06090Tz, userSession5, 37157093517688870L), AbstractC25225BEi.A07(c06090Tz, userSession5, 36594143564334681L), EnumC53198Nfu.A03));
                }
                if (C18U.A06(c06090Tz, userSession5, 2342155677801579732L)) {
                    C53705Nou c53705Nou2 = TimestampCheckerServiceProviderHolder.Companion;
                    A1E.add(new TimestampCheckerServiceProviderHolder(C18U.A00(c06090Tz, userSession5, 37157093517885480L), C18U.A00(c06090Tz, userSession5, 37157093517819943L), C18U.A00(c06090Tz, userSession5, 37157093517688870L), AbstractC25225BEi.A07(c06090Tz, userSession5, 36594143564334681L), EnumC53198Nfu.A04));
                }
                C53686Nob c53686Nob = LiveStreamingTsLogServiceProviderHolder.Companion;
                A1E.add(new LiveStreamingTsLogServiceProviderHolder(new BatteryMonitor(((PJG) this.A02).A0A), 0, false, C18U.A06(c06090Tz, userSession5, 36310619888746707L)));
                return A1E;
            case 49:
                Object obj = this.A02;
                SurfaceHolder surfaceHolder = (SurfaceHolder) this.A01;
                surfaceHolder.getSurface();
                AbstractC97734aB.A00("SurfaceVideoViewController.onSurfaceAvailable()", new C9F7(41, surfaceHolder, obj));
                return C0eB.A00;
            default:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ == null || (invoke = interfaceC16820sZ.invoke()) == null) {
                    InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A02);
                    if ((A0i instanceof C07N) && (c07n = (C07N) A0i) != null) {
                        return c07n.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke;
        }
    }
}
