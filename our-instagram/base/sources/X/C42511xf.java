package X;

import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42511xf {
    public final Map A00 = new LinkedHashMap();
    public final Map A01 = new LinkedHashMap();

    public final synchronized C43121yf A00(String str) {
        C43121yf c43121yf;
        C09530e4 c09530e4 = (C09530e4) this.A00.get(str);
        if (c09530e4 != null) {
            c43121yf = (C43121yf) c09530e4.A00;
        } else {
            c43121yf = null;
        }
        return c43121yf;
    }

    public final synchronized C43121yf A01(String str) {
        C43121yf c43121yf;
        C09530e4 c09530e4 = (C09530e4) this.A01.get(str);
        if (c09530e4 != null) {
            c43121yf = (C43121yf) c09530e4.A00;
        } else {
            c43121yf = null;
        }
        return c43121yf;
    }

    public final synchronized String A02(String str) {
        String str2;
        C09530e4 c09530e4 = (C09530e4) this.A00.get(str);
        if (c09530e4 != null) {
            str2 = (String) c09530e4.A01;
        } else {
            str2 = null;
        }
        return str2;
    }

    public final synchronized String A03(String str) {
        String str2;
        C09530e4 c09530e4 = (C09530e4) this.A01.get(str);
        if (c09530e4 != null) {
            str2 = (String) c09530e4.A01;
        } else {
            str2 = null;
        }
        return str2;
    }

    public final synchronized boolean A04(C43121yf c43121yf) {
        String str;
        boolean z;
        String str2;
        ImageUrl BRz;
        ImageCacheKey imageCacheKey;
        C14360o3.A0B(c43121yf, 0);
        Map map = this.A00;
        C3ZM c3zm = c43121yf.A01;
        InterfaceC59502nt interfaceC59502nt = c3zm.A00;
        if (interfaceC59502nt != null && (BRz = interfaceC59502nt.BRz()) != null && (imageCacheKey = (ImageCacheKey) BRz.AjX()) != null) {
            str = imageCacheKey.A03;
        } else {
            str = null;
        }
        if (!map.containsKey(str)) {
            Map map2 = this.A01;
            if (c3zm.A01 != null) {
                str2 = c3zm.A02;
            } else {
                str2 = null;
            }
            boolean containsKey = map2.containsKey(str2);
            z = false;
            if (containsKey) {
            }
        }
        z = true;
        return z;
    }
}
