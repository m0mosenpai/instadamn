package X;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.4aG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97774aG implements C4BL {
    public final /* synthetic */ String A00;
    public final /* synthetic */ HashMap A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C97774aG(String str, HashMap hashMap, boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A01 = hashMap;
        this.A03 = z2;
        this.A00 = str;
        this.A04 = z3;
    }

    @Override // X.C4BL
    public final List Aw3(final String str, boolean z, boolean z2) {
        String str2;
        int intValue;
        C4BL c4bl = C4BL.A00;
        c4bl.getClass();
        ArrayList arrayList = new ArrayList(c4bl.Aw3(str, z, z2));
        AbstractC97794aK.A00(str, arrayList, this.A02);
        if ("video/av01".equals(str)) {
            HashMap hashMap = this.A01;
            if (!hashMap.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String lowerCase = ((C2IG) it.next()).A03.toLowerCase(Locale.ROOT);
                    if (hashMap.containsKey(lowerCase) && ((intValue = ((Number) hashMap.get(lowerCase)).intValue()) == -1 || Build.VERSION.SDK_INT < intValue)) {
                        it.remove();
                    }
                }
            }
        }
        if (this.A03 || ((str2 = this.A00) != null && str2.equals(str))) {
            Collections.sort(arrayList, new Comparator() { // from class: X.4aL
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
                
                    if (r1.equals("meta.dav1d.av1.decoder") == false) goto L15;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final int A00(X.C2IG r7) {
                    /*
                        r6 = this;
                        X.4aG r3 = X.C97774aG.this
                        boolean r0 = r3.A03
                        r1 = 0
                        if (r0 == 0) goto Lc
                        boolean r0 = r7.A07
                        if (r0 == 0) goto Lc
                        r1 = 1
                    Lc:
                        java.lang.String r2 = r2
                        java.lang.String r0 = "video/av01"
                        boolean r0 = r0.equals(r2)
                        if (r0 == 0) goto L40
                        boolean r5 = r3.A04
                        boolean r2 = r3.A02
                        java.lang.String r1 = r7.A03
                        r4 = 0
                        java.lang.String r0 = "c2.android.av1-dav1d.decoder"
                        boolean r0 = r1.equals(r0)
                        r3 = 0
                        if (r0 == 0) goto L27
                        r3 = 1
                    L27:
                        if (r2 == 0) goto L32
                        java.lang.String r0 = "meta.dav1d.av1.decoder"
                        boolean r0 = r1.equals(r0)
                        r2 = 1
                        if (r0 != 0) goto L33
                    L32:
                        r2 = 0
                    L33:
                        boolean r0 = r7.A07
                        r1 = 0
                        if (r0 == 0) goto L39
                        r1 = 3
                    L39:
                        if (r5 == r3) goto L3c
                        r4 = 2
                    L3c:
                        int r1 = r1 + r4
                        r0 = r2 ^ 1
                        int r1 = r1 + r0
                    L40:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C97804aL.A00(X.2IG):int");
                }

                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return A00((C2IG) obj) - A00((C2IG) obj2);
                }
            });
            AbstractC459729h.A01("MediaCodecSelectorHelper", "%s dec order (hw first) %s", str, arrayList);
        }
        return arrayList;
    }
}
