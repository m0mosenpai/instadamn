package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.RegularImmutableSet;

/* loaded from: classes10.dex */
public final class SIE {
    public final ContentResolver A00;
    public final C62538SFp A01;
    public final C1Tc A02;
    public final C1Ro A03;
    public final InterfaceC216113n A04;

    public SIE(ContentResolver contentResolver, final Context context, C1Tc c1Tc, final C1Ro c1Ro) {
        this.A02 = c1Tc;
        this.A00 = contentResolver;
        this.A03 = c1Ro;
        final PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            CompactHashMap compactHashMap = new CompactHashMap();
            Signature signature = C1SC.A00;
            AbstractC58321PtD.A14("com.facebook.appmanager", signature, compactHashMap).add(signature);
            Signature signature2 = C1SC.A01;
            AbstractC58321PtD.A14("com.facebook.appmanager", signature2, compactHashMap).add(signature2);
            Signature signature3 = C1SC.A02;
            AbstractC58321PtD.A14("com.facebook.appmanager", signature3, compactHashMap).add(signature3);
            this.A01 = new C62538SFp(packageManager, ImmutableSetMultimap.A00(compactHashMap.entrySet()), RegularImmutableSet.A03);
            this.A04 = new C216213o(new InterfaceC216113n() { // from class: X.T89
                @Override // X.InterfaceC216113n
                public final Object get() {
                    return new SBC(context, packageManager, c1Ro);
                }
            });
            return;
        }
        throw AbstractC166987dD.A14("PackageManager is null");
    }
}
