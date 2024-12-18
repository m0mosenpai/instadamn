package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.RegularImmutableSet;

/* renamed from: X.Ru2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61808Ru2 {
    public static C62538SFp A00(PackageManager packageManager) {
        CompactHashMap compactHashMap = new CompactHashMap();
        Signature[] signatureArr = S9M.A02;
        int i = 0;
        do {
            Signature signature = signatureArr[i];
            AbstractC58321PtD.A14("com.facebook.services", signature, compactHashMap).add(signature);
            i++;
        } while (i < 2);
        return new C62538SFp(packageManager, ImmutableSetMultimap.A00(compactHashMap.entrySet()), RegularImmutableSet.A03);
    }
}
