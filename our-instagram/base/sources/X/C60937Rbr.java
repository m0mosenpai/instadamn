package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Rbr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60937Rbr extends C2AH {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ InterfaceC65531Tm1 A03;
    public final /* synthetic */ EnumC31713DwI A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C60937Rbr(Fragment fragment, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, InterfaceC65531Tm1 interfaceC65531Tm1, EnumC31713DwI enumC31713DwI, String str, String str2, boolean z) {
        this.A00 = fragment;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = imageUrl;
        this.A07 = z;
        this.A04 = enumC31713DwI;
        this.A01 = abstractC12990ll;
        this.A03 = interfaceC65531Tm1;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        this.A03.D6d(false, "Failure getting SmartLock instance");
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        FragmentActivity activity;
        AbstractC27461Uz abstractC27461Uz = (AbstractC27461Uz) obj;
        C14360o3.A0B(abstractC27461Uz, 0);
        Fragment fragment = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        ImageUrl imageUrl = this.A02;
        boolean z = this.A07;
        EnumC31713DwI enumC31713DwI = this.A04;
        AbstractC12990ll abstractC12990ll = this.A01;
        InterfaceC65531Tm1 interfaceC65531Tm1 = this.A03;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            abstractC27461Uz.getSmartLockBroker(activity, new C64490TGc(fragment, imageUrl, interfaceC65531Tm1, enumC31713DwI, str, str2, z), abstractC12990ll);
        } else {
            interfaceC65531Tm1.D6d(false, "Activity or SmartLock plugin null");
        }
    }
}
