package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolInfo;
import com.instagram.schools.management.data.SchoolOnboardingParcelData;
import java.util.Iterator;

/* renamed from: X.Bsj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC26821Bsj extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SchoolOnboardingBaseFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        switch (A04().ordinal()) {
            case 0:
                i = 2131968968;
                break;
            case 1:
                i = 2131968986;
                break;
            case 2:
                i = 2131968985;
                break;
            case 3:
                i = 2131968984;
                break;
            case 4:
                i = 2131968978;
                break;
            default:
                i = 2131968973;
                break;
        }
        AbstractC25229BEm.A1G(interfaceC56362iU, i);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C75 A04 = A04();
        C14360o3.A0B(A04, 0);
        AbstractC27784CMz.A00.add(A04);
        C29138Ct5 A0z = AbstractC25228BEl.A0z(this);
        EnumC39642HiX enumC39642HiX = C25873BcV.A00(this).A00;
        C8n A00 = A00(this);
        String str = C25873BcV.A00(this).A0E;
        AbstractC167027dH.A12(enumC39642HiX, A00, str);
        AbstractC25234BEr.A0v(enumC39642HiX, A00, C29138Ct5.A00(A0z), "ig_school_registration_page_impression", str);
    }

    public final UserSession A03() {
        if (this instanceof C26) {
            return AbstractC166987dD.A0r(((C26) this).A00);
        }
        if (this instanceof C29) {
            return AbstractC166987dD.A0r(((C29) this).A01);
        }
        if (this instanceof C25) {
            return AbstractC166987dD.A0r(((C25) this).A00);
        }
        if (this instanceof C24) {
            return AbstractC166987dD.A0r(((C24) this).A00);
        }
        if (this instanceof C27) {
            return AbstractC166987dD.A0r(((C27) this).A00);
        }
        return AbstractC166987dD.A0r(((C28) this).A00);
    }

    public final C75 A04() {
        if (this instanceof C26) {
            return C75.A07;
        }
        if (this instanceof C29) {
            return C75.A06;
        }
        if (this instanceof C25) {
            return C75.A05;
        }
        if (this instanceof C24) {
            return C75.A04;
        }
        if (this instanceof C27) {
            return C75.A03;
        }
        return C75.A02;
    }

    public final C25873BcV A05() {
        return (C25873BcV) this.A04.getValue();
    }

    public AbstractC26821Bsj() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = DH5.A01(this, AbstractC111324zv.A00(311), enumC09460dv, 35);
        C29886DGa c29886DGa = new C29886DGa(this, 13);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C29886DGa(new C29886DGa(this, 10), 11));
        this.A04 = AbstractC25225BEi.A0a(new C29886DGa(A00, 12), c29886DGa, new C57536PgA(41, null, A00), AbstractC25225BEi.A1D(C25873BcV.class));
        this.A03 = AbstractC60492pY.A02(this);
        this.A01 = AbstractC09440dt.A01(new C29886DGa(this, 9));
        this.A00 = AbstractC09440dt.A00(enumC09460dv, new C29886DGa(this, 8));
    }

    public static final C8n A00(AbstractC26821Bsj abstractC26821Bsj) {
        switch (abstractC26821Bsj.A04().ordinal()) {
            case 0:
                return C8n.ADD_SCHOOL;
            case 1:
                return C8n.SWITCH_SCHOOL;
            case 2:
                return C8n.CONFIRM_ENROLLMENT;
            case 3:
                return C8n.MULTI_SCHOOL;
            case 4:
                return C8n.GRADUATION_DATE;
            default:
                return C8n.CONFIRM_SCHOOL;
        }
    }

    public static final SchoolOnboardingParcelData A01(AbstractC26821Bsj abstractC26821Bsj) {
        C26075Bg4 A00 = C25873BcV.A00(abstractC26821Bsj);
        String str = A00.A09;
        String str2 = A00.A0D;
        EnumC27396C6z enumC27396C6z = A00.A05;
        Integer num = A00.A07;
        Integer num2 = A00.A08;
        ImmutableList immutableList = A00.A02;
        ImmutableList immutableList2 = A00.A03;
        String str3 = A00.A0C;
        String str4 = A00.A0B;
        String str5 = A00.A0A;
        boolean z = A00.A0F;
        EnumC27395C6y enumC27395C6y = A00.A04;
        EnumC27383C6m enumC27383C6m = A00.A06;
        boolean z2 = A00.A0G;
        return new SchoolOnboardingParcelData(A00.A00, enumC27395C6y, enumC27396C6z, enumC27383C6m, num, num2, str, str2, str3, str4, str5, A00.A0E, immutableList, immutableList2, A00.A01, z, z2);
    }

    public final void A06() {
        C63397SjR A0y = AbstractC25228BEl.A0y(requireContext(), A03(), C2Fb.A1W, "https://help.instagram.com/772158705067006");
        A0y.A0S = getModuleName();
        A0y.A0A();
        AbstractC25228BEl.A0z(this).A06(C25873BcV.A00(this).A00, A00(this), C25873BcV.A00(this).A0E);
    }

    public final void A07() {
        int ordinal = A04().ordinal();
        String A00 = MSV.A00(421);
        switch (ordinal) {
            case 2:
            case 3:
                break;
            case 4:
            default:
                A00 = "next";
                break;
            case 5:
                A00 = "confirm_school";
                break;
        }
        C29138Ct5 A0z = AbstractC25228BEl.A0z(this);
        EnumC39642HiX enumC39642HiX = C25873BcV.A00(this).A00;
        C8n A002 = A00(this);
        String str = C25873BcV.A00(this).A0E;
        AbstractC167027dH.A12(enumC39642HiX, A002, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(C29138Ct5.A00(A0z), "ig_school_registration_progress_button_tap");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1L(enumC39642HiX, A0f);
            A0f.A8R(A002, "surface");
            A0f.AAP("waterfall_id", str);
            AbstractC25232BEp.A1L(A0f, MSV.A00(44), A00);
        }
    }

    public final void A08() {
        C29138Ct5 A0z = AbstractC25228BEl.A0z(this);
        EnumC39642HiX enumC39642HiX = C25873BcV.A00(this).A00;
        C8n A00 = A00(this);
        String str = C25873BcV.A00(this).A0E;
        AbstractC167027dH.A12(enumC39642HiX, A00, str);
        AbstractC25234BEr.A0v(enumC39642HiX, A00, C29138Ct5.A00(A0z), "ig_school_registration_exit", str);
    }

    public final void A09() {
        int ordinal;
        C140966Yy A0S;
        SchoolOnboardingParcelData A01;
        Fragment c27;
        Object obj;
        String str;
        C75 c75 = (C75) AbstractC001800i.A0O(C25873BcV.A00(this).A01, C25873BcV.A00(this).A01.indexOf(A04()) + 1);
        if (c75 == null) {
            ordinal = -1;
        } else {
            ordinal = c75.ordinal();
        }
        switch (ordinal) {
            case -1:
                Intent intent = new Intent();
                C26075Bg4 A00 = C25873BcV.A00(this);
                Iterator<E> it = A00.A02.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (C14360o3.A0K(((SchoolInfo) obj).A01, A00.A0C)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                SchoolInfo schoolInfo = (SchoolInfo) obj;
                if (schoolInfo == null || (str = schoolInfo.A02) == null) {
                    str = "";
                }
                AbstractC25651Mw.A00(A03()).E4s(new C155096xy(A00.A00, str, A00.A0E));
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent);
                }
                AbstractC25231BEo.A16(this);
                return;
            case 0:
            case 1:
                return;
            case 2:
                A0S = AbstractC25236BEt.A0S(this);
                A01 = A01(this);
                c27 = new C29();
                break;
            case 3:
                A0S = AbstractC25236BEt.A0S(this);
                A01 = A01(this);
                c27 = new C25();
                break;
            case 4:
                A0S = AbstractC25236BEt.A0S(this);
                A01 = A01(this);
                c27 = new C24();
                break;
            case 5:
                A0S = AbstractC25236BEt.A0S(this);
                A01 = A01(this);
                c27 = new C27();
                break;
            default:
                throw B4Z.A00();
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(AbstractC111324zv.A00(311), A01);
        c27.setArguments(A0b);
        A0S.A0D(c27);
        A0S.A04();
    }

    public final void A0A(EnumC53374NjP enumC53374NjP, String str) {
        C29138Ct5 A0z = AbstractC25228BEl.A0z(this);
        EnumC39642HiX enumC39642HiX = C25873BcV.A00(this).A00;
        C8n A00 = A00(this);
        String str2 = C25873BcV.A00(this).A0E;
        AbstractC167027dH.A12(enumC39642HiX, A00, str2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(C29138Ct5.A00(A0z), "ig_school_client_error");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1L(enumC39642HiX, A0f);
            A0f.A8R(A00, "surface");
            A0f.AAP("waterfall_id", str2);
            A0f.A8R(enumC53374NjP, "error");
            AbstractC25232BEp.A1L(A0f, AbstractC111324zv.A00(718), str);
        }
    }

    @Override // X.InterfaceC60072op
    public boolean onBackPressed() {
        C29138Ct5 A0z = AbstractC25228BEl.A0z(this);
        EnumC39642HiX enumC39642HiX = C25873BcV.A00(this).A00;
        C8n A00 = A00(this);
        String str = C25873BcV.A00(this).A0E;
        AbstractC167027dH.A12(enumC39642HiX, A00, str);
        AbstractC25234BEr.A0v(enumC39642HiX, A00, C29138Ct5.A00(A0z), "ig_school_registration_back_button_tap", str);
        return false;
    }
}
