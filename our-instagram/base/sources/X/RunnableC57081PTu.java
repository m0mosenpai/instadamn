package X;

import com.instagram.model.rtc.RtcCallKey;

/* renamed from: X.PTu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57081PTu implements Runnable {
    public final /* synthetic */ RtcCallKey A00;
    public final /* synthetic */ C51678Ms9 A01;
    public final /* synthetic */ C51678Ms9 A02;
    public final /* synthetic */ C56139Ovz A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public RunnableC57081PTu(RtcCallKey rtcCallKey, C51678Ms9 c51678Ms9, C51678Ms9 c51678Ms92, C56139Ovz c56139Ovz, String str, String str2, String str3) {
        this.A03 = c56139Ovz;
        this.A02 = c51678Ms9;
        this.A06 = str;
        this.A04 = str2;
        this.A00 = rtcCallKey;
        this.A05 = str3;
        this.A01 = c51678Ms92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56139Ovz c56139Ovz = this.A03;
        C51678Ms9 c51678Ms9 = this.A02;
        String str = c51678Ms9.A08;
        String str2 = this.A06;
        String str3 = this.A04;
        EnumC53137Neq enumC53137Neq = c51678Ms9.A02;
        EnumC53138Ner enumC53138Ner = c51678Ms9.A03.A02;
        boolean z = c51678Ms9.A0A;
        c56139Ovz.A04(enumC53137Neq, enumC53138Ner, null, this.A00, str, str2, str3, c51678Ms9.A05, "wearable_audio_call", this.A05, AbstractC166987dD.A1J(AbstractC25225BEi.A0t(this.A01.A05)), z, true, !c51678Ms9.A09);
    }
}
