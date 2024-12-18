package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerGalleryTabFragment;
import com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerPostsTabFragment;
import java.util.List;

/* renamed from: X.Gt2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38313Gt2 extends AbstractC10330gz {
    public FundraiserPhotoPickerGalleryTabFragment A00;
    public FundraiserPhotoPickerPostsTabFragment A01;
    public final IJU A02;
    public final UserSession A03;
    public final List A04;

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A04.size();
    }

    public C38313Gt2(Fragment fragment, IJU iju, UserSession userSession, List list) {
        super(fragment.getParentFragmentManager(), 1);
        this.A02 = iju;
        this.A03 = userSession;
        this.A04 = list;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.53Z, com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerPostsTabFragment] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerGalleryTabFragment, X.53Z] */
    @Override // X.AbstractC10330gz
    public final Fragment A00(int i) {
        C53Z c53z;
        C53Z c53z2;
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31173DnH.A1C(A0b, this.A03);
        int ordinal = ((EnumC39532Hcz) this.A04.get(i)).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C53Z c53z3 = this.A00;
                c53z = c53z3;
                if (c53z3 == null) {
                    ?? c53z4 = new C53Z();
                    this.A00 = c53z4;
                    c53z4.A00 = this.A02;
                    c53z2 = c53z4;
                    c53z2.setArguments(A0b);
                    c53z = c53z2;
                }
                return c53z;
            }
            throw AbstractC166987dD.A12("Fragment position cannot be more than 1.");
        }
        C53Z c53z5 = this.A01;
        c53z = c53z5;
        if (c53z5 == null) {
            ?? c53z6 = new C53Z();
            this.A01 = c53z6;
            c53z6.A00 = this.A02;
            c53z2 = c53z6;
            c53z2.setArguments(A0b);
            c53z = c53z2;
        }
        return c53z;
    }
}
