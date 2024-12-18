package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DwV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31726DwV extends AbstractC65952Twx {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31726DwV(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, List list, boolean z) {
        super(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
        C149656oI c149656oI = new C149656oI(userSession);
        C14360o3.A0B(userSession, 2);
        this.A02 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A06 = z;
        this.A05 = list;
        this.A00 = false;
        this.A01 = c149656oI.A05();
    }

    @Override // X.AbstractC65952Twx
    public final boolean A06(long j) {
        return 0 <= j && j < 2;
    }

    @Override // X.AbstractC65952Twx
    public final Fragment A03(int i) {
        UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType;
        int ordinal = ((UpdateProfilePicturePagerAdapter$UpdateProfileTabType) this.A05.get(i)).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (this.A01) {
                    String str = this.A04;
                    C34393FEj c34393FEj = new C34393FEj(this);
                    Bundle A0E = AbstractC31174DnI.A0E(str, 0);
                    A0E.putString("args_editor_logging_surface", str);
                    EEN een = new EEN();
                    een.setArguments(A0E);
                    een.A00 = c34393FEj;
                    return een;
                }
                updateProfilePicturePagerAdapter$UpdateProfileTabType = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A03;
            } else {
                throw B4Z.A00();
            }
        } else {
            updateProfilePicturePagerAdapter$UpdateProfileTabType = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04;
        }
        UserSession userSession = this.A02;
        String str2 = this.A04;
        String str3 = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A00;
        AbstractC167027dH.A13(userSession, str2, str3);
        C44293Jhj c44293Jhj = new C44293Jhj();
        AbstractC25227BEk.A1C(c44293Jhj, new C09530e4[]{AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.token), AbstractC166987dD.A1L("tab_type_key", updateProfilePicturePagerAdapter$UpdateProfileTabType), AbstractC166987dD.A1L("logging_surface_key", str2), AbstractC166987dD.A1L(AbstractC43591JPw.A00(1146), str3), AbstractC166987dD.A1L("coin_flip_setting_value_key", Boolean.valueOf(z)), AbstractC166987dD.A1L("is_tied_to_avatar", Boolean.valueOf(z2))});
        return c44293Jhj;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1824556701);
        int size = this.A05.size();
        C0f9.A0A(-729189940, A03);
        return size;
    }

    @Override // X.AbstractC65952Twx, X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long j;
        int A03 = C0f9.A03(1664095169);
        if (i == 1 && this.A01) {
            j = 2;
        } else {
            j = i;
        }
        C0f9.A0A(-1073494569, A03);
        return j;
    }
}
