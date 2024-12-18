package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* loaded from: classes9.dex */
public final class NMU extends AbstractC52160N6m implements InterfaceC60072op, SeekBar.OnSeekBarChangeListener {
    public static final String __redex_internal_original_name = "PostLiveIGTVVideoCoverPickerFragment";
    public Bitmap A00;
    public LinearLayout A01;
    public List A02 = AbstractC166987dD.A1E();
    public List A03 = AbstractC166987dD.A1E();
    public boolean A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131964263);
        AbstractC31176DnK.A1B(ViewOnClickListenerC55455Ok9.A00(this, 22), OPJ.A00(this, interfaceC56362iU), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "post_live_igtv_cover_picker";
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int A05;
        C14360o3.A0B(seekBar, 0);
        if (!this.A03.isEmpty() && z) {
            IgImageView igImageView = this.A06;
            if (igImageView != null) {
                List list = this.A03;
                int max = seekBar.getMax();
                if (this.A03.isEmpty()) {
                    A05 = 0;
                } else {
                    A05 = (i * AbstractC25226BEj.A05(this.A03)) / max;
                }
                igImageView.setUrl((ImageUrl) list.get(A05), this);
                return;
            }
            C14360o3.A0F("uploadedCoverPhoto");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC52160N6m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SeekBar seekBar = this.A05;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
            C56166OwY c56166OwY = new C56166OwY(this, 5);
            IgImageView igImageView = this.A06;
            if (igImageView != null) {
                igImageView.A0E = c56166OwY;
                this.A01 = (LinearLayout) view.findViewById(R.id.filmstrip_keyframes_holder);
                int i = super.A02;
                for (int i2 = 0; i2 < i; i2++) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(super.A01, super.A00);
                    IgImageView igImageView2 = new IgImageView(requireContext());
                    igImageView2.setLayoutParams(layoutParams);
                    igImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    igImageView2.setPadding(0, 0, 0, 0);
                    LinearLayout linearLayout = this.A01;
                    if (linearLayout == null) {
                        str = "thumbnailsContainer";
                    } else {
                        linearLayout.addView(igImageView2);
                    }
                }
                if (this.A03.isEmpty()) {
                    InterfaceC09390do interfaceC09390do = this.A0D;
                    AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
                    C54741OFs c54741OFs = MSY.A0Q(interfaceC09390do).A0D;
                    C14360o3.A0A(c54741OFs);
                    PZ1.A01(A0Z, c54741OFs.A09, AbstractC141776au.A00(A0Z), 3);
                }
                AbstractC31174DnI.A1E(getViewLifecycleOwner(), AbstractC31172DnG.A0E(MSW.A0b(this.A0D).A0J), new C57561PgZ(this, 27), 32);
                this.A04 = false;
                return;
            }
            str = "uploadedCoverPhoto";
        } else {
            str = "seekBar";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        OPI.A01(this, this.A0D);
        return false;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        DoA();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Dp1();
    }
}
