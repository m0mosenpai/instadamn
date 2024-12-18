package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Wfl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70720Wfl implements InterfaceC41501vz {
    public final List A00 = new ArrayList();

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(727464485);
        C42661xu c42661xu = (C42661xu) obj;
        int A032 = C0f9.A03(335632511);
        String str = c42661xu.A02;
        String str2 = c42661xu.A01;
        boolean equals = "feed_contextual_hashtag".equals(str);
        String A00 = AbstractC111324zv.A00(935);
        if ((!equals && !A00.equals(str)) || "feed_contextual_hashtag".equals(str2) || A00.equals(str2) || "peek_media_feed_hashtag".equals(str) || "peek_media_feed_hashtag".equals(str2)) {
            i = 1206600867;
        } else {
            List list = this.A00;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((XA3) list.get(size)).DEr(str2, false);
                }
            }
            i = -1371741883;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(1663630449, A03);
    }
}
