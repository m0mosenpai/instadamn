package X;

import java.util.List;

/* renamed from: X.4St, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95844St implements InterfaceC95434Rd {
    public final C95794Sn A00;
    public volatile InterfaceC95434Rd A01;

    @Override // X.InterfaceC95434Rd
    public final void D6k(C4RU c4ru, String str, String str2, String str3, boolean z) {
        try {
            this.A01.D6k(c4ru, str, str2, str3, z);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onCompletion(isPlaying = %s) callback", e, Boolean.valueOf(c4ru.A0Q));
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DEK(String str, String str2, String str3, String str4, String str5) {
        try {
            this.A01.DEK(str, str2, str3, str4, str5);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onError(errorCode = %s) callback", e, str2);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DXx(C4RU c4ru, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        try {
            this.A01.DXx(c4ru, str, str2, str3, str4, str5, j, z);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onPaused(isPlaying = %s) callback", e, Boolean.valueOf(c4ru.A0Q));
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void Deb(boolean z, boolean z2) {
        try {
            this.A01.Deb(z, false);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onRelease(isEvicted = %s) callback", e, Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DoK(C4RU c4ru, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        try {
            this.A01.DoK(c4ru, str, str2, str3, str4, str5, str6, str7, j, z, z2);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onStartedPlaying(isPlaying = %s) callback", e, Boolean.valueOf(c4ru.A0Q));
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void Cy0(C98704bq c98704bq) {
        try {
            this.A01.Cy0(c98704bq);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send audio input format change", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void D0a(C4RV c4rv, C4RU c4ru, boolean z) {
        try {
            this.A01.D0a(c4rv, c4ru, z);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onBufferingStarted(isPlaying = %s) callback", e, Boolean.valueOf(c4ru.A0Q));
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void D0b(C4RU c4ru, boolean z) {
        try {
            this.A01.D0b(c4ru, z);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onBufferingStopped(isPlaying = %s) callback", e, Boolean.valueOf(c4ru.A0Q));
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void D23(C4RU c4ru, String str, String str2, String str3, String str4, long j, boolean z) {
        try {
            this.A01.D23(c4ru, str, str2, "", str4, j, z);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed send onCancelled() callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void D5g(String str, boolean z) {
        try {
            this.A01.D5g(str, z);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send codec init start callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void D9S(long j, String str, boolean z) {
        try {
            this.A01.D9S(j, str, z);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send decoder initialized callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void D9T(int i, int i2, int i3, int i4) {
        try {
            this.A01.D9T(i, i2, i3, i4);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onDecoderPerfReport callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DBp(C98704bq c98704bq, String str, List list, boolean z) {
        try {
            this.A01.DBp(c98704bq, str, list, z);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed send onDownstreamFormatChanged() callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DEQ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        try {
            this.A01.DEQ(str, str2, str3, str4, str5, str6, "");
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed send onErrorRecoveryAttempt() callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DIJ(String str, long j) {
        this.A01.DIJ(str, j);
    }

    @Override // X.InterfaceC95434Rd
    public final void DLl(String str, byte[] bArr, long j) {
        try {
            this.A01.DLl(str, bArr, j);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onImfEventEmsgReceived callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DPI(boolean z) {
        try {
            this.A01.DPI(z);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onLiveInterrupt callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DPK(String str, byte[] bArr, long j, long j2) {
        try {
            this.A01.DPK(str, bArr, j, j2);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onliveEmsg callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DPP(C4RV c4rv) {
        try {
            this.A01.DPP(c4rv);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send live state update", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DPS(C68692VaS c68692VaS) {
        try {
            this.A01.DPS(c68692VaS);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onLiveTraceFrameEvent callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DTa(Object obj) {
        try {
            this.A01.DTa(obj);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onMetadataMsg callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DVN(byte[] bArr, long j) {
        try {
            this.A01.DVN(bArr, j);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onNewAudioData callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DY8(String str, String str2) {
        this.A01.DY8(str, str2);
    }

    @Override // X.InterfaceC95434Rd
    public final void DZ0() {
        try {
            this.A01.DZ0();
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onPlaybackAboutToFinish callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DZ6(EnumC46692Ch enumC46692Ch) {
        try {
            this.A01.DZ6(enumC46692Ch);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onPlaybackPositionReached callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DZ9(float f) {
        try {
            this.A01.DZ9(f);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onLiveTraceFrameEvent callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DZK(C4RU c4ru) {
        try {
            this.A01.DZK(c4ru);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onPlayerStateUpdate(isPlaying = %s) callback", e, Boolean.valueOf(c4ru.A0Q));
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DaV(C4RU c4ru, String str) {
        try {
            this.A01.DaV(c4ru, str);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onPrepared callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void Dk1(C4RU c4ru, long j) {
        try {
            this.A01.Dk1(c4ru, j);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onSeeking callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void Dkr(long j) {
        try {
            this.A01.Dkr(j);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed send onServicePlayerListenerDetached() callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void DtM(List list) {
        try {
            this.A01.DtM(list);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send gaps changed callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void Dul(C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        try {
            this.A01.Dul(c98704bq, c98704bq2, str, str2, str3, str4, str5, str6, list);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed send onTrackSelectionFallback() callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void Dzu(int i, int i2, float f) {
        try {
            this.A01.Dzu(i, i2, f);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onVideoSizeChanged(width = %d, height = %d) callback", e, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void E1k(String str, String str2, String str3) {
        try {
            this.A01.E1k(str, str2, str3);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onWarn callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void onCues(List list) {
        try {
            this.A01.onCues(list);
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed send onCues(list = %s) callback", e, list);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void onDrawnToSurface() {
        try {
            this.A01.onDrawnToSurface();
        } catch (IllegalStateException e) {
            C2QC.A01(this.A00, "Failed to send onDrawnToSurface callback", e, new Object[0]);
        }
    }

    @Override // X.InterfaceC95434Rd
    public final void onStopped() {
        this.A01.onStopped();
    }

    public C95844St(InterfaceC95434Rd interfaceC95434Rd, C95794Sn c95794Sn) {
        if (interfaceC95434Rd != null) {
            this.A00 = c95794Sn;
            this.A01 = interfaceC95434Rd;
            return;
        }
        throw new IllegalArgumentException("HeroServicePlayerListener cannot be null");
    }
}
