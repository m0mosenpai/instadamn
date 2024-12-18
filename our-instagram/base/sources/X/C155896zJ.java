package X;

import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6zJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155896zJ implements InterfaceC155906zK {
    public final Resources A00;
    public final UserDetailFragment A01;
    public final UserDetailTabController A02;
    public final HashMap A03 = new HashMap();

    public C155896zJ(Resources resources, FragmentActivity fragmentActivity, final AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, final C155376yQ c155376yQ, final InterfaceC60442pS interfaceC60442pS, final UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController, final C38U c38u, List list, final boolean z) {
        InterfaceC65342xW c155916zL;
        this.A00 = resources;
        this.A02 = userDetailTabController;
        this.A01 = userDetailFragment;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final EnumC125765mR enumC125765mR = (EnumC125765mR) it.next();
            EnumC125775mS enumC125775mS = enumC125765mR.A00;
            int ordinal = enumC125775mS.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 4) {
                        if (ordinal != 3) {
                            if (ordinal == 7) {
                                final Integer num = C05F.A01;
                                c155916zL = new AbstractC155926zM(abstractC59962oe, userSession, c155376yQ, interfaceC60442pS, this, enumC125765mR, userDetailFragment, c38u, num, z) { // from class: X.6zS
                                    public final AbstractC59962oe A00;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(abstractC59962oe.requireActivity(), userSession, c155376yQ, interfaceC60442pS, this, enumC125765mR, userDetailFragment, c38u, num, z);
                                        C14360o3.A0B(c38u, 9);
                                        this.A00 = abstractC59962oe;
                                    }
                                };
                            } else {
                                throw new IllegalArgumentException("unsupported feed source");
                            }
                        } else {
                            c155916zL = new C155966zQ(abstractC59962oe, interfaceC11380iw, userSession, c155376yQ, interfaceC60442pS, this, enumC125765mR, userDetailFragment, c38u, C05F.A01, z);
                        }
                    } else {
                        Integer num2 = C05F.A01;
                        C14360o3.A0B(c38u, 9);
                        c155916zL = new AbstractC155926zM(fragmentActivity, userSession, new HLJ(userSession, enumC125765mR), interfaceC60442pS, this, enumC125765mR, userDetailFragment, c38u, num2, z);
                    }
                } else {
                    c155916zL = new C155956zP(fragmentActivity, userSession, c155376yQ, interfaceC60442pS, this, enumC125765mR, userDetailFragment, c38u, C05F.A01, z);
                }
            } else {
                c155916zL = new C155916zL(fragmentActivity, userSession, c155376yQ, interfaceC60442pS, this, enumC125765mR, userDetailFragment, c38u, C05F.A01, z);
            }
            this.A03.put(enumC125775mS, c155916zL);
        }
    }
}
