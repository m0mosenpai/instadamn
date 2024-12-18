package org.webrtc;

import X.AbstractC166987dD;
import android.content.Context;
import android.os.Process;
import java.util.List;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.audio.AudioDeviceModule;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes12.dex */
public class PeerConnectionFactory {
    public static final String TAG = "PeerConnectionFactory";
    public static final String TRIAL_ENABLED = "Enabled";
    public static final String VIDEO_CAPTURER_THREAD_NAME = "VideoCapturerThread";

    @Deprecated
    public static final String VIDEO_FRAME_EMIT_TRIAL = "VideoFrameEmit";
    public static volatile boolean internalTracerInitialized;
    public static ThreadInfo staticNetworkThread;
    public static ThreadInfo staticSignalingThread;
    public static ThreadInfo staticWorkerThread;
    public long nativeFactory;
    public volatile ThreadInfo networkThread;
    public volatile ThreadInfo signalingThread;
    public volatile ThreadInfo workerThread;

    /* loaded from: classes12.dex */
    public class Builder {
        public AudioDecoderFactoryFactory audioDecoderFactoryFactory;
        public AudioDeviceModule audioDeviceModule;
        public AudioEncoderFactoryFactory audioEncoderFactoryFactory;
        public AudioProcessingFactory audioProcessingFactory;
        public FecControllerFactoryFactoryInterface fecControllerFactoryFactory;
        public NetEqFactoryFactory neteqFactoryFactory;
        public NetworkControllerFactoryFactory networkControllerFactoryFactory;
        public NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory;
        public Options options;
        public VideoDecoderFactory videoDecoderFactory;
        public VideoEncoderFactory videoEncoderFactory;

        public Builder setAudioDecoderFactoryFactory(AudioDecoderFactoryFactory audioDecoderFactoryFactory) {
            if (audioDecoderFactoryFactory != null) {
                this.audioDecoderFactoryFactory = audioDecoderFactoryFactory;
                return this;
            }
            throw AbstractC166987dD.A12("PeerConnectionFactory.Builder does not accept a null AudioDecoderFactoryFactory.");
        }

        public Builder setAudioEncoderFactoryFactory(AudioEncoderFactoryFactory audioEncoderFactoryFactory) {
            if (audioEncoderFactoryFactory != null) {
                this.audioEncoderFactoryFactory = audioEncoderFactoryFactory;
                return this;
            }
            throw AbstractC166987dD.A12("PeerConnectionFactory.Builder does not accept a null AudioEncoderFactoryFactory.");
        }

        public Builder setAudioProcessingFactory(AudioProcessingFactory audioProcessingFactory) {
            if (audioProcessingFactory != null) {
                this.audioProcessingFactory = audioProcessingFactory;
                return this;
            }
            throw AbstractC166987dD.A15("PeerConnectionFactory builder does not accept a null AudioProcessingFactory.");
        }

