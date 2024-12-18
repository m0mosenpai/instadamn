package X;

import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Iterator;

/* renamed from: X.Dst, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31509Dst extends C1P1 {
    public final /* synthetic */ UserDetailFragment A00;

    public C31509Dst(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(897216176);
        UserDetailFragment userDetailFragment = this.A00;
        userDetailFragment.A31.A03 = true;
        UserDetailFragment.A0U(userDetailFragment);
        C0f9.A0A(-65164545, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1411386911);
        C31505Dsp c31505Dsp = (C31505Dsp) obj;
        int A032 = C0f9.A03(-1777120552);
        int size = c31505Dsp.A03.size();
        Iterator it = c31505Dsp.A03.iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if ("complete".equals(((FRF) it.next()).A03)) {
                i++;
            }
        }
        UserDetailFragment userDetailFragment = this.A00;
        C33616EtS c33616EtS = userDetailFragment.A31;
        c33616EtS.A00 = i;
        c33616EtS.A01 = size;
        c33616EtS.A02 = c31505Dsp.A04;
        c33616EtS.A03 = true;
        if (!userDetailFragment.A1l && c31505Dsp.A05) {
            z = true;
        }
        c33616EtS.A04 = z;
        userDetailFragment.A0z.A0M(c33616EtS);
        UserDetailFragment.A0U(userDetailFragment);
        C0f9.A0A(-581811415, A032);
        C0f9.A0A(-133574936, A03);
    }
}
