package X;

import android.content.Context;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2Av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46332Av {
    public int A00;
    public C2BE A01;
    public AbrContextAwareConfiguration A02;
    public C2A4 A03;
    public C42081wy A04;
    public ExecutorService A06;
    public boolean A07;
    public boolean A08;
    public C2B1 A09;
    public InterfaceC460429o A0A;
    public final C46322Au A0B;
    public final boolean A0E;
    public final Context A0F;
    public final C46272Ao A0G;
    public final BlockingQueue A0C = new LinkedBlockingDeque();
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public String A05 = "ExoService";

    public C46332Av(Context context, C46322Au c46322Au, C2A4 c2a4, C46272Ao c46272Ao, C42081wy c42081wy, HeroPlayerSetting heroPlayerSetting, InterfaceC460429o interfaceC460429o) {
        this.A0F = context;
        this.A0B = c46322Au;
        this.A04 = c42081wy;
        this.A03 = c2a4;
        this.A09 = new C2B1(new C46352Ax(c46322Au), null, EnumC46372Az.PREFETCH, heroPlayerSetting);
        AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(c42081wy, c2a4, new C2B2(), true, true);
        this.A02 = abrContextAwareConfiguration;
        this.A01 = new C2BE(context, new C2B4(abrContextAwareConfiguration, interfaceC460429o), new C2B2(), this.A09, null, this.A02, null, c2a4);
        this.A03 = c2a4;
        this.A0A = interfaceC460429o;
        this.A0G = c46272Ao;
        this.A08 = heroPlayerSetting.A2U;
        this.A00 = heroPlayerSetting.A0b;
        this.A0E = heroPlayerSetting.A1p;
        this.A07 = heroPlayerSetting.A2R;
    }
}
