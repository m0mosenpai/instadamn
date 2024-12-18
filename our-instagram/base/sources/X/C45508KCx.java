package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: X.KCx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45508KCx extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC195648l5, InterfaceC60122ou, InterfaceC188988Yo, InterfaceC23471Cj, AdapterView.OnItemSelectedListener {
    public static final String __redex_internal_original_name = "IGTVUploadGalleryFragment";
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public ViewGroup A04;
    public TextView A05;
    public RecyclerView A06;
    public Jo6 A07;
    public EnumC53119NeW A08;
    public C195838lR A09;
    public int A0A;
    public C189058Yv A0B;
    public TriangleSpinner A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;

    @Override // X.InterfaceC188988Yo
    public final void DEP(Exception exc) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        OPJ.A01(interfaceC56362iU);
        View ESp = interfaceC56362iU.ESp(AbstractC166987dD.A0r(this.A0F), R.layout.gallery_picker_layout, 0, 0);
        C14360o3.A0C(ESp, "null cannot be cast to non-null type com.instagram.ui.widget.trianglespinner.TriangleSpinner");
        TriangleSpinner triangleSpinner = (TriangleSpinner) ESp;
        triangleSpinner.setDropDownVerticalOffset(-C3HB.A00(AbstractC166997dE.A0L(triangleSpinner)));
        triangleSpinner.setAdapter((SpinnerAdapter) this.A0E.getValue());
        triangleSpinner.setOnItemSelectedListener(this);
        this.A0C = triangleSpinner;
        triangleSpinner.A00 = (InterfaceC57884Plo) this.A0D.getValue();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_upload_gallery_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = (ViewGroup) view;
        this.A03 = view.findViewById(R.id.loading_spinner);
        this.A05 = AbstractC166987dD.A0e(view, R.id.no_media_text);
        JnN jnN = new JnN(this, 12);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        gridLayoutManager.A01 = jnN;
        RecyclerView A0B = AbstractC43592JPx.A0B(view, R.id.gallery_recycler_view);
        A0B.setLayoutManager(gridLayoutManager);
        Jo6 jo6 = this.A07;
        if (jo6 == null) {
            C14360o3.A0F("galleryAdapter");
            throw C00O.createAndThrow();
        }
        A0B.setAdapter(jo6);
        A0B.A10(new JoK(jnN, this.A0A));
        this.A06 = A0B;
    }

    @Override // X.InterfaceC195648l5
    public final Folder getCurrentFolder() {
        C189058Yv c189058Yv = this.A0B;
        if (c189058Yv == null) {
            C14360o3.A0F("mediaLoaderController");
            throw C00O.createAndThrow();
        }
        return c189058Yv.A01;
    }

    @Override // X.InterfaceC195648l5
    public final List getFolders() {
        C189058Yv c189058Yv = this.A0B;
        if (c189058Yv == null) {
            C14360o3.A0F("mediaLoaderController");
            throw C00O.createAndThrow();
        }
        return AbstractC47899LDt.A00(LWM.A00, c189058Yv);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0F);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        ((IGTVUploadViewModel) this.A0G.getValue()).A04(this, C52528NMa.A00);
        return false;
    }

    public C45508KCx() {
        C0YZ A1D = AbstractC25225BEi.A1D(IGTVUploadViewModel.class);
        this.A0G = AbstractC25225BEi.A0a(new C57538PgC(this, 40), new C57538PgC(this, 41), new C57251PbZ(30, null, this), A1D);
        this.A0E = C1XM.A00(new C57538PgC(this, 39));
        this.A0D = C1XM.A00(new C57538PgC(this, 38));
        this.A0F = AbstractC60492pY.A02(this);
    }

    public static final void A00(C45508KCx c45508KCx, Folder folder) {
        String str;
        int i = c45508KCx.getCurrentFolder().A02;
        int i2 = folder.A02;
        if (i != i2) {
            C189058Yv c189058Yv = c45508KCx.A0B;
            if (c189058Yv == null) {
                str = "mediaLoaderController";
            } else {
                c189058Yv.A0C(i2);
                RecyclerView recyclerView = c45508KCx.A06;
                if (recyclerView == null) {
                    str = "galleryGridView";
                } else {
                    recyclerView.A0n(0);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC188988Yo
    public final void DS1(C189058Yv c189058Yv, List list, List list2, int i) {
        if (isResumed()) {
            String str = "loadingSpinner";
            View view = this.A03;
            if (view != null) {
                view.setVisibility(8);
                InterfaceC09390do interfaceC09390do = this.A0E;
                int count = ((C44417JkC) interfaceC09390do.getValue()).getCount();
                str = "emptyGalleryText";
                RecyclerView recyclerView = this.A06;
                if (count > 0) {
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        TextView textView = this.A05;
                        if (textView != null) {
                            textView.setVisibility(8);
                            C0fA.A00((BaseAdapter) interfaceC09390do.getValue(), -948707981);
                            return;
                        }
                    }
                    C14360o3.A0F("galleryGridView");
                } else {
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                        TextView textView2 = this.A05;
                        if (textView2 != null) {
                            EnumC53119NeW enumC53119NeW = this.A08;
                            if (enumC53119NeW == null) {
                                str = "pickerMode";
                            } else {
                                int i2 = 2131964192;
                                if (enumC53119NeW == EnumC53119NeW.A03) {
                                    i2 = 2131964193;
                                }
                                textView2.setText(i2);
                                textView2.setVisibility(0);
                                C0fA.A00((BaseAdapter) interfaceC09390do.getValue(), -948707981);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F("galleryGridView");
                }
                throw C00O.createAndThrow();
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        String str;
        if (AbstractC93174Ft.A03(requireContext())) {
            C189058Yv c189058Yv = this.A0B;
            if (c189058Yv == null) {
                str = "mediaLoaderController";
            } else {
                c189058Yv.A07();
                C195838lR c195838lR = this.A09;
                if (c195838lR != null) {
                    c195838lR.A00();
                    return;
                }
                return;
            }
        } else {
            if (this.A09 == null) {
                ViewGroup viewGroup = this.A04;
                if (viewGroup == null) {
                    str = "galleryContainer";
                } else {
                    this.A09 = AbstractC43593JPy.A0j(viewGroup);
                }
            }
            Context requireContext = requireContext();
            String A0K = AbstractC53242c7.A0K(requireContext);
            C195838lR c195838lR2 = this.A09;
            if (c195838lR2 != null) {
                c195838lR2.A05(requireContext.getString(2131964250));
                c195838lR2.A04(AbstractC167007dF.A0f(requireContext, A0K, 2131964249));
                c195838lR2.A02(2131964248);
                c195838lR2.A03(new ViewOnClickListenerC48073LPy(this, 3));
                return;
            }
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC188968Ym enumC188968Ym;
        int A02 = C0f9.A02(-1113754932);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0F;
        interfaceC09390do.getValue();
        interfaceC09390do.getValue();
        this.A02 = (int) Math.ceil(0.0d);
        interfaceC09390do.getValue();
        this.A01 = (int) Math.ceil(900.0d);
        interfaceC09390do.getValue();
        this.A00 = 900500;
        this.A0A = AbstractC166987dD.A0C(requireContext, 2);
        Serializable serializable = requireArguments.getSerializable(MSV.A00(1285));
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.igtv.uploadflow.gallery.IGTVUploadGalleryFragment.IGTVGalleryItemPickerMode");
        EnumC53119NeW enumC53119NeW = (EnumC53119NeW) serializable;
        this.A08 = enumC53119NeW;
        String str = "pickerMode";
        if (enumC53119NeW != null) {
            EnumC53119NeW enumC53119NeW2 = EnumC53119NeW.A03;
            float f = 0.643f;
            if (enumC53119NeW == enumC53119NeW2) {
                f = 0.5625f;
            }
            int i = (int) ((r10 - this.A0A) / f);
            C8SF c8sf = new C8SF(requireContext, AbstractC166987dD.A0r(interfaceC09390do), C05F.A00, AbstractC13880nE.A0A(requireContext) / 3, i, true);
            this.A07 = new Jo6(c8sf, AbstractC166987dD.A0r(interfaceC09390do), this, f, i);
            C188958Yl c188958Yl = new C188958Yl(AbstractC018607g.A00(this), c8sf);
            EnumC53119NeW enumC53119NeW3 = this.A08;
            if (enumC53119NeW3 != null) {
                if (enumC53119NeW3 == enumC53119NeW2) {
                    enumC188968Ym = EnumC188968Ym.A06;
                } else {
                    enumC188968Ym = EnumC188968Ym.A05;
                }
                c188958Yl.A03 = enumC188968Ym;
                c188958Yl.A07 = this;
                C189028Ys c189028Ys = new C189028Ys(c188958Yl);
                Jo6 jo6 = this.A07;
                if (jo6 == null) {
                    str = "galleryAdapter";
                } else {
                    this.A0B = new C189058Yv(requireContext, null, jo6, c189028Ys);
                    C0f9.A09(-156404604, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2141355666);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.upload_gallery, false);
        C0f9.A09(782148790, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-968707494);
        super.onDestroyView();
        RecyclerView recyclerView = this.A06;
        if (recyclerView == null) {
            C14360o3.A0F("galleryGridView");
            throw C00O.createAndThrow();
        }
        recyclerView.A0a();
        C0f9.A09(632475788, A02);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        A00(this, (Folder) getFolders().get(i));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1240503588);
        super.onPause();
        C189058Yv c189058Yv = this.A0B;
        if (c189058Yv == null) {
            C14360o3.A0F("mediaLoaderController");
            throw C00O.createAndThrow();
        }
        c189058Yv.A08();
        C0f9.A09(-694451016, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1203193349);
        super.onResume();
        if (AbstractC93174Ft.A03(requireContext())) {
            C195838lR c195838lR = this.A09;
            if (c195838lR != null) {
                c195838lR.A00();
            }
            String str = "loadingSpinner";
            View view = this.A03;
            if (view != null) {
                view.setVisibility(0);
                RecyclerView recyclerView = this.A06;
                if (recyclerView == null) {
                    str = "galleryGridView";
                } else {
                    recyclerView.setVisibility(8);
                    TextView textView = this.A05;
                    if (textView == null) {
                        str = "emptyGalleryText";
                    } else {
                        textView.setVisibility(8);
                        C189058Yv c189058Yv = this.A0B;
                        if (c189058Yv == null) {
                            str = "mediaLoaderController";
                        } else {
                            c189058Yv.A07();
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        AbstractC93174Ft.A01(requireActivity(), this);
        C0f9.A09(1580648590, A02);
    }
}
