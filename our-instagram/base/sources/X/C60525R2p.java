package X;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.R2p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60525R2p extends AbstractC62479SDg {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60525R2p(NativeAnimatedModule nativeAnimatedModule, ReadableMap readableMap, int i, int i2) {
        super(nativeAnimatedModule);
        this.A00 = i2;
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A03 = readableMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60525R2p(NativeAnimatedModule nativeAnimatedModule, ReadableArray readableArray, int i) {
        super(nativeAnimatedModule);
        this.A00 = 1;
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A03 = readableArray;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60525R2p(NativeAnimatedModule nativeAnimatedModule, Callback callback, int i) {
        super(nativeAnimatedModule);
        this.A00 = 0;
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A03 = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60525R2p(InterfaceC65350Tid interfaceC65350Tid, NativeAnimatedModule nativeAnimatedModule, int i) {
        super(nativeAnimatedModule);
        this.A00 = 4;
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A03 = interfaceC65350Tid;
    }
}
