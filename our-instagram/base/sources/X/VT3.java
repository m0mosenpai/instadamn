package X;

import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VT3 {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.instagram.discovery.mediamap.model.MediaMapPin] */
    public static MediaMapPin parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("lat".equals(A0s)) {
                    obj.A0A = Double.valueOf(c16l.A0U());
                } else if ("lng".equals(A0s)) {
                    obj.A0B = Double.valueOf(c16l.A0U());
                } else if ("location".equals(A0s)) {
                    obj.A09 = AbstractC84373pU.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("media_id".equals(A0s)) {
                        obj.A0D = AbstractC167017dG.A0m(c16l);
                    } else if ("thumbnail_url".equals(A0s)) {
                        obj.A05 = AbstractC222616c.A00(c16l);
                    } else if ("page_info".equals(A0s)) {
                        obj.A06 = AbstractC68493VSy.parseFromJson(c16l);
                    } else if ("media_taken_at_seconds".equals(A0s)) {
                        obj.A01 = c16l.A0y();
                    } else if ("rank".equals(A0s)) {
                        obj.A00 = c16l.A1D();
                    } else if (AbstractC111324zv.A00(72).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                MediaMapPinPreview parseFromJson = VT2.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A0E = arrayList;
                    } else if ("formatted_media_count".equals(A0s)) {
                        obj.A0C = AbstractC167017dG.A0m(c16l);
                    } else if ("thumbnail_override".equals(A0s)) {
                        obj.A04 = AbstractC222616c.A00(c16l);
                    } else if ("story".equals(A0s)) {
                        obj.A08 = AbstractC38741r6.parseFromJson(c16l);
                    } else if ("pin_type".equals(A0s)) {
                        EnumC68146VDo enumC68146VDo = (EnumC68146VDo) EnumC68146VDo.A01.get(c16l.A1Q());
                        if (enumC68146VDo == null) {
                            enumC68146VDo = EnumC68146VDo.A07;
                        }
                        obj.A07 = enumC68146VDo;
                    } else if ("clip".equals(A0s)) {
                        obj.A03 = AbstractC111024zE.parseFromJson(c16l);
                    }
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
