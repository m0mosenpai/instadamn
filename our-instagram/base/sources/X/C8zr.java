package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.UIControlServiceDelegateWrapper;

/* renamed from: X.8zr, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8zr extends AbstractC203838zs {
    public static final C203848zt A02 = new C203848zt(EnumC150506pz.A0y);
    public final C203858zu A00;
    public final UIControlServiceDelegateWrapper A01;

    public C8zr(InterfaceC150446pt interfaceC150446pt, InterfaceC150426pr interfaceC150426pr, InterfaceC150466pv interfaceC150466pv, InterfaceC150406pp interfaceC150406pp, String str) {
        C203858zu c203858zu = new C203858zu(interfaceC150446pt, interfaceC150426pr, interfaceC150466pv, interfaceC150406pp, str);
        this.A00 = c203858zu;
        this.A01 = new UIControlServiceDelegateWrapper(str, c203858zu);
    }
}
