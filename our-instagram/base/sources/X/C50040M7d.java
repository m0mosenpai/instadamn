package X;

import android.location.Location;
import com.instagram.model.direct.stickerstore.StickerPackResponseItem;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.M7d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50040M7d implements Comparator {
    public final int A00;
    public final Object A01;

    public C50040M7d(InterfaceC16620sF interfaceC16620sF, int i) {
        this.A00 = i;
        this.A01 = interfaceC16620sF;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable valueOf;
        Comparable valueOf2;
        switch (this.A00) {
            case 0:
                long j = ((C47Z) obj).A0g;
                long j2 = ((C47Z) obj2).A0g;
                if (j > j2) {
                    return -1;
                }
                return AbstractC25230BEn.A1Q((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
            case 1:
                int compare = ((Comparator) this.A01).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                boolean z = true;
                valueOf = Boolean.valueOf(AbstractC167007dF.A1W(((C44135Jf0) obj2).A05));
                if (((C44135Jf0) obj).A05 == null) {
                    z = false;
                }
                valueOf2 = Boolean.valueOf(z);
                break;
            case 2:
            case 3:
            default:
                return AbstractC166987dD.A0H(((InterfaceC16620sF) this.A01).invoke(obj, obj2));
            case 4:
                List list = (List) this.A01;
                int indexOf = list.indexOf(((StickerPackResponseItem) ((Map.Entry) obj).getKey()).A02);
                if (indexOf == -1) {
                    indexOf = list.size();
                }
                valueOf = Integer.valueOf(indexOf);
                int indexOf2 = list.indexOf(((StickerPackResponseItem) ((Map.Entry) obj2).getKey()).A02);
                if (indexOf2 == -1) {
                    indexOf2 = list.size();
                }
                valueOf2 = Integer.valueOf(indexOf2);
                break;
            case 5:
                C49463Ltb c49463Ltb = (C49463Ltb) obj;
                C49463Ltb c49463Ltb2 = (C49463Ltb) obj2;
                int compare2 = new C50040M7d(((C45998KXm) this.A01).A01, 7).compare(c49463Ltb.A01, c49463Ltb2.A01);
                Integer valueOf3 = Integer.valueOf(compare2);
                if (compare2 != 0 && valueOf3 != null) {
                    return compare2;
                }
                return C2BS.A00(c49463Ltb.A02, c49463Ltb2.A02);
            case 6:
                Location location = (Location) this.A01;
                valueOf = Float.valueOf(location.distanceTo(((C45128JyU) obj).A03));
                valueOf2 = Float.valueOf(location.distanceTo(((C45128JyU) obj2).A03));
                break;
            case 7:
                C45128JyU c45128JyU = (C45128JyU) obj;
                C45128JyU c45128JyU2 = (C45128JyU) obj2;
                if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 36321722381575947L)) {
                    return C14360o3.A00(c45128JyU.A01, c45128JyU2.A01);
                }
                return C14360o3.A01(c45128JyU2.A02, c45128JyU.A02);
        }
        return C2BS.A00(valueOf, valueOf2);
    }

    public C50040M7d(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
