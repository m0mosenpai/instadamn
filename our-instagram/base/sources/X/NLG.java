package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.pendingmedia.model.ClipInfo;

/* loaded from: classes9.dex */
public final class NLG extends KB4 implements SeekBar.OnSeekBarChangeListener, InterfaceC58174Pqe, InterfaceC25193BCq, InterfaceC58090PpF {
    public static final String __redex_internal_original_name = "VideoCoverFragment";
    public double A00;
    public float A01;
    public int A02;
    public View A03;
    public LinearLayout A04;
    public SeekBar A05;
    public C50743Max A06;
    public ClipInfo A07;
    public C47Z A08;
    public NYO A09;
    public double A0A;
    public double[] A0B;
    public final InterfaceC41501vz A0E = C56034Ou6.A00(this, 0);
    public final Handler A0C = new Handler(Looper.getMainLooper(), new C55342Oh7(this, 3));
    public final Runnable A0D = new RunnableC56885PMe(this);

    @Override // X.KB4
    public final void A0C() {
    }

    @Override // X.InterfaceC58090PpF
    public final void APx(Bitmap bitmap, int i, int i2) {
        View view;
        C14360o3.A0B(bitmap, 0);
        LinearLayout linearLayout = this.A04;
        if (linearLayout != null && linearLayout.hashCode() == i2) {
            LinearLayout linearLayout2 = this.A04;
            if (linearLayout2 != null) {
                view = linearLayout2.getChildAt(i);
            } else {
                view = null;
            }
            ImageView imageView = (ImageView) view;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                imageView.setImageAlpha(128);
            }
        }
    }

    @Override // X.InterfaceC25193BCq
    public final void DfG(RunnableC208819Lp runnableC208819Lp, C208719Lf c208719Lf) {
        float ACq = AbstractC43594JPz.A0Q(AbstractC13320mI.A01(requireActivity(), InterfaceC189608af.class)).ACq();
        UserSession A0A = A0A();
        Context requireContext = requireContext();
        C47Z A0B = A0B(A0A());
        if (A0B != null) {
            this.A09 = new NYO(requireContext, A0A, runnableC208819Lp, c208719Lf, this, new C24197AoK(requireContext(), A0A(), A0B, ACq), requireArguments().getBoolean("VideoCoverFragmentBase.SAVE_AND_FINISH", false));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "video_scrubber";
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = super.A00;
        if (view2 != null) {
            AbstractC43841Ja4.A03(view2);
            int i = 0;
            view.requireViewById(R.id.filmstrip_keyframes_holder_shadow).setVisibility(0);
            view.requireViewById(R.id.filmstrip_keyframes_holder).getLayoutParams().height = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
            OM7 om7 = super.A04;
            if (om7 != null) {
                om7.A02(this);
                OM7 om72 = super.A04;
                if (om72 != null) {
                    super.A03 = om72.A00();
                    Context requireContext = requireContext();
                    C14360o3.A0C(requireContext, "null cannot be cast to non-null type com.instagram.creation.base.sessionprovider.CameraSessionProvider");
                    this.A01 = AbstractC43594JPz.A0Q(requireContext).ACq();
                    this.A04 = (LinearLayout) view.requireViewById(R.id.filmstrip_keyframes_holder);
                    View view3 = super.A00;
                    if (view3 != null) {
                        View requireViewById = view3.requireViewById(R.id.seek_frame_indicator);
                        this.A03 = requireViewById;
                        if (requireViewById != null) {
                            requireViewById.setVisibility(0);
                        }
                        SeekBar seekBar = (SeekBar) view.requireViewById(R.id.scrubber_seekbar);
                        this.A05 = seekBar;
                        if (seekBar != null) {
                            seekBar.setOnSeekBarChangeListener(this);
                        }
                        ClipInfo clipInfo = this.A07;
                        if (clipInfo == null) {
                            C14360o3.A0F("clipInfo");
                            throw C00O.createAndThrow();
                        }
                        int i2 = clipInfo.A05;
                        int i3 = clipInfo.A07;
                        int i4 = i2 - i3;
                        if (i4 > 0) {
                            i = ((this.A02 - i3) * 100) / i4;
                        }
                        SeekBar seekBar2 = this.A05;
                        if (seekBar2 != null) {
                            seekBar2.setProgress(i);
                        }
                        this.A06 = new C50743Max(AbstractC31177DnL.A09(this));
                        SeekBar seekBar3 = this.A05;
                        if (seekBar3 != null) {
                            int i5 = seekBar3.getLayoutParams().height;
                            C50743Max c50743Max = this.A06;
                            if (c50743Max != null) {
                                c50743Max.A06 = i5;
                                c50743Max.A03 = i5;
                            }
                            seekBar3.setThumb(c50743Max);
                        }
                        ((InterfaceC189598ae) AbstractC13320mI.A01(requireActivity(), InterfaceC189598ae.class)).EDa(new RunnableC56887PMg(view));
                        this.A00 = MSX.A03(this) / 7.5d;
                        this.A0A = AbstractC31177DnL.A09(this).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
                        OXC oxc = super.A07;
                        if (oxc != null) {
                            oxc.A02 = this;
                            LinearLayout linearLayout = this.A04;
                            if (linearLayout != null) {
                                linearLayout.post(this.A0D);
                                return;
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.NnR, java.lang.Object] */
    private final void A00() {
        OXC oxc = super.A07;
        if (oxc != null) {
            oxc.A00();
            LinearLayout linearLayout = this.A04;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                OXC oxc2 = super.A07;
                if (oxc2 != 0) {
                    int i = childCount - 1;
                    double d = this.A00;
                    double d2 = this.A0A;
                    LinearLayout linearLayout2 = this.A04;
                    if (linearLayout2 != null) {
                        int hashCode = linearLayout2.hashCode();
                        ?? obj = new Object();
                        obj.A04 = 0;
                        obj.A02 = i;
                        obj.A01 = d;
                        obj.A00 = d2;
                        obj.A03 = hashCode;
                        oxc2.A03(obj);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
        }
    }

    @Override // X.KB4
    public final void A0D() {
        OXC oxc = super.A07;
        if (oxc != null) {
            oxc.A02 = this;
            LinearLayout linearLayout = this.A04;
            if (linearLayout != null) {
                linearLayout.post(this.A0D);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC58174Pqe
    public final void CMa() {
        this.A0C.sendEmptyMessage(5);
    }

    @Override // X.InterfaceC58174Pqe
    public final void DaI() {
        this.A0C.post(new RunnableC56886PMf(this));
    }

    @Override // X.InterfaceC25193BCq
    public final void DfH() {
        NYO nyo = this.A09;
        if (nyo != null) {
            nyo.A0D = true;
        }
        this.A09 = null;
    }

    @Override // X.InterfaceC58090PpF
    public final void Drf(double[] dArr) {
        LinearLayout linearLayout;
        if (this.mView != null && (linearLayout = this.A04) != null && linearLayout.getChildCount() == 0) {
            if (this.A04 != null) {
                int width = ((int) (r0.getWidth() / this.A00)) + 1;
                ClipInfo clipInfo = this.A07;
                if (clipInfo == null) {
                    C14360o3.A0F("clipInfo");
                    throw C00O.createAndThrow();
                }
                long j = (clipInfo.A05 - clipInfo.A07) / width;
                double[] dArr2 = new double[width];
                for (int i = 0; i < width; i++) {
                    dArr2[i] = r9 + (i * j);
                }
                this.A0B = dArr2;
                OXC oxc = super.A07;
                if (oxc != null) {
                    oxc.A04 = dArr2;
                    oxc.A00();
                }
                Context requireContext = requireContext();
                double[] dArr3 = this.A0B;
                if (dArr3 != null) {
                    int length = dArr3.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        ImageView imageView = new ImageView(requireContext);
                        Drawable drawable = requireContext.getDrawable(R.drawable.trim_frame_bg);
                        if (drawable != null) {
                            AbstractC25231BEo.A0x(requireContext, drawable, R.color.grey_2);
                            imageView.setBackground(drawable);
                            AbstractC43592JPx.A1H(imageView, (int) this.A00, (int) this.A0A);
                            imageView.setPadding(0, 0, 0, 0);
                            LinearLayout linearLayout2 = this.A04;
                            if (linearLayout2 != null) {
                                linearLayout2.addView(imageView);
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
                A00();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC58174Pqe
    public final void ELo() {
        Bitmap bitmap;
        ConstrainedTextureView constrainedTextureView = super.A03;
        Matrix matrix = null;
        if (constrainedTextureView != null) {
            bitmap = constrainedTextureView.getBitmap();
        } else {
            bitmap = null;
        }
        ConstrainedTextureView constrainedTextureView2 = super.A03;
        if (constrainedTextureView2 != null) {
            matrix = constrainedTextureView2.getTransform(null);
        }
        this.A0C.postAtFrontOfQueue(new PSU(bitmap, matrix, this));
    }

    @Override // X.InterfaceC58174Pqe
    public final void Eky() {
        this.A0C.sendEmptyMessage(6);
    }

    @Override // X.InterfaceC58174Pqe
    public final void FC2() {
        this.A0C.postDelayed(new RunnableC56889PMi(this), 50L);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        NYO nyo;
        if (z && (nyo = this.A09) != null) {
            ClipInfo clipInfo = this.A07;
            if (clipInfo == null) {
                C14360o3.A0F("clipInfo");
                throw C00O.createAndThrow();
            }
            int i2 = clipInfo.A07;
            int i3 = i2 + (((clipInfo.A05 - i2) * i) / 100);
            this.A02 = i3;
            nyo.A0A(i3);
            C47Z A0B = A0B(A0A());
            if (A0B != null) {
                A0B.A05 = this.A02;
                A0B.A5L = true;
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return A0A();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1372858377);
        super.onCreate(bundle);
        super.A01 = AbstractC31180DnO.A0M(AbstractC60492pY.A02(this));
        setModuleNameV2("video_scrubber");
        if (AbstractC43840Ja3.A00(A0A())) {
            setDayNightMode(EnumC60792q3.A03);
        }
        C0f9.A09(-1276991601, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1636003731);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C47Z A0B = A0B(A0A());
        if (A0B != null) {
            this.A08 = A0B;
            ClipInfo clipInfo = A0B.A1N;
            this.A07 = clipInfo;
            int i = A0B.A05;
            this.A02 = i;
            int i2 = i;
            if (clipInfo == null) {
                C14360o3.A0F("clipInfo");
                throw C00O.createAndThrow();
            }
            int i3 = clipInfo.A07;
            if (i < i3 || i > (i3 = clipInfo.A05)) {
                this.A02 = i3;
                i2 = i3;
            }
            A0B.A05 = i2;
            View inflate = layoutInflater.inflate(R.layout.fragment_video_cover, viewGroup, false);
            C0f9.A09(-839187376, A02);
            return inflate;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-1686284651, A02);
        throw A0g;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-194994998);
        super.onDestroy();
        this.A0C.removeCallbacksAndMessages(null);
        C0f9.A09(-586954709, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(384772904);
        super.onDestroyView();
        LinearLayout linearLayout = this.A04;
        if (linearLayout != null) {
            linearLayout.removeCallbacks(this.A0D);
        }
        this.A04 = null;
        OXC oxc = super.A07;
        if (oxc != null) {
            oxc.A02 = null;
            oxc.A04 = null;
            oxc.A00();
        }
        super.A07 = null;
        this.A06 = null;
        this.A03 = null;
        super.A03 = null;
        this.A05 = null;
        C0f9.A09(935545386, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1789040774);
        super.onPause();
        OXC oxc = super.A07;
        if (oxc != null) {
            oxc.A00();
        }
        AbstractC25651Mw.A00(A0A()).A02(this.A0E, LY4.class);
        C0f9.A09(-1512561829, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(185230207);
        super.onResume();
        C9KK c9kk = super.A05;
        if (c9kk != null) {
            c9kk.A07 = this;
        }
        if (!requireArguments().getBoolean("VideoCoverFragmentBase.SAVE_AND_FINISH", false)) {
            AbstractC25651Mw.A00(A0A()).A01(this.A0E, LY4.class);
        }
        if (this.A04 != null) {
            if (r0.getChildCount() * this.A00 > 0.0d && super.A07 != null) {
                A00();
            }
            C0f9.A09(-1124771070, A02);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
