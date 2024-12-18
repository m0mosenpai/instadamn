package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.87A, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87A implements AnonymousClass879, InterfaceC150336ph, C87B {
    public InterfaceC186038Mx A00;
    public InterfaceC185968Mq A01;
    public boolean A02;
    public boolean A03;
    public float A04;
    public int A05;
    public MusicDataSource A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC678133v A09;
    public final C677733r A0A;
    public final List A0B;

    public C87A(Context context, UserSession userSession, C677733r c677733r) {
        C14360o3.A0B(userSession, 2);
        this.A0A = c677733r;
        this.A09 = AbstractC677833s.A01(context, userSession, null, c677733r, "MusicVideoSyncController", false, AbstractC677833s.A02(userSession), false, false);
        this.A0B = new ArrayList();
        this.A04 = 50.0f;
    }

    @Override // X.C87B
    public final boolean AG5(InterfaceC185968Mq interfaceC185968Mq) {
        if (this.A09.CLN()) {
            if (this.A08) {
                this.A08 = false;
                return false;
            }
            if (this.A03) {
                this.A01 = interfaceC185968Mq;
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.C87B
    public final void DOt() {
        MusicDataSource musicDataSource = this.A06;
        if (musicDataSource != null) {
            InterfaceC678133v interfaceC678133v = this.A09;
            interfaceC678133v.ESz(musicDataSource, this, null, 0, -1, -1, false, false);
            this.A06 = null;
            int i = this.A05;
            this.A03 = true;
            interfaceC678133v.seekTo(i);
        }
    }

    @Override // X.C87B
    public final void Dl9(int i) {
        this.A02 = true;
    }

    @Override // X.C87B
    public final /* synthetic */ void Dzd() {
    }

    @Override // X.C87B
    public final /* synthetic */ void Dzf() {
    }

    @Override // X.AnonymousClass879
    public final void EZL(MusicDataSource musicDataSource, boolean z) {
        InterfaceC678133v interfaceC678133v = this.A09;
        if (!musicDataSource.equals(interfaceC678133v.Avn())) {
            interfaceC678133v.ESz(musicDataSource, this, null, 0, -1, -1, z, false);
        }
    }

    @Override // X.AnonymousClass879
    public final void EZO(int i) {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
    }

    @Override // X.AnonymousClass879
    public final void A9V(InterfaceC189808az interfaceC189808az) {
        List list = this.A0B;
        if (!list.contains(interfaceC189808az)) {
            list.add(interfaceC189808az);
        }
    }

    @Override // X.AnonymousClass879
    public final void AHv() {
        this.A09.AHi();
    }

    @Override // X.AnonymousClass879
    public final MusicDataSource BVb() {
        return this.A09.Avn();
    }

    @Override // X.AnonymousClass879
    public final int BVh() {
        return this.A09.getCurrentPositionMs();
    }

    @Override // X.AnonymousClass879
    public final int BVm() {
        InterfaceC186038Mx interfaceC186038Mx = this.A00;
        if (interfaceC186038Mx != null) {
            return interfaceC186038Mx.CF4();
        }
        return 0;
    }

    @Override // X.AnonymousClass879
    public final int BVn() {
        return this.A05;
    }

    @Override // X.AnonymousClass879
    public final int BVq() {
        return this.A09.Azm();
    }

    @Override // X.AnonymousClass879
    public final Integer CAH() {
        InterfaceC678133v interfaceC678133v = this.A09;
        return interfaceC678133v.CAJ(interfaceC678133v.Avn());
    }

    @Override // X.AnonymousClass879
    public final boolean CLN() {
        return this.A09.CLN();
    }

    @Override // X.AnonymousClass879
    public final void Cq9() {
        InterfaceC678133v interfaceC678133v = this.A09;
        this.A04 = interfaceC678133v.CH1();
        interfaceC678133v.EhH(0.0f);
        this.A07 = true;
    }

    @Override // X.C87B
    public final void DOs() {
        InterfaceC678133v interfaceC678133v = this.A09;
        if (interfaceC678133v.CLN()) {
            this.A08 = !isPlaying();
            this.A06 = interfaceC678133v.Avn();
            interfaceC678133v.release();
            this.A0A.A00();
        }
    }

    @Override // X.C87B
    public final void DzD() {
        InterfaceC678133v interfaceC678133v = this.A09;
        if (interfaceC678133v.CLN()) {
            interfaceC678133v.pause();
            int i = this.A05;
            this.A03 = true;
            interfaceC678133v.seekTo(i);
        }
    }

    @Override // X.C87B
    public final void Dzq(int i) {
        InterfaceC678133v interfaceC678133v = this.A09;
        if (interfaceC678133v.CLN()) {
            int i2 = this.A05 + i;
            this.A03 = true;
            interfaceC678133v.seekTo(i2);
        }
    }

    @Override // X.C87B
    public final void E03() {
        InterfaceC678133v interfaceC678133v = this.A09;
        if (interfaceC678133v.CLN()) {
            interfaceC678133v.E4S();
        }
    }

    @Override // X.C87B
    public final void E0B() {
        InterfaceC678133v interfaceC678133v = this.A09;
        if (interfaceC678133v.CLN()) {
            interfaceC678133v.pause();
        }
        List list = this.A0B;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC189808az) list.get(i)).DUl();
        }
    }

    @Override // X.AnonymousClass879
    public final void E4S() {
        InterfaceC186038Mx interfaceC186038Mx = this.A00;
        if (interfaceC186038Mx != null) {
            interfaceC186038Mx.E4Y();
        }
    }

    @Override // X.AnonymousClass879
    public final void EFo(InterfaceC189808az interfaceC189808az) {
        this.A0B.remove(interfaceC189808az);
    }

    @Override // X.AnonymousClass879
    public final void EZP(int i) {
        this.A05 = i;
        this.A03 = true;
        this.A09.seekTo(i);
    }

    @Override // X.AnonymousClass879
    public final void EhH(float f) {
        this.A09.EhH(f);
    }

    @Override // X.AnonymousClass879
    public final void F9I() {
        if (this.A07) {
            this.A09.EhH(this.A04);
            this.A07 = false;
        }
    }

    @Override // X.AnonymousClass879
    public final boolean isPlaying() {
        InterfaceC678133v interfaceC678133v = this.A09;
        if (interfaceC678133v.CLN()) {
            if (interfaceC678133v.isPlaying() || this.A01 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        List list = this.A0B;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC189808az) list.get(i2)).DUm(i);
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
        List list = this.A0B;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC189808az) list.get(i)).DUg();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
        InterfaceC186038Mx interfaceC186038Mx = this.A00;
        if (interfaceC186038Mx != null) {
            int CF4 = interfaceC186038Mx.CF4();
            List list = this.A0B;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC189808az) list.get(i2)).DUh(i, CF4);
            }
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackSeekComplete() {
        InterfaceC185968Mq interfaceC185968Mq = this.A01;
        this.A01 = null;
        boolean z = this.A03;
        this.A03 = false;
        if (z && interfaceC185968Mq != null) {
            interfaceC185968Mq.Eo6();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStartedPlaying() {
        List list = this.A0B;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC189808az) list.get(i)).DUk();
        }
    }

    @Override // X.AnonymousClass879
    public final void pause() {
        InterfaceC186038Mx interfaceC186038Mx = this.A00;
        if (interfaceC186038Mx != null) {
            interfaceC186038Mx.E3m();
        }
        InterfaceC678133v interfaceC678133v = this.A09;
        if (interfaceC678133v.CLN()) {
            interfaceC678133v.pause();
        }
    }

    @Override // X.AnonymousClass879
    public final void release() {
        this.A09.release();
        this.A06 = null;
        this.A05 = 0;
        this.A03 = false;
        this.A08 = false;
    }

    @Override // X.C87B
    public final void Dp5() {
        release();
        this.A02 = false;
    }

    @Override // X.AnonymousClass879
    public final void onPause() {
        DOs();
    }

    @Override // X.AnonymousClass879
    public final void onResume() {
        DOt();
    }
}
