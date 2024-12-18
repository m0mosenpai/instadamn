package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.878, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass878 implements AnonymousClass879, InterfaceC150336ph {
    public boolean A00;
    public boolean A01;
    public int A02;
    public MusicDataSource A03;
    public boolean A04;
    public final InterfaceC678133v A05;
    public final AnonymousClass876 A06;
    public final UserSession A07;
    public final InterfaceC60442pS A08;
    public final C677733r A09;
    public final List A0A;

    public AnonymousClass878(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C677733r c677733r, AnonymousClass876 anonymousClass876) {
        C14360o3.A0B(userSession, 2);
        this.A07 = userSession;
        this.A09 = c677733r;
        this.A06 = anonymousClass876;
        this.A08 = interfaceC60442pS;
        this.A05 = AbstractC677833s.A01(context, userSession, interfaceC60442pS, c677733r, "MusicOnlySyncController", false, AbstractC677833s.A02(userSession), false, false);
        this.A0A = new ArrayList();
    }

    @Override // X.AnonymousClass879
    public final void Cq9() {
    }

    @Override // X.AnonymousClass879
    public final void EZL(MusicDataSource musicDataSource, boolean z) {
        if (!z && musicDataSource.equals(this.A05.Avn())) {
            return;
        }
        this.A05.ESz(musicDataSource, this, null, 0, -1, -1, z, false);
    }

    @Override // X.AnonymousClass879
    public final void F9I() {
    }

    @Override // X.AnonymousClass879
    public final void onResume() {
        MusicDataSource musicDataSource = this.A03;
        if (musicDataSource != null) {
            InterfaceC678133v interfaceC678133v = this.A05;
            interfaceC678133v.ESz(musicDataSource, this, null, 0, -1, -1, false, false);
            this.A03 = null;
            if (this.A04) {
                interfaceC678133v.seekTo(this.A02);
                interfaceC678133v.E4S();
                this.A04 = false;
            }
        }
    }

    @Override // X.AnonymousClass879
    public final void A9V(InterfaceC189808az interfaceC189808az) {
        List list = this.A0A;
        if (!list.contains(interfaceC189808az)) {
            list.add(interfaceC189808az);
        }
    }

    @Override // X.AnonymousClass879
    public final void AHv() {
        this.A05.AHi();
    }

    @Override // X.AnonymousClass879
    public final MusicDataSource BVb() {
        return this.A05.Avn();
    }

    @Override // X.AnonymousClass879
    public final int BVh() {
        return this.A05.getCurrentPositionMs();
    }

    @Override // X.AnonymousClass879
    public final int BVm() {
        return this.A06.BVm();
    }

    @Override // X.AnonymousClass879
    public final int BVn() {
        return this.A02;
    }

    @Override // X.AnonymousClass879
    public final int BVq() {
        return this.A05.Azm();
    }

    @Override // X.AnonymousClass879
    public final Integer CAH() {
        InterfaceC678133v interfaceC678133v = this.A05;
        return interfaceC678133v.CAJ(interfaceC678133v.Avn());
    }

    @Override // X.AnonymousClass879
    public final boolean CLN() {
        return this.A05.CLN();
    }

    @Override // X.AnonymousClass879
    public final void EFo(InterfaceC189808az interfaceC189808az) {
        this.A0A.remove(interfaceC189808az);
    }

    @Override // X.AnonymousClass879
    public final void EZO(int i) {
        this.A06.EZO(i);
    }

    @Override // X.AnonymousClass879
    public final void EZP(int i) {
        this.A02 = i;
        this.A05.seekTo(i);
    }

    @Override // X.AnonymousClass879
    public final void EhH(float f) {
        this.A05.EhH(f);
    }

    @Override // X.AnonymousClass879
    public final boolean isPlaying() {
        return this.A05.isPlaying();
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
        List list = this.A0A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i);
        }
        if (!this.A01) {
            InterfaceC678133v interfaceC678133v = this.A05;
            interfaceC678133v.seekTo(this.A02);
            interfaceC678133v.E4S();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        if (AbstractC13600mm.A00((i - this.A02) / this.A06.BVm(), 0.0f, 1.0f) == 1.0f) {
            this.A05.seekTo(this.A02);
        }
        List list = this.A0A;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC189808az) list.get(i2)).DUm(i);
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
        List list = this.A0A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC189808az) list.get(i)).DUg();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
        List list = this.A0A;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC189808az) list.get(i2)).DUh(i, 0);
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackSeekComplete() {
        List list = this.A0A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC189808az) list.get(i)).DUi();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStartedPlaying() {
        List list = this.A0A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC189808az) list.get(i)).DUk();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
        List list = this.A0A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC189808az) list.get(i)).DUl();
        }
    }

    @Override // X.AnonymousClass879
    public final void onPause() {
        InterfaceC678133v interfaceC678133v = this.A05;
        if (interfaceC678133v.CLN()) {
            this.A03 = interfaceC678133v.Avn();
            this.A04 = interfaceC678133v.isPlaying();
            interfaceC678133v.release();
            this.A09.A00();
        }
    }

    @Override // X.AnonymousClass879
    public final void release() {
        this.A05.release();
        this.A02 = 0;
        this.A03 = null;
        this.A04 = false;
    }

    @Override // X.AnonymousClass879
    public final void E4S() {
        int intValue = CAH().intValue();
        if (intValue != 1 && intValue != 2) {
            return;
        }
        this.A05.E4S();
    }

    @Override // X.AnonymousClass879
    public final void pause() {
        int intValue = CAH().intValue();
        if (intValue != 1 && intValue != 2) {
            return;
        }
        InterfaceC678133v interfaceC678133v = this.A05;
        interfaceC678133v.seekTo(this.A02);
        interfaceC678133v.pause();
    }
}
