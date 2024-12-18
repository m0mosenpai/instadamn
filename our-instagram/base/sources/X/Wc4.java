package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class Wc4 implements InterfaceC96424Va {
    public final long A00;
    public final C2B4 A01;
    public final C46322Au A02;
    public final EnumC91984Ae A03;
    public final C4SS A04;
    public final C92124As A05;
    public final AtomicBoolean A06;
    public final AtomicBoolean A07;
    public final /* synthetic */ C95924Tb A08;

    public Wc4(C2B4 c2b4, C46322Au c46322Au, EnumC91984Ae enumC91984Ae, C4SS c4ss, C95924Tb c95924Tb, C92124As c92124As, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, long j) {
        this.A08 = c95924Tb;
        this.A04 = c4ss;
        this.A00 = j;
        this.A02 = c46322Au;
        this.A01 = c2b4;
        this.A03 = enumC91984Ae;
        this.A05 = c92124As;
        this.A06 = atomicBoolean;
        this.A07 = atomicBoolean2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC96424Va
    public final InterfaceC92354Bq ALy() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        C2B4 c2b4 = this.A01;
        C4SS c4ss = this.A04;
        C4AN c4an = c4ss.A0K;
        String str2 = c4an.A0G;
        String str3 = c4an.A0A;
        String str4 = c4an.A0B;
        EnumC46372Az enumC46372Az = c4ss.A04;
        C4AM c4am = c4an.A06;
        boolean z5 = c4ss.A0A;
        C92304Bk c92304Bk = new C92304Bk(enumC46372Az, c4am, str2, str3, str4, z5);
        long j = this.A00;
        String str5 = c4ss.A06;
        C95924Tb c95924Tb = this.A08;
        ServiceEventCallbackImpl serviceEventCallbackImpl = c95924Tb.A04;
        AtomicBoolean atomicBoolean = this.A06;
        AtomicBoolean atomicBoolean2 = this.A07;
        String A01 = C2Ai.A00.A01();
        EnumC91984Ae enumC91984Ae = this.A03;
        boolean z6 = c4an.A0M;
        boolean z7 = c4an.A0N;
        C92124As c92124As = this.A05;
        if (c92124As != null) {
            z = c92124As.A0S;
            z2 = c92124As.A0V;
            z3 = c92124As.A0W;
            z4 = c92124As.A0R;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        HeroPlayerSetting heroPlayerSetting = c95924Tb.A05;
        boolean z8 = heroPlayerSetting.A2U;
        InterfaceC460429o interfaceC460429o = c95924Tb.A06;
        InterfaceC92334Bn interfaceC92334Bn = null;
        if (c92124As != null && c92124As.A0Q.size() > 0) {
            str = AbstractC65702TsY.A0M(c92124As).A02.A0R;
        } else {
            str = null;
        }
        C92414Bw c92414Bw = new C92414Bw(c2b4, serviceEventCallbackImpl, enumC91984Ae, c95924Tb.A02, c92304Bk, interfaceC460429o, str5, "", A01, str, c4ss.A07, atomicBoolean, atomicBoolean2, j, false, z6, z7, z, z2, z3, z4, false, z8);
        c92414Bw.A16 = heroPlayerSetting.A3B;
        C92414Bw c92414Bw2 = c92414Bw;
        if (c2b4 != null) {
            C92314Bl c92314Bl = new C92314Bl(heroPlayerSetting.A2R);
            interfaceC92334Bn = c92314Bl.A01;
            ArrayList A0z = AbstractC31174DnI.A0z(c92414Bw);
            A0z.add(c2b4.A00);
            c92314Bl.A00 = new ArrayList(A0z);
            c92414Bw2 = c92314Bl;
        }
        VKD vkd = Wc7.A0B;
        return new C97864aR(new Wc7(this.A02, C2Ai.A00, c92414Bw2, new C92304Bk(c4ss.A04, c4am, str2, str3, str4, z5), interfaceC92334Bn, heroPlayerSetting.A18, heroPlayerSetting.A0b, heroPlayerSetting.A1p));
    }
}