        public PeerConnectionFactory createPeerConnectionFactory() {
            long createNative;
            long createNative2;
            long createNativeNetworkControllerFactory;
            long createNativeNetworkStatePredictorFactory;
            PeerConnectionFactory.checkInitializeHasBeenCalled();
            AudioDeviceModule audioDeviceModule = this.audioDeviceModule;
            if (audioDeviceModule == null) {
                audioDeviceModule = new JavaAudioDeviceModule.Builder(ContextUtils.applicationContext).createAudioDeviceModule();
                this.audioDeviceModule = audioDeviceModule;
            }
            Context context = ContextUtils.applicationContext;
            Options options = this.options;
            long nativeAudioDeviceModulePointer = audioDeviceModule.getNativeAudioDeviceModulePointer();
            long createNativeAudioEncoderFactory = this.audioEncoderFactoryFactory.createNativeAudioEncoderFactory();
            long createNativeAudioDecoderFactory = this.audioDecoderFactoryFactory.createNativeAudioDecoderFactory();
            VideoEncoderFactory videoEncoderFactory = this.videoEncoderFactory;
            VideoDecoderFactory videoDecoderFactory = this.videoDecoderFactory;
            AudioProcessingFactory audioProcessingFactory = this.audioProcessingFactory;
            long j = 0;
            if (audioProcessingFactory == null) {
                createNative = 0;
            } else {
                createNative = audioProcessingFactory.createNative();
            }
            FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface = this.fecControllerFactoryFactory;
            if (fecControllerFactoryFactoryInterface == null) {
                createNative2 = 0;
            } else {
                createNative2 = fecControllerFactoryFactoryInterface.createNative();
            }
            NetworkControllerFactoryFactory networkControllerFactoryFactory = this.networkControllerFactoryFactory;
            if (networkControllerFactoryFactory == null) {
                createNativeNetworkControllerFactory = 0;
            } else {
                createNativeNetworkControllerFactory = networkControllerFactoryFactory.createNativeNetworkControllerFactory();
            }
            NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory = this.networkStatePredictorFactoryFactory;
            if (networkStatePredictorFactoryFactory == null) {
                createNativeNetworkStatePredictorFactory = 0;
            } else {
                createNativeNetworkStatePredictorFactory = networkStatePredictorFactoryFactory.createNativeNetworkStatePredictorFactory();
            }
            NetEqFactoryFactory netEqFactoryFactory = this.neteqFactoryFactory;
            if (netEqFactoryFactory != null) {
                j = netEqFactoryFactory.createNativeNetEqFactory();
            }
            return PeerConnectionFactory.nativeCreatePeerConnectionFactory(context, options, nativeAudioDeviceModulePointer, createNativeAudioEncoderFactory, createNativeAudioDecoderFactory, videoEncoderFactory, videoDecoderFactory, createNative, createNative2, createNativeNetworkControllerFactory, createNativeNetworkStatePredictorFactory, j);
        }

        public Builder setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
            this.audioDeviceModule = audioDeviceModule;
            return this;
        }

        public Builder setFecControllerFactoryFactoryInterface(FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface) {
            this.fecControllerFactoryFactory = fecControllerFactoryFactoryInterface;
            return this;
        }

        public Builder setNetEqFactoryFactory(NetEqFactoryFactory netEqFactoryFactory) {
            this.neteqFactoryFactory = netEqFactoryFactory;
            return this;
        }

        public Builder setNetworkControllerFactoryFactory(NetworkControllerFactoryFactory networkControllerFactoryFactory) {
            this.networkControllerFactoryFactory = networkControllerFactoryFactory;
            return this;
        }

        public Builder setNetworkStatePredictorFactoryFactory(NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory) {
            this.networkStatePredictorFactoryFactory = networkStatePredictorFactoryFactory;
            return this;
        }

        public Builder setOptions(Options options) {
            this.options = options;
            return this;
        }

