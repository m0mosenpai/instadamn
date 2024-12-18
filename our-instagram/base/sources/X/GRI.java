package X;

import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import java.util.Comparator;

/* loaded from: classes6.dex */
public final class GRI implements Comparator {
    public final int A00;

    public GRI(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable A0s;
        Comparable A0s2;
        switch (this.A00) {
            case 0:
                A0s = Integer.valueOf(((UpdateProfilePicturePagerAdapter$UpdateProfileTabType) obj).A00);
                A0s2 = Integer.valueOf(((UpdateProfilePicturePagerAdapter$UpdateProfileTabType) obj2).A00);
                return C2BS.A00(A0s, A0s2);
            case 1:
                A0s = Long.valueOf(((C35169FfL) obj2).A01());
                A0s2 = Long.valueOf(((C35169FfL) obj).A01());
                return C2BS.A00(A0s, A0s2);
            case 2:
                return C2BS.A00(((C26055Bfi) obj).A03, ((C26055Bfi) obj2).A03);
            case 3:
                A0s = Boolean.valueOf(((C32788Ebs) obj2).A08);
                A0s2 = Boolean.valueOf(((C32788Ebs) obj).A08);
                return C2BS.A00(A0s, A0s2);
            case 4:
                A0s = Integer.valueOf(((C50092Rx) obj).A00);
                A0s2 = Integer.valueOf(((C50092Rx) obj2).A00);
                return C2BS.A00(A0s, A0s2);
            case 5:
            case 6:
            default:
                A0s = Long.valueOf(-((C41181vS) obj).A03());
                A0s2 = Long.valueOf(-((C41181vS) obj2).A03());
                return C2BS.A00(A0s, A0s2);
            case 7:
                A0s = AbstractC31172DnG.A0s(((C51758Mth) obj).A01);
                A0s2 = AbstractC31172DnG.A0s(((C51758Mth) obj2).A01);
                return C2BS.A00(A0s, A0s2);
        }
    }
}
