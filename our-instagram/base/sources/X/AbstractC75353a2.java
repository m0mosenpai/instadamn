package X;

import com.instagram.api.schemas.DirectMediaFallbackUrlIntf;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediasize.VideoVersionIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC75353a2 {
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.instagram.model.mediasize.VideoUrlImpl] */
    public static final ArrayList A00(List list) {
        VideoUrlImpl videoUrlImpl;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoVersionIntf videoVersionIntf = (VideoVersionIntf) it.next();
            if (videoVersionIntf != null && videoVersionIntf.getUrl() != null) {
                DirectMediaFallbackUrlIntf B4E = videoVersionIntf.B4E();
                if (B4E != null) {
                    String url = B4E.getUrl();
                    String id = videoVersionIntf.getId();
                    Integer CHg = videoVersionIntf.CHg();
                    if (CHg != null) {
                        i4 = CHg.intValue();
                    } else {
                        i4 = -1;
                    }
                    Integer BDS = videoVersionIntf.BDS();
                    if (BDS != null) {
                        i5 = BDS.intValue();
                    } else {
                        i5 = -1;
                    }
                    Integer CBl = videoVersionIntf.CBl();
                    if (CBl != null) {
                        i6 = CBl.intValue();
                    } else {
                        i6 = -1;
                    }
                    videoUrlImpl = new VideoUrlImpl(url, i4, i5, i6, id);
                } else {
                    videoUrlImpl = null;
                }
                String url2 = videoVersionIntf.getUrl();
                String id2 = videoVersionIntf.getId();
                Integer CHg2 = videoVersionIntf.CHg();
                if (CHg2 != null) {
                    i = CHg2.intValue();
                } else {
                    i = -1;
                }
                Integer BDS2 = videoVersionIntf.BDS();
                if (BDS2 != null) {
                    i2 = BDS2.intValue();
                } else {
                    i2 = -1;
                }
                Integer CBl2 = videoVersionIntf.CBl();
                if (CBl2 != null) {
                    i3 = CBl2.intValue();
                } else {
                    i3 = -1;
                }
                Long CDQ = videoVersionIntf.CDQ();
                ?? obj = new Object();
                if (url2 != null) {
                    obj.A06 = url2;
                    obj.A05 = id2;
                    obj.A02 = i;
                    obj.A00 = i2;
                    obj.A01 = i3;
                    obj.A04 = CDQ;
                    obj.A03 = videoUrlImpl;
                    arrayList.add(obj);
                } else {
                    throw new RuntimeException("trying to created a VideoUrl object with null url");
                }
            }
        }
        return arrayList;
    }
}
