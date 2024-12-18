package X;

import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ivn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42749Ivn implements InterfaceC155906zK {
    public final Resources A00;
    public final UserDetailFragment A01;
    public final UserDetailTabController A02;
    public final HashMap A03;
    public final FragmentActivity A04;
    public final AbstractC59962oe A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final InterfaceC60442pS A08;
    public final C155396yS A09;
    public final C38U A0A;
    public final List A0B;
    public final boolean A0C;

    public C42749Ivn(Resources resources, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController, C155396yS c155396yS, C38U c38u, List list, boolean z) {
        AbstractC25229BEm.A1J(resources, 3, c38u);
        this.A04 = fragmentActivity;
        this.A05 = abstractC59962oe;
        this.A00 = resources;
        this.A02 = userDetailTabController;
        this.A0C = z;
        this.A01 = userDetailFragment;
        this.A09 = c155396yS;
        this.A08 = interfaceC60442pS;
        this.A0B = list;
        this.A0A = c38u;
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
        this.A03 = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC125765mR enumC125765mR = (EnumC125765mR) it.next();
            EnumC125775mS enumC125775mS = enumC125765mR.A00;
            if (enumC125775mS == EnumC125775mS.A06) {
                HashMap hashMap = this.A03;
                FragmentActivity fragmentActivity2 = this.A04;
                UserDetailFragment userDetailFragment2 = this.A01;
                C155396yS c155396yS2 = this.A09;
                boolean z2 = this.A0C;
                hashMap.put(enumC125775mS, new C42747Ivl(fragmentActivity2, this.A07, this, enumC125765mR, userDetailFragment2, c155396yS2, this.A0A, z2));
            } else {
                throw AbstractC166987dD.A12("Unsupported feed source");
            }
        }
    }

    public static final C42747Ivl A00(C42749Ivn c42749Ivn, EnumC125775mS enumC125775mS) {
        Object obj = c42749Ivn.A03.get(enumC125775mS);
        if (obj != null) {
            return (C42747Ivl) obj;
        }
        throw AbstractC25227BEk.A0n();
    }
}
