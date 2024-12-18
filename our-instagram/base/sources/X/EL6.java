package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EL6 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacAccountRecoveryFragment";
    public Bundle A00;
    public View A01;
    public TextView A02;
    public ProgressButton A03;
    public boolean A04;
    public boolean A05;
    public View A06;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public final View.OnLongClickListener A09 = new ViewOnLongClickListenerC35702Fpc(this, 2);
    public final C1P1 A07 = EV0.A00(this, 41);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131975829);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC35677FpC(this, 42), AbstractC31174DnI.A0K(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    public static final void A01(EL6 el6) {
        if (Build.VERSION.SDK_INT < 33) {
            FragmentActivity requireActivity = el6.requireActivity();
            String A00 = AbstractC43591JPw.A00(2);
            if (!AbstractC23451Ch.A07(requireActivity, A00)) {
                AbstractC23451Ch.A04(el6.requireActivity(), new C36162Fxc(el6, 3), A00);
                return;
            }
        }
        C1GJ.A03(new KK9(A00(el6), el6));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A04) {
            AbstractC25231BEo.A0c(requireActivity(), this.A08).A0G(AbstractC111324zv.A00(88), 1);
            return true;
        }
        getParentFragmentManager().A12();
        return true;
    }

    public static final Bitmap A00(EL6 el6) {
        Context context = el6.getContext();
        if (context != null) {
            View view = el6.A06;
            if (view != null) {
                AbstractC31174DnI.A1C(view, AbstractC53242c7.A00(context));
            }
            C14360o3.A0F("rootLayout");
            throw C00O.createAndThrow();
        }
        View view2 = el6.A06;
        if (view2 != null) {
            view2.setDrawingCacheEnabled(true);
            View view3 = el6.A06;
            if (view3 != null) {
                if (view3.getDrawingCache() != null) {
                    View view4 = el6.A06;
                    if (view4 != null) {
                        Bitmap drawingCache = view4.getDrawingCache();
                        C0fK.A03(drawingCache);
                        Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
                        C14360o3.A07(createBitmap);
                        View view5 = el6.A06;
                        if (view5 != null) {
                            view5.setDrawingCacheEnabled(false);
                            View view6 = el6.A06;
                            if (view6 != null) {
                                view6.setBackground(null);
                                return createBitmap;
                            }
                        }
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C14360o3.A0F("rootLayout");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-615888595);
        super.onCreate(bundle);
        this.A04 = requireArguments().getBoolean(AbstractC31180DnO.A0Z());
        this.A05 = requireArguments().getBoolean("arg_should_check_email");
        AbstractC35075Fcm.A02(AbstractC166987dD.A0r(this.A08), "recovery_code");
        C0f9.A09(-1523392855, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1336526492);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_account_recovery_fragment_ui_updates_2020, viewGroup, false);
        this.A06 = inflate;
        if (inflate != null) {
            TextView A0T = AbstractC166997dE.A0T(inflate, R.id.backup_codes);
            A0T.setOnLongClickListener(this.A09);
            ArrayList<String> stringArrayList = requireArguments().getStringArrayList("arg_backup_codes");
            if (stringArrayList != null) {
                str = AbstractC31175DnJ.A0a("\n", stringArrayList);
            } else {
                str = "";
            }
            A0T.setText(str);
            this.A02 = A0T;
            View view = this.A06;
            if (view != null) {
                AbstractC35235FgT.A02(new Em1(this, AbstractC31181DnP.A02(this), 22), new Em1(this, AbstractC31181DnP.A02(this), 21), AbstractC167007dF.A0N(view, R.id.screenshot_and_get_new), AbstractC25227BEk.A0v(this, 2131975835), AbstractC25227BEk.A0v(this, 2131975830));
                View view2 = this.A06;
                if (view2 != null) {
                    this.A01 = view2.requireViewById(R.id.row_divider);
                    View view3 = this.A06;
                    if (view3 != null) {
                        ProgressButton A0U = AbstractC31180DnO.A0U(view3);
                        ViewOnClickListenerC35677FpC.A00(A0U, 43, this);
                        this.A03 = A0U;
                        EVO.A01(this);
                        View view4 = this.A06;
                        if (view4 != null) {
                            C0f9.A09(1732003055, A02);
                            return view4;
                        }
                    }
                }
            }
        }
        C14360o3.A0F("rootLayout");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1187203826);
        super.onStart();
        if (this.A04 || this.A05) {
            AbstractC32533EUj.A00(getParentFragmentManager(), this, AbstractC35177FfU.A01(requireContext(), AbstractC166987dD.A0r(this.A08)), 3);
        }
        C0f9.A09(293972346, A02);
    }
}
