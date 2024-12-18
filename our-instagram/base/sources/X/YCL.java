package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public final class YCL implements XEI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final AudioTrack A04;
    public final W26 A05;
    public final AtomicLong A06 = new AtomicLong(0);

    @Override // X.XEI
    public final YCL BmY() {
        return this;
    }

    @Override // X.XEI
    public final boolean Em1() {
        return true;
    }

    @Override // X.XEI
    public final void FDt() {
    }

    private AudioTrack A00() {
        int i = this.A03;
        int i2 = this.A00;
        return new AudioTrack.Builder().setAudioFormat(new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(this.A02).build()).setTransferMode(1).setBufferSizeInBytes(this.A01).build();
    }

    @Override // X.XEI
    public final void flush() {
        AudioTrack audioTrack = this.A04;
        if (audioTrack.getState() == 1) {
            audioTrack.stop();
            audioTrack.flush();
            this.A06.set(0L);
        }
    }

    @Override // X.XEI
    public final void release() {
        this.A04.release();
    }

    public YCL(int i, int i2) {
        int i3;
        AudioTrack audioTrack;
        this.A03 = i;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 6) {
                    i3 = 252;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                i3 = 12;
            }
        } else {
            i3 = 4;
        }
        this.A00 = i3;
        this.A02 = 2;
        this.A01 = AudioTrack.getMinBufferSize(i, i3, 2);
        if (AbstractC1126356r.A00 >= 29) {
            audioTrack = A00();
        } else {
            AudioAttributes build = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1).build();
            int i4 = this.A03;
            int i5 = this.A00;
            audioTrack = new AudioTrack(build, new AudioFormat.Builder().setSampleRate(i4).setChannelMask(i5).setEncoding(this.A02).build(), this.A01, 1, 0);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            this.A04 = audioTrack;
            this.A05 = new W26(audioTrack);
        } else {
            audioTrack.release();
            throw AbstractC166987dD.A14(AnonymousClass001.A0O("build audio track failed. State: ", state));
        }
    }

    @Override // X.XEI
    public final void E6B(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            this.A06.compareAndSet(0L, System.nanoTime());
            AudioTrack audioTrack = this.A04;
            if (audioTrack.getPlayState() != 3) {
                try {
                    audioTrack.play();
                } catch (IllegalStateException e) {
                    throw new IllegalStateException(AnonymousClass001.A0o(e.getMessage(), " PlayerState: ", " AudioTrack state:", audioTrack.getPlayState(), audioTrack.getState()), e);
                }
            }
            audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
    }
}
