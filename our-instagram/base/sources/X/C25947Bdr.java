package X;

import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.Bdr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25947Bdr extends AbstractC65952Twx {
    public final C005101q A00;
    public final List A01;

    @Override // X.AbstractC65952Twx
    public final Fragment A03(int i) {
        Fragment kd0;
        C005101q c005101q = this.A00;
        Fragment fragment = (Fragment) AbstractC005201r.A00(c005101q, i);
        if (fragment == null) {
            int ordinal = ((EnumC27427C8u) this.A01.get(i)).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        kd0 = new C38925HBx();
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    kd0 = new KD0();
                }
                fragment = kd0;
            } else {
                fragment = new C52159N6l();
            }
            c005101q.A07(i, fragment);
        }
        return fragment;
    }

    public C25947Bdr(Fragment fragment, List list) {
        super(fragment);
        this.A01 = list;
        this.A00 = new C005101q(10);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-2028192120);
        int size = this.A01.size();
        C0f9.A0A(-1284834179, A03);
        return size;
    }
}
