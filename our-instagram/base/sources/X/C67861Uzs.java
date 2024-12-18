package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.Uzs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67861Uzs extends AbstractC72463Mt implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "IgBloksIdfaDialog";
    public int A00 = 4;
    public AbstractC12990ll A01;
    public FrameLayout A02;
    public C62862tP A03;
    public IgBloksScreenConfig A04;
    public C6T7 A05;
    public C57112jm A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "bloks-idfa-dialog";
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
    }

    @Override // X.AbstractC72463Mt
    public final AbstractC12990ll A0M() {
        return this.A01;
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        super.A0F(bundle);
        Context context = getContext();
        if (context != null) {
            Dialog dialog = new Dialog(context, R.style.IgDialog);
            dialog.setCancelable(false);
            if (this.A05 == null) {
                AbstractC25241Le.A02(__redex_internal_original_name, "Hosting component is null");
                this.A07 = false;
                A08();
                return dialog;
            }
            Context context2 = getContext();
            if (context2 != null) {
                View inflate = LayoutInflater.from(context2).inflate(R.layout.idfa_dialog, (ViewGroup) null);
                C14360o3.A07(inflate);
                this.A02 = (FrameLayout) inflate.requireViewById(R.id.bloks_container);
                C126545np c126545np = new C126545np(requireContext());
                FrameLayout frameLayout = this.A02;
                if (frameLayout != null) {
                    frameLayout.addView(c126545np);
                    C6T7 c6t7 = this.A05;
                    if (c6t7 != null) {
                        c6t7.A07(c126545np);
                    }
                    C57112jm c57112jm = this.A06;
                    if (c57112jm != null) {
                        AbstractC37301Gc2.A0v(frameLayout, c57112jm, this);
                    }
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(this.A00);
                Context context3 = getContext();
                if (context3 != null) {
                    gradientDrawable.setColor(context3.getColor(AbstractC53242c7.A0D(getContext())));
                    inflate.setBackground(gradientDrawable);
                    dialog.setContentView(inflate);
                    return dialog;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        C1338462s c1338462s;
        int A02 = C0f9.A02(-1807793478);
        super.onCreate(bundle);
        AbstractC18680vv A04 = C023409i.A0A.A04(requireArguments());
        this.A01 = A04;
        if (A04 != null) {
            IgBloksScreenConfig A01 = IgBloksScreenConfig.A01(this.mArguments, A04);
            if (A01 != null) {
                this.A04 = A01;
                C57112jm A0N = AbstractC31180DnO.A0N();
                this.A06 = A0N;
                AbstractC12990ll abstractC12990ll = this.A01;
                if (abstractC12990ll != null) {
                    C62862tP A022 = C62862tP.A02(this, this, abstractC12990ll, A0N);
                    this.A03 = A022;
                    IgBloksScreenConfig igBloksScreenConfig = this.A04;
                    if (igBloksScreenConfig != null && (c1338462s = igBloksScreenConfig.A07) != null) {
                        this.A05 = C6T7.A00(requireContext(), c1338462s, A022).A00();
                    } else {
                        i = 616787432;
                        C0f9.A09(i, A02);
                        return;
                    }
                }
                i = 1020200645;
                C0f9.A09(i, A02);
                return;
            }
            throw new IllegalStateException("IgBloksScreenConfig is null");
        }
        throw new IllegalStateException("Session can not be null");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(784329951);
        super.onDestroy();
        C6T7 c6t7 = this.A05;
        if (c6t7 != null) {
            c6t7.A03();
        }
        C0f9.A09(1773340820, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1164242359);
        super.onDestroyView();
        C6T7 c6t7 = this.A05;
        if (c6t7 != null) {
            c6t7.A04();
        }
        this.A05 = null;
        this.A02 = null;
        C0f9.A09(-1775274152, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-916897706);
        super.onResume();
        C0f9.A09(158786884, A02);
    }
}
