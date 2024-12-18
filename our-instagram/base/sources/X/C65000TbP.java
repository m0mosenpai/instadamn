package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TbP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65000TbP extends C0YY implements InterfaceC16820sZ {
    public static final C65000TbP A00 = new C65000TbP();

    public C65000TbP() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        ArrayList A10 = AbstractC31174DnI.A10(codecInfos);
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            String canonicalName = mediaCodecInfo.getCanonicalName();
            C14360o3.A07(canonicalName);
            if (AbstractC001900j.A0a(canonicalName, "dv", false) || AbstractC001900j.A0a(canonicalName, "dolby", false)) {
                A10.add(mediaCodecInfo);
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
