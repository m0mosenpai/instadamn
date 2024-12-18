package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LMI implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public LMI(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A04 = str;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C47983LJh c47983LJh = (C47983LJh) this.A02;
                C47983LJh.A02(C47983LJh.A01(c47983LJh, C05F.A00, C05F.A0j), c47983LJh);
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                UserSession userSession = (UserSession) this.A03;
                C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
                A0r.A0E = true;
                A0r.A0B(null, C27S.A00().A02().A00(userSession, "REEL", null, this.A04, true));
                A0r.A04();
                return;
            case 1:
                UserSession userSession2 = (UserSession) this.A03;
                C22C A01 = AnonymousClass229.A01(userSession2);
                A01.A1R(((C22F) A01).A04.A0C, "META_CLOUD_ALBUM_NUX_LEARN_MORE");
                AbstractC208329Jr.A07((InterfaceC11380iw) this.A02, userSession2, C05F.A0C, this.A04);
                WGT.A06((Context) this.A01, userSession2);
                return;
            case 2:
                C18920wW c18920wW = (C18920wW) this.A02;
                String str = ((UserSession) this.A03).userId;
                String str2 = this.A04;
                AbstractC167017dG.A1N(c18920wW, str);
                C41684IdD.A00(c18920wW, str, str2, "cancel_click");
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) this.A01;
                if (onClickListener == null) {
                    return;
                }
                onClickListener.onClick(dialogInterface, i);
                return;
            default:
                Object obj = this.A03;
                Fragment fragment = (Fragment) this.A02;
                String str3 = this.A04;
                Object obj2 = this.A01;
                C0eR c0eR = fragment.mLifecycleRegistry;
                C14360o3.A07(c0eR);
                AbstractC166987dD.A1Z(new C57148PXa(obj, obj2, str3, null, 7), AbstractC57302k5.A00(c0eR));
                return;
        }
    }
}
