package com.google.android.gms.common.server.response;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC63007SaV;
import X.C3U5;
import X.SSI;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class FastSafeParcelableJsonResponse extends AbstractC63007SaV implements SafeParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (getClass().isInstance(obj)) {
                    AbstractC63007SaV abstractC63007SaV = (AbstractC63007SaV) obj;
                    Iterator A16 = AbstractC166997dE.A16(A05());
                    while (A16.hasNext()) {
                        FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) A16.next();
                        boolean A06 = A06(fastJsonResponse$Field);
                        boolean A062 = abstractC63007SaV.A06(fastJsonResponse$Field);
                        if (A06) {
                            if (A062 && SSI.A01(A04(fastJsonResponse$Field), abstractC63007SaV.A04(fastJsonResponse$Field))) {
                            }
                        } else if (A062) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator A16 = AbstractC166997dE.A16(A05());
        int i = 0;
        while (A16.hasNext()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) A16.next();
            if (A06(fastJsonResponse$Field)) {
                Object A04 = A04(fastJsonResponse$Field);
                C3U5.A02(A04);
                i = AbstractC166987dD.A0I(A04, i * 31);
            }
        }
        return i;
    }
}
