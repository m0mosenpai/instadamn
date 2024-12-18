package X;

import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.PSm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57047PSm implements Runnable {
    public final /* synthetic */ RtcStartCoWatchPlaybackArguments A00;
    public final /* synthetic */ OE0 A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public RunnableC57047PSm(RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, OE0 oe0, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC16660sJ;
        this.A01 = oe0;
        this.A00 = rtcStartCoWatchPlaybackArguments;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = this.A00;
        String str = rtcStartCoWatchPlaybackArguments.A04;
        int intValue = rtcStartCoWatchPlaybackArguments.A01.intValue();
        int i = 2;
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    i = 4;
                } else {
                    throw B4Z.A00();
                }
            }
        } else {
            i = 1;
        }
        interfaceC16660sJ.invoke(new C51628MrL(null, null, AbstractC167007dF.A0d(), str, IR8.A00(rtcStartCoWatchPlaybackArguments.A03), 0, i, 0));
    }
}
