package X;

import com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessor;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.Vkb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69267Vkb {
    public InterfaceC71947XBy A00;
    public final int A01;
    public final long A02;
    public final AudioPostProcessor A03;
    public volatile boolean A04 = false;

    public C69267Vkb(float f, int i, int i2, int i3) {
        this.A01 = i;
        this.A03 = new AudioPostProcessor(i, (i2 / i3) / 2, f, 3, i3);
        this.A02 = Math.round((r2 * DexStore.MS_IN_NS) / f);
    }
}
