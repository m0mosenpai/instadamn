package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.KCf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45490KCf extends AbstractC59962oe implements InterfaceC23471Cj, MQU {
    public static final C18240vB A0O;
    public static final String __redex_internal_original_name = "CropFragment";
    public int A00;
    public Bitmap A01;
    public RectF A02;
    public android.net.Uri A03;
    public ImageView A04;
    public InterfaceC50451MPf A05;
    public CropImageView A06;
    public ExifImageData A07;
    public C195838lR A08;
    public C6WQ A09;
    public InterfaceC197178nn A0A;
    public boolean A0B;
    public boolean A0C;
    public float[] A0D;
    public android.net.Uri A0E;
    public ViewGroup A0F;
    public CropInfo A0H;
    public String A0I;
    public String A0J;
    public boolean A0K;
    public final ArrayList A0M = AbstractC166987dD.A1E();
    public final Handler A0L = new Handler();
    public MediaUploadMetadata A0G = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
    public final InterfaceC09390do A0N = AbstractC60492pY.A02(this);

    @Override // X.MQU
    public final /* synthetic */ void DJF(CropImageView cropImageView) {
    }

    @Override // X.MQU
    public final /* synthetic */ void DJJ(CropImageView cropImageView) {
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C14360o3.A0B(map, 0);
        Context context = getContext();
        C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        Object obj = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        if (obj != null && obj != EnumC172127lh.A05) {
            C195838lR c195838lR = this.A08;
            if (c195838lR != null) {
                c195838lR.A06(map);
                return;
            }
            Context requireContext = requireContext();
            String A0K = AbstractC53242c7.A0K(requireContext);
            C14360o3.A07(A0K);
            ViewGroup viewGroup = this.A0F;
            if (viewGroup == null) {
                return;
            }
            C195838lR A0j = AbstractC43593JPy.A0j(viewGroup);
            A0j.A06(map);
            A0j.A05(AbstractC167007dF.A0f(requireContext, A0K, 2131974432));
            A0j.A04(AbstractC167007dF.A0f(requireContext, A0K, 2131974431));
            A0j.A02(2131974430);
            A0j.A03(new ViewOnClickListenerC48066LPr(40, context, this));
            this.A08 = A0j;
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "crop";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        try {
            this.A05 = (InterfaceC50451MPf) context;
        } catch (ClassCastException unused) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(context);
            throw new ClassCastException(AbstractC166997dE.A0x(" must implement CropFragmentListener", A1C));
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        float[] cropMatrixValues;
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        if (AbstractC52812bN.A00) {
            CropImageView cropImageView = this.A06;
            if (cropImageView == null) {
                cropMatrixValues = this.A0D;
            } else {
                cropMatrixValues = cropImageView.getCropMatrixValues();
            }
            bundle.putFloatArray("CropFragment.CropMatrix", cropMatrixValues);
        }
    }

    public static final void A00(android.net.Uri uri, android.net.Uri uri2, C45490KCf c45490KCf) {
        Location location;
        ExifImageData exifImageData = c45490KCf.A07;
        if (exifImageData != null && c45490KCf.A05 != null) {
            Double d = exifImageData.A01;
            Double d2 = exifImageData.A02;
            String str = null;
            if (d != null && d2 != null) {
                location = new Location("photo");
                location.setLatitude(d.doubleValue());
                location.setLongitude(d2.doubleValue());
            } else {
                location = null;
            }
            int i = c45490KCf.requireArguments().getInt("mediaSource", 0);
            InterfaceC50451MPf interfaceC50451MPf = c45490KCf.A05;
            if (interfaceC50451MPf != null) {
                CropInfo cropInfo = c45490KCf.A0H;
                int i2 = exifImageData.A00;
                HashMap hashMap = exifImageData.A03;
                MediaUploadMetadata mediaUploadMetadata = c45490KCf.A0G;
                String str2 = c45490KCf.A0J;
                if (uri2 != null) {
                    str = uri2.toString();
                }
                interfaceC50451MPf.DH7(location, uri, mediaUploadMetadata, cropInfo, str2, str, c45490KCf.A0I, hashMap, i2, i);
            }
        }
    }

    public static final void A01(C45490KCf c45490KCf) {
        InterfaceC197178nn interfaceC197178nn;
        Bitmap bitmap;
        RectF rectF;
        ExifImageData exifImageData;
        CropImageView cropImageView = c45490KCf.A06;
        if (cropImageView != null && cropImageView.A04 != null && (interfaceC197178nn = c45490KCf.A0A) != null && (bitmap = c45490KCf.A01) != null && (rectF = c45490KCf.A02) != null && (exifImageData = c45490KCf.A07) != null && !c45490KCf.A0K) {
            cropImageView.A0H();
            int width = interfaceC197178nn.getWidth();
            int height = interfaceC197178nn.getHeight();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            int i = exifImageData.A00;
            RectF A00 = AbstractC44263Jh9.A00(rectF, cropImageView, width2, height2, i);
            Rect A04 = MX2.A04(A00);
            Rect A01 = MX2.A01(A04);
            Rect A05 = MX2.A05(A00, width, height, width2, height2);
            if (A04.width() == A04.height() && A05.width() != A05.height()) {
                A05 = MX2.A01(A05);
                A04 = A01;
            }
            if (AbstractC47840LBe.A01(A05, A04, i)) {
                c45490KCf.A0H = new CropInfo(A05, interfaceC197178nn.getWidth(), interfaceC197178nn.getHeight());
                c45490KCf.A0K = true;
                U7F u7f = cropImageView.A01;
                if (u7f != null) {
                    u7f.A02();
                    cropImageView.setOnTouchListener(null);
                    cropImageView.A01 = null;
                }
                cropImageView.A03 = null;
                c45490KCf.A0D = cropImageView.getCropMatrixValues();
                C50713MaC.A00(AbstractC166987dD.A0r(c45490KCf.A0N)).A02(c45490KCf.requireContext(), new CropInfo(A01, bitmap.getWidth(), bitmap.getHeight()), exifImageData.A00, false);
                cropImageView.A04 = null;
                if (!c45490KCf.A0B) {
                    CreationSession creationSession = ((MX5) AbstractC43594JPz.A0Q(c45490KCf.requireContextAs(InterfaceC189608af.class))).A01;
                    creationSession.A03 = bitmap;
                    creationSession.A04 = A04;
                    A00(interfaceC197178nn.getUri(), interfaceC197178nn.Ba0(), c45490KCf);
                    return;
                }
                String string = AbstractC166997dE.A0N(c45490KCf).getString(2131969964);
                RunnableC49933M3a runnableC49933M3a = new RunnableC49933M3a(A01, c45490KCf);
                Handler handler = c45490KCf.A0L;
                C14360o3.A0B(handler, 4);
                ProgressDialog show = ProgressDialog.show(c45490KCf.requireActivity(), null, string, true, false);
                C14360o3.A0A(show);
                new Thread(new M7O(show, handler, c45490KCf, runnableC49933M3a)).start();
            }
        }
    }

    @Override // X.MQU
    public final void DCF(boolean z) {
        C5L6 c5l6;
        if (!this.A0C && !z) {
            c5l6 = C5L6.A08;
        } else {
            c5l6 = C5L6.A0E;
        }
        ((MX5) AbstractC43594JPz.A0Q(requireContextAs(InterfaceC189608af.class))).A01.A05 = c5l6;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0N);
    }

    static {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "image-preload-executor";
        A0O = new C18240vB(A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1152511855);
        int A022 = C0f9.A02(613538219);
        super.onCreate(bundle);
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            it.next();
        }
        C0f9.A09(-50062549, A022);
        Bundle requireArguments = requireArguments();
        this.A03 = (android.net.Uri) requireArguments.getParcelable("output");
        this.A00 = requireArguments.getInt(MSV.A00(157));
        this.A0E = (android.net.Uri) requireArguments.getParcelable(MSV.A00(156));
        String string = requireArguments.getString("media_info");
        MediaUploadMetadata A023 = C9L8.A02(AbstractC166987dD.A0o(this.A0N), requireArguments.getString("media_info"));
        if (A023 == null) {
            A023 = new MediaUploadMetadata(null, requireArguments.getString(MSV.A00(579)), null, null, null, string, null, null, null, null, null, false);
        }
        this.A0G = A023;
        this.A0J = requireArguments.getString("content_url");
        this.A0I = requireArguments.getString("android.intent.extra.TEXT");
        if (bundle != null && AbstractC52812bN.A00) {
            this.A0D = bundle.getFloatArray("CropFragment.CropMatrix");
        }
        this.A0B = requireArguments().getBoolean("CropFragment.isAvatar", false);
        C0f9.A09(1093918010, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1120925585);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_crop, false);
        this.A0F = (ViewGroup) A0R.findViewById(R.id.preview_container);
        this.A06 = (CropImageView) A0R.findViewById(R.id.crop_image_view);
        View A0S = AbstractC166997dE.A0S(A0R, R.id.button_back);
        ViewOnClickListenerC48063LPo.A00(A0S, 51, this);
        Resources.Theme theme = requireActivity().getTheme();
        C14360o3.A07(theme);
        A0S.setBackground(new C3DW(theme, C05F.A00));
        ViewOnClickListenerC48063LPo.A00(A0R.requireViewById(R.id.save), 52, this);
        ImageView A0I = AbstractC31173DnH.A0I(A0R, R.id.croptype_toggle_button);
        this.A04 = A0I;
        if (A0I != null) {
            ViewOnClickListenerC48063LPo.A00(A0I, 53, this);
        }
        C0f9.A09(-534905263, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-246818464);
        super.onDestroy();
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            M7O m7o = (M7O) it.next();
            Runnable runnable = m7o.A03;
            runnable.run();
            m7o.A01.removeCallbacks(runnable);
        }
        C0f9.A09(-1380922101, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        U7F u7f;
        InterfaceC197178nn interfaceC197178nn;
        String Avl;
        int A02 = C0f9.A02(-1346653512);
        super.onDestroyView();
        if (!this.A0K && (interfaceC197178nn = this.A0A) != null && (Avl = interfaceC197178nn.Avl()) != null) {
            A0O.ATO(new C216759iW(Avl));
        }
        this.A0K = false;
        CropImageView cropImageView = this.A06;
        if (cropImageView != null && (u7f = cropImageView.A01) != null) {
            u7f.A02();
            cropImageView.setOnTouchListener(null);
            cropImageView.A01 = null;
        }
        CropImageView cropImageView2 = this.A06;
        if (cropImageView2 != null) {
            cropImageView2.A03 = null;
            cropImageView2.A04 = null;
        }
        this.A06 = null;
        C6WQ c6wq = this.A09;
        if (c6wq != null) {
            c6wq.dismiss();
        }
        this.A09 = null;
        this.A04 = null;
        C195838lR c195838lR = this.A08;
        if (c195838lR != null) {
            c195838lR.A00();
        }
        this.A08 = null;
        this.A0F = null;
        C0f9.A09(44313364, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(-1265177340);
        super.onDetach();
        this.A05 = null;
        C0f9.A09(-250967382, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        int A02 = C0f9.A02(-1436633426);
        super.onResume();
        AbstractC31174DnI.A0H(this).addFlags(1024);
        if (Build.VERSION.SDK_INT < 33 && !AbstractC23451Ch.A07(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            AbstractC43592JPx.A1C(requireActivity(), this, "android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            C195838lR c195838lR = this.A08;
            if (c195838lR != null) {
                c195838lR.A00();
            }
            this.A08 = null;
            android.net.Uri uri = this.A0E;
            if (uri == null) {
                i = -1766371573;
                C0f9.A09(i, A02);
            }
            AbstractC018607g.A00(this).A04(new C48109LRj(uri, this), AbstractC62402sf.A00.getAndIncrement());
            if (this.A01 == null) {
                C6WQ c6wq = new C6WQ(requireContext(), true);
                this.A09 = c6wq;
                c6wq.A00(getString(2131965660));
                C6WQ c6wq2 = this.A09;
                if (c6wq2 != null) {
                    C0fJ.A00(c6wq2);
                }
            }
        }
        if (!this.A0B) {
            C6WI.A01().A0L = true;
        }
        i = -1543652971;
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1891831366);
        super.onStart();
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            C0fJ.A00(((M7O) it.next()).A00);
        }
        C0f9.A09(1756143558, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1645539146);
        super.onStop();
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            ((M7O) it.next()).A00.hide();
        }
        C0f9.A09(576256733, A02);
    }
}
