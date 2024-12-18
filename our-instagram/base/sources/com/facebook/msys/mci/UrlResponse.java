package com.facebook.msys.mci;

import X.C2NJ;
import android.util.Pair;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes.dex */
public class UrlResponse {
    public static final UrlResponse $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(UrlRequest urlRequest, int i, String[] strArr, String[] strArr2);

    static {
        C2NJ.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UrlResponse(UrlRequest urlRequest, int i, Map map) {
        urlRequest.getClass();
        NetworkUtils networkUtils = NetworkUtils.$redex_init_class;
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            strArr[i2] = entry.getKey();
            strArr2[i2] = entry.getValue();
            i2++;
        }
        Pair pair = new Pair(strArr, strArr2);
        this.mNativeHolder = initNativeHolder(urlRequest, i, (String[]) pair.first, (String[]) pair.second);
    }
}
