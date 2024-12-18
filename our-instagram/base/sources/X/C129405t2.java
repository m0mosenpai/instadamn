package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: X.5t2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129405t2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C4B6 A07;
    public final boolean A08;
    public final C4UE[] A09;

    public static AudioAttributes A00(C4UX c4ux, boolean z) {
        if (z) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        C126285nP c126285nP = c4ux.A00;
        if (c126285nP == null) {
            c126285nP = new C126285nP(c4ux);
            c4ux.A00 = c126285nP;
        }
        return c126285nP.A00;
    }

    public static AudioTrack A01(C4UX c4ux, C129405t2 c129405t2, int i, boolean z) {
        int i2 = c129405t2.A06;
        int i3 = c129405t2.A02;
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(A00(c4ux, z)).setAudioFormat(new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(c129405t2.A03).build());
        boolean z2 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(c129405t2.A00).setSessionId(i);
        if (c129405t2.A04 != 1) {
            z2 = false;
        }
        return sessionId.setOffloadedPlayback(z2).build();
    }

    public C129405t2(C4B6 c4b6, C4UE[] c4ueArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A07 = c4b6;
        this.A01 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A02 = i5;
        this.A03 = i6;
        this.A00 = i7;
        this.A09 = c4ueArr;
        this.A08 = z;
    }
}
