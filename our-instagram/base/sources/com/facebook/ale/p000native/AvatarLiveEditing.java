package com.facebook.ale.p000native;

import X.AbstractC167017dG;
import X.AbstractC37302Gc3;
import X.C00O;
import X.C05F;
import X.C09170dP;
import X.C14360o3;
import X.C53661NoC;
import X.OF5;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class AvatarLiveEditing {
    public static final C53661NoC Companion = new Object();
    public final HybridData mHybridData;

    private final native HybridData initHybrid(String str, String str2, String str3, int i, String str4, TigonServiceHolder tigonServiceHolder, TigonServiceHolder tigonServiceHolder2, String str5, String str6, AvatarLiveEditingNotificationDelegate avatarLiveEditingNotificationDelegate, AvatarLiveEditingNetworkInterface avatarLiveEditingNetworkInterface, int i2, int i3, int i4, int i5, int i6);

    public final native void cancelAvatarUpdateRequest(String str);

    public final native void clearAvatarCache();

    public final native void getAlePointerHolder(LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder);

    public final native void prefetchAssets(String str, List list, int i, int i2);

    public final native void prefetchAvatar(String str, Map map);

    public final native void removeNotificationDelegate();

    public final native void requestAvatarUpdate(int i, String str, Map map, boolean z);

    public final native void saveCurrentAvatar();

    public final native void updateAvatarBodyMorphs(String str, Map map);

    public final native void updateAvatarSkeleton(String str, Map map);

    public final native void updateBlendWeights(String str, Map map);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NoC, java.lang.Object] */
    static {
        C09170dP.A0C("ale");
        C09170dP.A0C("jniperflogger");
    }

    public AvatarLiveEditing(OF5 of5, AvatarLiveEditingNotificationDelegate avatarLiveEditingNotificationDelegate) {
        int i;
        AbstractC167017dG.A1P(of5, avatarLiveEditingNotificationDelegate);
        String str = of5.A06;
        String str2 = of5.A07;
        String str3 = of5.A08;
        Integer num = of5.A03;
        if (1 - (num == null ? C05F.A01 : num).intValue() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        String str4 = of5.A04;
        if (str4 != null) {
            this.mHybridData = initHybrid(str, str2, str3, i, str4, of5.A00, of5.A01, of5.A05, null, avatarLiveEditingNotificationDelegate, null, AbstractC37302Gc3.A02(of5.A02), -1, -1, -1, -1);
        } else {
            C14360o3.A0F("cacheDirectoryUri");
            throw C00O.createAndThrow();
        }
    }

    public static /* synthetic */ void prefetchAssets$default(AvatarLiveEditing avatarLiveEditing, String str, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        avatarLiveEditing.prefetchAssets(str, list, i, i2);
    }

    public static /* synthetic */ void requestAvatarUpdate$default(AvatarLiveEditing avatarLiveEditing, int i, String str, Map map, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        avatarLiveEditing.requestAvatarUpdate(i, str, map, z);
    }
}
