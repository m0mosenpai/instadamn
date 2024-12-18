package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9fE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214769fE extends AbstractC59962oe implements InterfaceC193488hT {
    public static final String __redex_internal_original_name = "GalleryGridFormatsBottomSheet";
    public UserSession A00;
    public GalleryGridEditMediaSelectionFragment$Config A01;
    public A73 A02;
    public ArrayList A03;
    public RecyclerView A04;
    public C8SF A05;
    public A72 A06;
    public ArrayList A07;
    public final HashMap A08 = AbstractC166987dD.A1G();

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        return true;
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "gallery_grid_formats_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        int i3;
        String A0k;
        int i4;
        int i5 = 0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        int A03 = AbstractC167017dG.A03(requireContext());
        int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.ad_tag_max_width);
        int dimensionPixelSize2 = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.gallery_grid_format_thumbnail_height);
        UserSession userSession = this.A00;
        if (userSession != null) {
            C8SF c8sf = new C8SF(requireActivity, userSession, C05F.A00, dimensionPixelSize, dimensionPixelSize2, false);
            this.A05 = c8sf;
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                this.A06 = new A72(requireActivity, requireContext, c8sf, userSession2, new B8U(this, 20), dimensionPixelSize, dimensionPixelSize2);
                A00();
                RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.gallery_grid_format_picker_recycler_view);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext);
                linearLayoutManager.A1o(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                A72 a72 = this.A06;
                if (a72 == null) {
                    str = "galleryGridFormatsAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                recyclerView.setAdapter((C2UU) AbstractC166987dD.A17(a72.A01));
                recyclerView.A10(new C3YB(A03, A03));
                this.A04 = recyclerView;
                GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config = this.A01;
                if (galleryGridEditMediaSelectionFragment$Config != null) {
                    View A0U = AbstractC167017dG.A0U(view, R.id.gallery_grid_format_picker_edit_selection_stub);
                    C0fQ.A00(new ViewOnClickListenerC48068LPt(8, this, requireActivity, requireContext), A0U);
                    Resources resources = requireContext.getResources();
                    List list = galleryGridEditMediaSelectionFragment$Config.A01;
                    boolean z = list instanceof Collection;
                    if (!z || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC166987dD.A0l(it).A05() && (i5 = i5 + 1) < 0) {
                                break;
                            }
                        }
                    }
                    if (z && list.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it2 = list.iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            if (AbstractC166987dD.A0l(it2).Cff() && (i = i + 1) < 0) {
                                AbstractC16960so.A1T();
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                    TextView A0T = AbstractC166997dE.A0T(A0U, R.id.gallery_formats_picker_edit_selection_title);
                    if (i5 > 0) {
                        i2 = 2131963072;
                        if (i > 0) {
                            i2 = 2131963073;
                        }
                    } else if (i > 0) {
                        i2 = 2131963074;
                    } else {
                        throw AbstractC166987dD.A14("editSelectionMedia should have at least one photo or video.");
                    }
                    A0T.setText(resources.getString(i2));
                    TextView A0T2 = AbstractC166997dE.A0T(A0U, R.id.gallery_formats_picker_edit_selection_subtitle);
                    if (i5 > 0) {
                        if (i == 0) {
                            i4 = R.plurals.gallery_formats_picker_edit_selection_n_photos;
                        } else if (i5 == 1) {
                            i3 = R.plurals.gallery_formats_picker_edit_selection_one_photo_n_videos;
                        } else if (i == 1) {
                            i4 = R.plurals.gallery_formats_picker_edit_selection_n_photos_one_video;
                        } else {
                            A0k = resources.getString(2131963071, Integer.valueOf(i5), Integer.valueOf(i));
                            A0T2.setText(A0k);
                            return;
                        }
                        A0k = AbstractC167017dG.A0k(resources, i5, i4);
                        A0T2.setText(A0k);
                        return;
                    }
                    if (i > 0) {
                        i3 = R.plurals.gallery_formats_picker_edit_selection_n_videos;
                    } else {
                        throw AbstractC166987dD.A14("editSelectionMedia should have at least one photo or video.");
                    }
                    A0k = AbstractC167017dG.A0k(resources, i, i3);
                    A0T2.setText(A0k);
                    return;
                }
                return;
            }
        }
        str = "session";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r9 = this;
            java.util.HashMap r0 = r9.A08
            r0.clear()
            java.util.ArrayList r0 = r9.A03
            java.lang.String r8 = "selectedMedia"
            if (r0 == 0) goto L21
            java.util.Iterator r2 = X.AbstractC166997dE.A13(r0)
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r1 = X.AbstractC166997dE.A0l(r2)
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
            X.8SF r0 = r9.A05
            if (r0 != 0) goto L29
            java.lang.String r8 = "thumbnailLoader"
        L21:
            X.C14360o3.A0F(r8)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L29:
            r0.A04(r1, r9)
            goto Lf
        L2d:
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.ArrayList r0 = r9.A07
            if (r0 != 0) goto L3c
            java.lang.String r8 = "galleryFormats"
            goto L21
        L3c:
            java.util.Iterator r7 = X.AbstractC166997dE.A13(r0)
        L40:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r5 = X.AbstractC166997dE.A0l(r7)
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat r5 = (com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat) r5
            java.util.ArrayList r6 = r9.A03
            if (r6 == 0) goto L21
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r1 = 1
            int r0 = r5.ordinal()
            if (r0 != r1) goto La1
            r2 = 0
            java.util.Iterator r1 = r6.iterator()
        L60:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L98
            com.instagram.common.gallery.Medium r0 = X.AbstractC166987dD.A0l(r1)
            boolean r0 = r0.A05()
            if (r0 != 0) goto L95
            java.lang.Integer r2 = X.C05F.A01
        L72:
            int r0 = r2.intValue()
            if (r0 == 0) goto L93
            r0 = 0
        L79:
            java.util.ArrayList r1 = r9.A03
            if (r0 == 0) goto L88
            if (r1 == 0) goto L21
            X.AdT r0 = new X.AdT
            r0.<init>(r5, r2, r1)
            r4.add(r0)
            goto L40
        L88:
            if (r1 == 0) goto L21
            X.AdT r0 = new X.AdT
            r0.<init>(r5, r2, r1)
            r3.add(r0)
            goto L40
        L93:
            r0 = 1
            goto L79
        L95:
            int r2 = r2 + 1
            goto L60
        L98:
            r0 = 2
            if (r2 < r0) goto L9e
            r0 = 6
            if (r2 <= r0) goto La1
        L9e:
            java.lang.Integer r2 = X.C05F.A0C
            goto L72
        La1:
            java.lang.Integer r2 = X.C05F.A00
            goto L72
        La4:
            X.A72 r1 = r9.A06
            if (r1 != 0) goto Lac
            java.lang.String r8 = "galleryGridFormatsAdapter"
            goto L21
        Lac:
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r0.addAll(r4)
            r0.addAll(r3)
            java.util.List r2 = r1.A00
            r2.clear()
            r2.addAll(r0)
            X.0do r0 = r1.A01
            java.lang.Object r1 = X.AbstractC166987dD.A17(r0)
            X.2zD r1 = (X.C66362zD) r1
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r0.<init>()
            r0.A01(r2)
            r1.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214769fE.A00():void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        AbstractC167017dG.A1O(medium, bitmap);
        this.A08.put(Integer.valueOf(medium.A05), bitmap);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9223 && i2 == -1 && intent != null) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("selected_media");
            if (parcelableArrayListExtra != null) {
                this.A03 = parcelableArrayListExtra;
                A00();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2009856758);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = C023409i.A0A.A06(bundle2);
            this.A03 = AbstractC153636vY.A02(bundle2, Medium.class, "selected_media_list");
            this.A07 = AbstractC153636vY.A02(bundle2, GalleryGridFormat.class, "format_list");
            this.A01 = (GalleryGridEditMediaSelectionFragment$Config) bundle2.getParcelable("edit_selection_config");
        }
        C0f9.A09(-1235888993, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1060406965);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.gallery_grid_formats_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-651974290, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(567117008);
        super.onDestroyView();
        this.A08.clear();
        A72 a72 = this.A06;
        if (a72 == null) {
            str = "galleryGridFormatsAdapter";
        } else {
            int itemCount = ((C2UU) AbstractC166987dD.A17(a72.A01)).getItemCount();
            for (int i = 0; i < itemCount; i++) {
                RecyclerView recyclerView = this.A04;
                if (recyclerView == null) {
                    str = "recyclerView";
                } else {
                    recyclerView.A0V(i);
                }
            }
            C0f9.A09(-1772369634, A02);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
