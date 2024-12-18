package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.wonderwall.model.WallPostItem;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes5.dex */
public final class BJT implements Comparator {
    public final int A00;

    public BJT(int i) {
        this.A00 = i;
    }

    public static List A00(Iterable iterable, int i) {
        return AbstractC001800i.A0g(iterable, new BJT(i));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable valueOf;
        Comparable valueOf2;
        switch (this.A00) {
            case 0:
                valueOf = Float.valueOf(((C25547BRj) obj2).A00);
                valueOf2 = Float.valueOf(((C25547BRj) obj).A00);
                break;
            case 1:
                valueOf = ((C102884kP) obj).A0I();
                valueOf2 = ((C102884kP) obj2).A0I();
                break;
            case 2:
                valueOf = Long.valueOf(((BSZ) obj).A01);
                valueOf2 = Long.valueOf(((BSZ) obj2).A01);
                break;
            case 3:
                valueOf = Long.valueOf(((CQK) obj).A00);
                valueOf2 = Long.valueOf(((CQK) obj2).A00);
                break;
            case 4:
                valueOf = (String) obj;
                valueOf2 = (String) obj2;
                break;
            case 5:
                valueOf = ((Badge) obj2).A01();
                valueOf2 = ((Badge) obj).A01();
                break;
            case 6:
                valueOf = ((Challenge) obj2).A07;
                valueOf2 = ((Challenge) obj).A07;
                break;
            case 7:
                valueOf = ((Achievement) obj2).A05;
                valueOf2 = ((Achievement) obj).A05;
                break;
            case 8:
                valueOf = Long.valueOf(((C45128JyU) obj2).A02);
                valueOf2 = Long.valueOf(((C45128JyU) obj).A02);
                break;
            case 9:
                valueOf = Integer.valueOf(((C26000Beo) obj).A01);
                valueOf2 = Integer.valueOf(((C26000Beo) obj2).A01);
                break;
            case 10:
                valueOf = Long.valueOf(((C5HW) obj2).A00());
                valueOf2 = Long.valueOf(((C5HW) obj).A00());
                break;
            case 11:
                valueOf = (Float) ((C09530e4) obj).A00;
                valueOf2 = (Float) ((C09530e4) obj2).A00;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                valueOf = Boolean.valueOf(((WallPostItem) obj2).Bez().A09);
                valueOf2 = Boolean.valueOf(((WallPostItem) obj).Bez().A09);
                break;
            default:
                EnumC25465BOe enumC25465BOe = EnumC25465BOe.A0L;
                int i = 0;
                int i2 = 1;
                if (obj == enumC25465BOe) {
                    i2 = 0;
                }
                valueOf = Integer.valueOf(i2);
                if (obj2 != enumC25465BOe) {
                    i = 1;
                }
                valueOf2 = Integer.valueOf(i);
                break;
        }
        return C2BS.A00(valueOf, valueOf2);
    }
}
