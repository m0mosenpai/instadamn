package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;

/* loaded from: classes9.dex */
public final class P33 implements InterfaceC57949Pmv {
    public final int A00;
    public final Object A01;

    public P33(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC57949Pmv
    public final C54543O7v getState(C54543O7v c54543O7v, CharSequence charSequence, boolean z) {
        String str;
        String str2;
        Fragment fragment;
        int i;
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1N(c54543O7v, charSequence);
                if (AbstractC001900j.A0T(charSequence)) {
                    c54543O7v.A01 = "error";
                    fragment = (Fragment) this.A01;
                    i = 2131964632;
                } else if (charSequence.length() > 50) {
                    c54543O7v.A01 = "error";
                    fragment = (Fragment) this.A01;
                    i = 2131972344;
                } else {
                    KCK kck = (KCK) this.A01;
                    String str3 = kck.A05;
                    if (str3 == null) {
                        C14360o3.A0F("originalTitle");
                        throw C00O.createAndThrow();
                    }
                    if (!str3.contentEquals(charSequence)) {
                        if (!kck.A0A.A02) {
                            if (!kck.A09) {
                                c54543O7v.A01 = "error";
                                str2 = kck.A03;
                                c54543O7v.A00 = str2;
                                return c54543O7v;
                            }
                        } else {
                            str = "loading";
                            c54543O7v.A01 = str;
                            return c54543O7v;
                        }
                    }
                    str = "confirmed";
                    c54543O7v.A01 = str;
                    return c54543O7v;
                }
                str2 = fragment.getString(i);
                c54543O7v.A00 = str2;
                return c54543O7v;
            case 1:
                C14360o3.A0B(c54543O7v, 0);
                N66 n66 = (N66) this.A01;
                C51753Mtc c51753Mtc = (C51753Mtc) n66.A01().A03.A02();
                if (c51753Mtc != null) {
                    N66.A00(c51753Mtc, c54543O7v, n66);
                    return c54543O7v;
                }
                return c54543O7v;
            case 2:
                C14360o3.A0B(c54543O7v, 0);
                N68 n68 = (N68) this.A01;
                C51753Mtc c51753Mtc2 = (C51753Mtc) n68.A01().A04.A02();
                if (c51753Mtc2 != null) {
                    N68.A00(c51753Mtc2, c54543O7v, n68);
                    return c54543O7v;
                }
                return c54543O7v;
            default:
                if (TextUtils.isEmpty(charSequence)) {
                    c54543O7v.A01 = "error";
                    str2 = AbstractC31172DnG.A07(this.A01).getString(2131963173);
                    c54543O7v.A00 = str2;
                }
                return c54543O7v;
        }
    }
}
