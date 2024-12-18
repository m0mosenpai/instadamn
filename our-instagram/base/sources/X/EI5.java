package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class EI5 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BirthdayMockDialogWithFullScreenOverlayFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(1980);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ContentResolver contentResolver;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ImageView A08 = AbstractC31171DnF.A08(view, R.id.full_screen_overlay_imageview);
        Context requireContext = requireContext();
        C14360o3.A0A(A08);
        C14360o3.A0B(A08, 1);
        Drawable drawable = requireContext.getDrawable(R.drawable.ig_birthday_celebrations_confetti_fullscreen_gradient_dogfooding);
        C14360o3.A07(drawable);
        A08.setImageDrawable(drawable);
        AbstractC73003Pb.A01(A08.getDrawable());
        IgImageView A0a = AbstractC31172DnG.A0a(view, R.id.mock_dialog_circular_imageview);
        Bundle requireArguments = requireArguments();
        if (!requireArguments.isEmpty()) {
            String A00 = AbstractC111324zv.A00(1508);
            if (requireArguments.getString(A00) != null) {
                android.net.Uri A0B = AbstractC25227BEk.A0B(AbstractC31173DnH.A0k(requireArguments, A00));
                try {
                    Context context = getContext();
                    if (context != null) {
                        contentResolver = context.getContentResolver();
                    } else {
                        contentResolver = null;
                    }
                    A0a.setImageBitmap(MediaStore.Images.Media.getBitmap(contentResolver, A0B));
                } catch (IOException unused) {
                    AbstractC31173DnH.A1T(this, A0a, AbstractC31176DnK.A0g(C17060sy.A01, this.A00));
                }
                CircularImageView circularImageView = (CircularImageView) view.findViewById(R.id.mock_dialog_overlay_circular_imageview);
                Context requireContext2 = requireContext();
                C14360o3.A0A(circularImageView);
                AbstractC73003Pb.A00(requireContext2, circularImageView);
                AbstractC73003Pb.A01(circularImageView.getDrawable());
                ViewOnClickListenerC35689FpO.A01(view.findViewById(R.id.mock_dialog_primary_button), 40, this);
            }
        }
        AbstractC31173DnH.A1T(this, A0a, AbstractC31176DnK.A0g(C17060sy.A01, this.A00));
        CircularImageView circularImageView2 = (CircularImageView) view.findViewById(R.id.mock_dialog_overlay_circular_imageview);
        Context requireContext22 = requireContext();
        C14360o3.A0A(circularImageView2);
        AbstractC73003Pb.A00(requireContext22, circularImageView2);
        AbstractC73003Pb.A01(circularImageView2.getDrawable());
        ViewOnClickListenerC35689FpO.A01(view.findViewById(R.id.mock_dialog_primary_button), 40, this);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1006644866);
        super.onCreate(bundle);
        C0f9.A09(-350308647, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1280458042);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.mock_dialog_with_full_screen_overlay_fragment, viewGroup, false);
        C0f9.A09(1235981375, A02);
        return inflate;
    }
}
