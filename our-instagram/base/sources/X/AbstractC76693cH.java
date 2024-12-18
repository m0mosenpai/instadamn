package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.3cH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76693cH {
    public static final void A01(Context context, Rie rie, AbstractC12990ll abstractC12990ll, String str, String str2) {
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(abstractC12990ll);
        igBloksScreenConfig.A0R = "com.bloks.www.ig.transparency_treatment";
        long parseLong = Long.parseLong(str);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        BitSet bitSet = new BitSet(3);
        hashMap.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, Long.valueOf(parseLong));
        bitSet.set(2);
        hashMap.put("product", str2);
        bitSet.set(0);
        hashMap.put("surface", A00(rie));
        bitSet.set(1);
        if (bitSet.nextClearBit(0) >= 3) {
            C66277U6x A02 = C66277U6x.A02("com.bloks.www.ig.transparency_treatment", AbstractC191768eY.A01(hashMap), hashMap2);
            A02.A00 = 719983200;
            A02.A05 = null;
            A02.A01 = 0L;
            A02.A06 = null;
            A02.A03 = null;
            A02.A02 = null;
            A02.A04 = null;
            A02.A08(hashMap3);
            A02.A05(context, igBloksScreenConfig);
            return;
        }
        throw new IllegalStateException("Missing Required Props");
    }

    public static final void A02(Context context, Rie rie, AbstractC12990ll abstractC12990ll, String str, String str2) {
        C14360o3.A0B(abstractC12990ll, 0);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(abstractC12990ll);
        igBloksScreenConfig.A0R = "com.bloks.www.ig.transparency_treatment";
        long parseLong = Long.parseLong(str);
        HashMap hashMap = new HashMap();
        BitSet bitSet = new BitSet(3);
        hashMap.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, Long.valueOf(parseLong));
        bitSet.set(2);
        hashMap.put("product", str2);
        bitSet.set(0);
        hashMap.put("surface", A00(rie));
        bitSet.set(1);
        C191778eZ A04 = igBloksScreenConfig.A04();
        if (bitSet.nextClearBit(0) >= 3) {
            AbstractC191798eb.A03(context, A04, "com.bloks.www.ig.transparency_treatment", null, AbstractC191768eY.A01(hashMap), 3600L);
            return;
        }
        throw new IllegalStateException("Missing Required Props");
    }

    public static final boolean A03(User user) {
        String CAl;
        String CAk;
        Boolean CAm = user.A03.CAm();
        if (CAm != null && CAm.booleanValue() && (CAl = user.A03.CAl()) != null && CAl.length() != 0 && (CAk = user.A03.CAk()) != null && CAk.length() != 0) {
            return true;
        }
        return false;
    }

    public static final String A00(Rie rie) {
        int ordinal = rie.ordinal();
        if (ordinal != 11) {
            if (ordinal != 12 && ordinal != 13) {
                if (ordinal != 17) {
                    if (ordinal != 16) {
                        return "unknown";
                    }
                    return "stories";
                }
                return "reels";
            }
            return "profile";
        }
        return "feed";
    }
}
