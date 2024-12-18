package com.instagram.wonderwall.repository;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AnonymousClass194;
import X.AnonymousClass197;
import X.B4Z;
import X.C05A;
import X.C12L;
import X.C14360o3;
import X.C25671My;
import X.C4A7;
import X.C57161PZf;
import X.C57755Pji;
import X.C7B;
import X.CZ2;
import X.DHI;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.OCZ;
import android.os.Parcelable;
import com.instagram.user.model.User;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallMusicPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallRepostItem;
import com.instagram.wonderwall.model.WallTextPostItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class WallPendingPostManager extends C4A7 {
    public static final CZ2 A05 = new Object();
    public final OCZ A00;
    public final Map A01;
    public final C25671My A02;
    public final WallApiGraphQLImpl A03;
    public final ConcurrentHashMap A04;

    public final C05A A04(String str) {
        Object putIfAbsent;
        C14360o3.A0B(str, 0);
        ConcurrentHashMap concurrentHashMap = this.A04;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = AbstractC25225BEi.A1H(AbstractC166987dD.A1E())))) != null) {
            obj = putIfAbsent;
        }
        return (C05A) obj;
    }

    public final void A05(WallPostItem wallPostItem, String str) {
        AbstractC167017dG.A1N(str, wallPostItem);
        A03(this, str, new C57755Pji(wallPostItem, 49));
        this.A01.put(wallPostItem.Bez().A06, AbstractC25226BEj.A1L(new C57161PZf(this, wallPostItem, str, (InterfaceC23621Ds) null, 23), super.A01));
    }

    public static final WallPostItem A00(WallPostItem wallPostItem, C7B c7b) {
        int i;
        Parcelable parcelable;
        int ordinal = c7b.ordinal();
        if (ordinal != 5) {
            if (ordinal != 3 && ordinal != 4) {
                i = wallPostItem.Bez().A00;
            } else {
                i = wallPostItem.Bez().A00 + 1;
            }
        } else {
            i = -1;
        }
        WallPostInfo Bez = wallPostItem.Bez();
        String str = Bez.A06;
        User user = Bez.A03;
        WallInfo wallInfo = Bez.A04;
        String str2 = Bez.A07;
        boolean z = Bez.A0B;
        boolean z2 = Bez.A09;
        boolean z3 = Bez.A0A;
        int i2 = Bez.A01;
        List list = Bez.A08;
        long j = Bez.A02;
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A13(user, wallInfo, str2);
        C14360o3.A0B(list, 8);
        WallPostInfo wallPostInfo = new WallPostInfo(user, wallInfo, c7b, str, str2, list, i2, i, j, z, z2, z3);
        if (wallPostItem instanceof WallTextPostItem) {
            return new WallTextPostItem(wallPostInfo);
        }
        if (wallPostItem instanceof WallMediaPostItem) {
            WallMediaPostItem wallMediaPostItem = (WallMediaPostItem) wallPostItem;
            WallMediaPostItem wallMediaPostItem2 = new WallMediaPostItem(wallMediaPostItem.A01, wallPostInfo);
            wallMediaPostItem2.A00 = wallMediaPostItem.A00;
            parcelable = wallMediaPostItem2;
        } else if (wallPostItem instanceof WallMusicPostItem) {
            WallMusicPostItem wallMusicPostItem = (WallMusicPostItem) wallPostItem;
            parcelable = new WallMusicPostItem(wallMusicPostItem.A00, wallPostInfo, wallMusicPostItem.A02);
        } else if (wallPostItem instanceof WallGifPostItem) {
            WallGifPostItem wallGifPostItem = (WallGifPostItem) wallPostItem;
            parcelable = new WallGifPostItem(wallGifPostItem.A00, wallPostInfo, wallGifPostItem.A02);
        } else if (wallPostItem instanceof WallRepostItem) {
            parcelable = new WallRepostItem(wallPostInfo, ((WallRepostItem) wallPostItem).A01);
        } else {
            throw B4Z.A00();
        }
        return (WallPostItem) parcelable;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.wonderwall.model.WallPostItem r7, com.instagram.wonderwall.repository.WallPendingPostManager r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallPendingPostManager.A01(com.instagram.wonderwall.model.WallPostItem, com.instagram.wonderwall.repository.WallPendingPostManager, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final void A02(WallPendingPostManager wallPendingPostManager, String str) {
        Set keySet = wallPendingPostManager.A04.keySet();
        C14360o3.A07(keySet);
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            C14360o3.A0A(A1B);
            A03(wallPendingPostManager, A1B, new DHI(str, 15));
        }
    }

    public WallPendingPostManager(C25671My c25671My, WallApiGraphQLImpl wallApiGraphQLImpl, OCZ ocz) {
        super("WallPendingPostManager", AnonymousClass194.A02(new AnonymousClass197(null).plus(C12L.A00.CPG(405442214, 3))));
        this.A02 = c25671My;
        this.A00 = ocz;
        this.A03 = wallApiGraphQLImpl;
        this.A04 = new ConcurrentHashMap();
        this.A01 = AbstractC166987dD.A1I();
    }

    public static final void A03(WallPendingPostManager wallPendingPostManager, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C05A A04 = wallPendingPostManager.A04(str);
        ArrayList A0U = AbstractC001800i.A0U((Collection) A04.getValue());
        interfaceC16660sJ.invoke(A0U);
        A04.Egh(A0U);
        wallPendingPostManager.A04.put(str, A04);
    }
}
