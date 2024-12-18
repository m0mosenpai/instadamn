package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig;
import com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel;

/* loaded from: classes9.dex */
public final class N4E extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MediaKitGalleryFoldersSheetFragment";
    public RecyclerView A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Parcelable parcelable = requireArguments().getParcelable("mk_gallery_folders_argument");
        if (parcelable != null) {
            final MediaKitGalleryFoldersSheetConfig mediaKitGalleryFoldersSheetConfig = (MediaKitGalleryFoldersSheetConfig) parcelable;
            FragmentActivity requireActivity = requireActivity();
            InterfaceC09390do interfaceC09390do = this.A01;
            interfaceC09390do.getValue();
            int A01 = AbstractC188868Yc.A01(requireActivity);
            final C8SF c8sf = new C8SF(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), C05F.A00, A01, A01, false);
            RecyclerView A0F = AbstractC31176DnK.A0F(view);
            this.A00 = A0F;
            if (A0F != null) {
                A0F.A10(new C51189MjX(requireContext().getColor(R.color.igds_quick_send_divider_background), AbstractC167017dG.A03(requireContext())));
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.setAdapter(new C2UU(c8sf, mediaKitGalleryFoldersSheetConfig) { // from class: X.9UG
                        public final C8SF A00;
                        public final MediaKitGalleryFoldersSheetConfig A01;

                        {
                            C14360o3.A0B(mediaKitGalleryFoldersSheetConfig, 1);
                            this.A01 = mediaKitGalleryFoldersSheetConfig;
                            this.A00 = c8sf;
                        }

                        @Override // X.C2UU
                        public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
                            C14360o3.A0B(viewGroup, 0);
                            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.media_kit_folders_sheet_item, viewGroup, false);
                            C14360o3.A07(inflate);
                            return new C9V4(inflate);
                        }

                        @Override // X.C2UU
                        public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
                            C9V4 c9v4 = (C9V4) c3oo;
                            C14360o3.A0B(c9v4, 0);
                            MediaKitFolderSheetItemModel mediaKitFolderSheetItemModel = (MediaKitFolderSheetItemModel) this.A01.A00.get(i);
                            C14360o3.A0B(mediaKitFolderSheetItemModel, 0);
                            C0fQ.A00(new ViewOnClickListenerC48073LPy(mediaKitFolderSheetItemModel, 7), c9v4.A01);
                            c9v4.A02.setText(mediaKitFolderSheetItemModel.A02);
                            Medium medium = mediaKitFolderSheetItemModel.A01;
                            c9v4.A00 = medium;
                            if (medium.Cff() && medium.isValid() && medium.A06() && AbstractC166987dD.A11(medium.A0X).length() > 0 && Build.VERSION.SDK_INT >= 30) {
                                C8SF.A00(null, this.A00, medium, c9v4, true);
                            } else {
                                this.A00.A04(medium, c9v4);
                            }
                        }

                        @Override // X.C2UU
                        public final int getItemCount() {
                            int A03 = C0f9.A03(1144524501);
                            int size = this.A01.A00.size();
                            C0f9.A0A(1514566536, A03);
                            return size;
                        }
                    });
                    return;
                }
            }
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        throw AbstractC166987dD.A14("List of Folder was expected but was null");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(456696010);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_simple_recycler_fragment, viewGroup, false);
        C0f9.A09(924407043, A02);
        return inflate;
    }
}
