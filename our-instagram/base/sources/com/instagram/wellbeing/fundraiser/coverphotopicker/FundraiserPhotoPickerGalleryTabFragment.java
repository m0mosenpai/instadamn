package com.instagram.wellbeing.fundraiser.coverphotopicker;

import X.AbstractC018607g;
import X.AbstractC08820cl;
import X.AbstractC13530mf;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC53242c7;
import X.AbstractC93174Ft;
import X.AnonymousClass001;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C188958Yl;
import X.C189028Ys;
import X.C189058Yv;
import X.C18C;
import X.C195838lR;
import X.C1NC;
import X.C51187MjV;
import X.C53Z;
import X.C6BS;
import X.C6BX;
import X.C6FQ;
import X.C6FX;
import X.C8SF;
import X.C9BB;
import X.EnumC188968Ym;
import X.IJU;
import X.InterfaceC103384lE;
import X.Jo2;
import X.MQJ;
import X.ViewOnClickListenerC48073LPy;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.io.File;
import java.net.URI;
import java.net.URL;

/* loaded from: classes8.dex */
public class FundraiserPhotoPickerGalleryTabFragment extends C53Z implements MQJ {
    public IJU A00;
    public ViewGroup A01;
    public C195838lR A02;
    public C189058Yv A03;
    public RecyclerView mRecyclerView;

    @Override // X.MQJ
    public final boolean DNX(View view, C9BB c9bb, GalleryItem galleryItem) {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fundraiser_photo_picker_library_tab";
    }

    @Override // X.MQJ
    public final void DNN(C9BB c9bb, GalleryItem galleryItem) {
        String str;
        IJU iju = this.A00;
        if (iju != null) {
            Medium medium = galleryItem.A00;
            medium.getClass();
            iju.A02.A0b();
            C6BS c6bs = C6BS.A02;
            if (iju.A05) {
                Context context = iju.A00;
                Bitmap decodeFile = BitmapFactory.decodeFile(medium.A0X);
                C18C.A07(decodeFile, "Bitmap extraction returned null");
                Bitmap A06 = C1NC.A06(decodeFile);
                C18C.A07(A06, "New bitmap does not generate");
                File A04 = AbstractC13530mf.A04(context);
                if (!A04.exists()) {
                    str = "";
                } else {
                    C1NC.A0M(A06, A04);
                    str = A04.getPath();
                }
            } else {
                str = medium.A0X;
            }
            C14360o3.A0B(str, 0);
            URL url = new URL(AnonymousClass001.A0R("file://", str));
            String obj = C6BX.A00(AbstractC08820cl.A03(AbstractC166987dD.A19(new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef())))).toString();
            C6FQ c6fq = iju.A03;
            InterfaceC103384lE interfaceC103384lE = iju.A04;
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A03(obj, 0);
            A0s.A02(null);
            AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
        }
    }

    public static void A00(FundraiserPhotoPickerGalleryTabFragment fundraiserPhotoPickerGalleryTabFragment) {
        C195838lR c195838lR;
        if (AbstractC93174Ft.A03(fundraiserPhotoPickerGalleryTabFragment.requireContext())) {
            fundraiserPhotoPickerGalleryTabFragment.A03.A07();
            C195838lR c195838lR2 = fundraiserPhotoPickerGalleryTabFragment.A02;
            if (c195838lR2 != null) {
                c195838lR2.A00();
                c195838lR = null;
            } else {
                return;
            }
        } else {
            if (fundraiserPhotoPickerGalleryTabFragment.A02 != null) {
                return;
            }
            String A0K = AbstractC53242c7.A0K(fundraiserPhotoPickerGalleryTabFragment.requireContext());
            c195838lR = new C195838lR(fundraiserPhotoPickerGalleryTabFragment.A01, R.layout.fundraiser_photo_picker_no_permission_layout);
            c195838lR.A05(AbstractC31174DnI.A0w(fundraiserPhotoPickerGalleryTabFragment, A0K, 2131974432));
            c195838lR.A04(AbstractC31174DnI.A0w(fundraiserPhotoPickerGalleryTabFragment, A0K, 2131974431));
            c195838lR.A02(2131974430);
            c195838lR.A03(new ViewOnClickListenerC48073LPy(fundraiserPhotoPickerGalleryTabFragment, 62));
        }
        fundraiserPhotoPickerGalleryTabFragment.A02 = c195838lR;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1955694532);
        super.onCreate(bundle);
        C0f9.A09(-1461147236, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-683105581);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fundraiser_photo_picker_tab);
        C0f9.A09(-269450206, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1363383849);
        super.onResume();
        A00(this);
        C0f9.A09(1408952466, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC31173DnH.A0F(view, R.id.view_container);
        this.mRecyclerView = AbstractC31172DnG.A0G(view, android.R.id.list);
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        this.mRecyclerView.A10(new C51187MjV(this, AbstractC167017dG.A07(requireContext()), 2));
        int i = AbstractC166997dE.A0N(this).getDisplayMetrics().widthPixels / 3;
        C8SF c8sf = new C8SF(requireContext(), getSession(), C05F.A00, i, i, false);
        Jo2 jo2 = new Jo2(requireContext(), c8sf, this);
        this.mRecyclerView.setAdapter(jo2);
        C188958Yl c188958Yl = new C188958Yl(AbstractC018607g.A00(this), c8sf);
        c188958Yl.A03 = EnumC188968Ym.A05;
        c188958Yl.A09 = true;
        this.A03 = new C189058Yv(requireContext(), null, jo2, new C189028Ys(c188958Yl));
        A00(this);
    }
}
