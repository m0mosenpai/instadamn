package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.84E, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84E {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C195868lW A00(ImmutableList immutableList, UserSession userSession, File file) {
        boolean z;
        C115525Km c115525Km = ((C115475Kh) immutableList.get(0)).A0G;
        int i = c115525Km.A09;
        int i2 = c115525Km.A05;
        int i3 = c115525Km.A07;
        String str = c115525Km.A0D;
        int i4 = c115525Km.A00;
        C1LC it = immutableList.iterator();
        C14360o3.A07(it);
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                C115525Km c115525Km2 = ((C115475Kh) it.next()).A0G;
                if (z || c115525Km2.A08 == 0) {
                    z = true;
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        C195868lW c195868lW = new C195868lW(file, null, str, i, i2, i3, currentTimeMillis, currentTimeMillis, false, !z, true);
        c195868lW.A01 = i4;
        MediaUploadMetadata A02 = c195868lW.A02();
        ArrayList arrayList = new ArrayList();
        C1LC it2 = immutableList.iterator();
        C14360o3.A07(it2);
        while (it2.hasNext()) {
            String str2 = ((C115475Kh) it2.next()).A0G.A0B.A03;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        A02.A03 = AbstractC178007vZ.A02(userSession, "", arrayList);
        try {
            String path = file.getPath();
            C14360o3.A07(path);
            int A00 = ALf.A00(path);
            c195868lW.A07 = A00;
            c195868lW.A0H = 0;
            c195868lW.A06 = A00;
            c195868lW.A19 = true;
            return c195868lW;
        } catch (IOException unused) {
            throw new Exception("Error extracting video duration");
        }
    }
}
