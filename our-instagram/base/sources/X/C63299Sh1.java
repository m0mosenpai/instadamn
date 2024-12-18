package X;

import android.media.AudioProfile;
import android.util.SparseArray;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sh1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63299Sh1 {
    public static final C63299Sh1 A02 = new C63299Sh1(ImmutableList.of((Object) C63203Sf7.A03));
    public static final ImmutableList A03 = ImmutableList.of((Object) 2, (Object) 5, (Object) 6);
    public static final ImmutableMap A04;
    public final SparseArray A00 = AbstractC58318PtA.A0G();
    public final int A01;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
    
        if ("Xiaomi".equals(r2) == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C63299Sh1 A00(android.content.Context r10, X.Y1h r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63299Sh1.A00(android.content.Context, X.Y1h):X.Sh1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63299Sh1)) {
            return false;
        }
        C63299Sh1 c63299Sh1 = (C63299Sh1) obj;
        return Util.A0E(this.A00, c63299Sh1.A00) && this.A01 == c63299Sh1.A01;
    }

    static {
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        A0Z.put(5, 6);
        A0Z.put(17, 6);
        A0Z.put(7, 6);
        A0Z.put(30, 10);
        A0Z.put(18, 6);
        A0Z.put(6, 8);
        A0Z.put(8, 8);
        A0Z.put(14, 8);
        A04 = A0Z.buildOrThrow();
    }

    public final int hashCode() {
        return this.A01 + (Util.A01(this.A00) * 31);
    }

    public C63299Sh1(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C63203Sf7 c63203Sf7 = (C63203Sf7) list.get(i2);
            this.A00.put(c63203Sf7.A00, c63203Sf7);
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i < sparseArray.size()) {
                i3 = Math.max(i3, ((C63203Sf7) sparseArray.valueAt(i)).A01);
                i++;
            } else {
                this.A01 = i3;
                return;
            }
        }
    }

    public static ImmutableList A01(List list) {
        int format;
        Collection c97154Ya;
        List c97154Ya2;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(2, AbstractC31171DnF.A0k(new C97154Ya(new int[]{12}, 0, 1)));
        for (int i = 0; i < list.size(); i++) {
            AudioProfile audioProfile = (AudioProfile) list.get(i);
            if (audioProfile.getEncapsulationType() != 1 && ((format = audioProfile.getFormat()) == 3 || format == 2 || format == 268435456 || format == 21 || format == 1342177280 || format == 22 || format == 1610612736 || format == 4 || A04.containsKey(Integer.valueOf(format)))) {
                Integer valueOf = Integer.valueOf(format);
                if (A1G.containsKey(valueOf)) {
                    Object obj = A1G.get(valueOf);
                    obj.getClass();
                    java.util.Set set = (java.util.Set) obj;
                    int[] channelMasks = audioProfile.getChannelMasks();
                    int length = channelMasks.length;
                    if (length == 0) {
                        c97154Ya2 = Collections.emptyList();
                    } else {
                        c97154Ya2 = new C97154Ya(channelMasks, 0, length);
                    }
                    set.addAll(c97154Ya2);
                } else {
                    int[] channelMasks2 = audioProfile.getChannelMasks();
                    int length2 = channelMasks2.length;
                    if (length2 == 0) {
                        c97154Ya = Collections.emptyList();
                    } else {
                        c97154Ya = new C97154Ya(channelMasks2, 0, length2);
                    }
                    A1G.put(valueOf, AbstractC31171DnF.A0k(c97154Ya));
                }
            }
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator A14 = AbstractC166997dE.A14(A1G);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            C63203Sf7 c63203Sf7 = C63203Sf7.A03;
            builder.add((Object) new C63203Sf7((java.util.Set) A1K.getValue(), AbstractC166987dD.A0H(A1K.getKey())));
        }
        return builder.build();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioCapabilities[maxChannelCount=");
        A1C.append(this.A01);
        A1C.append(", audioProfiles=");
        A1C.append(this.A00);
        return AbstractC58319PtB.A0w(A1C);
    }
}
