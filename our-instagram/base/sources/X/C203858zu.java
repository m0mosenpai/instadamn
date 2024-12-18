package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* renamed from: X.8zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203858zu implements InterfaceC203868zv {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final InterfaceC150446pt A01;
    public final InterfaceC150426pr A02;
    public final InterfaceC150466pv A03;
    public final InterfaceC150406pp A04;
    public final String A05;

    @Override // X.InterfaceC203868zv
    public final void onTextEditComplete(String str) {
    }

    public C203858zu(InterfaceC150446pt interfaceC150446pt, InterfaceC150426pr interfaceC150426pr, InterfaceC150466pv interfaceC150466pv, InterfaceC150406pp interfaceC150406pp, String str) {
        this.A05 = str;
        this.A01 = interfaceC150446pt;
        this.A04 = interfaceC150406pp;
        this.A02 = interfaceC150426pr;
        this.A03 = interfaceC150466pv;
        interfaceC150466pv.Dmz(new SliderConfiguration(0, 0, null, null), str);
    }
}
