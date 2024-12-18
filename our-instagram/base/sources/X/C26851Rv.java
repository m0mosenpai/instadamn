package X;

import android.content.pm.PackageManager;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.1Rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26851Rv {
    public final PackageManager A00;
    public final C26871Rx A01 = new Object();

    public final HashSet A00(C1TO c1to) {
        java.util.Set emptySet;
        C1TL c1tl;
        java.util.Set emptySet2;
        java.util.Set emptySet3;
        HashSet hashSet = new HashSet();
        if (!c1to.A05) {
            hashSet.add(EnumC101234gf.INSTALLER_DISABLED);
        }
        java.util.Set set = c1to.A04;
        if (set.isEmpty()) {
            hashSet.add(EnumC101234gf.INSTALLER_NO_PRIVILEGES);
        }
        HashSet hashSet2 = new HashSet();
        int ordinal = c1to.A02.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    hashSet2.add(EnumC101234gf.INSTALLER_BAD_SIGNATURE);
                }
                hashSet.addAll(hashSet2);
                return hashSet;
            }
            if (!set.contains(C1TL.INSTALL_PACKAGE_UPDATES)) {
                emptySet3 = Collections.singleton(EnumC101234gf.INSTALLER_MISSING_PRIVILEGE);
            } else {
                emptySet3 = Collections.emptySet();
            }
            hashSet2.addAll(emptySet3);
            c1tl = C1TL.INSTALL;
        } else {
            if (!set.contains(C1TL.INSTALL)) {
                emptySet = Collections.singleton(EnumC101234gf.INSTALLER_MISSING_PRIVILEGE);
            } else {
                emptySet = Collections.emptySet();
            }
            hashSet2.addAll(emptySet);
            c1tl = C1TL.INSTALL_PACKAGE_UPDATES;
        }
        if (set.contains(c1tl)) {
            emptySet2 = Collections.singleton(EnumC101234gf.INSTALLER_INVALID_PRIVILEGE);
        } else {
            emptySet2 = Collections.emptySet();
        }
        hashSet2.addAll(emptySet2);
        hashSet.addAll(hashSet2);
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1Rx] */
    public C26851Rv(PackageManager packageManager) {
        this.A00 = packageManager;
    }
}
