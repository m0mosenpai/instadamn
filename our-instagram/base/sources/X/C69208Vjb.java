package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Vjb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69208Vjb {
    public C67729Uwv A00;
    public final AbstractC10360h2 A01;
    public final Fragment A02;
    public final FragmentActivity A03;

    public C69208Vjb(Fragment fragment, FragmentActivity fragmentActivity) {
        AbstractC10360h2 supportFragmentManager;
        this.A02 = fragment;
        this.A03 = fragmentActivity;
        if ((fragment == null || (supportFragmentManager = fragment.getChildFragmentManager()) == null) && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            throw new IllegalArgumentException(AbstractC58317Pt9.A00(185));
        }
        this.A01 = supportFragmentManager;
    }
}
