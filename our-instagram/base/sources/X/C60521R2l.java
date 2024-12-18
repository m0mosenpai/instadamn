package X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.R2l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60521R2l extends AbstractC62479SDg {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60521R2l(NativeAnimatedModule nativeAnimatedModule, int i, int i2, int i3) {
        super(nativeAnimatedModule);
        this.A00 = i3;
        this.A03 = nativeAnimatedModule;
        switch (i3) {
            case 0:
            case 1:
                this.A02 = i;
                this.A01 = i2;
                break;
            default:
                this.A01 = i;
                this.A02 = i2;
                break;
        }
    }
}
