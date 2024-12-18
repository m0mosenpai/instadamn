package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardOverlayType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class C0v extends C17T implements InterfaceC31116Dly {
    public List A00;

    @Override // X.InterfaceC31116Dly
    public final InterfaceC31116Dly E9I(C1DY c1dy) {
        List<InterfaceC111044zG> list = this.A00;
        if (list == null) {
            list = A0o(1367927716, C37982GnP.class);
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (InterfaceC111044zG interfaceC111044zG : list) {
            interfaceC111044zG.E8p(c1dy);
            A0q.add(interfaceC111044zG);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.InterfaceC31116Dly
    public final C26133BhK Ewk(C1DY c1dy) {
        ArrayList arrayList;
        C26135BhM c26135BhM;
        C26134BhL c26134BhL;
        String A0i = A0i(1253013930);
        MidCardClipsClickedAction midCardClipsClickedAction = (MidCardClipsClickedAction) A0M(489807338, C30001DKn.A00);
        List A0o = A0o(-1716276380, C27254C0u.class);
        ArrayList A0i2 = AbstractC167007dF.A0i(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            A0i2.add(((InterfaceC31122Dm5) it.next()).Ewj());
        }
        List list = this.A00;
        if (list == null) {
            list = A0o(1367927716, C37982GnP.class);
        }
        ArrayList A0i3 = AbstractC167007dF.A0i(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A0i3.add(((InterfaceC111044zG) it2.next()).Erx(c1dy));
        }
        List A0o2 = A0o(-720800509, C0w.class);
        ArrayList A0i4 = AbstractC167007dF.A0i(A0o2);
        Iterator it3 = A0o2.iterator();
        while (it3.hasNext()) {
            A0i4.add(((InterfaceC31106Dlo) it3.next()).Ewl());
        }
        ImmutableList A08 = A08(1321673815, C0w.class);
        C26134BhL c26134BhL2 = null;
        if (A08 != null) {
            arrayList = AbstractC167007dF.A0i(A08);
            Iterator<E> it4 = A08.iterator();
            while (it4.hasNext()) {
                arrayList.add(((InterfaceC31106Dlo) it4.next()).Ewl());
            }
        } else {
            arrayList = null;
        }
        MidCardOverlayType midCardOverlayType = (MidCardOverlayType) A0N(524475346, JAH.A00);
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(-1498692525);
        InterfaceC31107Dlp interfaceC31107Dlp = (InterfaceC31107Dlp) A05(746914147, C0x.class);
        if (interfaceC31107Dlp != null) {
            c26135BhM = interfaceC31107Dlp.Ewm();
        } else {
            c26135BhM = null;
        }
        C26134BhL Ewl = ((InterfaceC31106Dlo) A04(-867242413, C0w.class)).Ewl();
        InterfaceC31106Dlo interfaceC31106Dlo = (InterfaceC31106Dlo) A05(1819717577, C0w.class);
        if (interfaceC31106Dlo != null) {
            c26134BhL = interfaceC31106Dlo.Ewl();
        } else {
            c26134BhL = null;
        }
        InterfaceC31106Dlo interfaceC31106Dlo2 = (InterfaceC31106Dlo) A05(-869054267, C0w.class);
        if (interfaceC31106Dlo2 != null) {
            c26134BhL2 = interfaceC31106Dlo2.Ewl();
        }
        return new C26133BhK(midCardClipsClickedAction, Ewl, c26134BhL, c26134BhL2, c26135BhM, midCardOverlayType, A0i, A0h(-1773366604), A0i2, A0i3, A0i4, arrayList, optionalStringListByHashCode);
    }
}
