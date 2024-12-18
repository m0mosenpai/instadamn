package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TbR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65002TbR extends C0YY implements InterfaceC16820sZ {
    public static final C65002TbR A00 = new C65002TbR();

    public C65002TbR() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        List list;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        ArrayList A10 = AbstractC31174DnI.A10(codecInfos);
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                list = C63394SjK.A01;
                if (list.contains(mediaCodecInfo.getCanonicalName())) {
                    A10.add(mediaCodecInfo);
                }
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A10);
        Iterator it = A10.iterator();
        while (it.hasNext()) {
            A0q.add(((MediaCodecInfo) it.next()).getCanonicalName());
        }
        return A0q;
    }
}
