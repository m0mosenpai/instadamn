package X;

import android.graphics.RectF;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WGX {
    public static final WGX A00 = new Object();

    public static final C1125756l A00(EnumC1125356h enumC1125356h, MediaComposition mediaComposition) {
        List A08 = mediaComposition.A08(enumC1125356h, 0);
        if (A08 != null && !A08.isEmpty()) {
            return (C1125756l) A08.get(0);
        }
        return null;
    }

    public static final HashMap A01(Integer num, String str) {
        int i;
        C14360o3.A0B(str, 1);
        HashMap hashMap = new HashMap();
        if (num == C05F.A01) {
            i = 885;
        } else {
            i = 886;
        }
        hashMap.put(MSV.A00(i), str);
        return hashMap;
    }

    public static final boolean A04(MediaComposition mediaComposition) {
        WGX wgx = A00;
        EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
        if (!AbstractC66047Tyk.A04(enumC1125356h, mediaComposition) && !mediaComposition.A0B(enumC1125356h)) {
            EnumC1125356h enumC1125356h2 = EnumC1125356h.AUDIO;
            if (AbstractC66047Tyk.A04(enumC1125356h2, mediaComposition) || mediaComposition.A0B(enumC1125356h2) || A02(enumC1125356h, mediaComposition) || A02(enumC1125356h2, mediaComposition)) {
                return false;
            }
            C1125756l A002 = A00(enumC1125356h, mediaComposition);
            C1125756l A003 = A00(enumC1125356h2, mediaComposition);
            if (A002 == null || !wgx.A06(A002)) {
                if (A003 != null && wgx.A06(A003)) {
                    return false;
                }
                if (A002 != null && A003 != null && !A002.equals(A003)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A05(MediaComposition mediaComposition, C69492VoF c69492VoF) {
        if (mediaComposition != null) {
            if (A04(mediaComposition)) {
                EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
                C1125756l A002 = A00(enumC1125356h, mediaComposition);
                if (A002 != null && A002.A02 > 0) {
                    if (A04(mediaComposition)) {
                        A00(enumC1125356h, mediaComposition);
                    }
                }
            }
            return false;
        }
        if (c69492VoF.A04 >= 0 || c69492VoF.A03 >= 0 || A07(c69492VoF)) {
            return false;
        }
        return true;
    }

    private final boolean A06(C1125756l c1125756l) {
        C1125456i c1125456i = c1125756l.A03;
        if (c1125456i.A03(TimeUnit.MICROSECONDS) <= 0) {
            long A02 = c1125456i.A02(TimeUnit.MILLISECONDS);
            if (A02 >= 0 && A02 != c1125756l.A01) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A07(C69492VoF c69492VoF) {
        WDI wdi = c69492VoF.A0H;
        if (!c69492VoF.A0U && wdi.A05 == 0) {
            Integer num = wdi.A0H;
            if (num != null && num != C05F.A00) {
                return true;
            }
            RectF rectF = wdi.A0E;
            RectF rectF2 = WDI.A0P;
            if (!VME.A00(rectF.left, rectF2.left) || !VME.A00(rectF.bottom, rectF2.bottom) || !VME.A00(rectF.top, rectF2.top) || !VME.A00(rectF.right, rectF2.right)) {
                return true;
            }
            List list = wdi.A0J;
            if (list != null && !list.isEmpty()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A02(EnumC1125356h enumC1125356h, MediaComposition mediaComposition) {
        HashMap A07 = mediaComposition.A07(enumC1125356h);
        if (A07 != null && A07.size() > 1) {
            return true;
        }
        List A08 = mediaComposition.A08(enumC1125356h, 0);
        if (A08 != null && A08.size() > 1) {
            return true;
        }
        return false;
    }

    public static final boolean A03(EnumC1125356h enumC1125356h, MediaComposition mediaComposition, WGX wgx) {
        HashMap A07 = mediaComposition.A07(enumC1125356h);
        if (A07 == null) {
            return false;
        }
        Iterator A0k = AbstractC167007dF.A0k(A07);
        while (A0k.hasNext()) {
            Iterator A0n = AbstractC65702TsY.A0n(((C1125956n) AbstractC166997dE.A0l(A0k)).A04);
            while (A0n.hasNext()) {
                if (wgx.A06((C1125756l) AbstractC166997dE.A0l(A0n))) {
                    return true;
                }
            }
        }
        return false;
    }
}
