package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.ElP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33231ElP extends AbstractC33235ElU implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BackupCodesFragment";
    public Dialog A00;
    public UserSession A01;
    public EnumC33365Eoy A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = false;
    public final C1P1 A06 = EV0.A00(this, 27);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "backup_codes";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A03) {
            return false;
        }
        this.mFragmentManager.A18(null, 1);
        this.A03 = false;
        return true;
    }

    public static ArrayList A00(C33231ElP c33231ElP) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Bundle bundle = c33231ElP.mArguments;
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("backup_codes_key");
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                GHY.A01(c33231ElP.requireContext(), null, AbstractC166987dD.A1B(it), A1E);
            }
            AbstractC25235BEs.A1C(c33231ElP.requireContext(), new ViewOnClickListenerC35677FpC(c33231ElP, 18), A1E, 2131953604);
            C35246Fgf.A01(c33231ElP, A1E, 2131953605);
            AbstractC25235BEs.A1C(c33231ElP.requireContext(), new ViewOnClickListenerC31591DuJ(47, stringArrayList, c33231ElP), A1E, 2131953603);
            AbstractC25235BEs.A1C(c33231ElP.requireContext(), new ViewOnClickListenerC35677FpC(c33231ElP, 19), A1E, 2131953609);
            C35246Fgf.A01(c33231ElP, A1E, 2131953608);
        }
        return A1E;
    }

    public static void A01(C33231ElP c33231ElP) {
        Activity parent = c33231ElP.getActivity().getParent();
        Activity activity = c33231ElP.getActivity();
        if (parent != null) {
            activity = activity.getParent();
        }
        if (Build.VERSION.SDK_INT < 33) {
            String A00 = AbstractC43591JPw.A00(2);
            if (!AbstractC23451Ch.A07(activity, A00)) {
                AbstractC23451Ch.A04(activity, new C36162Fxc(c33231ElP, 2), A00);
                return;
            }
        }
        c33231ElP.A04 = true;
        AbstractC31178DnM.A0v(c33231ElP);
        ViewGroup A0G = AbstractC31174DnI.A0G(c33231ElP);
        Context context = c33231ElP.getContext();
        if (context != null) {
            AbstractC31174DnI.A1C(A0G, AbstractC53242c7.A00(context));
        }
        A0G.setDrawingCacheEnabled(true);
        Bitmap drawingCache = A0G.getDrawingCache();
        C0fK.A03(drawingCache);
        Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
        A0G.setDrawingCacheEnabled(false);
        A0G.setBackground(null);
        C1GJ.A03(new KK8(createBitmap, c33231ElP));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131953606);
        interfaceC56362iU.EkH(null, this.A04);
        interfaceC56362iU.setIsLoading(this.A04);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1263254357);
        super.onCreate(bundle);
        this.A01 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-1004395708, A02);
    }

    @Override // X.AbstractC33235ElU, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EnumC33365Eoy enumC33365Eoy;
        int A02 = C0f9.A02(159627732);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            enumC33365Eoy = EnumC33365Eoy.A03;
        } else {
            enumC33365Eoy = EnumC33365Eoy.values()[bundle2.getInt("flow_key")];
        }
        this.A02 = enumC33365Eoy;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C0f9.A09(-1132496796, A02);
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-959580197);
        super.onPause();
        AbstractC31179DnN.A1K(this, 0);
        C0f9.A09(-1855505953, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(203759027);
        super.onResume();
        setItems(A00(this));
        if (EnumC33365Eoy.A07 == this.A02 && !AbstractC31172DnG.A1a(AbstractC31174DnI.A0f(), "has_backup_codes") && !this.A05) {
            this.A03 = true;
            Dialog dialog = this.A00;
            if (dialog == null) {
                C193328hC A0c = AbstractC31176DnK.A0c(this);
                A0c.A0A(2131975982);
                A0c.A09(2131975981);
                A0c.A0F(DialogInterfaceOnClickListenerC35453FkA.A00(this, 47));
                DialogInterfaceOnClickListenerC35453FkA.A01(A0c, this, 46);
                dialog = A0c.A02();
                this.A00 = dialog;
            }
            C0fJ.A00(dialog);
        }
        AbstractC31179DnN.A1K(this, 8);
        C0f9.A09(1149290457, A02);
    }
}
