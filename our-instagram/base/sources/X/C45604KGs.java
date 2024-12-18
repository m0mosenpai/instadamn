package X;

import android.content.Context;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45604KGs extends AbstractC61132qb {
    public final Context A00;
    public final UpdateProfilePicturePagerAdapter$UpdateProfileTabType A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public C45604KGs(Context context, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = updateProfilePicturePagerAdapter$UpdateProfileTabType;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A06 = z2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Context context = this.A00;
        UserSession userSession = this.A02;
        return new Jn8(context, new C54823OLg(userSession), this.A01, userSession, this.A04, this.A03, this.A05, this.A06);
    }
}
