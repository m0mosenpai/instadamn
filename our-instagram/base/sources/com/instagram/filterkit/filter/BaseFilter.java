package com.instagram.filterkit.filter;

import X.AbstractC31173DnH;
import X.C14360o3;
import android.os.Parcel;
import com.instagram.filterkit.filter.intf.IgFilter;
import com.instagram.filterkit.filter.resize.LanczosFilter;

/* loaded from: classes12.dex */
public abstract class BaseFilter implements IgFilter {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c9, code lost:
    
        if (r2 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x05c1, code lost:
    
        if (r1 != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0659, code lost:
    
        if (r2 != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r2 != 4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
    
        if (r2 != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02a5, code lost:
    
        if (r13 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02d8, code lost:
    
        if (r14 != null) goto L160;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    @Override // com.instagram.filterkit.filter.intf.IgFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EGY(X.YPq r27, X.InterfaceC197718oi r28, X.YRL r29) {
        /*
            Method dump skipped, instructions count: 1829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.filterkit.filter.BaseFilter.EGY(X.YPq, X.8oi, X.YRL):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        if (this instanceof LanczosFilter) {
            i2 = ((LanczosFilter) this).A0D;
        } else {
            if (!(this instanceof IdentityFilter)) {
                return;
            }
            IdentityFilter identityFilter = (IdentityFilter) this;
            parcel.writeParcelable(identityFilter.A04, i);
            parcel.writeInt(identityFilter.A03 ? 1 : 0);
            i2 = identityFilter.A02;
        }
        parcel.writeInt(i2);
    }

    public String toString() {
        String A0q = AbstractC31173DnH.A0q(this);
        C14360o3.A07(A0q);
        return A0q;
    }
}
