package com.facebook.common.locale;

import X.AnonymousClass001;
import X.C206149Aw;
import X.W2G;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* loaded from: classes3.dex */
public class Country extends LocaleMember {
    public static final W2G A02 = new W2G();
    public static final Country A01 = A00(null, "US");
    public static final Country A00 = A00(null, "IN");
    public static final Parcelable.Creator CREATOR = new C206149Aw(19);

    public static Country A00(Country country, String str) {
        LocaleMember localeMember;
        try {
            W2G w2g = A02;
            if (str != null) {
                int length = str.length();
                if (length == 2) {
                    localeMember = W2G.A00(w2g, str);
                } else if (length == 3) {
                    Object obj = w2g.A00.get();
                    obj.getClass();
                    localeMember = (LocaleMember) ((ImmutableMap) obj).get(str);
                    if (localeMember == null) {
                        throw new IllegalArgumentException(AnonymousClass001.A0R("Not a legal code: ", str));
                    }
                }
                return (Country) localeMember;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0R("Not a legal code: ", str));
        } catch (IllegalArgumentException e) {
            if (country != null) {
                return country;
            }
            throw e;
        }
    }
}
