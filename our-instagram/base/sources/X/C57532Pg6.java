package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Pg6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57532Pg6 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57532Pg6(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C57532Pg6 A00(Object obj, Object obj2, int i) {
        return new C57532Pg6(i, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C31535DtK c31535DtK;
        User user;
        String id;
        C18920wW c18920wW;
        String str;
        UserSession userSession;
        EnumC142806cg enumC142806cg;
        C105824pt c105824pt;
        C109054vU c109054vU;
        InterfaceC108984vN interfaceC108984vN;
        Object invoke;
        C07N c07n;
        InterfaceC52932ba defaultViewModelProviderFactory;
        C07N c07n2;
        Object invoke2;
        switch (this.A00) {
            case 1:
                c31535DtK = (C31535DtK) this.A02;
                user = (User) this.A01;
                C31535DtK.A0B(user, c31535DtK);
                id = user.getId();
                c18920wW = c31535DtK.A03;
                str = "remove_follower_dialog_confirmed";
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, str);
                A0f.AAP("target_id", id);
                A0f.Cht();
                return C0eB.A00;
            case 2:
                c31535DtK = (C31535DtK) this.A02;
                user = (User) this.A01;
                C31542DtS c31542DtS = c31535DtK.A0E;
                if (c31542DtS == null) {
                    C14360o3.A0F("followListAdapter");
                    throw C00O.createAndThrow();
                }
                c31542DtS.A0D(user);
                C17060sy.A01.A01(C31535DtK.A03(c31535DtK)).A0d(C31535DtK.A03(c31535DtK));
                user.A0e(C31535DtK.A03(c31535DtK));
                id = user.getId();
                c18920wW = c31535DtK.A03;
                str = "remove_follower_dialog_confirmed";
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c18920wW, str);
                A0f2.AAP("target_id", id);
                A0f2.Cht();
                return C0eB.A00;
            case 3:
                C31535DtK c31535DtK2 = (C31535DtK) this.A02;
                id = AbstractC31171DnF.A0g(this.A01);
                c18920wW = c31535DtK2.A03;
                str = "remove_follower_button_tapped";
                InterfaceC02590Ai A0f22 = AbstractC166987dD.A0f(c18920wW, str);
                A0f22.AAP("target_id", id);
                A0f22.Cht();
                return C0eB.A00;
            case 5:
            case 6:
                ((InterfaceC16660sJ) this.A02).invoke(this.A01);
                return C0eB.A00;
            case 7:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null && (invoke = interfaceC16820sZ.invoke()) != null) {
                    return invoke;
                }
                return AbstractC25231BEo.A0V(this.A02);
            case 8:
                return new C2052396o((Context) this.A01, (UserSession) this.A02);
            case 9:
                return C190298bn.A03.A00((Context) this.A01, ((OL4) this.A02).A06).A00();
            case 10:
                return new OBB((InterfaceC11380iw) this.A01, (UserSession) this.A02);
            case 11:
                return new ODQ((UserSession) this.A01, (EnumC142806cg) this.A02);
            case Process.SIGTERM /* 15 */:
                return new C1810881k(AbstractC31172DnG.A07(this.A01), (UserSession) this.A02, false, false);
            case 16:
                Context A07 = AbstractC31172DnG.A07(this.A01);
                UserSession userSession2 = (UserSession) this.A02;
                C14360o3.A0B(userSession2, 1);
                return new AnonymousClass824(A07, userSession2);
            case Process.SIGSTOP /* 19 */:
                InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A01);
                if ((A0i instanceof C07N) && (c07n = (C07N) A0i) != null && (defaultViewModelProviderFactory = c07n.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
            case 24:
                OBF obf = (OBF) this.A02;
                return new C52294NCj(obf.A00, obf.A01, (C56804PIv) this.A01);
            case 30:
                return new NCA((UserSession) this.A01, (EnumC142806cg) this.A02);
            case 31:
                View view = ((ODS) this.A02).A01;
                Object obj = this.A01;
                EnumC142806cg enumC142806cg2 = EnumC142806cg.A05;
                int i = R.id.iglive_surface_view_frame_container;
                if (obj == enumC142806cg2) {
                    i = R.id.iglive_media_layout;
                }
                return AbstractC166997dE.A0S(view, i);
            case 36:
                userSession = (UserSession) this.A02;
                enumC142806cg = EnumC142806cg.A04;
                c105824pt = (C105824pt) this.A01;
                boolean z = true;
                if (c105824pt != null || (c109054vU = c105824pt.A02) == null || (interfaceC108984vN = c109054vU.A0A) == null || !interfaceC108984vN.CX2()) {
                    z = false;
                }
                return new C52298NCn(userSession, enumC142806cg, z);
            case 43:
                userSession = (UserSession) this.A02;
                enumC142806cg = EnumC142806cg.A05;
                c105824pt = (C105824pt) this.A01;
                boolean z2 = true;
                if (c105824pt != null) {
                    break;
                }
                z2 = false;
                return new C52298NCn(userSession, enumC142806cg, z2);
            case 45:
                UserSession userSession3 = (UserSession) this.A02;
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                return new C52299NCo(abstractC59962oe.requireContext(), abstractC59962oe, userSession3);
            default:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 == null || (invoke2 = interfaceC16820sZ2.invoke()) == null) {
                    InterfaceC018407e A0i2 = AbstractC25228BEl.A0i(this.A02);
                    if ((A0i2 instanceof C07N) && (c07n2 = (C07N) A0i2) != null) {
                        return c07n2.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke2;
        }
    }
}