        public Builder setVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory) {
            this.videoDecoderFactory = videoDecoderFactory;
            return this;
        }

        public Builder setVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory) {
            this.videoEncoderFactory = videoEncoderFactory;
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [org.webrtc.AudioEncoderFactoryFactory, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v1, types: [org.webrtc.AudioDecoderFactoryFactory, java.lang.Object] */
        public Builder() {
            this.audioEncoderFactoryFactory = new Object();
            this.audioDecoderFactoryFactory = new Object();
        }
    }

    /* loaded from: classes12.dex */
    public class InitializationOptions {
        public final Context applicationContext;
        public final boolean enableInternalTracer;
        public final String fieldTrials;
        public Loggable loggable;
        public Logging.Severity loggableSeverity;
        public final NativeLibraryLoader nativeLibraryLoader;
        public final String nativeLibraryName;

        /* loaded from: classes12.dex */
        public class Builder {
            public final Context applicationContext;
            public boolean enableInternalTracer;
            public Loggable loggable;
            public Logging.Severity loggableSeverity;
            public String fieldTrials = "";
            public NativeLibraryLoader nativeLibraryLoader = new Object();
            public String nativeLibraryName = "jingle_peerconnection_so";

            public InitializationOptions createInitializationOptions() {
                return new InitializationOptions(this.applicationContext, this.fieldTrials, this.enableInternalTracer, this.nativeLibraryLoader, this.nativeLibraryName, this.loggable, this.loggableSeverity);
            }

            public Builder setInjectableLogger(Loggable loggable, Logging.Severity severity) {
                this.loggable = loggable;
                this.loggableSeverity = severity;
                return this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [org.webrtc.NativeLibraryLoader, java.lang.Object] */
            public Builder(Context context) {
                this.applicationContext = context;
            }

            public Builder setEnableInternalTracer(boolean z) {
                this.enableInternalTracer = z;
                return this;
            }

            public Builder setFieldTrials(String str) {
                this.fieldTrials = str;
                return this;
            }

            public Builder setNativeLibraryLoader(NativeLibraryLoader nativeLibraryLoader) {
                this.nativeLibraryLoader = nativeLibraryLoader;
                return this;
            }

            public Builder setNativeLibraryName(String str) {
                this.nativeLibraryName = str;
                return this;
            }
        }

        public static Builder builder(Context context) {
            return new Builder(context);
        }

        public InitializationOptions(Context context, String str, boolean z, NativeLibraryLoader nativeLibraryLoader, String str2, Loggable loggable, Logging.Severity severity) {
            this.applicationContext = context;
            this.fieldTrials = str;
            this.enableInternalTracer = z;
            this.nativeLibraryLoader = nativeLibraryLoader;
            this.nativeLibraryName = str2;
            this.loggable = loggable;
            this.loggableSeverity = severity;
        }
    }

    public static void initializeInternalTracer() {
        internalTracerInitialized = true;
        nativeInitializeInternalTracer();
    }

    public static native long nativeCreateAudioSource(long j, MediaConstraints mediaConstraints);

    public static native long nativeCreateAudioTrack(long j, String str, long j2);

    public static native long nativeCreateLocalMediaStream(long j, String str);

    public static native long nativeCreatePeerConnection(long j, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2, SSLCertificateVerifier sSLCertificateVerifier);

    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(Context context, Options options, long j, long j2, long j3, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j4, long j5, long j6, long j7, long j8);

    public static native long nativeCreateVideoSource(long j, boolean z, boolean z2);

    public static native long nativeCreateVideoTrack(long j, String str, long j2);

    public static native void nativeDeleteLoggable();

    public static native String nativeFindFieldTrialsFullName(String str);

    public static native void nativeFreeFactory(long j);

    public static native long nativeGetNativePeerConnectionFactory(long j);

    public static native RtpCapabilities nativeGetRtpReceiverCapabilities(long j, MediaStreamTrack.MediaType mediaType);

    public static native RtpCapabilities nativeGetRtpSenderCapabilities(long j, MediaStreamTrack.MediaType mediaType);

    public static native void nativeInitializeAndroidGlobals();

    public static native void nativeInitializeFieldTrials(String str);

    public static native void nativeInitializeInternalTracer();

    public static native void nativeInjectLoggable(JNILogging jNILogging, int i);

    public static native void nativePrintStackTrace(int i);

    public static native void nativeShutdownInternalTracer();

    public static native boolean nativeStartAecDump(long j, int i, int i2);

    public static native boolean nativeStartInternalTracingCapture(String str);

    public static native void nativeStopAecDump(long j);

    public static native void nativeStopInternalTracingCapture();

    public static void shutdownInternalTracer() {
        internalTracerInitialized = false;
        nativeShutdownInternalTracer();
    }

    /* loaded from: classes12.dex */
    public class Options {
        public static final int ADAPTER_TYPE_ANY = 32;
        public static final int ADAPTER_TYPE_CELLULAR = 4;
        public static final int ADAPTER_TYPE_ETHERNET = 1;
        public static final int ADAPTER_TYPE_LOOPBACK = 16;
        public static final int ADAPTER_TYPE_UNKNOWN = 0;
        public static final int ADAPTER_TYPE_VPN = 8;
        public static final int ADAPTER_TYPE_WIFI = 2;
        public boolean disableEncryption;
        public boolean disableNetworkMonitor;
        public int networkIgnoreMask;

        public boolean getDisableEncryption() {
            return this.disableEncryption;
        }

        public boolean getDisableNetworkMonitor() {
            return this.disableNetworkMonitor;
        }

        public int getNetworkIgnoreMask() {
            return this.networkIgnoreMask;
        }
    }

    /* loaded from: classes12.dex */
    public class ThreadInfo {
        public final Thread thread;
        public final int tid;

        public ThreadInfo(Thread thread, int i) {
            this.thread = thread;
            this.tid = i;
        }

        public static ThreadInfo getCurrent() {
            return new ThreadInfo(Thread.currentThread(), Process.myTid());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void checkPeerConnectionFactoryExists() {
        if (this.nativeFactory != 0) {
        } else {
            throw AbstractC166987dD.A14("PeerConnectionFactory has been disposed.");
        }
    }

    public static void initialize(InitializationOptions initializationOptions) {
        ContextUtils.initialize(initializationOptions.applicationContext);
        NativeLibrary.initialize(initializationOptions.nativeLibraryLoader, initializationOptions.nativeLibraryName);
        nativeInitializeAndroidGlobals();
        nativeInitializeFieldTrials(initializationOptions.fieldTrials);
        if (initializationOptions.enableInternalTracer && !internalTracerInitialized) {
            initializeInternalTracer();
        }
        Loggable loggable = initializationOptions.loggable;
        if (loggable != null) {
            Logging.Severity severity = initializationOptions.loggableSeverity;
            Logging.injectLoggable(loggable, severity);
            nativeInjectLoggable(new JNILogging(loggable), severity.ordinal());
        } else {
            Logging.deleteInjectedLoggable();
            nativeDeleteLoggable();
        }
    }

    public static void printStackTrace(ThreadInfo threadInfo, boolean z) {
        if (threadInfo != null) {
            StackTraceElement[] stackTrace = threadInfo.thread.getStackTrace();
            int length = stackTrace.length;
            if (length > 0) {
                boolean z2 = Logging.loggingEnabled;
                int i = 0;
                do {
                    stackTrace[i].toString();
                    i++;
                } while (i < length);
            }
            if (z) {
                boolean z3 = Logging.loggingEnabled;
                Process.myPid();
                nativePrintStackTrace(threadInfo.tid);
            }
        }
    }

    @Deprecated
    public static void printStackTraces() {
        printStackTrace(staticNetworkThread, false);
        printStackTrace(staticWorkerThread, false);
        printStackTrace(staticSignalingThread, false);
    }

    public PeerConnection createPeerConnection(List list, PeerConnection.Observer observer) {
        return createPeerConnectionInternal(new PeerConnection.RTCConfiguration(list), null, observer, null);
    }

    public void printInternalStackTraces(boolean z) {
        printStackTrace(this.signalingThread, z);
        printStackTrace(this.workerThread, z);
        printStackTrace(this.networkThread, z);
    }

    public PeerConnectionFactory(long j) {
        checkInitializeHasBeenCalled();
        if (j != 0) {
            this.nativeFactory = j;
            return;
        }
        throw AbstractC166987dD.A18("Failed to initialize PeerConnectionFactory!");
    }

    public static void checkInitializeHasBeenCalled() {
        if (NativeLibrary.isLoaded() && ContextUtils.applicationContext != null) {
        } else {
            throw AbstractC166987dD.A14("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }

    public static String fieldTrialsFindFullName(String str) {
        if (NativeLibrary.isLoaded()) {
            return nativeFindFieldTrialsFullName(str);
        }
        return "";
    }

    private void onNetworkThreadReady() {
        this.networkThread = ThreadInfo.getCurrent();
        staticNetworkThread = this.networkThread;
        boolean z = Logging.loggingEnabled;
    }

    private void onSignalingThreadReady() {
        this.signalingThread = ThreadInfo.getCurrent();
        staticSignalingThread = this.signalingThread;
        boolean z = Logging.loggingEnabled;
    }

    private void onWorkerThreadReady() {
        this.workerThread = ThreadInfo.getCurrent();
        staticWorkerThread = this.workerThread;
        boolean z = Logging.loggingEnabled;
    }

    public static boolean startInternalTracingCapture(String str) {
        return nativeStartInternalTracingCapture(str);
    }

    public static void stopInternalTracingCapture() {
        nativeStopInternalTracingCapture();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.webrtc.AudioSource, org.webrtc.MediaSource] */
    public AudioSource createAudioSource(MediaConstraints mediaConstraints) {
        checkPeerConnectionFactoryExists();
        return new MediaSource(nativeCreateAudioSource(this.nativeFactory, mediaConstraints));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.webrtc.MediaStreamTrack, org.webrtc.AudioTrack] */
    public AudioTrack createAudioTrack(String str, AudioSource audioSource) {
        checkPeerConnectionFactoryExists();
        return new MediaStreamTrack(nativeCreateAudioTrack(this.nativeFactory, str, audioSource.getNativeMediaSource()));
    }

    public MediaStream createLocalMediaStream(String str) {
        checkPeerConnectionFactoryExists();
        return new MediaStream(nativeCreateLocalMediaStream(this.nativeFactory, str));
    }

    public PeerConnection createPeerConnectionInternal(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer, SSLCertificateVerifier sSLCertificateVerifier) {
        checkPeerConnectionFactoryExists();
        long nativeCreatePeerConnectionObserver = PeerConnection.nativeCreatePeerConnectionObserver(observer);
        if (nativeCreatePeerConnectionObserver == 0) {
            return null;
        }
        long nativeCreatePeerConnection = nativeCreatePeerConnection(this.nativeFactory, rTCConfiguration, mediaConstraints, nativeCreatePeerConnectionObserver, sSLCertificateVerifier);
        if (nativeCreatePeerConnection == 0) {
            return null;
        }
        return new PeerConnection(nativeCreatePeerConnection);
    }

    public VideoSource createVideoSource(boolean z, boolean z2) {
        checkPeerConnectionFactoryExists();
        return new VideoSource(nativeCreateVideoSource(this.nativeFactory, z, z2));
    }

    public VideoTrack createVideoTrack(String str, VideoSource videoSource) {
        checkPeerConnectionFactoryExists();
        return new VideoTrack(nativeCreateVideoTrack(this.nativeFactory, str, videoSource.getNativeMediaSource()));
    }

    public void dispose() {
        checkPeerConnectionFactoryExists();
        nativeFreeFactory(this.nativeFactory);
        this.networkThread = null;
        this.workerThread = null;
        this.signalingThread = null;
        this.nativeFactory = 0L;
    }

    public long getNativeOwnedFactoryAndThreads() {
        checkPeerConnectionFactoryExists();
        return this.nativeFactory;
    }

    public long getNativePeerConnectionFactory() {
        checkPeerConnectionFactoryExists();
        return nativeGetNativePeerConnectionFactory(this.nativeFactory);
    }

    public RtpCapabilities getRtpReceiverCapabilities(MediaStreamTrack.MediaType mediaType) {
        checkPeerConnectionFactoryExists();
        return nativeGetRtpReceiverCapabilities(this.nativeFactory, mediaType);
    }

    public RtpCapabilities getRtpSenderCapabilities(MediaStreamTrack.MediaType mediaType) {
        checkPeerConnectionFactoryExists();
        return nativeGetRtpSenderCapabilities(this.nativeFactory, mediaType);
    }

    public boolean startAecDump(int i, int i2) {
        checkPeerConnectionFactoryExists();
        return nativeStartAecDump(this.nativeFactory, i, i2);
    }

    public void stopAecDump() {
        checkPeerConnectionFactoryExists();
        nativeStopAecDump(this.nativeFactory);
    }

    @Deprecated
    public static void initializeFieldTrials(String str) {
        nativeInitializeFieldTrials(str);
    }

    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnectionDependencies peerConnectionDependencies) {
        return createPeerConnectionInternal(rTCConfiguration, null, peerConnectionDependencies.observer, peerConnectionDependencies.sslCertificateVerifier);
    }

    public VideoSource createVideoSource(boolean z) {
        return createVideoSource(z, true);
    }

    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer) {
        return createPeerConnectionInternal(rTCConfiguration, null, observer, null);
    }

    @Deprecated
    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        return createPeerConnectionInternal(rTCConfiguration, mediaConstraints, observer, null);
    }

    @Deprecated
    public PeerConnection createPeerConnection(List list, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        return createPeerConnectionInternal(new PeerConnection.RTCConfiguration(list), mediaConstraints, observer, null);
    }
}
