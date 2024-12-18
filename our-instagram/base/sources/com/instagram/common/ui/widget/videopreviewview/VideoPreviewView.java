package com.instagram.common.ui.widget.videopreviewview;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC97744aC;
import X.C0K8;
import X.C0f9;
import X.C0w9;
import X.C50708Ma3;
import X.EnumC95184Qe;
import X.InterfaceC57807PkZ;
import X.InterfaceC58181Pql;
import X.MXH;
import X.MXU;
import X.RunnableC50706Ma1;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.instagram.common.gallery.Medium;
import java.io.IOException;

/* loaded from: classes9.dex */
public class VideoPreviewView extends TextureView implements TextureView.SurfaceTextureListener, MediaPlayer.OnPreparedListener, InterfaceC57807PkZ {
    public MediaPlayer A00;
    public Surface A01;
    public EnumC95184Qe A02;
    public InterfaceC58181Pql A03;
    public MXU A04;
    public Runnable A05;
    public final Runnable A06;

    private void A01() {
        int i;
        int i2;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null && A08()) {
            i = mediaPlayer.getVideoWidth();
        } else {
            i = 0;
        }
        MediaPlayer mediaPlayer2 = this.A00;
        if (mediaPlayer2 != null && A08()) {
            i2 = mediaPlayer2.getVideoHeight();
        } else {
            i2 = 0;
        }
        AbstractC97744aC.A01(this, getScaleType(), this, getMinFitAspectRatio(), getMaxFitAspectRatio(), 0.0f, i, i2);
    }

    public float getMaxFitAspectRatio() {
        return 1.0f;
    }

    public float getMinFitAspectRatio() {
        return 1.0f;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    private void A00() {
        if (this.A00 != null) {
            A05();
        }
        this.A00 = new MediaPlayer();
        setMediaPlayerState(MXU.IDLE);
        this.A05 = new RunnableC50706Ma1(this);
        Surface surface = this.A01;
        if (surface != null) {
            this.A00.setSurface(surface);
        }
    }

    private void A02() {
        Runnable runnable = this.A05;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        MXU mxu = this.A04;
        if (mxu == MXU.STARTED || mxu == MXU.PAUSED) {
            try {
                this.A00.stop();
                setMediaPlayerState(MXU.STOPPED);
            } catch (IllegalStateException e) {
                A03(e);
            }
        }
    }

    private void setMediaPlayerState(MXU mxu) {
        this.A04 = mxu;
        InterfaceC58181Pql interfaceC58181Pql = this.A03;
        if (interfaceC58181Pql != null) {
            interfaceC58181Pql.DoM(mxu);
        }
    }

    public final void A04() {
        Runnable runnable = this.A05;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (this.A04 == MXU.STARTED) {
            try {
                this.A00.pause();
                setMediaPlayerState(MXU.PAUSED);
            } catch (IllegalStateException e) {
                A03(e);
            }
        }
    }

    public final void A05() {
        if (this.A00 != null) {
            removeCallbacks(this.A05);
            this.A03 = null;
            this.A01 = null;
            this.A00.setOnPreparedListener(null);
            A02();
            try {
                this.A00.release();
                setMediaPlayerState(MXU.RELEASED);
                this.A00 = null;
                setMediaPlayerState(null);
            } catch (IllegalStateException e) {
                A03(e);
            }
        }
    }

    public final void A07(int i) {
        MXU mxu = this.A04;
        if (mxu == MXU.STARTED || mxu == MXU.PAUSED) {
            this.A00.seekTo(i);
        }
    }

    public final boolean A08() {
        MXU mxu = this.A04;
        if (mxu != MXU.PREPARED && mxu != MXU.STARTED && mxu != MXU.PAUSED && mxu != MXU.STOPPED) {
            return false;
        }
        return true;
    }

    public EnumC95184Qe getScaleType() {
        return this.A02;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        setMediaPlayerState(MXU.PREPARED);
        A01();
        if (this.A03 != null) {
            this.A03.DPY(this, this.A00.getVideoWidth(), this.A00.getVideoHeight());
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        this.A01 = surface;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        this.A01 = surface;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    public void setVideoAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor, InterfaceC58181Pql interfaceC58181Pql) {
        String A0v;
        if (this.A00 == null) {
            A00();
        }
        MXU mxu = this.A04;
        MXU mxu2 = MXU.PREPARING;
        if (mxu != mxu2) {
            try {
                this.A03 = interfaceC58181Pql;
                A02();
                this.A00.reset();
                if (getSurfaceTexture() != null) {
                    Surface surface = new Surface(getSurfaceTexture());
                    this.A01 = surface;
                    this.A00.setSurface(surface);
                }
                this.A00.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                setMediaPlayerState(MXU.INITIALIZED);
                this.A00.setLooping(true);
                this.A00.prepareAsync();
                setMediaPlayerState(mxu2);
                this.A00.setOnPreparedListener(this);
            } catch (IOException e) {
                C0K8.A05(VideoPreviewView.class, "failed to load video", e);
                A0v = e.getMessage();
                interfaceC58181Pql.DFu(A0v);
            } catch (IllegalStateException e2) {
                A03(e2);
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Illegal state: ");
                A0v = AbstractC166997dE.A0v(this.A04, A1C);
                interfaceC58181Pql.DFu(A0v);
            }
        }
    }

    public void setVideoMedium(Medium medium, InterfaceC58181Pql interfaceC58181Pql) {
        setVideoPath(medium.A0X, interfaceC58181Pql);
    }

    public void setVideoPath(String str, InterfaceC58181Pql interfaceC58181Pql) {
        String A0v;
        if (this.A00 == null) {
            A00();
        }
        MXU mxu = this.A04;
        MXU mxu2 = MXU.PREPARING;
        if (mxu != mxu2) {
            try {
                this.A03 = interfaceC58181Pql;
                A02();
                this.A00.reset();
                if (getSurfaceTexture() != null) {
                    Surface surface = new Surface(getSurfaceTexture());
                    this.A01 = surface;
                    this.A00.setSurface(surface);
                }
                this.A00.setDataSource(str);
                setMediaPlayerState(MXU.INITIALIZED);
                this.A00.setLooping(true);
                this.A00.prepareAsync();
                setMediaPlayerState(mxu2);
                this.A00.setOnPreparedListener(this);
            } catch (IOException e) {
                C0K8.A05(VideoPreviewView.class, "failed to load video", e);
                A0v = e.getMessage();
                interfaceC58181Pql.DFu(A0v);
            } catch (IllegalStateException e2) {
                A03(e2);
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Illegal state: ");
                A0v = AbstractC166997dE.A0v(this.A04, A1C);
                interfaceC58181Pql.DFu(A0v);
            }
        }
    }

    public void setVolume(float f) {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    public VideoPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = new MXH(this);
        this.A02 = EnumC95184Qe.A03;
    }

    private void A03(IllegalStateException illegalStateException) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("current state: ");
        String A0v = AbstractC166997dE.A0v(this.A04, A1C);
        C0K8.A05(VideoPreviewView.class, "VideoPreviewView_IllegalStateException", illegalStateException);
        C0w9.A06("VideoPreviewView_IllegalStateException", A0v, illegalStateException);
    }

    public final void A06() {
        if (A08()) {
            MXU mxu = this.A04;
            MXU mxu2 = MXU.STARTED;
            if (mxu != mxu2 && this.A03 != null) {
                this.A00.setOnInfoListener(new C50708Ma3(this));
                postDelayed(this.A05, 500L);
                A01();
                try {
                    this.A00.start();
                    setMediaPlayerState(mxu2);
                } catch (IllegalStateException e) {
                    A03(e);
                }
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1413965078);
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
        C0f9.A0D(583309646, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(749203486);
        super.onDetachedFromWindow();
        A05();
        C0f9.A0D(1492552835, A06);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A01();
    }

    public void setScaleType(EnumC95184Qe enumC95184Qe) {
        this.A02 = enumC95184Qe;
    }

    public VideoPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoPreviewView(Context context) {
        this(context, null);
    }
}
