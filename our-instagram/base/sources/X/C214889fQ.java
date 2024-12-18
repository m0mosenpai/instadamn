package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9fQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214889fQ extends AbstractC59962oe implements InterfaceC187288Rv, InterfaceC193488hT, InterfaceC195388ke, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "GalleryGridEditMediaSelectionFragment";
    public int A00;
    public C8SF A01;
    public AKL A02;
    public GalleryGridEditMediaSelectionFragment$Config A03;
    public boolean A04;
    public final InterfaceC09390do A05;
    public final C159407Da A06;
    public final HashMap A07;

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        return true;
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void D54(Integer num) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DCd(int i) {
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void DNQ(GalleryItem galleryItem, BBC bbc, int i) {
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void DNa(View view, GalleryItem galleryItem, BBC bbc, int i) {
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void DNr(GalleryItem galleryItem, boolean z) {
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void DU5() {
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void Dem(String str) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DkG() {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void Dvh() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        Context requireContext = requireContext();
        int A08 = AbstractC167007dF.A08(requireContext);
        int A09 = AbstractC167007dF.A09(requireContext, R.attr.igds_color_media_background);
        C3LO c3lo = new C3LO();
        c3lo.A01 = R.drawable.instagram_x_pano_outline_24;
        c3lo.A0G = new ViewOnClickListenerC23249ASk(this, 17);
        interfaceC56362iU.Ehd(new C3LY(c3lo));
        GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config = this.A03;
        if (galleryGridEditMediaSelectionFragment$Config == null) {
            C14360o3.A0F("configuration");
            throw C00O.createAndThrow();
        }
        interfaceC56362iU.setTitle(galleryGridEditMediaSelectionFragment$Config.A00);
        Integer num = C05F.A00;
        interfaceC56362iU.Ehg(new C114795Gm(null, null, C3DY.A00(A08), new ColorDrawable(A09), null, null, num, A08, A09, A09, -2, -2, -2, -2, true));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "gallery_grid_edit_media_selection_fragment";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r35, android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214889fQ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ceo() {
        return false;
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
        this.A00++;
    }

    @Override // X.InterfaceC187288Rv
    public final void Dve(C26086BgF c26086BgF) {
        C159407Da c159407Da = this.A06;
        if (c159407Da.A02.size() < 2) {
            Context context = getContext();
            if (context != null) {
                C9GR.A09(context, AbstractC167007dF.A0f(context, 2, 2131973248));
                return;
            }
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        List Bsg = c159407Da.Bsg();
        ArrayList A0q = AbstractC167017dG.A0q(Bsg);
        Iterator it = Bsg.iterator();
        while (it.hasNext()) {
            A0q.add(((C9NH) it.next()).A01.A00);
        }
        ArrayList<? extends Parcelable> A1F = AbstractC166987dD.A1F(A0q);
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("selected_media", A1F);
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ejf() {
        return false;
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public C214889fQ() {
        InterfaceC09390do A02 = AbstractC60492pY.A02(this);
        this.A05 = A02;
        this.A06 = new C159407Da(AbstractC166987dD.A0r(A02));
        this.A07 = AbstractC166987dD.A1G();
    }

    @Override // X.InterfaceC195388ke
    public final void DNu(GalleryItem galleryItem, BBC bbc, int i, boolean z) {
        boolean A1a = AbstractC167017dG.A1a(galleryItem, bbc);
        if (bbc instanceof C9NP) {
            AKL akl = this.A02;
            if (akl == null) {
                C14360o3.A0F("itemAdapter");
                throw C00O.createAndThrow();
            }
            Bitmap bitmap = ((C9NP) bbc).A00;
            C14360o3.A0B(bitmap, A1a ? 1 : 0);
            C159407Da c159407Da = akl.A04;
            if (!c159407Da.Ccf(galleryItem)) {
                if (!c159407Da.A8r(new C9NH(galleryItem, bitmap))) {
                    Context context = akl.A00;
                    C9GR.A09(context, AbstractC167007dF.A0f(context, Integer.valueOf(c159407Da.A00), 2131973246));
                    return;
                }
            } else {
                c159407Da.EFS(galleryItem);
                Medium medium = galleryItem.A00;
                if (medium != null) {
                    AKL.A00(medium, akl);
                }
            }
            int size = c159407Da.A02.size();
            for (int i2 = 0; i2 < size; i2++) {
                Medium medium2 = c159407Da.BJy(i2).A01.A00;
                if (medium2 != null) {
                    AKL.A00(medium2, akl);
                }
            }
            AKL.A01(akl);
        }
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        AbstractC167017dG.A1O(medium, bitmap);
        if (!this.A04) {
            HashMap hashMap = this.A07;
            hashMap.put(Integer.valueOf(medium.A05), bitmap);
            int i = this.A00 + 1;
            this.A00 = i;
            GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config = this.A03;
            String str = "configuration";
            if (galleryGridEditMediaSelectionFragment$Config != null) {
                List list = galleryGridEditMediaSelectionFragment$Config.A02;
                if (i == list.size()) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Medium A0l = AbstractC166987dD.A0l(it);
                        Bitmap bitmap2 = (Bitmap) hashMap.get(Integer.valueOf(A0l.A05));
                        if (bitmap2 != null) {
                            A1E.add(new C9NH(AbstractC167017dG.A0d(A0l), bitmap2));
                        }
                    }
                    C159407Da c159407Da = this.A06;
                    List list2 = c159407Da.A02;
                    list2.clear();
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it2 = A1E.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        list2.add(next);
                        A1E2.add(next);
                    }
                    Iterator it3 = c159407Da.A03.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC187208Rn) it3.next()).DO2(A1E2);
                    }
                    AKL akl = this.A02;
                    if (akl == null) {
                        str = "itemAdapter";
                    } else {
                        GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config2 = this.A03;
                        if (galleryGridEditMediaSelectionFragment$Config2 != null) {
                            akl.A02(galleryGridEditMediaSelectionFragment$Config2.A01);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-997734924);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable(AbstractC43591JPw.A00(947));
            if (parcelable != null) {
                this.A03 = (GalleryGridEditMediaSelectionFragment$Config) parcelable;
                C0f9.A09(912860188, A02);
                return;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = 455029736;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1293614654;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-741664526);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.gallery_grid_edit_media_selection_fragment, viewGroup, false);
        C0f9.A09(-1809532118, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-986872960);
        super.onDestroyView();
        this.A04 = true;
        this.A07.clear();
        C0f9.A09(1224035670, A02);
    }
}
