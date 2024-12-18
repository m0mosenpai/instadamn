package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;

/* renamed from: X.Tbd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65014Tbd extends C0YY implements InterfaceC16820sZ {
    public static final C65014Tbd A00 = new C65014Tbd();

    public C65014Tbd() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        ArrayList A10 = AbstractC31174DnI.A10(codecInfos);
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            C63329Shd c63329Shd = C63329Shd.A00;
            C14360o3.A0A(mediaCodecInfo);
            if (C63329Shd.A00(mediaCodecInfo) && mediaCodecInfo.isEncoder()) {
                A10.add(mediaCodecInfo);
            }
        }
        return A10;
    }
}
