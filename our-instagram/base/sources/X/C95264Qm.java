package X;

import java.util.List;

/* renamed from: X.4Qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95264Qm implements InterfaceC95254Ql {
    public InterfaceC95254Ql A00;

    @Override // X.InterfaceC95254Ql
    public final void EHb(EnumC92424Bx enumC92424Bx, Object obj) {
        C14360o3.A0B(enumC92424Bx, 1);
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportFirstDataSegmentFetched", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EHb(enumC92424Bx, obj);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EHk(EnumC92424Bx enumC92424Bx, Object obj) {
        C14360o3.A0B(enumC92424Bx, 1);
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportInitSegmentFetched", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EHk(enumC92424Bx, obj);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EHp(C53302cE c53302cE) {
        C14360o3.A0B(c53302cE, 0);
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportMediaCodecLifecycle", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EHp(c53302cE);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIa(C4SG c4sg, Object obj, String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoError", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIa(c4sg, obj, str, str2, str3);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EId(C4SG c4sg, Object obj, String str) {
        C14360o3.A0B(str, 1);
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoLoop", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EId(c4sg, obj, str);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIh(C4SG c4sg, Object obj, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoPlayerPaused", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIh(c4sg, obj, str, str2, str3, null);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIm(C4SG c4sg, Object obj, String str, long j, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 4);
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoPlayerStarted", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIm(c4sg, obj, str, j, z, z2, z3);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIs(Object obj, String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoWarning", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIs(obj, str, str2, str3);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EHH(C121955fn c121955fn) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportAbrDecision", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EHH(c121955fn);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EHM(C75363a3 c75363a3) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoViewSizeChanged", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EHM(c75363a3);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EHU(C4SG c4sg, Object obj, String str, String str2, int i, int i2) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportDownstreamFormatChanged", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EHU(c4sg, obj, str, str2, i, i2);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIX(C4SG c4sg, Object obj, int i, boolean z) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoAudioToggleChanged", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIX(c4sg, obj, i, z);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIY(C4SG c4sg, Object obj, int i) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoBufferingFinished", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIY(c4sg, obj, i);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIZ(C4SG c4sg, Object obj, List list) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoBufferingStart", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIZ(c4sg, obj, list);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIc(Object obj, boolean z) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoFetched", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIc(obj, z);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIe(C4SG c4sg, Object obj) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoOnPrepareStart", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIe(c4sg, obj);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIf(Object obj, int i) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoPlayedTimeUpdate", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIf(obj, i);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIg(Object obj) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoPlayerExited", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIg(obj);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIi(C4SG c4sg, Object obj, int i) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoPlayerRequestedPlaying", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIi(c4sg, obj, i);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIj(C4SG c4sg, Object obj, String str) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoPlayerResumed", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIj(c4sg, obj, str);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIk(C4SG c4sg, Object obj, int i) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoPlayerSeek", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIk(c4sg, obj, i);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIl(C4SG c4sg, Object obj, String str, int i) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoPlayerShouldStart", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIl(c4sg, obj, str, i);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIn(C4SG c4sg, Object obj, int i, int i2, int i3) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoPlayingUpdate", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIn(c4sg, obj, i, i2, i3);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIo(Object obj, String str, String str2, int i, long j) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoRendered", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIo(obj, str, str2, i, j);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIp(Object obj) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoSwitchToWarmupPlayer", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIp(obj);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIq(C4SG c4sg, Object obj) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoViewSizeChanged", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIq(c4sg, obj);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIr(C4SG c4sg, Object obj) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoViewed", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIr(c4sg, obj);
        }
    }

    @Override // X.InterfaceC95254Ql
    public final void EIt(C4SG c4sg, Object obj, int i) {
        InterfaceC95254Ql interfaceC95254Ql = this.A00;
        if (interfaceC95254Ql == null) {
            C0w9.A03("VideoPlayerImpl_Logger_reportVideoViewabilityChanged", "attempted to log after logger is released");
        } else {
            interfaceC95254Ql.EIt(c4sg, obj, i);
        }
    }
}
