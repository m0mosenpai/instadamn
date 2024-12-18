package X;

import android.media.MediaCodecInfo;

/* renamed from: X.Tcv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65066Tcv extends C0YY implements InterfaceC16660sJ {
    public static final C65066Tcv A00 = new C65066Tcv();

    public C65066Tcv() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = (MediaCodecInfo.CodecProfileLevel) obj;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('(');
        A1C.append(codecProfileLevel.profile);
        A1C.append(',');
        return AbstractC25236BEt.A0Z(A1C, codecProfileLevel.level);
    }
}
