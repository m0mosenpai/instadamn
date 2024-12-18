package X;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EIx extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BirthdayEffectsSettingsFragment";
    public Bitmap A00;
    public android.net.Uri A01;
    public C56352iT A02;
    public C684436h A03;
    public CircularImageView A04;
    public CircularImageView A05;
    public IgdsBottomButtonLayout A06;
    public C31870Dzc A07;
    public C34671FPg A08;
    public C31294DpG A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public RecyclerView A0E;
    public IgSimpleImageView A0F;
    public IgSimpleImageView A0G;
    public CircularImageView A0H;
    public CircularImageView A0I;
    public CircularImageView A0J;
    public CircularImageView A0K;
    public C31349DqE A0L;
    public C6WQ A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "birthday_effects_visibility_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC53712dA interfaceC53712dA;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ComponentCallbacks2 rootActivity = getRootActivity();
        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
            interfaceC53712dA.EfL(8);
        }
        C56352iT A01 = C56342iS.A01(ViewOnClickListenerC35689FpO.A00(this, 38), AbstractC31176DnK.A0C(requireView(), R.id.birthday_effects_settings_action_bar));
        this.A02 = A01;
        A01.A0X(new Ft8(this, 4));
        ((C31807DyR) this.A0O.getValue()).A01.A06(getViewLifecycleOwner(), new C31421DrQ(7, new JEZ(this, 26)));
        CircularImageView circularImageView = this.A04;
        String str = "profilePicImageView";
        if (circularImageView != null) {
            AbstractC31173DnH.A1T(this, circularImageView, AbstractC31176DnK.A0g(C17060sy.A01, this.A0N));
            A06(this, true);
            CircularImageView circularImageView2 = this.A04;
            if (circularImageView2 != null) {
                ViewOnClickListenerC35689FpO.A01(circularImageView2, 36, this);
                CircularImageView circularImageView3 = this.A05;
                if (circularImageView3 == null) {
                    str = "selfieCameraImageView";
                } else {
                    ViewOnClickListenerC35689FpO.A01(circularImageView3, 37, this);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A06;
                    str = "bottomButtonsView";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setPrimaryActionOnClickListener(ViewOnClickListenerC35689FpO.A00(this, 34));
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A06;
                        if (igdsBottomButtonLayout2 != null) {
                            igdsBottomButtonLayout2.setSecondaryActionOnClickListener(ViewOnClickListenerC35689FpO.A00(this, 35));
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(EIx eIx) {
        C31349DqE c31349DqE = eIx.A0L;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
            eIx.A0L = null;
        }
    }

    public static final void A02(EIx eIx) {
        C6WQ c6wq = eIx.A0M;
        if (c6wq != null) {
            c6wq.dismiss();
        }
        eIx.A0M = null;
    }

    public static final void A04(EIx eIx, String str, int i) {
        AbstractC12990ll A0o = AbstractC166987dD.A0o(eIx.A0N);
        Integer valueOf = Integer.valueOf(i);
        C14360o3.A0B(A0o, 0);
        C25621Ms A0q = AbstractC25228BEl.A0q(A0o);
        AbstractC31181DnP.A0m(A0q);
        if (valueOf != null) {
            A0q.A0D("visibility_status", valueOf.intValue());
        }
        A0q.A9s(AbstractC111324zv.A00(4357), "true");
        if (str != null) {
            A0q.A9s("birthday_selfie_upload_id", str);
        }
        C1ON A0T = AbstractC31172DnG.A0T(A0q, "surface", "qp");
        C14360o3.A0C(A0T, AbstractC111324zv.A00(1138));
        A0T.A00 = new C37821Gkb(eIx, str, i, 1);
        eIx.schedule(A0T);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.EIx r7, boolean r8) {
        /*
            java.lang.String r6 = "selfieCameraImageViewOverlay"
            java.lang.String r5 = "selfieImageviewSelectCheckMark"
            java.lang.String r4 = "profilePicImageViewOverlay"
            java.lang.String r3 = "profilePicImageviewSelectCheckMark"
            r2 = 8
            r1 = 0
            com.instagram.common.ui.base.IgSimpleImageView r0 = r7.A0F
            if (r8 == 0) goto L45
            if (r0 == 0) goto L7b
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0I
            if (r0 == 0) goto L77
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0H
            if (r0 == 0) goto L22
            r0.setVisibility(r1)
        L22:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r7.A0G
            if (r0 == 0) goto L73
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0J
            if (r0 == 0) goto L7f
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0K
            if (r0 == 0) goto L37
            r0.setVisibility(r2)
        L37:
            r7.A0D = r1
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0H
        L3b:
            if (r0 == 0) goto L44
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            X.AbstractC73003Pb.A01(r0)
        L44:
            return
        L45:
            if (r0 == 0) goto L7b
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0I
            if (r0 == 0) goto L77
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0H
            if (r0 == 0) goto L58
            r0.setVisibility(r2)
        L58:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r7.A0G
            if (r0 == 0) goto L73
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0J
            if (r0 == 0) goto L7f
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0K
            if (r0 == 0) goto L6d
            r0.setVisibility(r1)
        L6d:
            r0 = 1
            r7.A0D = r0
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0K
            goto L3b
        L73:
            X.C14360o3.A0F(r5)
            goto L82
        L77:
            X.C14360o3.A0F(r4)
            goto L82
        L7b:
            X.C14360o3.A0F(r3)
            goto L82
        L7f:
            X.C14360o3.A0F(r6)
        L82:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIx.A06(X.EIx, boolean):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0N);
    }

    public EIx() {
        C37061GUv A01 = C37061GUv.A01(this, 17);
        InterfaceC09390do A00 = C37061GUv.A00(C37061GUv.A01(this, 14), EnumC09460dv.A02, 15);
        this.A0O = AbstractC25225BEi.A0a(C37061GUv.A01(A00, 16), A01, new C57252Pba(20, null, A00), AbstractC25225BEi.A1D(C31807DyR.class));
        this.A0N = AbstractC60492pY.A02(this);
    }

    public static final void A00(EIx eIx) {
        A03(eIx);
        C25621Ms A0D = AbstractC31179DnN.A0D(AbstractC166987dD.A0o(eIx.A0N));
        A0D.A03();
        A0D.A0B("api/v1/users/get_birthday_visibility_setting/");
        C1ON A0e = AbstractC25227BEk.A0e(A0D, EA2.class, C34734FRx.class);
        C14360o3.A0C(A0e, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayVisibilitySettingResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayVisibilitySettingResponse>>");
        C31702Dw7.A00(eIx, A0e, 43);
    }

    public static final void A03(EIx eIx) {
        C6WQ A0i = AbstractC31174DnI.A0i(eIx.requireContext());
        A0i.A00(eIx.getString(2131965660));
        A0i.setCancelable(false);
        C0fJ.A00(A0i);
        eIx.A0M = A0i;
    }

    public static final void A05(EIx eIx, InterfaceC16820sZ interfaceC16820sZ) {
        Context context = eIx.getContext();
        if (context != null) {
            A01(eIx);
            C29319CwE c29319CwE = new C29319CwE(interfaceC16820sZ, 2);
            C146106i8 A0j = AbstractC25229BEm.A0j();
            int i = 2131968572;
            if (AbstractC15820qc.A0F(context)) {
                i = 2131974293;
            }
            AbstractC31171DnF.A18(eIx, A0j, i);
            A0j.A01 = -1;
            A0j.A0G = AbstractC25227BEk.A0v(eIx, 2131972568);
            A0j.A0L = true;
            G97.A00(A0j, c29319CwE, 13);
            C31349DqE A00 = A0j.A00();
            AbstractC166997dE.A1O(C41451vu.A01, A00);
            eIx.A0L = A00;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == 7766) {
            if (i2 != -1) {
                z = !this.A0D;
            } else {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                C31294DpG c31294DpG = this.A09;
                ContentResolver contentResolver = null;
                if (c31294DpG == null) {
                    str = "birthdayLogger";
                } else {
                    InterfaceC09390do interfaceC09390do = this.A0N;
                    long A04 = AbstractC31178DnM.A04(interfaceC09390do);
                    long A042 = AbstractC31178DnM.A04(interfaceC09390do);
                    if (this.A00 != null && this.A0C) {
                        str2 = "retake";
                    } else {
                        str2 = "take";
                    }
                    c31294DpG.A02("qp", "birthday_selfie_camera", str2, A04, A042);
                    Context context = getContext();
                    if (context != null) {
                        contentResolver = context.getContentResolver();
                    }
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, intent.getData());
                    this.A00 = bitmap;
                    CircularImageView circularImageView = this.A05;
                    if (circularImageView == null) {
                        str = "selfieCameraImageView";
                    } else if (bitmap == null) {
                        str = "birthdaySelfieBitmap";
                    } else {
                        circularImageView.setImageBitmap(bitmap);
                        this.A0C = true;
                        z = false;
                    }
                }
            }
            A06(this, z);
            return;
        }
        if (i != 2002) {
            return;
        }
        List list = this.A0A;
        str = "audiences";
        if (list != null) {
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((FNA) it.next()).A03 == EnumC33412Epj.A06) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            List list2 = this.A0A;
            if (list2 != null) {
                FNA fna = (FNA) list2.get(i3);
                C34671FPg c34671FPg = this.A08;
                if (c34671FPg == null) {
                    str = "settingsUtils";
                } else {
                    fna.A00 = c34671FPg.A00();
                    C31870Dzc c31870Dzc = this.A07;
                    if (c31870Dzc == null) {
                        str = "audienceAdapter";
                    } else {
                        c31870Dzc.notifyItemChanged(i3);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2067516711);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0N;
        this.A09 = new C31294DpG(this, AbstractC166987dD.A0r(interfaceC09390do));
        C00N.A00(requireActivity().getOnBackPressedDispatcher(), this, new JEZ(this, 27));
        C34671FPg c34671FPg = new C34671FPg(this, AbstractC166987dD.A0r(interfaceC09390do));
        this.A08 = c34671FPg;
        ArrayList A1E = AbstractC166987dD.A1E();
        Fragment fragment = c34671FPg.A00;
        Drawable drawable = fragment.requireContext().getDrawable(R.drawable.instagram_users_outline_96);
        if (drawable != null) {
            AbstractC31173DnH.A0y(fragment.requireContext(), drawable, AbstractC53242c7.A08(fragment.requireContext()));
        }
        A1E.add(new FNA(drawable, EnumC33412Epj.A08, AbstractC166997dE.A0q(AbstractC166997dE.A0N(fragment), 2131953829), null, true));
        A1E.add(new FNA(AbstractC172497mJ.A00(fragment.requireContext()), EnumC33412Epj.A06, AbstractC166997dE.A0q(AbstractC166997dE.A0N(fragment), 2131953827), c34671FPg.A00(), false));
        List A0a = AbstractC001800i.A0a(A1E);
        this.A0A = A0a;
        this.A07 = new C31870Dzc(this, A0a);
        this.A03 = new C684436h(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
        A00(this);
        C0f9.A09(2058990963, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(878406718);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.birthday_effects_settings_fragment, viewGroup, false);
        this.A04 = (CircularImageView) inflate.findViewById(R.id.birthday_effects_profile_pic_imageview);
        this.A05 = (CircularImageView) inflate.findViewById(R.id.birthday_effects_take_selfie_imageview);
        CircularImageView circularImageView = (CircularImageView) inflate.findViewById(R.id.profile_birthday_confetti_circular_imageview);
        this.A0H = circularImageView;
        if (circularImageView != null) {
            AbstractC73003Pb.A00(requireContext(), circularImageView);
        }
        CircularImageView circularImageView2 = (CircularImageView) inflate.findViewById(R.id.selfie_birthday_confetti_circular_imageview);
        this.A0K = circularImageView2;
        if (circularImageView2 != null) {
            AbstractC73003Pb.A00(requireContext(), circularImageView2);
        }
        this.A0F = (IgSimpleImageView) inflate.findViewById(R.id.birthday_effects_profile_pic_imageview_select_check_mark);
        this.A0G = (IgSimpleImageView) inflate.findViewById(R.id.birthday_effects_take_selfie_imageview_select_check_mark);
        this.A0I = (CircularImageView) inflate.findViewById(R.id.birthday_effects_profile_pic_imageview_overlay);
        this.A0J = (CircularImageView) inflate.findViewById(R.id.birthday_effects_take_selfie_imageview_overlay);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.birthday_effects_audience_recycler_view);
        this.A0E = recyclerView;
        if (recyclerView != null) {
            C31870Dzc c31870Dzc = this.A07;
            if (c31870Dzc == null) {
                C14360o3.A0F("audienceAdapter");
                throw C00O.createAndThrow();
            }
            recyclerView.setAdapter(c31870Dzc);
        }
        RecyclerView recyclerView2 = this.A0E;
        if (recyclerView2 != null) {
            AbstractC31177DnL.A17(this, recyclerView2);
        }
        this.A06 = (IgdsBottomButtonLayout) inflate.findViewById(R.id.birthday_effects_settings_bottom_buttons);
        C0f9.A09(-572476435, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(1499844088);
        super.onDestroyView();
        this.A0E = null;
        this.A0H = null;
        this.A0K = null;
        A02(this);
        A01(this);
        ComponentCallbacks2 rootActivity = getRootActivity();
        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
            interfaceC53712dA.EfL(0);
        }
        C0f9.A09(-1149845300, A02);
    }
}
