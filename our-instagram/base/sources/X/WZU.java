package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;

/* loaded from: classes11.dex */
public final class WZU implements XCA {
    public C68923VeN A00 = new Object();
    public final MediaComposition A01;
    public final U7T A02;
    public final XD9 A03;

    @Override // X.XCA
    public final InterfaceC71997XEl AM0() {
        return new C66044Tyg(this);
    }

    @Override // X.XCA
    public final InterfaceC72004XEs AM8() {
        return new C66036TyY(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.VeN, java.lang.Object] */
    public WZU(MediaComposition mediaComposition, U7T u7t, XD9 xd9) {
        this.A02 = u7t;
        this.A03 = xd9;
        this.A01 = mediaComposition;
        EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
        if (mediaComposition != null && mediaComposition.A07(enumC1125356h) != null && mediaComposition.A07(enumC1125356h).size() > 1 && !xd9.CLF()) {
            throw new IllegalArgumentException("FrameRender should have media graph support for MediaComposition", new Throwable());
        }
    }
}
