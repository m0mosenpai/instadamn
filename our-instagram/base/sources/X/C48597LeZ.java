package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LeZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48597LeZ implements MSD, MOQ {
    public static final String __redex_internal_original_name = "AvatarStickerPickerController";
    public View A00;
    public final Context A01;
    public final Fragment A02;
    public final AbstractC10360h2 A03;
    public final UserSession A04;
    public final C8NZ A05;
    public final C44500Jm6 A06;
    public final List A07;
    public final InterfaceC16820sZ A08;
    public final View A09;
    public final Integer A0A;
    public final java.util.Set A0B;
    public final InterfaceC16820sZ A0C;
    public final InterfaceC16820sZ A0D;
    public final InterfaceC16820sZ A0E;

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    public C48597LeZ(Context context, View view, Fragment fragment, UserSession userSession, C8NZ c8nz, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4) {
        AbstractC167007dF.A1J(interfaceC16820sZ2, 8, interfaceC16820sZ3);
        this.A01 = context;
        this.A04 = userSession;
        this.A02 = fragment;
        this.A09 = view;
        this.A05 = c8nz;
        this.A0E = interfaceC16820sZ;
        this.A08 = interfaceC16820sZ2;
        this.A0C = interfaceC16820sZ3;
        this.A0D = interfaceC16820sZ4;
        AbstractC10360h2 childFragmentManager = fragment.getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        this.A03 = childFragmentManager;
        this.A0B = AbstractC31171DnF.A0l();
        this.A07 = AbstractC166987dD.A1E();
        this.A06 = (C44500Jm6) new C52942bb(new KFY(userSession), fragment.requireActivity()).A00(C44500Jm6.class);
        this.A0A = C05F.A1F;
        Fragment fragment2 = this.A02;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = fragment2.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MC8(c07s, this, viewLifecycleOwner, null, 43), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A0B;
    }

    @Override // X.MOQ
    public final Integer Acu() {
        return this.A0A;
    }

    @Override // X.MSD
    public final boolean CJQ() {
        List list = this.A07;
        if (list.size() > 1) {
            list.remove(AbstractC25226BEj.A05(list));
            AbstractC10360h2 abstractC10360h2 = this.A03;
            abstractC10360h2.A12();
            C14240no c14240no = new C14240no(abstractC10360h2);
            c14240no.A0N((Fragment) list.get(AbstractC25226BEj.A05(list)));
            c14240no.A00();
            return true;
        }
        return false;
    }

    @Override // X.MSD
    public final void E2K() {
        if (this.A00 == null) {
            View A0E = AbstractC31173DnH.A0E(AbstractC167007dF.A0M(this.A09, R.id.avatar_sticker_picker_stub), R.layout.avatar_picker_grid_layout_v2);
            java.util.Set set = this.A0B;
            set.clear();
            C14360o3.A0A(A0E);
            set.add(A0E);
            this.A00 = A0E;
        }
        C45445KAg A00 = AbstractC46678Kkv.A00("stories_avatar_sticker_picker_grid", (String) this.A0E.invoke(), (List) this.A0C.invoke(), false, AbstractC25231BEo.A1b(this.A0D));
        this.A07.add(A00);
        C14240no c14240no = new C14240no(this.A03);
        c14240no.A09(A00, R.id.avatar_sticker_grid_container);
        c14240no.A01();
    }

    @Override // X.MSD
    public final void close() {
        List list = this.A07;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC43594JPz.A19((Fragment) it.next(), this.A03);
        }
        list.clear();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "stories_avatar_sticker_picker_grid";
    }

    @Override // X.MSD
    public final boolean isScrolledToBottom() {
        List list = this.A07;
        Object obj = list.get(AbstractC25229BEm.A09(list));
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.avatars.stickergrid.AvatarStickerPickerScrollHandler");
        return AbstractC110854yx.A04(((AbstractC45465KBa) ((InterfaceC50395MMx) obj)).A07());
    }

    @Override // X.MSD
    public final boolean isScrolledToTop() {
        List list = this.A07;
        Object obj = list.get(AbstractC25229BEm.A09(list));
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.avatars.stickergrid.AvatarStickerPickerScrollHandler");
        return AbstractC110854yx.A05(((AbstractC45465KBa) ((InterfaceC50395MMx) obj)).A07());
    }
}
