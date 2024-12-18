package X;

import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5nY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126375nY extends C40791um {
    public final UrlResponse A00;
    public final C3JY A01;

    public C126375nY(UrlRequest urlRequest, C3JY c3jy) {
        UrlResponse urlResponse = UrlResponse.$redex_init_class;
        int i = c3jy.A02;
        List list = c3jy.A04;
        C23781El[] c23781ElArr = (C23781El[]) list.toArray(new C23781El[list.size()]);
        HashMap hashMap = new HashMap(c23781ElArr.length);
        for (C23781El c23781El : c23781ElArr) {
            hashMap.put(c23781El.A00, c23781El.A01);
        }
        this.A00 = new UrlResponse(urlRequest, i, hashMap);
        this.A01 = c3jy;
        this.mStatusCode = i;
    }
}
