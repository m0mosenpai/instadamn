package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.C14360o3;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import android.view.Surface;

/* loaded from: classes5.dex */
public interface IRawVideoSource {

    /* loaded from: classes5.dex */
    public abstract class Output {
        public InterfaceC16620sF onOutputParams;

        public final void setOutputParams(Integer num, IVideoSize iVideoSize) {
            InterfaceC16620sF interfaceC16620sF = this.onOutputParams;
            if (interfaceC16620sF != null) {
                interfaceC16620sF.invoke(num, iVideoSize);
            }
        }

        public final InterfaceC16620sF getOnOutputParams() {
            return this.onOutputParams;
        }

        public final void setOnOutputParams(InterfaceC16620sF interfaceC16620sF) {
            this.onOutputParams = interfaceC16620sF;
        }
    }

    /* loaded from: classes5.dex */
    public final class SurfaceOutput extends Output {
        public InterfaceC16620sF onBitmapFrameListenerAdded;
        public final Surface surface;

        public SurfaceOutput(Surface surface) {
            C14360o3.A0B(surface, 1);
            this.surface = surface;
        }

        public final void addBitmapFrameListener(InterfaceC16660sJ interfaceC16660sJ, float f) {
            C14360o3.A0B(interfaceC16660sJ, 0);
            InterfaceC16620sF interfaceC16620sF = this.onBitmapFrameListenerAdded;
            if (interfaceC16620sF != null) {
                interfaceC16620sF.invoke(interfaceC16660sJ, Float.valueOf(f));
            }
        }

        public static /* synthetic */ void addBitmapFrameListener$default(SurfaceOutput surfaceOutput, InterfaceC16660sJ interfaceC16660sJ, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 1.0f;
            }
            surfaceOutput.addBitmapFrameListener(interfaceC16660sJ, f);
        }

        public final InterfaceC16620sF getOnBitmapFrameListenerAdded() {
            return this.onBitmapFrameListenerAdded;
        }

        public final Surface getSurface() {
            return this.surface;
        }

        public final void setOnBitmapFrameListenerAdded(InterfaceC16620sF interfaceC16620sF) {
            this.onBitmapFrameListenerAdded = interfaceC16620sF;
        }
    }

    void addOutput(Output output);

    void releaseBlocking();

    void removeOutput(Output output);

    void startBlocking();

    void stopBlocking();

    /* loaded from: classes5.dex */
    public final class FrameOutput extends Output {
        public final InterfaceC16660sJ onFrame;

        public FrameOutput(InterfaceC16660sJ interfaceC16660sJ) {
            C14360o3.A0B(interfaceC16660sJ, 1);
            this.onFrame = interfaceC16660sJ;
        }

        public final InterfaceC16660sJ getOnFrame() {
            return this.onFrame;
        }
    }
}
