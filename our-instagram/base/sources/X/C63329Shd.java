package X;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Shd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63329Shd {
    public static final C63329Shd A00 = new Object();
    public static final InterfaceC09390do A01;
    public static final InterfaceC09390do A02;
    public static final InterfaceC09390do A03;
    public static final InterfaceC09390do A04;
    public static final InterfaceC09390do A05;
    public static final InterfaceC09390do A06;

    public static final boolean A01(String str) {
        List list;
        try {
            list = (List) A01.getValue();
        } catch (Exception e) {
            C0K8.A0G("EncoderCapabilityUtil", AbstractC111324zv.A00(4527), e);
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String[] supportedTypes = ((MediaCodecInfo) it.next()).getSupportedTypes();
            C14360o3.A07(supportedTypes);
            if (AbstractC009903n.A0O(str, supportedTypes)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A02(String str, java.util.Set set) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            List<MediaCodecInfo> list = (List) A01.getValue();
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (MediaCodecInfo mediaCodecInfo : list) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                C14360o3.A07(supportedTypes);
                if (AbstractC009903n.A0O(str, supportedTypes) && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str)) != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                    ArrayList A17 = AbstractC25225BEi.A17(codecProfileLevelArr.length);
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        AbstractC166997dE.A1W(A17, codecProfileLevel.profile);
                    }
                    if (AbstractC58320PtC.A1W(A17, AbstractC001800i.A0k(set))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            C0K8.A0G("EncoderCapabilityUtil", AbstractC111324zv.A00(5473), e);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Shd, java.lang.Object] */
    static {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        A01 = AbstractC09440dt.A00(enumC09460dv, C65014Tbd.A00);
        A02 = AbstractC09440dt.A00(enumC09460dv, C65015Tbe.A00);
        A05 = AbstractC09440dt.A00(enumC09460dv, C65018Tbh.A00);
        A04 = AbstractC09440dt.A00(enumC09460dv, C65017Tbg.A00);
        A03 = AbstractC09440dt.A00(enumC09460dv, C65016Tbf.A00);
        A06 = AbstractC09440dt.A00(enumC09460dv, C65019Tbi.A00);
    }

    public static final boolean A00(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        String name = mediaCodecInfo.getName();
        C14360o3.A07(name);
        if (!AbstractC43592JPx.A1a("OMX.", 1, name)) {
            return false;
        }
        String name2 = mediaCodecInfo.getName();
        C14360o3.A07(name2);
        if (AbstractC001900j.A0a(name2, "google", false)) {
            return false;
        }
        return true;
    }
}
