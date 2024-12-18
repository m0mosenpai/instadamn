package com.facebook.ffmpeg;

import X.C66014TyA;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public class FFMpegMediaDemuxer {
    public final C66014TyA mFFMpegLib;
    public boolean mIsInitialized;
    public long mNativeContext;
    public final Options mOptions;
    public final String mPath;

    /* loaded from: classes11.dex */
    public class Options {
        public boolean ensureSafeFileNames = false;
        public boolean autoConvertPacketData = false;
    }

    private native boolean nativeAdvance();

    private native void nativeFinalize();

    private native long nativeGetSampleDuration();

    private native int nativeGetSampleFlags();

    private native long nativeGetSampleTime();

    private native int nativeGetSampleTrackIndex();

    private native int nativeGetTrackCount();

    private native FFMpegMediaFormat nativeGetTrackFormat(int i);

    private native void nativeInit(String str, Options options);

    private native int nativeReadSampleData(ByteBuffer byteBuffer, int i);

    private native void nativeRelease();

    private native void nativeSeekTo(int i, long j, int i2);

    private native void nativeSelectTrack(int i);

    private native void nativeUnselectTrack(int i);

    public int readSampleData(ByteBuffer byteBuffer, int i) {
        byteBuffer.getClass();
        return nativeReadSampleData(byteBuffer, 0);
    }

    public FFMpegMediaDemuxer initialize() {
        this.mFFMpegLib.A00();
        nativeInit(this.mPath, this.mOptions);
        this.mIsInitialized = true;
        return this;
    }

    public void release() {
        if (this.mIsInitialized) {
            nativeRelease();
            this.mIsInitialized = false;
        }
    }

    public FFMpegMediaDemuxer(C66014TyA c66014TyA, String str, Options options) {
        this.mFFMpegLib = c66014TyA;
        this.mPath = str;
        this.mOptions = options;
    }

    public boolean advance() {
        return nativeAdvance();
    }

    public void finalize() {
        nativeFinalize();
    }

    public long getSampleDuration() {
        return nativeGetSampleDuration();
    }

    public int getSampleFlags() {
        return nativeGetSampleFlags();
    }

    public long getSampleTime() {
        return nativeGetSampleTime();
    }

    public int getSampleTrackIndex() {
        return nativeGetSampleTrackIndex();
    }

    public int getTrackCount() {
        return nativeGetTrackCount();
    }

    public FFMpegMediaFormat getTrackFormat(int i) {
        return nativeGetTrackFormat(i);
    }

    public void selectTrack(int i) {
        nativeSelectTrack(i);
    }

    public void seekTo(int i, long j, int i2) {
        nativeSeekTo(i, j, i2);
    }

    public FFMpegMediaDemuxer(C66014TyA c66014TyA, String str) {
        this(c66014TyA, str, null);
    }
}
